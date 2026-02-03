package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IByteArrayCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IByteArrayCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IByteArrayCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.IByteArrayCallback");
            }

            @Override // com.google.android.gms.fido.fido2.api.IByteArrayCallback
            public void onFailure(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IByteArrayCallback
            public void onSuccess(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.IByteArrayCallback");
        }

        public static IByteArrayCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IByteArrayCallback");
            return iInterfaceQueryLocalInterface instanceof IByteArrayCallback ? (IByteArrayCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onSuccess(bArrCreateByteArray);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onFailure(status);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onFailure(Status status);

    void onSuccess(byte[] bArr);
}
