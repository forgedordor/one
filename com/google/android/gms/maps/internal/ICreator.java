package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICreator extends IInterface {
    public static final int RENDERER_TYPE_LATEST = 2;
    public static final int RENDERER_TYPE_LEGACY = 1;
    public static final int RENDERER_TYPE_UNKNOWN = 0;

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICreator {
        static final int TRANSACTION_addInternalUsageAttributionId = 12;
        static final int TRANSACTION_getRendererType = 9;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_initV2 = 6;
        static final int TRANSACTION_logInitialization = 10;
        static final int TRANSACTION_newBitmapDescriptorFactoryDelegate = 5;
        static final int TRANSACTION_newCameraUpdateFactoryDelegate = 4;
        static final int TRANSACTION_newMapFragmentDelegate = 2;
        static final int TRANSACTION_newMapViewDelegate = 3;
        static final int TRANSACTION_newStreetViewPanoramaFragmentDelegate = 8;
        static final int TRANSACTION_newStreetViewPanoramaViewDelegate = 7;
        static final int TRANSACTION_preInit = 11;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.ICreator");
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void addInternalUsageAttributionId(IObjectWrapper iObjectWrapper, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public int getRendererType() {
                Parcel parcelTransactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void init(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void initV2(IObjectWrapper iObjectWrapper, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void logInitialization(IObjectWrapper iObjectWrapper, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IBitmapDescriptorFactoryDelegate newBitmapDescriptorFactoryDelegate() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                IBitmapDescriptorFactoryDelegate iBitmapDescriptorFactoryDelegateAsInterface = IBitmapDescriptorFactoryDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iBitmapDescriptorFactoryDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public ICameraUpdateFactoryDelegate newCameraUpdateFactoryDelegate() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegateAsInterface = ICameraUpdateFactoryDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iCameraUpdateFactoryDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IMapFragmentDelegate newMapFragmentDelegate(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IMapFragmentDelegate iMapFragmentDelegateAsInterface = IMapFragmentDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMapFragmentDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IMapViewDelegate newMapViewDelegate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, googleMapOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                IMapViewDelegate iMapViewDelegateAsInterface = IMapViewDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iMapViewDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IStreetViewPanoramaFragmentDelegate newStreetViewPanoramaFragmentDelegate(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegateAsInterface = IStreetViewPanoramaFragmentDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iStreetViewPanoramaFragmentDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public IStreetViewPanoramaViewDelegate newStreetViewPanoramaViewDelegate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                sgh.d(parcelObtainAndWriteInterfaceToken, streetViewPanoramaOptions);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegateAsInterface = IStreetViewPanoramaViewDelegate.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iStreetViewPanoramaViewDelegateAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICreator
            public void preInit(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.ICreator");
        }

        public static ICreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterfaceQueryLocalInterface instanceof ICreator ? (ICreator) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    init(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    IMapFragmentDelegate iMapFragmentDelegateNewMapFragmentDelegate = newMapFragmentDelegate(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iMapFragmentDelegateNewMapFragmentDelegate);
                    return true;
                case 3:
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    GoogleMapOptions googleMapOptions = (GoogleMapOptions) sgh.a(parcel, GoogleMapOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IMapViewDelegate iMapViewDelegateNewMapViewDelegate = newMapViewDelegate(iObjectWrapperAsInterface3, googleMapOptions);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iMapViewDelegateNewMapViewDelegate);
                    return true;
                case 4:
                    ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegateNewCameraUpdateFactoryDelegate = newCameraUpdateFactoryDelegate();
                    parcel2.writeNoException();
                    sgh.f(parcel2, iCameraUpdateFactoryDelegateNewCameraUpdateFactoryDelegate);
                    return true;
                case 5:
                    IBitmapDescriptorFactoryDelegate iBitmapDescriptorFactoryDelegateNewBitmapDescriptorFactoryDelegate = newBitmapDescriptorFactoryDelegate();
                    parcel2.writeNoException();
                    sgh.f(parcel2, iBitmapDescriptorFactoryDelegateNewBitmapDescriptorFactoryDelegate);
                    return true;
                case 6:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    initV2(iObjectWrapperAsInterface4, i3);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) sgh.a(parcel, StreetViewPanoramaOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegateNewStreetViewPanoramaViewDelegate = newStreetViewPanoramaViewDelegate(iObjectWrapperAsInterface5, streetViewPanoramaOptions);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iStreetViewPanoramaViewDelegateNewStreetViewPanoramaViewDelegate);
                    return true;
                case 8:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegateNewStreetViewPanoramaFragmentDelegate = newStreetViewPanoramaFragmentDelegate(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iStreetViewPanoramaFragmentDelegateNewStreetViewPanoramaFragmentDelegate);
                    return true;
                case 9:
                    int rendererType = getRendererType();
                    parcel2.writeNoException();
                    parcel2.writeInt(rendererType);
                    return true;
                case 10:
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    logInitialization(iObjectWrapperAsInterface7, i4);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    preInit(iObjectWrapperAsInterface8);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    addInternalUsageAttributionId(iObjectWrapperAsInterface9, string);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void addInternalUsageAttributionId(IObjectWrapper iObjectWrapper, String str);

    int getRendererType();

    void init(IObjectWrapper iObjectWrapper);

    void initV2(IObjectWrapper iObjectWrapper, int i);

    void logInitialization(IObjectWrapper iObjectWrapper, int i);

    IBitmapDescriptorFactoryDelegate newBitmapDescriptorFactoryDelegate();

    ICameraUpdateFactoryDelegate newCameraUpdateFactoryDelegate();

    IMapFragmentDelegate newMapFragmentDelegate(IObjectWrapper iObjectWrapper);

    IMapViewDelegate newMapViewDelegate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions);

    IStreetViewPanoramaFragmentDelegate newStreetViewPanoramaFragmentDelegate(IObjectWrapper iObjectWrapper);

    IStreetViewPanoramaViewDelegate newStreetViewPanoramaViewDelegate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    void preInit(IObjectWrapper iObjectWrapper);
}
