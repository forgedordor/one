package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.NlpLocationRequest;
import com.google.android.gms.location.internal.ILocationStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INlpService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INlpService {
        static final int TRANSACTION_getCellBasedLocation = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INlpService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.INlpService");
            }

            @Override // com.google.android.gms.location.internal.INlpService
            public void getCellBasedLocation(NlpLocationRequest nlpLocationRequest, ILocationStatusCallback iLocationStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, nlpLocationRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iLocationStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.INlpService");
        }

        public static INlpService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.INlpService");
            return iInterfaceQueryLocalInterface instanceof INlpService ? (INlpService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            NlpLocationRequest nlpLocationRequest = (NlpLocationRequest) sgh.a(parcel, NlpLocationRequest.CREATOR);
            ILocationStatusCallback iLocationStatusCallbackAsInterface = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            getCellBasedLocation(nlpLocationRequest, iLocationStatusCallbackAsInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void getCellBasedLocation(NlpLocationRequest nlpLocationRequest, ILocationStatusCallback iLocationStatusCallback, ApiMetadata apiMetadata);
}
