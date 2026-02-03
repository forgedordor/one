package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IClearcutLoggerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IClearcutLoggerService {
        static final int TRANSACTION_forceUpload = 2;
        static final int TRANSACTION_getCollectForDebugExpiryTime = 5;
        static final int TRANSACTION_getLogEventParcelables = 6;
        static final int TRANSACTION_getLogEventParcelablesAndClear = 7;
        static final int TRANSACTION_logError = 8;
        static final int TRANSACTION_logEvent = 1;
        static final int TRANSACTION_startCollectForDebug = 3;
        static final int TRANSACTION_stopCollectForDebug = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IClearcutLoggerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void forceUpload(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void getCollectForDebugExpiryTime(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void getLogEventParcelables(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void getLogEventParcelablesAndClear(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void logError(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, BatchedLogErrorParcelable batchedLogErrorParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, batchedLogErrorParcelable);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void logEvent(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, LogEventParcelable logEventParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, logEventParcelable);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void startCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.clearcut.internal.IClearcutLoggerService
            public void stopCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iClearcutLoggerCallbacks);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        }

        public static IClearcutLoggerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            return iInterfaceQueryLocalInterface instanceof IClearcutLoggerService ? (IClearcutLoggerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogEventParcelable logEventParcelable = (LogEventParcelable) sgh.a(parcel, LogEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    logEvent(iClearcutLoggerCallbacksAsInterface, logEventParcelable);
                    return true;
                case 2:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface2 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    forceUpload(iClearcutLoggerCallbacksAsInterface2);
                    return true;
                case 3:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface3 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startCollectForDebug(iClearcutLoggerCallbacksAsInterface3);
                    return true;
                case 4:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface4 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    stopCollectForDebug(iClearcutLoggerCallbacksAsInterface4);
                    return true;
                case 5:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface5 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCollectForDebugExpiryTime(iClearcutLoggerCallbacksAsInterface5);
                    return true;
                case 6:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface6 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getLogEventParcelables(iClearcutLoggerCallbacksAsInterface6, string);
                    return true;
                case 7:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface7 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getLogEventParcelablesAndClear(iClearcutLoggerCallbacksAsInterface7, string2);
                    return true;
                case 8:
                    IClearcutLoggerCallbacks iClearcutLoggerCallbacksAsInterface8 = IClearcutLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BatchedLogErrorParcelable batchedLogErrorParcelable = (BatchedLogErrorParcelable) sgh.a(parcel, BatchedLogErrorParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    logError(iClearcutLoggerCallbacksAsInterface8, batchedLogErrorParcelable);
                    return true;
                default:
                    return false;
            }
        }
    }

    void forceUpload(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);

    @Deprecated
    void getCollectForDebugExpiryTime(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);

    void getLogEventParcelables(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str);

    void getLogEventParcelablesAndClear(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, String str);

    void logError(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, BatchedLogErrorParcelable batchedLogErrorParcelable);

    void logEvent(IClearcutLoggerCallbacks iClearcutLoggerCallbacks, LogEventParcelable logEventParcelable);

    @Deprecated
    void startCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);

    @Deprecated
    void stopCollectForDebug(IClearcutLoggerCallbacks iClearcutLoggerCallbacks);
}
