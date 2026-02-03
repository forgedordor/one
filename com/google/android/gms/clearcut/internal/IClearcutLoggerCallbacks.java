package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IClearcutLoggerCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IClearcutLoggerCallbacks {
        static final int TRANSACTION_onForceUpload = 2;
        static final int TRANSACTION_onGetCollectForDebugExpiryTime = 5;
        static final int TRANSACTION_onGetLogEventParcelables = 6;
        static final int TRANSACTION_onGetLogEventParcelablesDataBuffer = 7;
        static final int TRANSACTION_onLogError = 8;
        static final int TRANSACTION_onLogEvent = 1;
        static final int TRANSACTION_onStartCollectForDebug = 3;
        static final int TRANSACTION_onStopCollectForDebug = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IClearcutLoggerCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onForceUpload(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onGetCollectForDebugExpiryTime(Status status, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onGetLogEventParcelables(Status status, LogEventParcelable[] logEventParcelableArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(logEventParcelableArr, 0);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onGetLogEventParcelablesDataBuffer(DataHolder dataHolder) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, dataHolder);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onLogError(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onLogEvent(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onStartCollectForDebug(Status status, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
            public void onStopCollectForDebug(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        }

        public static IClearcutLoggerCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
            return iInterfaceQueryLocalInterface instanceof IClearcutLoggerCallbacks ? (IClearcutLoggerCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onLogEvent(status);
                    return true;
                case 2:
                    Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onForceUpload(status2);
                    return true;
                case 3:
                    Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    onStartCollectForDebug(status3, j);
                    return true;
                case 4:
                    Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStopCollectForDebug(status4);
                    return true;
                case 5:
                    Status status5 = (Status) sgh.a(parcel, Status.CREATOR);
                    long j2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    onGetCollectForDebugExpiryTime(status5, j2);
                    return true;
                case 6:
                    Status status6 = (Status) sgh.a(parcel, Status.CREATOR);
                    LogEventParcelable[] logEventParcelableArr = (LogEventParcelable[]) parcel.createTypedArray(LogEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetLogEventParcelables(status6, logEventParcelableArr);
                    return true;
                case 7:
                    DataHolder dataHolder = (DataHolder) sgh.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetLogEventParcelablesDataBuffer(dataHolder);
                    return true;
                case 8:
                    Status status7 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onLogError(status7);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onForceUpload(Status status);

    void onGetCollectForDebugExpiryTime(Status status, long j);

    void onGetLogEventParcelables(Status status, LogEventParcelable[] logEventParcelableArr);

    void onGetLogEventParcelablesDataBuffer(DataHolder dataHolder);

    void onLogError(Status status);

    void onLogEvent(Status status);

    void onStartCollectForDebug(Status status, long j);

    void onStopCollectForDebug(Status status);
}
