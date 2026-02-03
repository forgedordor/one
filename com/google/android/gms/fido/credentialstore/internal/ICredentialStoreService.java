package com.google.android.gms.fido.credentialstore.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;
import com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks;
import com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks;
import com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks;
import com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialStoreService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialStoreService {
        static final int TRANSACTION_addUsage = 6;
        static final int TRANSACTION_deleteCredential = 11;
        static final int TRANSACTION_deleteDevicePublicKey = 10;
        static final int TRANSACTION_deleteKey = 4;
        static final int TRANSACTION_generateKey = 2;
        static final int TRANSACTION_getKey = 3;
        static final int TRANSACTION_getOrGenerateDevicePublicKey = 9;
        static final int TRANSACTION_getPasskeys = 8;
        static final int TRANSACTION_incrementAndGetCounter = 5;
        static final int TRANSACTION_listKeys = 7;
        static final int TRANSACTION_updatePasskey = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialStoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void addUsage(IStatusCallback iStatusCallback, String str, long j, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void deleteCredential(IStatusCallback iStatusCallback, Account account, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void deleteDevicePublicKey(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void deleteKey(IStatusCallback iStatusCallback, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void generateKey(IKeyDataCallbacks iKeyDataCallbacks, KeyCreationRequestOptions keyCreationRequestOptions, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyDataCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, keyCreationRequestOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void getKey(IKeyDataCallbacks iKeyDataCallbacks, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyDataCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void getOrGenerateDevicePublicKey(IKeyDataCallbacks iKeyDataCallbacks, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyDataCallbacks);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void getPasskeys(IGetPasskeysCallbacks iGetPasskeysCallbacks, Account account, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetPasskeysCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void incrementAndGetCounter(ILongValueCallbacks iLongValueCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iLongValueCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void listKeys(IKeyDataListCallbacks iKeyDataListCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iKeyDataListCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void updatePasskey(IStatusCallback iStatusCallback, Account account, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, account);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
        }

        public static ICredentialStoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
            return iInterfaceQueryLocalInterface instanceof ICredentialStoreService ? (ICredentialStoreService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IKeyDataCallbacks iKeyDataCallbacksAsInterface = IKeyDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    KeyCreationRequestOptions keyCreationRequestOptions = (KeyCreationRequestOptions) sgh.a(parcel, KeyCreationRequestOptions.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    generateKey(iKeyDataCallbacksAsInterface, keyCreationRequestOptions, apiMetadata);
                    break;
                case 3:
                    IKeyDataCallbacks iKeyDataCallbacksAsInterface2 = IKeyDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getKey(iKeyDataCallbacksAsInterface2, string, bArrCreateByteArray, apiMetadata2);
                    break;
                case 4:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteKey(iStatusCallbackAsInterface, string2, bArrCreateByteArray2, apiMetadata3);
                    break;
                case 5:
                    ILongValueCallbacks iLongValueCallbacksAsInterface = ILongValueCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    incrementAndGetCounter(iLongValueCallbacksAsInterface, string3, apiMetadata4);
                    break;
                case 6:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    long j = parcel.readLong();
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addUsage(iStatusCallbackAsInterface2, string4, j, apiMetadata5);
                    break;
                case 7:
                    IKeyDataListCallbacks iKeyDataListCallbacksAsInterface = IKeyDataListCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listKeys(iKeyDataListCallbacksAsInterface, string5, apiMetadata6);
                    break;
                case 8:
                    IGetPasskeysCallbacks iGetPasskeysCallbacksAsInterface = IGetPasskeysCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) sgh.a(parcel, Account.CREATOR);
                    String string6 = parcel.readString();
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPasskeys(iGetPasskeysCallbacksAsInterface, account, string6, bArrCreateByteArray3, apiMetadata7);
                    break;
                case 9:
                    IKeyDataCallbacks iKeyDataCallbacksAsInterface3 = IKeyDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getOrGenerateDevicePublicKey(iKeyDataCallbacksAsInterface3, bArrCreateByteArray4, apiMetadata8);
                    break;
                case 10:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray5 = parcel.createByteArray();
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteDevicePublicKey(iStatusCallbackAsInterface3, bArrCreateByteArray5, apiMetadata9);
                    break;
                case 11:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) sgh.a(parcel, Account.CREATOR);
                    String string7 = parcel.readString();
                    byte[] bArrCreateByteArray6 = parcel.createByteArray();
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteCredential(iStatusCallbackAsInterface4, account2, string7, bArrCreateByteArray6, apiMetadata10);
                    break;
                case 12:
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) sgh.a(parcel, Account.CREATOR);
                    byte[] bArrCreateByteArray7 = parcel.createByteArray();
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updatePasskey(iStatusCallbackAsInterface5, account3, bArrCreateByteArray7, apiMetadata11);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addUsage(IStatusCallback iStatusCallback, String str, long j, ApiMetadata apiMetadata);

    void deleteCredential(IStatusCallback iStatusCallback, Account account, String str, byte[] bArr, ApiMetadata apiMetadata);

    void deleteDevicePublicKey(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void deleteKey(IStatusCallback iStatusCallback, String str, byte[] bArr, ApiMetadata apiMetadata);

    void generateKey(IKeyDataCallbacks iKeyDataCallbacks, KeyCreationRequestOptions keyCreationRequestOptions, ApiMetadata apiMetadata);

    void getKey(IKeyDataCallbacks iKeyDataCallbacks, String str, byte[] bArr, ApiMetadata apiMetadata);

    void getOrGenerateDevicePublicKey(IKeyDataCallbacks iKeyDataCallbacks, byte[] bArr, ApiMetadata apiMetadata);

    void getPasskeys(IGetPasskeysCallbacks iGetPasskeysCallbacks, Account account, String str, byte[] bArr, ApiMetadata apiMetadata);

    void incrementAndGetCounter(ILongValueCallbacks iLongValueCallbacks, String str, ApiMetadata apiMetadata);

    void listKeys(IKeyDataListCallbacks iKeyDataListCallbacks, String str, ApiMetadata apiMetadata);

    void updatePasskey(IStatusCallback iStatusCallback, Account account, byte[] bArr, ApiMetadata apiMetadata);
}
