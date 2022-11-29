

package com.example.Postoko.storeapp.ui.suppliers.product;


public interface SupplierProductPickerMultiSelectListener {
    /**
     * Callback Method of {@link SupplierProductPickerMultiSelectListener} invoked to
     * display the number of Products {@code countOfProductsSelected} selected for the Supplier to sell.
     *
     * @param countOfProductsSelected The Number of Products selected/picked for the Supplier to sell.
     */
    void showSelectedCount(int countOfProductsSelected);
}
