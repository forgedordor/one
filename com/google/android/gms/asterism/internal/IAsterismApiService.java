package com.google.android.gms.asterism.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.internal.IAsterismCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAsterismApiService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAsterismApiService {
        static final int TRANSACTION_getAsterismConsent = 1;
        static final int TRANSACTION_setAsterismConsent = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAsterismApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.asterism.internal.IAsterismApiService");
            }

            @Override // com.google.android.gms.asterism.internal.IAsterismApiService
            public void getAsterismConsent(IAsterismCallbacks iAsterismCallbacks, GetAsterismConsentRequest getAsterismConsentRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAsterismCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getAsterismConsentRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.asterism.internal.IAsterismApiService
            public void setAsterismConsent(IAsterismCallbacks iAsterismCallbacks, SetAsterismConsentRequest setAsterismConsentRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAsterismCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, setAsterismConsentRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.asterism.internal.IAsterismApiService");
        }

        public static IAsterismApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismApiService");
            return iInterfaceQueryLocalInterface instanceof IAsterismApiService ? (IAsterismApiService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IAsterismCallbacks iAsterismCallbacksAsInterface = IAsterismCallbacks.Stub.asInterface(parcel.readStrongBinder());
                GetAsterismConsentRequest getAsterismConsentRequest = (GetAsterismConsentRequest) sgh.a(parcel, GetAsterismConsentRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getAsterismConsent(iAsterismCallbacksAsInterface, getAsterismConsentRequest, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                IAsterismCallbacks iAsterismCallbacksAsInterface2 = IAsterismCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SetAsterismConsentRequest setAsterismConsentRequest = (SetAsterismConsentRequest) sgh.a(parcel, SetAsterismConsentRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setAsterismConsent(iAsterismCallbacksAsInterface2, setAsterismConsentRequest, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getAsterismConsent(IAsterismCallbacks iAsterismCallbacks, GetAsterismConsentRequest getAsterismConsentRequest, ApiMetadata apiMetadata);

    void setAsterismConsent(IAsterismCallbacks iAsterismCallbacks, SetAsterismConsentRequest setAsterismConsentRequest, ApiMetadata apiMetadata);
}
