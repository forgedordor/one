package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPeopleCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPeopleCallbacks {
        static final int TRANSACTION_onBundleLoaded = 1;
        static final int TRANSACTION_onContactTypeMetadataRetrieved = 6;
        static final int TRANSACTION_onDataHolderLoaded = 2;
        static final int TRANSACTION_onDataHoldersLoaded = 4;
        static final int TRANSACTION_onFirstFullSyncStatusCallback = 18;
        static final int TRANSACTION_onGalProviderTypeCallback = 15;
        static final int TRANSACTION_onGetContactsConsentsStatusCallback = 19;
        static final int TRANSACTION_onMatrixCursorCallback = 16;
        static final int TRANSACTION_onParcelFileDescriptorLoaded = 5;
        static final int TRANSACTION_onParcelFileDescriptorLoaded_old = 3;
        static final int TRANSACTION_onPersonRetrieved = 7;
        static final int TRANSACTION_onStatusCallback = 8;
        static final int TRANSACTION_onSyncStatus = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPeopleCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.internal.IPeopleCallbacks");
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onBundleLoaded(int i, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle2);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onContactTypeMetadataRetrieved(int i, BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, backedUpContactsPerDeviceEntity);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataHolder) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, dataHolder);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onDataHoldersLoaded(int i, Bundle bundle, DataHolder[] dataHolderArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(dataHolderArr, 0);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onFirstFullSyncStatusCallback(int i, SyncStatus syncStatus) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, syncStatus);
                transactOneway(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onGalProviderTypeCallback(int i, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onGetContactsConsentsStatusCallback(Status status, ContactsConsentsStatus contactsConsentsStatus) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, contactsConsentsStatus);
                transactOneway(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onMatrixCursorCallback(int i, MatrixCursorParcelable matrixCursorParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, matrixCursorParcelable);
                transactOneway(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle2);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onPersonRetrieved(int i, PersonEntity personEntity) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, personEntity);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onStatusCallback(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onSyncStatus(int i, SyncStatus syncStatus) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, syncStatus);
                transactOneway(12, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.internal.IPeopleCallbacks");
        }

        public static IPeopleCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            return iInterfaceQueryLocalInterface instanceof IPeopleCallbacks ? (IPeopleCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 12) {
                int i3 = parcel.readInt();
                SyncStatus syncStatus = (SyncStatus) sgh.a(parcel, SyncStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onSyncStatus(i3, syncStatus);
                return true;
            }
            if (i == 15) {
                int i4 = parcel.readInt();
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                onGalProviderTypeCallback(i4, string);
                return true;
            }
            if (i == 16) {
                int i5 = parcel.readInt();
                MatrixCursorParcelable matrixCursorParcelable = (MatrixCursorParcelable) sgh.a(parcel, MatrixCursorParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onMatrixCursorCallback(i5, matrixCursorParcelable);
                return true;
            }
            if (i == 18) {
                int i6 = parcel.readInt();
                SyncStatus syncStatus2 = (SyncStatus) sgh.a(parcel, SyncStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onFirstFullSyncStatusCallback(i6, syncStatus2);
                return true;
            }
            if (i == 19) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) sgh.a(parcel, ContactsConsentsStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onGetContactsConsentsStatusCallback(status, contactsConsentsStatus);
                return true;
            }
            switch (i) {
                case 1:
                    int i7 = parcel.readInt();
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBundleLoaded(i7, bundle, bundle2);
                    return true;
                case 2:
                    int i8 = parcel.readInt();
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    DataHolder dataHolder = (DataHolder) sgh.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataHolderLoaded(i8, bundle3, dataHolder);
                    return true;
                case 3:
                    int i9 = parcel.readInt();
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                    enforceNoDataAvail(parcel);
                    onParcelFileDescriptorLoaded_old(i9, bundle4, parcelFileDescriptor);
                    return true;
                case 4:
                    int i10 = parcel.readInt();
                    Bundle bundle5 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    DataHolder[] dataHolderArr = (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataHoldersLoaded(i10, bundle5, dataHolderArr);
                    return true;
                case 5:
                    int i11 = parcel.readInt();
                    Bundle bundle6 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                    Bundle bundle7 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onParcelFileDescriptorLoaded(i11, bundle6, parcelFileDescriptor2, bundle7);
                    return true;
                case 6:
                    int i12 = parcel.readInt();
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) sgh.a(parcel, BackedUpContactsPerDeviceEntity.CREATOR);
                    enforceNoDataAvail(parcel);
                    onContactTypeMetadataRetrieved(i12, backedUpContactsPerDeviceEntity);
                    return true;
                case 7:
                    int i13 = parcel.readInt();
                    PersonEntity personEntity = (PersonEntity) sgh.a(parcel, PersonEntity.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPersonRetrieved(i13, personEntity);
                    return true;
                case 8:
                    int i14 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onStatusCallback(i14);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onBundleLoaded(int i, Bundle bundle, Bundle bundle2);

    void onContactTypeMetadataRetrieved(int i, BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity);

    void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataHolder);

    void onDataHoldersLoaded(int i, Bundle bundle, DataHolder[] dataHolderArr);

    void onFirstFullSyncStatusCallback(int i, SyncStatus syncStatus);

    void onGalProviderTypeCallback(int i, String str);

    void onGetContactsConsentsStatusCallback(Status status, ContactsConsentsStatus contactsConsentsStatus);

    void onMatrixCursorCallback(int i, MatrixCursorParcelable matrixCursorParcelable);

    void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2);

    void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    void onPersonRetrieved(int i, PersonEntity personEntity);

    void onStatusCallback(int i);

    void onSyncStatus(int i, SyncStatus syncStatus);
}
