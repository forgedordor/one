package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.auth.folsom.internal.IBooleanCallback;
import com.google.android.gms.auth.folsom.internal.IByteArrayCallback;
import com.google.android.gms.auth.folsom.internal.IByteArrayListCallback;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback;
import com.google.android.gms.auth.folsom.internal.IProductKeyCallback;
import com.google.android.gms.auth.folsom.internal.IRecoveryResultCallback;
import com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback;
import com.google.android.gms.auth.folsom.internal.ISharedKeyCallback;
import com.google.android.gms.auth.folsom.internal.IStringListCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKeyRetrievalService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKeyRetrievalService {
        static final int TRANSACTION_addGaiaPasswordMember = 18;
        static final int TRANSACTION_canSilentlyAddGaiaPassword = 17;
        static final int TRANSACTION_createPrfMember = 21;
        static final int TRANSACTION_generateOpenVaultRequest = 16;
        static final int TRANSACTION_getConsent = 2;
        static final int TRANSACTION_getDomainState = 19;
        static final int TRANSACTION_getKeyMaterial = 5;
        static final int TRANSACTION_getProductDetails = 10;
        static final int TRANSACTION_getProductKeys = 20;
        static final int TRANSACTION_getSyncStatus = 3;
        static final int TRANSACTION_joinSecurityDomain = 11;
        static final int TRANSACTION_listRecoveredSecurityDomains = 7;
        static final int TRANSACTION_listSecurityDomainMembers = 15;
        static final int TRANSACTION_listVaults = 9;
        static final int TRANSACTION_markLocalKeysAsStale = 4;
        static final int TRANSACTION_promptForLskfConsent = 13;
        static final int TRANSACTION_resetSecurityDomain = 14;
        static final int TRANSACTION_setConsent = 1;
        static final int TRANSACTION_setKeyMaterial = 6;
        static final int TRANSACTION_startRecovery = 8;
        static final int TRANSACTION_startUxFlow = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKeyRetrievalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void addGaiaPasswordMember(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void canSilentlyAddGaiaPassword(IBooleanCallback iBooleanCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBooleanCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void createPrfMember(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void generateOpenVaultRequest(IByteArrayCallback iByteArrayCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iByteArrayCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, recoveryRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyRetrievalConsentCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getDomainState(IByteArrayCallback iByteArrayCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iByteArrayCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getKeyMaterial(ISharedKeyCallback iSharedKeyCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSharedKeyCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getProductDetails(IByteArrayCallback iByteArrayCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iByteArrayCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getProductKeys(IProductKeyCallback iProductKeyCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iProductKeyCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void getSyncStatus(IKeyRetrievalSyncStatusCallback iKeyRetrievalSyncStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyRetrievalSyncStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void joinSecurityDomain(IStatusCallback iStatusCallback, String str, byte[] bArr, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void listRecoveredSecurityDomains(IStringListCallback iStringListCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStringListCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void listSecurityDomainMembers(ISecurityDomainMembersCallback iSecurityDomainMembersCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSecurityDomainMembersCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void listVaults(IByteArrayListCallback iByteArrayListCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iByteArrayListCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void markLocalKeysAsStale(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void promptForLskfConsent(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void resetSecurityDomain(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void setConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyRetrievalConsentCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void setKeyMaterial(IKeyRetrievalCallback iKeyRetrievalCallback, String str, SharedKey[] sharedKeyArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(sharedKeyArr, 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void startRecovery(IRecoveryResultCallback iRecoveryResultCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iRecoveryResultCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, recoveryRequest);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalService
            public void startUxFlow(IKeyRetrievalCallback iKeyRetrievalCallback, String str, int i, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyRetrievalCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
        }

        public static IKeyRetrievalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
            return iInterfaceQueryLocalInterface instanceof IKeyRetrievalService ? (IKeyRetrievalService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IKeyRetrievalConsentCallback iKeyRetrievalConsentCallbackAsInterface = IKeyRetrievalConsentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    boolean zG = sgh.g(parcel);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setConsent(iKeyRetrievalConsentCallbackAsInterface, string, zG, apiMetadata);
                    break;
                case 2:
                    IKeyRetrievalConsentCallback iKeyRetrievalConsentCallbackAsInterface2 = IKeyRetrievalConsentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getConsent(iKeyRetrievalConsentCallbackAsInterface2, string2, apiMetadata2);
                    break;
                case 3:
                    IKeyRetrievalSyncStatusCallback iKeyRetrievalSyncStatusCallbackAsInterface = IKeyRetrievalSyncStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSyncStatus(iKeyRetrievalSyncStatusCallbackAsInterface, string3, apiMetadata3);
                    break;
                case 4:
                    IKeyRetrievalCallback iKeyRetrievalCallbackAsInterface = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    markLocalKeysAsStale(iKeyRetrievalCallbackAsInterface, string4, apiMetadata4);
                    break;
                case 5:
                    ISharedKeyCallback iSharedKeyCallbackAsInterface = ISharedKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getKeyMaterial(iSharedKeyCallbackAsInterface, string5, apiMetadata5);
                    break;
                case 6:
                    IKeyRetrievalCallback iKeyRetrievalCallbackAsInterface2 = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string6 = parcel.readString();
                    SharedKey[] sharedKeyArr = (SharedKey[]) parcel.createTypedArray(SharedKey.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setKeyMaterial(iKeyRetrievalCallbackAsInterface2, string6, sharedKeyArr, apiMetadata6);
                    break;
                case 7:
                    IStringListCallback iStringListCallbackAsInterface = IStringListCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string7 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listRecoveredSecurityDomains(iStringListCallbackAsInterface, string7, apiMetadata7);
                    break;
                case 8:
                    IRecoveryResultCallback iRecoveryResultCallbackAsInterface = IRecoveryResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    RecoveryRequest recoveryRequest = (RecoveryRequest) sgh.a(parcel, RecoveryRequest.CREATOR);
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    startRecovery(iRecoveryResultCallbackAsInterface, recoveryRequest, apiMetadata8);
                    break;
                case 9:
                    IByteArrayListCallback iByteArrayListCallbackAsInterface = IByteArrayListCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string8 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listVaults(iByteArrayListCallbackAsInterface, string8, apiMetadata9);
                    break;
                case 10:
                    IByteArrayCallback iByteArrayCallbackAsInterface = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getProductDetails(iByteArrayCallbackAsInterface, string9, apiMetadata10);
                    break;
                case 11:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string10 = parcel.readString();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    int i3 = parcel.readInt();
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    joinSecurityDomain(iStatusCallbackAsInterface, string10, bArrCreateByteArray, i3, apiMetadata11);
                    break;
                case 12:
                    IKeyRetrievalCallback iKeyRetrievalCallbackAsInterface3 = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string11 = parcel.readString();
                    int i4 = parcel.readInt();
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    startUxFlow(iKeyRetrievalCallbackAsInterface3, string11, i4, apiMetadata12);
                    break;
                case 13:
                    IKeyRetrievalCallback iKeyRetrievalCallbackAsInterface4 = IKeyRetrievalCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string12 = parcel.readString();
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    promptForLskfConsent(iKeyRetrievalCallbackAsInterface4, string12, apiMetadata13);
                    break;
                case 14:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string13 = parcel.readString();
                    ApiMetadata apiMetadata14 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetSecurityDomain(iStatusCallbackAsInterface2, string13, apiMetadata14);
                    break;
                case 15:
                    ISecurityDomainMembersCallback iSecurityDomainMembersCallbackAsInterface = ISecurityDomainMembersCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string14 = parcel.readString();
                    ApiMetadata apiMetadata15 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listSecurityDomainMembers(iSecurityDomainMembersCallbackAsInterface, string14, apiMetadata15);
                    break;
                case 16:
                    IByteArrayCallback iByteArrayCallbackAsInterface2 = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    RecoveryRequest recoveryRequest2 = (RecoveryRequest) sgh.a(parcel, RecoveryRequest.CREATOR);
                    ApiMetadata apiMetadata16 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    generateOpenVaultRequest(iByteArrayCallbackAsInterface2, recoveryRequest2, apiMetadata16);
                    break;
                case 17:
                    IBooleanCallback iBooleanCallbackAsInterface = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string15 = parcel.readString();
                    ApiMetadata apiMetadata17 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    canSilentlyAddGaiaPassword(iBooleanCallbackAsInterface, string15, apiMetadata17);
                    break;
                case 18:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string16 = parcel.readString();
                    ApiMetadata apiMetadata18 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addGaiaPasswordMember(iStatusCallbackAsInterface3, string16, apiMetadata18);
                    break;
                case 19:
                    IByteArrayCallback iByteArrayCallbackAsInterface3 = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string17 = parcel.readString();
                    ApiMetadata apiMetadata19 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDomainState(iByteArrayCallbackAsInterface3, string17, apiMetadata19);
                    break;
                case 20:
                    IProductKeyCallback iProductKeyCallbackAsInterface = IProductKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string18 = parcel.readString();
                    String string19 = parcel.readString();
                    ApiMetadata apiMetadata20 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getProductKeys(iProductKeyCallbackAsInterface, string18, string19, apiMetadata20);
                    break;
                case 21:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string20 = parcel.readString();
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    ApiMetadata apiMetadata21 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    createPrfMember(iStatusCallbackAsInterface4, string20, bArrCreateByteArray2, bArrCreateByteArray3, apiMetadata21);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addGaiaPasswordMember(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void canSilentlyAddGaiaPassword(IBooleanCallback iBooleanCallback, String str, ApiMetadata apiMetadata);

    void createPrfMember(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, ApiMetadata apiMetadata);

    void generateOpenVaultRequest(IByteArrayCallback iByteArrayCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata);

    void getConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, ApiMetadata apiMetadata);

    void getDomainState(IByteArrayCallback iByteArrayCallback, String str, ApiMetadata apiMetadata);

    void getKeyMaterial(ISharedKeyCallback iSharedKeyCallback, String str, ApiMetadata apiMetadata);

    void getProductDetails(IByteArrayCallback iByteArrayCallback, String str, ApiMetadata apiMetadata);

    void getProductKeys(IProductKeyCallback iProductKeyCallback, String str, String str2, ApiMetadata apiMetadata);

    void getSyncStatus(IKeyRetrievalSyncStatusCallback iKeyRetrievalSyncStatusCallback, String str, ApiMetadata apiMetadata);

    void joinSecurityDomain(IStatusCallback iStatusCallback, String str, byte[] bArr, int i, ApiMetadata apiMetadata);

    void listRecoveredSecurityDomains(IStringListCallback iStringListCallback, String str, ApiMetadata apiMetadata);

    void listSecurityDomainMembers(ISecurityDomainMembersCallback iSecurityDomainMembersCallback, String str, ApiMetadata apiMetadata);

    void listVaults(IByteArrayListCallback iByteArrayListCallback, String str, ApiMetadata apiMetadata);

    void markLocalKeysAsStale(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata);

    void promptForLskfConsent(IKeyRetrievalCallback iKeyRetrievalCallback, String str, ApiMetadata apiMetadata);

    void resetSecurityDomain(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void setConsent(IKeyRetrievalConsentCallback iKeyRetrievalConsentCallback, String str, boolean z, ApiMetadata apiMetadata);

    void setKeyMaterial(IKeyRetrievalCallback iKeyRetrievalCallback, String str, SharedKey[] sharedKeyArr, ApiMetadata apiMetadata);

    void startRecovery(IRecoveryResultCallback iRecoveryResultCallback, RecoveryRequest recoveryRequest, ApiMetadata apiMetadata);

    void startUxFlow(IKeyRetrievalCallback iKeyRetrievalCallback, String str, int i, ApiMetadata apiMetadata);
}
