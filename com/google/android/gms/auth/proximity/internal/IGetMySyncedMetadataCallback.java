package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetMySyncedMetadataCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetMySyncedMetadataCallback {
        static final int TRANSACTION_onFetchedDevice = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetMySyncedMetadataCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback
            public void onFetchedDevice(Status status, SyncedCryptauthDevice syncedCryptauthDevice) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, syncedCryptauthDevice);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
        }

        public static IGetMySyncedMetadataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
            return iInterfaceQueryLocalInterface instanceof IGetMySyncedMetadataCallback ? (IGetMySyncedMetadataCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) sgh.a(parcel, SyncedCryptauthDevice.CREATOR);
            enforceNoDataAvail(parcel);
            onFetchedDevice(status, syncedCryptauthDevice);
            return true;
        }
    }

    void onFetchedDevice(Status status, SyncedCryptauthDevice syncedCryptauthDevice);
}
