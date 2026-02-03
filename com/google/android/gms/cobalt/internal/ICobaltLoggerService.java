package com.google.android.gms.cobalt.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.cobalt.LogIntegerRequest;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICobaltLoggerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICobaltLoggerService {
        static final int TRANSACTION_logInteger = 2;
        static final int TRANSACTION_logOccurrence = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICobaltLoggerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.cobalt.internal.ICobaltLoggerService");
            }

            @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerService
            public void logInteger(LogIntegerRequest logIntegerRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, logIntegerRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iCobaltLoggerCallbacks);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerService
            public void logOccurrence(LogOccurrenceRequest logOccurrenceRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, logOccurrenceRequest);
                sgh.f(parcelObtainAndWriteInterfaceToken, iCobaltLoggerCallbacks);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.cobalt.internal.ICobaltLoggerService");
        }

        public static ICobaltLoggerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cobalt.internal.ICobaltLoggerService");
            return iInterfaceQueryLocalInterface instanceof ICobaltLoggerService ? (ICobaltLoggerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LogOccurrenceRequest logOccurrenceRequest = (LogOccurrenceRequest) sgh.a(parcel, LogOccurrenceRequest.CREATOR);
                ICobaltLoggerCallbacks iCobaltLoggerCallbacksAsInterface = ICobaltLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                logOccurrence(logOccurrenceRequest, iCobaltLoggerCallbacksAsInterface);
            } else {
                if (i != 2) {
                    return false;
                }
                LogIntegerRequest logIntegerRequest = (LogIntegerRequest) sgh.a(parcel, LogIntegerRequest.CREATOR);
                ICobaltLoggerCallbacks iCobaltLoggerCallbacksAsInterface2 = ICobaltLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                logInteger(logIntegerRequest, iCobaltLoggerCallbacksAsInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void logInteger(LogIntegerRequest logIntegerRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks);

    void logOccurrence(LogOccurrenceRequest logOccurrenceRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks);
}
