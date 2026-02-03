package com.google.android.gms.common.net;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISocketFactoryCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISocketFactoryCreator {
        static final int TRANSACTION_newSocketFactory = 1;
        static final int TRANSACTION_newSocketFactoryWithCacheDir = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISocketFactoryCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.net.ISocketFactoryCreator");
            }

            @Override // com.google.android.gms.common.net.ISocketFactoryCreator
            public IObjectWrapper newSocketFactory(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper3);
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.common.net.ISocketFactoryCreator
            public IObjectWrapper newSocketFactoryWithCacheDir(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper3);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.net.ISocketFactoryCreator");
        }

        public static ISocketFactoryCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
            return iInterfaceQueryLocalInterface instanceof ISocketFactoryCreator ? (ISocketFactoryCreator) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zG = sgh.g(parcel);
                enforceNoDataAvail(parcel);
                IObjectWrapper iObjectWrapperNewSocketFactory = newSocketFactory(iObjectWrapperAsInterface, iObjectWrapperAsInterface2, iObjectWrapperAsInterface3, zG);
                parcel2.writeNoException();
                sgh.f(parcel2, iObjectWrapperNewSocketFactory);
            } else {
                if (i != 2) {
                    return false;
                }
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                IObjectWrapper iObjectWrapperNewSocketFactoryWithCacheDir = newSocketFactoryWithCacheDir(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5, iObjectWrapperAsInterface6, string);
                parcel2.writeNoException();
                sgh.f(parcel2, iObjectWrapperNewSocketFactoryWithCacheDir);
            }
            return true;
        }
    }

    IObjectWrapper newSocketFactory(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, boolean z);

    IObjectWrapper newSocketFactoryWithCacheDir(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, String str);
}
