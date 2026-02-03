package com.google.android.gms.auth.api.identity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetPasswordAndPasskeyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetPasswordAndPasskeyCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetPasswordAndPasskeyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback
            public void onResult(Status status, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback");
        }

        public static IGetPasswordAndPasskeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback");
            return iInterfaceQueryLocalInterface instanceof IGetPasswordAndPasskeyCallback ? (IGetPasswordAndPasskeyCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, bundle);
            return true;
        }
    }

    void onResult(Status status, Bundle bundle);
}
