package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IClearTokenCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IClearTokenCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IClearTokenCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IClearTokenCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IClearTokenCallback
            public void onResponse(Status status, ClearTokenResponse clearTokenResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, clearTokenResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IClearTokenCallback");
        }

        public static IClearTokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IClearTokenCallback");
            return iInterfaceQueryLocalInterface instanceof IClearTokenCallback ? (IClearTokenCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ClearTokenResponse clearTokenResponse = (ClearTokenResponse) sgh.a(parcel, ClearTokenResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, clearTokenResponse);
            return true;
        }
    }

    void onResponse(Status status, ClearTokenResponse clearTokenResponse);
}
