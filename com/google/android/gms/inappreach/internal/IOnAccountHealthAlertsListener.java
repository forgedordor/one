package com.google.android.gms.inappreach.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnAccountHealthAlertsListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnAccountHealthAlertsListener {
        static final int TRANSACTION_onAccountHealthAlerts = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnAccountHealthAlertsListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener");
            }

            @Override // com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener
            public void onAccountHealthAlerts(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener");
        }

        public static IOnAccountHealthAlertsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener");
            return iInterfaceQueryLocalInterface instanceof IOnAccountHealthAlertsListener ? (IOnAccountHealthAlertsListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onAccountHealthAlerts(bArrCreateByteArray);
            return true;
        }
    }

    void onAccountHealthAlerts(byte[] bArr);
}
