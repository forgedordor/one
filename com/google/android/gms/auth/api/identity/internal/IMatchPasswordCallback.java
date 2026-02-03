package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMatchPasswordCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMatchPasswordCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMatchPasswordCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback
            public void onResult(Status status, MatchPasswordResult matchPasswordResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, matchPasswordResult);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
        }

        public static IMatchPasswordCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
            return iInterfaceQueryLocalInterface instanceof IMatchPasswordCallback ? (IMatchPasswordCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            MatchPasswordResult matchPasswordResult = (MatchPasswordResult) sgh.a(parcel, MatchPasswordResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, matchPasswordResult);
            return true;
        }
    }

    void onResult(Status status, MatchPasswordResult matchPasswordResult);
}
