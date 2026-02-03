package com.google.android.gms.fido.fido2.internal.regular;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.fido2.api.IBooleanCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFido2AppService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFido2AppService {
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailable = 3;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailableForCredential = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFido2AppService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void getRegisterIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2AppCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void getSignIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iFido2AppCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanCallback);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void isUserVerifyingPlatformAuthenticatorAvailableForCredential(IBooleanCallback iBooleanCallback, String str, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        }

        public static IFido2AppService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            return iInterfaceQueryLocalInterface instanceof IFido2AppService ? (IFido2AppService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IFido2AppCallbacks iFido2AppCallbacksAsInterface = IFido2AppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) sgh.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(iFido2AppCallbacksAsInterface, publicKeyCredentialCreationOptions);
            } else if (i == 2) {
                IFido2AppCallbacks iFido2AppCallbacksAsInterface2 = IFido2AppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) sgh.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                enforceNoDataAvail(parcel);
                getSignIntent(iFido2AppCallbacksAsInterface2, publicKeyCredentialRequestOptions);
            } else if (i == 3) {
                IBooleanCallback iBooleanCallbackAsInterface = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                isUserVerifyingPlatformAuthenticatorAvailable(iBooleanCallbackAsInterface);
            } else {
                if (i != 4) {
                    return false;
                }
                IBooleanCallback iBooleanCallbackAsInterface2 = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                isUserVerifyingPlatformAuthenticatorAvailableForCredential(iBooleanCallbackAsInterface2, string, bArrCreateByteArray);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getRegisterIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions);

    void getSignIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions);

    void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback);

    void isUserVerifyingPlatformAuthenticatorAvailableForCredential(IBooleanCallback iBooleanCallback, String str, byte[] bArr);
}
