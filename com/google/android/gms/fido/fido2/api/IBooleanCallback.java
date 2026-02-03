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
public interface IBooleanCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBooleanCallback {
        static final int TRANSACTION_onBooleanResult = 1;
        static final int TRANSACTION_onError = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBooleanCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.IBooleanCallback");
            }

            @Override // com.google.android.gms.fido.fido2.api.IBooleanCallback
            public void onBooleanResult(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IBooleanCallback
            public void onError(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
        }

        public static IBooleanCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IBooleanCallback");
            return iInterfaceQueryLocalInterface instanceof IBooleanCallback ? (IBooleanCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                boolean zG = sgh.g(parcel);
                enforceNoDataAvail(parcel);
                onBooleanResult(zG);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onError(status);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onBooleanResult(boolean z);

    void onError(Status status);
}
