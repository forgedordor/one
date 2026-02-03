package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.internal.TelemetryData;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IClientTelemetryService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IClientTelemetryService {
        static final int TRANSACTION_recordData = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IClientTelemetryService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
            }

            @Override // com.google.android.gms.common.internal.service.IClientTelemetryService
            public void recordData(TelemetryData telemetryData) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, telemetryData);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.service.IClientTelemetryService");
        }

        public static IClientTelemetryService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            return iInterfaceQueryLocalInterface instanceof IClientTelemetryService ? (IClientTelemetryService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            TelemetryData telemetryData = (TelemetryData) sgh.a(parcel, TelemetryData.CREATOR);
            enforceNoDataAvail(parcel);
            recordData(telemetryData);
            return true;
        }
    }

    void recordData(TelemetryData telemetryData);
}
