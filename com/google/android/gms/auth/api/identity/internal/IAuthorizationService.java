package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleRequest;
import com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback;
import com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthorizationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthorizationService {
        static final int TRANSACTION_authorize = 1;
        static final int TRANSACTION_clearToken = 4;
        static final int TRANSACTION_revokeAccess = 3;
        static final int TRANSACTION_verifyWithGoogle = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthorizationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void authorize(IAuthorizationCallback iAuthorizationCallback, AuthorizationRequest authorizationRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAuthorizationCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, authorizationRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void clearToken(IStatusCallback iStatusCallback, ClearTokenRequest clearTokenRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, clearTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void revokeAccess(IStatusCallback iStatusCallback, RevokeAccessRequest revokeAccessRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, revokeAccessRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void verifyWithGoogle(IVerifyWithGoogleCallback iVerifyWithGoogleCallback, VerifyWithGoogleRequest verifyWithGoogleRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iVerifyWithGoogleCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, verifyWithGoogleRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        }

        public static IAuthorizationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            return iInterfaceQueryLocalInterface instanceof IAuthorizationService ? (IAuthorizationService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IAuthorizationCallback iAuthorizationCallbackAsInterface = IAuthorizationCallback.Stub.asInterface(parcel.readStrongBinder());
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) sgh.a(parcel, AuthorizationRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                authorize(iAuthorizationCallbackAsInterface, authorizationRequest, apiMetadata);
            } else if (i == 2) {
                IVerifyWithGoogleCallback iVerifyWithGoogleCallbackAsInterface = IVerifyWithGoogleCallback.Stub.asInterface(parcel.readStrongBinder());
                VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) sgh.a(parcel, VerifyWithGoogleRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyWithGoogle(iVerifyWithGoogleCallbackAsInterface, verifyWithGoogleRequest, apiMetadata2);
            } else if (i == 3) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) sgh.a(parcel, RevokeAccessRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                revokeAccess(iStatusCallbackAsInterface, revokeAccessRequest, apiMetadata3);
            } else {
                if (i != 4) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                ClearTokenRequest clearTokenRequest = (ClearTokenRequest) sgh.a(parcel, ClearTokenRequest.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                clearToken(iStatusCallbackAsInterface2, clearTokenRequest, apiMetadata4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void authorize(IAuthorizationCallback iAuthorizationCallback, AuthorizationRequest authorizationRequest, ApiMetadata apiMetadata);

    void clearToken(IStatusCallback iStatusCallback, ClearTokenRequest clearTokenRequest, ApiMetadata apiMetadata);

    void revokeAccess(IStatusCallback iStatusCallback, RevokeAccessRequest revokeAccessRequest, ApiMetadata apiMetadata);

    void verifyWithGoogle(IVerifyWithGoogleCallback iVerifyWithGoogleCallback, VerifyWithGoogleRequest verifyWithGoogleRequest, ApiMetadata apiMetadata);
}
