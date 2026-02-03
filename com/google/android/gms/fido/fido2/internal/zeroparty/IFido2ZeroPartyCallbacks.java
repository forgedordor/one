package com.google.android.gms.fido.fido2.internal.zeroparty;

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
public interface IFido2ZeroPartyCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFido2ZeroPartyCallbacks {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFido2ZeroPartyCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks
            public void onFailure(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks
            public void onSuccess(Status status, PendingIntent pendingIntent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
        }

        public static IFido2ZeroPartyCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyCallbacks");
            return iInterfaceQueryLocalInterface instanceof IFido2ZeroPartyCallbacks ? (IFido2ZeroPartyCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(status, pendingIntent);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onFailure(status2);
            }
            return true;
        }
    }

    void onFailure(Status status);

    void onSuccess(Status status, PendingIntent pendingIntent);
}
