package com.google.android.gms.contactkeys.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.contactkeys.ContactInfoParcelable;
import com.google.android.gms.contactkeys.internal.IContactKeyCallback;
import com.google.android.gms.contactkeys.internal.IContactKeyIntCallback;
import com.google.android.gms.contactkeys.internal.IContactKeyIntentCallback;
import com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback;
import com.google.android.gms.contactkeys.internal.IContactKeysCallback;
import com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback;
import com.google.android.gms.contactkeys.internal.ISelfKeyCallback;
import com.google.android.gms.contactkeys.internal.ISelfKeysCallback;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactKeyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactKeyService {
        static final int TRANSACTION_getAllE2eeContactKeys = 2;
        static final int TRANSACTION_getAllE2eeContactKeysWithDataHolder = 23;
        static final int TRANSACTION_getAllE2eeSelfKeys = 1;
        static final int TRANSACTION_getAllOwnerE2eeContactKeys = 21;
        static final int TRANSACTION_getAllOwnerE2eeContactKeysWithDataHolder = 25;
        static final int TRANSACTION_getE2eeContactKey = 4;
        static final int TRANSACTION_getE2eeSelfKey = 3;
        static final int TRANSACTION_getMaxKeySizeBytes = 17;
        static final int TRANSACTION_getOnboardingIntent = 20;
        static final int TRANSACTION_getOwnerE2eeContactKeys = 6;
        static final int TRANSACTION_getOwnerE2eeContactKeysWithDataHolder = 24;
        static final int TRANSACTION_getOwnerE2eeSelfKeys = 5;
        static final int TRANSACTION_getScanQrCodeIntent = 19;
        static final int TRANSACTION_getShowQrCodeIntent = 18;
        static final int TRANSACTION_isEnabled = 22;
        static final int TRANSACTION_removeE2eeContactKey = 15;
        static final int TRANSACTION_removeE2eeSelfKey = 16;
        static final int TRANSACTION_updateE2eeContactKeyLocalVerificationState = 11;
        static final int TRANSACTION_updateE2eeContactKeyLocalVerificationStateForPackage = 12;
        static final int TRANSACTION_updateE2eeContactKeyRemoteVerificationState = 13;
        static final int TRANSACTION_updateE2eeContactKeyRemoteVerificationStateForPackage = 14;
        static final int TRANSACTION_updateE2eeSelfKeyRemoteVerificationState = 9;
        static final int TRANSACTION_updateE2eeSelfKeyRemoteVerificationStateForPackage = 10;
        static final int TRANSACTION_updateOrInsertE2eeContactKey = 7;
        static final int TRANSACTION_updateOrInsertE2eeContactKeyWithContactInfos = 26;
        static final int TRANSACTION_updateOrInsertE2eeSelfKey = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactKeyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.contactkeys.internal.IContactKeyService");
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeysCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllE2eeContactKeysWithDataHolder(IContactKeysDataHolderCallback iContactKeysDataHolderCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeysDataHolderCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSelfKeysCallback);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeysCallback);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllOwnerE2eeContactKeysWithDataHolder(IContactKeysDataHolderCallback iContactKeysDataHolderCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeysDataHolderCallback);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getE2eeContactKey(IContactKeyCallback iContactKeyCallback, String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getE2eeSelfKey(ISelfKeyCallback iSelfKeyCallback, String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSelfKeyCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getMaxKeySizeBytes(IContactKeyIntCallback iContactKeyIntCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyIntCallback);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getOnboardingIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyIntentCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeysCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getOwnerE2eeContactKeysWithDataHolder(IContactKeysDataHolderCallback iContactKeysDataHolderCallback, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeysDataHolderCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getOwnerE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iSelfKeysCallback);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getScanQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyIntentCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getShowQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyIntentCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void isEnabled(IContactKeyStatusCallback iContactKeyStatusCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void removeE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void removeE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyLocalVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyLocalVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeSelfKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeSelfKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateOrInsertE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, byte[] bArr, String str4, String str5, String str6) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                parcelObtainAndWriteInterfaceToken.writeString(str5);
                parcelObtainAndWriteInterfaceToken.writeString(str6);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateOrInsertE2eeContactKeyWithContactInfos(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, byte[] bArr, List<ContactInfoParcelable> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateOrInsertE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.contactkeys.internal.IContactKeyService");
        }

        public static IContactKeyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contactkeys.internal.IContactKeyService");
            return iInterfaceQueryLocalInterface instanceof IContactKeyService ? (IContactKeyService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    ISelfKeysCallback iSelfKeysCallbackAsInterface = ISelfKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAllE2eeSelfKeys(iSelfKeysCallbackAsInterface);
                    break;
                case 2:
                    IContactKeysCallback iContactKeysCallbackAsInterface = IContactKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAllE2eeContactKeys(iContactKeysCallbackAsInterface, string);
                    break;
                case 3:
                    ISelfKeyCallback iSelfKeyCallbackAsInterface = ISelfKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getE2eeSelfKey(iSelfKeyCallbackAsInterface, string2, string3);
                    break;
                case 4:
                    IContactKeyCallback iContactKeyCallbackAsInterface = IContactKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getE2eeContactKey(iContactKeyCallbackAsInterface, string4, string5, string6);
                    break;
                case 5:
                    ISelfKeysCallback iSelfKeysCallbackAsInterface2 = ISelfKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getOwnerE2eeSelfKeys(iSelfKeysCallbackAsInterface2);
                    break;
                case 6:
                    IContactKeysCallback iContactKeysCallbackAsInterface2 = IContactKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getOwnerE2eeContactKeys(iContactKeysCallbackAsInterface2, string7);
                    break;
                case 7:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    updateOrInsertE2eeContactKey(iContactKeyStatusCallbackAsInterface, string8, string9, string10, bArrCreateByteArray, string11, string12, string13);
                    break;
                case 8:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface2 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    updateOrInsertE2eeSelfKey(iContactKeyStatusCallbackAsInterface2, string14, string15, bArrCreateByteArray2);
                    break;
                case 9:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface3 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string16 = parcel.readString();
                    String string17 = parcel.readString();
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeSelfKeyRemoteVerificationState(iContactKeyStatusCallbackAsInterface3, string16, string17, i3);
                    break;
                case 10:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface4 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string18 = parcel.readString();
                    String string19 = parcel.readString();
                    String string20 = parcel.readString();
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeSelfKeyRemoteVerificationStateForPackage(iContactKeyStatusCallbackAsInterface4, string18, string19, string20, i4);
                    break;
                case 11:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface5 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string21 = parcel.readString();
                    String string22 = parcel.readString();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyLocalVerificationState(iContactKeyStatusCallbackAsInterface5, string21, string22, i5);
                    break;
                case 12:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface6 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string23 = parcel.readString();
                    String string24 = parcel.readString();
                    String string25 = parcel.readString();
                    int i6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyLocalVerificationStateForPackage(iContactKeyStatusCallbackAsInterface6, string23, string24, string25, i6);
                    break;
                case 13:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface7 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string26 = parcel.readString();
                    String string27 = parcel.readString();
                    int i7 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyRemoteVerificationState(iContactKeyStatusCallbackAsInterface7, string26, string27, i7);
                    break;
                case 14:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface8 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string28 = parcel.readString();
                    String string29 = parcel.readString();
                    String string30 = parcel.readString();
                    int i8 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyRemoteVerificationStateForPackage(iContactKeyStatusCallbackAsInterface8, string28, string29, string30, i8);
                    break;
                case 15:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface9 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string31 = parcel.readString();
                    String string32 = parcel.readString();
                    String string33 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeE2eeContactKey(iContactKeyStatusCallbackAsInterface9, string31, string32, string33);
                    break;
                case 16:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface10 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string34 = parcel.readString();
                    String string35 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeE2eeSelfKey(iContactKeyStatusCallbackAsInterface10, string34, string35);
                    break;
                case 17:
                    IContactKeyIntCallback iContactKeyIntCallbackAsInterface = IContactKeyIntCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getMaxKeySizeBytes(iContactKeyIntCallbackAsInterface);
                    break;
                case 18:
                    IContactKeyIntentCallback iContactKeyIntentCallbackAsInterface = IContactKeyIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string36 = parcel.readString();
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    getShowQrCodeIntent(iContactKeyIntentCallbackAsInterface, string36, zG);
                    break;
                case 19:
                    IContactKeyIntentCallback iContactKeyIntentCallbackAsInterface2 = IContactKeyIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string37 = parcel.readString();
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    getScanQrCodeIntent(iContactKeyIntentCallbackAsInterface2, string37, zG2);
                    break;
                case 20:
                    IContactKeyIntentCallback iContactKeyIntentCallbackAsInterface3 = IContactKeyIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string38 = parcel.readString();
                    String string39 = parcel.readString();
                    String string40 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getOnboardingIntent(iContactKeyIntentCallbackAsInterface3, string38, string39, string40);
                    break;
                case 21:
                    IContactKeysCallback iContactKeysCallbackAsInterface3 = IContactKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAllOwnerE2eeContactKeys(iContactKeysCallbackAsInterface3);
                    break;
                case 22:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface11 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    isEnabled(iContactKeyStatusCallbackAsInterface11);
                    break;
                case 23:
                    IContactKeysDataHolderCallback iContactKeysDataHolderCallbackAsInterface = IContactKeysDataHolderCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string41 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAllE2eeContactKeysWithDataHolder(iContactKeysDataHolderCallbackAsInterface, string41);
                    break;
                case 24:
                    IContactKeysDataHolderCallback iContactKeysDataHolderCallbackAsInterface2 = IContactKeysDataHolderCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string42 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getOwnerE2eeContactKeysWithDataHolder(iContactKeysDataHolderCallbackAsInterface2, string42);
                    break;
                case 25:
                    IContactKeysDataHolderCallback iContactKeysDataHolderCallbackAsInterface3 = IContactKeysDataHolderCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAllOwnerE2eeContactKeysWithDataHolder(iContactKeysDataHolderCallbackAsInterface3);
                    break;
                case 26:
                    IContactKeyStatusCallback iContactKeyStatusCallbackAsInterface12 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string43 = parcel.readString();
                    String string44 = parcel.readString();
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ContactInfoParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateOrInsertE2eeContactKeyWithContactInfos(iContactKeyStatusCallbackAsInterface12, string43, string44, bArrCreateByteArray3, arrayListCreateTypedArrayList);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getAllE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str);

    void getAllE2eeContactKeysWithDataHolder(IContactKeysDataHolderCallback iContactKeysDataHolderCallback, String str);

    void getAllE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback);

    void getAllOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback);

    void getAllOwnerE2eeContactKeysWithDataHolder(IContactKeysDataHolderCallback iContactKeysDataHolderCallback);

    void getE2eeContactKey(IContactKeyCallback iContactKeyCallback, String str, String str2, String str3);

    void getE2eeSelfKey(ISelfKeyCallback iSelfKeyCallback, String str, String str2);

    void getMaxKeySizeBytes(IContactKeyIntCallback iContactKeyIntCallback);

    void getOnboardingIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, String str2, String str3);

    void getOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str);

    void getOwnerE2eeContactKeysWithDataHolder(IContactKeysDataHolderCallback iContactKeysDataHolderCallback, String str);

    void getOwnerE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback);

    void getScanQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z);

    void getShowQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z);

    void isEnabled(IContactKeyStatusCallback iContactKeyStatusCallback);

    void removeE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3);

    void removeE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2);

    void updateE2eeContactKeyLocalVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i);

    void updateE2eeContactKeyLocalVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i);

    void updateE2eeContactKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i);

    void updateE2eeContactKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i);

    void updateE2eeSelfKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i);

    void updateE2eeSelfKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i);

    void updateOrInsertE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, byte[] bArr, String str4, String str5, String str6);

    void updateOrInsertE2eeContactKeyWithContactInfos(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, byte[] bArr, List<ContactInfoParcelable> list);

    void updateOrInsertE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, byte[] bArr);
}
