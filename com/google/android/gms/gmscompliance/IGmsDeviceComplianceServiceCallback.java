package com.google.android.gms.gmscompliance;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGmsDeviceComplianceServiceCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGmsDeviceComplianceServiceCallback {
        static final int TRANSACTION_onGetGmsDeviceCompliance = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGmsDeviceComplianceServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
            }

            @Override // com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback
            public void onGetGmsDeviceCompliance(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, gmsDeviceComplianceResponse);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
        }

        public static IGmsDeviceComplianceServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
            return iInterfaceQueryLocalInterface instanceof IGmsDeviceComplianceServiceCallback ? (IGmsDeviceComplianceServiceCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) sgh.a(parcel, GmsDeviceComplianceResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onGetGmsDeviceCompliance(status, gmsDeviceComplianceResponse);
            return true;
        }
    }

    void onGetGmsDeviceCompliance(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse);
}
