package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialsCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialsCallbacks {
        static final int TRANSACTION_onCredentialResult = 1;
        static final int TRANSACTION_onStatusResult = 2;
        static final int TRANSACTION_onStringResult = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialsCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onCredentialResult(Status status, Credential credential) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, credential);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onStatusResult(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onStringResult(Status status, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
        }

        public static ICredentialsCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
            return iInterfaceQueryLocalInterface instanceof ICredentialsCallbacks ? (ICredentialsCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                Credential credential = (Credential) sgh.a(parcel, Credential.CREATOR);
                enforceNoDataAvail(parcel);
                onCredentialResult(status, credential);
            } else if (i == 2) {
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onStatusResult(status2);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                onStringResult(status3, string);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onCredentialResult(Status status, Credential credential);

    void onStatusResult(Status status);

    void onStringResult(Status status, String str);
}
