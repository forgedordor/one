package com.google.android.gms.people.contactssync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;
import com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactsSyncServiceCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactsSyncServiceCallbacks {
        static final int TRANSACTION_onAddAccountCategoryToBackupAndSync = 4;
        static final int TRANSACTION_onClassifyAccountTypesResult = 10;
        static final int TRANSACTION_onCleanupSyncedGoogleContacts = 20;
        static final int TRANSACTION_onCpgAppSearchRead = 23;
        static final int TRANSACTION_onCpgAppSearchUpsert = 22;
        static final int TRANSACTION_onCreateCallingCard = 24;
        static final int TRANSACTION_onDeleteCallingCards = 27;
        static final int TRANSACTION_onDeviceContactsSyncSettingChanged = 18;
        static final int TRANSACTION_onGetBackupAndSyncOptInState = 7;
        static final int TRANSACTION_onGetBackupAndSyncOptInStateOld = 2;
        static final int TRANSACTION_onGetBackupAndSyncSuggestion = 8;
        static final int TRANSACTION_onGetBackupSyncSuggestion = 11;
        static final int TRANSACTION_onGetCallingCards = 25;
        static final int TRANSACTION_onGetDeviceContactsSyncSettingAction = 21;
        static final int TRANSACTION_onGetImportSimContactsSuggestions = 17;
        static final int TRANSACTION_onImportSimContacts = 16;
        static final int TRANSACTION_onMigrateContacts = 13;
        static final int TRANSACTION_onOptInBackupAndSync = 3;
        static final int TRANSACTION_onOptInBackupAndSyncInternalOld = 1;
        static final int TRANSACTION_onOptOutBackupAndSync = 6;
        static final int TRANSACTION_onRecordBackupSyncUserAction = 12;
        static final int TRANSACTION_onRemoveAccountCategoryFromBackupAndSync = 5;
        static final int TRANSACTION_onStatus = 19;
        static final int TRANSACTION_onSyncHighResPhoto = 9;
        static final int TRANSACTION_onSyncStatusUpdate = 14;
        static final int TRANSACTION_onUpdateCallingCard = 26;
        static final int TRANSACTION_updateSyncStatusDone = 15;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactsSyncServiceCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onAddAccountCategoryToBackupAndSync(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onClassifyAccountTypesResult(Status status, List<ClassifyAccountTypeResult> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCleanupSyncedGoogleContacts(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCpgAppSearchRead(Status status, List<CpgDocument> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCpgAppSearchUpsert(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCreateCallingCard(Status status, CreateCallingCardResponse createCallingCardResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, createCallingCardResponse);
                transactOneway(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onDeleteCallingCards(Status status, List<CallingCardRequestStatus> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onDeviceContactsSyncSettingChanged() {
                transactOneway(18, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, backupAndSyncOptInState);
                transactOneway(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupAndSyncOptInStateOld(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, backupAndSyncOptInState);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupAndSyncSuggestion(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, backupAndSyncSuggestion);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupSyncSuggestion(Status status, GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, getBackupSyncSuggestionResponse);
                transactOneway(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetCallingCards(Status status, List<GetCallingCardResponse> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetDeviceContactsSyncSettingAction(Status status, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetImportSimContactsSuggestions(Status status, List list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactOneway(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onImportSimContacts(Status status, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onMigrateContacts(Status status, List<Long> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactOneway(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onOptInBackupAndSync(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onOptInBackupAndSyncInternalOld(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onOptOutBackupAndSync(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onRecordBackupSyncUserAction(Status status, RecordBackupSyncUserActionResponse recordBackupSyncUserActionResponse) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, recordBackupSyncUserActionResponse);
                transactOneway(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onRemoveAccountCategoryFromBackupAndSync(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onStatus(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onSyncHighResPhoto(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onSyncStatusUpdate(Status status, ExtendedSyncStatus extendedSyncStatus) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, extendedSyncStatus);
                transactOneway(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onUpdateCallingCard(Status status, CallingCardRequestStatus callingCardRequestStatus) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, callingCardRequestStatus);
                transactOneway(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void updateSyncStatusDone(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(15, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
        }

        public static IContactsSyncServiceCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
            return iInterfaceQueryLocalInterface instanceof IContactsSyncServiceCallbacks ? (IContactsSyncServiceCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOptInBackupAndSyncInternalOld(status);
                    return true;
                case 2:
                    Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
                    BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) sgh.a(parcel, BackupAndSyncOptInState.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupAndSyncOptInStateOld(status2, backupAndSyncOptInState);
                    return true;
                case 3:
                    Status status3 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOptInBackupAndSync(status3);
                    return true;
                case 4:
                    Status status4 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAddAccountCategoryToBackupAndSync(status4);
                    return true;
                case 5:
                    Status status5 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRemoveAccountCategoryFromBackupAndSync(status5);
                    return true;
                case 6:
                    Status status6 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOptOutBackupAndSync(status6);
                    return true;
                case 7:
                    Status status7 = (Status) sgh.a(parcel, Status.CREATOR);
                    BackupAndSyncOptInState backupAndSyncOptInState2 = (BackupAndSyncOptInState) sgh.a(parcel, BackupAndSyncOptInState.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupAndSyncOptInState(status7, backupAndSyncOptInState2);
                    return true;
                case 8:
                    Status status8 = (Status) sgh.a(parcel, Status.CREATOR);
                    BackupAndSyncSuggestion backupAndSyncSuggestion = (BackupAndSyncSuggestion) sgh.a(parcel, BackupAndSyncSuggestion.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupAndSyncSuggestion(status8, backupAndSyncSuggestion);
                    return true;
                case 9:
                    Status status9 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSyncHighResPhoto(status9);
                    return true;
                case 10:
                    Status status10 = (Status) sgh.a(parcel, Status.CREATOR);
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ClassifyAccountTypeResult.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClassifyAccountTypesResult(status10, arrayListCreateTypedArrayList);
                    return true;
                case 11:
                    Status status11 = (Status) sgh.a(parcel, Status.CREATOR);
                    GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse = (GetBackupSyncSuggestionResponse) sgh.a(parcel, GetBackupSyncSuggestionResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupSyncSuggestion(status11, getBackupSyncSuggestionResponse);
                    return true;
                case 12:
                    Status status12 = (Status) sgh.a(parcel, Status.CREATOR);
                    RecordBackupSyncUserActionResponse recordBackupSyncUserActionResponse = (RecordBackupSyncUserActionResponse) sgh.a(parcel, RecordBackupSyncUserActionResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRecordBackupSyncUserAction(status12, recordBackupSyncUserActionResponse);
                    return true;
                case 13:
                    Status status13 = (Status) sgh.a(parcel, Status.CREATOR);
                    ArrayList arrayListB = sgh.b(parcel);
                    enforceNoDataAvail(parcel);
                    onMigrateContacts(status13, arrayListB);
                    return true;
                case 14:
                    Status status14 = (Status) sgh.a(parcel, Status.CREATOR);
                    ExtendedSyncStatus extendedSyncStatus = (ExtendedSyncStatus) sgh.a(parcel, ExtendedSyncStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSyncStatusUpdate(status14, extendedSyncStatus);
                    return true;
                case 15:
                    Status status15 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateSyncStatusDone(status15);
                    return true;
                case 16:
                    Status status16 = (Status) sgh.a(parcel, Status.CREATOR);
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onImportSimContacts(status16, i3);
                    return true;
                case 17:
                    Status status17 = (Status) sgh.a(parcel, Status.CREATOR);
                    ArrayList arrayListB2 = sgh.b(parcel);
                    enforceNoDataAvail(parcel);
                    onGetImportSimContactsSuggestions(status17, arrayListB2);
                    return true;
                case 18:
                    onDeviceContactsSyncSettingChanged();
                    return true;
                case 19:
                    Status status18 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatus(status18);
                    return true;
                case 20:
                    Status status19 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCleanupSyncedGoogleContacts(status19);
                    return true;
                case 21:
                    Status status20 = (Status) sgh.a(parcel, Status.CREATOR);
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onGetDeviceContactsSyncSettingAction(status20, string);
                    return true;
                case 22:
                    Status status21 = (Status) sgh.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCpgAppSearchUpsert(status21);
                    return true;
                case 23:
                    Status status22 = (Status) sgh.a(parcel, Status.CREATOR);
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(CpgDocument.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCpgAppSearchRead(status22, arrayListCreateTypedArrayList2);
                    return true;
                case 24:
                    Status status23 = (Status) sgh.a(parcel, Status.CREATOR);
                    CreateCallingCardResponse createCallingCardResponse = (CreateCallingCardResponse) sgh.a(parcel, CreateCallingCardResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreateCallingCard(status23, createCallingCardResponse);
                    return true;
                case 25:
                    Status status24 = (Status) sgh.a(parcel, Status.CREATOR);
                    ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(GetCallingCardResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCallingCards(status24, arrayListCreateTypedArrayList3);
                    return true;
                case 26:
                    Status status25 = (Status) sgh.a(parcel, Status.CREATOR);
                    CallingCardRequestStatus callingCardRequestStatus = (CallingCardRequestStatus) sgh.a(parcel, CallingCardRequestStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    onUpdateCallingCard(status25, callingCardRequestStatus);
                    return true;
                case 27:
                    Status status26 = (Status) sgh.a(parcel, Status.CREATOR);
                    ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(CallingCardRequestStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDeleteCallingCards(status26, arrayListCreateTypedArrayList4);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onAddAccountCategoryToBackupAndSync(Status status);

    void onClassifyAccountTypesResult(Status status, List<ClassifyAccountTypeResult> list);

    void onCleanupSyncedGoogleContacts(Status status);

    void onCpgAppSearchRead(Status status, List<CpgDocument> list);

    void onCpgAppSearchUpsert(Status status);

    void onCreateCallingCard(Status status, CreateCallingCardResponse createCallingCardResponse);

    void onDeleteCallingCards(Status status, List<CallingCardRequestStatus> list);

    void onDeviceContactsSyncSettingChanged();

    void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState);

    void onGetBackupAndSyncOptInStateOld(Status status, BackupAndSyncOptInState backupAndSyncOptInState);

    void onGetBackupAndSyncSuggestion(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion);

    void onGetBackupSyncSuggestion(Status status, GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse);

    void onGetCallingCards(Status status, List<GetCallingCardResponse> list);

    void onGetDeviceContactsSyncSettingAction(Status status, String str);

    void onGetImportSimContactsSuggestions(Status status, List list);

    void onImportSimContacts(Status status, int i);

    void onMigrateContacts(Status status, List<Long> list);

    void onOptInBackupAndSync(Status status);

    void onOptInBackupAndSyncInternalOld(Status status);

    void onOptOutBackupAndSync(Status status);

    void onRecordBackupSyncUserAction(Status status, RecordBackupSyncUserActionResponse recordBackupSyncUserActionResponse);

    void onRemoveAccountCategoryFromBackupAndSync(Status status);

    void onStatus(Status status);

    void onSyncHighResPhoto(Status status);

    void onSyncStatusUpdate(Status status, ExtendedSyncStatus extendedSyncStatus);

    void onUpdateCallingCard(Status status, CallingCardRequestStatus callingCardRequestStatus);

    void updateSyncStatusDone(Status status);
}
