
package com.example.Postoko.storeapp.cache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;


public class BitmapImageCache {
    //Constant for Cache size of the Memory Cache
    private static final int DEFAULT_CACHE_SIZE = 25 * 1024 * 1024; //25MB in bytes

    //For the Singleton instance of this
    private static volatile BitmapImageCache INSTANCE;

    //Memory Cache to save the Bitmaps downloaded
    private LruCache<String, Bitmap> mMemoryCache;


    private BitmapImageCache() {
        //Retrieving the current Max Memory available (in bytes)
        final int maxMemory = (int) Runtime.getRuntime().maxMemory();
        //Calculating the safe usable Max Memory which is 1/8th of the current Max Memory available
        final int maxMemoryThreshold = maxMemory / 8;
        //Selecting the cache size based on the current availability
        final int cacheSizeSelected = DEFAULT_CACHE_SIZE > maxMemoryThreshold ? maxMemoryThreshold : DEFAULT_CACHE_SIZE;

        //Initializing the Memory Cache
        mMemoryCache = new LruCache<String, Bitmap>(cacheSizeSelected) {

            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                //Size of the cache now returned will be the size of the entries
                //measured in bytes rather than the number of entries
                return bitmap.getByteCount();
            }

        };
    }


    private static BitmapImageCache getInstance() {
        if (INSTANCE == null) {
            synchronized (BitmapImageCache.class) {
                if (INSTANCE == null) {
                    //Creating the instance when not available
                    INSTANCE = new BitmapImageCache();
                }
            }
        }
        //Using the previously created instance
        return INSTANCE;
    }


    public static Bitmap getBitmapFromCache(String imageURLStr) {
        return getInstance().mMemoryCache.get(imageURLStr);
    }


    public static void addBitmapToCache(String imageURLStr, Bitmap bitmap) {
        if (getBitmapFromCache(imageURLStr) == null
                && bitmap != null) {
            getInstance().mMemoryCache.put(imageURLStr, bitmap);
        }
    }


    public static void clearCache() {
        getInstance().mMemoryCache.evictAll();
    }
}
