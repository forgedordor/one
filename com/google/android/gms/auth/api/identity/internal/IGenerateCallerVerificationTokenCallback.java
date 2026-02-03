package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGenerateCallerVerificationTokenCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGenerateCallerVerificationTokenCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGenerateCallerVerificationTokenCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGenerateCallerVerificationTokenCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IGenerateCallerVerificationTokenCallback
            public void onResult(Status status, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IGenerateCallerVerificationTokenCallback");
        }

        public static IGenerateCallerVerificationTokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGenerateCallerVerificationTokenCallback");
            return iInterfaceQueryLocalInterface instanceof IGenerateCallerVerificationTokenCallback ? (IGenerateCallerVerificationTokenCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onResult(status, string);
            return true;
        }
    }

    void onResult(Status status, String str);
}
