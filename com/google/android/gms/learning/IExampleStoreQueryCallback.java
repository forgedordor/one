package com.google.android.gms.learning;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.IExampleStoreIterator;
import defpackage.sgh;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public interface IExampleStoreQueryCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreQueryCallback {
        static final int TRANSACTION_onStartQueryFailure = 3;
        static final int TRANSACTION_onStartQuerySuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreQueryCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.IExampleStoreQueryCallback");
            }

            @Override // com.google.android.gms.learning.IExampleStoreQueryCallback
            public void onStartQueryFailure(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.IExampleStoreQueryCallback
            public void onStartQuerySuccess(IExampleStoreIterator iExampleStoreIterator) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iExampleStoreIterator);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.IExampleStoreQueryCallback");
        }

        public static IExampleStoreQueryCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.IExampleStoreQueryCallback");
            return iInterfaceQueryLocalInterface instanceof IExampleStoreQueryCallback ? (IExampleStoreQueryCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IExampleStoreIterator iExampleStoreIteratorAsInterface = IExampleStoreIterator.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onStartQuerySuccess(iExampleStoreIteratorAsInterface);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onStartQueryFailure(status);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onStartQueryFailure(Status status);

    void onStartQuerySuccess(IExampleStoreIterator iExampleStoreIterator);
}
