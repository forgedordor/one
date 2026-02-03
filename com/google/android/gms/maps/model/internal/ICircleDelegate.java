package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICircleDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICircleDelegate {
        static final int TRANSACTION_equalsRemote = 17;
        static final int TRANSACTION_getCenter = 4;
        static final int TRANSACTION_getFillColor = 12;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getRadius = 6;
        static final int TRANSACTION_getStrokeColor = 10;
        static final int TRANSACTION_getStrokePattern = 22;
        static final int TRANSACTION_getStrokeWidth = 8;
        static final int TRANSACTION_getTag = 24;
        static final int TRANSACTION_getZIndex = 14;
        static final int TRANSACTION_hashCodeRemote = 18;
        static final int TRANSACTION_isClickable = 20;
        static final int TRANSACTION_isVisible = 16;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setCenter = 3;
        static final int TRANSACTION_setClickable = 19;
        static final int TRANSACTION_setFillColor = 11;
        static final int TRANSACTION_setRadius = 5;
        static final int TRANSACTION_setStrokeColor = 9;
        static final int TRANSACTION_setStrokePattern = 21;
        static final int TRANSACTION_setStrokeWidth = 7;
        static final int TRANSACTION_setTag = 23;
        static final int TRANSACTION_setVisible = 15;
        static final int TRANSACTION_setZIndex = 13;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICircleDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public boolean equalsRemote(ICircleDelegate iCircleDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iCircleDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(17, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public LatLng getCenter() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) sgh.a(parcelTransactAndReadException, LatLng.CREATOR);
                parcelTransactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public int getFillColor() {
                Parcel parcelTransactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public String getId() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public double getRadius() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                double d = parcelTransactAndReadException.readDouble();
                parcelTransactAndReadException.recycle();
                return d;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public int getStrokeColor() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public List<PatternItem> getStrokePattern() {
                Parcel parcelTransactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
                ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(PatternItem.CREATOR);
                parcelTransactAndReadException.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public float getStrokeWidth() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public IObjectWrapper getTag() {
                Parcel parcelTransactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public float getZIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public boolean isClickable() {
                Parcel parcelTransactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public boolean isVisible() {
                Parcel parcelTransactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setCenter(LatLng latLng) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setClickable(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setFillColor(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setRadius(double d) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeDouble(d);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setStrokeColor(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setStrokePattern(List<PatternItem> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setStrokeWidth(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setVisible(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ICircleDelegate
            public void setZIndex(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.ICircleDelegate");
        }

        public static ICircleDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            return iInterfaceQueryLocalInterface instanceof ICircleDelegate ? (ICircleDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
                    setCenter(latLng);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    LatLng center = getCenter();
                    parcel2.writeNoException();
                    sgh.e(parcel2, center);
                    return true;
                case 5:
                    double d = parcel.readDouble();
                    enforceNoDataAvail(parcel);
                    setRadius(d);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    double radius = getRadius();
                    parcel2.writeNoException();
                    parcel2.writeDouble(radius);
                    return true;
                case 7:
                    float f = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setStrokeWidth(f);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    float strokeWidth = getStrokeWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(strokeWidth);
                    return true;
                case 9:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setStrokeColor(i3);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    int strokeColor = getStrokeColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(strokeColor);
                    return true;
                case 11:
                    int i4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setFillColor(i4);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    int fillColor = getFillColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(fillColor);
                    return true;
                case 13:
                    float f2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(f2);
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
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 17:
                    ICircleDelegate iCircleDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zEqualsRemote = equalsRemote(iCircleDelegateAsInterface);
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 18:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 19:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(zG2);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 21:
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(PatternItem.CREATOR);
                    enforceNoDataAvail(parcel);
                    setStrokePattern(arrayListCreateTypedArrayList);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    List<PatternItem> strokePattern = getStrokePattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(strokePattern);
                    return true;
                case 23:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    sgh.f(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(ICircleDelegate iCircleDelegate);

    LatLng getCenter();

    int getFillColor();

    String getId();

    double getRadius();

    int getStrokeColor();

    List<PatternItem> getStrokePattern();

    float getStrokeWidth();

    IObjectWrapper getTag();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setCenter(LatLng latLng);

    void setClickable(boolean z);

    void setFillColor(int i);

    void setRadius(double d);

    void setStrokeColor(int i);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f);

    void setTag(IObjectWrapper iObjectWrapper);

    void setVisible(boolean z);

    void setZIndex(float f);
}
