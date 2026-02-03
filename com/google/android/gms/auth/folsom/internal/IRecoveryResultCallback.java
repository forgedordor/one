package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.folsom.RecoveryResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IRecoveryResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRecoveryResultCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRecoveryResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback
            public void onResult(Status status, RecoveryResult recoveryResult, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, recoveryResult);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback");
        }

        public static IRecoveryResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback");
            return iInterfaceQueryLocalInterface instanceof IRecoveryResultCallback ? (IRecoveryResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            RecoveryResult recoveryResult = (RecoveryResult) sgh.a(parcel, RecoveryResult.CREATOR);
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, recoveryResult, apiMetadata);
            return true;
        }
    }

    void onResult(Status status, RecoveryResult recoveryResult, ApiMetadata apiMetadata);
}
