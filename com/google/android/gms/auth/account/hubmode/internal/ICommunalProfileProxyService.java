package com.google.android.gms.auth.account.hubmode.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.data.IGetStringValueCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICommunalProfileProxyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICommunalProfileProxyService {
        static final int TRANSACTION_addAccount = 1;
        static final int TRANSACTION_getAndroidId = 4;
        static final int TRANSACTION_getDeviceAccountId = 3;
        static final int TRANSACTION_removeAccount = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICommunalProfileProxyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService");
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void addAccount(IStatusCallback iStatusCallback, Account account, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void getAndroidId(IGetStringValueCallback iGetStringValueCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetStringValueCallback);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void getDeviceAccountId(IGetStringValueCallback iGetStringValueCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetStringValueCallback);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void removeAccount(IStatusCallback iStatusCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService");
        }

        public static ICommunalProfileProxyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService");
            return iInterfaceQueryLocalInterface instanceof ICommunalProfileProxyService ? (ICommunalProfileProxyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account = (Account) sgh.a(parcel, Account.CREATOR);
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                addAccount(iStatusCallbackAsInterface, account, string);
            } else if (i == 2) {
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                removeAccount(iStatusCallbackAsInterface2, account2);
            } else if (i == 3) {
                IGetStringValueCallback iGetStringValueCallbackAsInterface = IGetStringValueCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getDeviceAccountId(iGetStringValueCallbackAsInterface);
            } else {
                if (i != 4) {
                    return false;
                }
                IGetStringValueCallback iGetStringValueCallbackAsInterface2 = IGetStringValueCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getAndroidId(iGetStringValueCallbackAsInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addAccount(IStatusCallback iStatusCallback, Account account, String str);

    void getAndroidId(IGetStringValueCallback iGetStringValueCallback);

    void getDeviceAccountId(IGetStringValueCallback iGetStringValueCallback);

    void removeAccount(IStatusCallback iStatusCallback, Account account);
}
