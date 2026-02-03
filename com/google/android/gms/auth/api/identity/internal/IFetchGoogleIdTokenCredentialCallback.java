package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFetchGoogleIdTokenCredentialCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFetchGoogleIdTokenCredentialCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFetchGoogleIdTokenCredentialCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback
            public void onResult(Status status, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
        }

        public static IFetchGoogleIdTokenCredentialCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
            return iInterfaceQueryLocalInterface instanceof IFetchGoogleIdTokenCredentialCallback ? (IFetchGoogleIdTokenCredentialCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) sgh.a(parcel, InternalSignInCredentialWrapper.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, internalSignInCredentialWrapper);
            return true;
        }
    }

    void onResult(Status status, InternalSignInCredentialWrapper internalSignInCredentialWrapper);
}
