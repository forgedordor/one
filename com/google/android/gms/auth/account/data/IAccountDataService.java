package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.account.data.IClearTokenCallback;
import com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback;
import com.google.android.gms.auth.account.data.IGetAccountExportDataCallback;
import com.google.android.gms.auth.account.data.IGetAccountIdCallback;
import com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback;
import com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback;
import com.google.android.gms.auth.account.data.IGetStringValueCallback;
import com.google.android.gms.auth.account.data.IGetTokenCallback;
import com.google.android.gms.auth.account.data.IGetTokenHandleCallback;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAccountDataService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAccountDataService {
        static final int TRANSACTION_clearToken = 5;
        static final int TRANSACTION_getAccountChangeEvents = 8;
        static final int TRANSACTION_getAccountExportData = 9;
        static final int TRANSACTION_getAccountId = 7;
        static final int TRANSACTION_getAccountNameFromAccountId = 14;
        static final int TRANSACTION_getDeviceManagementInfo = 6;
        static final int TRANSACTION_getGoogleAccountData = 10;
        static final int TRANSACTION_getToken = 4;
        static final int TRANSACTION_getTokenHandle = 11;
        static final int TRANSACTION_updateHideDmNotifications = 1;
        static final int TRANSACTION_whitelistApplicationForGoogleAccounts = 13;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAccountDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IAccountDataService");
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void clearToken(IClearTokenCallback iClearTokenCallback, ClearTokenRequest clearTokenRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearTokenCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, clearTokenRequest);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetAccountChangeEventsCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountChangeEventsRequest);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountExportData(IGetAccountExportDataCallback iGetAccountExportDataCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetAccountExportDataCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountId(IGetAccountIdCallback iGetAccountIdCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetAccountIdCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getAccountNameFromAccountId(IGetStringValueCallback iGetStringValueCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetStringValueCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getDeviceManagementInfo(IGetDeviceManagementInfoCallback iGetDeviceManagementInfoCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetDeviceManagementInfoCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getGoogleAccountData(IGetGoogleAccountDataCallback iGetGoogleAccountDataCallback, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetGoogleAccountDataCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getToken(IGetTokenCallback iGetTokenCallback, TokenRequest tokenRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetTokenCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, tokenRequest);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void getTokenHandle(IGetTokenHandleCallback iGetTokenHandleCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetTokenHandleCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void updateHideDmNotifications(IStatusCallback iStatusCallback, Account account, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.data.IAccountDataService
            public void whitelistApplicationForGoogleAccounts(IStatusCallback iStatusCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IAccountDataService");
        }

        public static IAccountDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IAccountDataService");
            return iInterfaceQueryLocalInterface instanceof IAccountDataService ? (IAccountDataService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    updateHideDmNotifications(iStatusCallbackAsInterface, account, zG);
                    break;
                case 2:
                case 3:
                case 12:
                default:
                    return false;
                case 4:
                    IGetTokenCallback iGetTokenCallbackAsInterface = IGetTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                    TokenRequest tokenRequest = (TokenRequest) sgh.a(parcel, TokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getToken(iGetTokenCallbackAsInterface, tokenRequest);
                    break;
                case 5:
                    IClearTokenCallback iClearTokenCallbackAsInterface = IClearTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                    ClearTokenRequest clearTokenRequest = (ClearTokenRequest) sgh.a(parcel, ClearTokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearToken(iClearTokenCallbackAsInterface, clearTokenRequest);
                    break;
                case 6:
                    IGetDeviceManagementInfoCallback iGetDeviceManagementInfoCallbackAsInterface = IGetDeviceManagementInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDeviceManagementInfo(iGetDeviceManagementInfoCallbackAsInterface, account2);
                    break;
                case 7:
                    IGetAccountIdCallback iGetAccountIdCallbackAsInterface = IGetAccountIdCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountId(iGetAccountIdCallbackAsInterface, account3);
                    break;
                case 8:
                    IGetAccountChangeEventsCallback iGetAccountChangeEventsCallbackAsInterface = IGetAccountChangeEventsCallback.Stub.asInterface(parcel.readStrongBinder());
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) sgh.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountChangeEvents(iGetAccountChangeEventsCallbackAsInterface, accountChangeEventsRequest);
                    break;
                case 9:
                    IGetAccountExportDataCallback iGetAccountExportDataCallbackAsInterface = IGetAccountExportDataCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAccountExportData(iGetAccountExportDataCallbackAsInterface, string);
                    break;
                case 10:
                    IGetGoogleAccountDataCallback iGetGoogleAccountDataCallbackAsInterface = IGetGoogleAccountDataCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getGoogleAccountData(iGetGoogleAccountDataCallbackAsInterface, account4);
                    break;
                case 11:
                    IGetTokenHandleCallback iGetTokenHandleCallbackAsInterface = IGetTokenHandleCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getTokenHandle(iGetTokenHandleCallbackAsInterface, string2);
                    break;
                case 13:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    whitelistApplicationForGoogleAccounts(iStatusCallbackAsInterface2, string3);
                    break;
                case 14:
                    IGetStringValueCallback iGetStringValueCallbackAsInterface = IGetStringValueCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAccountNameFromAccountId(iGetStringValueCallbackAsInterface, string4);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(IClearTokenCallback iClearTokenCallback, ClearTokenRequest clearTokenRequest);

    void getAccountChangeEvents(IGetAccountChangeEventsCallback iGetAccountChangeEventsCallback, AccountChangeEventsRequest accountChangeEventsRequest);

    void getAccountExportData(IGetAccountExportDataCallback iGetAccountExportDataCallback, String str);

    void getAccountId(IGetAccountIdCallback iGetAccountIdCallback, Account account);

    void getAccountNameFromAccountId(IGetStringValueCallback iGetStringValueCallback, String str);

    void getDeviceManagementInfo(IGetDeviceManagementInfoCallback iGetDeviceManagementInfoCallback, Account account);

    void getGoogleAccountData(IGetGoogleAccountDataCallback iGetGoogleAccountDataCallback, Account account);

    void getToken(IGetTokenCallback iGetTokenCallback, TokenRequest tokenRequest);

    void getTokenHandle(IGetTokenHandleCallback iGetTokenHandleCallback, String str);

    void updateHideDmNotifications(IStatusCallback iStatusCallback, Account account, boolean z);

    void whitelistApplicationForGoogleAccounts(IStatusCallback iStatusCallback, String str);
}
