package com.google.android.gms.auth.api.identity.internal;

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
public interface IGetPhoneNumberHintIntentCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetPhoneNumberHintIntentCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetPhoneNumberHintIntentCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback
            public void onResult(Status status, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
        }

        public static IGetPhoneNumberHintIntentCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
            return iInterfaceQueryLocalInterface instanceof IGetPhoneNumberHintIntentCallback ? (IGetPhoneNumberHintIntentCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, pendingIntent);
            return true;
        }
    }

    void onResult(Status status, PendingIntent pendingIntent);
}
