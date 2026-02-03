package com.google.android.gms.auth.account.demoaccount.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.demoaccount.SetUpDemoAccountResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISetUpDemoAccountResponseCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISetUpDemoAccountResponseCallback {
        static final int TRANSACTION_onSetUpDemoAccountResponse = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISetUpDemoAccountResponseCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.demoaccount.internal.ISetUpDemoAccountResponseCallback");
            }

            @Override // com.google.android.gms.auth.account.demoaccount.internal.ISetUpDemoAccountResponseCallback
            public void onSetUpDemoAccountResponse(Status status, SetUpDemoAccountResponse setUpDemoAccountResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, setUpDemoAccountResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.demoaccount.internal.ISetUpDemoAccountResponseCallback");
        }

        public static ISetUpDemoAccountResponseCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.demoaccount.internal.ISetUpDemoAccountResponseCallback");
            return iInterfaceQueryLocalInterface instanceof ISetUpDemoAccountResponseCallback ? (ISetUpDemoAccountResponseCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            SetUpDemoAccountResponse setUpDemoAccountResponse = (SetUpDemoAccountResponse) sgh.a(parcel, SetUpDemoAccountResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onSetUpDemoAccountResponse(status, setUpDemoAccountResponse);
            return true;
        }
    }

    void onSetUpDemoAccountResponse(Status status, SetUpDemoAccountResponse setUpDemoAccountResponse);
}
