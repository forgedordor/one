package com.google.android.apps.tachyon.clientapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetRegisteredIdTypeCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetRegisteredIdTypeCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetRegisteredIdTypeCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback");
            }

            @Override // com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback
            public void onResult(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback");
        }

        public static IGetRegisteredIdTypeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback");
            return iInterfaceQueryLocalInterface instanceof IGetRegisteredIdTypeCallback ? (IGetRegisteredIdTypeCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onResult(bArrCreateByteArray);
            return true;
        }
    }

    void onResult(byte[] bArr);
}
