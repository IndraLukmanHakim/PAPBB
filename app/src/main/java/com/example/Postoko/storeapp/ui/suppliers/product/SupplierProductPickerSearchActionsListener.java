

package com.example.Postoko.storeapp.ui.suppliers.product;


public interface SupplierProductPickerSearchActionsListener {
    /**
     * Callback Method of {@link SupplierProductPickerSearchActionsListener} invoked when
     * all the Products available, are already picked for the Supplier. Hence the implementation
     * should disable the Search.
     */
    void disableSearch();
}
