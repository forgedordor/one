package com.google.android.gms.auth.proximity.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISecureChannelService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISecureChannelService {
        static final int TRANSACTION_addChannelCallback = 5;
        static final int TRANSACTION_registerDevicesForRole = 2;
        static final int TRANSACTION_removeChannelCallback = 6;
        static final int TRANSACTION_sendMessage = 4;
        static final int TRANSACTION_unregisterDevicesForRole = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISecureChannelService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.ISecureChannelService");
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void addChannelCallback(IStatusCallback iStatusCallback, String str, Role role, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, role);
                sgh.f(parcelObtainAndWriteInterfaceToken, iProximityAuthCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void registerDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, role);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void removeChannelCallback(IStatusCallback iStatusCallback, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.f(parcelObtainAndWriteInterfaceToken, iProximityAuthCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void sendMessage(IStatusCallback iStatusCallback, String str, Role role, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, role);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void unregisterDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, role);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, pendingIntent);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.ISecureChannelService");
        }

        public static ISecureChannelService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.ISecureChannelService");
            return iInterfaceQueryLocalInterface instanceof ISecureChannelService ? (ISecureChannelService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Role role = (Role) sgh.a(parcel, Role.CREATOR);
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(RemoteDevice.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                registerDevicesForRole(iStatusCallbackAsInterface, role, arrayListCreateTypedArrayList, pendingIntent, apiMetadata);
            } else if (i == 3) {
                IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Role role2 = (Role) sgh.a(parcel, Role.CREATOR);
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(RemoteDevice.CREATOR);
                PendingIntent pendingIntent2 = (PendingIntent) sgh.a(parcel, PendingIntent.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                unregisterDevicesForRole(iStatusCallbackAsInterface2, role2, arrayListCreateTypedArrayList2, pendingIntent2, apiMetadata2);
            } else if (i == 4) {
                IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                Role role3 = (Role) sgh.a(parcel, Role.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                sendMessage(iStatusCallbackAsInterface3, string, role3, bArrCreateByteArray, apiMetadata3);
            } else if (i == 5) {
                IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                Role role4 = (Role) sgh.a(parcel, Role.CREATOR);
                IProximityAuthCallbacks iProximityAuthCallbacksAsInterface = IProximityAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                addChannelCallback(iStatusCallbackAsInterface4, string2, role4, iProximityAuthCallbacksAsInterface, apiMetadata4);
            } else {
                if (i != 6) {
                    return false;
                }
                IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                IProximityAuthCallbacks iProximityAuthCallbacksAsInterface2 = IProximityAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                removeChannelCallback(iStatusCallbackAsInterface5, iProximityAuthCallbacksAsInterface2, apiMetadata5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addChannelCallback(IStatusCallback iStatusCallback, String str, Role role, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata);

    void registerDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata);

    void removeChannelCallback(IStatusCallback iStatusCallback, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata);

    void sendMessage(IStatusCallback iStatusCallback, String str, Role role, byte[] bArr, ApiMetadata apiMetadata);

    void unregisterDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata);
}
