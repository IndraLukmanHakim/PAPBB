
package com.example.Postoko.storeapp.ui.suppliers.product;

import com.example.Postoko.storeapp.data.local.models.ProductLite;

import java.util.ArrayList;


public interface SupplierProductPickerNavigator {

    /**
     * Method that updates the result {@code productsToSell} to be sent back to the Calling activity.
     *
     * @param productsToSell List of Products {@link ProductLite} selected by the Supplier
     *                       for selling.
     */
    void doSetResult(ArrayList<ProductLite> productsToSell);

    /**
     * Method that updates the Calling Activity that the operation was aborted.
     */
    void doCancel();
}
