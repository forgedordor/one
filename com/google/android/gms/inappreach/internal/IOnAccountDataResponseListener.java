package com.google.android.gms.inappreach.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnAccountDataResponseListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnAccountDataResponseListener {
        static final int TRANSACTION_onAccountDataResponse = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnAccountDataResponseListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener");
            }

            @Override // com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener
            public void onAccountDataResponse(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener");
        }

        public static IOnAccountDataResponseListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener");
            return iInterfaceQueryLocalInterface instanceof IOnAccountDataResponseListener ? (IOnAccountDataResponseListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onAccountDataResponse(bArrCreateByteArray);
            return true;
        }
    }

    void onAccountDataResponse(byte[] bArr);
}
