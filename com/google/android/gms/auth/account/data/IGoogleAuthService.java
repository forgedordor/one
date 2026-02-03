package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.GetHubTokenRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.account.data.IBundleCallback;
import com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback;
import com.google.android.gms.auth.account.data.IGetAccountsCallback;
import com.google.android.gms.auth.account.data.IGetHubTokenCallback;
import com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback;
import com.google.android.gms.auth.account.data.IHasCapabilitiesCallback;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleAuthService {
        static final int TRANSACTION_clearToken = 2;
        static final int TRANSACTION_getAccountChangeEvents = 4;
        static final int TRANSACTION_getAccounts = 5;
        static final int TRANSACTION_getHubToken = 8;
        static final int TRANSACTION_getTokenWithDetails = 1;
        static final int TRANSACTION_hasCapabilities = 7;
        static final int TRANSACTION_removeAccount = 6;
        static final int TRANSACTION_requestGoogleAccountsAccess = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void clearToken(IStatusCallback iStatusCallback, ClearTokenRequest clearTokenRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, clearTokenRequest);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetAccountChangeEventsCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountChangeEventsRequest);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getAccounts(IGetAccountsCallback iGetAccountsCallback, GetAccountsRequest getAccountsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetAccountsCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, getAccountsRequest);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getHubToken(IGetHubTokenCallback iGetHubTokenCallback, GetHubTokenRequest getHubTokenRequest, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetHubTokenCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, getHubTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void getTokenWithDetails(IGetTokenWithDetailsCallback iGetTokenWithDetailsCallback, Account account, String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetTokenWithDetailsCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void hasCapabilities(IHasCapabilitiesCallback iHasCapabilitiesCallback, HasCapabilitiesRequest hasCapabilitiesRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iHasCapabilitiesCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, hasCapabilitiesRequest);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void removeAccount(IBundleCallback iBundleCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IGoogleAuthService
            public void requestGoogleAccountsAccess(IBundleCallback iBundleCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBundleCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGoogleAuthService");
        }

        public static IGoogleAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
            return iInterfaceQueryLocalInterface instanceof IGoogleAuthService ? (IGoogleAuthService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IGetTokenWithDetailsCallback iGetTokenWithDetailsCallbackAsInterface = IGetTokenWithDetailsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    String string = parcel.readString();
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    getTokenWithDetails(iGetTokenWithDetailsCallbackAsInterface, account, string, bundle);
                    break;
                case 2:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ClearTokenRequest clearTokenRequest = (ClearTokenRequest) sgh.a(parcel, ClearTokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearToken(iStatusCallbackAsInterface, clearTokenRequest);
                    break;
                case 3:
                    IBundleCallback iBundleCallbackAsInterface = IBundleCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    requestGoogleAccountsAccess(iBundleCallbackAsInterface, string2);
                    break;
                case 4:
                    IGetAccountChangeEventsCallback iGetAccountChangeEventsCallbackAsInterface = IGetAccountChangeEventsCallback.Stub.asInterface(parcel.readStrongBinder());
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) sgh.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountChangeEvents(iGetAccountChangeEventsCallbackAsInterface, accountChangeEventsRequest);
                    break;
                case 5:
                    IGetAccountsCallback iGetAccountsCallbackAsInterface = IGetAccountsCallback.Stub.asInterface(parcel.readStrongBinder());
                    GetAccountsRequest getAccountsRequest = (GetAccountsRequest) sgh.a(parcel, GetAccountsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccounts(iGetAccountsCallbackAsInterface, getAccountsRequest);
                    break;
                case 6:
                    IBundleCallback iBundleCallbackAsInterface2 = IBundleCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeAccount(iBundleCallbackAsInterface2, account2);
                    break;
                case 7:
                    IHasCapabilitiesCallback iHasCapabilitiesCallbackAsInterface = IHasCapabilitiesCallback.Stub.asInterface(parcel.readStrongBinder());
                    HasCapabilitiesRequest hasCapabilitiesRequest = (HasCapabilitiesRequest) sgh.a(parcel, HasCapabilitiesRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasCapabilities(iHasCapabilitiesCallbackAsInterface, hasCapabilitiesRequest);
                    break;
                case 8:
                    IGetHubTokenCallback iGetHubTokenCallbackAsInterface = IGetHubTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                    GetHubTokenRequest getHubTokenRequest = (GetHubTokenRequest) sgh.a(parcel, GetHubTokenRequest.CREATOR);
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    getHubToken(iGetHubTokenCallbackAsInterface, getHubTokenRequest, bundle2);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(IStatusCallback iStatusCallback, ClearTokenRequest clearTokenRequest);

    void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest);

    void getAccounts(IGetAccountsCallback iGetAccountsCallback, GetAccountsRequest getAccountsRequest);

    void getHubToken(IGetHubTokenCallback iGetHubTokenCallback, GetHubTokenRequest getHubTokenRequest, Bundle bundle);

    void getTokenWithDetails(IGetTokenWithDetailsCallback iGetTokenWithDetailsCallback, Account account, String str, Bundle bundle);

    void hasCapabilities(IHasCapabilitiesCallback iHasCapabilitiesCallback, HasCapabilitiesRequest hasCapabilitiesRequest);

    void removeAccount(IBundleCallback iBundleCallback, Account account);

    void requestGoogleAccountsAccess(IBundleCallback iBundleCallback, String str);
}
