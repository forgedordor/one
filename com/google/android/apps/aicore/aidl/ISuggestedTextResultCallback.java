package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import defpackage.sku;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISuggestedTextResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISuggestedTextResultCallback {
        static final int TRANSACTION_onSuggestedTextInferenceFailure = 3;
        static final int TRANSACTION_onSuggestedTextInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISuggestedTextResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
            public void onSuggestedTextInferenceFailure(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
            public void onSuggestedTextInferenceSuccess(sku skuVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, skuVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback");
        }

        public static ISuggestedTextResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback");
            return iInterfaceQueryLocalInterface instanceof ISuggestedTextResultCallback ? (ISuggestedTextResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                sku skuVar = (sku) sgh.a(parcel, sku.CREATOR);
                enforceNoDataAvail(parcel);
                onSuggestedTextInferenceSuccess(skuVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSuggestedTextInferenceFailure(i3);
            return true;
        }
    }

    void onSuggestedTextInferenceFailure(int i);

    void onSuggestedTextInferenceSuccess(sku skuVar);
}
