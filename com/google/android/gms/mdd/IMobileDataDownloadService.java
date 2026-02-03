package com.google.android.gms.mdd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdd.IMddFileGroupCallback;
import com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMobileDataDownloadService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMobileDataDownloadService {
        static final int TRANSACTION_activateFileGroup = 12;
        static final int TRANSACTION_addConfigsForDownload = 2;
        static final int TRANSACTION_addOverrideFileGroup = 6;
        static final int TRANSACTION_clearAllState = 7;
        static final int TRANSACTION_deactivateFileGroup = 13;
        static final int TRANSACTION_downloadFileGroup = 11;
        static final int TRANSACTION_downloadPendingGroups = 3;
        static final int TRANSACTION_getFileGroup = 1;
        static final int TRANSACTION_getFileGroupListForDebugUI = 10;
        static final int TRANSACTION_handleFlagChange = 8;
        static final int TRANSACTION_maintenance = 4;
        static final int TRANSACTION_resetTesting = 5;
        static final int TRANSACTION_verifyPendingGroups = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMobileDataDownloadService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdd.IMobileDataDownloadService");
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void activateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileGroupRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void addConfigsForDownload(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void addOverrideFileGroup(IStatusCallback iStatusCallback, OverrideFileGroupRequest overrideFileGroupRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, overrideFileGroupRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void clearAllState(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void deactivateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileGroupRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void downloadFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMddFileGroupCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileGroupRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void downloadPendingGroups(boolean z, IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void getFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMddFileGroupCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, fileGroupRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void getFileGroupListForDebugUI(IMddFileGroupWithDownloadStatusCallback iMddFileGroupWithDownloadStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMddFileGroupWithDownloadStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void handleFlagChange(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void maintenance(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void resetTesting(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void verifyPendingGroups(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdd.IMobileDataDownloadService");
        }

        public static IMobileDataDownloadService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdd.IMobileDataDownloadService");
            return iInterfaceQueryLocalInterface instanceof IMobileDataDownloadService ? (IMobileDataDownloadService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IMddFileGroupCallback iMddFileGroupCallbackAsInterface = IMddFileGroupCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest = (FileGroupRequest) sgh.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFileGroup(iMddFileGroupCallbackAsInterface, fileGroupRequest, apiMetadata);
                    break;
                case 2:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addConfigsForDownload(iStatusCallbackAsInterface, apiMetadata2);
                    break;
                case 3:
                    boolean zG = sgh.g(parcel);
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    downloadPendingGroups(zG, iStatusCallbackAsInterface2, apiMetadata3);
                    break;
                case 4:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    maintenance(iStatusCallbackAsInterface3, apiMetadata4);
                    break;
                case 5:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetTesting(iStatusCallbackAsInterface4, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    OverrideFileGroupRequest overrideFileGroupRequest = (OverrideFileGroupRequest) sgh.a(parcel, OverrideFileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addOverrideFileGroup(iStatusCallbackAsInterface5, overrideFileGroupRequest, apiMetadata6);
                    break;
                case 7:
                    IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearAllState(iStatusCallbackAsInterface6, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback iStatusCallbackAsInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    handleFlagChange(iStatusCallbackAsInterface7, apiMetadata8);
                    break;
                case 9:
                    IStatusCallback iStatusCallbackAsInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    verifyPendingGroups(iStatusCallbackAsInterface8, apiMetadata9);
                    break;
                case 10:
                    IMddFileGroupWithDownloadStatusCallback iMddFileGroupWithDownloadStatusCallbackAsInterface = IMddFileGroupWithDownloadStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFileGroupListForDebugUI(iMddFileGroupWithDownloadStatusCallbackAsInterface, apiMetadata10);
                    break;
                case 11:
                    IMddFileGroupCallback iMddFileGroupCallbackAsInterface2 = IMddFileGroupCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest2 = (FileGroupRequest) sgh.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    downloadFileGroup(iMddFileGroupCallbackAsInterface2, fileGroupRequest2, apiMetadata11);
                    break;
                case 12:
                    IStatusCallback iStatusCallbackAsInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest3 = (FileGroupRequest) sgh.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    activateFileGroup(iStatusCallbackAsInterface9, fileGroupRequest3, apiMetadata12);
                    break;
                case 13:
                    IStatusCallback iStatusCallbackAsInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest4 = (FileGroupRequest) sgh.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deactivateFileGroup(iStatusCallbackAsInterface10, fileGroupRequest4, apiMetadata13);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void activateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void addConfigsForDownload(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void addOverrideFileGroup(IStatusCallback iStatusCallback, OverrideFileGroupRequest overrideFileGroupRequest, ApiMetadata apiMetadata);

    void clearAllState(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void deactivateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void downloadFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void downloadPendingGroups(boolean z, IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void getFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void getFileGroupListForDebugUI(IMddFileGroupWithDownloadStatusCallback iMddFileGroupWithDownloadStatusCallback, ApiMetadata apiMetadata);

    void handleFlagChange(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void maintenance(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void resetTesting(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void verifyPendingGroups(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);
}
