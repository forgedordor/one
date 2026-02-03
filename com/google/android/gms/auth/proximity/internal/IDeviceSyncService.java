package com.google.android.gms.auth.proximity.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback;
import com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback;
import com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback;
import com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDeviceSyncService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDeviceSyncService {
        static final int TRANSACTION_forceDeviceSync = 11;
        static final int TRANSACTION_getFeatureEnabledState = 10;
        static final int TRANSACTION_getMyPublicKey = 4;
        static final int TRANSACTION_getMySyncedMetadata = 5;
        static final int TRANSACTION_getSyncedDevices = 1;
        static final int TRANSACTION_registerForSyncedDevicesUpdates = 2;
        static final int TRANSACTION_registerSetupRequestedListener = 8;
        static final int TRANSACTION_setFeatureEnabled = 7;
        static final int TRANSACTION_setFeatureSupported = 6;
        static final int TRANSACTION_setFeatureSupportedScheduled = 12;
        static final int TRANSACTION_unregisterForSyncedDevicesUpdates = 3;
        static final int TRANSACTION_unregisterSetupRequestedListener = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDeviceSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void forceDeviceSync(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getFeatureEnabledState(IGetFeatureEnabledStateCallback iGetFeatureEnabledStateCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetFeatureEnabledStateCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getMyPublicKey(IGetMyPublicKeyCallback iGetMyPublicKeyCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetMyPublicKeyCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getMySyncedMetadata(IGetMySyncedMetadataCallback iGetMySyncedMetadataCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetMySyncedMetadataCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getSyncedDevices(IGetSyncedDevicesCallback iGetSyncedDevicesCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetSyncedDevicesCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void registerForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.d(parcelObtainAndWriteInterfaceToken, deviceFilter);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void registerSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void setFeatureEnabled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void setFeatureSupported(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void setFeatureSupportedScheduled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void unregisterForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.d(parcelObtainAndWriteInterfaceToken, deviceFilter);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void unregisterSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
        }

        public static IDeviceSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
            return iInterfaceQueryLocalInterface instanceof IDeviceSyncService ? (IDeviceSyncService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IGetSyncedDevicesCallback iGetSyncedDevicesCallbackAsInterface = IGetSyncedDevicesCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSyncedDevices(iGetSyncedDevicesCallbackAsInterface, apiMetadata);
                    break;
                case 2:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                    DeviceFilter deviceFilter = (DeviceFilter) sgh.a(parcel, DeviceFilter.CREATOR);
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerForSyncedDevicesUpdates(iStatusCallbackAsInterface, pendingIntent, deviceFilter, apiMetadata2);
                    break;
                case 3:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent2 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                    DeviceFilter deviceFilter2 = (DeviceFilter) sgh.a(parcel, DeviceFilter.CREATOR);
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterForSyncedDevicesUpdates(iStatusCallbackAsInterface2, pendingIntent2, deviceFilter2, apiMetadata3);
                    break;
                case 4:
                    IGetMyPublicKeyCallback iGetMyPublicKeyCallbackAsInterface = IGetMyPublicKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getMyPublicKey(iGetMyPublicKeyCallbackAsInterface, string, apiMetadata4);
                    break;
                case 5:
                    IGetMySyncedMetadataCallback iGetMySyncedMetadataCallbackAsInterface = IGetMySyncedMetadataCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getMySyncedMetadata(iGetMySyncedMetadataCallbackAsInterface, string2, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    boolean zG = sgh.g(parcel);
                    String string4 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFeatureSupported(iStatusCallbackAsInterface3, string3, zG, string4, apiMetadata6);
                    break;
                case 7:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    boolean zG2 = sgh.g(parcel);
                    String string6 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFeatureEnabled(iStatusCallbackAsInterface4, string5, zG2, string6, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent3 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                    String string7 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerSetupRequestedListener(iStatusCallbackAsInterface5, pendingIntent3, string7, apiMetadata8);
                    break;
                case 9:
                    IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent4 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                    String string8 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterSetupRequestedListener(iStatusCallbackAsInterface6, pendingIntent4, string8, apiMetadata9);
                    break;
                case 10:
                    IGetFeatureEnabledStateCallback iGetFeatureEnabledStateCallbackAsInterface = IGetFeatureEnabledStateCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFeatureEnabledState(iGetFeatureEnabledStateCallbackAsInterface, string9, string10, apiMetadata10);
                    break;
                case 11:
                    IStatusCallback iStatusCallbackAsInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string11 = parcel.readString();
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    forceDeviceSync(iStatusCallbackAsInterface7, string11, apiMetadata11);
                    break;
                case 12:
                    IStatusCallback iStatusCallbackAsInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string12 = parcel.readString();
                    boolean zG3 = sgh.g(parcel);
                    String string13 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFeatureSupportedScheduled(iStatusCallbackAsInterface8, string12, zG3, string13, apiMetadata12);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void forceDeviceSync(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void getFeatureEnabledState(IGetFeatureEnabledStateCallback iGetFeatureEnabledStateCallback, String str, String str2, ApiMetadata apiMetadata);

    void getMyPublicKey(IGetMyPublicKeyCallback iGetMyPublicKeyCallback, String str, ApiMetadata apiMetadata);

    void getMySyncedMetadata(IGetMySyncedMetadataCallback iGetMySyncedMetadataCallback, String str, ApiMetadata apiMetadata);

    void getSyncedDevices(IGetSyncedDevicesCallback iGetSyncedDevicesCallback, ApiMetadata apiMetadata);

    void registerForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata);

    void registerSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata);

    void setFeatureEnabled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setFeatureSupported(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setFeatureSupportedScheduled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void unregisterForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata);

    void unregisterSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata);
}
