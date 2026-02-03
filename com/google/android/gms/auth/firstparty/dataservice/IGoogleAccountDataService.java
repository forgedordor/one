package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleAccountDataService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleAccountDataService {
        static final int TRANSACTION_checkAccountName = 2;
        static final int TRANSACTION_checkFrpCompliance = 27;
        static final int TRANSACTION_checkPassword = 3;
        static final int TRANSACTION_checkRealName = 4;
        static final int TRANSACTION_clearFactoryResetChallenges = 29;
        static final int TRANSACTION_clearFre = 44;
        static final int TRANSACTION_clearToken = 19;
        static final int TRANSACTION_clearWorkAccountAppWhitelist = 35;
        static final int TRANSACTION_confirmCredentials = 10;
        static final int TRANSACTION_createAccount = 5;
        static final int TRANSACTION_createPlusProfile = 7;
        static final int TRANSACTION_getAccountChangeEvents = 23;
        static final int TRANSACTION_getAccountData = 1;
        static final int TRANSACTION_getAccountExportData = 16;
        static final int TRANSACTION_getAccountId = 25;
        static final int TRANSACTION_getAccountVisibilityRestriction = 42;
        static final int TRANSACTION_getAndAdvanceOtpCounter = 37;
        static final int TRANSACTION_getDeviceManagementInfo = 40;
        static final int TRANSACTION_getGoogleAccountData = 30;
        static final int TRANSACTION_getGoogleAccountId = 31;
        static final int TRANSACTION_getGplusInfo = 6;
        static final int TRANSACTION_getOtp = 24;
        static final int TRANSACTION_getToken = 8;
        static final int TRANSACTION_getTokenHandle = 38;
        static final int TRANSACTION_getWebSetupConfig = 18;
        static final int TRANSACTION_installAccountFromExportData = 17;
        static final int TRANSACTION_isTokenHandleValid = 39;
        static final int TRANSACTION_removeAccount = 20;
        static final int TRANSACTION_setAccountVisibilityRestriction = 41;
        static final int TRANSACTION_setFreUnlocked = 43;
        static final int TRANSACTION_setWorkAccountAppWhitelistFingerprint = 34;
        static final int TRANSACTION_signIn = 9;
        static final int TRANSACTION_updateCredentials = 11;
        static final int TRANSACTION_validateAccountCredentials = 36;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleAccountDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public AccountNameCheckResponse checkAccountName(AccountNameCheckRequest accountNameCheckRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, accountNameCheckRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                AccountNameCheckResponse accountNameCheckResponse = (AccountNameCheckResponse) sgh.a(parcelTransactAndReadException, AccountNameCheckResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return accountNameCheckResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public CheckFactoryResetPolicyComplianceResponse checkFrpCompliance(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, checkFactoryResetPolicyComplianceRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(27, parcelObtainAndWriteInterfaceToken);
                CheckFactoryResetPolicyComplianceResponse checkFactoryResetPolicyComplianceResponse = (CheckFactoryResetPolicyComplianceResponse) sgh.a(parcelTransactAndReadException, CheckFactoryResetPolicyComplianceResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return checkFactoryResetPolicyComplianceResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public PasswordCheckResponse checkPassword(PasswordCheckRequest passwordCheckRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, passwordCheckRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                PasswordCheckResponse passwordCheckResponse = (PasswordCheckResponse) sgh.a(parcelTransactAndReadException, PasswordCheckResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return passwordCheckResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public CheckRealNameResponse checkRealName(CheckRealNameRequest checkRealNameRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, checkRealNameRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                CheckRealNameResponse checkRealNameResponse = (CheckRealNameResponse) sgh.a(parcelTransactAndReadException, CheckRealNameResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return checkRealNameResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public void clearFactoryResetChallenges() {
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public void clearFre() {
                transactAndReadExceptionReturnVoid(44, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public ClearTokenResponse clearToken(ClearTokenRequest clearTokenRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, clearTokenRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                ClearTokenResponse clearTokenResponse = (ClearTokenResponse) sgh.a(parcelTransactAndReadException, ClearTokenResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return clearTokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean clearWorkAccountAppWhitelist() {
                Parcel parcelTransactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse confirmCredentials(ConfirmCredentialsRequest confirmCredentialsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, confirmCredentialsRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) sgh.a(parcelTransactAndReadException, TokenResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse createAccount(GoogleAccountSetupRequest googleAccountSetupRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleAccountSetupRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) sgh.a(parcelTransactAndReadException, TokenResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse createPlusProfile(GoogleAccountSetupRequest googleAccountSetupRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, googleAccountSetupRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) sgh.a(parcelTransactAndReadException, TokenResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, accountChangeEventsRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(23, parcelObtainAndWriteInterfaceToken);
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) sgh.a(parcelTransactAndReadException, AccountChangeEventsResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return accountChangeEventsResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GoogleAccountData getAccountData(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                GoogleAccountData googleAccountData = (GoogleAccountData) sgh.a(parcelTransactAndReadException, GoogleAccountData.CREATOR);
                parcelTransactAndReadException.recycle();
                return googleAccountData;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public Bundle getAccountExportData(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(16, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String getAccountId(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(25, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String[] getAccountVisibilityRestriction(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                Parcel parcelTransactAndReadException = transactAndReadException(42, parcelObtainAndWriteInterfaceToken);
                String[] strArrCreateStringArray = parcelTransactAndReadException.createStringArray();
                parcelTransactAndReadException.recycle();
                return strArrCreateStringArray;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounter(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(37, parcelObtainAndWriteInterfaceToken);
                GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounterResponse = (GetAndAdvanceOtpCounterResponse) sgh.a(parcelTransactAndReadException, GetAndAdvanceOtpCounterResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return getAndAdvanceOtpCounterResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public DeviceManagementInfoResponse getDeviceManagementInfo(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                Parcel parcelTransactAndReadException = transactAndReadException(40, parcelObtainAndWriteInterfaceToken);
                DeviceManagementInfoResponse deviceManagementInfoResponse = (DeviceManagementInfoResponse) sgh.a(parcelTransactAndReadException, DeviceManagementInfoResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return deviceManagementInfoResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GoogleAccountData getGoogleAccountData(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                Parcel parcelTransactAndReadException = transactAndReadException(30, parcelObtainAndWriteInterfaceToken);
                GoogleAccountData googleAccountData = (GoogleAccountData) sgh.a(parcelTransactAndReadException, GoogleAccountData.CREATOR);
                parcelTransactAndReadException.recycle();
                return googleAccountData;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String getGoogleAccountId(Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                Parcel parcelTransactAndReadException = transactAndReadException(31, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public GplusInfoResponse getGplusInfo(GplusInfoRequest gplusInfoRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, gplusInfoRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                GplusInfoResponse gplusInfoResponse = (GplusInfoResponse) sgh.a(parcelTransactAndReadException, GplusInfoResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return gplusInfoResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public OtpResponse getOtp(OtpRequest otpRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, otpRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(24, parcelObtainAndWriteInterfaceToken);
                OtpResponse otpResponse = (OtpResponse) sgh.a(parcelTransactAndReadException, OtpResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return otpResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse getToken(TokenRequest tokenRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, tokenRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) sgh.a(parcelTransactAndReadException, TokenResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public String getTokenHandle(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(38, parcelObtainAndWriteInterfaceToken);
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public WebSetupConfig getWebSetupConfig(WebSetupConfigRequest webSetupConfigRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, webSetupConfigRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(18, parcelObtainAndWriteInterfaceToken);
                WebSetupConfig webSetupConfig = (WebSetupConfig) sgh.a(parcelTransactAndReadException, WebSetupConfig.CREATOR);
                parcelTransactAndReadException.recycle();
                return webSetupConfig;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean installAccountFromExportData(String str, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean isTokenHandleValid(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(39, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public AccountRemovalResponse removeAccount(AccountRemovalRequest accountRemovalRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, accountRemovalRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(20, parcelObtainAndWriteInterfaceToken);
                AccountRemovalResponse accountRemovalResponse = (AccountRemovalResponse) sgh.a(parcelTransactAndReadException, AccountRemovalResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return accountRemovalResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean setAccountVisibilityRestriction(Account account, String[] strArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                Parcel parcelTransactAndReadException = transactAndReadException(41, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public void setFreUnlocked() {
                transactAndReadExceptionReturnVoid(43, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public boolean setWorkAccountAppWhitelistFingerprint(String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                Parcel parcelTransactAndReadException = transactAndReadException(34, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse signIn(AccountSignInRequest accountSignInRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, accountSignInRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) sgh.a(parcelTransactAndReadException, TokenResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public TokenResponse updateCredentials(UpdateCredentialsRequest updateCredentialsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, updateCredentialsRequest);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                TokenResponse tokenResponse = (TokenResponse) sgh.a(parcelTransactAndReadException, TokenResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return tokenResponse;
            }

            @Override // com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService
            public ValidateAccountCredentialsResponse validateAccountCredentials(AccountCredentials accountCredentials) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, accountCredentials);
                Parcel parcelTransactAndReadException = transactAndReadException(36, parcelObtainAndWriteInterfaceToken);
                ValidateAccountCredentialsResponse validateAccountCredentialsResponse = (ValidateAccountCredentialsResponse) sgh.a(parcelTransactAndReadException, ValidateAccountCredentialsResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return validateAccountCredentialsResponse;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
        }

        public static IGoogleAccountDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
            return iInterfaceQueryLocalInterface instanceof IGoogleAccountDataService ? (IGoogleAccountDataService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    GoogleAccountData accountData = getAccountData(string);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accountData);
                    return true;
                case 2:
                    AccountNameCheckRequest accountNameCheckRequest = (AccountNameCheckRequest) sgh.a(parcel, AccountNameCheckRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountNameCheckResponse accountNameCheckResponseCheckAccountName = checkAccountName(accountNameCheckRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accountNameCheckResponseCheckAccountName);
                    return true;
                case 3:
                    PasswordCheckRequest passwordCheckRequest = (PasswordCheckRequest) sgh.a(parcel, PasswordCheckRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PasswordCheckResponse passwordCheckResponseCheckPassword = checkPassword(passwordCheckRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, passwordCheckResponseCheckPassword);
                    return true;
                case 4:
                    CheckRealNameRequest checkRealNameRequest = (CheckRealNameRequest) sgh.a(parcel, CheckRealNameRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    CheckRealNameResponse checkRealNameResponseCheckRealName = checkRealName(checkRealNameRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, checkRealNameResponseCheckRealName);
                    return true;
                case 5:
                    GoogleAccountSetupRequest googleAccountSetupRequest = (GoogleAccountSetupRequest) sgh.a(parcel, GoogleAccountSetupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse tokenResponseCreateAccount = createAccount(googleAccountSetupRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, tokenResponseCreateAccount);
                    return true;
                case 6:
                    GplusInfoRequest gplusInfoRequest = (GplusInfoRequest) sgh.a(parcel, GplusInfoRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    GplusInfoResponse gplusInfo = getGplusInfo(gplusInfoRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, gplusInfo);
                    return true;
                case 7:
                    GoogleAccountSetupRequest googleAccountSetupRequest2 = (GoogleAccountSetupRequest) sgh.a(parcel, GoogleAccountSetupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse tokenResponseCreatePlusProfile = createPlusProfile(googleAccountSetupRequest2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, tokenResponseCreatePlusProfile);
                    return true;
                case 8:
                    TokenRequest tokenRequest = (TokenRequest) sgh.a(parcel, TokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse token = getToken(tokenRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, token);
                    return true;
                case 9:
                    AccountSignInRequest accountSignInRequest = (AccountSignInRequest) sgh.a(parcel, AccountSignInRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse tokenResponseSignIn = signIn(accountSignInRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, tokenResponseSignIn);
                    return true;
                case 10:
                    ConfirmCredentialsRequest confirmCredentialsRequest = (ConfirmCredentialsRequest) sgh.a(parcel, ConfirmCredentialsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse tokenResponseConfirmCredentials = confirmCredentials(confirmCredentialsRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, tokenResponseConfirmCredentials);
                    return true;
                case 11:
                    UpdateCredentialsRequest updateCredentialsRequest = (UpdateCredentialsRequest) sgh.a(parcel, UpdateCredentialsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    TokenResponse tokenResponseUpdateCredentials = updateCredentials(updateCredentialsRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, tokenResponseUpdateCredentials);
                    return true;
                case 12:
                case 13:
                case 14:
                case 15:
                case 21:
                case 22:
                case 26:
                case 28:
                case 32:
                case 33:
                default:
                    return false;
                case 16:
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    Bundle accountExportData = getAccountExportData(string2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accountExportData);
                    return true;
                case 17:
                    String string3 = parcel.readString();
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zInstallAccountFromExportData = installAccountFromExportData(string3, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInstallAccountFromExportData ? 1 : 0);
                    return true;
                case 18:
                    WebSetupConfigRequest webSetupConfigRequest = (WebSetupConfigRequest) sgh.a(parcel, WebSetupConfigRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    WebSetupConfig webSetupConfig = getWebSetupConfig(webSetupConfigRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, webSetupConfig);
                    return true;
                case 19:
                    ClearTokenRequest clearTokenRequest = (ClearTokenRequest) sgh.a(parcel, ClearTokenRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    ClearTokenResponse clearTokenResponseClearToken = clearToken(clearTokenRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, clearTokenResponseClearToken);
                    return true;
                case 20:
                    AccountRemovalRequest accountRemovalRequest = (AccountRemovalRequest) sgh.a(parcel, AccountRemovalRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountRemovalResponse accountRemovalResponseRemoveAccount = removeAccount(accountRemovalRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accountRemovalResponseRemoveAccount);
                    return true;
                case 23:
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) sgh.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountChangeEventsResponse accountChangeEvents = getAccountChangeEvents(accountChangeEventsRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, accountChangeEvents);
                    return true;
                case 24:
                    OtpRequest otpRequest = (OtpRequest) sgh.a(parcel, OtpRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    OtpResponse otp = getOtp(otpRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, otp);
                    return true;
                case 25:
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    String accountId = getAccountId(string4);
                    parcel2.writeNoException();
                    parcel2.writeString(accountId);
                    return true;
                case 27:
                    CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest = (CheckFactoryResetPolicyComplianceRequest) sgh.a(parcel, CheckFactoryResetPolicyComplianceRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    CheckFactoryResetPolicyComplianceResponse checkFactoryResetPolicyComplianceResponseCheckFrpCompliance = checkFrpCompliance(checkFactoryResetPolicyComplianceRequest);
                    parcel2.writeNoException();
                    sgh.e(parcel2, checkFactoryResetPolicyComplianceResponseCheckFrpCompliance);
                    return true;
                case 29:
                    clearFactoryResetChallenges();
                    parcel2.writeNoException();
                    return true;
                case 30:
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    GoogleAccountData googleAccountData = getGoogleAccountData(account);
                    parcel2.writeNoException();
                    sgh.e(parcel2, googleAccountData);
                    return true;
                case 31:
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    String googleAccountId = getGoogleAccountId(account2);
                    parcel2.writeNoException();
                    parcel2.writeString(googleAccountId);
                    return true;
                case 34:
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean workAccountAppWhitelistFingerprint = setWorkAccountAppWhitelistFingerprint(string5, string6);
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(workAccountAppWhitelistFingerprint ? 1 : 0);
                    return true;
                case 35:
                    boolean zClearWorkAccountAppWhitelist = clearWorkAccountAppWhitelist();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zClearWorkAccountAppWhitelist ? 1 : 0);
                    return true;
                case 36:
                    AccountCredentials accountCredentials = (AccountCredentials) sgh.a(parcel, AccountCredentials.CREATOR);
                    enforceNoDataAvail(parcel);
                    ValidateAccountCredentialsResponse validateAccountCredentialsResponseValidateAccountCredentials = validateAccountCredentials(accountCredentials);
                    parcel2.writeNoException();
                    sgh.e(parcel2, validateAccountCredentialsResponseValidateAccountCredentials);
                    return true;
                case 37:
                    String string7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    GetAndAdvanceOtpCounterResponse andAdvanceOtpCounter = getAndAdvanceOtpCounter(string7);
                    parcel2.writeNoException();
                    sgh.e(parcel2, andAdvanceOtpCounter);
                    return true;
                case 38:
                    String string8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    String tokenHandle = getTokenHandle(string8);
                    parcel2.writeNoException();
                    parcel2.writeString(tokenHandle);
                    return true;
                case 39:
                    String string9 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean zIsTokenHandleValid = isTokenHandleValid(string9);
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsTokenHandleValid ? 1 : 0);
                    return true;
                case 40:
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    DeviceManagementInfoResponse deviceManagementInfo = getDeviceManagementInfo(account3);
                    parcel2.writeNoException();
                    sgh.e(parcel2, deviceManagementInfo);
                    return true;
                case 41:
                    Account account4 = (Account) sgh.a(parcel, Account.CREATOR);
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    boolean accountVisibilityRestriction = setAccountVisibilityRestriction(account4, strArrCreateStringArray);
                    parcel2.writeNoException();
                    parcel2.writeInt(accountVisibilityRestriction ? 1 : 0);
                    return true;
                case 42:
                    Account account5 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] accountVisibilityRestriction2 = getAccountVisibilityRestriction(account5);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(accountVisibilityRestriction2);
                    return true;
                case 43:
                    setFreUnlocked();
                    parcel2.writeNoException();
                    return true;
                case 44:
                    clearFre();
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    AccountNameCheckResponse checkAccountName(AccountNameCheckRequest accountNameCheckRequest);

    CheckFactoryResetPolicyComplianceResponse checkFrpCompliance(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest);

    PasswordCheckResponse checkPassword(PasswordCheckRequest passwordCheckRequest);

    CheckRealNameResponse checkRealName(CheckRealNameRequest checkRealNameRequest);

    void clearFactoryResetChallenges();

    @Deprecated
    void clearFre();

    ClearTokenResponse clearToken(ClearTokenRequest clearTokenRequest);

    boolean clearWorkAccountAppWhitelist();

    TokenResponse confirmCredentials(ConfirmCredentialsRequest confirmCredentialsRequest);

    TokenResponse createAccount(GoogleAccountSetupRequest googleAccountSetupRequest);

    TokenResponse createPlusProfile(GoogleAccountSetupRequest googleAccountSetupRequest);

    AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest);

    GoogleAccountData getAccountData(String str);

    Bundle getAccountExportData(String str);

    String getAccountId(String str);

    String[] getAccountVisibilityRestriction(Account account);

    GetAndAdvanceOtpCounterResponse getAndAdvanceOtpCounter(String str);

    DeviceManagementInfoResponse getDeviceManagementInfo(Account account);

    GoogleAccountData getGoogleAccountData(Account account);

    String getGoogleAccountId(Account account);

    GplusInfoResponse getGplusInfo(GplusInfoRequest gplusInfoRequest);

    OtpResponse getOtp(OtpRequest otpRequest);

    TokenResponse getToken(TokenRequest tokenRequest);

    String getTokenHandle(String str);

    WebSetupConfig getWebSetupConfig(WebSetupConfigRequest webSetupConfigRequest);

    boolean installAccountFromExportData(String str, Bundle bundle);

    boolean isTokenHandleValid(String str);

    AccountRemovalResponse removeAccount(AccountRemovalRequest accountRemovalRequest);

    boolean setAccountVisibilityRestriction(Account account, String[] strArr);

    @Deprecated
    void setFreUnlocked();

    boolean setWorkAccountAppWhitelistFingerprint(String str, String str2);

    TokenResponse signIn(AccountSignInRequest accountSignInRequest);

    TokenResponse updateCredentials(UpdateCredentialsRequest updateCredentialsRequest);

    ValidateAccountCredentialsResponse validateAccountCredentials(AccountCredentials accountCredentials);
}
