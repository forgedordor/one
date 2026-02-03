package com.google.android.gms.search.nativeapi.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Request;
import com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INativeApiService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INativeApiService {
        static final int TRANSACTION_getNativeApiInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INativeApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.nativeapi.internal.INativeApiService");
            }

            @Override // com.google.android.gms.search.nativeapi.internal.INativeApiService
            public void getNativeApiInfo(GetNativeApiInfoCall$Request getNativeApiInfoCall$Request, INativeApiCallbacks iNativeApiCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getNativeApiInfoCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iNativeApiCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.nativeapi.internal.INativeApiService");
        }

        public static INativeApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiService");
            return iInterfaceQueryLocalInterface instanceof INativeApiService ? (INativeApiService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            GetNativeApiInfoCall$Request getNativeApiInfoCall$Request = (GetNativeApiInfoCall$Request) sgh.a(parcel, GetNativeApiInfoCall$Request.CREATOR);
            INativeApiCallbacks iNativeApiCallbacksAsInterface = INativeApiCallbacks.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            getNativeApiInfo(getNativeApiInfoCall$Request, iNativeApiCallbacksAsInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void getNativeApiInfo(GetNativeApiInfoCall$Request getNativeApiInfoCall$Request, INativeApiCallbacks iNativeApiCallbacks, ApiMetadata apiMetadata);
}
