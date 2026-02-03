package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialListCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialListCallback {
        static final int TRANSACTION_onCredentialListResult = 1;
        static final int TRANSACTION_onError = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialListCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.ICredentialListCallback");
            }

            @Override // com.google.android.gms.fido.fido2.api.ICredentialListCallback
            public void onCredentialListResult(List list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.ICredentialListCallback
            public void onError(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
        }

        public static ICredentialListCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
            return iInterfaceQueryLocalInterface instanceof ICredentialListCallback ? (ICredentialListCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ArrayList arrayListB = sgh.b(parcel);
                enforceNoDataAvail(parcel);
                onCredentialListResult(arrayListB);
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

    void onCredentialListResult(List list);

    void onError(Status status);
}
