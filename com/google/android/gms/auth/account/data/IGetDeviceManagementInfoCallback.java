package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetDeviceManagementInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetDeviceManagementInfoCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetDeviceManagementInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback
            public void onResponse(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, deviceManagementInfoResponse);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
        }

        public static IGetDeviceManagementInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
            return iInterfaceQueryLocalInterface instanceof IGetDeviceManagementInfoCallback ? (IGetDeviceManagementInfoCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            DeviceManagementInfoResponse deviceManagementInfoResponse = (DeviceManagementInfoResponse) sgh.a(parcel, DeviceManagementInfoResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, deviceManagementInfoResponse);
            return true;
        }
    }

    void onResponse(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse);
}
