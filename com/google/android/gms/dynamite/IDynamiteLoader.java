package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDynamiteLoader extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDynamiteLoader {
        static final int TRANSACTION_createModuleContext = 2;
        static final int TRANSACTION_createModuleContext3NoCrashUtils = 8;
        static final int TRANSACTION_createModuleContextNoCrashUtils = 4;
        static final int TRANSACTION_getIDynamiteLoaderVersion = 6;
        static final int TRANSACTION_getModuleVersion = 1;
        static final int TRANSACTION_getModuleVersion2 = 3;
        static final int TRANSACTION_getModuleVersion2NoCrashUtils = 5;
        static final int TRANSACTION_queryForDynamiteModuleNoCrashUtils = 7;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDynamiteLoader {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper createModuleContext(IObjectWrapper iObjectWrapper, String str, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper createModuleContext3NoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper createModuleContextNoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getIDynamiteLoaderVersion() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getModuleVersion(IObjectWrapper iObjectWrapper, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getModuleVersion2(IObjectWrapper iObjectWrapper, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getModuleVersion2NoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper queryForDynamiteModuleNoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamite.IDynamiteLoader");
        }

        public static IDynamiteLoader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
            return iInterfaceQueryLocalInterface instanceof IDynamiteLoader ? (IDynamiteLoader) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int moduleVersion = getModuleVersion(iObjectWrapperAsInterface, string);
                    parcel2.writeNoException();
                    parcel2.writeInt(moduleVersion);
                    return true;
                case 2:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string2 = parcel.readString();
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperCreateModuleContext = createModuleContext(iObjectWrapperAsInterface2, string2, i3);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperCreateModuleContext);
                    return true;
                case 3:
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string3 = parcel.readString();
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    int moduleVersion2 = getModuleVersion2(iObjectWrapperAsInterface3, string3, zG);
                    parcel2.writeNoException();
                    parcel2.writeInt(moduleVersion2);
                    return true;
                case 4:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string4 = parcel.readString();
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperCreateModuleContextNoCrashUtils = createModuleContextNoCrashUtils(iObjectWrapperAsInterface4, string4, i4);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperCreateModuleContextNoCrashUtils);
                    return true;
                case 5:
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string5 = parcel.readString();
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    int moduleVersion2NoCrashUtils = getModuleVersion2NoCrashUtils(iObjectWrapperAsInterface5, string5, zG2);
                    parcel2.writeNoException();
                    parcel2.writeInt(moduleVersion2NoCrashUtils);
                    return true;
                case 6:
                    int iDynamiteLoaderVersion = getIDynamiteLoaderVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(iDynamiteLoaderVersion);
                    return true;
                case 7:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string6 = parcel.readString();
                    boolean zG3 = sgh.g(parcel);
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperQueryForDynamiteModuleNoCrashUtils = queryForDynamiteModuleNoCrashUtils(iObjectWrapperAsInterface6, string6, zG3, j);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperQueryForDynamiteModuleNoCrashUtils);
                    return true;
                case 8:
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string7 = parcel.readString();
                    int i5 = parcel.readInt();
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperCreateModuleContext3NoCrashUtils = createModuleContext3NoCrashUtils(iObjectWrapperAsInterface7, string7, i5, iObjectWrapperAsInterface8);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperCreateModuleContext3NoCrashUtils);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper createModuleContext(IObjectWrapper iObjectWrapper, String str, int i);

    IObjectWrapper createModuleContext3NoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2);

    IObjectWrapper createModuleContextNoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i);

    int getIDynamiteLoaderVersion();

    int getModuleVersion(IObjectWrapper iObjectWrapper, String str);

    int getModuleVersion2(IObjectWrapper iObjectWrapper, String str, boolean z);

    int getModuleVersion2NoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z);

    IObjectWrapper queryForDynamiteModuleNoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z, long j);
}
