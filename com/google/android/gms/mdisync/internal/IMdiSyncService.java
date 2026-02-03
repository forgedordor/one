package com.google.android.gms.mdisync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.IMdiSyncCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMdiSyncService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdiSyncService {
        static final int TRANSACTION_sync = 1;
        static final int TRANSACTION_syncWithTeleportation = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdiSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncService");
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncService
            public void sync(IMdiSyncCallbacks iMdiSyncCallbacks, SyncRequest syncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMdiSyncCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, syncRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, callerInfo);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncService
            public void syncWithTeleportation(IMdiSyncCallbacks iMdiSyncCallbacks, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMdiSyncCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, teleportingSyncRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, callerInfo);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdisync.internal.IMdiSyncService");
        }

        public static IMdiSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
            return iInterfaceQueryLocalInterface instanceof IMdiSyncService ? (IMdiSyncService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMdiSyncCallbacks iMdiSyncCallbacksAsInterface = IMdiSyncCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SyncRequest syncRequest = (SyncRequest) sgh.a(parcel, SyncRequest.CREATOR);
                CallerInfo callerInfo = (CallerInfo) sgh.a(parcel, CallerInfo.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                sync(iMdiSyncCallbacksAsInterface, syncRequest, callerInfo, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                IMdiSyncCallbacks iMdiSyncCallbacksAsInterface2 = IMdiSyncCallbacks.Stub.asInterface(parcel.readStrongBinder());
                TeleportingSyncRequest teleportingSyncRequest = (TeleportingSyncRequest) sgh.a(parcel, TeleportingSyncRequest.CREATOR);
                CallerInfo callerInfo2 = (CallerInfo) sgh.a(parcel, CallerInfo.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                syncWithTeleportation(iMdiSyncCallbacksAsInterface2, teleportingSyncRequest, callerInfo2, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void sync(IMdiSyncCallbacks iMdiSyncCallbacks, SyncRequest syncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata);

    void syncWithTeleportation(IMdiSyncCallbacks iMdiSyncCallbacks, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata);
}
