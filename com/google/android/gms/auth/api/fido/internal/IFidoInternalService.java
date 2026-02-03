package com.google.android.gms.auth.api.fido.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.common.IStatusAndBooleanCallback;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.RegisteredCredentialData;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.auth.api.fido.internal.IIncrementAndGetCounterCallback;
import com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback;
import com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback;
import com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFidoInternalService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFidoInternalService {
        static final int TRANSACTION_deleteRegisteredCredential = 5;
        static final int TRANSACTION_getAuthenticationIntent = 7;
        static final int TRANSACTION_getCredentialListForBrowser = 11;
        static final int TRANSACTION_getCryptauthKeyAndPendingIntentForAuthentication = 10;
        static final int TRANSACTION_getRegistrationIntent = 6;
        static final int TRANSACTION_hasDiscoverableKey = 9;
        static final int TRANSACTION_hasKey = 8;
        static final int TRANSACTION_incrementAndGetCounter = 4;
        static final int TRANSACTION_listRegisteredCredentials = 3;
        static final int TRANSACTION_saveRegisteredCredential = 2;
        static final int TRANSACTION_validateCallingBrowser = 13;
        static final int TRANSACTION_validateRpIdAndCallingPackage = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFidoInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void deleteRegisteredCredential(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getAuthenticationIntent(IPendingIntentCallback iPendingIntentCallback, AuthenticationOptions authenticationOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPendingIntentCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, authenticationOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getCredentialListForBrowser(IListKeysForBrowserCallback iListKeysForBrowserCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iListKeysForBrowserCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getCryptauthKeyAndPendingIntentForAuthentication(IPendingIntentCallback iPendingIntentCallback, String str, Account account, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPendingIntentCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getRegistrationIntent(IPendingIntentCallback iPendingIntentCallback, RegistrationOptions registrationOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPendingIntentCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, registrationOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void hasDiscoverableKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void hasKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, List<PublicKeyCredentialDescriptor> list, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void incrementAndGetCounter(IIncrementAndGetCounterCallback iIncrementAndGetCounterCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iIncrementAndGetCounterCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void listRegisteredCredentials(IListRegisteredCredentialsCallback iListRegisteredCredentialsCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iListRegisteredCredentialsCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void saveRegisteredCredential(IStatusCallback iStatusCallback, RegisteredCredentialData registeredCredentialData, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, registeredCredentialData);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void validateCallingBrowser(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void validateRpIdAndCallingPackage(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
        }

        public static IFidoInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
            return iInterfaceQueryLocalInterface instanceof IFidoInternalService ? (IFidoInternalService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    RegisteredCredentialData registeredCredentialData = (RegisteredCredentialData) sgh.a(parcel, RegisteredCredentialData.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    saveRegisteredCredential(iStatusCallbackAsInterface, registeredCredentialData, apiMetadata);
                    break;
                case 3:
                    IListRegisteredCredentialsCallback iListRegisteredCredentialsCallbackAsInterface = IListRegisteredCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listRegisteredCredentials(iListRegisteredCredentialsCallbackAsInterface, string, apiMetadata2);
                    break;
                case 4:
                    IIncrementAndGetCounterCallback iIncrementAndGetCounterCallbackAsInterface = IIncrementAndGetCounterCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    incrementAndGetCounter(iIncrementAndGetCounterCallbackAsInterface, string2, apiMetadata3);
                    break;
                case 5:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteRegisteredCredential(iStatusCallbackAsInterface2, string3, apiMetadata4);
                    break;
                case 6:
                    IPendingIntentCallback iPendingIntentCallbackAsInterface = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    RegistrationOptions registrationOptions = (RegistrationOptions) sgh.a(parcel, RegistrationOptions.CREATOR);
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getRegistrationIntent(iPendingIntentCallbackAsInterface, registrationOptions, apiMetadata5);
                    break;
                case 7:
                    IPendingIntentCallback iPendingIntentCallbackAsInterface2 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    AuthenticationOptions authenticationOptions = (AuthenticationOptions) sgh.a(parcel, AuthenticationOptions.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAuthenticationIntent(iPendingIntentCallbackAsInterface2, authenticationOptions, apiMetadata6);
                    break;
                case 8:
                    IStatusAndBooleanCallback iStatusAndBooleanCallbackAsInterface = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListB = sgh.b(parcel);
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasKey(iStatusAndBooleanCallbackAsInterface, arrayListB, string4, string5, apiMetadata7);
                    break;
                case 9:
                    IStatusAndBooleanCallback iStatusAndBooleanCallbackAsInterface2 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasDiscoverableKey(iStatusAndBooleanCallbackAsInterface2, string6, string7, apiMetadata8);
                    break;
                case 10:
                    IPendingIntentCallback iPendingIntentCallbackAsInterface3 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string8 = parcel.readString();
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    boolean zG = sgh.g(parcel);
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCryptauthKeyAndPendingIntentForAuthentication(iPendingIntentCallbackAsInterface3, string8, account, zG, apiMetadata9);
                    break;
                case 11:
                    IListKeysForBrowserCallback iListKeysForBrowserCallbackAsInterface = IListKeysForBrowserCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCredentialListForBrowser(iListKeysForBrowserCallbackAsInterface, string9, apiMetadata10);
                    break;
                case 12:
                    IStatusAndBooleanCallback iStatusAndBooleanCallbackAsInterface3 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    validateRpIdAndCallingPackage(iStatusAndBooleanCallbackAsInterface3, string10, string11, apiMetadata11);
                    break;
                case 13:
                    IStatusAndBooleanCallback iStatusAndBooleanCallbackAsInterface4 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string12 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    validateCallingBrowser(iStatusAndBooleanCallbackAsInterface4, string12, apiMetadata12);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteRegisteredCredential(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void getAuthenticationIntent(IPendingIntentCallback iPendingIntentCallback, AuthenticationOptions authenticationOptions, ApiMetadata apiMetadata);

    void getCredentialListForBrowser(IListKeysForBrowserCallback iListKeysForBrowserCallback, String str, ApiMetadata apiMetadata);

    void getCryptauthKeyAndPendingIntentForAuthentication(IPendingIntentCallback iPendingIntentCallback, String str, Account account, boolean z, ApiMetadata apiMetadata);

    void getRegistrationIntent(IPendingIntentCallback iPendingIntentCallback, RegistrationOptions registrationOptions, ApiMetadata apiMetadata);

    void hasDiscoverableKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata);

    void hasKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, List<PublicKeyCredentialDescriptor> list, String str, String str2, ApiMetadata apiMetadata);

    void incrementAndGetCounter(IIncrementAndGetCounterCallback iIncrementAndGetCounterCallback, String str, ApiMetadata apiMetadata);

    void listRegisteredCredentials(IListRegisteredCredentialsCallback iListRegisteredCredentialsCallback, String str, ApiMetadata apiMetadata);

    void saveRegisteredCredential(IStatusCallback iStatusCallback, RegisteredCredentialData registeredCredentialData, ApiMetadata apiMetadata);

    void validateCallingBrowser(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, ApiMetadata apiMetadata);

    void validateRpIdAndCallingPackage(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata);
}
