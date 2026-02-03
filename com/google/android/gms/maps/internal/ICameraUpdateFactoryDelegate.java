package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICameraUpdateFactoryDelegate {
        static final int TRANSACTION_newCameraPosition = 7;
        static final int TRANSACTION_newLatLng = 8;
        static final int TRANSACTION_newLatLngBounds = 10;
        static final int TRANSACTION_newLatLngBoundsWithSize = 11;
        static final int TRANSACTION_newLatLngZoom = 9;
        static final int TRANSACTION_scrollBy = 3;
        static final int TRANSACTION_zoomBy = 5;
        static final int TRANSACTION_zoomByWithFocus = 6;
        static final int TRANSACTION_zoomIn = 1;
        static final int TRANSACTION_zoomOut = 2;
        static final int TRANSACTION_zoomTo = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICameraUpdateFactoryDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newCameraPosition(CameraPosition cameraPosition) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, cameraPosition);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLng(LatLng latLng) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLngBounds);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLngBounds);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                parcelObtainAndWriteInterfaceToken.writeInt(i3);
                Parcel parcelTransactAndReadException = transactAndReadException(11, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper newLatLngZoom(LatLng latLng, float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper scrollBy(float f, float f2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                parcelObtainAndWriteInterfaceToken.writeFloat(f2);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomBy(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomByWithFocus(float f, int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomIn() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomOut() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public IObjectWrapper zoomTo(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        }

        public static ICameraUpdateFactoryDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return iInterfaceQueryLocalInterface instanceof ICameraUpdateFactoryDelegate ? (ICameraUpdateFactoryDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper iObjectWrapperZoomIn = zoomIn();
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperZoomIn);
                    return true;
                case 2:
                    IObjectWrapper iObjectWrapperZoomOut = zoomOut();
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperZoomOut);
                    return true;
                case 3:
                    float f = parcel.readFloat();
                    float f2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperScrollBy = scrollBy(f, f2);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperScrollBy);
                    return true;
                case 4:
                    float f3 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperZoomTo = zoomTo(f3);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperZoomTo);
                    return true;
                case 5:
                    float f4 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperZoomBy = zoomBy(f4);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperZoomBy);
                    return true;
                case 6:
                    float f5 = parcel.readFloat();
                    int i3 = parcel.readInt();
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperZoomByWithFocus = zoomByWithFocus(f5, i3, i4);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperZoomByWithFocus);
                    return true;
                case 7:
                    CameraPosition cameraPosition = (CameraPosition) sgh.a(parcel, CameraPosition.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperNewCameraPosition = newCameraPosition(cameraPosition);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperNewCameraPosition);
                    return true;
                case 8:
                    LatLng latLng = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperNewLatLng = newLatLng(latLng);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperNewLatLng);
                    return true;
                case 9:
                    LatLng latLng2 = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                    float f6 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperNewLatLngZoom = newLatLngZoom(latLng2, f6);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperNewLatLngZoom);
                    return true;
                case 10:
                    LatLngBounds latLngBounds = (LatLngBounds) sgh.a(parcel, LatLngBounds.CREATOR);
                    int i5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperNewLatLngBounds = newLatLngBounds(latLngBounds, i5);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperNewLatLngBounds);
                    return true;
                case 11:
                    LatLngBounds latLngBounds2 = (LatLngBounds) sgh.a(parcel, LatLngBounds.CREATOR);
                    int i6 = parcel.readInt();
                    int i7 = parcel.readInt();
                    int i8 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperNewLatLngBoundsWithSize = newLatLngBoundsWithSize(latLngBounds2, i6, i7, i8);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperNewLatLngBoundsWithSize);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper newCameraPosition(CameraPosition cameraPosition);

    IObjectWrapper newLatLng(LatLng latLng);

    IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i);

    IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3);

    IObjectWrapper newLatLngZoom(LatLng latLng, float f);

    IObjectWrapper scrollBy(float f, float f2);

    IObjectWrapper zoomBy(float f);

    IObjectWrapper zoomByWithFocus(float f, int i, int i2);

    IObjectWrapper zoomIn();

    IObjectWrapper zoomOut();

    IObjectWrapper zoomTo(float f);
}
