package com.google.android.gms.fido.fido2.internal.privileged;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.IBooleanCallback;
import com.google.android.gms.fido.fido2.api.ICredentialListCallback;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFido2PrivilegedService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFido2PrivilegedService {
        static final int TRANSACTION_getCredentialList = 4;
        static final int TRANSACTION_getHybridSignPendingIntent = 5;
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailable = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFido2PrivilegedService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getCredentialList(ICredentialListCallback iCredentialListCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCredentialListCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getHybridSignPendingIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2PrivilegedCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getRegisterIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2PrivilegedCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialCreationOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void getSignIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2PrivilegedCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, browserPublicKeyCredentialRequestOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService
            public void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        }

        public static IFido2PrivilegedService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
            return iInterfaceQueryLocalInterface instanceof IFido2PrivilegedService ? (IFido2PrivilegedService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IFido2PrivilegedCallbacks iFido2PrivilegedCallbacksAsInterface = IFido2PrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) sgh.a(parcel, BrowserPublicKeyCredentialCreationOptions.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(iFido2PrivilegedCallbacksAsInterface, browserPublicKeyCredentialCreationOptions, apiMetadata);
            } else if (i == 2) {
                IFido2PrivilegedCallbacks iFido2PrivilegedCallbacksAsInterface2 = IFido2PrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) sgh.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSignIntent(iFido2PrivilegedCallbacksAsInterface2, browserPublicKeyCredentialRequestOptions, apiMetadata2);
            } else if (i == 3) {
                IBooleanCallback iBooleanCallbackAsInterface = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                isUserVerifyingPlatformAuthenticatorAvailable(iBooleanCallbackAsInterface, apiMetadata3);
            } else if (i == 4) {
                ICredentialListCallback iCredentialListCallbackAsInterface = ICredentialListCallback.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getCredentialList(iCredentialListCallbackAsInterface, string, apiMetadata4);
            } else {
                if (i != 5) {
                    return false;
                }
                IFido2PrivilegedCallbacks iFido2PrivilegedCallbacksAsInterface3 = IFido2PrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions2 = (BrowserPublicKeyCredentialRequestOptions) sgh.a(parcel, BrowserPublicKeyCredentialRequestOptions.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getHybridSignPendingIntent(iFido2PrivilegedCallbacksAsInterface3, browserPublicKeyCredentialRequestOptions2, apiMetadata5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getCredentialList(ICredentialListCallback iCredentialListCallback, String str, ApiMetadata apiMetadata);

    void getHybridSignPendingIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, ApiMetadata apiMetadata);

    void getRegisterIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions, ApiMetadata apiMetadata);

    void getSignIntent(IFido2PrivilegedCallbacks iFido2PrivilegedCallbacks, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions, ApiMetadata apiMetadata);

    void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback, ApiMetadata apiMetadata);
}
