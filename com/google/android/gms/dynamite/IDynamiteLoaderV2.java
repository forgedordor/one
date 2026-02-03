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
public interface IDynamiteLoaderV2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDynamiteLoaderV2 {
        static final int TRANSACTION_loadModule = 1;
        static final int TRANSACTION_loadModule2 = 2;
        static final int TRANSACTION_loadModule2NoCrashUtils = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDynamiteLoaderV2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoaderV2
            public IObjectWrapper loadModule(IObjectWrapper iObjectWrapper, String str, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoaderV2
            public IObjectWrapper loadModule2(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoaderV2
            public IObjectWrapper loadModule2NoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        }

        public static IDynamiteLoaderV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
            return iInterfaceQueryLocalInterface instanceof IDynamiteLoaderV2 ? (IDynamiteLoaderV2) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                IObjectWrapper iObjectWrapperLoadModule = loadModule(iObjectWrapperAsInterface, string, bArrCreateByteArray);
                parcel2.writeNoException();
                sgh.f(parcel2, iObjectWrapperLoadModule);
            } else if (i == 2) {
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper iObjectWrapperLoadModule2 = loadModule2(iObjectWrapperAsInterface2, string2, i3, iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                sgh.f(parcel2, iObjectWrapperLoadModule2);
            } else {
                if (i != 3) {
                    return false;
                }
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper iObjectWrapperLoadModule2NoCrashUtils = loadModule2NoCrashUtils(iObjectWrapperAsInterface4, string3, i4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                sgh.f(parcel2, iObjectWrapperLoadModule2NoCrashUtils);
            }
            return true;
        }
    }

    IObjectWrapper loadModule(IObjectWrapper iObjectWrapper, String str, byte[] bArr);

    IObjectWrapper loadModule2(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2);

    IObjectWrapper loadModule2NoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2);
}
