package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.internal.IExampleStoreIteratorV2;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExampleStoreQueryCallbackV2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreQueryCallbackV2 {
        static final int TRANSACTION_onStartQueryFailure = 3;
        static final int TRANSACTION_onStartQuerySuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreQueryCallbackV2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2
            public void onStartQueryFailure(Status status, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2
            public void onStartQuerySuccess(IExampleStoreIteratorV2 iExampleStoreIteratorV2, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iExampleStoreIteratorV2);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
        }

        public static IExampleStoreQueryCallbackV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
            return iInterfaceQueryLocalInterface instanceof IExampleStoreQueryCallbackV2 ? (IExampleStoreQueryCallbackV2) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IExampleStoreIteratorV2 iExampleStoreIteratorV2AsInterface = IExampleStoreIteratorV2.Stub.asInterface(parcel.readStrongBinder());
                long j = parcel.readLong();
                enforceNoDataAvail(parcel);
                onStartQuerySuccess(iExampleStoreIteratorV2AsInterface, j);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                long j2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                onStartQueryFailure(status, j2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onStartQueryFailure(Status status, long j);

    void onStartQuerySuccess(IExampleStoreIteratorV2 iExampleStoreIteratorV2, long j);
}
