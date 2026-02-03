package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.StyleSpan;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPolylineDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPolylineDelegate {
        static final int TRANSACTION_equalsRemote = 15;
        static final int TRANSACTION_getColor = 8;
        static final int TRANSACTION_getEndCap = 22;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getJointType = 24;
        static final int TRANSACTION_getPattern = 26;
        static final int TRANSACTION_getPoints = 4;
        static final int TRANSACTION_getSpans = 30;
        static final int TRANSACTION_getStartCap = 20;
        static final int TRANSACTION_getTag = 28;
        static final int TRANSACTION_getWidth = 6;
        static final int TRANSACTION_getZIndex = 10;
        static final int TRANSACTION_hashCodeRemote = 16;
        static final int TRANSACTION_isClickable = 18;
        static final int TRANSACTION_isGeodesic = 14;
        static final int TRANSACTION_isVisible = 12;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setClickable = 17;
        static final int TRANSACTION_setColor = 7;
        static final int TRANSACTION_setEndCap = 21;
        static final int TRANSACTION_setGeodesic = 13;
        static final int TRANSACTION_setJointType = 23;
        static final int TRANSACTION_setPattern = 25;
        static final int TRANSACTION_setPoints = 3;
        static final int TRANSACTION_setSpans = 29;
        static final int TRANSACTION_setStartCap = 19;
        static final int TRANSACTION_setTag = 27;
        static final int TRANSACTION_setVisible = 11;
        static final int TRANSACTION_setWidth = 5;
        static final int TRANSACTION_setZIndex = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPolylineDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean equalsRemote(IPolylineDelegate iPolylineDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iPolylineDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(15, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public int getColor() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public Cap getEndCap() {
                Parcel parcelTransactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
                Cap cap = (Cap) sgh.a(parcelTransactAndReadException, Cap.CREATOR);
                parcelTransactAndReadException.recycle();
                return cap;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public String getId() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public int getJointType() {
                Parcel parcelTransactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public List<PatternItem> getPattern() {
                Parcel parcelTransactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(PatternItem.CREATOR);
                parcelTransactAndReadException.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public List<LatLng> getPoints() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(LatLng.CREATOR);
                parcelTransactAndReadException.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public List<StyleSpan> getSpans() {
                Parcel parcelTransactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken());
                ArrayList arrayListCreateTypedArrayList = parcelTransactAndReadException.createTypedArrayList(StyleSpan.CREATOR);
                parcelTransactAndReadException.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public Cap getStartCap() {
                Parcel parcelTransactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
                Cap cap = (Cap) sgh.a(parcelTransactAndReadException, Cap.CREATOR);
                parcelTransactAndReadException.recycle();
                return cap;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public IObjectWrapper getTag() {
                Parcel parcelTransactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public float getWidth() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public float getZIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean isClickable() {
                Parcel parcelTransactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean isGeodesic() {
                Parcel parcelTransactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public boolean isVisible() {
                Parcel parcelTransactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setClickable(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setColor(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setEndCap(Cap cap) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, cap);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setGeodesic(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setJointType(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(23, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setPattern(List<PatternItem> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setPoints(List<LatLng> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setSpans(List<StyleSpan> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setStartCap(Cap cap) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, cap);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setVisible(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setWidth(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IPolylineDelegate
            public void setZIndex(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        }

        public static IPolylineDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            return iInterfaceQueryLocalInterface instanceof IPolylineDelegate ? (IPolylineDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
                    float f = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setWidth(f);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    float width = getWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(width);
                    return true;
                case 7:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setColor(i3);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    int color = getColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(color);
                    return true;
                case 9:
                    float f2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(f2);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 11:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(zG);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 13:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setGeodesic(zG2);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    boolean zIsGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsGeodesic ? 1 : 0);
                    return true;
                case 15:
                    IPolylineDelegate iPolylineDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zEqualsRemote = equalsRemote(iPolylineDelegateAsInterface);
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 16:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 17:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setClickable(zG3);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 19:
                    Cap cap = (Cap) sgh.a(parcel, Cap.CREATOR);
                    enforceNoDataAvail(parcel);
                    setStartCap(cap);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    Cap startCap = getStartCap();
                    parcel2.writeNoException();
                    sgh.e(parcel2, startCap);
                    return true;
                case 21:
                    Cap cap2 = (Cap) sgh.a(parcel, Cap.CREATOR);
                    enforceNoDataAvail(parcel);
                    setEndCap(cap2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    Cap endCap = getEndCap();
                    parcel2.writeNoException();
                    sgh.e(parcel2, endCap);
                    return true;
                case 23:
                    int i8 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setJointType(i8);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int jointType = getJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(jointType);
                    return true;
                case 25:
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(PatternItem.CREATOR);
                    enforceNoDataAvail(parcel);
                    setPattern(arrayListCreateTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    List<PatternItem> pattern = getPattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(pattern);
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
                case 29:
                    ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(StyleSpan.CREATOR);
                    enforceNoDataAvail(parcel);
                    setSpans(arrayListCreateTypedArrayList3);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    List<StyleSpan> spans = getSpans();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(spans);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IPolylineDelegate iPolylineDelegate);

    int getColor();

    Cap getEndCap();

    String getId();

    int getJointType();

    List<PatternItem> getPattern();

    List<LatLng> getPoints();

    List<StyleSpan> getSpans();

    Cap getStartCap();

    IObjectWrapper getTag();

    float getWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isClickable();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setClickable(boolean z);

    void setColor(int i);

    void setEndCap(Cap cap);

    void setGeodesic(boolean z);

    void setJointType(int i);

    void setPattern(List<PatternItem> list);

    void setPoints(List<LatLng> list);

    void setSpans(List<StyleSpan> list);

    void setStartCap(Cap cap);

    void setTag(IObjectWrapper iObjectWrapper);

    void setVisible(boolean z);

    void setWidth(float f);

    void setZIndex(float f);
}
