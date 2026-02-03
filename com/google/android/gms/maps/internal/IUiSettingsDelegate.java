package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IUiSettingsDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IUiSettingsDelegate {
        static final int TRANSACTION_isCompassEnabled = 10;
        static final int TRANSACTION_isIndoorLevelPickerEnabled = 17;
        static final int TRANSACTION_isMapToolbarEnabled = 19;
        static final int TRANSACTION_isMyLocationButtonEnabled = 11;
        static final int TRANSACTION_isRotateGesturesEnabled = 15;
        static final int TRANSACTION_isScrollGesturesEnabled = 12;
        static final int TRANSACTION_isScrollGesturesEnabledDuringRotateOrZoom = 21;
        static final int TRANSACTION_isTiltGesturesEnabled = 14;
        static final int TRANSACTION_isZoomControlsEnabled = 9;
        static final int TRANSACTION_isZoomGesturesEnabled = 13;
        static final int TRANSACTION_setAllGesturesEnabled = 8;
        static final int TRANSACTION_setCompassEnabled = 2;
        static final int TRANSACTION_setIndoorLevelPickerEnabled = 16;
        static final int TRANSACTION_setMapToolbarEnabled = 18;
        static final int TRANSACTION_setMyLocationButtonEnabled = 3;
        static final int TRANSACTION_setRotateGesturesEnabled = 7;
        static final int TRANSACTION_setScrollGesturesEnabled = 4;
        static final int TRANSACTION_setScrollGesturesEnabledDuringRotateOrZoom = 20;
        static final int TRANSACTION_setTiltGesturesEnabled = 6;
        static final int TRANSACTION_setZoomControlsEnabled = 1;
        static final int TRANSACTION_setZoomGesturesEnabled = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IUiSettingsDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isCompassEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isIndoorLevelPickerEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isMapToolbarEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isMyLocationButtonEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isRotateGesturesEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isScrollGesturesEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isScrollGesturesEnabledDuringRotateOrZoom() {
                Parcel parcelTransactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isTiltGesturesEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isZoomControlsEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isZoomGesturesEnabled() {
                Parcel parcelTransactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setAllGesturesEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setCompassEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setIndoorLevelPickerEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setMapToolbarEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setMyLocationButtonEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setRotateGesturesEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setScrollGesturesEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(20, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setTiltGesturesEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setZoomControlsEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setZoomGesturesEnabled(boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        }

        public static IUiSettingsDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            return iInterfaceQueryLocalInterface instanceof IUiSettingsDelegate ? (IUiSettingsDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean zG = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setZoomControlsEnabled(zG);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean zG2 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setCompassEnabled(zG2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    boolean zG3 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setMyLocationButtonEnabled(zG3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean zG4 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setScrollGesturesEnabled(zG4);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean zG5 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setZoomGesturesEnabled(zG5);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean zG6 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setTiltGesturesEnabled(zG6);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean zG7 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setRotateGesturesEnabled(zG7);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    boolean zG8 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAllGesturesEnabled(zG8);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    boolean zIsZoomControlsEnabled = isZoomControlsEnabled();
                    parcel2.writeNoException();
                    int i3 = sgh.a;
                    parcel2.writeInt(zIsZoomControlsEnabled ? 1 : 0);
                    return true;
                case 10:
                    boolean zIsCompassEnabled = isCompassEnabled();
                    parcel2.writeNoException();
                    int i4 = sgh.a;
                    parcel2.writeInt(zIsCompassEnabled ? 1 : 0);
                    return true;
                case 11:
                    boolean zIsMyLocationButtonEnabled = isMyLocationButtonEnabled();
                    parcel2.writeNoException();
                    int i5 = sgh.a;
                    parcel2.writeInt(zIsMyLocationButtonEnabled ? 1 : 0);
                    return true;
                case 12:
                    boolean zIsScrollGesturesEnabled = isScrollGesturesEnabled();
                    parcel2.writeNoException();
                    int i6 = sgh.a;
                    parcel2.writeInt(zIsScrollGesturesEnabled ? 1 : 0);
                    return true;
                case 13:
                    boolean zIsZoomGesturesEnabled = isZoomGesturesEnabled();
                    parcel2.writeNoException();
                    int i7 = sgh.a;
                    parcel2.writeInt(zIsZoomGesturesEnabled ? 1 : 0);
                    return true;
                case 14:
                    boolean zIsTiltGesturesEnabled = isTiltGesturesEnabled();
                    parcel2.writeNoException();
                    int i8 = sgh.a;
                    parcel2.writeInt(zIsTiltGesturesEnabled ? 1 : 0);
                    return true;
                case 15:
                    boolean zIsRotateGesturesEnabled = isRotateGesturesEnabled();
                    parcel2.writeNoException();
                    int i9 = sgh.a;
                    parcel2.writeInt(zIsRotateGesturesEnabled ? 1 : 0);
                    return true;
                case 16:
                    boolean zG9 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setIndoorLevelPickerEnabled(zG9);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    boolean zIsIndoorLevelPickerEnabled = isIndoorLevelPickerEnabled();
                    parcel2.writeNoException();
                    int i10 = sgh.a;
                    parcel2.writeInt(zIsIndoorLevelPickerEnabled ? 1 : 0);
                    return true;
                case 18:
                    boolean zG10 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setMapToolbarEnabled(zG10);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    boolean zIsMapToolbarEnabled = isMapToolbarEnabled();
                    parcel2.writeNoException();
                    int i11 = sgh.a;
                    parcel2.writeInt(zIsMapToolbarEnabled ? 1 : 0);
                    return true;
                case 20:
                    boolean zG11 = sgh.g(parcel);
                    enforceNoDataAvail(parcel);
                    setScrollGesturesEnabledDuringRotateOrZoom(zG11);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zIsScrollGesturesEnabledDuringRotateOrZoom = isScrollGesturesEnabledDuringRotateOrZoom();
                    parcel2.writeNoException();
                    int i12 = sgh.a;
                    parcel2.writeInt(zIsScrollGesturesEnabledDuringRotateOrZoom ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean isCompassEnabled();

    boolean isIndoorLevelPickerEnabled();

    boolean isMapToolbarEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isScrollGesturesEnabledDuringRotateOrZoom();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean z);

    void setCompassEnabled(boolean z);

    void setIndoorLevelPickerEnabled(boolean z);

    void setMapToolbarEnabled(boolean z);

    void setMyLocationButtonEnabled(boolean z);

    void setRotateGesturesEnabled(boolean z);

    void setScrollGesturesEnabled(boolean z);

    void setScrollGesturesEnabledDuringRotateOrZoom(boolean z);

    void setTiltGesturesEnabled(boolean z);

    void setZoomControlsEnabled(boolean z);

    void setZoomGesturesEnabled(boolean z);
}
