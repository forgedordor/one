package com.google.android.gms.auth.api.identity.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallerVerificationRequest;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.internal.IAggregateOneTapZuulOptOutStateCallback;
import com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchAccountsWithZuulKeyRetrievalIntentsCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchVerifiedPhoneNumbersForAccountCallback;
import com.google.android.gms.auth.api.identity.internal.IGenerateCallerVerificationTokenCallback;
import com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback;
import com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback;
import com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback;
import com.google.android.gms.auth.api.identity.internal.IHasDisplayedWarmWelcomeCallback;
import com.google.android.gms.auth.api.identity.internal.IIsAutoSelectEnabledForAppCallback;
import com.google.android.gms.auth.api.identity.internal.IIsOptedInForAutoSelectCallback;
import com.google.android.gms.auth.api.identity.internal.IListPasskeyCredentialsCallback;
import com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback;
import com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback;
import com.google.android.gms.auth.api.identity.internal.ISortAccountsByLastUsedForCreatePasswordPasskeyCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IIdentityGisInternalService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIdentityGisInternalService {
        static final int TRANSACTION_aggregateOneTapZuulOptOutState = 25;
        static final int TRANSACTION_completeSaveAccountLinkingToken = 10;
        static final int TRANSACTION_completeSignIn = 2;
        static final int TRANSACTION_depositIdToken = 13;
        static final int TRANSACTION_fetchAccountLinkingConsentPageUrl = 17;
        static final int TRANSACTION_fetchAccountsWithZuulKeyRetrievalIntents = 23;
        static final int TRANSACTION_fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap = 24;
        static final int TRANSACTION_fetchChromeOptions = 33;
        static final int TRANSACTION_fetchGoogleIdTokenCredential = 27;
        static final int TRANSACTION_fetchVerifiedPhoneNumbersForAccount = 21;
        static final int TRANSACTION_generateCallerVerificationToken = 34;
        static final int TRANSACTION_getCachedSaveAccountLinkingTokenRequest = 11;
        static final int TRANSACTION_getDefaultAccount = 9;
        static final int TRANSACTION_getPasswordAndPasskey = 29;
        static final int TRANSACTION_hasDisplayedWarmWelcome = 19;
        static final int TRANSACTION_isAutoSelectEnabledForApp = 14;
        static final int TRANSACTION_isOptedInForAutoSelect = 12;
        static final int TRANSACTION_listPasskeyCredentials = 28;
        static final int TRANSACTION_listSignInCredentials = 1;
        static final int TRANSACTION_matchPassword = 7;
        static final int TRANSACTION_recordCancelledSignIn = 5;
        static final int TRANSACTION_recordCreatePasswordPasskey = 31;
        static final int TRANSACTION_recordGrants = 3;
        static final int TRANSACTION_resetSignInCancellationCounter = 6;
        static final int TRANSACTION_resetWarmWelcomeDisplayed = 20;
        static final int TRANSACTION_savePassword = 8;
        static final int TRANSACTION_setAutoSelectEnabledForApp = 15;
        static final int TRANSACTION_setNeverSaveForApp = 16;
        static final int TRANSACTION_setWarmWelcomeDisplayed = 18;
        static final int TRANSACTION_sortAccountsByLastUsedForCreatePasswordPasskey = 32;
        static final int TRANSACTION_updateDefaultAccount = 4;
        static final int TRANSACTION_updateOneTapZuulOptOutState = 26;
        static final int TRANSACTION_updatePasswordLastUsedTime = 30;
        static final int TRANSACTION_verifyCallerToken = 35;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIdentityGisInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void aggregateOneTapZuulOptOutState(IAggregateOneTapZuulOptOutStateCallback iAggregateOneTapZuulOptOutStateCallback, List<Account> list, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAggregateOneTapZuulOptOutStateCallback);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void completeSaveAccountLinkingToken(IStatusCallback iStatusCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, String str2, Account account, String str3, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void completeSignIn(ICompleteSignInCallback iCompleteSignInCallback, String str, String str2, String str3, String str4, InternalSignInCredentialWrapper internalSignInCredentialWrapper, String str5, String str6, int i, ApiMetadata apiMetadata, String str7) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCompleteSignInCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                sgh.d(parcelObtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str5);
                parcelObtainAndWriteInterfaceToken.writeString(str6);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                parcelObtainAndWriteInterfaceToken.writeString(str7);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void depositIdToken(IStatusCallback iStatusCallback, Account account, List<Scope> list, String str, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, beginSignInRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountLinkingConsentPageUrl(IFetchAccountLinkingConsentPageUrlCallback iFetchAccountLinkingConsentPageUrlCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFetchAccountLinkingConsentPageUrlCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountsWithZuulKeyRetrievalIntents(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFetchAccountsWithZuulKeyRetrievalIntentsCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFetchAccountsWithZuulKeyRetrievalIntentsCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchChromeOptions(IFetchChromeOptionsCallback iFetchChromeOptionsCallback, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFetchChromeOptionsCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(33, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchGoogleIdTokenCredential(IFetchGoogleIdTokenCredentialCallback iFetchGoogleIdTokenCredentialCallback, Account account, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFetchGoogleIdTokenCredentialCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchVerifiedPhoneNumbersForAccount(IFetchVerifiedPhoneNumbersForAccountCallback iFetchVerifiedPhoneNumbersForAccountCallback, Account account, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFetchVerifiedPhoneNumbersForAccountCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void generateCallerVerificationToken(IGenerateCallerVerificationTokenCallback iGenerateCallerVerificationTokenCallback, CallerVerificationRequest callerVerificationRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGenerateCallerVerificationTokenCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, callerVerificationRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(34, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getCachedSaveAccountLinkingTokenRequest(IGetCachedSaveAccountLinkingTokenRequestCallback iGetCachedSaveAccountLinkingTokenRequestCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetCachedSaveAccountLinkingTokenRequestCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getDefaultAccount(IGetDefaultAccountCallback iGetDefaultAccountCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetDefaultAccountCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getPasswordAndPasskey(IGetPasswordAndPasskeyCallback iGetPasswordAndPasskeyCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetPasswordAndPasskeyCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void hasDisplayedWarmWelcome(IHasDisplayedWarmWelcomeCallback iHasDisplayedWarmWelcomeCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iHasDisplayedWarmWelcomeCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void isAutoSelectEnabledForApp(IIsAutoSelectEnabledForAppCallback iIsAutoSelectEnabledForAppCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iIsAutoSelectEnabledForAppCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void isOptedInForAutoSelect(IIsOptedInForAutoSelectCallback iIsOptedInForAutoSelectCallback, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iIsOptedInForAutoSelectCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void listPasskeyCredentials(IListPasskeyCredentialsCallback iListPasskeyCredentialsCallback, String str, String str2, String str3, List<PublicKeyCredentialDescriptor> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iListPasskeyCredentialsCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(28, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void listSignInCredentials(IListSignInCredentialsCallback iListSignInCredentialsCallback, String str, BeginSignInRequest beginSignInRequest, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iListSignInCredentialsCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, beginSignInRequest);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void matchPassword(IMatchPasswordCallback iMatchPasswordCallback, SavePasswordRequest savePasswordRequest, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMatchPasswordCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, savePasswordRequest);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordCancelledSignIn(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordCreatePasswordPasskey(IStatusCallback iStatusCallback, Account account, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordGrants(IStatusCallback iStatusCallback, String str, String str2, Account account, int i, ApiMetadata apiMetadata, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void resetSignInCancellationCounter(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void resetWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void savePassword(IStatusCallback iStatusCallback, SavePasswordRequest savePasswordRequest, List<Account> list, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, savePasswordRequest);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setAutoSelectEnabledForApp(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setNeverSaveForApp(IStatusCallback iStatusCallback, Account account, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void sortAccountsByLastUsedForCreatePasswordPasskey(ISortAccountsByLastUsedForCreatePasswordPasskeyCallback iSortAccountsByLastUsedForCreatePasswordPasskeyCallback, List<Account> list, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSortAccountsByLastUsedForCreatePasswordPasskeyCallback);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(32, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updateDefaultAccount(IStatusCallback iStatusCallback, String str, String str2, Account account, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updateOneTapZuulOptOutState(IStatusCallback iStatusCallback, List<Account> list, int i, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updatePasswordLastUsedTime(IStatusCallback iStatusCallback, InternalSignInCredentialWrapper internalSignInCredentialWrapper, CallingAppInfoCompat callingAppInfoCompat, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, callingAppInfoCompat);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(30, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void verifyCallerToken(IStatusCallback iStatusCallback, CallerVerificationRequest callerVerificationRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, callerVerificationRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(35, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
        }

        public static IIdentityGisInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
            return iInterfaceQueryLocalInterface instanceof IIdentityGisInternalService ? (IIdentityGisInternalService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IListSignInCredentialsCallback iListSignInCredentialsCallbackAsInterface = IListSignInCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    BeginSignInRequest beginSignInRequest = (BeginSignInRequest) sgh.a(parcel, BeginSignInRequest.CREATOR);
                    boolean zG = sgh.g(parcel);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listSignInCredentials(iListSignInCredentialsCallbackAsInterface, string, beginSignInRequest, zG, apiMetadata);
                    break;
                case 2:
                    ICompleteSignInCallback iCompleteSignInCallbackAsInterface = ICompleteSignInCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) sgh.a(parcel, InternalSignInCredentialWrapper.CREATOR);
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    int i3 = parcel.readInt();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    String string8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    completeSignIn(iCompleteSignInCallbackAsInterface, string2, string3, string4, string5, internalSignInCredentialWrapper, string6, string7, i3, apiMetadata2, string8);
                    break;
                case 3:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    int i4 = parcel.readInt();
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    String string11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    recordGrants(iStatusCallbackAsInterface, string9, string10, account, i4, apiMetadata3, string11);
                    break;
                case 4:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateDefaultAccount(iStatusCallbackAsInterface2, string12, string13, account2, apiMetadata4);
                    break;
                case 5:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordCancelledSignIn(iStatusCallbackAsInterface3, string14, string15, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string16 = parcel.readString();
                    String string17 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetSignInCancellationCounter(iStatusCallbackAsInterface4, string16, string17, apiMetadata6);
                    break;
                case 7:
                    IMatchPasswordCallback iMatchPasswordCallbackAsInterface = IMatchPasswordCallback.Stub.asInterface(parcel.readStrongBinder());
                    SavePasswordRequest savePasswordRequest = (SavePasswordRequest) sgh.a(parcel, SavePasswordRequest.CREATOR);
                    String string18 = parcel.readString();
                    String string19 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    matchPassword(iMatchPasswordCallbackAsInterface, savePasswordRequest, string18, string19, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    SavePasswordRequest savePasswordRequest2 = (SavePasswordRequest) sgh.a(parcel, SavePasswordRequest.CREATOR);
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                    String string20 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    savePassword(iStatusCallbackAsInterface5, savePasswordRequest2, arrayListCreateTypedArrayList, string20, apiMetadata8);
                    break;
                case 9:
                    IGetDefaultAccountCallback iGetDefaultAccountCallbackAsInterface = IGetDefaultAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string21 = parcel.readString();
                    String string22 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDefaultAccount(iGetDefaultAccountCallbackAsInterface, string21, string22, apiMetadata9);
                    break;
                case 10:
                    IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) sgh.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                    String string23 = parcel.readString();
                    String string24 = parcel.readString();
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string25 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    completeSaveAccountLinkingToken(iStatusCallbackAsInterface6, saveAccountLinkingTokenRequest, string23, string24, account3, string25, apiMetadata10);
                    break;
                case 11:
                    IGetCachedSaveAccountLinkingTokenRequestCallback iGetCachedSaveAccountLinkingTokenRequestCallbackAsInterface = IGetCachedSaveAccountLinkingTokenRequestCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string26 = parcel.readString();
                    String string27 = parcel.readString();
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCachedSaveAccountLinkingTokenRequest(iGetCachedSaveAccountLinkingTokenRequestCallbackAsInterface, string26, string27, apiMetadata11);
                    break;
                case 12:
                    IIsOptedInForAutoSelectCallback iIsOptedInForAutoSelectCallbackAsInterface = IIsOptedInForAutoSelectCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string28 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    isOptedInForAutoSelect(iIsOptedInForAutoSelectCallbackAsInterface, account4, string28, apiMetadata12);
                    break;
                case 13:
                    IStatusCallback iStatusCallbackAsInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) sgh.a(parcel, Account.CREATOR);
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Scope.CREATOR);
                    String string29 = parcel.readString();
                    BeginSignInRequest beginSignInRequest2 = (BeginSignInRequest) sgh.a(parcel, BeginSignInRequest.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    depositIdToken(iStatusCallbackAsInterface7, account5, arrayListCreateTypedArrayList2, string29, beginSignInRequest2, apiMetadata13);
                    break;
                case 14:
                    IIsAutoSelectEnabledForAppCallback iIsAutoSelectEnabledForAppCallbackAsInterface = IIsAutoSelectEnabledForAppCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string30 = parcel.readString();
                    String string31 = parcel.readString();
                    ApiMetadata apiMetadata14 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    isAutoSelectEnabledForApp(iIsAutoSelectEnabledForAppCallbackAsInterface, string30, string31, apiMetadata14);
                    break;
                case 15:
                    IStatusCallback iStatusCallbackAsInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string32 = parcel.readString();
                    boolean zG2 = sgh.g(parcel);
                    String string33 = parcel.readString();
                    ApiMetadata apiMetadata15 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setAutoSelectEnabledForApp(iStatusCallbackAsInterface8, string32, zG2, string33, apiMetadata15);
                    break;
                case 16:
                    IStatusCallback iStatusCallbackAsInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string34 = parcel.readString();
                    boolean zG3 = sgh.g(parcel);
                    String string35 = parcel.readString();
                    ApiMetadata apiMetadata16 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setNeverSaveForApp(iStatusCallbackAsInterface9, account6, string34, zG3, string35, apiMetadata16);
                    break;
                case 17:
                    IFetchAccountLinkingConsentPageUrlCallback iFetchAccountLinkingConsentPageUrlCallbackAsInterface = IFetchAccountLinkingConsentPageUrlCallback.Stub.asInterface(parcel.readStrongBinder());
                    SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = (SaveAccountLinkingTokenRequest) sgh.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                    Account account7 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string36 = parcel.readString();
                    ApiMetadata apiMetadata17 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountLinkingConsentPageUrl(iFetchAccountLinkingConsentPageUrlCallbackAsInterface, saveAccountLinkingTokenRequest2, account7, string36, apiMetadata17);
                    break;
                case 18:
                    IStatusCallback iStatusCallbackAsInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string37 = parcel.readString();
                    ApiMetadata apiMetadata18 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setWarmWelcomeDisplayed(iStatusCallbackAsInterface10, string37, apiMetadata18);
                    break;
                case 19:
                    IHasDisplayedWarmWelcomeCallback iHasDisplayedWarmWelcomeCallbackAsInterface = IHasDisplayedWarmWelcomeCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string38 = parcel.readString();
                    ApiMetadata apiMetadata19 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasDisplayedWarmWelcome(iHasDisplayedWarmWelcomeCallbackAsInterface, string38, apiMetadata19);
                    break;
                case 20:
                    IStatusCallback iStatusCallbackAsInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string39 = parcel.readString();
                    ApiMetadata apiMetadata20 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetWarmWelcomeDisplayed(iStatusCallbackAsInterface11, string39, apiMetadata20);
                    break;
                case 21:
                    IFetchVerifiedPhoneNumbersForAccountCallback iFetchVerifiedPhoneNumbersForAccountCallbackAsInterface = IFetchVerifiedPhoneNumbersForAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account8 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string40 = parcel.readString();
                    String string41 = parcel.readString();
                    ApiMetadata apiMetadata21 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchVerifiedPhoneNumbersForAccount(iFetchVerifiedPhoneNumbersForAccountCallbackAsInterface, account8, string40, string41, apiMetadata21);
                    break;
                case 22:
                default:
                    return false;
                case 23:
                    IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallbackAsInterface = IFetchAccountsWithZuulKeyRetrievalIntentsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string42 = parcel.readString();
                    String string43 = parcel.readString();
                    ApiMetadata apiMetadata22 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountsWithZuulKeyRetrievalIntents(iFetchAccountsWithZuulKeyRetrievalIntentsCallbackAsInterface, string42, string43, apiMetadata22);
                    break;
                case 24:
                    IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallbackAsInterface2 = IFetchAccountsWithZuulKeyRetrievalIntentsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string44 = parcel.readString();
                    String string45 = parcel.readString();
                    ApiMetadata apiMetadata23 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(iFetchAccountsWithZuulKeyRetrievalIntentsCallbackAsInterface2, string44, string45, apiMetadata23);
                    break;
                case 25:
                    IAggregateOneTapZuulOptOutStateCallback iAggregateOneTapZuulOptOutStateCallbackAsInterface = IAggregateOneTapZuulOptOutStateCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Account.CREATOR);
                    String string46 = parcel.readString();
                    ApiMetadata apiMetadata24 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    aggregateOneTapZuulOptOutState(iAggregateOneTapZuulOptOutStateCallbackAsInterface, arrayListCreateTypedArrayList3, string46, apiMetadata24);
                    break;
                case 26:
                    IStatusCallback iStatusCallbackAsInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Account.CREATOR);
                    int i5 = parcel.readInt();
                    String string47 = parcel.readString();
                    ApiMetadata apiMetadata25 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateOneTapZuulOptOutState(iStatusCallbackAsInterface12, arrayListCreateTypedArrayList4, i5, string47, apiMetadata25);
                    break;
                case 27:
                    IFetchGoogleIdTokenCredentialCallback iFetchGoogleIdTokenCredentialCallbackAsInterface = IFetchGoogleIdTokenCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account9 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string48 = parcel.readString();
                    String string49 = parcel.readString();
                    int i6 = parcel.readInt();
                    ApiMetadata apiMetadata26 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchGoogleIdTokenCredential(iFetchGoogleIdTokenCredentialCallbackAsInterface, account9, string48, string49, i6, apiMetadata26);
                    break;
                case 28:
                    IListPasskeyCredentialsCallback iListPasskeyCredentialsCallbackAsInterface = IListPasskeyCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string50 = parcel.readString();
                    String string51 = parcel.readString();
                    String string52 = parcel.readString();
                    ArrayList arrayListB = sgh.b(parcel);
                    ApiMetadata apiMetadata27 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listPasskeyCredentials(iListPasskeyCredentialsCallbackAsInterface, string50, string51, string52, arrayListB, apiMetadata27);
                    break;
                case 29:
                    IGetPasswordAndPasskeyCallback iGetPasswordAndPasskeyCallbackAsInterface = IGetPasswordAndPasskeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    String string53 = parcel.readString();
                    ApiMetadata apiMetadata28 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPasswordAndPasskey(iGetPasswordAndPasskeyCallbackAsInterface, bundle, string53, apiMetadata28);
                    break;
                case 30:
                    IStatusCallback iStatusCallbackAsInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = (InternalSignInCredentialWrapper) sgh.a(parcel, InternalSignInCredentialWrapper.CREATOR);
                    CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) sgh.a(parcel, CallingAppInfoCompat.CREATOR);
                    String string54 = parcel.readString();
                    ApiMetadata apiMetadata29 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updatePasswordLastUsedTime(iStatusCallbackAsInterface13, internalSignInCredentialWrapper2, callingAppInfoCompat, string54, apiMetadata29);
                    break;
                case 31:
                    IStatusCallback iStatusCallbackAsInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account10 = (Account) sgh.a(parcel, Account.CREATOR);
                    ApiMetadata apiMetadata30 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordCreatePasswordPasskey(iStatusCallbackAsInterface14, account10, apiMetadata30);
                    break;
                case 32:
                    ISortAccountsByLastUsedForCreatePasswordPasskeyCallback iSortAccountsByLastUsedForCreatePasswordPasskeyCallbackAsInterface = ISortAccountsByLastUsedForCreatePasswordPasskeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList5 = parcel.createTypedArrayList(Account.CREATOR);
                    String string55 = parcel.readString();
                    ApiMetadata apiMetadata31 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    sortAccountsByLastUsedForCreatePasswordPasskey(iSortAccountsByLastUsedForCreatePasswordPasskeyCallbackAsInterface, arrayListCreateTypedArrayList5, string55, apiMetadata31);
                    break;
                case 33:
                    IFetchChromeOptionsCallback iFetchChromeOptionsCallbackAsInterface = IFetchChromeOptionsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata32 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchChromeOptions(iFetchChromeOptionsCallbackAsInterface, bundle2, apiMetadata32);
                    break;
                case 34:
                    IGenerateCallerVerificationTokenCallback iGenerateCallerVerificationTokenCallbackAsInterface = IGenerateCallerVerificationTokenCallback.Stub.asInterface(parcel.readStrongBinder());
                    CallerVerificationRequest callerVerificationRequest = (CallerVerificationRequest) sgh.a(parcel, CallerVerificationRequest.CREATOR);
                    ApiMetadata apiMetadata33 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    generateCallerVerificationToken(iGenerateCallerVerificationTokenCallbackAsInterface, callerVerificationRequest, apiMetadata33);
                    break;
                case 35:
                    IStatusCallback iStatusCallbackAsInterface15 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    CallerVerificationRequest callerVerificationRequest2 = (CallerVerificationRequest) sgh.a(parcel, CallerVerificationRequest.CREATOR);
                    ApiMetadata apiMetadata34 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    verifyCallerToken(iStatusCallbackAsInterface15, callerVerificationRequest2, apiMetadata34);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void aggregateOneTapZuulOptOutState(IAggregateOneTapZuulOptOutStateCallback iAggregateOneTapZuulOptOutStateCallback, List<Account> list, String str, ApiMetadata apiMetadata);

    void completeSaveAccountLinkingToken(IStatusCallback iStatusCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, String str2, Account account, String str3, ApiMetadata apiMetadata);

    void completeSignIn(ICompleteSignInCallback iCompleteSignInCallback, String str, String str2, String str3, String str4, InternalSignInCredentialWrapper internalSignInCredentialWrapper, String str5, String str6, int i, ApiMetadata apiMetadata, String str7);

    void depositIdToken(IStatusCallback iStatusCallback, Account account, List<Scope> list, String str, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata);

    void fetchAccountLinkingConsentPageUrl(IFetchAccountLinkingConsentPageUrlCallback iFetchAccountLinkingConsentPageUrlCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, Account account, String str, ApiMetadata apiMetadata);

    void fetchAccountsWithZuulKeyRetrievalIntents(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata);

    void fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata);

    void fetchChromeOptions(IFetchChromeOptionsCallback iFetchChromeOptionsCallback, Bundle bundle, ApiMetadata apiMetadata);

    void fetchGoogleIdTokenCredential(IFetchGoogleIdTokenCredentialCallback iFetchGoogleIdTokenCredentialCallback, Account account, String str, String str2, int i, ApiMetadata apiMetadata);

    void fetchVerifiedPhoneNumbersForAccount(IFetchVerifiedPhoneNumbersForAccountCallback iFetchVerifiedPhoneNumbersForAccountCallback, Account account, String str, String str2, ApiMetadata apiMetadata);

    void generateCallerVerificationToken(IGenerateCallerVerificationTokenCallback iGenerateCallerVerificationTokenCallback, CallerVerificationRequest callerVerificationRequest, ApiMetadata apiMetadata);

    void getCachedSaveAccountLinkingTokenRequest(IGetCachedSaveAccountLinkingTokenRequestCallback iGetCachedSaveAccountLinkingTokenRequestCallback, String str, String str2, ApiMetadata apiMetadata);

    void getDefaultAccount(IGetDefaultAccountCallback iGetDefaultAccountCallback, String str, String str2, ApiMetadata apiMetadata);

    void getPasswordAndPasskey(IGetPasswordAndPasskeyCallback iGetPasswordAndPasskeyCallback, Bundle bundle, String str, ApiMetadata apiMetadata);

    void hasDisplayedWarmWelcome(IHasDisplayedWarmWelcomeCallback iHasDisplayedWarmWelcomeCallback, String str, ApiMetadata apiMetadata);

    void isAutoSelectEnabledForApp(IIsAutoSelectEnabledForAppCallback iIsAutoSelectEnabledForAppCallback, String str, String str2, ApiMetadata apiMetadata);

    void isOptedInForAutoSelect(IIsOptedInForAutoSelectCallback iIsOptedInForAutoSelectCallback, Account account, String str, ApiMetadata apiMetadata);

    void listPasskeyCredentials(IListPasskeyCredentialsCallback iListPasskeyCredentialsCallback, String str, String str2, String str3, List<PublicKeyCredentialDescriptor> list, ApiMetadata apiMetadata);

    void listSignInCredentials(IListSignInCredentialsCallback iListSignInCredentialsCallback, String str, BeginSignInRequest beginSignInRequest, boolean z, ApiMetadata apiMetadata);

    void matchPassword(IMatchPasswordCallback iMatchPasswordCallback, SavePasswordRequest savePasswordRequest, String str, String str2, ApiMetadata apiMetadata);

    void recordCancelledSignIn(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata);

    void recordCreatePasswordPasskey(IStatusCallback iStatusCallback, Account account, ApiMetadata apiMetadata);

    void recordGrants(IStatusCallback iStatusCallback, String str, String str2, Account account, int i, ApiMetadata apiMetadata, String str3);

    void resetSignInCancellationCounter(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata);

    void resetWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void savePassword(IStatusCallback iStatusCallback, SavePasswordRequest savePasswordRequest, List<Account> list, String str, ApiMetadata apiMetadata);

    void setAutoSelectEnabledForApp(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setNeverSaveForApp(IStatusCallback iStatusCallback, Account account, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void sortAccountsByLastUsedForCreatePasswordPasskey(ISortAccountsByLastUsedForCreatePasswordPasskeyCallback iSortAccountsByLastUsedForCreatePasswordPasskeyCallback, List<Account> list, String str, ApiMetadata apiMetadata);

    void updateDefaultAccount(IStatusCallback iStatusCallback, String str, String str2, Account account, ApiMetadata apiMetadata);

    void updateOneTapZuulOptOutState(IStatusCallback iStatusCallback, List<Account> list, int i, String str, ApiMetadata apiMetadata);

    void updatePasswordLastUsedTime(IStatusCallback iStatusCallback, InternalSignInCredentialWrapper internalSignInCredentialWrapper, CallingAppInfoCompat callingAppInfoCompat, String str, ApiMetadata apiMetadata);

    void verifyCallerToken(IStatusCallback iStatusCallback, CallerVerificationRequest callerVerificationRequest, ApiMetadata apiMetadata);
}
