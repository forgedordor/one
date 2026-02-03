package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBeginSignInCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBeginSignInCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBeginSignInCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback
            public void onResult(Status status, BeginSignInResult beginSignInResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, beginSignInResult);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
        }

        public static IBeginSignInCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
            return iInterfaceQueryLocalInterface instanceof IBeginSignInCallback ? (IBeginSignInCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            BeginSignInResult beginSignInResult = (BeginSignInResult) sgh.a(parcel, BeginSignInResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, beginSignInResult);
            return true;
        }
    }

    void onResult(Status status, BeginSignInResult beginSignInResult);
}
