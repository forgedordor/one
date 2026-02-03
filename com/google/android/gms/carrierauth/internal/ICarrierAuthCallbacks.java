package com.google.android.gms.carrierauth.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.carrierauth.EapInfoResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICarrierAuthCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICarrierAuthCallbacks {
        static final int TRANSACTION_onEAPAKAResponse = 1;
        static final int TRANSACTION_onEapInfoResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICarrierAuthCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
            }

            @Override // com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks
            public void onEAPAKAResponse(Status status, EAPAKAResponse eAPAKAResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, eAPAKAResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks
            public void onEapInfoResponse(Status status, EapInfoResponse eapInfoResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, eapInfoResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
        }

        public static ICarrierAuthCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
            return iInterfaceQueryLocalInterface instanceof ICarrierAuthCallbacks ? (ICarrierAuthCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                EAPAKAResponse eAPAKAResponse = (EAPAKAResponse) sgh.a(parcel, EAPAKAResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onEAPAKAResponse(status, eAPAKAResponse);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                EapInfoResponse eapInfoResponse = (EapInfoResponse) sgh.a(parcel, EapInfoResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onEapInfoResponse(status2, eapInfoResponse);
            }
            return true;
        }
    }

    void onEAPAKAResponse(Status status, EAPAKAResponse eAPAKAResponse);

    void onEapInfoResponse(Status status, EapInfoResponse eapInfoResponse);
}
