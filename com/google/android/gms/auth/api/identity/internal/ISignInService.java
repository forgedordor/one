package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback;
import com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback;
import com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISignInService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignInService {
        static final int TRANSACTION_beginSignIn = 1;
        static final int TRANSACTION_getPhoneNumberHintIntent = 4;
        static final int TRANSACTION_getSignInIntent = 3;
        static final int TRANSACTION_signOut = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignInService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void beginSignIn(IBeginSignInCallback iBeginSignInCallback, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBeginSignInCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, beginSignInRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void getPhoneNumberHintIntent(IGetPhoneNumberHintIntentCallback iGetPhoneNumberHintIntentCallback, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetPhoneNumberHintIntentCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, getPhoneNumberHintIntentRequest);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void getSignInIntent(IGetSignInIntentCallback iGetSignInIntentCallback, GetSignInIntentRequest getSignInIntentRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetSignInIntentCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, getSignInIntentRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void signOut(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ISignInService");
        }

        public static ISignInService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
            return iInterfaceQueryLocalInterface instanceof ISignInService ? (ISignInService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IBeginSignInCallback iBeginSignInCallbackAsInterface = IBeginSignInCallback.Stub.asInterface(parcel.readStrongBinder());
                BeginSignInRequest beginSignInRequest = (BeginSignInRequest) sgh.a(parcel, BeginSignInRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                beginSignIn(iBeginSignInCallbackAsInterface, beginSignInRequest, apiMetadata);
            } else if (i == 2) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                signOut(iStatusCallbackAsInterface, string, apiMetadata2);
            } else if (i == 3) {
                IGetSignInIntentCallback iGetSignInIntentCallbackAsInterface = IGetSignInIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) sgh.a(parcel, GetSignInIntentRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSignInIntent(iGetSignInIntentCallbackAsInterface, getSignInIntentRequest, apiMetadata3);
            } else {
                if (i != 4) {
                    return false;
                }
                IGetPhoneNumberHintIntentCallback iGetPhoneNumberHintIntentCallbackAsInterface = IGetPhoneNumberHintIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = (GetPhoneNumberHintIntentRequest) sgh.a(parcel, GetPhoneNumberHintIntentRequest.CREATOR);
                String string2 = parcel.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getPhoneNumberHintIntent(iGetPhoneNumberHintIntentCallbackAsInterface, getPhoneNumberHintIntentRequest, string2, apiMetadata4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void beginSignIn(IBeginSignInCallback iBeginSignInCallback, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata);

    void getPhoneNumberHintIntent(IGetPhoneNumberHintIntentCallback iGetPhoneNumberHintIntentCallback, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str, ApiMetadata apiMetadata);

    void getSignInIntent(IGetSignInIntentCallback iGetSignInIntentCallback, GetSignInIntentRequest getSignInIntentRequest, ApiMetadata apiMetadata);

    void signOut(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);
}
