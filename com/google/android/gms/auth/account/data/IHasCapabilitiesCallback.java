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
public interface IHasCapabilitiesCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHasCapabilitiesCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHasCapabilitiesCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IHasCapabilitiesCallback
            public void onResponse(Status status, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
        }

        public static IHasCapabilitiesCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
            return iInterfaceQueryLocalInterface instanceof IHasCapabilitiesCallback ? (IHasCapabilitiesCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onResponse(status, i3);
            return true;
        }
    }

    void onResponse(Status status, int i);
}
