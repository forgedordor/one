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
public interface IPolygonDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPolygonDelegate {
        static final int TRANSACTION_equalsRemote = 19;
        static final int TRANSACTION_getFillColor = 12;
        static final int TRANSACTION_getHoles = 6;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getPoints = 4;
        static final int TRANSACTION_getStrokeColor = 10;
        static final int TRANSACTION_getStrokeJointType = 24;
        static final int TRANSACTION_getStrokePattern = 26;
        static final int TRANSACTION_getStrokeWidth = 8;
        static final int TRANSACTION_getTag = 28;
        static final int TRANSACTION_getZIndex = 14;
        static final int TRANSACTION_hashCodeRemote = 20;
        static final int TRANSACTION_isClickable = 22;
        static final int TRANSACTION_isGeodesic = 18;
        static final int TRANSACTION_isVisible = 16;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setClickable = 21;
        static final int TRANSACTION_setFillColor = 11;
        static final int TRANSACTION_setGeodesic = 17;
        static final int TRANSACTION_setHoles = 5;
        static final int TRANSACTION_setPoints = 3;
        static final int TRANSACTION_setStrokeColor = 9;
        static final int TRANSACTION_setStrokeJointType = 23;
        static final int TRANSACTION_setStrokePattern = 25;
        static final int TRANSACTION_setStrokeWidth = 7;
        static final int TRANSACTION_setTag = 27;
        static final int TRANSACTION_setVisible = 15;
        static final int TRANSACTION_setZIndex = 13;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPolygonDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean equalsRemote(IPolygonDelegate iPolygonDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPolygonDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int getFillColor() {
                Parcel parcelTransactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public List getHoles() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                ArrayList arrayListB = sgh.b(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return arrayListB;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public String getId() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public List<LatLng> getPoints() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(LatLng.CREATOR);
                parcelTransactAndReadException.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int getStrokeColor() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int getStrokeJointType() {
                Parcel parcelTransactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public List<PatternItem> getStrokePattern() {
                Parcel parcelTransactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(PatternItem.CREATOR);
                parcelTransactAndReadException.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public float getStrokeWidth() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public IObjectWrapper getTag() {
                Parcel parcelTransactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public float getZIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean isClickable() {
                Parcel parcelTransactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean isGeodesic() {
                Parcel parcelTransactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public boolean isVisible() {
                Parcel parcelTransactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setClickable(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setFillColor(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setGeodesic(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setHoles(List list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setPoints(List<LatLng> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokeColor(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokeJointType(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokePattern(List<PatternItem> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setStrokeWidth(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setVisible(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(15, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolygonDelegate
            public void setZIndex(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        }

        public static IPolygonDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            return iInterfaceQueryLocalInterface instanceof IPolygonDelegate ? (IPolygonDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(LatLng.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPoints(arrayListCreateTypedArrayList);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    List<LatLng> points = getPoints();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(points);
                    return true;
                case 5:
                    ArrayList arrayListB = sgh.b(parcel);
                    enforceNoDataAvail(parcel);
                    setHoles(arrayListB);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    List holes = getHoles();
                    parcel2.writeNoException();
                    parcel2.writeList(holes);
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
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setGeodesic(zG2);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean zIsGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zIsGeodesic ? 1 : 0);
                    return true;
                case 19:
                    IPolygonDelegate iPolygonDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zEqualsRemote = equalsRemote(iPolygonDelegateAsInterface);
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 20:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 21:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(zG3);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    int i8 = sgh.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 23:
                    int i9 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setStrokeJointType(i9);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int strokeJointType = getStrokeJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(strokeJointType);
                    return true;
                case 25:
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(PatternItem.CREATOR);
                    enforceNoDataAvail(parcel);
                    setStrokePattern(arrayListCreateTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    List<PatternItem> strokePattern = getStrokePattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(strokePattern);
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    sgh.f(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IPolygonDelegate iPolygonDelegate);

    int getFillColor();

    List getHoles();

    String getId();

    List<LatLng> getPoints();

    int getStrokeColor();

    int getStrokeJointType();

    List<PatternItem> getStrokePattern();

    float getStrokeWidth();

    IObjectWrapper getTag();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setClickable(boolean z);

    void setFillColor(int i);

    void setGeodesic(boolean z);

    void setHoles(List list);

    void setPoints(List<LatLng> list);

    void setStrokeColor(int i);

    void setStrokeJointType(int i);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f);

    void setTag(IObjectWrapper iObjectWrapper);

    void setVisible(boolean z);

    void setZIndex(float f);
}
