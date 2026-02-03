package com.google.android.gms.carrierauth.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EapInfoRequest;
import com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICarrierAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICarrierAuthService {
        static final int TRANSACTION_getEapInfo = 2;
        static final int TRANSACTION_performEAPAKA = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICarrierAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.carrierauth.internal.ICarrierAuthService");
            }

            @Override // com.google.android.gms.carrierauth.internal.ICarrierAuthService
            public void getEapInfo(ICarrierAuthCallbacks iCarrierAuthCallbacks, EapInfoRequest eapInfoRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCarrierAuthCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, eapInfoRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.carrierauth.internal.ICarrierAuthService
            public void performEAPAKA(ICarrierAuthCallbacks iCarrierAuthCallbacks, EAPAKARequest eAPAKARequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCarrierAuthCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, eAPAKARequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.carrierauth.internal.ICarrierAuthService");
        }

        public static ICarrierAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carrierauth.internal.ICarrierAuthService");
            return iInterfaceQueryLocalInterface instanceof ICarrierAuthService ? (ICarrierAuthService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ICarrierAuthCallbacks iCarrierAuthCallbacksAsInterface = ICarrierAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                EAPAKARequest eAPAKARequest = (EAPAKARequest) sgh.a(parcel, EAPAKARequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                performEAPAKA(iCarrierAuthCallbacksAsInterface, eAPAKARequest, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                ICarrierAuthCallbacks iCarrierAuthCallbacksAsInterface2 = ICarrierAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                EapInfoRequest eapInfoRequest = (EapInfoRequest) sgh.a(parcel, EapInfoRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getEapInfo(iCarrierAuthCallbacksAsInterface2, eapInfoRequest, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getEapInfo(ICarrierAuthCallbacks iCarrierAuthCallbacks, EapInfoRequest eapInfoRequest, ApiMetadata apiMetadata);

    void performEAPAKA(ICarrierAuthCallbacks iCarrierAuthCallbacks, EAPAKARequest eAPAKARequest, ApiMetadata apiMetadata);
}
