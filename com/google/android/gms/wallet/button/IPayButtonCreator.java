package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPayButtonCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPayButtonCreator {
        static final int TRANSACTION_newPayButton = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPayButtonCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
            }

            @Override // com.google.android.gms.wallet.button.IPayButtonCreator
            public IObjectWrapper newPayButton(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, buttonOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.button.IPayButtonCreator");
        }

        public static IPayButtonCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
            return iInterfaceQueryLocalInterface instanceof IPayButtonCreator ? (IPayButtonCreator) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            ButtonOptions buttonOptions = (ButtonOptions) sgh.a(parcel, ButtonOptions.CREATOR);
            enforceNoDataAvail(parcel);
            IObjectWrapper iObjectWrapperNewPayButton = newPayButton(iObjectWrapperAsInterface, buttonOptions);
            parcel2.writeNoException();
            sgh.f(parcel2, iObjectWrapperNewPayButton);
            return true;
        }
    }

    IObjectWrapper newPayButton(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions);
}
