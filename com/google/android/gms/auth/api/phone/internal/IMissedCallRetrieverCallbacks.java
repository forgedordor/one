package com.google.android.gms.auth.api.phone.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMissedCallRetrieverCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMissedCallRetrieverCallbacks {
        static final int TRANSACTION_onMissedCallRetrieverResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMissedCallRetrieverCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks");
            }

            @Override // com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks
            public void onMissedCallRetrieverResult(PendingIntent pendingIntent, Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks");
        }

        public static IMissedCallRetrieverCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks");
            return iInterfaceQueryLocalInterface instanceof IMissedCallRetrieverCallbacks ? (IMissedCallRetrieverCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            onMissedCallRetrieverResult(pendingIntent, status);
            return true;
        }
    }

    void onMissedCallRetrieverResult(PendingIntent pendingIntent, Status status);
}
