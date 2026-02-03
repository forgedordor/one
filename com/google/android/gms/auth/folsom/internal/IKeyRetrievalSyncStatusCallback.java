package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKeyRetrievalSyncStatusCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKeyRetrievalSyncStatusCallback {
        static final int TRANSACTION_onSyncStatusResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKeyRetrievalSyncStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback
            public void onSyncStatusResult(Status status, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
        }

        public static IKeyRetrievalSyncStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
            return iInterfaceQueryLocalInterface instanceof IKeyRetrievalSyncStatusCallback ? (IKeyRetrievalSyncStatusCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            int i3 = parcel.readInt();
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            onSyncStatusResult(status, i3, apiMetadata);
            return true;
        }
    }

    void onSyncStatusResult(Status status, int i, ApiMetadata apiMetadata);
}
