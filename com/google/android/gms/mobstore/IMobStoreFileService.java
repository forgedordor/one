package com.google.android.gms.mobstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mobstore.IMobStoreFileCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMobStoreFileService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMobStoreFileService {
        static final int TRANSACTION_deleteFile = 2;
        static final int TRANSACTION_openFileDescriptor = 1;
        static final int TRANSACTION_rename = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMobStoreFileService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileService");
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void deleteFile(IMobStoreFileCallbacks iMobStoreFileCallbacks, DeleteFileRequest deleteFileRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, deleteFileRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void openFileDescriptor(IMobStoreFileCallbacks iMobStoreFileCallbacks, OpenFileDescriptorRequest openFileDescriptorRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, openFileDescriptorRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void rename(IMobStoreFileCallbacks iMobStoreFileCallbacks, RenameRequest renameRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, renameRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mobstore.IMobStoreFileService");
        }

        public static IMobStoreFileService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
            return iInterfaceQueryLocalInterface instanceof IMobStoreFileService ? (IMobStoreFileService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMobStoreFileCallbacks iMobStoreFileCallbacksAsInterface = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                OpenFileDescriptorRequest openFileDescriptorRequest = (OpenFileDescriptorRequest) sgh.a(parcel, OpenFileDescriptorRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                openFileDescriptor(iMobStoreFileCallbacksAsInterface, openFileDescriptorRequest, apiMetadata);
            } else if (i == 2) {
                IMobStoreFileCallbacks iMobStoreFileCallbacksAsInterface2 = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                DeleteFileRequest deleteFileRequest = (DeleteFileRequest) sgh.a(parcel, DeleteFileRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                deleteFile(iMobStoreFileCallbacksAsInterface2, deleteFileRequest, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                IMobStoreFileCallbacks iMobStoreFileCallbacksAsInterface3 = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                RenameRequest renameRequest = (RenameRequest) sgh.a(parcel, RenameRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                rename(iMobStoreFileCallbacksAsInterface3, renameRequest, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteFile(IMobStoreFileCallbacks iMobStoreFileCallbacks, DeleteFileRequest deleteFileRequest, ApiMetadata apiMetadata);

    void openFileDescriptor(IMobStoreFileCallbacks iMobStoreFileCallbacks, OpenFileDescriptorRequest openFileDescriptorRequest, ApiMetadata apiMetadata);

    void rename(IMobStoreFileCallbacks iMobStoreFileCallbacks, RenameRequest renameRequest, ApiMetadata apiMetadata);
}
