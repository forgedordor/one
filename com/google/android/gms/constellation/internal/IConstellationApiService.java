package com.google.android.gms.constellation.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.GetPnvCapabilitiesRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.internal.IConstellationCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IConstellationApiService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IConstellationApiService {
        static final int TRANSACTION_getIidToken = 4;
        static final int TRANSACTION_getPnvCapabilities = 5;
        static final int TRANSACTION_verifyPhoneNumber = 3;
        static final int TRANSACTION_verifyPhoneNumberSingleUse = 2;
        static final int TRANSACTION_verifyPhoneNumberV1 = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IConstellationApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.constellation.internal.IConstellationApiService");
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void getIidToken(IConstellationCallbacks iConstellationCallbacks, GetIidTokenRequest getIidTokenRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iConstellationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getIidTokenRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void getPnvCapabilities(IConstellationCallbacks iConstellationCallbacks, GetPnvCapabilitiesRequest getPnvCapabilitiesRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iConstellationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getPnvCapabilitiesRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void verifyPhoneNumber(IConstellationCallbacks iConstellationCallbacks, VerifyPhoneNumberRequest verifyPhoneNumberRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iConstellationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, verifyPhoneNumberRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void verifyPhoneNumberSingleUse(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iConstellationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void verifyPhoneNumberV1(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iConstellationCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.constellation.internal.IConstellationApiService");
        }

        public static IConstellationApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationApiService");
            return iInterfaceQueryLocalInterface instanceof IConstellationApiService ? (IConstellationApiService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IConstellationCallbacks iConstellationCallbacksAsInterface = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyPhoneNumberV1(iConstellationCallbacksAsInterface, bundle, apiMetadata);
            } else if (i == 2) {
                IConstellationCallbacks iConstellationCallbacksAsInterface2 = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyPhoneNumberSingleUse(iConstellationCallbacksAsInterface2, bundle2, apiMetadata2);
            } else if (i == 3) {
                IConstellationCallbacks iConstellationCallbacksAsInterface3 = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                VerifyPhoneNumberRequest verifyPhoneNumberRequest = (VerifyPhoneNumberRequest) sgh.a(parcel, VerifyPhoneNumberRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyPhoneNumber(iConstellationCallbacksAsInterface3, verifyPhoneNumberRequest, apiMetadata3);
            } else if (i == 4) {
                IConstellationCallbacks iConstellationCallbacksAsInterface4 = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                GetIidTokenRequest getIidTokenRequest = (GetIidTokenRequest) sgh.a(parcel, GetIidTokenRequest.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getIidToken(iConstellationCallbacksAsInterface4, getIidTokenRequest, apiMetadata4);
            } else {
                if (i != 5) {
                    return false;
                }
                IConstellationCallbacks iConstellationCallbacksAsInterface5 = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                GetPnvCapabilitiesRequest getPnvCapabilitiesRequest = (GetPnvCapabilitiesRequest) sgh.a(parcel, GetPnvCapabilitiesRequest.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getPnvCapabilities(iConstellationCallbacksAsInterface5, getPnvCapabilitiesRequest, apiMetadata5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getIidToken(IConstellationCallbacks iConstellationCallbacks, GetIidTokenRequest getIidTokenRequest, ApiMetadata apiMetadata);

    void getPnvCapabilities(IConstellationCallbacks iConstellationCallbacks, GetPnvCapabilitiesRequest getPnvCapabilitiesRequest, ApiMetadata apiMetadata);

    void verifyPhoneNumber(IConstellationCallbacks iConstellationCallbacks, VerifyPhoneNumberRequest verifyPhoneNumberRequest, ApiMetadata apiMetadata);

    void verifyPhoneNumberSingleUse(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata);

    void verifyPhoneNumberV1(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata);
}
