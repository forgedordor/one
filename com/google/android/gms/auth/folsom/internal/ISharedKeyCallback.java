package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISharedKeyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISharedKeyCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISharedKeyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.ISharedKeyCallback
            public void onResult(Status status, SharedKey[] sharedKeyArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(sharedKeyArr, 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
        }

        public static ISharedKeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
            return iInterfaceQueryLocalInterface instanceof ISharedKeyCallback ? (ISharedKeyCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            SharedKey[] sharedKeyArr = (SharedKey[]) parcel.createTypedArray(SharedKey.CREATOR);
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, sharedKeyArr, apiMetadata);
            return true;
        }
    }

    void onResult(Status status, SharedKey[] sharedKeyArr, ApiMetadata apiMetadata);
}
