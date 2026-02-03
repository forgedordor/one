package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITileOverlayDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITileOverlayDelegate {
        static final int TRANSACTION_clearTileCache = 2;
        static final int TRANSACTION_equalsRemote = 8;
        static final int TRANSACTION_getFadeIn = 11;
        static final int TRANSACTION_getId = 3;
        static final int TRANSACTION_getTransparency = 13;
        static final int TRANSACTION_getZIndex = 5;
        static final int TRANSACTION_hashCodeRemote = 9;
        static final int TRANSACTION_isVisible = 7;
        static final int TRANSACTION_remove = 1;
        static final int TRANSACTION_setFadeIn = 10;
        static final int TRANSACTION_setTransparency = 12;
        static final int TRANSACTION_setVisible = 6;
        static final int TRANSACTION_setZIndex = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITileOverlayDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void clearTileCache() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iTileOverlayDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public boolean getFadeIn() {
                Parcel parcelTransactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public String getId() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public float getTransparency() {
                Parcel parcelTransactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public float getZIndex() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                float f = parcelTransactAndReadException.readFloat();
                parcelTransactAndReadException.recycle();
                return f;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public int hashCodeRemote() {
                Parcel parcelTransactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public boolean isVisible() {
                Parcel parcelTransactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void remove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setFadeIn(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setTransparency(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setVisible(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.ITileOverlayDelegate
            public void setZIndex(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        }

        public static ITileOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            return iInterfaceQueryLocalInterface instanceof ITileOverlayDelegate ? (ITileOverlayDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    remove();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    clearTileCache();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 4:
                    float f = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setZIndex(f);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 6:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setVisible(zG);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 8:
                    ITileOverlayDelegate iTileOverlayDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean zEqualsRemote = equalsRemote(iTileOverlayDelegateAsInterface);
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 9:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 10:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setFadeIn(zG2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    boolean fadeIn = getFadeIn();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(fadeIn ? 1 : 0);
                    return true;
                case 12:
                    float f2 = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    setTransparency(f2);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    float transparency = getTransparency();
                    parcel2.writeNoException();
                    parcel2.writeFloat(transparency);
                    return true;
                default:
                    return false;
            }
        }
    }

    void clearTileCache();

    boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate);

    boolean getFadeIn();

    String getId();

    float getTransparency();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setFadeIn(boolean z);

    void setTransparency(float f);

    void setVisible(boolean z);

    void setZIndex(float f);
}
