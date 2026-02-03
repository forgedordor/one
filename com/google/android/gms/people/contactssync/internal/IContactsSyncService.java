package com.google.android.gms.people.contactssync.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.gms.people.contactssync.model.BackupSyncUserAction;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.CpgDocumentRequest;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest;
import com.google.android.gms.people.cpg.callingcard.UpdateCallingCardRequest;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactsSyncService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactsSyncService {
        static final int TRANSACTION_addAccountCategoryToBackupAndSync = 192803;
        static final int TRANSACTION_addDeviceContactsSyncSettingChangedListener = 223601;
        static final int TRANSACTION_classifyAccountTypes = 201202;
        static final int TRANSACTION_cleanupSyncedGoogleContacts = 223902;
        static final int TRANSACTION_createCallingCard = 250201;
        static final int TRANSACTION_deleteCallingCards = 250204;
        static final int TRANSACTION_fsaUpdateSyncStatus = 203902;
        static final int TRANSACTION_getBackupAndSyncOptInState = 192806;
        static final int TRANSACTION_getBackupAndSyncOptInStateOld = 192403;
        static final int TRANSACTION_getBackupAndSyncSuggestion = 192807;
        static final int TRANSACTION_getBackupSyncSuggestion = 201602;
        static final int TRANSACTION_getCallingCards = 250202;
        static final int TRANSACTION_getDeviceContactsSyncSettingAction = 223903;
        static final int TRANSACTION_getImportSimContactsProgress = 213902;
        static final int TRANSACTION_getImportSimContactsSuggestions = 213302;
        static final int TRANSACTION_importSimContacts = 212502;
        static final int TRANSACTION_migrateContacts = 202604;
        static final int TRANSACTION_optInBackupAndSync = 214201;
        static final int TRANSACTION_optInBackupAndSyncInternalOld = 192402;
        static final int TRANSACTION_optInBackupAndSyncPreY2021w42 = 192802;
        static final int TRANSACTION_optInBackupAndSyncWithoutValidation = 203302;
        static final int TRANSACTION_optOutBackupAndSync = 192805;
        static final int TRANSACTION_readCpgDocuments = 242001;
        static final int TRANSACTION_recordBackupSyncUserAction = 201603;
        static final int TRANSACTION_registerSyncStatusListener = 203901;
        static final int TRANSACTION_registerSyncStatusListenerWithChannel = 234202;
        static final int TRANSACTION_removeAccountCategoryFromBackupAndSync = 192804;
        static final int TRANSACTION_removeDeviceContactsSyncSettingChangedListener = 223602;
        static final int TRANSACTION_syncHighResPhoto = 194202;
        static final int TRANSACTION_updateCallingCard = 250203;
        static final int TRANSACTION_upsertCpgDocuments = 231501;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactsSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncService");
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void addAccountCategoryToBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addAccountCategoryToBackupAndSync, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addDeviceContactsSyncSettingChangedListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void classifyAccountTypes(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<ClassifyAccountTypeRequest> list, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_classifyAccountTypes, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void cleanupSyncedGoogleContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_cleanupSyncedGoogleContacts, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void createCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, CreateCallingCardRequest createCallingCardRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, createCallingCardRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_createCallingCard, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void deleteCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_deleteCallingCards, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void fsaUpdateSyncStatus(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ExtendedSyncStatus extendedSyncStatus, Account account, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, extendedSyncStatus);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_fsaUpdateSyncStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInState, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncOptInStateOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInStateOld, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncSuggestion, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getBackupSyncSuggestionRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupSyncSuggestion, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCallingCards, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getDeviceContactsSyncSettingAction, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public int getImportSimContactsProgress(ImportSimContactsRequest importSimContactsRequest, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, importSimContactsRequest);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_getImportSimContactsProgress, parcelObtainAndWriteInterfaceToken);
                int i2 = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i2;
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getImportSimContactsSuggestions(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getImportSimContactsSuggestionsRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getImportSimContactsSuggestions, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void importSimContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ImportSimContactsRequest importSimContactsRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, importSimContactsRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_importSimContacts, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void migrateContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, AccountWithDataSet accountWithDataSet, AccountWithDataSet accountWithDataSet2, List<Long> list, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountWithDataSet);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountWithDataSet2);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_migrateContacts, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, BackupAndSyncOptInOptions backupAndSyncOptInOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, backupAndSyncOptInOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSync, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncInternalOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncInternalOld, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncPreY2021w42(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncPreY2021w42, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncWithoutValidation(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncWithoutValidation, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optOutBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optOutBackupAndSync, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void readCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocumentRequest> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_readCpgDocuments, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void recordBackupSyncUserAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, BackupSyncUserAction backupSyncUserAction, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, backupSyncUserAction);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordBackupSyncUserAction, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void registerSyncStatusListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerSyncStatusListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void registerSyncStatusListenerWithChannel(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerSyncStatusListenerWithChannel, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void removeAccountCategoryFromBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeAccountCategoryFromBackupAndSync, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeDeviceContactsSyncSettingChangedListener, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void syncHighResPhoto(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, Uri uri, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_syncHighResPhoto, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void updateCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, UpdateCallingCardRequest updateCallingCardRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, updateCallingCardRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateCallingCard, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void upsertCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocument> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_upsertCpgDocuments, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
        }

        public static IContactsSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
            return iInterfaceQueryLocalInterface instanceof IContactsSyncService ? (IContactsSyncService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_optInBackupAndSyncInternalOld /* 192402 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] iArrCreateIntArray = parcel.createIntArray();
                    String string = parcel.readString();
                    boolean zG = sgh.g(parcel);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncInternalOld(iContactsSyncServiceCallbacksAsInterface, iArrCreateIntArray, string, zG, apiMetadata);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncOptInStateOld /* 192403 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface2 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInStateOld(iContactsSyncServiceCallbacksAsInterface2, string2, apiMetadata2);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optInBackupAndSyncPreY2021w42 /* 192802 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface3 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncPreY2021w42(iContactsSyncServiceCallbacksAsInterface3, string3, apiMetadata3);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_addAccountCategoryToBackupAndSync /* 192803 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface4 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] iArrCreateIntArray2 = parcel.createIntArray();
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addAccountCategoryToBackupAndSync(iContactsSyncServiceCallbacksAsInterface4, iArrCreateIntArray2, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_removeAccountCategoryFromBackupAndSync /* 192804 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface5 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] iArrCreateIntArray3 = parcel.createIntArray();
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeAccountCategoryFromBackupAndSync(iContactsSyncServiceCallbacksAsInterface5, iArrCreateIntArray3, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optOutBackupAndSync /* 192805 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface6 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optOutBackupAndSync(iContactsSyncServiceCallbacksAsInterface6, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncOptInState /* 192806 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface7 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInState(iContactsSyncServiceCallbacksAsInterface7, apiMetadata7);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncSuggestion /* 192807 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface8 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncSuggestion(iContactsSyncServiceCallbacksAsInterface8, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_syncHighResPhoto /* 194202 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface9 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) sgh.a(parcel, Uri.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    syncHighResPhoto(iContactsSyncServiceCallbacksAsInterface9, uri, apiMetadata9);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_classifyAccountTypes /* 201202 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface10 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ClassifyAccountTypeRequest.CREATOR);
                    String string4 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    classifyAccountTypes(iContactsSyncServiceCallbacksAsInterface10, arrayListCreateTypedArrayList, string4, apiMetadata10);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupSyncSuggestion /* 201602 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface11 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest = (GetBackupSyncSuggestionRequest) sgh.a(parcel, GetBackupSyncSuggestionRequest.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupSyncSuggestion(iContactsSyncServiceCallbacksAsInterface11, getBackupSyncSuggestionRequest, apiMetadata11);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_recordBackupSyncUserAction /* 201603 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface12 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BackupSyncUserAction backupSyncUserAction = (BackupSyncUserAction) sgh.a(parcel, BackupSyncUserAction.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordBackupSyncUserAction(iContactsSyncServiceCallbacksAsInterface12, backupSyncUserAction, apiMetadata12);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_migrateContacts /* 202604 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface13 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountWithDataSet accountWithDataSet = (AccountWithDataSet) sgh.a(parcel, AccountWithDataSet.CREATOR);
                    AccountWithDataSet accountWithDataSet2 = (AccountWithDataSet) sgh.a(parcel, AccountWithDataSet.CREATOR);
                    ArrayList arrayListB = sgh.b(parcel);
                    int i3 = parcel.readInt();
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    migrateContacts(iContactsSyncServiceCallbacksAsInterface13, accountWithDataSet, accountWithDataSet2, arrayListB, i3, apiMetadata13);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optInBackupAndSyncWithoutValidation /* 203302 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface14 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    ApiMetadata apiMetadata14 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncWithoutValidation(iContactsSyncServiceCallbacksAsInterface14, string5, apiMetadata14);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_registerSyncStatusListener /* 203901 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface15 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean zG2 = sgh.g(parcel);
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    String string6 = parcel.readString();
                    ApiMetadata apiMetadata15 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerSyncStatusListener(iContactsSyncServiceCallbacksAsInterface15, zG2, account, string6, apiMetadata15);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_fsaUpdateSyncStatus /* 203902 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface16 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ExtendedSyncStatus extendedSyncStatus = (ExtendedSyncStatus) sgh.a(parcel, ExtendedSyncStatus.CREATOR);
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    ApiMetadata apiMetadata16 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fsaUpdateSyncStatus(iContactsSyncServiceCallbacksAsInterface16, extendedSyncStatus, account2, apiMetadata16);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_importSimContacts /* 212502 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface17 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ImportSimContactsRequest importSimContactsRequest = (ImportSimContactsRequest) sgh.a(parcel, ImportSimContactsRequest.CREATOR);
                    ApiMetadata apiMetadata17 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    importSimContacts(iContactsSyncServiceCallbacksAsInterface17, importSimContactsRequest, apiMetadata17);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getImportSimContactsSuggestions /* 213302 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface18 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest = (GetImportSimContactsSuggestionsRequest) sgh.a(parcel, GetImportSimContactsSuggestionsRequest.CREATOR);
                    ApiMetadata apiMetadata18 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getImportSimContactsSuggestions(iContactsSyncServiceCallbacksAsInterface18, getImportSimContactsSuggestionsRequest, apiMetadata18);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getImportSimContactsProgress /* 213902 */:
                    ImportSimContactsRequest importSimContactsRequest2 = (ImportSimContactsRequest) sgh.a(parcel, ImportSimContactsRequest.CREATOR);
                    int i4 = parcel.readInt();
                    ApiMetadata apiMetadata19 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    int importSimContactsProgress = getImportSimContactsProgress(importSimContactsRequest2, i4, apiMetadata19);
                    parcel2.writeNoException();
                    parcel2.writeInt(importSimContactsProgress);
                    return true;
                case TRANSACTION_optInBackupAndSync /* 214201 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface19 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string7 = parcel.readString();
                    BackupAndSyncOptInOptions backupAndSyncOptInOptions = (BackupAndSyncOptInOptions) sgh.a(parcel, BackupAndSyncOptInOptions.CREATOR);
                    ApiMetadata apiMetadata20 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSync(iContactsSyncServiceCallbacksAsInterface19, string7, backupAndSyncOptInOptions, apiMetadata20);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_addDeviceContactsSyncSettingChangedListener /* 223601 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface20 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata21 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addDeviceContactsSyncSettingChangedListener(iContactsSyncServiceCallbacksAsInterface20, apiMetadata21);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_removeDeviceContactsSyncSettingChangedListener /* 223602 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface21 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata22 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeDeviceContactsSyncSettingChangedListener(iContactsSyncServiceCallbacksAsInterface21, apiMetadata22);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_cleanupSyncedGoogleContacts /* 223902 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface22 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string8 = parcel.readString();
                    ApiMetadata apiMetadata23 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    cleanupSyncedGoogleContacts(iContactsSyncServiceCallbacksAsInterface22, string8, apiMetadata23);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getDeviceContactsSyncSettingAction /* 223903 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface23 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata24 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDeviceContactsSyncSettingAction(iContactsSyncServiceCallbacksAsInterface23, apiMetadata24);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_upsertCpgDocuments /* 231501 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface24 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(CpgDocument.CREATOR);
                    ApiMetadata apiMetadata25 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    upsertCpgDocuments(iContactsSyncServiceCallbacksAsInterface24, arrayListCreateTypedArrayList2, apiMetadata25);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_registerSyncStatusListenerWithChannel /* 234202 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface25 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean zG3 = sgh.g(parcel);
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    ApiMetadata apiMetadata26 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerSyncStatusListenerWithChannel(iContactsSyncServiceCallbacksAsInterface25, zG3, account3, string9, string10, apiMetadata26);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_readCpgDocuments /* 242001 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface26 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(CpgDocumentRequest.CREATOR);
                    ApiMetadata apiMetadata27 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readCpgDocuments(iContactsSyncServiceCallbacksAsInterface26, arrayListCreateTypedArrayList3, apiMetadata27);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_createCallingCard /* 250201 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface27 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    CreateCallingCardRequest createCallingCardRequest = (CreateCallingCardRequest) sgh.a(parcel, CreateCallingCardRequest.CREATOR);
                    ApiMetadata apiMetadata28 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    createCallingCard(iContactsSyncServiceCallbacksAsInterface27, createCallingCardRequest, apiMetadata28);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getCallingCards /* 250202 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface28 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(CallingCardIdentifier.CREATOR);
                    ApiMetadata apiMetadata29 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCallingCards(iContactsSyncServiceCallbacksAsInterface28, arrayListCreateTypedArrayList4, apiMetadata29);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_updateCallingCard /* 250203 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface29 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    UpdateCallingCardRequest updateCallingCardRequest = (UpdateCallingCardRequest) sgh.a(parcel, UpdateCallingCardRequest.CREATOR);
                    ApiMetadata apiMetadata30 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateCallingCard(iContactsSyncServiceCallbacksAsInterface29, updateCallingCardRequest, apiMetadata30);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_deleteCallingCards /* 250204 */:
                    IContactsSyncServiceCallbacks iContactsSyncServiceCallbacksAsInterface30 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList5 = parcel.createTypedArrayList(CallingCardIdentifier.CREATOR);
                    ApiMetadata apiMetadata31 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteCallingCards(iContactsSyncServiceCallbacksAsInterface30, arrayListCreateTypedArrayList5, apiMetadata31);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void addAccountCategoryToBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata);

    void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void classifyAccountTypes(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<ClassifyAccountTypeRequest> list, String str, ApiMetadata apiMetadata);

    void cleanupSyncedGoogleContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void createCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, CreateCallingCardRequest createCallingCardRequest, ApiMetadata apiMetadata);

    void deleteCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata);

    void fsaUpdateSyncStatus(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ExtendedSyncStatus extendedSyncStatus, Account account, ApiMetadata apiMetadata);

    void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void getBackupAndSyncOptInStateOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void getBackupAndSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void getBackupSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest, ApiMetadata apiMetadata);

    void getCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata);

    void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    int getImportSimContactsProgress(ImportSimContactsRequest importSimContactsRequest, int i, ApiMetadata apiMetadata);

    void getImportSimContactsSuggestions(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest, ApiMetadata apiMetadata);

    void importSimContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ImportSimContactsRequest importSimContactsRequest, ApiMetadata apiMetadata);

    void migrateContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, AccountWithDataSet accountWithDataSet, AccountWithDataSet accountWithDataSet2, List<Long> list, int i, ApiMetadata apiMetadata);

    void optInBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, BackupAndSyncOptInOptions backupAndSyncOptInOptions, ApiMetadata apiMetadata);

    void optInBackupAndSyncInternalOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, String str, boolean z, ApiMetadata apiMetadata);

    void optInBackupAndSyncPreY2021w42(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void optInBackupAndSyncWithoutValidation(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void optOutBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void readCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocumentRequest> list, ApiMetadata apiMetadata);

    void recordBackupSyncUserAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, BackupSyncUserAction backupSyncUserAction, ApiMetadata apiMetadata);

    void registerSyncStatusListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, ApiMetadata apiMetadata);

    void registerSyncStatusListenerWithChannel(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, String str2, ApiMetadata apiMetadata);

    void removeAccountCategoryFromBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata);

    void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void syncHighResPhoto(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, Uri uri, ApiMetadata apiMetadata);

    void updateCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, UpdateCallingCardRequest updateCallingCardRequest, ApiMetadata apiMetadata);

    void upsertCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocument> list, ApiMetadata apiMetadata);
}
