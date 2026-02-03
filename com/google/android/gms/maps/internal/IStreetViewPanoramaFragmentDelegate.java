package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IStreetViewPanoramaFragmentDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IStreetViewPanoramaFragmentDelegate {
        static final int TRANSACTION_getStreetViewPanorama = 1;
        static final int TRANSACTION_getStreetViewPanoramaAsync = 12;
        static final int TRANSACTION_isReady = 11;
        static final int TRANSACTION_onCreate = 3;
        static final int TRANSACTION_onCreateView = 4;
        static final int TRANSACTION_onDestroy = 8;
        static final int TRANSACTION_onDestroyView = 7;
        static final int TRANSACTION_onInflate = 2;
        static final int TRANSACTION_onLowMemory = 9;
        static final int TRANSACTION_onPause = 6;
        static final int TRANSACTION_onResume = 5;
        static final int TRANSACTION_onSaveInstanceState = 10;
        static final int TRANSACTION_onStart = 13;
        static final int TRANSACTION_onStop = 14;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IStreetViewPanoramaFragmentDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public IStreetViewPanoramaDelegate getStreetViewPanorama() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IStreetViewPanoramaDelegate iStreetViewPanoramaDelegateAsInterface = IStreetViewPanoramaDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iStreetViewPanoramaDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void getStreetViewPanoramaAsync(IOnStreetViewPanoramaReadyCallback iOnStreetViewPanoramaReadyCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnStreetViewPanoramaReadyCallback);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public boolean isReady() {
                Parcel parcelTransactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onCreate(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper2);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onDestroyView() {
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onInflate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, streetViewPanoramaOptions);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onLowMemory() {
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onPause() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onResume() {
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onSaveInstanceState(Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                if (parcelTransactAndReadException.readInt() != 0) {
                    bundle.readFromParcel(parcelTransactAndReadException);
                }
                parcelTransactAndReadException.recycle();
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onStart() {
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onStop() {
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        }

        public static IStreetViewPanoramaFragmentDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            return iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaFragmentDelegate ? (IStreetViewPanoramaFragmentDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStreetViewPanoramaDelegate streetViewPanorama = getStreetViewPanorama();
                    parcel2.writeNoException();
                    sgh.f(parcel2, streetViewPanorama);
                    return true;
                case 2:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) sgh.a(parcel, StreetViewPanoramaOptions.CREATOR);
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onInflate(iObjectWrapperAsInterface, streetViewPanoramaOptions, bundle);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    Bundle bundle2 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreate(bundle2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle3 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperOnCreateView = onCreateView(iObjectWrapperAsInterface2, iObjectWrapperAsInterface3, bundle3);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperOnCreateView);
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
                    onDestroyView();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    onLowMemory();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    Bundle bundle4 = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveInstanceState(bundle4);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundle4);
                    return true;
                case 11:
                    boolean zIsReady = isReady();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsReady ? 1 : 0);
                    return true;
                case 12:
                    IOnStreetViewPanoramaReadyCallback iOnStreetViewPanoramaReadyCallbackAsInterface = IOnStreetViewPanoramaReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getStreetViewPanoramaAsync(iOnStreetViewPanoramaReadyCallbackAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    onStart();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    onStop();
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    IStreetViewPanoramaDelegate getStreetViewPanorama();

    void getStreetViewPanoramaAsync(IOnStreetViewPanoramaReadyCallback iOnStreetViewPanoramaReadyCallback);

    boolean isReady();

    void onCreate(Bundle bundle);

    IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onInflate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
