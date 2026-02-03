package com.google.android.gms.cobalt.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICobaltLoggerCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICobaltLoggerCallbacks {
        static final int TRANSACTION_onLogInteger = 2;
        static final int TRANSACTION_onLogOccurrence = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICobaltLoggerCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks");
            }

            @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks
            public void onLogInteger(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks
            public void onLogOccurrence(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks");
        }

        public static ICobaltLoggerCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks");
            return iInterfaceQueryLocalInterface instanceof ICobaltLoggerCallbacks ? (ICobaltLoggerCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onLogOccurrence(status);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onLogInteger(status2);
            }
            return true;
        }
    }

    void onLogInteger(Status status);

    void onLogOccurrence(Status status);
}
