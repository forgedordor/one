package com.google.android.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.auth.GetHubTokenRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthManagerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthManagerService {
        static final int TRANSACTION_clearToken = 2;
        static final int TRANSACTION_getAccountChangeEvents = 3;
        static final int TRANSACTION_getAccounts = 6;
        static final int TRANSACTION_getHubToken = 10;
        static final int TRANSACTION_getToken = 1;
        static final int TRANSACTION_getTokenByAccount = 5;
        static final int TRANSACTION_hasCapabilities = 9;
        static final int TRANSACTION_removeAccount = 7;
        static final int TRANSACTION_requestGoogleAccountsAccess = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthManagerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.auth.IAuthManagerService");
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle clearToken(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, accountChangeEventsRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) sgh.a(parcelTransactAndReadException, AccountChangeEventsResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return accountChangeEventsResponse;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle getAccounts(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public GetHubTokenInternalResponse getHubToken(GetHubTokenRequest getHubTokenRequest, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getHubTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                GetHubTokenInternalResponse getHubTokenInternalResponse = (GetHubTokenInternalResponse) sgh.a(parcelTransactAndReadException, GetHubTokenInternalResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return getHubTokenInternalResponse;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle getToken(String str, String str2, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle getTokenByAccount(Account account, String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public int hasCapabilities(HasCapabilitiesRequest hasCapabilitiesRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, hasCapabilitiesRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle removeAccount(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle requestGoogleAccountsAccess(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }
        }

        public Stub() {
            super("com.google.android.auth.IAuthManagerService");
        }

        public static IAuthManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            return iInterfaceQueryLocalInterface instanceof IAuthManagerService ? (IAuthManagerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle token = getToken(string, string2, bundle);
                    parcel2.writeNoException();
                    sgh.e(parcel2, token);
                    return true;
                case 2:
                    String string3 = parcel.readString();
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle bundleClearToken = clearToken(string3, bundle2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundleClearToken);
                    return true;
                case 3:
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) sgh.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountChangeEventsResponse accountChangeEvents = getAccountChangeEvents(accountChangeEventsRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accountChangeEvents);
                    return true;
                case 4:
                default:
                    return false;
                case 5:
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    String string4 = parcel.readString();
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle tokenByAccount = getTokenByAccount(account, string4, bundle3);
                    parcel2.writeNoException();
                    sgh.e(parcel2, tokenByAccount);
                    return true;
                case 6:
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle accounts = getAccounts(bundle4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accounts);
                    return true;
                case 7:
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle bundleRemoveAccount = removeAccount(account2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundleRemoveAccount);
                    return true;
                case 8:
                    String string5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    Bundle bundleRequestGoogleAccountsAccess = requestGoogleAccountsAccess(string5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundleRequestGoogleAccountsAccess);
                    return true;
                case 9:
                    HasCapabilitiesRequest hasCapabilitiesRequest = (HasCapabilitiesRequest) sgh.a(parcel, HasCapabilitiesRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int iHasCapabilities = hasCapabilities(hasCapabilitiesRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(iHasCapabilities);
                    return true;
                case 10:
                    GetHubTokenRequest getHubTokenRequest = (GetHubTokenRequest) sgh.a(parcel, GetHubTokenRequest.CREATOR);
                    Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    GetHubTokenInternalResponse hubToken = getHubToken(getHubTokenRequest, bundle5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, hubToken);
                    return true;
            }
        }
    }

    Bundle clearToken(String str, Bundle bundle);

    AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest);

    Bundle getAccounts(Bundle bundle);

    GetHubTokenInternalResponse getHubToken(GetHubTokenRequest getHubTokenRequest, Bundle bundle);

    Bundle getToken(String str, String str2, Bundle bundle);

    Bundle getTokenByAccount(Account account, String str, Bundle bundle);

    int hasCapabilities(HasCapabilitiesRequest hasCapabilitiesRequest);

    Bundle removeAccount(Account account);

    Bundle requestGoogleAccountsAccess(String str);
}
