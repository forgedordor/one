package com.google.android.gms.auth.account.demoaccount.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.demoaccount.SetUpDemoAccountRequest;
import com.google.android.gms.auth.account.demoaccount.internal.ISetUpDemoAccountResponseCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDemoAccountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDemoAccountService {
        static final int TRANSACTION_cleanUpDemoAccount = 2;
        static final int TRANSACTION_setUpDemoAccount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDemoAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService");
            }

            @Override // com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService
            public void cleanUpDemoAccount(IStatusCallback iStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService
            public void setUpDemoAccount(ISetUpDemoAccountResponseCallback iSetUpDemoAccountResponseCallback, SetUpDemoAccountRequest setUpDemoAccountRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSetUpDemoAccountResponseCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, setUpDemoAccountRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService");
        }

        public static IDemoAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService");
            return iInterfaceQueryLocalInterface instanceof IDemoAccountService ? (IDemoAccountService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ISetUpDemoAccountResponseCallback iSetUpDemoAccountResponseCallbackAsInterface = ISetUpDemoAccountResponseCallback.Stub.asInterface(parcel.readStrongBinder());
                SetUpDemoAccountRequest setUpDemoAccountRequest = (SetUpDemoAccountRequest) sgh.a(parcel, SetUpDemoAccountRequest.CREATOR);
                enforceNoDataAvail(parcel);
                setUpDemoAccount(iSetUpDemoAccountResponseCallbackAsInterface, setUpDemoAccountRequest);
            } else {
                if (i != 2) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                cleanUpDemoAccount(iStatusCallbackAsInterface);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void cleanUpDemoAccount(IStatusCallback iStatusCallback);

    void setUpDemoAccount(ISetUpDemoAccountResponseCallback iSetUpDemoAccountResponseCallback, SetUpDemoAccountRequest setUpDemoAccountRequest);
}
