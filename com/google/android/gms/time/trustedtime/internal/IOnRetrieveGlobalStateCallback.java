package com.google.android.gms.time.trustedtime.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnRetrieveGlobalStateCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnRetrieveGlobalStateCallback {
        static final int TRANSACTION_onRetrieveGlobalState = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnRetrieveGlobalStateCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback");
            }

            @Override // com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback
            public void onRetrieveGlobalState(Status status, GlobalState globalState) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, globalState);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback");
        }

        public static IOnRetrieveGlobalStateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback");
            return iInterfaceQueryLocalInterface instanceof IOnRetrieveGlobalStateCallback ? (IOnRetrieveGlobalStateCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            GlobalState globalState = (GlobalState) sgh.a(parcel, GlobalState.CREATOR);
            enforceNoDataAvail(parcel);
            onRetrieveGlobalState(status, globalState);
            return true;
        }
    }

    void onRetrieveGlobalState(Status status, GlobalState globalState);
}
