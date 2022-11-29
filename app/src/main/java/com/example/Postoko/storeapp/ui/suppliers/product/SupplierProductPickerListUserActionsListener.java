
package com.example.Postoko.storeapp.ui.suppliers.product;


public interface SupplierProductPickerListUserActionsListener {
    /**
     * Callback Method of {@link SupplierProductPickerListUserActionsListener} invoked when
     * the user clicks on an Item in the RecyclerView that displays a list of Products to pick/select
     *
     * @param itemPosition The adapter position of the Item clicked
     */
    void onItemClicked(int itemPosition);
}
