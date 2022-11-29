
package com.example.Postoko.storeapp.ui.inventory;

import android.widget.ImageView;

import com.example.Postoko.storeapp.data.local.models.SalesLite;


public interface SalesListUserActionsListener {


    void onEditSales(final int itemPosition, SalesLite salesLite, ImageView imageViewProductPhoto);

    void onDeleteProduct(final int itemPosition, SalesLite salesLite);

    void onSellOneQuantity(final int itemPosition, SalesLite salesLite);
}
