package com.google.android.gms.wallet.fragment.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWalletFragmentDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWalletFragmentDelegate {
        static final int TRANSACTION_getState = 13;
        static final int TRANSACTION_initialize = 10;
        static final int TRANSACTION_onActivityResult = 9;
        static final int TRANSACTION_onCreate = 2;
        static final int TRANSACTION_onCreateView = 3;
        static final int TRANSACTION_onInflate = 1;
        static final int TRANSACTION_onPause = 6;
        static final int TRANSACTION_onResume = 5;
        static final int TRANSACTION_onSaveInstanceState = 8;
        static final int TRANSACTION_onStart = 4;
        static final int TRANSACTION_onStop = 7;
        static final int TRANSACTION_setEnabled = 12;
        static final int TRANSACTION_updateMaskedWallet = 14;
        static final int TRANSACTION_updateMaskedWalletRequest = 11;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWalletFragmentDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public int getState() {
                Parcel parcelTransactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void initialize(WalletFragmentInitParams walletFragmentInitParams) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, walletFragmentInitParams);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onActivityResult(int i, int i2, Intent intent) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onCreate(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onInflate(IObjectWrapper iObjectWrapper, WalletFragmentOptions walletFragmentOptions, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, walletFragmentOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onPause() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onResume() {
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onSaveInstanceState(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                if (parcelTransactAndReadException.readInt() != 0) {
                    bundle.readFromParcel(parcelTransactAndReadException);
                }
                parcelTransactAndReadException.recycle();
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onStart() {
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onStop() {
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void setEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void updateMaskedWallet(MaskedWallet maskedWallet) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, maskedWallet);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, maskedWalletRequest);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
        }

        public static IWalletFragmentDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            return iInterfaceQueryLocalInterface instanceof IWalletFragmentDelegate ? (IWalletFragmentDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) sgh.a(parcel, WalletFragmentOptions.CREATOR);
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onInflate(iObjectWrapperAsInterface, walletFragmentOptions, bundle);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreate(bundle2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperOnCreateView = onCreateView(iObjectWrapperAsInterface2, iObjectWrapperAsInterface3, bundle3);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperOnCreateView);
                    return true;
                case 4:
                    onStart();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onResume();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onPause();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onStop();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveInstanceState(bundle4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundle4);
                    return true;
                case 9:
                    int i3 = parcel.readInt();
                    int i4 = parcel.readInt();
                    Intent intent = (Intent) sgh.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onActivityResult(i3, i4, intent);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) sgh.a(parcel, WalletFragmentInitParams.CREATOR);
                    enforceNoDataAvail(parcel);
                    initialize(walletFragmentInitParams);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    MaskedWalletRequest maskedWalletRequest = (MaskedWalletRequest) sgh.a(parcel, MaskedWalletRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateMaskedWalletRequest(maskedWalletRequest);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setEnabled(zG);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    int state = getState();
                    parcel2.writeNoException();
                    parcel2.writeInt(state);
                    return true;
                case 14:
                    MaskedWallet maskedWallet = (MaskedWallet) sgh.a(parcel, MaskedWallet.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateMaskedWallet(maskedWallet);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    int getState();

    void initialize(WalletFragmentInitParams walletFragmentInitParams);

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate(Bundle bundle);

    IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void onInflate(IObjectWrapper iObjectWrapper, WalletFragmentOptions walletFragmentOptions, Bundle bundle);

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void setEnabled(boolean z);

    void updateMaskedWallet(MaskedWallet maskedWallet);

    void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest);
}
