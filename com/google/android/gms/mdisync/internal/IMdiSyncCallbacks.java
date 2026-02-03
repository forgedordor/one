package com.google.android.gms.mdisync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMdiSyncCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdiSyncCallbacks {
        static final int TRANSACTION_onSyncComplete = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdiSyncCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncCallbacks
            public void onSyncComplete(Status status, SyncResult syncResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, syncResult);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        }

        public static IMdiSyncCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
            return iInterfaceQueryLocalInterface instanceof IMdiSyncCallbacks ? (IMdiSyncCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            SyncResult syncResult = (SyncResult) sgh.a(parcel, SyncResult.CREATOR);
            enforceNoDataAvail(parcel);
            onSyncComplete(status, syncResult);
            return true;
        }
    }

    void onSyncComplete(Status status, SyncResult syncResult);
}
