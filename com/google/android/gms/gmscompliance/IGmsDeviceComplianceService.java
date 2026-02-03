package com.google.android.gms.gmscompliance;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGmsDeviceComplianceService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGmsDeviceComplianceService {
        static final int TRANSACTION_getGmsDeviceCompliance = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGmsDeviceComplianceService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.gmscompliance.IGmsDeviceComplianceService");
            }

            @Override // com.google.android.gms.gmscompliance.IGmsDeviceComplianceService
            public void getGmsDeviceCompliance(IGmsDeviceComplianceServiceCallback iGmsDeviceComplianceServiceCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGmsDeviceComplianceServiceCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceService");
        }

        public static IGmsDeviceComplianceService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gmscompliance.IGmsDeviceComplianceService");
            return iInterfaceQueryLocalInterface instanceof IGmsDeviceComplianceService ? (IGmsDeviceComplianceService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IGmsDeviceComplianceServiceCallback iGmsDeviceComplianceServiceCallbackAsInterface = IGmsDeviceComplianceServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            getGmsDeviceCompliance(iGmsDeviceComplianceServiceCallbackAsInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void getGmsDeviceCompliance(IGmsDeviceComplianceServiceCallback iGmsDeviceComplianceServiceCallback, ApiMetadata apiMetadata);
}
