package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetAccountChangeEventsCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetAccountChangeEventsCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetAccountChangeEventsCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback
            public void onResponse(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountChangeEventsResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
        }

        public static IGetAccountChangeEventsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
            return iInterfaceQueryLocalInterface instanceof IGetAccountChangeEventsCallback ? (IGetAccountChangeEventsCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) sgh.a(parcel, AccountChangeEventsResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, accountChangeEventsResponse);
            return true;
        }
    }

    void onResponse(Status status, AccountChangeEventsResponse accountChangeEventsResponse);
}
