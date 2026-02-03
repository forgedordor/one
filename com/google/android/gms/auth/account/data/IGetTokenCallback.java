package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetTokenCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetTokenCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetTokenCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetTokenCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetTokenCallback
            public void onResponse(Status status, TokenResponse tokenResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, tokenResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetTokenCallback");
        }

        public static IGetTokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetTokenCallback");
            return iInterfaceQueryLocalInterface instanceof IGetTokenCallback ? (IGetTokenCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            TokenResponse tokenResponse = (TokenResponse) sgh.a(parcel, TokenResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, tokenResponse);
            return true;
        }
    }

    void onResponse(Status status, TokenResponse tokenResponse);
}
