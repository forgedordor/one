package com.google.android.gms.auth.api.phone.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOngoingSmsRequestCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOngoingSmsRequestCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOngoingSmsRequestCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
            }

            @Override // com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback
            public void onResult(Status status, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
        }

        public static IOngoingSmsRequestCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
            return iInterfaceQueryLocalInterface instanceof IOngoingSmsRequestCallback ? (IOngoingSmsRequestCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            boolean zG = sgh.g(parcel);
            enforceNoDataAvail(parcel);
            onResult(status, zG);
            return true;
        }
    }

    void onResult(Status status, boolean z);
}
