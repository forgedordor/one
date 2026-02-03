package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.IWorkAccountCallback;
import com.google.android.gms.auth.account.internal.IBooleanResultCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWorkAccountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWorkAccountService {
        static final int TRANSACTION_addWorkAccount = 2;
        static final int TRANSACTION_clearWorkAccountAppWhitelist = 5;
        static final int TRANSACTION_initWorkAuthenticator = 6;
        static final int TRANSACTION_isPackageWhitelisted = 7;
        static final int TRANSACTION_removeWorkAccount = 3;
        static final int TRANSACTION_setWorkAccountAppWhitelistFingerprint = 4;
        static final int TRANSACTION_setWorkAuthenticatorEnabled = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWorkAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void addWorkAccount(IWorkAccountCallback iWorkAccountCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWorkAccountCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public boolean clearWorkAccountAppWhitelist() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void initWorkAuthenticator() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void isPackageWhitelisted(String str, IBooleanResultCallback iBooleanResultCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanResultCallback);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void removeWorkAccount(IWorkAccountCallback iWorkAccountCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWorkAccountCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public boolean setWorkAccountAppWhitelistFingerprint(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountService
            public void setWorkAuthenticatorEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.IWorkAccountService");
        }

        public static IWorkAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
            return iInterfaceQueryLocalInterface instanceof IWorkAccountService ? (IWorkAccountService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setWorkAuthenticatorEnabled(zG);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IWorkAccountCallback iWorkAccountCallbackAsInterface = IWorkAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    addWorkAccount(iWorkAccountCallbackAsInterface, string);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    IWorkAccountCallback iWorkAccountCallbackAsInterface2 = IWorkAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeWorkAccount(iWorkAccountCallbackAsInterface2, account);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean workAccountAppWhitelistFingerprint = setWorkAccountAppWhitelistFingerprint(string2, string3);
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(workAccountAppWhitelistFingerprint ? 1 : 0);
                    return true;
                case 5:
                    boolean zClearWorkAccountAppWhitelist = clearWorkAccountAppWhitelist();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zClearWorkAccountAppWhitelist ? 1 : 0);
                    return true;
                case 6:
                    initWorkAuthenticator();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    String string4 = parcel.readString();
                    IBooleanResultCallback iBooleanResultCallbackAsInterface = IBooleanResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isPackageWhitelisted(string4, iBooleanResultCallbackAsInterface);
                    return true;
                default:
                    return false;
            }
        }
    }

    void addWorkAccount(IWorkAccountCallback iWorkAccountCallback, String str);

    boolean clearWorkAccountAppWhitelist();

    void initWorkAuthenticator();

    void isPackageWhitelisted(String str, IBooleanResultCallback iBooleanResultCallback);

    void removeWorkAccount(IWorkAccountCallback iWorkAccountCallback, Account account);

    boolean setWorkAccountAppWhitelistFingerprint(String str, String str2);

    void setWorkAuthenticatorEnabled(boolean z);
}
