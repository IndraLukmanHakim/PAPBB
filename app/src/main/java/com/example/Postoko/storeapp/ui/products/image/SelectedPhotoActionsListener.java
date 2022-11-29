
package com.example.Postoko.storeapp.ui.products.image;

import android.graphics.Bitmap;


public interface SelectedPhotoActionsListener {

    /**
     * Callback Method of {@link SelectedPhotoActionsListener} invoked to display the
     * default image for the Product.
     */
    void showDefaultImage();

    /**
     * Callback Method of {@link SelectedPhotoActionsListener} invoked to display the
     * selected Image {@code bitmap} for the Product.
     *
     * @param bitmap   The {@link Bitmap} of the Image to be shown.
     * @param imageUri The String Content URI of the Image to be shown.
     */
    void showSelectedImage(Bitmap bitmap, String imageUri);

}
