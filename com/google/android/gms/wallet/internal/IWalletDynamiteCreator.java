package com.google.android.gms.wallet.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate;
import com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWalletDynamiteCreator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWalletDynamiteCreator {
        static final int TRANSACTION_newWalletFragmentDelegate = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWalletDynamiteCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            }

            @Override // com.google.android.gms.wallet.internal.IWalletDynamiteCreator
            public IWalletFragmentDelegate newWalletFragmentDelegate(IObjectWrapper iObjectWrapper, IFragmentWrapper iFragmentWrapper, WalletFragmentOptions walletFragmentOptions, IWalletFragmentStateListener iWalletFragmentStateListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iFragmentWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, walletFragmentOptions);
                sgh.f(parcelObtainAndWriteInterfaceToken, iWalletFragmentStateListener);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IWalletFragmentDelegate iWalletFragmentDelegateAsInterface = IWalletFragmentDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iWalletFragmentDelegateAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        }

        public static IWalletDynamiteCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            return iInterfaceQueryLocalInterface instanceof IWalletDynamiteCreator ? (IWalletDynamiteCreator) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IFragmentWrapper iFragmentWrapperAsInterface = IFragmentWrapper.Stub.asInterface(parcel.readStrongBinder());
            WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) sgh.a(parcel, WalletFragmentOptions.CREATOR);
            IWalletFragmentStateListener iWalletFragmentStateListenerAsInterface = IWalletFragmentStateListener.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            IWalletFragmentDelegate iWalletFragmentDelegateNewWalletFragmentDelegate = newWalletFragmentDelegate(iObjectWrapperAsInterface, iFragmentWrapperAsInterface, walletFragmentOptions, iWalletFragmentStateListenerAsInterface);
            parcel2.writeNoException();
            sgh.f(parcel2, iWalletFragmentDelegateNewWalletFragmentDelegate);
            return true;
        }
    }

    IWalletFragmentDelegate newWalletFragmentDelegate(IObjectWrapper iObjectWrapper, IFragmentWrapper iFragmentWrapper, WalletFragmentOptions walletFragmentOptions, IWalletFragmentStateListener iWalletFragmentStateListener);
}
