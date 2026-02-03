package com.google.android.gms.people.contactssync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactsSyncThirdPartyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactsSyncThirdPartyService {
        static final int TRANSACTION_addDeviceContactsSyncSettingChangedListener = 224703;
        static final int TRANSACTION_getBackupAndSyncOptInState = 224702;
        static final int TRANSACTION_getDeviceContactsSyncSettingAction = 224705;
        static final int TRANSACTION_removeDeviceContactsSyncSettingChangedListener = 224704;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactsSyncThirdPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addDeviceContactsSyncSettingChangedListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInState, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getDeviceContactsSyncSettingAction, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeDeviceContactsSyncSettingChangedListener, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
        }

        public static IContactsSyncThirdPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
            return iInterfaceQueryLocalInterface instanceof IContactsSyncThirdPartyService ? (IContactsSyncThirdPartyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_getBackupAndSyncOptInState /* 224702 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInState(iContactsSyncServiceCallbacksAsInterface, apiMetadata);
                    break;
                case TRANSACTION_addDeviceContactsSyncSettingChangedListener /* 224703 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface2 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addDeviceContactsSyncSettingChangedListener(iContactsSyncServiceCallbacksAsInterface2, apiMetadata2);
                    break;
                case TRANSACTION_removeDeviceContactsSyncSettingChangedListener /* 224704 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface3 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeDeviceContactsSyncSettingChangedListener(iContactsSyncServiceCallbacksAsInterface3, apiMetadata3);
                    break;
                case TRANSACTION_getDeviceContactsSyncSettingAction /* 224705 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface4 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDeviceContactsSyncSettingAction(iContactsSyncServiceCallbacksAsInterface4, apiMetadata4);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);
}
