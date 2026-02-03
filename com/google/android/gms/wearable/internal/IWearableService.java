package com.google.android.gms.wearable.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConstants;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.wearable.AppRecommendationsRequest;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayConfig;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.IChannelStreamCallbacks;
import com.google.android.gms.wearable.internal.IConnectionCallback;
import com.google.android.gms.wearable.internal.IWearableCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWearableService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWearableService {
        static final int TRANSACTION_acceptRingingCall = 26;
        static final int TRANSACTION_acceptTerms = 94;
        static final int TRANSACTION_addAccountToConsent = 66;
        static final int TRANSACTION_addListener = 16;
        static final int TRANSACTION_addLocalCapability = 46;
        static final int TRANSACTION_addSupervisedAccount = 70;
        static final int TRANSACTION_associateDeviceAndAccountWithFastPair = 64;
        static final int TRANSACTION_awaitDataSyncCompletion = 93;
        static final int TRANSACTION_cancelMigration = 76;
        static final int TRANSACTION_clearStorage = 19;
        static final int TRANSACTION_closeChannel = 32;
        static final int TRANSACTION_closeChannelWithError = 33;
        static final int TRANSACTION_deleteDataItems = 11;
        static final int TRANSACTION_deleteDataItemsByUriFilter = 41;
        static final int TRANSACTION_disableConnection = 5;
        static final int TRANSACTION_disableDeviceConnection = 24;
        static final int TRANSACTION_doAncsNegativeAction = 29;
        static final int TRANSACTION_doAncsPositiveAction = 28;
        static final int TRANSACTION_enableConnection = 4;
        static final int TRANSACTION_enableDeviceConnection = 23;
        static final int TRANSACTION_endCall = 25;
        static final int TRANSACTION_flushBatchedData = 103;
        static final int TRANSACTION_flushLogs = 109;
        static final int TRANSACTION_getAllCapabilities = 43;
        static final int TRANSACTION_getAppTheme = 78;
        static final int TRANSACTION_getBackupEnabled = 91;
        static final int TRANSACTION_getBackupSettingsSupported = 79;
        static final int TRANSACTION_getCanonicalAppTheme = 110;
        static final int TRANSACTION_getCapability = 42;
        static final int TRANSACTION_getChannelInputStream = 34;
        static final int TRANSACTION_getChannelOutputStream = 35;
        static final int TRANSACTION_getCloudSyncOptInOutDone = 49;
        static final int TRANSACTION_getCloudSyncOptInStatus = 52;
        static final int TRANSACTION_getCloudSyncSetting = 51;
        static final int TRANSACTION_getCompanionPackageForNode = 63;
        static final int TRANSACTION_getConfig = 3;
        static final int TRANSACTION_getConfigs = 22;
        static final int TRANSACTION_getConnectedNodes = 15;
        static final int TRANSACTION_getDataItem = 7;
        static final int TRANSACTION_getDataItems = 8;
        static final int TRANSACTION_getDataItemsByUri = 9;
        static final int TRANSACTION_getDataItemsByUriFilter = 40;
        static final int TRANSACTION_getEapId = 61;
        static final int TRANSACTION_getFastpairAccountKeyByAccount = 97;
        static final int TRANSACTION_getFastpairAccountKeys = 92;
        static final int TRANSACTION_getFdForAsset = 13;
        static final int TRANSACTION_getLocalNode = 14;
        static final int TRANSACTION_getNodeId = 67;
        static final int TRANSACTION_getPhoneSwitchingEnabled = 85;
        static final int TRANSACTION_getRecommendedApps = 68;
        static final int TRANSACTION_getRelatedConfigs = 73;
        static final int TRANSACTION_getRestoreState = 87;
        static final int TRANSACTION_getRestoreSupported = 80;
        static final int TRANSACTION_getStorageInformation = 18;
        static final int TRANSACTION_getTerms = 96;
        static final int TRANSACTION_getUserConsentStatus = 65;
        static final int TRANSACTION_getUserConsentStatusForWatch = 104;
        static final int TRANSACTION_injectAncsNotificationForTesting = 27;
        static final int TRANSACTION_isNodeActiveNetworkMetered = 90;
        static final int TRANSACTION_isRestoreOngoing = 111;
        static final int TRANSACTION_logCounter = 106;
        static final int TRANSACTION_logEvent = 107;
        static final int TRANSACTION_logTimer = 108;
        static final int TRANSACTION_migrateToConsentsPerWatch = 102;
        static final int TRANSACTION_openChannel = 31;
        static final int TRANSACTION_optInCloudSync = 48;
        static final int TRANSACTION_performEapAka = 62;
        static final int TRANSACTION_putConfig = 20;
        static final int TRANSACTION_putData = 6;
        static final int TRANSACTION_readChannelOutputFromFileDescriptor = 39;
        static final int TRANSACTION_recordConsentUntetheredSupervisedAccountTransfer = 105;
        static final int TRANSACTION_recordOptIn = 71;
        static final int TRANSACTION_recordSwaadlOptIn = 84;
        static final int TRANSACTION_recordTermConsent = 95;
        static final int TRANSACTION_releaseConnectionRequest = 113;
        static final int TRANSACTION_removeConfig = 21;
        static final int TRANSACTION_removeListener = 17;
        static final int TRANSACTION_removeLocalCapability = 47;
        static final int TRANSACTION_requestConnection = 112;
        static final int TRANSACTION_retryDeviceConnection = 69;
        static final int TRANSACTION_saveRestoreState = 86;
        static final int TRANSACTION_sendAmsRemoteCommand = 53;
        static final int TRANSACTION_sendMessage = 12;
        static final int TRANSACTION_sendMessageWithOptions = 59;
        static final int TRANSACTION_sendRequest = 58;
        static final int TRANSACTION_sendRequestWithOptions = 60;
        static final int TRANSACTION_setCloudSyncSetting = 50;
        static final int TRANSACTION_setCloudSyncSettingByNode = 75;
        static final int TRANSACTION_setConfig = 2;
        static final int TRANSACTION_setThemeForApp = 77;
        static final int TRANSACTION_silenceRinger = 30;
        static final int TRANSACTION_startRestoreSession = 82;
        static final int TRANSACTION_syncConnectedWifiCredential = 89;
        static final int TRANSACTION_syncWifiCredential = 88;
        static final int TRANSACTION_syncWifiCredentials = 37;
        static final int TRANSACTION_updateConfig = 74;
        static final int TRANSACTION_updateConnectionStrategy = 72;
        static final int TRANSACTION_updateDelayConfig = 101;
        static final int TRANSACTION_writeChannelInputToFileDescriptor = 38;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWearableService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void acceptRingingCall(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void acceptTerms(IWearableCallbacks iWearableCallbacks, AcceptTermsRequest acceptTermsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, acceptTermsRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_acceptTerms, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addAccountToConsent(IWearableCallbacks iWearableCallbacks, AddAccountToConsentRequest addAccountToConsentRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, addAccountToConsentRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addAccountToConsent, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addListener(IWearableCallbacks iWearableCallbacks, AddListenerRequest addListenerRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, addListenerRequest);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addLocalCapability(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(46, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void addSupervisedAccount(IWearableCallbacks iWearableCallbacks, AddSupervisedAccountRequest addSupervisedAccountRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, addSupervisedAccountRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addSupervisedAccount, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void associateDeviceAndAccountWithFastPair(IWearableCallbacks iWearableCallbacks, String str, Account account, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(64, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void awaitDataSyncCompletion(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_awaitDataSyncCompletion, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void cancelMigration(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_cancelMigration, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void clearStorage(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void closeChannel(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(32, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void closeChannelWithError(IWearableCallbacks iWearableCallbacks, String str, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(33, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void deleteDataItems(IWearableCallbacks iWearableCallbacks, Uri uri) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void deleteDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(41, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void disableConnection(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void disableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void doAncsNegativeAction(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void doAncsPositiveAction(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(28, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void enableConnection(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void enableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void endCall(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void flushBatchedData(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushBatchedData, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void flushLogs(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushLogs, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getAllCapabilities(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(43, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getAppTheme(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getAppTheme, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getBackupEnabled(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupEnabled, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getBackupSettingsSupported(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupSettingsSupported, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCanonicalAppTheme(IWearableCallbacks iWearableCallbacks, AppTheme appTheme) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, appTheme);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCanonicalAppTheme, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCapability(IWearableCallbacks iWearableCallbacks, String str, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(42, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getChannelInputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.f(parcelObtainAndWriteInterfaceToken, iChannelStreamCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(34, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getChannelOutputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.f(parcelObtainAndWriteInterfaceToken, iChannelStreamCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(35, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCloudSyncOptInOutDone(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(49, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCloudSyncOptInStatus(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCloudSyncOptInStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCloudSyncSetting(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCloudSyncSetting, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getCompanionPackageForNode(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(63, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getConfig(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getConfigs(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getConnectedNodes(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItem(IWearableCallbacks iWearableCallbacks, Uri uri) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItems(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItemsByUri(IWearableCallbacks iWearableCallbacks, Uri uri) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(40, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getEapId(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getEapId, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getFastpairAccountKeyByAccount(IWearableCallbacks iWearableCallbacks, Account account) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getFastpairAccountKeyByAccount, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getFastpairAccountKeys(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getFastpairAccountKeys, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getFdForAsset(IWearableCallbacks iWearableCallbacks, Asset asset) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, asset);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getLocalNode(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getNodeId(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getNodeId, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getPhoneSwitchingEnabled(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getPhoneSwitchingEnabled, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRecommendedApps(IWearableCallbacks iWearableCallbacks, AppRecommendationsRequest appRecommendationsRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, appRecommendationsRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getRecommendedApps, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRelatedConfigs(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getRelatedConfigs, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRestoreState(IWearableCallbacks iWearableCallbacks, GetRestoreStateRequest getRestoreStateRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getRestoreStateRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getRestoreState, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getRestoreSupported(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(80, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getStorageInformation(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getTerms(IWearableCallbacks iWearableCallbacks, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(96, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getUserConsentStatus(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getUserConsentStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void getUserConsentStatusForWatch(IWearableCallbacks iWearableCallbacks, ConsentStatusRequest consentStatusRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, consentStatusRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getUserConsentStatusForWatch, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void injectAncsNotificationForTesting(IWearableCallbacks iWearableCallbacks, AncsNotificationParcelable ancsNotificationParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, ancsNotificationParcelable);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void isNodeActiveNetworkMetered(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isNodeActiveNetworkMetered, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void isRestoreOngoing(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isRestoreOngoing, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void logCounter(IWearableCallbacks iWearableCallbacks, LogCounterRequest logCounterRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, logCounterRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_logCounter, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void logEvent(IWearableCallbacks iWearableCallbacks, LogEventRequest logEventRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, logEventRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_logEvent, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void logTimer(IWearableCallbacks iWearableCallbacks, LogTimerRequest logTimerRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, logTimerRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_logTimer, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void migrateToConsentsPerWatch(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_migrateToConsentsPerWatch, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void openChannel(IWearableCallbacks iWearableCallbacks, String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void optInCloudSync(IWearableCallbacks iWearableCallbacks, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(48, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void performEapAka(IWearableCallbacks iWearableCallbacks, int i, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_performEapAka, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void putConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void putData(IWearableCallbacks iWearableCallbacks, PutDataRequest putDataRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, putDataRequest);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void readChannelOutputFromFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeLong(j2);
                transactAndReadExceptionReturnVoid(39, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordConsentUntetheredSupervisedAccountTransfer(IWearableCallbacks iWearableCallbacks, RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, recordUntetheredSupervisedAccountTransferRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordConsentUntetheredSupervisedAccountTransfer, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordOptIn(IWearableCallbacks iWearableCallbacks, PrivacyRecordOptinRequest privacyRecordOptinRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, privacyRecordOptinRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordOptIn, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordSwaadlOptIn(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordSwaadlOptIn, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void recordTermConsent(IWearableCallbacks iWearableCallbacks, RecordTermConsentRequest recordTermConsentRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, recordTermConsentRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordTermConsent, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void releaseConnectionRequest(IWearableCallbacks iWearableCallbacks, IConnectionCallback iConnectionCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.f(parcelObtainAndWriteInterfaceToken, iConnectionCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_releaseConnectionRequest, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void removeConfig(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void removeListener(IWearableCallbacks iWearableCallbacks, RemoveListenerRequest removeListenerRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, removeListenerRequest);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void removeLocalCapability(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(47, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void requestConnection(IWearableCallbacks iWearableCallbacks, RequestConnectionParcelable requestConnectionParcelable, IConnectionCallback iConnectionCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, requestConnectionParcelable);
                sgh.f(parcelObtainAndWriteInterfaceToken, iConnectionCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestConnection, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void retryDeviceConnection(IWearableCallbacks iWearableCallbacks, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_retryDeviceConnection, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void saveRestoreState(IWearableCallbacks iWearableCallbacks, SaveRestoreStateRequest saveRestoreStateRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, saveRestoreStateRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_saveRestoreState, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendAmsRemoteCommand(IWearableCallbacks iWearableCallbacks, byte b) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeByte(b);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendAmsRemoteCommand, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendMessage(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendMessageWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, messageOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendMessageWithOptions, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendRequest(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendRequest, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void sendRequestWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, messageOptions);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_sendRequestWithOptions, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setCloudSyncSetting(IWearableCallbacks iWearableCallbacks, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(50, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setCloudSyncSettingByNode(IWearableCallbacks iWearableCallbacks, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setCloudSyncSettingByNode, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void setThemeForApp(IWearableCallbacks iWearableCallbacks, AppTheme appTheme) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, appTheme);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setThemeForApp, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void silenceRinger(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(30, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void startRestoreSession(IWearableCallbacks iWearableCallbacks, StartRestoreSessionRequest startRestoreSessionRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, startRestoreSessionRequest);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_startRestoreSession, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void syncConnectedWifiCredential(IWearableCallbacks iWearableCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_syncConnectedWifiCredential, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void syncWifiCredential(IWearableCallbacks iWearableCallbacks, String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_syncWifiCredential, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void syncWifiCredentials(IWearableCallbacks iWearableCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                transactAndReadExceptionReturnVoid(37, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void updateConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, connectionConfiguration);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateConfig, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void updateConnectionStrategy(IWearableCallbacks iWearableCallbacks, String str, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateConnectionStrategy, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void updateDelayConfig(IWearableCallbacks iWearableCallbacks, ConnectionDelayConfig connectionDelayConfig) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, connectionDelayConfig);
                transactAndReadExceptionReturnVoid(101, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wearable.internal.IWearableService
            public void writeChannelInputToFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iWearableCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactAndReadExceptionReturnVoid(38, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IWearableService");
        }

        public static IWearableService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            return iInterfaceQueryLocalInterface instanceof IWearableService ? (IWearableService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IWearableCallbacks iWearableCallbacksAsInterface = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) sgh.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    setConfig(iWearableCallbacksAsInterface, connectionConfiguration);
                    break;
                case 3:
                    IWearableCallbacks iWearableCallbacksAsInterface2 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getConfig(iWearableCallbacksAsInterface2);
                    break;
                case 4:
                    IWearableCallbacks iWearableCallbacksAsInterface3 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    enableConnection(iWearableCallbacksAsInterface3);
                    break;
                case 5:
                    IWearableCallbacks iWearableCallbacksAsInterface4 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    disableConnection(iWearableCallbacksAsInterface4);
                    break;
                case 6:
                    IWearableCallbacks iWearableCallbacksAsInterface5 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PutDataRequest putDataRequest = (PutDataRequest) sgh.a(parcel, PutDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    putData(iWearableCallbacksAsInterface5, putDataRequest);
                    break;
                case 7:
                    IWearableCallbacks iWearableCallbacksAsInterface6 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) sgh.a(parcel, Uri.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDataItem(iWearableCallbacksAsInterface6, uri);
                    break;
                case 8:
                    IWearableCallbacks iWearableCallbacksAsInterface7 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDataItems(iWearableCallbacksAsInterface7);
                    break;
                case 9:
                    IWearableCallbacks iWearableCallbacksAsInterface8 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri2 = (Uri) sgh.a(parcel, Uri.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDataItemsByUri(iWearableCallbacksAsInterface8, uri2);
                    break;
                case 10:
                case 36:
                case 44:
                case 45:
                case 54:
                case 55:
                case 56:
                case 57:
                case 81:
                case 83:
                case 98:
                case 99:
                case VCardConstants.DEFAULT_PREF /* 100 */:
                default:
                    return false;
                case 11:
                    IWearableCallbacks iWearableCallbacksAsInterface9 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri3 = (Uri) sgh.a(parcel, Uri.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteDataItems(iWearableCallbacksAsInterface9, uri3);
                    break;
                case 12:
                    IWearableCallbacks iWearableCallbacksAsInterface10 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    sendMessage(iWearableCallbacksAsInterface10, string, string2, bArrCreateByteArray);
                    break;
                case 13:
                    IWearableCallbacks iWearableCallbacksAsInterface11 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Asset asset = (Asset) sgh.a(parcel, Asset.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFdForAsset(iWearableCallbacksAsInterface11, asset);
                    break;
                case 14:
                    IWearableCallbacks iWearableCallbacksAsInterface12 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getLocalNode(iWearableCallbacksAsInterface12);
                    break;
                case 15:
                    IWearableCallbacks iWearableCallbacksAsInterface13 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getConnectedNodes(iWearableCallbacksAsInterface13);
                    break;
                case 16:
                    IWearableCallbacks iWearableCallbacksAsInterface14 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AddListenerRequest addListenerRequest = (AddListenerRequest) sgh.a(parcel, AddListenerRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    addListener(iWearableCallbacksAsInterface14, addListenerRequest);
                    break;
                case 17:
                    IWearableCallbacks iWearableCallbacksAsInterface15 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RemoveListenerRequest removeListenerRequest = (RemoveListenerRequest) sgh.a(parcel, RemoveListenerRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeListener(iWearableCallbacksAsInterface15, removeListenerRequest);
                    break;
                case 18:
                    IWearableCallbacks iWearableCallbacksAsInterface16 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getStorageInformation(iWearableCallbacksAsInterface16);
                    break;
                case 19:
                    IWearableCallbacks iWearableCallbacksAsInterface17 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    clearStorage(iWearableCallbacksAsInterface17);
                    break;
                case 20:
                    IWearableCallbacks iWearableCallbacksAsInterface18 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) sgh.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    putConfig(iWearableCallbacksAsInterface18, connectionConfiguration2);
                    break;
                case 21:
                    IWearableCallbacks iWearableCallbacksAsInterface19 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeConfig(iWearableCallbacksAsInterface19, string3);
                    break;
                case 22:
                    IWearableCallbacks iWearableCallbacksAsInterface20 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getConfigs(iWearableCallbacksAsInterface20);
                    break;
                case 23:
                    IWearableCallbacks iWearableCallbacksAsInterface21 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    enableDeviceConnection(iWearableCallbacksAsInterface21, string4);
                    break;
                case 24:
                    IWearableCallbacks iWearableCallbacksAsInterface22 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    disableDeviceConnection(iWearableCallbacksAsInterface22, string5);
                    break;
                case 25:
                    IWearableCallbacks iWearableCallbacksAsInterface23 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    endCall(iWearableCallbacksAsInterface23);
                    break;
                case 26:
                    IWearableCallbacks iWearableCallbacksAsInterface24 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    acceptRingingCall(iWearableCallbacksAsInterface24);
                    break;
                case 27:
                    IWearableCallbacks iWearableCallbacksAsInterface25 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) sgh.a(parcel, AncsNotificationParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    injectAncsNotificationForTesting(iWearableCallbacksAsInterface25, ancsNotificationParcelable);
                    break;
                case 28:
                    IWearableCallbacks iWearableCallbacksAsInterface26 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    doAncsPositiveAction(iWearableCallbacksAsInterface26, i3);
                    break;
                case 29:
                    IWearableCallbacks iWearableCallbacksAsInterface27 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    doAncsNegativeAction(iWearableCallbacksAsInterface27, i4);
                    break;
                case 30:
                    IWearableCallbacks iWearableCallbacksAsInterface28 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    silenceRinger(iWearableCallbacksAsInterface28);
                    break;
                case 31:
                    IWearableCallbacks iWearableCallbacksAsInterface29 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    openChannel(iWearableCallbacksAsInterface29, string6, string7);
                    break;
                case 32:
                    IWearableCallbacks iWearableCallbacksAsInterface30 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    closeChannel(iWearableCallbacksAsInterface30, string8);
                    break;
                case 33:
                    IWearableCallbacks iWearableCallbacksAsInterface31 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    closeChannelWithError(iWearableCallbacksAsInterface31, string9, i5);
                    break;
                case 34:
                    IWearableCallbacks iWearableCallbacksAsInterface32 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    IChannelStreamCallbacks iChannelStreamCallbacksAsInterface = IChannelStreamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string10 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getChannelInputStream(iWearableCallbacksAsInterface32, iChannelStreamCallbacksAsInterface, string10);
                    break;
                case 35:
                    IWearableCallbacks iWearableCallbacksAsInterface33 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    IChannelStreamCallbacks iChannelStreamCallbacksAsInterface2 = IChannelStreamCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getChannelOutputStream(iWearableCallbacksAsInterface33, iChannelStreamCallbacksAsInterface2, string11);
                    break;
                case 37:
                    IWearableCallbacks iWearableCallbacksAsInterface34 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    syncWifiCredentials(iWearableCallbacksAsInterface34);
                    break;
                case 38:
                    IWearableCallbacks iWearableCallbacksAsInterface35 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string12 = parcel.readString();
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeChannelInputToFileDescriptor(iWearableCallbacksAsInterface35, string12, parcelFileDescriptor);
                    break;
                case 39:
                    IWearableCallbacks iWearableCallbacksAsInterface36 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string13 = parcel.readString();
                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) sgh.a(parcel, ParcelFileDescriptor.CREATOR);
                    long j = parcel.readLong();
                    long j2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    readChannelOutputFromFileDescriptor(iWearableCallbacksAsInterface36, string13, parcelFileDescriptor2, j, j2);
                    break;
                case 40:
                    IWearableCallbacks iWearableCallbacksAsInterface37 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri4 = (Uri) sgh.a(parcel, Uri.CREATOR);
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getDataItemsByUriFilter(iWearableCallbacksAsInterface37, uri4, i6);
                    break;
                case 41:
                    IWearableCallbacks iWearableCallbacksAsInterface38 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri5 = (Uri) sgh.a(parcel, Uri.CREATOR);
                    int i7 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    deleteDataItemsByUriFilter(iWearableCallbacksAsInterface38, uri5, i7);
                    break;
                case 42:
                    IWearableCallbacks iWearableCallbacksAsInterface39 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string14 = parcel.readString();
                    int i8 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getCapability(iWearableCallbacksAsInterface39, string14, i8);
                    break;
                case 43:
                    IWearableCallbacks iWearableCallbacksAsInterface40 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i9 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getAllCapabilities(iWearableCallbacksAsInterface40, i9);
                    break;
                case 46:
                    IWearableCallbacks iWearableCallbacksAsInterface41 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string15 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    addLocalCapability(iWearableCallbacksAsInterface41, string15);
                    break;
                case 47:
                    IWearableCallbacks iWearableCallbacksAsInterface42 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string16 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeLocalCapability(iWearableCallbacksAsInterface42, string16);
                    break;
                case 48:
                    IWearableCallbacks iWearableCallbacksAsInterface43 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    optInCloudSync(iWearableCallbacksAsInterface43, zG);
                    break;
                case 49:
                    IWearableCallbacks iWearableCallbacksAsInterface44 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCloudSyncOptInOutDone(iWearableCallbacksAsInterface44);
                    break;
                case 50:
                    IWearableCallbacks iWearableCallbacksAsInterface45 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setCloudSyncSetting(iWearableCallbacksAsInterface45, zG2);
                    break;
                case TRANSACTION_getCloudSyncSetting /* 51 */:
                    IWearableCallbacks iWearableCallbacksAsInterface46 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCloudSyncSetting(iWearableCallbacksAsInterface46);
                    break;
                case TRANSACTION_getCloudSyncOptInStatus /* 52 */:
                    IWearableCallbacks iWearableCallbacksAsInterface47 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getCloudSyncOptInStatus(iWearableCallbacksAsInterface47);
                    break;
                case TRANSACTION_sendAmsRemoteCommand /* 53 */:
                    IWearableCallbacks iWearableCallbacksAsInterface48 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte b = parcel.readByte();
                    enforceNoDataAvail(parcel);
                    sendAmsRemoteCommand(iWearableCallbacksAsInterface48, b);
                    break;
                case TRANSACTION_sendRequest /* 58 */:
                    IWearableCallbacks iWearableCallbacksAsInterface49 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    sendRequest(iWearableCallbacksAsInterface49, string17, string18, bArrCreateByteArray2);
                    break;
                case TRANSACTION_sendMessageWithOptions /* 59 */:
                    IWearableCallbacks iWearableCallbacksAsInterface50 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string19 = parcel.readString();
                    String string20 = parcel.readString();
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    MessageOptions messageOptions = (MessageOptions) sgh.a(parcel, MessageOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    sendMessageWithOptions(iWearableCallbacksAsInterface50, string19, string20, bArrCreateByteArray3, messageOptions);
                    break;
                case TRANSACTION_sendRequestWithOptions /* 60 */:
                    IWearableCallbacks iWearableCallbacksAsInterface51 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string21 = parcel.readString();
                    String string22 = parcel.readString();
                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
                    MessageOptions messageOptions2 = (MessageOptions) sgh.a(parcel, MessageOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    sendRequestWithOptions(iWearableCallbacksAsInterface51, string21, string22, bArrCreateByteArray4, messageOptions2);
                    break;
                case TRANSACTION_getEapId /* 61 */:
                    IWearableCallbacks iWearableCallbacksAsInterface52 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i10 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getEapId(iWearableCallbacksAsInterface52, i10);
                    break;
                case TRANSACTION_performEapAka /* 62 */:
                    IWearableCallbacks iWearableCallbacksAsInterface53 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i11 = parcel.readInt();
                    String string23 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    performEapAka(iWearableCallbacksAsInterface53, i11, string23);
                    break;
                case 63:
                    IWearableCallbacks iWearableCallbacksAsInterface54 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string24 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getCompanionPackageForNode(iWearableCallbacksAsInterface54, string24);
                    break;
                case 64:
                    IWearableCallbacks iWearableCallbacksAsInterface55 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string25 = parcel.readString();
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    String string26 = parcel.readString();
                    String string27 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    associateDeviceAndAccountWithFastPair(iWearableCallbacksAsInterface55, string25, account, string26, string27);
                    break;
                case TRANSACTION_getUserConsentStatus /* 65 */:
                    IWearableCallbacks iWearableCallbacksAsInterface56 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getUserConsentStatus(iWearableCallbacksAsInterface56);
                    break;
                case TRANSACTION_addAccountToConsent /* 66 */:
                    IWearableCallbacks iWearableCallbacksAsInterface57 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AddAccountToConsentRequest addAccountToConsentRequest = (AddAccountToConsentRequest) sgh.a(parcel, AddAccountToConsentRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    addAccountToConsent(iWearableCallbacksAsInterface57, addAccountToConsentRequest);
                    break;
                case TRANSACTION_getNodeId /* 67 */:
                    IWearableCallbacks iWearableCallbacksAsInterface58 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string28 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getNodeId(iWearableCallbacksAsInterface58, string28);
                    break;
                case TRANSACTION_getRecommendedApps /* 68 */:
                    IWearableCallbacks iWearableCallbacksAsInterface59 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AppRecommendationsRequest appRecommendationsRequest = (AppRecommendationsRequest) sgh.a(parcel, AppRecommendationsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getRecommendedApps(iWearableCallbacksAsInterface59, appRecommendationsRequest);
                    break;
                case TRANSACTION_retryDeviceConnection /* 69 */:
                    IWearableCallbacks iWearableCallbacksAsInterface60 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string29 = parcel.readString();
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    retryDeviceConnection(iWearableCallbacksAsInterface60, string29, zG3);
                    break;
                case TRANSACTION_addSupervisedAccount /* 70 */:
                    IWearableCallbacks iWearableCallbacksAsInterface61 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AddSupervisedAccountRequest addSupervisedAccountRequest = (AddSupervisedAccountRequest) sgh.a(parcel, AddSupervisedAccountRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    addSupervisedAccount(iWearableCallbacksAsInterface61, addSupervisedAccountRequest);
                    break;
                case TRANSACTION_recordOptIn /* 71 */:
                    IWearableCallbacks iWearableCallbacksAsInterface62 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    PrivacyRecordOptinRequest privacyRecordOptinRequest = (PrivacyRecordOptinRequest) sgh.a(parcel, PrivacyRecordOptinRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordOptIn(iWearableCallbacksAsInterface62, privacyRecordOptinRequest);
                    break;
                case TRANSACTION_updateConnectionStrategy /* 72 */:
                    IWearableCallbacks iWearableCallbacksAsInterface63 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string30 = parcel.readString();
                    int i12 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateConnectionStrategy(iWearableCallbacksAsInterface63, string30, i12);
                    break;
                case TRANSACTION_getRelatedConfigs /* 73 */:
                    IWearableCallbacks iWearableCallbacksAsInterface64 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getRelatedConfigs(iWearableCallbacksAsInterface64);
                    break;
                case TRANSACTION_updateConfig /* 74 */:
                    IWearableCallbacks iWearableCallbacksAsInterface65 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration3 = (ConnectionConfiguration) sgh.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateConfig(iWearableCallbacksAsInterface65, connectionConfiguration3);
                    break;
                case TRANSACTION_setCloudSyncSettingByNode /* 75 */:
                    IWearableCallbacks iWearableCallbacksAsInterface66 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string31 = parcel.readString();
                    boolean zG4 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setCloudSyncSettingByNode(iWearableCallbacksAsInterface66, string31, zG4);
                    break;
                case TRANSACTION_cancelMigration /* 76 */:
                    IWearableCallbacks iWearableCallbacksAsInterface67 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionConfiguration connectionConfiguration4 = (ConnectionConfiguration) sgh.a(parcel, ConnectionConfiguration.CREATOR);
                    enforceNoDataAvail(parcel);
                    cancelMigration(iWearableCallbacksAsInterface67, connectionConfiguration4);
                    break;
                case TRANSACTION_setThemeForApp /* 77 */:
                    IWearableCallbacks iWearableCallbacksAsInterface68 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AppTheme appTheme = (AppTheme) sgh.a(parcel, AppTheme.CREATOR);
                    enforceNoDataAvail(parcel);
                    setThemeForApp(iWearableCallbacksAsInterface68, appTheme);
                    break;
                case TRANSACTION_getAppTheme /* 78 */:
                    IWearableCallbacks iWearableCallbacksAsInterface69 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string32 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAppTheme(iWearableCallbacksAsInterface69, string32);
                    break;
                case TRANSACTION_getBackupSettingsSupported /* 79 */:
                    IWearableCallbacks iWearableCallbacksAsInterface70 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string33 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getBackupSettingsSupported(iWearableCallbacksAsInterface70, string33);
                    break;
                case 80:
                    IWearableCallbacks iWearableCallbacksAsInterface71 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getRestoreSupported(iWearableCallbacksAsInterface71);
                    break;
                case TRANSACTION_startRestoreSession /* 82 */:
                    IWearableCallbacks iWearableCallbacksAsInterface72 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    StartRestoreSessionRequest startRestoreSessionRequest = (StartRestoreSessionRequest) sgh.a(parcel, StartRestoreSessionRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    startRestoreSession(iWearableCallbacksAsInterface72, startRestoreSessionRequest);
                    break;
                case TRANSACTION_recordSwaadlOptIn /* 84 */:
                    IWearableCallbacks iWearableCallbacksAsInterface73 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    recordSwaadlOptIn(iWearableCallbacksAsInterface73);
                    break;
                case TRANSACTION_getPhoneSwitchingEnabled /* 85 */:
                    IWearableCallbacks iWearableCallbacksAsInterface74 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getPhoneSwitchingEnabled(iWearableCallbacksAsInterface74);
                    break;
                case TRANSACTION_saveRestoreState /* 86 */:
                    IWearableCallbacks iWearableCallbacksAsInterface75 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    SaveRestoreStateRequest saveRestoreStateRequest = (SaveRestoreStateRequest) sgh.a(parcel, SaveRestoreStateRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    saveRestoreState(iWearableCallbacksAsInterface75, saveRestoreStateRequest);
                    break;
                case TRANSACTION_getRestoreState /* 87 */:
                    IWearableCallbacks iWearableCallbacksAsInterface76 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetRestoreStateRequest getRestoreStateRequest = (GetRestoreStateRequest) sgh.a(parcel, GetRestoreStateRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getRestoreState(iWearableCallbacksAsInterface76, getRestoreStateRequest);
                    break;
                case TRANSACTION_syncWifiCredential /* 88 */:
                    IWearableCallbacks iWearableCallbacksAsInterface77 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string34 = parcel.readString();
                    String string35 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    syncWifiCredential(iWearableCallbacksAsInterface77, string34, string35);
                    break;
                case TRANSACTION_syncConnectedWifiCredential /* 89 */:
                    IWearableCallbacks iWearableCallbacksAsInterface78 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string36 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    syncConnectedWifiCredential(iWearableCallbacksAsInterface78, string36);
                    break;
                case TRANSACTION_isNodeActiveNetworkMetered /* 90 */:
                    IWearableCallbacks iWearableCallbacksAsInterface79 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string37 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    isNodeActiveNetworkMetered(iWearableCallbacksAsInterface79, string37);
                    break;
                case TRANSACTION_getBackupEnabled /* 91 */:
                    IWearableCallbacks iWearableCallbacksAsInterface80 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string38 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getBackupEnabled(iWearableCallbacksAsInterface80, string38);
                    break;
                case TRANSACTION_getFastpairAccountKeys /* 92 */:
                    IWearableCallbacks iWearableCallbacksAsInterface81 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getFastpairAccountKeys(iWearableCallbacksAsInterface81);
                    break;
                case TRANSACTION_awaitDataSyncCompletion /* 93 */:
                    IWearableCallbacks iWearableCallbacksAsInterface82 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string39 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    awaitDataSyncCompletion(iWearableCallbacksAsInterface82, string39);
                    break;
                case TRANSACTION_acceptTerms /* 94 */:
                    IWearableCallbacks iWearableCallbacksAsInterface83 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AcceptTermsRequest acceptTermsRequest = (AcceptTermsRequest) sgh.a(parcel, AcceptTermsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    acceptTerms(iWearableCallbacksAsInterface83, acceptTermsRequest);
                    break;
                case TRANSACTION_recordTermConsent /* 95 */:
                    IWearableCallbacks iWearableCallbacksAsInterface84 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RecordTermConsentRequest recordTermConsentRequest = (RecordTermConsentRequest) sgh.a(parcel, RecordTermConsentRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordTermConsent(iWearableCallbacksAsInterface84, recordTermConsentRequest);
                    break;
                case 96:
                    IWearableCallbacks iWearableCallbacksAsInterface85 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int i13 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getTerms(iWearableCallbacksAsInterface85, i13);
                    break;
                case TRANSACTION_getFastpairAccountKeyByAccount /* 97 */:
                    IWearableCallbacks iWearableCallbacksAsInterface86 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFastpairAccountKeyByAccount(iWearableCallbacksAsInterface86, account2);
                    break;
                case 101:
                    IWearableCallbacks iWearableCallbacksAsInterface87 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConnectionDelayConfig connectionDelayConfig = (ConnectionDelayConfig) sgh.a(parcel, ConnectionDelayConfig.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateDelayConfig(iWearableCallbacksAsInterface87, connectionDelayConfig);
                    break;
                case TRANSACTION_migrateToConsentsPerWatch /* 102 */:
                    IWearableCallbacks iWearableCallbacksAsInterface88 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string40 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    migrateToConsentsPerWatch(iWearableCallbacksAsInterface88, string40);
                    break;
                case TRANSACTION_flushBatchedData /* 103 */:
                    IWearableCallbacks iWearableCallbacksAsInterface89 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string41 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    flushBatchedData(iWearableCallbacksAsInterface89, string41);
                    break;
                case TRANSACTION_getUserConsentStatusForWatch /* 104 */:
                    IWearableCallbacks iWearableCallbacksAsInterface90 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ConsentStatusRequest consentStatusRequest = (ConsentStatusRequest) sgh.a(parcel, ConsentStatusRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getUserConsentStatusForWatch(iWearableCallbacksAsInterface90, consentStatusRequest);
                    break;
                case TRANSACTION_recordConsentUntetheredSupervisedAccountTransfer /* 105 */:
                    IWearableCallbacks iWearableCallbacksAsInterface91 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest = (RecordUntetheredSupervisedAccountTransferRequest) sgh.a(parcel, RecordUntetheredSupervisedAccountTransferRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordConsentUntetheredSupervisedAccountTransfer(iWearableCallbacksAsInterface91, recordUntetheredSupervisedAccountTransferRequest);
                    break;
                case TRANSACTION_logCounter /* 106 */:
                    IWearableCallbacks iWearableCallbacksAsInterface92 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogCounterRequest logCounterRequest = (LogCounterRequest) sgh.a(parcel, LogCounterRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    logCounter(iWearableCallbacksAsInterface92, logCounterRequest);
                    break;
                case TRANSACTION_logEvent /* 107 */:
                    IWearableCallbacks iWearableCallbacksAsInterface93 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogEventRequest logEventRequest = (LogEventRequest) sgh.a(parcel, LogEventRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    logEvent(iWearableCallbacksAsInterface93, logEventRequest);
                    break;
                case TRANSACTION_logTimer /* 108 */:
                    IWearableCallbacks iWearableCallbacksAsInterface94 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    LogTimerRequest logTimerRequest = (LogTimerRequest) sgh.a(parcel, LogTimerRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    logTimer(iWearableCallbacksAsInterface94, logTimerRequest);
                    break;
                case TRANSACTION_flushLogs /* 109 */:
                    IWearableCallbacks iWearableCallbacksAsInterface95 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    flushLogs(iWearableCallbacksAsInterface95);
                    break;
                case TRANSACTION_getCanonicalAppTheme /* 110 */:
                    IWearableCallbacks iWearableCallbacksAsInterface96 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AppTheme appTheme2 = (AppTheme) sgh.a(parcel, AppTheme.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCanonicalAppTheme(iWearableCallbacksAsInterface96, appTheme2);
                    break;
                case TRANSACTION_isRestoreOngoing /* 111 */:
                    IWearableCallbacks iWearableCallbacksAsInterface97 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string42 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    isRestoreOngoing(iWearableCallbacksAsInterface97, string42);
                    break;
                case TRANSACTION_requestConnection /* 112 */:
                    IWearableCallbacks iWearableCallbacksAsInterface98 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RequestConnectionParcelable requestConnectionParcelable = (RequestConnectionParcelable) sgh.a(parcel, RequestConnectionParcelable.CREATOR);
                    IConnectionCallback iConnectionCallbackAsInterface = IConnectionCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestConnection(iWearableCallbacksAsInterface98, requestConnectionParcelable, iConnectionCallbackAsInterface);
                    break;
                case TRANSACTION_releaseConnectionRequest /* 113 */:
                    IWearableCallbacks iWearableCallbacksAsInterface99 = IWearableCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    IConnectionCallback iConnectionCallbackAsInterface2 = IConnectionCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    releaseConnectionRequest(iWearableCallbacksAsInterface99, iConnectionCallbackAsInterface2);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void acceptRingingCall(IWearableCallbacks iWearableCallbacks);

    void acceptTerms(IWearableCallbacks iWearableCallbacks, AcceptTermsRequest acceptTermsRequest);

    void addAccountToConsent(IWearableCallbacks iWearableCallbacks, AddAccountToConsentRequest addAccountToConsentRequest);

    void addListener(IWearableCallbacks iWearableCallbacks, AddListenerRequest addListenerRequest);

    void addLocalCapability(IWearableCallbacks iWearableCallbacks, String str);

    void addSupervisedAccount(IWearableCallbacks iWearableCallbacks, AddSupervisedAccountRequest addSupervisedAccountRequest);

    void associateDeviceAndAccountWithFastPair(IWearableCallbacks iWearableCallbacks, String str, Account account, String str2, String str3);

    void awaitDataSyncCompletion(IWearableCallbacks iWearableCallbacks, String str);

    void cancelMigration(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void clearStorage(IWearableCallbacks iWearableCallbacks);

    void closeChannel(IWearableCallbacks iWearableCallbacks, String str);

    void closeChannelWithError(IWearableCallbacks iWearableCallbacks, String str, int i);

    void deleteDataItems(IWearableCallbacks iWearableCallbacks, Uri uri);

    void deleteDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i);

    void disableConnection(IWearableCallbacks iWearableCallbacks);

    void disableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str);

    void doAncsNegativeAction(IWearableCallbacks iWearableCallbacks, int i);

    void doAncsPositiveAction(IWearableCallbacks iWearableCallbacks, int i);

    void enableConnection(IWearableCallbacks iWearableCallbacks);

    void enableDeviceConnection(IWearableCallbacks iWearableCallbacks, String str);

    void endCall(IWearableCallbacks iWearableCallbacks);

    void flushBatchedData(IWearableCallbacks iWearableCallbacks, String str);

    void flushLogs(IWearableCallbacks iWearableCallbacks);

    void getAllCapabilities(IWearableCallbacks iWearableCallbacks, int i);

    void getAppTheme(IWearableCallbacks iWearableCallbacks, String str);

    void getBackupEnabled(IWearableCallbacks iWearableCallbacks, String str);

    void getBackupSettingsSupported(IWearableCallbacks iWearableCallbacks, String str);

    void getCanonicalAppTheme(IWearableCallbacks iWearableCallbacks, AppTheme appTheme);

    void getCapability(IWearableCallbacks iWearableCallbacks, String str, int i);

    void getChannelInputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str);

    void getChannelOutputStream(IWearableCallbacks iWearableCallbacks, IChannelStreamCallbacks iChannelStreamCallbacks, String str);

    void getCloudSyncOptInOutDone(IWearableCallbacks iWearableCallbacks);

    void getCloudSyncOptInStatus(IWearableCallbacks iWearableCallbacks);

    void getCloudSyncSetting(IWearableCallbacks iWearableCallbacks);

    void getCompanionPackageForNode(IWearableCallbacks iWearableCallbacks, String str);

    void getConfig(IWearableCallbacks iWearableCallbacks);

    void getConfigs(IWearableCallbacks iWearableCallbacks);

    void getConnectedNodes(IWearableCallbacks iWearableCallbacks);

    void getDataItem(IWearableCallbacks iWearableCallbacks, Uri uri);

    void getDataItems(IWearableCallbacks iWearableCallbacks);

    void getDataItemsByUri(IWearableCallbacks iWearableCallbacks, Uri uri);

    void getDataItemsByUriFilter(IWearableCallbacks iWearableCallbacks, Uri uri, int i);

    void getEapId(IWearableCallbacks iWearableCallbacks, int i);

    void getFastpairAccountKeyByAccount(IWearableCallbacks iWearableCallbacks, Account account);

    void getFastpairAccountKeys(IWearableCallbacks iWearableCallbacks);

    void getFdForAsset(IWearableCallbacks iWearableCallbacks, Asset asset);

    void getLocalNode(IWearableCallbacks iWearableCallbacks);

    void getNodeId(IWearableCallbacks iWearableCallbacks, String str);

    void getPhoneSwitchingEnabled(IWearableCallbacks iWearableCallbacks);

    void getRecommendedApps(IWearableCallbacks iWearableCallbacks, AppRecommendationsRequest appRecommendationsRequest);

    void getRelatedConfigs(IWearableCallbacks iWearableCallbacks);

    void getRestoreState(IWearableCallbacks iWearableCallbacks, GetRestoreStateRequest getRestoreStateRequest);

    void getRestoreSupported(IWearableCallbacks iWearableCallbacks);

    void getStorageInformation(IWearableCallbacks iWearableCallbacks);

    void getTerms(IWearableCallbacks iWearableCallbacks, int i);

    void getUserConsentStatus(IWearableCallbacks iWearableCallbacks);

    void getUserConsentStatusForWatch(IWearableCallbacks iWearableCallbacks, ConsentStatusRequest consentStatusRequest);

    void injectAncsNotificationForTesting(IWearableCallbacks iWearableCallbacks, AncsNotificationParcelable ancsNotificationParcelable);

    void isNodeActiveNetworkMetered(IWearableCallbacks iWearableCallbacks, String str);

    void isRestoreOngoing(IWearableCallbacks iWearableCallbacks, String str);

    void logCounter(IWearableCallbacks iWearableCallbacks, LogCounterRequest logCounterRequest);

    void logEvent(IWearableCallbacks iWearableCallbacks, LogEventRequest logEventRequest);

    void logTimer(IWearableCallbacks iWearableCallbacks, LogTimerRequest logTimerRequest);

    void migrateToConsentsPerWatch(IWearableCallbacks iWearableCallbacks, String str);

    void openChannel(IWearableCallbacks iWearableCallbacks, String str, String str2);

    void optInCloudSync(IWearableCallbacks iWearableCallbacks, boolean z);

    void performEapAka(IWearableCallbacks iWearableCallbacks, int i, String str);

    void putConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void putData(IWearableCallbacks iWearableCallbacks, PutDataRequest putDataRequest);

    void readChannelOutputFromFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2);

    void recordConsentUntetheredSupervisedAccountTransfer(IWearableCallbacks iWearableCallbacks, RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest);

    void recordOptIn(IWearableCallbacks iWearableCallbacks, PrivacyRecordOptinRequest privacyRecordOptinRequest);

    void recordSwaadlOptIn(IWearableCallbacks iWearableCallbacks);

    void recordTermConsent(IWearableCallbacks iWearableCallbacks, RecordTermConsentRequest recordTermConsentRequest);

    void releaseConnectionRequest(IWearableCallbacks iWearableCallbacks, IConnectionCallback iConnectionCallback);

    void removeConfig(IWearableCallbacks iWearableCallbacks, String str);

    void removeListener(IWearableCallbacks iWearableCallbacks, RemoveListenerRequest removeListenerRequest);

    void removeLocalCapability(IWearableCallbacks iWearableCallbacks, String str);

    void requestConnection(IWearableCallbacks iWearableCallbacks, RequestConnectionParcelable requestConnectionParcelable, IConnectionCallback iConnectionCallback);

    void retryDeviceConnection(IWearableCallbacks iWearableCallbacks, String str, boolean z);

    void saveRestoreState(IWearableCallbacks iWearableCallbacks, SaveRestoreStateRequest saveRestoreStateRequest);

    void sendAmsRemoteCommand(IWearableCallbacks iWearableCallbacks, byte b);

    void sendMessage(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr);

    void sendMessageWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions);

    void sendRequest(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr);

    void sendRequestWithOptions(IWearableCallbacks iWearableCallbacks, String str, String str2, byte[] bArr, MessageOptions messageOptions);

    void setCloudSyncSetting(IWearableCallbacks iWearableCallbacks, boolean z);

    void setCloudSyncSettingByNode(IWearableCallbacks iWearableCallbacks, String str, boolean z);

    void setConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void setThemeForApp(IWearableCallbacks iWearableCallbacks, AppTheme appTheme);

    void silenceRinger(IWearableCallbacks iWearableCallbacks);

    void startRestoreSession(IWearableCallbacks iWearableCallbacks, StartRestoreSessionRequest startRestoreSessionRequest);

    void syncConnectedWifiCredential(IWearableCallbacks iWearableCallbacks, String str);

    void syncWifiCredential(IWearableCallbacks iWearableCallbacks, String str, String str2);

    void syncWifiCredentials(IWearableCallbacks iWearableCallbacks);

    void updateConfig(IWearableCallbacks iWearableCallbacks, ConnectionConfiguration connectionConfiguration);

    void updateConnectionStrategy(IWearableCallbacks iWearableCallbacks, String str, int i);

    void updateDelayConfig(IWearableCallbacks iWearableCallbacks, ConnectionDelayConfig connectionDelayConfig);

    void writeChannelInputToFileDescriptor(IWearableCallbacks iWearableCallbacks, String str, ParcelFileDescriptor parcelFileDescriptor);
}
