package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.PinConfig;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBitmapDescriptorFactoryDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBitmapDescriptorFactoryDelegate {
        static final int TRANSACTION_defaultMarker = 4;
        static final int TRANSACTION_defaultMarkerWithHue = 5;
        static final int TRANSACTION_fromAsset = 2;
        static final int TRANSACTION_fromBitmap = 6;
        static final int TRANSACTION_fromFile = 3;
        static final int TRANSACTION_fromPath = 7;
        static final int TRANSACTION_fromPinConfig = 8;
        static final int TRANSACTION_fromResource = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBitmapDescriptorFactoryDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper defaultMarker() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper defaultMarkerWithHue(float f) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeFloat(f);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromAsset(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromBitmap(Bitmap bitmap) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bitmap);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromFile(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromPath(String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromPinConfig(PinConfig pinConfig) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, pinConfig);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public IObjectWrapper fromResource(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        }

        public static IBitmapDescriptorFactoryDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return iInterfaceQueryLocalInterface instanceof IBitmapDescriptorFactoryDelegate ? (IBitmapDescriptorFactoryDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int i3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperFromResource = fromResource(i3);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperFromResource);
                    return true;
                case 2:
                    String string = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperFromAsset = fromAsset(string);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperFromAsset);
                    return true;
                case 3:
                    String string2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperFromFile = fromFile(string2);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperFromFile);
                    return true;
                case 4:
                    IObjectWrapper iObjectWrapperDefaultMarker = defaultMarker();
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperDefaultMarker);
                    return true;
                case 5:
                    float f = parcel.readFloat();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperDefaultMarkerWithHue = defaultMarkerWithHue(f);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperDefaultMarkerWithHue);
                    return true;
                case 6:
                    Bitmap bitmap = (Bitmap) sgh.a(parcel, Bitmap.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperFromBitmap = fromBitmap(bitmap);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperFromBitmap);
                    return true;
                case 7:
                    String string3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperFromPath = fromPath(string3);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperFromPath);
                    return true;
                case 8:
                    PinConfig pinConfig = (PinConfig) sgh.a(parcel, PinConfig.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper iObjectWrapperFromPinConfig = fromPinConfig(pinConfig);
                    parcel2.writeNoException();
                    sgh.f(parcel2, iObjectWrapperFromPinConfig);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper defaultMarker();

    IObjectWrapper defaultMarkerWithHue(float f);

    IObjectWrapper fromAsset(String str);

    IObjectWrapper fromBitmap(Bitmap bitmap);

    IObjectWrapper fromFile(String str);

    IObjectWrapper fromPath(String str);

    IObjectWrapper fromPinConfig(PinConfig pinConfig);

    IObjectWrapper fromResource(int i);
}
