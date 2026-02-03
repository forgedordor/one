package com.google.android.gms.auth.api.phone.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISmsRetrieverResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISmsRetrieverResultCallback {
        static final int TRANSACTION_onSmsRetrieverResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISmsRetrieverResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
            }

            @Override // com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback
            public void onSmsRetrieverResult(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
        }

        public static ISmsRetrieverResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
            return iInterfaceQueryLocalInterface instanceof ISmsRetrieverResultCallback ? (ISmsRetrieverResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            onSmsRetrieverResult(status);
            return true;
        }
    }

    void onSmsRetrieverResult(Status status);
}
