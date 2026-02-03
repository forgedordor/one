package com.google.android.gms.notifications.capping.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INotificationsCappingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INotificationsCappingService {
        static final int TRANSACTION_addNotificationImpression = 1;
        static final int TRANSACTION_getNotificationImpressionsCount = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INotificationsCappingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.notifications.capping.internal.INotificationsCappingService");
            }

            @Override // com.google.android.gms.notifications.capping.internal.INotificationsCappingService
            public void addNotificationImpression(IStatusCallback iStatusCallback, long j, long j2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeLong(j2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.notifications.capping.internal.INotificationsCappingService
            public void getNotificationImpressionsCount(INotificationsCappingGetNotificationsCountCallback iNotificationsCappingGetNotificationsCountCallback, long j, long j2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iNotificationsCappingGetNotificationsCountCallback);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeLong(j2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.notifications.capping.internal.INotificationsCappingService");
        }

        public static INotificationsCappingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.notifications.capping.internal.INotificationsCappingService");
            return iInterfaceQueryLocalInterface instanceof INotificationsCappingService ? (INotificationsCappingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                addNotificationImpression(iStatusCallbackAsInterface, j, j2, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                INotificationsCappingGetNotificationsCountCallback iNotificationsCappingGetNotificationsCountCallbackAsInterface = INotificationsCappingGetNotificationsCountCallback.Stub.asInterface(parcel.readStrongBinder());
                long j3 = parcel.readLong();
                long j4 = parcel.readLong();
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getNotificationImpressionsCount(iNotificationsCappingGetNotificationsCountCallbackAsInterface, j3, j4, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addNotificationImpression(IStatusCallback iStatusCallback, long j, long j2, ApiMetadata apiMetadata);

    void getNotificationImpressionsCount(INotificationsCappingGetNotificationsCountCallback iNotificationsCappingGetNotificationsCountCallback, long j, long j2, ApiMetadata apiMetadata);
}
