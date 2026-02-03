package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBooleanValueCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBooleanValueCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBooleanValueCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IBooleanValueCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IBooleanValueCallback
            public void onResponse(Status status, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IBooleanValueCallback");
        }

        public static IBooleanValueCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IBooleanValueCallback");
            return iInterfaceQueryLocalInterface instanceof IBooleanValueCallback ? (IBooleanValueCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            boolean zG = sgh.g(parcel);
            enforceNoDataAvail(parcel);
            onResponse(status, zG);
            return true;
        }
    }

    void onResponse(Status status, boolean z);
}
