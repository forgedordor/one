package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWearableCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWearableCallbacks {
        static final int TRANSACTION_onAddLocalCapability = 26;
        static final int TRANSACTION_onAppRecommendations = 40;
        static final int TRANSACTION_onBooleanResponse = 46;
        static final int TRANSACTION_onChannelReceiveFile = 19;
        static final int TRANSACTION_onChannelSendFile = 20;
        static final int TRANSACTION_onCloseChannel = 15;
        static final int TRANSACTION_onCloseChannelWithError = 16;
        static final int TRANSACTION_onDataHolderReady = 5;
        static final int TRANSACTION_onDeleteDataItem = 6;
        static final int TRANSACTION_onGetAllCapabilities = 23;
        static final int TRANSACTION_onGetAppTheme = 41;
        static final int TRANSACTION_onGetBackupSettingsSupported = 42;
        static final int TRANSACTION_onGetCapability = 22;
        static final int TRANSACTION_onGetChannelInputStream = 17;
        static final int TRANSACTION_onGetChannelOutputStream = 18;
        static final int TRANSACTION_onGetCloudSyncOptInOutDone = 28;
        static final int TRANSACTION_onGetCloudSyncOptInStatus = 30;
        static final int TRANSACTION_onGetCloudSyncSetting = 29;
        static final int TRANSACTION_onGetCompanionPackageForNode = 37;
        static final int TRANSACTION_onGetConfig = 2;
        static final int TRANSACTION_onGetConfigs = 13;
        static final int TRANSACTION_onGetConnectedNodes = 10;
        static final int TRANSACTION_onGetDataItem = 4;
        static final int TRANSACTION_onGetEapId = 35;
        static final int TRANSACTION_onGetFastpairAccountKeyByAccount = 50;
        static final int TRANSACTION_onGetFastpairAccountKeys = 48;
        static final int TRANSACTION_onGetFdForAsset = 8;
        static final int TRANSACTION_onGetLocalNode = 9;
        static final int TRANSACTION_onGetNodeId = 39;
        static final int TRANSACTION_onGetRestoreState = 47;
        static final int TRANSACTION_onGetRestoreSupported = 43;
        static final int TRANSACTION_onGetStorageInformation = 12;
        static final int TRANSACTION_onGetTerms = 49;
        static final int TRANSACTION_onOpenChannelCompleted = 14;
        static final int TRANSACTION_onPerformEapAka = 36;
        static final int TRANSACTION_onPutData = 3;
        static final int TRANSACTION_onRemoveLocalCapability = 27;
        static final int TRANSACTION_onSendMessage = 7;
        static final int TRANSACTION_onSendRequest = 34;
        static final int TRANSACTION_onStatus = 11;
        static final int TRANSACTION_onUserConsentStatus = 38;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWearableCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IWearableCallbacks");
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onAddLocalCapability(AddLocalCapabilityResponse addLocalCapabilityResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, addLocalCapabilityResponse);
                transactAndReadExceptionReturnVoid(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onAppRecommendations(AppRecommendationsResponse appRecommendationsResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, appRecommendationsResponse);
                transactAndReadExceptionReturnVoid(40, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onBooleanResponse(BooleanResponse booleanResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, booleanResponse);
                transactAndReadExceptionReturnVoid(46, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onChannelReceiveFile(ChannelReceiveFileResponse channelReceiveFileResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, channelReceiveFileResponse);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onChannelSendFile(ChannelSendFileResponse channelSendFileResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, channelSendFileResponse);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onCloseChannel(CloseChannelResponse closeChannelResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, closeChannelResponse);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onCloseChannelWithError(CloseChannelResponse closeChannelResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, closeChannelResponse);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onDataHolderReady(DataHolder dataHolder) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, dataHolder);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, deleteDataItemsResponse);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetAllCapabilities(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getAllCapabilitiesResponse);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetAppTheme(GetAppThemeResponse getAppThemeResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getAppThemeResponse);
                transactAndReadExceptionReturnVoid(41, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetBackupSettingsSupported(GetBackupSettingsSupportedResponse getBackupSettingsSupportedResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getBackupSettingsSupportedResponse);
                transactAndReadExceptionReturnVoid(42, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCapability(GetCapabilityResponse getCapabilityResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCapabilityResponse);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetChannelInputStream(GetChannelInputStreamResponse getChannelInputStreamResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getChannelInputStreamResponse);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getChannelOutputStreamResponse);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCloudSyncOptInOutDone(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCloudSyncOptInOutDoneResponse);
                transactAndReadExceptionReturnVoid(28, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCloudSyncOptInStatus(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCloudSyncOptInStatusResponse);
                transactAndReadExceptionReturnVoid(30, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCloudSyncSetting(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCloudSyncSettingResponse);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetCompanionPackageForNode(GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCompanionPackageForNodeResponse);
                transactAndReadExceptionReturnVoid(37, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetConfig(GetConfigResponse getConfigResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getConfigResponse);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetConfigs(GetConfigsResponse getConfigsResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getConfigsResponse);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetConnectedNodes(GetConnectedNodesResponse getConnectedNodesResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getConnectedNodesResponse);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetDataItem(GetDataItemResponse getDataItemResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getDataItemResponse);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetEapId(GetEapIdResponse getEapIdResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getEapIdResponse);
                transactAndReadExceptionReturnVoid(35, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetFastpairAccountKeyByAccount(GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getFastpairAccountKeyByAccountResponse);
                transactAndReadExceptionReturnVoid(50, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetFastpairAccountKeys(GetFastpairAccountKeysResponse getFastpairAccountKeysResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getFastpairAccountKeysResponse);
                transactAndReadExceptionReturnVoid(48, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getFdForAssetResponse);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetLocalNode(GetLocalNodeResponse getLocalNodeResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getLocalNodeResponse);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetNodeId(GetNodeIdResponse getNodeIdResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getNodeIdResponse);
                transactAndReadExceptionReturnVoid(39, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetRestoreState(GetRestoreStateResponse getRestoreStateResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getRestoreStateResponse);
                transactAndReadExceptionReturnVoid(47, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetRestoreSupported(GetRestoreSupportedResponse getRestoreSupportedResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getRestoreSupportedResponse);
                transactAndReadExceptionReturnVoid(43, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetStorageInformation(StorageInfoResponse storageInfoResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, storageInfoResponse);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onGetTerms(GetTermsResponse getTermsResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getTermsResponse);
                transactAndReadExceptionReturnVoid(49, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onOpenChannelCompleted(OpenChannelResponse openChannelResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, openChannelResponse);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onPerformEapAka(PerformEapAkaResponse performEapAkaResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, performEapAkaResponse);
                transactAndReadExceptionReturnVoid(36, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onPutData(PutDataResponse putDataResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, putDataResponse);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onRemoveLocalCapability(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, removeLocalCapabilityResponse);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onSendMessage(SendMessageResponse sendMessageResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, sendMessageResponse);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onSendRequest(RpcResponse rpcResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, rpcResponse);
                transactAndReadExceptionReturnVoid(34, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onStatus(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableCallbacks
            public void onUserConsentStatus(ConsentResponse consentResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, consentResponse);
                transactAndReadExceptionReturnVoid(38, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        public static IWearableCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return iInterfaceQueryLocalInterface instanceof IWearableCallbacks ? (IWearableCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    GetConfigResponse getConfigResponse = (GetConfigResponse) sgh.a(parcel, GetConfigResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetConfig(getConfigResponse);
                    break;
                case 3:
                    PutDataResponse putDataResponse = (PutDataResponse) sgh.a(parcel, PutDataResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPutData(putDataResponse);
                    break;
                case 4:
                    GetDataItemResponse getDataItemResponse = (GetDataItemResponse) sgh.a(parcel, GetDataItemResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetDataItem(getDataItemResponse);
                    break;
                case 5:
                    DataHolder dataHolder = (DataHolder) sgh.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataHolderReady(dataHolder);
                    break;
                case 6:
                    DeleteDataItemsResponse deleteDataItemsResponse = (DeleteDataItemsResponse) sgh.a(parcel, DeleteDataItemsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDeleteDataItem(deleteDataItemsResponse);
                    break;
                case 7:
                    SendMessageResponse sendMessageResponse = (SendMessageResponse) sgh.a(parcel, SendMessageResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSendMessage(sendMessageResponse);
                    break;
                case 8:
                    GetFdForAssetResponse getFdForAssetResponse = (GetFdForAssetResponse) sgh.a(parcel, GetFdForAssetResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetFdForAsset(getFdForAssetResponse);
                    break;
                case 9:
                    GetLocalNodeResponse getLocalNodeResponse = (GetLocalNodeResponse) sgh.a(parcel, GetLocalNodeResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetLocalNode(getLocalNodeResponse);
                    break;
                case 10:
                    GetConnectedNodesResponse getConnectedNodesResponse = (GetConnectedNodesResponse) sgh.a(parcel, GetConnectedNodesResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetConnectedNodes(getConnectedNodesResponse);
                    break;
                case 11:
                    Status status = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatus(status);
                    break;
                case 12:
                    StorageInfoResponse storageInfoResponse = (StorageInfoResponse) sgh.a(parcel, StorageInfoResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetStorageInformation(storageInfoResponse);
                    break;
                case 13:
                    GetConfigsResponse getConfigsResponse = (GetConfigsResponse) sgh.a(parcel, GetConfigsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetConfigs(getConfigsResponse);
                    break;
                case 14:
                    OpenChannelResponse openChannelResponse = (OpenChannelResponse) sgh.a(parcel, OpenChannelResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOpenChannelCompleted(openChannelResponse);
                    break;
                case 15:
                    CloseChannelResponse closeChannelResponse = (CloseChannelResponse) sgh.a(parcel, CloseChannelResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCloseChannel(closeChannelResponse);
                    break;
                case 16:
                    CloseChannelResponse closeChannelResponse2 = (CloseChannelResponse) sgh.a(parcel, CloseChannelResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCloseChannelWithError(closeChannelResponse2);
                    break;
                case 17:
                    GetChannelInputStreamResponse getChannelInputStreamResponse = (GetChannelInputStreamResponse) sgh.a(parcel, GetChannelInputStreamResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetChannelInputStream(getChannelInputStreamResponse);
                    break;
                case 18:
                    GetChannelOutputStreamResponse getChannelOutputStreamResponse = (GetChannelOutputStreamResponse) sgh.a(parcel, GetChannelOutputStreamResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetChannelOutputStream(getChannelOutputStreamResponse);
                    break;
                case 19:
                    ChannelReceiveFileResponse channelReceiveFileResponse = (ChannelReceiveFileResponse) sgh.a(parcel, ChannelReceiveFileResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onChannelReceiveFile(channelReceiveFileResponse);
                    break;
                case 20:
                    ChannelSendFileResponse channelSendFileResponse = (ChannelSendFileResponse) sgh.a(parcel, ChannelSendFileResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onChannelSendFile(channelSendFileResponse);
                    break;
                case 21:
                case 24:
                case 25:
                case 31:
                case 32:
                case 33:
                case 44:
                case 45:
                default:
                    return false;
                case 22:
                    GetCapabilityResponse getCapabilityResponse = (GetCapabilityResponse) sgh.a(parcel, GetCapabilityResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCapability(getCapabilityResponse);
                    break;
                case 23:
                    GetAllCapabilitiesResponse getAllCapabilitiesResponse = (GetAllCapabilitiesResponse) sgh.a(parcel, GetAllCapabilitiesResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAllCapabilities(getAllCapabilitiesResponse);
                    break;
                case 26:
                    AddLocalCapabilityResponse addLocalCapabilityResponse = (AddLocalCapabilityResponse) sgh.a(parcel, AddLocalCapabilityResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAddLocalCapability(addLocalCapabilityResponse);
                    break;
                case 27:
                    RemoveLocalCapabilityResponse removeLocalCapabilityResponse = (RemoveLocalCapabilityResponse) sgh.a(parcel, RemoveLocalCapabilityResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRemoveLocalCapability(removeLocalCapabilityResponse);
                    break;
                case 28:
                    GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse = (GetCloudSyncOptInOutDoneResponse) sgh.a(parcel, GetCloudSyncOptInOutDoneResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCloudSyncOptInOutDone(getCloudSyncOptInOutDoneResponse);
                    break;
                case 29:
                    GetCloudSyncSettingResponse getCloudSyncSettingResponse = (GetCloudSyncSettingResponse) sgh.a(parcel, GetCloudSyncSettingResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCloudSyncSetting(getCloudSyncSettingResponse);
                    break;
                case 30:
                    GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse = (GetCloudSyncOptInStatusResponse) sgh.a(parcel, GetCloudSyncOptInStatusResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCloudSyncOptInStatus(getCloudSyncOptInStatusResponse);
                    break;
                case 34:
                    RpcResponse rpcResponse = (RpcResponse) sgh.a(parcel, RpcResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSendRequest(rpcResponse);
                    break;
                case 35:
                    GetEapIdResponse getEapIdResponse = (GetEapIdResponse) sgh.a(parcel, GetEapIdResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetEapId(getEapIdResponse);
                    break;
                case 36:
                    PerformEapAkaResponse performEapAkaResponse = (PerformEapAkaResponse) sgh.a(parcel, PerformEapAkaResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPerformEapAka(performEapAkaResponse);
                    break;
                case 37:
                    GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse = (GetCompanionPackageForNodeResponse) sgh.a(parcel, GetCompanionPackageForNodeResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCompanionPackageForNode(getCompanionPackageForNodeResponse);
                    break;
                case 38:
                    ConsentResponse consentResponse = (ConsentResponse) sgh.a(parcel, ConsentResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onUserConsentStatus(consentResponse);
                    break;
                case 39:
                    GetNodeIdResponse getNodeIdResponse = (GetNodeIdResponse) sgh.a(parcel, GetNodeIdResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetNodeId(getNodeIdResponse);
                    break;
                case 40:
                    AppRecommendationsResponse appRecommendationsResponse = (AppRecommendationsResponse) sgh.a(parcel, AppRecommendationsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAppRecommendations(appRecommendationsResponse);
                    break;
                case 41:
                    GetAppThemeResponse getAppThemeResponse = (GetAppThemeResponse) sgh.a(parcel, GetAppThemeResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetAppTheme(getAppThemeResponse);
                    break;
                case 42:
                    GetBackupSettingsSupportedResponse getBackupSettingsSupportedResponse = (GetBackupSettingsSupportedResponse) sgh.a(parcel, GetBackupSettingsSupportedResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupSettingsSupported(getBackupSettingsSupportedResponse);
                    break;
                case 43:
                    GetRestoreSupportedResponse getRestoreSupportedResponse = (GetRestoreSupportedResponse) sgh.a(parcel, GetRestoreSupportedResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetRestoreSupported(getRestoreSupportedResponse);
                    break;
                case 46:
                    BooleanResponse booleanResponse = (BooleanResponse) sgh.a(parcel, BooleanResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBooleanResponse(booleanResponse);
                    break;
                case 47:
                    GetRestoreStateResponse getRestoreStateResponse = (GetRestoreStateResponse) sgh.a(parcel, GetRestoreStateResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetRestoreState(getRestoreStateResponse);
                    break;
                case 48:
                    GetFastpairAccountKeysResponse getFastpairAccountKeysResponse = (GetFastpairAccountKeysResponse) sgh.a(parcel, GetFastpairAccountKeysResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetFastpairAccountKeys(getFastpairAccountKeysResponse);
                    break;
                case 49:
                    GetTermsResponse getTermsResponse = (GetTermsResponse) sgh.a(parcel, GetTermsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetTerms(getTermsResponse);
                    break;
                case 50:
                    GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse = (GetFastpairAccountKeyByAccountResponse) sgh.a(parcel, GetFastpairAccountKeyByAccountResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetFastpairAccountKeyByAccount(getFastpairAccountKeyByAccountResponse);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onAddLocalCapability(AddLocalCapabilityResponse addLocalCapabilityResponse);

    void onAppRecommendations(AppRecommendationsResponse appRecommendationsResponse);

    void onBooleanResponse(BooleanResponse booleanResponse);

    void onChannelReceiveFile(ChannelReceiveFileResponse channelReceiveFileResponse);

    void onChannelSendFile(ChannelSendFileResponse channelSendFileResponse);

    void onCloseChannel(CloseChannelResponse closeChannelResponse);

    void onCloseChannelWithError(CloseChannelResponse closeChannelResponse);

    void onDataHolderReady(DataHolder dataHolder);

    void onDeleteDataItem(DeleteDataItemsResponse deleteDataItemsResponse);

    void onGetAllCapabilities(GetAllCapabilitiesResponse getAllCapabilitiesResponse);

    void onGetAppTheme(GetAppThemeResponse getAppThemeResponse);

    void onGetBackupSettingsSupported(GetBackupSettingsSupportedResponse getBackupSettingsSupportedResponse);

    void onGetCapability(GetCapabilityResponse getCapabilityResponse);

    void onGetChannelInputStream(GetChannelInputStreamResponse getChannelInputStreamResponse);

    void onGetChannelOutputStream(GetChannelOutputStreamResponse getChannelOutputStreamResponse);

    void onGetCloudSyncOptInOutDone(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse);

    void onGetCloudSyncOptInStatus(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse);

    void onGetCloudSyncSetting(GetCloudSyncSettingResponse getCloudSyncSettingResponse);

    void onGetCompanionPackageForNode(GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse);

    void onGetConfig(GetConfigResponse getConfigResponse);

    void onGetConfigs(GetConfigsResponse getConfigsResponse);

    void onGetConnectedNodes(GetConnectedNodesResponse getConnectedNodesResponse);

    void onGetDataItem(GetDataItemResponse getDataItemResponse);

    void onGetEapId(GetEapIdResponse getEapIdResponse);

    void onGetFastpairAccountKeyByAccount(GetFastpairAccountKeyByAccountResponse getFastpairAccountKeyByAccountResponse);

    void onGetFastpairAccountKeys(GetFastpairAccountKeysResponse getFastpairAccountKeysResponse);

    void onGetFdForAsset(GetFdForAssetResponse getFdForAssetResponse);

    void onGetLocalNode(GetLocalNodeResponse getLocalNodeResponse);

    void onGetNodeId(GetNodeIdResponse getNodeIdResponse);

    void onGetRestoreState(GetRestoreStateResponse getRestoreStateResponse);

    void onGetRestoreSupported(GetRestoreSupportedResponse getRestoreSupportedResponse);

    void onGetStorageInformation(StorageInfoResponse storageInfoResponse);

    void onGetTerms(GetTermsResponse getTermsResponse);

    void onOpenChannelCompleted(OpenChannelResponse openChannelResponse);

    void onPerformEapAka(PerformEapAkaResponse performEapAkaResponse);

    void onPutData(PutDataResponse putDataResponse);

    void onRemoveLocalCapability(RemoveLocalCapabilityResponse removeLocalCapabilityResponse);

    void onSendMessage(SendMessageResponse sendMessageResponse);

    void onSendRequest(RpcResponse rpcResponse);

    void onStatus(Status status);

    void onUserConsentStatus(ConsentResponse consentResponse);
}
