package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.GetParentVerificationIntentResponse;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetParentVerificationIntentCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetParentVerificationIntentCallback {
        static final int TRANSACTION_onResponse = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetParentVerificationIntentCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
            }

            @Override // com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback
            public void onResponse(Status status, GetParentVerificationIntentResponse getParentVerificationIntentResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getParentVerificationIntentResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
        }

        public static IGetParentVerificationIntentCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
            return iInterfaceQueryLocalInterface instanceof IGetParentVerificationIntentCallback ? (IGetParentVerificationIntentCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            GetParentVerificationIntentResponse getParentVerificationIntentResponse = (GetParentVerificationIntentResponse) sgh.a(parcel, GetParentVerificationIntentResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, getParentVerificationIntentResponse);
            return true;
        }
    }

    void onResponse(Status status, GetParentVerificationIntentResponse getParentVerificationIntentResponse);
}
