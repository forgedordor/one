package com.google.android.gms.fido.fido2.internal.zeroparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.IAuthStatusCallback;
import com.google.android.gms.fido.fido2.api.ICredentialListCallback;
import com.google.android.gms.fido.fido2.api.IResponseHandler;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.HybridRequestData;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFido2ZeroPartyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFido2ZeroPartyService {
        static final int TRANSACTION_authenticatePasskey = 6;
        static final int TRANSACTION_getBrowserHybridClientRegistrationPendingIntent = 10;
        static final int TRANSACTION_getFidoSecurityKeyOnlyRegistrationPendingIntent = 18;
        static final int TRANSACTION_getFidoSecurityKeyOnlySignPendingIntent = 17;
        static final int TRANSACTION_getHybridClientRegistrationPendingIntent = 8;
        static final int TRANSACTION_getHybridClientSignPendingIntent = 9;
        static final int TRANSACTION_getHybridDataTransferPendingIntent = 21;
        static final int TRANSACTION_getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent = 20;
        static final int TRANSACTION_getPrivilegedFidoSecurityKeyOnlySignPendingIntent = 19;
        static final int TRANSACTION_getPrivilegedHybridClientRegistrationPendingIntent = 15;
        static final int TRANSACTION_getPrivilegedHybridClientSignPendingIntent = 16;
        static final int TRANSACTION_headlessHandleStateUpdate = 4;
        static final int TRANSACTION_headlessRegister = 3;
        static final int TRANSACTION_headlessSign = 2;
        static final int TRANSACTION_listDiscoverableCredentials = 5;
        static final int TRANSACTION_privilegedAuthenticatePasskey = 12;
        static final int TRANSACTION_privilegedRegisterPasskeyWithSyncAccount = 13;
        static final int TRANSACTION_registerPasskey = 7;
        static final int TRANSACTION_registerPasskeyWithSyncAccount = 11;
        static final int TRANSACTION_startCableAuthenticator = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFido2ZeroPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void authenticatePasskey(String str, String str2, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getBrowserHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getHybridClientSignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getHybridDataTransferPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, HybridRequestData hybridRequestData, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, hybridRequestData);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedHybridClientRegistrationPendingIntent(BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void getPrivilegedHybridClientSignPendingIntent(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void headlessHandleStateUpdate(String str, IStatusCallback iStatusCallback, StateUpdate stateUpdate, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, stateUpdate);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void headlessRegister(String str, IStatusCallback iStatusCallback, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IResponseHandler iResponseHandler, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iResponseHandler);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void headlessSign(String str, IStatusCallback iStatusCallback, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IResponseHandler iResponseHandler, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iResponseHandler);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void listDiscoverableCredentials(String str, String str2, String str3, ICredentialListCallback iCredentialListCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                sgh.f(parcelObtainAndWriteInterfaceToken, iCredentialListCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void privilegedAuthenticatePasskey(String str, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, boolean z, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void privilegedRegisterPasskeyWithSyncAccount(String str, String str2, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void registerPasskey(String str, String str2, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void registerPasskeyWithSyncAccount(String str, String str2, String str3, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2ZeroPartyCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService
            public void startCableAuthenticator(IStatusCallback iStatusCallback, int i, byte[] bArr, byte[] bArr2, IAuthStatusCallback iAuthStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iAuthStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
        }

        public static IFido2ZeroPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
            return iInterfaceQueryLocalInterface instanceof IFido2ZeroPartyService ? (IFido2ZeroPartyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    int i3 = parcel.readInt();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    IAuthStatusCallback iAuthStatusCallbackAsInterface = IAuthStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    startCableAuthenticator(iStatusCallbackAsInterface, i3, bArrCreateByteArray, bArrCreateByteArray2, iAuthStatusCallbackAsInterface, apiMetadata);
                    break;
                case 2:
                    String string = parcel.readString();
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) sgh.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    IResponseHandler iResponseHandlerAsInterface = IResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    headlessSign(string, iStatusCallbackAsInterface2, publicKeyCredentialRequestOptions, iResponseHandlerAsInterface, apiMetadata2);
                    break;
                case 3:
                    String string2 = parcel.readString();
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) sgh.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    IResponseHandler iResponseHandlerAsInterface2 = IResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    headlessRegister(string2, iStatusCallbackAsInterface3, publicKeyCredentialCreationOptions, iResponseHandlerAsInterface2, apiMetadata3);
                    break;
                case 4:
                    String string3 = parcel.readString();
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    StateUpdate stateUpdate = (StateUpdate) sgh.a(parcel, StateUpdate.CREATOR);
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    headlessHandleStateUpdate(string3, iStatusCallbackAsInterface4, stateUpdate, apiMetadata4);
                    break;
                case 5:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    ICredentialListCallback iCredentialListCallbackAsInterface = ICredentialListCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listDiscoverableCredentials(string4, string5, string6, iCredentialListCallbackAsInterface, apiMetadata5);
                    break;
                case 6:
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = (PublicKeyCredentialRequestOptions) sgh.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    authenticatePasskey(string7, string8, publicKeyCredentialRequestOptions2, iFido2ZeroPartyCallbacksAsInterface, apiMetadata6);
                    break;
                case 7:
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = (PublicKeyCredentialCreationOptions) sgh.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface2 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerPasskey(string9, string10, publicKeyCredentialCreationOptions2, iFido2ZeroPartyCallbacksAsInterface2, apiMetadata7);
                    break;
                case 8:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface3 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions3 = (PublicKeyCredentialCreationOptions) sgh.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    String string11 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getHybridClientRegistrationPendingIntent(iFido2ZeroPartyCallbacksAsInterface3, publicKeyCredentialCreationOptions3, string11, apiMetadata8);
                    break;
                case 9:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface4 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions3 = (PublicKeyCredentialRequestOptions) sgh.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    String string12 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getHybridClientSignPendingIntent(iFido2ZeroPartyCallbacksAsInterface4, publicKeyCredentialRequestOptions3, string12, apiMetadata9);
                    break;
                case 10:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface5 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) sgh.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBrowserHybridClientRegistrationPendingIntent(iFido2ZeroPartyCallbacksAsInterface5, browserPublicKeyCredentialCreationOptions, apiMetadata10);
                    break;
                case 11:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions4 = (PublicKeyCredentialCreationOptions) sgh.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface6 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerPasskeyWithSyncAccount(string13, string14, string15, publicKeyCredentialCreationOptions4, iFido2ZeroPartyCallbacksAsInterface6, apiMetadata11);
                    break;
                case 12:
                    String string16 = parcel.readString();
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) sgh.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    boolean zG = sgh.g(parcel);
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface7 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    privilegedAuthenticatePasskey(string16, browserPublicKeyCredentialRequestOptions, zG, iFido2ZeroPartyCallbacksAsInterface7, apiMetadata12);
                    break;
                case 13:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions2 = (BrowserPublicKeyCredentialCreationOptions) sgh.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface8 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    privilegedRegisterPasskeyWithSyncAccount(string17, string18, browserPublicKeyCredentialCreationOptions2, iFido2ZeroPartyCallbacksAsInterface8, apiMetadata13);
                    break;
                case 14:
                default:
                    return false;
                case 15:
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions3 = (BrowserPublicKeyCredentialCreationOptions) sgh.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface9 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata14 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPrivilegedHybridClientRegistrationPendingIntent(browserPublicKeyCredentialCreationOptions3, iFido2ZeroPartyCallbacksAsInterface9, apiMetadata14);
                    break;
                case 16:
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = (BrowserPublicKeyCredentialRequestOptions) sgh.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface10 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata15 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPrivilegedHybridClientSignPendingIntent(browserPublicKeyCredentialRequestOptions2, iFido2ZeroPartyCallbacksAsInterface10, apiMetadata15);
                    break;
                case 17:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface11 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions4 = (PublicKeyCredentialRequestOptions) sgh.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                    String string19 = parcel.readString();
                    boolean zG2 = sgh.g(parcel);
                    ApiMetadata apiMetadata16 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFidoSecurityKeyOnlySignPendingIntent(iFido2ZeroPartyCallbacksAsInterface11, publicKeyCredentialRequestOptions4, string19, zG2, apiMetadata16);
                    break;
                case 18:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface12 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions5 = (PublicKeyCredentialCreationOptions) sgh.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                    String string20 = parcel.readString();
                    boolean zG3 = sgh.g(parcel);
                    ApiMetadata apiMetadata17 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFidoSecurityKeyOnlyRegistrationPendingIntent(iFido2ZeroPartyCallbacksAsInterface12, publicKeyCredentialCreationOptions5, string20, zG3, apiMetadata17);
                    break;
                case 19:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface13 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions3 = (BrowserPublicKeyCredentialRequestOptions) sgh.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    String string21 = parcel.readString();
                    boolean zG4 = sgh.g(parcel);
                    ApiMetadata apiMetadata18 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPrivilegedFidoSecurityKeyOnlySignPendingIntent(iFido2ZeroPartyCallbacksAsInterface13, browserPublicKeyCredentialRequestOptions3, string21, zG4, apiMetadata18);
                    break;
                case 20:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface14 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions4 = (BrowserPublicKeyCredentialCreationOptions) sgh.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    String string22 = parcel.readString();
                    boolean zG5 = sgh.g(parcel);
                    ApiMetadata apiMetadata19 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent(iFido2ZeroPartyCallbacksAsInterface14, browserPublicKeyCredentialCreationOptions4, string22, zG5, apiMetadata19);
                    break;
                case 21:
                    IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacksAsInterface15 = IFido2ZeroPartyCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    HybridRequestData hybridRequestData = (HybridRequestData) sgh.a(parcel, HybridRequestData.CREATOR);
                    ApiMetadata apiMetadata20 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getHybridDataTransferPendingIntent(iFido2ZeroPartyCallbacksAsInterface15, hybridRequestData, apiMetadata20);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void authenticatePasskey(String str, String str2, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata);

    void getBrowserHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, ApiMetadata apiMetadata);

    void getFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, boolean z, ApiMetadata apiMetadata);

    void getFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, boolean z, ApiMetadata apiMetadata);

    void getHybridClientRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, ApiMetadata apiMetadata);

    void getHybridClientSignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, ApiMetadata apiMetadata);

    void getHybridDataTransferPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, HybridRequestData hybridRequestData, ApiMetadata apiMetadata);

    void getPrivilegedFidoSecurityKeyOnlyRegistrationPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, String str, boolean z, ApiMetadata apiMetadata);

    void getPrivilegedFidoSecurityKeyOnlySignPendingIntent(IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, String str, boolean z, ApiMetadata apiMetadata);

    void getPrivilegedHybridClientRegistrationPendingIntent(BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata);

    void getPrivilegedHybridClientSignPendingIntent(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata);

    void headlessHandleStateUpdate(String str, IStatusCallback iStatusCallback, StateUpdate stateUpdate, ApiMetadata apiMetadata);

    void headlessRegister(String str, IStatusCallback iStatusCallback, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IResponseHandler iResponseHandler, ApiMetadata apiMetadata);

    void headlessSign(String str, IStatusCallback iStatusCallback, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, IResponseHandler iResponseHandler, ApiMetadata apiMetadata);

    void listDiscoverableCredentials(String str, String str2, String str3, ICredentialListCallback iCredentialListCallback, ApiMetadata apiMetadata);

    void privilegedAuthenticatePasskey(String str, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, boolean z, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata);

    void privilegedRegisterPasskeyWithSyncAccount(String str, String str2, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata);

    void registerPasskey(String str, String str2, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata);

    void registerPasskeyWithSyncAccount(String str, String str2, String str3, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, IFido2ZeroPartyCallbacks iFido2ZeroPartyCallbacks, ApiMetadata apiMetadata);

    void startCableAuthenticator(IStatusCallback iStatusCallback, int i, byte[] bArr, byte[] bArr2, IAuthStatusCallback iAuthStatusCallback, ApiMetadata apiMetadata);
}
