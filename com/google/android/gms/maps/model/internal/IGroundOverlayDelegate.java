package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGroundOverlayDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGroundOverlayDelegate {
        static final int TRANSACTION_equalsRemote = 19;
        static final int TRANSACTION_getBearing = 12;
        static final int TRANSACTION_getBounds = 10;
        static final int TRANSACTION_getHeight = 8;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getPosition = 4;
        static final int TRANSACTION_getTag = 25;
        static final int TRANSACTION_getTransparency = 18;
        static final int TRANSACTION_getWidth = 7;
        static final int TRANSACTION_getZIndex = 14;
        static final int TRANSACTION_hashCodeRemote = 20;
        static final int TRANSACTION_isClickable = 23;
        static final int TRANSACTION_isVisible = 16;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setBearing = 11;
        static final int TRANSACTION_setClickable = 22;
        static final int TRANSACTION_setDimensions = 5;
        static final int TRANSACTION_setDimensionsWithHeight = 6;
        static final int TRANSACTION_setImage = 21;
        static final int TRANSACTION_setPosition = 3;
        static final int TRANSACTION_setPositionFromBounds = 9;
        static final int TRANSACTION_setTag = 24;
        static final int TRANSACTION_setTransparency = 17;
        static final int TRANSACTION_setVisible = 15;
        static final int TRANSACTION_setZIndex = 13;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGroundOverlayDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGroundOverlayDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getBearing() {
                Parcel parcelTransactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public LatLngBounds getBounds() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                LatLngBounds latLngBounds = (LatLngBounds) sgh.a(parcelTransactAndReadException, LatLngBounds.CREATOR);
                parcelTransactAndReadException.recycle();
                return latLngBounds;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getHeight() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public String getId() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public LatLng getPosition() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) sgh.a(parcelTransactAndReadException, LatLng.CREATOR);
                parcelTransactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public IObjectWrapper getTag() {
                Parcel parcelTransactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getTransparency() {
                Parcel parcelTransactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getWidth() {
                Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public float getZIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public boolean isClickable() {
                Parcel parcelTransactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public boolean isVisible() {
                Parcel parcelTransactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setBearing(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setClickable(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setDimensions(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setDimensionsWithHeight(float f, float f2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                parcelObtainAndWriteInterfaceToken.writeFloat(f2);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setImage(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setPosition(LatLng latLng) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setPositionFromBounds(LatLngBounds latLngBounds) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLngBounds);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setTransparency(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setVisible(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IGroundOverlayDelegate
            public void setZIndex(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        }

        public static IGroundOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            return iInterfaceQueryLocalInterface instanceof IGroundOverlayDelegate ? (IGroundOverlayDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    remove();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 3:
                    LatLng latLng = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPosition(latLng);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    LatLng position = getPosition();
                    parcel2.writeNoException();
                    sgh.e(parcel2, position);
                    return true;
                case 5:
                    float f = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setDimensions(f);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    float f2 = parcel.readFloat();
                    float f3 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setDimensionsWithHeight(f2, f3);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    float width = getWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(width);
                    return true;
                case 8:
                    float height = getHeight();
                    parcel2.writeNoException();
                    parcel2.writeFloat(height);
                    return true;
                case 9:
                    LatLngBounds latLngBounds = (LatLngBounds) sgh.a(parcel, LatLngBounds.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPositionFromBounds(latLngBounds);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    LatLngBounds bounds = getBounds();
                    parcel2.writeNoException();
                    sgh.e(parcel2, bounds);
                    return true;
                case 11:
                    float f4 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setBearing(f4);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    float bearing = getBearing();
                    parcel2.writeNoException();
                    parcel2.writeFloat(bearing);
                    return true;
                case 13:
                    float f5 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(f5);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 15:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(zG);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 17:
                    float f6 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setTransparency(f6);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    float transparency = getTransparency();
                    parcel2.writeNoException();
                    parcel2.writeFloat(transparency);
                    return true;
                case 19:
                    IGroundOverlayDelegate iGroundOverlayDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zEqualsRemote = equalsRemote(iGroundOverlayDelegateAsInterface);
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 20:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 21:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setImage(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(zG2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    sgh.f(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate);

    float getBearing();

    LatLngBounds getBounds();

    float getHeight();

    String getId();

    LatLng getPosition();

    IObjectWrapper getTag();

    float getTransparency();

    float getWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setBearing(float f);

    void setClickable(boolean z);

    void setDimensions(float f);

    void setDimensionsWithHeight(float f, float f2);

    void setImage(IObjectWrapper iObjectWrapper);

    void setPosition(LatLng latLng);

    void setPositionFromBounds(LatLngBounds latLngBounds);

    void setTag(IObjectWrapper iObjectWrapper);

    void setTransparency(float f);

    void setVisible(boolean z);

    void setZIndex(float f);
}
