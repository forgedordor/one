package com.google.android.gms.auth.account.hubmode.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICommunalAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICommunalAuthService {
        static final int TRANSACTION_addAccountToCommunalProfile = 1;
        static final int TRANSACTION_removeAccountFromCommunalProfile = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICommunalAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService");
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService
            public void addAccountToCommunalProfile(IStatusCallback iStatusCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService
            public void removeAccountFromCommunalProfile(IStatusCallback iStatusCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService");
        }

        public static ICommunalAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.hubmode.internal.ICommunalAuthService");
            return iInterfaceQueryLocalInterface instanceof ICommunalAuthService ? (ICommunalAuthService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account = (Account) sgh.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                addAccountToCommunalProfile(iStatusCallbackAsInterface, account);
            } else {
                if (i != 2) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                removeAccountFromCommunalProfile(iStatusCallbackAsInterface2, account2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addAccountToCommunalProfile(IStatusCallback iStatusCallback, Account account);

    void removeAccountFromCommunalProfile(IStatusCallback iStatusCallback, Account account);
}
