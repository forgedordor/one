package com.google.android.gms.audit.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuditService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuditService {
        static final int TRANSACTION_logAuditRecords = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuditService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.audit.internal.IAuditService");
            }

            @Override // com.google.android.gms.audit.internal.IAuditService
            public void logAuditRecords(LogAuditRecordsRequest logAuditRecordsRequest, IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, logAuditRecordsRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.audit.internal.IAuditService");
        }

        public static IAuditService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
            return iInterfaceQueryLocalInterface instanceof IAuditService ? (IAuditService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            LogAuditRecordsRequest logAuditRecordsRequest = (LogAuditRecordsRequest) sgh.a(parcel, LogAuditRecordsRequest.CREATOR);
            IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            logAuditRecords(logAuditRecordsRequest, iStatusCallbackAsInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void logAuditRecords(LogAuditRecordsRequest logAuditRecordsRequest, IStatusCallback iStatusCallback, ApiMetadata apiMetadata);
}
