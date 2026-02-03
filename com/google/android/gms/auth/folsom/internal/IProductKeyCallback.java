package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.folsom.ProductKey;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IProductKeyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProductKeyCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProductKeyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IProductKeyCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IProductKeyCallback
            public void onResult(Status status, ProductKey[] productKeyArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(productKeyArr, 0);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IProductKeyCallback");
        }

        public static IProductKeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IProductKeyCallback");
            return iInterfaceQueryLocalInterface instanceof IProductKeyCallback ? (IProductKeyCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ProductKey[] productKeyArr = (ProductKey[]) parcel.createTypedArray(ProductKey.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, productKeyArr);
            return true;
        }
    }

    void onResult(Status status, ProductKey[] productKeyArr);
}
