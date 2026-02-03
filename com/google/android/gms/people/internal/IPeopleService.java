package com.google.android.gms.people.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.consentprimitive.GetContactsConsentsStatusRequest;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.IPeopleCallbacks;
import com.google.android.gms.people.model.AvatarReference;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPeopleService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPeopleService {
        static final int TRANSACTION_addCircle = 701;
        static final int TRANSACTION_addCircle26 = 27;
        static final int TRANSACTION_addPeopleToCircle = 28;
        static final int TRANSACTION_fetchBackUpDeviceContactInfo = 1401;
        static final int TRANSACTION_getContactsConsentsStatus = 213301;
        static final int TRANSACTION_getContactsConsentsStatus2 = 213901;
        static final int TRANSACTION_getFirstFullSyncStatus = 4201;
        static final int TRANSACTION_getGalProviderFileDescriptor = 2202;
        static final int TRANSACTION_getGalProviderType = 2201;
        static final int TRANSACTION_getMe = 1602;
        static final int TRANSACTION_getSyncStatus = 2101;
        static final int TRANSACTION_identityGetByIds = 501;
        static final int TRANSACTION_identityList = 601;
        static final int TRANSACTION_internalCall = 304;
        static final int TRANSACTION_loadAddToCircleConsent = 101;
        static final int TRANSACTION_loadAutocompleteList = 507;
        static final int TRANSACTION_loadAvatar = 502;
        static final int TRANSACTION_loadAvatarByReference = 508;
        static final int TRANSACTION_loadAvatarLegacy = 5;
        static final int TRANSACTION_loadCircles = 19;
        static final int TRANSACTION_loadContactsGaiaIds = 403;
        static final int TRANSACTION_loadContactsGaiaIds24 = 25;
        static final int TRANSACTION_loadLog = 302;
        static final int TRANSACTION_loadOwnerAvatar = 505;
        static final int TRANSACTION_loadOwnerAvatarLegacy = 29;
        static final int TRANSACTION_loadOwnerCoverPhoto = 506;
        static final int TRANSACTION_loadOwnerCoverPhotoLegacy = 301;
        static final int TRANSACTION_loadOwners = 305;
        static final int TRANSACTION_loadPeople = 404;
        static final int TRANSACTION_loadPeople400 = 401;
        static final int TRANSACTION_loadPeopleForAggregation = 402;
        static final int TRANSACTION_loadPeopleForAggregation200 = 201;
        static final int TRANSACTION_loadPeopleForAggregation201 = 202;
        static final int TRANSACTION_loadPeopleForAggregation202 = 203;
        static final int TRANSACTION_loadPeopleLive = 22;
        static final int TRANSACTION_loadPhoneNumbers = 1201;
        static final int TRANSACTION_loadRemoteImage = 504;
        static final int TRANSACTION_preliminarySync = 240501;
        static final int TRANSACTION_queryGalProvider = 2203;
        static final int TRANSACTION_registerDataChangedListener = 11;
        static final int TRANSACTION_removeCircle = 204;
        static final int TRANSACTION_requestSync = 205;
        static final int TRANSACTION_requestSyncOld = 17;
        static final int TRANSACTION_requestSyncOld19 = 20;
        static final int TRANSACTION_requestSyncOld25 = 26;
        static final int TRANSACTION_requestSyncWithStatus = 2002;
        static final int TRANSACTION_requestUploadSyncWithStatus = 2501;
        static final int TRANSACTION_restoreBackedUpDeviceContacts = 1402;
        static final int TRANSACTION_sendInteractionFeedback = 509;
        static final int TRANSACTION_setAvatar = 18;
        static final int TRANSACTION_setAvatarOld = 13;
        static final int TRANSACTION_setHasShownAddToCircleConsent = 102;
        static final int TRANSACTION_setSyncToContactsEnabled = 15;
        static final int TRANSACTION_setSyncToContactsSettings = 10;
        static final int TRANSACTION_startSync = 12;
        static final int TRANSACTION_updateCircle = 303;
        static final int TRANSACTION_updatePersonCircles = 23;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPeopleService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addCircle, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addCircle26(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addPeopleToCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(28, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void fetchBackUpDeviceContactInfo(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_fetchBackUpDeviceContactInfo, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getContactsConsentsStatus(IPeopleCallbacks iPeopleCallbacks, List<Account> list, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getContactsConsentsStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getContactsConsentsStatus2(IPeopleCallbacks iPeopleCallbacks, GetContactsConsentsStatusRequest getContactsConsentsStatusRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, getContactsConsentsStatusRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getContactsConsentsStatus2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getFirstFullSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getFirstFullSyncStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getGalProviderFileDescriptor(IPeopleCallbacks iPeopleCallbacks, Uri uri, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getGalProviderFileDescriptor, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getGalProviderType(IPeopleCallbacks iPeopleCallbacks, Uri uri, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getGalProviderType, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getMe(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getMe, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getSyncStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void identityGetByIds(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountToken);
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelableGetOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_identityGetByIds, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken identityList(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, ParcelableListOptions parcelableListOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, accountToken);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelableListOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_identityList, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void internalCall(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_internalCall, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(101, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAutocompleteList(IPeopleCallbacks iPeopleCallbacks, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                parcelObtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAutocompleteList, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAvatar(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAvatar, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAvatarByReference(IPeopleCallbacks iPeopleCallbacks, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, avatarReference);
                sgh.d(parcelObtainAndWriteInterfaceToken, parcelableLoadImageOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAvatarByReference, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadContactsGaiaIds(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadContactsGaiaIds, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadContactsGaiaIds24(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadLog(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadLog, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadOwnerAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_loadOwnerAvatar, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwnerAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_loadOwnerCoverPhoto, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwnerCoverPhotoLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadOwnerCoverPhotoLegacy, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwners(IPeopleCallbacks iPeopleCallbacks, boolean z, boolean z2, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadOwners, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeople(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                parcelObtainAndWriteInterfaceToken.writeInt(i4);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeople, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeople400(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeople400, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeInt(i4);
                parcelObtainAndWriteInterfaceToken.writeInt(i5);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeopleForAggregation, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation200(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, boolean z, int i, int i2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(201, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation201(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(202, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation202(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(203, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleLive(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadPhoneNumbers(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_loadPhoneNumbers, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadRemoteImage(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_loadRemoteImage, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void preliminarySync(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_preliminarySync, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void queryGalProvider(IPeopleCallbacks iPeopleCallbacks, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr2);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_queryGalProvider, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle registerDataChangedListener(IPeopleCallbacks iPeopleCallbacks, boolean z, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void removeCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeCircle, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSync(String str, String str2, long j, boolean z, boolean z2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_requestSync, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld(String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld19(String str, String str2, long j, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(20, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld25(String str, String str2, long j, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(26, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void requestSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSyncWithStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void requestUploadSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestUploadSyncWithStatus, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void restoreBackedUpDeviceContacts(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String[] strArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_restoreBackedUpDeviceContacts, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken sendInteractionFeedback(IPeopleCallbacks iPeopleCallbacks, String str, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(Stub.TRANSACTION_sendInteractionFeedback, parcelObtainAndWriteInterfaceToken);
                ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCancelTokenAsInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setAvatarOld(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, uri);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setHasShownAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setHasShownAddToCircleConsent, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setSyncToContactsEnabled(boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setSyncToContactsSettings(IPeopleCallbacks iPeopleCallbacks, String str, boolean z, String[] strArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle startSync(String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(12, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void updateCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, int i, String str5, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeString(str5);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateCircle, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void updatePersonCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPeopleCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeStringList(list);
                parcelObtainAndWriteInterfaceToken.writeStringList(list2);
                sgh.d(parcelObtainAndWriteInterfaceToken, favaDiagnosticsEntity);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.internal.IPeopleService");
        }

        public static IPeopleService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
            return iInterfaceQueryLocalInterface instanceof IPeopleService ? (IPeopleService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 22) {
                IPeopleCallbacks iPeopleCallbacksAsInterface = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                String string4 = parcel.readString();
                ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                loadPeopleLive(iPeopleCallbacksAsInterface, string, string2, string3, i3, string4, apiMetadata);
                parcel2.writeNoException();
                return true;
            }
            if (i == 23) {
                IPeopleCallbacks iPeopleCallbacksAsInterface2 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                FavaDiagnosticsEntity favaDiagnosticsEntity = (FavaDiagnosticsEntity) sgh.a(parcel, FavaDiagnosticsEntity.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                updatePersonCircles(iPeopleCallbacksAsInterface2, string5, string6, string7, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, favaDiagnosticsEntity, apiMetadata2);
                parcel2.writeNoException();
                return true;
            }
            if (i == 101) {
                IPeopleCallbacks iPeopleCallbacksAsInterface3 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                loadAddToCircleConsent(iPeopleCallbacksAsInterface3, string8, string9, apiMetadata3);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_setHasShownAddToCircleConsent) {
                IPeopleCallbacks iPeopleCallbacksAsInterface4 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setHasShownAddToCircleConsent(iPeopleCallbacksAsInterface4, string10, string11, apiMetadata4);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_identityGetByIds) {
                IPeopleCallbacks iPeopleCallbacksAsInterface5 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                AccountToken accountToken = (AccountToken) sgh.a(parcel, AccountToken.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
                ParcelableGetOptions parcelableGetOptions = (ParcelableGetOptions) sgh.a(parcel, ParcelableGetOptions.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                identityGetByIds(iPeopleCallbacksAsInterface5, accountToken, arrayListCreateStringArrayList3, parcelableGetOptions, apiMetadata5);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_loadAvatar) {
                IPeopleCallbacks iPeopleCallbacksAsInterface6 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String string12 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                ICancelToken iCancelTokenLoadAvatar = loadAvatar(iPeopleCallbacksAsInterface6, string12, i4, i5, apiMetadata6);
                parcel2.writeNoException();
                sgh.f(parcel2, iCancelTokenLoadAvatar);
                return true;
            }
            switch (i) {
                case 5:
                    IPeopleCallbacks iPeopleCallbacksAsInterface7 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string13 = parcel.readString();
                    int i6 = parcel.readInt();
                    int i7 = parcel.readInt();
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    loadAvatarLegacy(iPeopleCallbacksAsInterface7, string13, i6, i7, apiMetadata7);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    boolean zG = sgh.g(parcel);
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setSyncToContactsEnabled(zG, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_loadRemoteImage /* 504 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface8 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string14 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenLoadRemoteImage = loadRemoteImage(iPeopleCallbacksAsInterface8, string14, apiMetadata9);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenLoadRemoteImage);
                    return true;
                case TRANSACTION_loadOwnerAvatar /* 505 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface9 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    int i8 = parcel.readInt();
                    int i9 = parcel.readInt();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenLoadOwnerAvatar = loadOwnerAvatar(iPeopleCallbacksAsInterface9, string15, string16, i8, i9, apiMetadata10);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenLoadOwnerAvatar);
                    return true;
                case TRANSACTION_loadOwnerCoverPhoto /* 506 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface10 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    int i10 = parcel.readInt();
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenLoadOwnerCoverPhoto = loadOwnerCoverPhoto(iPeopleCallbacksAsInterface10, string17, string18, i10, apiMetadata11);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenLoadOwnerCoverPhoto);
                    return true;
                case TRANSACTION_loadAutocompleteList /* 507 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface11 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string19 = parcel.readString();
                    String string20 = parcel.readString();
                    boolean zG2 = sgh.g(parcel);
                    String string21 = parcel.readString();
                    String string22 = parcel.readString();
                    int i11 = parcel.readInt();
                    int i12 = parcel.readInt();
                    int i13 = parcel.readInt();
                    boolean zG3 = sgh.g(parcel);
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenLoadAutocompleteList = loadAutocompleteList(iPeopleCallbacksAsInterface11, string19, string20, zG2, string21, string22, i11, i12, i13, zG3, apiMetadata12);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenLoadAutocompleteList);
                    return true;
                case TRANSACTION_loadAvatarByReference /* 508 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface12 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AvatarReference avatarReference = (AvatarReference) sgh.a(parcel, AvatarReference.CREATOR);
                    ParcelableLoadImageOptions parcelableLoadImageOptions = (ParcelableLoadImageOptions) sgh.a(parcel, ParcelableLoadImageOptions.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenLoadAvatarByReference = loadAvatarByReference(iPeopleCallbacksAsInterface12, avatarReference, parcelableLoadImageOptions, apiMetadata13);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenLoadAvatarByReference);
                    return true;
                case TRANSACTION_sendInteractionFeedback /* 509 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface13 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string23 = parcel.readString();
                    int i14 = parcel.readInt();
                    ApiMetadata apiMetadata14 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenSendInteractionFeedback = sendInteractionFeedback(iPeopleCallbacksAsInterface13, string23, i14, apiMetadata14);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenSendInteractionFeedback);
                    return true;
                case TRANSACTION_identityList /* 601 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface14 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountToken accountToken2 = (AccountToken) sgh.a(parcel, AccountToken.CREATOR);
                    ParcelableListOptions parcelableListOptions = (ParcelableListOptions) sgh.a(parcel, ParcelableListOptions.CREATOR);
                    ApiMetadata apiMetadata15 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenIdentityList = identityList(iPeopleCallbacksAsInterface14, accountToken2, parcelableListOptions, apiMetadata15);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenIdentityList);
                    return true;
                case TRANSACTION_addCircle /* 701 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface15 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string24 = parcel.readString();
                    String string25 = parcel.readString();
                    String string26 = parcel.readString();
                    String string27 = parcel.readString();
                    boolean zG4 = sgh.g(parcel);
                    ApiMetadata apiMetadata16 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addCircle(iPeopleCallbacksAsInterface15, string24, string25, string26, string27, zG4, apiMetadata16);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_loadPhoneNumbers /* 1201 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface16 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string28 = parcel.readString();
                    String string29 = parcel.readString();
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata17 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken iCancelTokenLoadPhoneNumbers = loadPhoneNumbers(iPeopleCallbacksAsInterface16, string28, string29, bundle, apiMetadata17);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCancelTokenLoadPhoneNumbers);
                    return true;
                case TRANSACTION_fetchBackUpDeviceContactInfo /* 1401 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface17 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string30 = parcel.readString();
                    String string31 = parcel.readString();
                    ApiMetadata apiMetadata18 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchBackUpDeviceContactInfo(iPeopleCallbacksAsInterface17, string30, string31, apiMetadata18);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_restoreBackedUpDeviceContacts /* 1402 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface18 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string32 = parcel.readString();
                    String string33 = parcel.readString();
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    ApiMetadata apiMetadata19 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    restoreBackedUpDeviceContacts(iPeopleCallbacksAsInterface18, string32, string33, strArrCreateStringArray, apiMetadata19);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getMe /* 1602 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface19 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string34 = parcel.readString();
                    ApiMetadata apiMetadata20 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getMe(iPeopleCallbacksAsInterface19, string34, apiMetadata20);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_requestSyncWithStatus /* 2002 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface20 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    String string35 = parcel.readString();
                    ApiMetadata apiMetadata21 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestSyncWithStatus(iPeopleCallbacksAsInterface20, account, string35, apiMetadata21);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getSyncStatus /* 2101 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface21 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string36 = parcel.readString();
                    ApiMetadata apiMetadata22 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSyncStatus(iPeopleCallbacksAsInterface21, account2, string36, apiMetadata22);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getGalProviderType /* 2201 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface22 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) sgh.a(parcel, Uri.CREATOR);
                    ApiMetadata apiMetadata23 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getGalProviderType(iPeopleCallbacksAsInterface22, uri, apiMetadata23);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getGalProviderFileDescriptor /* 2202 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface23 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri2 = (Uri) sgh.a(parcel, Uri.CREATOR);
                    String string37 = parcel.readString();
                    ApiMetadata apiMetadata24 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getGalProviderFileDescriptor(iPeopleCallbacksAsInterface23, uri2, string37, apiMetadata24);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_queryGalProvider /* 2203 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface24 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri3 = (Uri) sgh.a(parcel, Uri.CREATOR);
                    String[] strArrCreateStringArray2 = parcel.createStringArray();
                    String string38 = parcel.readString();
                    String[] strArrCreateStringArray3 = parcel.createStringArray();
                    String string39 = parcel.readString();
                    ApiMetadata apiMetadata25 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    queryGalProvider(iPeopleCallbacksAsInterface24, uri3, strArrCreateStringArray2, string38, strArrCreateStringArray3, string39, apiMetadata25);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_requestUploadSyncWithStatus /* 2501 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface25 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string40 = parcel.readString();
                    ApiMetadata apiMetadata26 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestUploadSyncWithStatus(iPeopleCallbacksAsInterface25, account3, string40, apiMetadata26);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getFirstFullSyncStatus /* 4201 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface26 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string41 = parcel.readString();
                    ApiMetadata apiMetadata27 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFirstFullSyncStatus(iPeopleCallbacksAsInterface26, account4, string41, apiMetadata27);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getContactsConsentsStatus /* 213301 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface27 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                    int i15 = parcel.readInt();
                    ApiMetadata apiMetadata28 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getContactsConsentsStatus(iPeopleCallbacksAsInterface27, arrayListCreateTypedArrayList, i15, apiMetadata28);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getContactsConsentsStatus2 /* 213901 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface28 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetContactsConsentsStatusRequest getContactsConsentsStatusRequest = (GetContactsConsentsStatusRequest) sgh.a(parcel, GetContactsConsentsStatusRequest.CREATOR);
                    ApiMetadata apiMetadata29 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getContactsConsentsStatus2(iPeopleCallbacksAsInterface28, getContactsConsentsStatusRequest, apiMetadata29);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_preliminarySync /* 240501 */:
                    IPeopleCallbacks iPeopleCallbacksAsInterface29 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string42 = parcel.readString();
                    ApiMetadata apiMetadata30 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    preliminarySync(iPeopleCallbacksAsInterface29, account5, string42, apiMetadata30);
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case 10:
                            IPeopleCallbacks iPeopleCallbacksAsInterface30 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            String string43 = parcel.readString();
                            boolean zG5 = sgh.g(parcel);
                            String[] strArrCreateStringArray4 = parcel.createStringArray();
                            ApiMetadata apiMetadata31 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            setSyncToContactsSettings(iPeopleCallbacksAsInterface30, string43, zG5, strArrCreateStringArray4, apiMetadata31);
                            parcel2.writeNoException();
                            return true;
                        case 11:
                            IPeopleCallbacks iPeopleCallbacksAsInterface31 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            boolean zG6 = sgh.g(parcel);
                            String string44 = parcel.readString();
                            String string45 = parcel.readString();
                            int i16 = parcel.readInt();
                            ApiMetadata apiMetadata32 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            Bundle bundleRegisterDataChangedListener = registerDataChangedListener(iPeopleCallbacksAsInterface31, zG6, string44, string45, i16, apiMetadata32);
                            parcel2.writeNoException();
                            sgh.e(parcel2, bundleRegisterDataChangedListener);
                            return true;
                        case 12:
                            String string46 = parcel.readString();
                            String string47 = parcel.readString();
                            ApiMetadata apiMetadata33 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            Bundle bundleStartSync = startSync(string46, string47, apiMetadata33);
                            parcel2.writeNoException();
                            sgh.e(parcel2, bundleStartSync);
                            return true;
                        case 13:
                            IPeopleCallbacks iPeopleCallbacksAsInterface32 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            String string48 = parcel.readString();
                            String string49 = parcel.readString();
                            Uri uri4 = (Uri) sgh.a(parcel, Uri.CREATOR);
                            ApiMetadata apiMetadata34 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            setAvatarOld(iPeopleCallbacksAsInterface32, string48, string49, uri4, apiMetadata34);
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case 17:
                                    String string50 = parcel.readString();
                                    String string51 = parcel.readString();
                                    ApiMetadata apiMetadata35 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    Bundle bundleRequestSyncOld = requestSyncOld(string50, string51, apiMetadata35);
                                    parcel2.writeNoException();
                                    sgh.e(parcel2, bundleRequestSyncOld);
                                    return true;
                                case 18:
                                    IPeopleCallbacks iPeopleCallbacksAsInterface33 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                    String string52 = parcel.readString();
                                    String string53 = parcel.readString();
                                    Uri uri5 = (Uri) sgh.a(parcel, Uri.CREATOR);
                                    boolean zG7 = sgh.g(parcel);
                                    ApiMetadata apiMetadata36 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    setAvatar(iPeopleCallbacksAsInterface33, string52, string53, uri5, zG7, apiMetadata36);
                                    parcel2.writeNoException();
                                    return true;
                                case 19:
                                    IPeopleCallbacks iPeopleCallbacksAsInterface34 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                    String string54 = parcel.readString();
                                    String string55 = parcel.readString();
                                    String string56 = parcel.readString();
                                    int i17 = parcel.readInt();
                                    String string57 = parcel.readString();
                                    boolean zG8 = sgh.g(parcel);
                                    ApiMetadata apiMetadata37 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    loadCircles(iPeopleCallbacksAsInterface34, string54, string55, string56, i17, string57, zG8, apiMetadata37);
                                    parcel2.writeNoException();
                                    return true;
                                case 20:
                                    String string58 = parcel.readString();
                                    String string59 = parcel.readString();
                                    long j = parcel.readLong();
                                    ApiMetadata apiMetadata38 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    Bundle bundleRequestSyncOld19 = requestSyncOld19(string58, string59, j, apiMetadata38);
                                    parcel2.writeNoException();
                                    sgh.e(parcel2, bundleRequestSyncOld19);
                                    return true;
                                default:
                                    switch (i) {
                                        case 25:
                                            IPeopleCallbacks iPeopleCallbacksAsInterface35 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String string60 = parcel.readString();
                                            String string61 = parcel.readString();
                                            ApiMetadata apiMetadata39 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            loadContactsGaiaIds24(iPeopleCallbacksAsInterface35, string60, string61, apiMetadata39);
                                            parcel2.writeNoException();
                                            return true;
                                        case 26:
                                            String string62 = parcel.readString();
                                            String string63 = parcel.readString();
                                            long j2 = parcel.readLong();
                                            boolean zG9 = sgh.g(parcel);
                                            ApiMetadata apiMetadata40 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            Bundle bundleRequestSyncOld25 = requestSyncOld25(string62, string63, j2, zG9, apiMetadata40);
                                            parcel2.writeNoException();
                                            sgh.e(parcel2, bundleRequestSyncOld25);
                                            return true;
                                        case 27:
                                            IPeopleCallbacks iPeopleCallbacksAsInterface36 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String string64 = parcel.readString();
                                            String string65 = parcel.readString();
                                            String string66 = parcel.readString();
                                            String string67 = parcel.readString();
                                            ApiMetadata apiMetadata41 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            addCircle26(iPeopleCallbacksAsInterface36, string64, string65, string66, string67, apiMetadata41);
                                            parcel2.writeNoException();
                                            return true;
                                        case 28:
                                            IPeopleCallbacks iPeopleCallbacksAsInterface37 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String string68 = parcel.readString();
                                            String string69 = parcel.readString();
                                            String string70 = parcel.readString();
                                            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
                                            ApiMetadata apiMetadata42 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            addPeopleToCircle(iPeopleCallbacksAsInterface37, string68, string69, string70, arrayListCreateStringArrayList4, apiMetadata42);
                                            parcel2.writeNoException();
                                            return true;
                                        case 29:
                                            IPeopleCallbacks iPeopleCallbacksAsInterface38 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String string71 = parcel.readString();
                                            String string72 = parcel.readString();
                                            int i18 = parcel.readInt();
                                            int i19 = parcel.readInt();
                                            ApiMetadata apiMetadata43 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            loadOwnerAvatarLegacy(iPeopleCallbacksAsInterface38, string71, string72, i18, i19, apiMetadata43);
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            switch (i) {
                                                case 201:
                                                    IPeopleCallbacks iPeopleCallbacksAsInterface39 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String string73 = parcel.readString();
                                                    String string74 = parcel.readString();
                                                    String string75 = parcel.readString();
                                                    boolean zG10 = sgh.g(parcel);
                                                    int i20 = parcel.readInt();
                                                    int i21 = parcel.readInt();
                                                    ApiMetadata apiMetadata44 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    loadPeopleForAggregation200(iPeopleCallbacksAsInterface39, string73, string74, string75, zG10, i20, i21, apiMetadata44);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 202:
                                                    IPeopleCallbacks iPeopleCallbacksAsInterface40 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String string76 = parcel.readString();
                                                    String string77 = parcel.readString();
                                                    String string78 = parcel.readString();
                                                    int i22 = parcel.readInt();
                                                    boolean zG11 = sgh.g(parcel);
                                                    int i23 = parcel.readInt();
                                                    int i24 = parcel.readInt();
                                                    String string79 = parcel.readString();
                                                    ApiMetadata apiMetadata45 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    loadPeopleForAggregation201(iPeopleCallbacksAsInterface40, string76, string77, string78, i22, zG11, i23, i24, string79, apiMetadata45);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 203:
                                                    IPeopleCallbacks iPeopleCallbacksAsInterface41 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String string80 = parcel.readString();
                                                    String string81 = parcel.readString();
                                                    String string82 = parcel.readString();
                                                    int i25 = parcel.readInt();
                                                    boolean zG12 = sgh.g(parcel);
                                                    int i26 = parcel.readInt();
                                                    int i27 = parcel.readInt();
                                                    String string83 = parcel.readString();
                                                    boolean zG13 = sgh.g(parcel);
                                                    ApiMetadata apiMetadata46 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    loadPeopleForAggregation202(iPeopleCallbacksAsInterface41, string80, string81, string82, i25, zG12, i26, i27, string83, zG13, apiMetadata46);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_removeCircle /* 204 */:
                                                    IPeopleCallbacks iPeopleCallbacksAsInterface42 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String string84 = parcel.readString();
                                                    String string85 = parcel.readString();
                                                    String string86 = parcel.readString();
                                                    ApiMetadata apiMetadata47 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    removeCircle(iPeopleCallbacksAsInterface42, string84, string85, string86, apiMetadata47);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_requestSync /* 205 */:
                                                    String string87 = parcel.readString();
                                                    String string88 = parcel.readString();
                                                    long j3 = parcel.readLong();
                                                    boolean zG14 = sgh.g(parcel);
                                                    boolean zG15 = sgh.g(parcel);
                                                    ApiMetadata apiMetadata48 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    Bundle bundleRequestSync = requestSync(string87, string88, j3, zG14, zG15, apiMetadata48);
                                                    parcel2.writeNoException();
                                                    sgh.e(parcel2, bundleRequestSync);
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case TRANSACTION_loadOwnerCoverPhotoLegacy /* 301 */:
                                                            IPeopleCallbacks iPeopleCallbacksAsInterface43 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            String string89 = parcel.readString();
                                                            String string90 = parcel.readString();
                                                            int i28 = parcel.readInt();
                                                            ApiMetadata apiMetadata49 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            loadOwnerCoverPhotoLegacy(iPeopleCallbacksAsInterface43, string89, string90, i28, apiMetadata49);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_loadLog /* 302 */:
                                                            IPeopleCallbacks iPeopleCallbacksAsInterface44 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                                                            ApiMetadata apiMetadata50 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            loadLog(iPeopleCallbacksAsInterface44, bundle2, apiMetadata50);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_updateCircle /* 303 */:
                                                            IPeopleCallbacks iPeopleCallbacksAsInterface45 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            String string91 = parcel.readString();
                                                            String string92 = parcel.readString();
                                                            String string93 = parcel.readString();
                                                            String string94 = parcel.readString();
                                                            int i29 = parcel.readInt();
                                                            String string95 = parcel.readString();
                                                            ApiMetadata apiMetadata51 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            updateCircle(iPeopleCallbacksAsInterface45, string91, string92, string93, string94, i29, string95, apiMetadata51);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_internalCall /* 304 */:
                                                            IPeopleCallbacks iPeopleCallbacksAsInterface46 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                                                            ApiMetadata apiMetadata52 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            internalCall(iPeopleCallbacksAsInterface46, bundle3, apiMetadata52);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_loadOwners /* 305 */:
                                                            IPeopleCallbacks iPeopleCallbacksAsInterface47 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            boolean zG16 = sgh.g(parcel);
                                                            boolean zG17 = sgh.g(parcel);
                                                            String string96 = parcel.readString();
                                                            String string97 = parcel.readString();
                                                            int i30 = parcel.readInt();
                                                            ApiMetadata apiMetadata53 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            loadOwners(iPeopleCallbacksAsInterface47, zG16, zG17, string96, string97, i30, apiMetadata53);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case TRANSACTION_loadPeople400 /* 401 */:
                                                                    IPeopleCallbacks iPeopleCallbacksAsInterface48 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String string98 = parcel.readString();
                                                                    String string99 = parcel.readString();
                                                                    String string100 = parcel.readString();
                                                                    ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
                                                                    int i31 = parcel.readInt();
                                                                    boolean zG18 = sgh.g(parcel);
                                                                    long j4 = parcel.readLong();
                                                                    String string101 = parcel.readString();
                                                                    int i32 = parcel.readInt();
                                                                    int i33 = parcel.readInt();
                                                                    ApiMetadata apiMetadata54 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadPeople400(iPeopleCallbacksAsInterface48, string98, string99, string100, arrayListCreateStringArrayList5, i31, zG18, j4, string101, i32, i33, apiMetadata54);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_loadPeopleForAggregation /* 402 */:
                                                                    IPeopleCallbacks iPeopleCallbacksAsInterface49 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String string102 = parcel.readString();
                                                                    String string103 = parcel.readString();
                                                                    String string104 = parcel.readString();
                                                                    int i34 = parcel.readInt();
                                                                    boolean zG19 = sgh.g(parcel);
                                                                    int i35 = parcel.readInt();
                                                                    int i36 = parcel.readInt();
                                                                    String string105 = parcel.readString();
                                                                    boolean zG20 = sgh.g(parcel);
                                                                    int i37 = parcel.readInt();
                                                                    int i38 = parcel.readInt();
                                                                    ApiMetadata apiMetadata55 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadPeopleForAggregation(iPeopleCallbacksAsInterface49, string102, string103, string104, i34, zG19, i35, i36, string105, zG20, i37, i38, apiMetadata55);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_loadContactsGaiaIds /* 403 */:
                                                                    IPeopleCallbacks iPeopleCallbacksAsInterface50 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String string106 = parcel.readString();
                                                                    String string107 = parcel.readString();
                                                                    int i39 = parcel.readInt();
                                                                    ApiMetadata apiMetadata56 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadContactsGaiaIds(iPeopleCallbacksAsInterface50, string106, string107, i39, apiMetadata56);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_loadPeople /* 404 */:
                                                                    IPeopleCallbacks iPeopleCallbacksAsInterface51 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String string108 = parcel.readString();
                                                                    String string109 = parcel.readString();
                                                                    String string110 = parcel.readString();
                                                                    ArrayList<String> arrayListCreateStringArrayList6 = parcel.createStringArrayList();
                                                                    int i40 = parcel.readInt();
                                                                    boolean zG21 = sgh.g(parcel);
                                                                    long j5 = parcel.readLong();
                                                                    String string111 = parcel.readString();
                                                                    int i41 = parcel.readInt();
                                                                    int i42 = parcel.readInt();
                                                                    int i43 = parcel.readInt();
                                                                    ApiMetadata apiMetadata57 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadPeople(iPeopleCallbacksAsInterface51, string108, string109, string110, arrayListCreateStringArrayList6, i40, zG21, j5, string111, i41, i42, i43, apiMetadata57);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                default:
                                                                    return false;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    void addCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, boolean z, ApiMetadata apiMetadata);

    void addCircle26(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, ApiMetadata apiMetadata);

    void addPeopleToCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, ApiMetadata apiMetadata);

    void fetchBackUpDeviceContactInfo(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void getContactsConsentsStatus(IPeopleCallbacks iPeopleCallbacks, List<Account> list, int i, ApiMetadata apiMetadata);

    void getContactsConsentsStatus2(IPeopleCallbacks iPeopleCallbacks, GetContactsConsentsStatusRequest getContactsConsentsStatusRequest, ApiMetadata apiMetadata);

    void getFirstFullSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void getGalProviderFileDescriptor(IPeopleCallbacks iPeopleCallbacks, Uri uri, String str, ApiMetadata apiMetadata);

    void getGalProviderType(IPeopleCallbacks iPeopleCallbacks, Uri uri, ApiMetadata apiMetadata);

    void getMe(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata);

    void getSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void identityGetByIds(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions, ApiMetadata apiMetadata);

    ICancelToken identityList(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, ParcelableListOptions parcelableListOptions, ApiMetadata apiMetadata);

    void internalCall(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata);

    void loadAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    ICancelToken loadAutocompleteList(IPeopleCallbacks iPeopleCallbacks, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2, ApiMetadata apiMetadata);

    ICancelToken loadAvatar(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata);

    ICancelToken loadAvatarByReference(IPeopleCallbacks iPeopleCallbacks, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions, ApiMetadata apiMetadata);

    void loadAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata);

    void loadCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, boolean z, ApiMetadata apiMetadata);

    void loadContactsGaiaIds(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadContactsGaiaIds24(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void loadLog(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata);

    ICancelToken loadOwnerAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata);

    void loadOwnerAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata);

    ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadOwnerCoverPhotoLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadOwners(IPeopleCallbacks iPeopleCallbacks, boolean z, boolean z2, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadPeople(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4, ApiMetadata apiMetadata);

    void loadPeople400(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, ApiMetadata apiMetadata);

    void loadPeopleForAggregation(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5, ApiMetadata apiMetadata);

    void loadPeopleForAggregation200(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, boolean z, int i, int i2, ApiMetadata apiMetadata);

    void loadPeopleForAggregation201(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, ApiMetadata apiMetadata);

    void loadPeopleForAggregation202(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, ApiMetadata apiMetadata);

    void loadPeopleLive(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, ApiMetadata apiMetadata);

    ICancelToken loadPhoneNumbers(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Bundle bundle, ApiMetadata apiMetadata);

    ICancelToken loadRemoteImage(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata);

    void preliminarySync(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void queryGalProvider(IPeopleCallbacks iPeopleCallbacks, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ApiMetadata apiMetadata);

    Bundle registerDataChangedListener(IPeopleCallbacks iPeopleCallbacks, boolean z, String str, String str2, int i, ApiMetadata apiMetadata);

    void removeCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, ApiMetadata apiMetadata);

    Bundle requestSync(String str, String str2, long j, boolean z, boolean z2, ApiMetadata apiMetadata);

    Bundle requestSyncOld(String str, String str2, ApiMetadata apiMetadata);

    Bundle requestSyncOld19(String str, String str2, long j, ApiMetadata apiMetadata);

    Bundle requestSyncOld25(String str, String str2, long j, boolean z, ApiMetadata apiMetadata);

    void requestSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void requestUploadSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void restoreBackedUpDeviceContacts(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String[] strArr, ApiMetadata apiMetadata);

    ICancelToken sendInteractionFeedback(IPeopleCallbacks iPeopleCallbacks, String str, int i, ApiMetadata apiMetadata);

    void setAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, boolean z, ApiMetadata apiMetadata);

    void setAvatarOld(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, ApiMetadata apiMetadata);

    void setHasShownAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void setSyncToContactsEnabled(boolean z, ApiMetadata apiMetadata);

    void setSyncToContactsSettings(IPeopleCallbacks iPeopleCallbacks, String str, boolean z, String[] strArr, ApiMetadata apiMetadata);

    Bundle startSync(String str, String str2, ApiMetadata apiMetadata);

    void updateCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, int i, String str5, ApiMetadata apiMetadata);

    void updatePersonCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity, ApiMetadata apiMetadata);
}
