

package com.example.Postoko.storeapp.ui.products.image;


public interface PhotoGridDeleteModeListener {
    /**
     * Callback Method of {@link PhotoGridDeleteModeListener} invoked when
     * the user Long clicks on an item in the RecyclerView that displays a Grid of Photos.
     */
    void onGridItemDeleteMode();

    /**
     * Callback Method of {@link PhotoGridDeleteModeListener} invoked when
     * the user clicks on items in DELETE Action Mode to select them for Delete.
     * <p>
     * This Method should show the count of Items {@code itemCount} currently selected for Delete.
     * </p>
     *
     * @param itemCount The Number of Image items currently selected for Delete Action.
     */
    void showSelectedItemCount(int itemCount);
}
