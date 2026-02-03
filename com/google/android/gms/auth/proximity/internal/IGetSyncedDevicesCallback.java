package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetSyncedDevicesCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetSyncedDevicesCallback {
        static final int TRANSACTION_onFetchedDevices = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetSyncedDevicesCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback
            public void onFetchedDevices(Status status, List<SyncedCryptauthDevice> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
        }

        public static IGetSyncedDevicesCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
            return iInterfaceQueryLocalInterface instanceof IGetSyncedDevicesCallback ? (IGetSyncedDevicesCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(SyncedCryptauthDevice.CREATOR);
            enforceNoDataAvail(parcel);
            onFetchedDevices(status, arrayListCreateTypedArrayList);
            return true;
        }
    }

    void onFetchedDevices(Status status, List<SyncedCryptauthDevice> list);
}
