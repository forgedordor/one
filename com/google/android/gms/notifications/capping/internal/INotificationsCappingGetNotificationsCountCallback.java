package com.google.android.gms.notifications.capping.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INotificationsCappingGetNotificationsCountCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INotificationsCappingGetNotificationsCountCallback {
        static final int TRANSACTION_onGetNotificationImpressionsCount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INotificationsCappingGetNotificationsCountCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
            }

            @Override // com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback
            public void onGetNotificationImpressionsCount(Status status, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
        }

        public static INotificationsCappingGetNotificationsCountCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
            return iInterfaceQueryLocalInterface instanceof INotificationsCappingGetNotificationsCountCallback ? (INotificationsCappingGetNotificationsCountCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onGetNotificationImpressionsCount(status, i3);
            return true;
        }
    }

    void onGetNotificationImpressionsCount(Status status, int i);
}
