package com.google.android.gms.phenotype.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.phenotype.RegistrationInfo;
import com.google.android.gms.phenotype.internal.IFlagUpdateListener;
import com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks;
import com.google.android.gms.phenotype.internal.IPhenotypeCallbacks;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPhenotypeService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPhenotypeService {
        static final int TRANSACTION_bulkRegister = 19;
        static final int TRANSACTION_commitToConfiguration = 5;
        static final int TRANSACTION_commitToConfigurationV2 = 31;
        static final int TRANSACTION_deleteFlagOverrides = 15;
        static final int TRANSACTION_getAlternateConfigurationSnapshot = 17;
        static final int TRANSACTION_getCommittedConfiguration = 10;
        static final int TRANSACTION_getConfigurationSnapshot = 4;
        static final int TRANSACTION_getConfigurationSnapshotWithToken = 11;
        static final int TRANSACTION_getDogfoodsToken = 7;
        static final int TRANSACTION_getExperimentTokens = 23;
        static final int TRANSACTION_getExperimentsForLogging = 6;
        static final int TRANSACTION_getFlag = 9;
        static final int TRANSACTION_getServingVersion = 22;
        static final int TRANSACTION_getStorageInfo = 27;
        static final int TRANSACTION_listFlagOverrides = 16;
        static final int TRANSACTION_register = 1;
        static final int TRANSACTION_registerFlagUpdateListener = 28;
        static final int TRANSACTION_registerSync = 13;
        static final int TRANSACTION_setAppSpecificProperties = 20;
        static final int TRANSACTION_setAppWideProperties = 29;
        static final int TRANSACTION_setDimensions = 21;
        static final int TRANSACTION_setDogfoodsToken = 8;
        static final int TRANSACTION_setExternalExperimentTokens = 26;
        static final int TRANSACTION_setFlagOverride = 14;
        static final int TRANSACTION_setFlagOverrides = 18;
        static final int TRANSACTION_setRuntimeProperties = 25;
        static final int TRANSACTION_syncAfter = 12;
        static final int TRANSACTION_syncAfterForApplication = 24;
        static final int TRANSACTION_unRegister = 3;
        static final int TRANSACTION_weakRegister = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPhenotypeService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void bulkRegister(IPhenotypeCallbacks iPhenotypeCallbacks, RegistrationInfo[] registrationInfoArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(registrationInfoArr, 0);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void commitToConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void commitToConfigurationV2(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void deleteFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getAlternateConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getCommittedConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getConfigurationSnapshotWithToken(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getExperimentTokens(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getExperimentsForLogging(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getFlag(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getServingVersion(IPhenotypeCallbacks iPhenotypeCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void getStorageInfo(IGetStorageInfoCallbacks iGetStorageInfoCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGetStorageInfoCallbacks);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void listFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void register(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void registerFlagUpdateListener(String str, IFlagUpdateListener iFlagUpdateListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFlagUpdateListener);
                transactAndReadExceptionReturnVoid(28, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void registerSync(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr, String str2, String str3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setAppSpecificProperties(IPhenotypeCallbacks iPhenotypeCallbacks, String str, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setAppWideProperties(IStatusCallback iStatusCallback, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setDimensions(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, GenericDimension[] genericDimensionArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(genericDimensionArr, 0);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setExternalExperimentTokens(IStatusCallback iStatusCallback, String str, List<byte[]> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactAndReadExceptionReturnVoid(26, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setFlagOverride(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, int i, int i2, String str4) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeString(str3);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeString(str4);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, Flag[] flagArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(flagArr, 0);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void setRuntimeProperties(IStatusCallback iStatusCallback, String str, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void syncAfter(IPhenotypeCallbacks iPhenotypeCallbacks, String str, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void syncAfterForApplication(IPhenotypeCallbacks iPhenotypeCallbacks, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void unRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.phenotype.internal.IPhenotypeService
            public void weakRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, int[] iArr, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPhenotypeCallbacks);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                parcelObtainAndWriteInterfaceToken.writeIntArray(iArr);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.phenotype.internal.IPhenotypeService");
        }

        public static IPhenotypeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
            return iInterfaceQueryLocalInterface instanceof IPhenotypeService ? (IPhenotypeService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    int i3 = parcel.readInt();
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    register(iPhenotypeCallbacksAsInterface, string, i3, strArrCreateStringArray, bArrCreateByteArray);
                    break;
                case 2:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface2 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    int i4 = parcel.readInt();
                    String[] strArrCreateStringArray2 = parcel.createStringArray();
                    int[] iArrCreateIntArray = parcel.createIntArray();
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    weakRegister(iPhenotypeCallbacksAsInterface2, string2, i4, strArrCreateStringArray2, iArrCreateIntArray, bArrCreateByteArray2);
                    break;
                case 3:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface3 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    unRegister(iPhenotypeCallbacksAsInterface3, string3);
                    break;
                case 4:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface4 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getConfigurationSnapshot(iPhenotypeCallbacksAsInterface4, string4, string5);
                    break;
                case 5:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface5 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    commitToConfiguration(iPhenotypeCallbacksAsInterface5, string6);
                    break;
                case 6:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface6 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getExperimentsForLogging(iPhenotypeCallbacksAsInterface6, string7, string8);
                    break;
                case 7:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface7 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDogfoodsToken(iPhenotypeCallbacksAsInterface7);
                    break;
                case 8:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface8 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setDogfoodsToken(iPhenotypeCallbacksAsInterface8, bArrCreateByteArray3);
                    break;
                case 9:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface9 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    getFlag(iPhenotypeCallbacksAsInterface9, string9, string10, i5);
                    break;
                case 10:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface10 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getCommittedConfiguration(iPhenotypeCallbacksAsInterface10, string11);
                    break;
                case 11:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface11 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getConfigurationSnapshotWithToken(iPhenotypeCallbacksAsInterface11, string12, string13, string14);
                    break;
                case 12:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface12 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string15 = parcel.readString();
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    syncAfter(iPhenotypeCallbacksAsInterface12, string15, j);
                    break;
                case 13:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface13 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string16 = parcel.readString();
                    int i6 = parcel.readInt();
                    String[] strArrCreateStringArray3 = parcel.createStringArray();
                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    registerSync(iPhenotypeCallbacksAsInterface13, string16, i6, strArrCreateStringArray3, bArrCreateByteArray4, string17, string18);
                    break;
                case 14:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface14 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string19 = parcel.readString();
                    String string20 = parcel.readString();
                    String string21 = parcel.readString();
                    int i7 = parcel.readInt();
                    int i8 = parcel.readInt();
                    String string22 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setFlagOverride(iPhenotypeCallbacksAsInterface14, string19, string20, string21, i7, i8, string22);
                    break;
                case 15:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface15 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string23 = parcel.readString();
                    String string24 = parcel.readString();
                    String string25 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    deleteFlagOverrides(iPhenotypeCallbacksAsInterface15, string23, string24, string25);
                    break;
                case 16:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface16 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string26 = parcel.readString();
                    String string27 = parcel.readString();
                    String string28 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    listFlagOverrides(iPhenotypeCallbacksAsInterface16, string26, string27, string28);
                    break;
                case 17:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface17 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string29 = parcel.readString();
                    String string30 = parcel.readString();
                    String string31 = parcel.readString();
                    String string32 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAlternateConfigurationSnapshot(iPhenotypeCallbacksAsInterface17, string29, string30, string31, string32);
                    break;
                case 18:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface18 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string33 = parcel.readString();
                    String string34 = parcel.readString();
                    Flag[] flagArr = (Flag[]) parcel.createTypedArray(Flag.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFlagOverrides(iPhenotypeCallbacksAsInterface18, string33, string34, flagArr);
                    break;
                case 19:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface19 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RegistrationInfo[] registrationInfoArr = (RegistrationInfo[]) parcel.createTypedArray(RegistrationInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    bulkRegister(iPhenotypeCallbacksAsInterface19, registrationInfoArr);
                    break;
                case 20:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface20 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string35 = parcel.readString();
                    byte[] bArrCreateByteArray5 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setAppSpecificProperties(iPhenotypeCallbacksAsInterface20, string35, bArrCreateByteArray5);
                    break;
                case 21:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface21 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string36 = parcel.readString();
                    String string37 = parcel.readString();
                    GenericDimension[] genericDimensionArr = (GenericDimension[]) parcel.createTypedArray(GenericDimension.CREATOR);
                    enforceNoDataAvail(parcel);
                    setDimensions(iPhenotypeCallbacksAsInterface21, string36, string37, genericDimensionArr);
                    break;
                case 22:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface22 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getServingVersion(iPhenotypeCallbacksAsInterface22);
                    break;
                case 23:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface23 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String string38 = parcel.readString();
                    String string39 = parcel.readString();
                    String string40 = parcel.readString();
                    String string41 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getExperimentTokens(iPhenotypeCallbacksAsInterface23, string38, string39, string40, string41);
                    break;
                case 24:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface24 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    long j2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    syncAfterForApplication(iPhenotypeCallbacksAsInterface24, j2);
                    break;
                case 25:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string42 = parcel.readString();
                    byte[] bArrCreateByteArray6 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setRuntimeProperties(iStatusCallbackAsInterface, string42, bArrCreateByteArray6);
                    break;
                case 26:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String string43 = parcel.readString();
                    ArrayList arrayListB = sgh.b(parcel);
                    enforceNoDataAvail(parcel);
                    setExternalExperimentTokens(iStatusCallbackAsInterface2, string43, arrayListB);
                    break;
                case 27:
                    IGetStorageInfoCallbacks iGetStorageInfoCallbacksAsInterface = IGetStorageInfoCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getStorageInfo(iGetStorageInfoCallbacksAsInterface);
                    break;
                case 28:
                    String string44 = parcel.readString();
                    IFlagUpdateListener iFlagUpdateListenerAsInterface = IFlagUpdateListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerFlagUpdateListener(string44, iFlagUpdateListenerAsInterface);
                    break;
                case 29:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray7 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    setAppWideProperties(iStatusCallbackAsInterface3, bArrCreateByteArray7);
                    break;
                case 30:
                default:
                    return false;
                case 31:
                    IPhenotypeCallbacks iPhenotypeCallbacksAsInterface25 = IPhenotypeCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte[] bArrCreateByteArray8 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    commitToConfigurationV2(iPhenotypeCallbacksAsInterface25, bArrCreateByteArray8);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void bulkRegister(IPhenotypeCallbacks iPhenotypeCallbacks, RegistrationInfo[] registrationInfoArr);

    void commitToConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str);

    void commitToConfigurationV2(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr);

    void deleteFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3);

    void getAlternateConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4);

    void getCommittedConfiguration(IPhenotypeCallbacks iPhenotypeCallbacks, String str);

    void getConfigurationSnapshot(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2);

    void getConfigurationSnapshotWithToken(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3);

    void getDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks);

    void getExperimentTokens(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, String str4);

    void getExperimentsForLogging(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2);

    void getFlag(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, int i);

    void getServingVersion(IPhenotypeCallbacks iPhenotypeCallbacks);

    void getStorageInfo(IGetStorageInfoCallbacks iGetStorageInfoCallbacks);

    void listFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3);

    void register(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr);

    void registerFlagUpdateListener(String str, IFlagUpdateListener iFlagUpdateListener);

    void registerSync(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, byte[] bArr, String str2, String str3);

    void setAppSpecificProperties(IPhenotypeCallbacks iPhenotypeCallbacks, String str, byte[] bArr);

    void setAppWideProperties(IStatusCallback iStatusCallback, byte[] bArr);

    void setDimensions(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, GenericDimension[] genericDimensionArr);

    void setDogfoodsToken(IPhenotypeCallbacks iPhenotypeCallbacks, byte[] bArr);

    void setExternalExperimentTokens(IStatusCallback iStatusCallback, String str, List<byte[]> list);

    void setFlagOverride(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, String str3, int i, int i2, String str4);

    void setFlagOverrides(IPhenotypeCallbacks iPhenotypeCallbacks, String str, String str2, Flag[] flagArr);

    void setRuntimeProperties(IStatusCallback iStatusCallback, String str, byte[] bArr);

    void syncAfter(IPhenotypeCallbacks iPhenotypeCallbacks, String str, long j);

    void syncAfterForApplication(IPhenotypeCallbacks iPhenotypeCallbacks, long j);

    void unRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str);

    void weakRegister(IPhenotypeCallbacks iPhenotypeCallbacks, String str, int i, String[] strArr, int[] iArr, byte[] bArr);
}
