package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMarkerDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMarkerDelegate {
        static final int TRANSACTION_equalsRemote = 16;
        static final int TRANSACTION_getAlpha = 26;
        static final int TRANSACTION_getCollisionBehavior = 35;
        static final int TRANSACTION_getContentDescription = 36;
        static final int TRANSACTION_getIconView = 34;
        static final int TRANSACTION_getId = 2;
        static final int TRANSACTION_getMarkerType = 32;
        static final int TRANSACTION_getPosition = 4;
        static final int TRANSACTION_getRotation = 23;
        static final int TRANSACTION_getSnippet = 8;
        static final int TRANSACTION_getTag = 30;
        static final int TRANSACTION_getTitle = 6;
        static final int TRANSACTION_getZIndex = 28;
        static final int TRANSACTION_hashCodeRemote = 17;
        static final int TRANSACTION_hideInfoWindow = 12;
        static final int TRANSACTION_isDraggable = 10;
        static final int TRANSACTION_isFlat = 21;
        static final int TRANSACTION_isInfoWindowShown = 13;
        static final int TRANSACTION_isVisible = 15;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setAlpha = 25;
        static final int TRANSACTION_setAnchor = 19;
        static final int TRANSACTION_setDraggable = 9;
        static final int TRANSACTION_setFlat = 20;
        static final int TRANSACTION_setIcon = 18;
        static final int TRANSACTION_setIconView = 33;
        static final int TRANSACTION_setInfoWindowAnchor = 24;
        static final int TRANSACTION_setMarkerType = 31;
        static final int TRANSACTION_setPosition = 3;
        static final int TRANSACTION_setRotation = 22;
        static final int TRANSACTION_setSnippet = 7;
        static final int TRANSACTION_setTag = 29;
        static final int TRANSACTION_setTitle = 5;
        static final int TRANSACTION_setVisible = 14;
        static final int TRANSACTION_setZIndex = 27;
        static final int TRANSACTION_showInfoWindow = 11;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMarkerDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean equalsRemote(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(16, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public float getAlpha() {
                Parcel parcelTransactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public int getCollisionBehavior() {
                Parcel parcelTransactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getContentDescription() {
                Parcel parcelTransactAndReadException = transactAndReadException(36, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public IObjectWrapper getIconView() {
                Parcel parcelTransactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getId() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public int getMarkerType() {
                Parcel parcelTransactAndReadException = transactAndReadException(32, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public LatLng getPosition() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) sgh.a(parcelTransactAndReadException, LatLng.CREATOR);
                parcelTransactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public float getRotation() {
                Parcel parcelTransactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getSnippet() {
                Parcel parcelTransactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public IObjectWrapper getTag() {
                Parcel parcelTransactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public String getTitle() {
                Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public float getZIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void hideInfoWindow() {
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isDraggable() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isFlat() {
                Parcel parcelTransactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isInfoWindowShown() {
                Parcel parcelTransactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public boolean isVisible() {
                Parcel parcelTransactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setAlpha(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(25, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setAnchor(float f, float f2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                parcelObtainAndWriteInterfaceToken.writeFloat(f2);
                transactAndReadExceptionReturnVoid(19, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setDraggable(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setFlat(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setIcon(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setIconView(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(33, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setInfoWindowAnchor(float f, float f2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                parcelObtainAndWriteInterfaceToken.writeFloat(f2);
                transactAndReadExceptionReturnVoid(24, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setMarkerType(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(31, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setPosition(LatLng latLng) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setRotation(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(22, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setSnippet(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setTag(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(29, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setTitle(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setVisible(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(14, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void setZIndex(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(27, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IMarkerDelegate
            public void showInfoWindow() {
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        }

        public static IMarkerDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            return iInterfaceQueryLocalInterface instanceof IMarkerDelegate ? (IMarkerDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setTitle(string);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    String title = getTitle();
                    parcel2.writeNoException();
                    parcel2.writeString(title);
                    return true;
                case 7:
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    setSnippet(string2);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String snippet = getSnippet();
                    parcel2.writeNoException();
                    parcel2.writeString(snippet);
                    return true;
                case 9:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setDraggable(zG);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    boolean zIsDraggable = isDraggable();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsDraggable ? 1 : 0);
                    return true;
                case 11:
                    showInfoWindow();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    hideInfoWindow();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean zIsInfoWindowShown = isInfoWindowShown();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zIsInfoWindowShown ? 1 : 0);
                    return true;
                case 14:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(zG2);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 16:
                    IMarkerDelegate iMarkerDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zEqualsRemote = equalsRemote(iMarkerDelegateAsInterface);
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 17:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 18:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setIcon(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    float f = parcel.readFloat();
                    float f2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setAnchor(f, f2);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setFlat(zG3);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zIsFlat = isFlat();
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zIsFlat ? 1 : 0);
                    return true;
                case 22:
                    float f3 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setRotation(f3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    float rotation = getRotation();
                    parcel2.writeNoException();
                    parcel2.writeFloat(rotation);
                    return true;
                case 24:
                    float f4 = parcel.readFloat();
                    float f5 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setInfoWindowAnchor(f4, f5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    float f6 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setAlpha(f6);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    float alpha = getAlpha();
                    parcel2.writeNoException();
                    parcel2.writeFloat(alpha);
                    return true;
                case 27:
                    float f7 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(f7);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 29:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setTag(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    IObjectWrapper tag = getTag();
                    parcel2.writeNoException();
                    sgh.f(parcel2, tag);
                    return true;
                case 31:
                    int i8 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setMarkerType(i8);
                    parcel2.writeNoException();
                    return true;
                case 32:
                    int markerType = getMarkerType();
                    parcel2.writeNoException();
                    parcel2.writeInt(markerType);
                    return true;
                case 33:
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setIconView(iObjectWrapperAsInterface3);
                    parcel2.writeNoException();
                    return true;
                case 34:
                    IObjectWrapper iconView = getIconView();
                    parcel2.writeNoException();
                    sgh.f(parcel2, iconView);
                    return true;
                case 35:
                    int collisionBehavior = getCollisionBehavior();
                    parcel2.writeNoException();
                    parcel2.writeInt(collisionBehavior);
                    return true;
                case 36:
                    String contentDescription = getContentDescription();
                    parcel2.writeNoException();
                    parcel2.writeString(contentDescription);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IMarkerDelegate iMarkerDelegate);

    float getAlpha();

    int getCollisionBehavior();

    String getContentDescription();

    IObjectWrapper getIconView();

    String getId();

    int getMarkerType();

    LatLng getPosition();

    float getRotation();

    String getSnippet();

    IObjectWrapper getTag();

    String getTitle();

    float getZIndex();

    int hashCodeRemote();

    void hideInfoWindow();

    boolean isDraggable();

    boolean isFlat();

    boolean isInfoWindowShown();

    boolean isVisible();

    void remove();

    void setAlpha(float f);

    void setAnchor(float f, float f2);

    void setDraggable(boolean z);

    void setFlat(boolean z);

    void setIcon(IObjectWrapper iObjectWrapper);

    void setIconView(IObjectWrapper iObjectWrapper);

    void setInfoWindowAnchor(float f, float f2);

    void setMarkerType(int i);

    void setPosition(LatLng latLng);

    void setRotation(float f);

    void setSnippet(String str);

    void setTag(IObjectWrapper iObjectWrapper);

    void setTitle(String str);

    void setVisible(boolean z);

    void setZIndex(float f);

    void showInfoWindow();
}
