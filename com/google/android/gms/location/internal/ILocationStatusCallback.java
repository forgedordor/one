package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILocationStatusCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILocationStatusCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILocationStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.ILocationStatusCallback");
            }

            @Override // com.google.android.gms.location.internal.ILocationStatusCallback
            public void onResult(Status status, Location location) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, location);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.ILocationStatusCallback");
        }

        public static ILocationStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ILocationStatusCallback");
            return iInterfaceQueryLocalInterface instanceof ILocationStatusCallback ? (ILocationStatusCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            Location location = (Location) sgh.a(parcel, Location.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, location);
            return true;
        }
    }

    void onResult(Status status, Location location);
}
