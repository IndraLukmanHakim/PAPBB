

package com.example.Postoko.storeapp.ui.suppliers;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;

import com.example.Postoko.storeapp.data.local.models.SupplierLite;
import com.example.Postoko.storeapp.ui.PagerPresenter;
import com.example.Postoko.storeapp.ui.PagerView;

import java.util.ArrayList;


public interface SupplierListContract {


    interface View extends PagerView<Presenter> {


        void showProgressIndicator();


        void hideProgressIndicator();


        void showError(@StringRes int messageId, @Nullable Object... args);


        void showEmptyView();


        void hideEmptyView();


        void loadSuppliers(ArrayList<SupplierLite> supplierList);


        void launchAddNewSupplier();


        void launchEditSupplier(int supplierId);


        void showAddSuccess(String supplierCode);


        void showUpdateSuccess(String supplierCode);


        void showDeleteSuccess(String supplierCode);


        void dialPhoneNumber(String phoneNumber);


        void composeEmail(String toEmailAddress);

    }


    interface Presenter extends PagerPresenter {


        void triggerSuppliersLoad(boolean forceLoad);


        void editSupplier(int supplierId);


        void deleteSupplier(SupplierLite supplier);


        void addNewSupplier();


        void onActivityResult(int requestCode, int resultCode, Intent data);


        void releaseResources();


        void defaultPhoneClicked(String phoneNumber);


        void defaultEmailClicked(String toEmailAddress);
    }
}
