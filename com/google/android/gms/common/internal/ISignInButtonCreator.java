package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISignInButtonCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignInButtonCreator {
        static final int TRANSACTION_newSignInButton = 1;
        static final int TRANSACTION_newSignInButtonFromConfig = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignInButtonCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
            }

            @Override // com.google.android.gms.common.internal.ISignInButtonCreator
            public IObjectWrapper newSignInButton(IObjectWrapper iObjectWrapper, int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.common.internal.ISignInButtonCreator
            public IObjectWrapper newSignInButtonFromConfig(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, signInButtonConfig);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.ISignInButtonCreator");
        }

        public static ISignInButtonCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            return iInterfaceQueryLocalInterface instanceof ISignInButtonCreator ? (ISignInButtonCreator) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                IObjectWrapper iObjectWrapperNewSignInButton = newSignInButton(iObjectWrapperAsInterface, i3, i4);
                parcel2.writeNoException();
                sgh.f(parcel2, iObjectWrapperNewSignInButton);
            } else {
                if (i != 2) {
                    return false;
                }
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                SignInButtonConfig signInButtonConfig = (SignInButtonConfig) sgh.a(parcel, SignInButtonConfig.CREATOR);
                enforceNoDataAvail(parcel);
                IObjectWrapper iObjectWrapperNewSignInButtonFromConfig = newSignInButtonFromConfig(iObjectWrapperAsInterface2, signInButtonConfig);
                parcel2.writeNoException();
                sgh.f(parcel2, iObjectWrapperNewSignInButtonFromConfig);
            }
            return true;
        }
    }

    IObjectWrapper newSignInButton(IObjectWrapper iObjectWrapper, int i, int i2);

    IObjectWrapper newSignInButtonFromConfig(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig);
}
