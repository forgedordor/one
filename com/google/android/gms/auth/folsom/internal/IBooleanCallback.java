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
public interface IBooleanCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBooleanCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBooleanCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IBooleanCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IBooleanCallback
            public void onResult(Status status, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IBooleanCallback");
        }

        public static IBooleanCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IBooleanCallback");
            return iInterfaceQueryLocalInterface instanceof IBooleanCallback ? (IBooleanCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            boolean zG = sgh.g(parcel);
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, zG, apiMetadata);
            return true;
        }
    }

    void onResult(Status status, boolean z, ApiMetadata apiMetadata);
}
