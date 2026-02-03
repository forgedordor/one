package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener;
import com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IStreetViewPanoramaDelegate {
        static final int TRANSACTION_animateTo = 9;
        static final int TRANSACTION_enablePanning = 2;
        static final int TRANSACTION_enableStreetNames = 4;
        static final int TRANSACTION_enableUserNavigation = 3;
        static final int TRANSACTION_enableZoom = 1;
        static final int TRANSACTION_getPanoramaCamera = 10;
        static final int TRANSACTION_getStreetViewPanoramaLocation = 14;
        static final int TRANSACTION_isPanningGesturesEnabled = 6;
        static final int TRANSACTION_isStreetNamesEnabled = 8;
        static final int TRANSACTION_isUserNavigationEnabled = 7;
        static final int TRANSACTION_isZoomGesturesEnabled = 5;
        static final int TRANSACTION_orientationToPoint = 19;
        static final int TRANSACTION_pointToOrientation = 18;
        static final int TRANSACTION_setOnStreetViewPanoramaCameraChangeListener = 16;
        static final int TRANSACTION_setOnStreetViewPanoramaChangeListener = 15;
        static final int TRANSACTION_setOnStreetViewPanoramaClickListener = 17;
        static final int TRANSACTION_setOnStreetViewPanoramaLongClickListener = 20;
        static final int TRANSACTION_setPosition = 12;
        static final int TRANSACTION_setPositionWithID = 11;
        static final int TRANSACTION_setPositionWithRadius = 13;
        static final int TRANSACTION_setPositionWithRadiusAndSource = 22;
        static final int TRANSACTION_setPositionWithSource = 21;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IStreetViewPanoramaDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, streetViewPanoramaCamera);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enablePanning(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableStreetNames(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableUserNavigation(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableZoom(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaCamera getPanoramaCamera() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) sgh.a(parcelTransactAndReadException, StreetViewPanoramaCamera.CREATOR);
                parcelTransactAndReadException.recycle();
                return streetViewPanoramaCamera;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaLocation getStreetViewPanoramaLocation() {
                Parcel parcelTransactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) sgh.a(parcelTransactAndReadException, StreetViewPanoramaLocation.CREATOR);
                parcelTransactAndReadException.recycle();
                return streetViewPanoramaLocation;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isPanningGesturesEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isStreetNamesEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isUserNavigationEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isZoomGesturesEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, streetViewPanoramaOrientation);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(18, parcelObtainAndWriteInterfaceToken);
                StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) sgh.a(parcelTransactAndReadException, StreetViewPanoramaOrientation.CREATOR);
                parcelTransactAndReadException.recycle();
                return streetViewPanoramaOrientation;
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaCameraChangeListener(IOnStreetViewPanoramaCameraChangeListener iOnStreetViewPanoramaCameraChangeListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnStreetViewPanoramaCameraChangeListener);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaChangeListener(IOnStreetViewPanoramaChangeListener iOnStreetViewPanoramaChangeListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnStreetViewPanoramaChangeListener);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaClickListener(IOnStreetViewPanoramaClickListener iOnStreetViewPanoramaClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnStreetViewPanoramaClickListener);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaLongClickListener(IOnStreetViewPanoramaLongClickListener iOnStreetViewPanoramaLongClickListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnStreetViewPanoramaLongClickListener);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPosition(LatLng latLng) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithID(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithRadius(LatLng latLng, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, streetViewSource);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                sgh.d(parcelObtainAndWriteInterfaceToken, streetViewSource);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
        }

        public static IStreetViewPanoramaDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            return iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaDelegate ? (IStreetViewPanoramaDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    enableZoom(zG);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    enablePanning(zG2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    enableUserNavigation(zG3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean zG4 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    enableStreetNames(zG4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean zIsZoomGesturesEnabled = isZoomGesturesEnabled();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsZoomGesturesEnabled ? 1 : 0);
                    return true;
                case 6:
                    boolean zIsPanningGesturesEnabled = isPanningGesturesEnabled();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zIsPanningGesturesEnabled ? 1 : 0);
                    return true;
                case 7:
                    boolean zIsUserNavigationEnabled = isUserNavigationEnabled();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsUserNavigationEnabled ? 1 : 0);
                    return true;
                case 8:
                    boolean zIsStreetNamesEnabled = isStreetNamesEnabled();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zIsStreetNamesEnabled ? 1 : 0);
                    return true;
                case 9:
                    StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) sgh.a(parcel, StreetViewPanoramaCamera.CREATOR);
                    long j = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    animateTo(streetViewPanoramaCamera, j);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    StreetViewPanoramaCamera panoramaCamera = getPanoramaCamera();
                    parcel2.writeNoException();
                    sgh.e(parcel2, panoramaCamera);
                    return true;
                case 11:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setPositionWithID(string);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    LatLng latLng = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPosition(latLng);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    LatLng latLng2 = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                    int i7 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setPositionWithRadius(latLng2, i7);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    StreetViewPanoramaLocation streetViewPanoramaLocation = getStreetViewPanoramaLocation();
                    parcel2.writeNoException();
                    sgh.e(parcel2, streetViewPanoramaLocation);
                    return true;
                case 15:
                    IOnStreetViewPanoramaChangeListener iOnStreetViewPanoramaChangeListenerAsInterface = IOnStreetViewPanoramaChangeListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaChangeListener(iOnStreetViewPanoramaChangeListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    IOnStreetViewPanoramaCameraChangeListener iOnStreetViewPanoramaCameraChangeListenerAsInterface = IOnStreetViewPanoramaCameraChangeListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaCameraChangeListener(iOnStreetViewPanoramaCameraChangeListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    IOnStreetViewPanoramaClickListener iOnStreetViewPanoramaClickListenerAsInterface = IOnStreetViewPanoramaClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaClickListener(iOnStreetViewPanoramaClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    StreetViewPanoramaOrientation streetViewPanoramaOrientationPointToOrientation = pointToOrientation(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    sgh.e(parcel2, streetViewPanoramaOrientationPointToOrientation);
                    return true;
                case 19:
                    StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) sgh.a(parcel, StreetViewPanoramaOrientation.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperOrientationToPoint = orientationToPoint(streetViewPanoramaOrientation);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperOrientationToPoint);
                    return true;
                case 20:
                    IOnStreetViewPanoramaLongClickListener iOnStreetViewPanoramaLongClickListenerAsInterface = IOnStreetViewPanoramaLongClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setOnStreetViewPanoramaLongClickListener(iOnStreetViewPanoramaLongClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    LatLng latLng3 = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                    StreetViewSource streetViewSource = (StreetViewSource) sgh.a(parcel, StreetViewSource.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPositionWithSource(latLng3, streetViewSource);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    LatLng latLng4 = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                    int i8 = parcel.readInt();
                    StreetViewSource streetViewSource2 = (StreetViewSource) sgh.a(parcel, StreetViewSource.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPositionWithRadiusAndSource(latLng4, i8, streetViewSource2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j);

    void enablePanning(boolean z);

    void enableStreetNames(boolean z);

    void enableUserNavigation(boolean z);

    void enableZoom(boolean z);

    StreetViewPanoramaCamera getPanoramaCamera();

    StreetViewPanoramaLocation getStreetViewPanoramaLocation();

    boolean isPanningGesturesEnabled();

    boolean isStreetNamesEnabled();

    boolean isUserNavigationEnabled();

    boolean isZoomGesturesEnabled();

    IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper);

    void setOnStreetViewPanoramaCameraChangeListener(IOnStreetViewPanoramaCameraChangeListener iOnStreetViewPanoramaCameraChangeListener);

    void setOnStreetViewPanoramaChangeListener(IOnStreetViewPanoramaChangeListener iOnStreetViewPanoramaChangeListener);

    void setOnStreetViewPanoramaClickListener(IOnStreetViewPanoramaClickListener iOnStreetViewPanoramaClickListener);

    void setOnStreetViewPanoramaLongClickListener(IOnStreetViewPanoramaLongClickListener iOnStreetViewPanoramaLongClickListener);

    void setPosition(LatLng latLng);

    void setPositionWithID(String str);

    void setPositionWithRadius(LatLng latLng, int i);

    void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource);

    void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource);
}
