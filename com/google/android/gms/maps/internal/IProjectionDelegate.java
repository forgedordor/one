package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IProjectionDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProjectionDelegate {
        static final int TRANSACTION_fromScreenLocation = 1;
        static final int TRANSACTION_getVisibleRegion = 3;
        static final int TRANSACTION_toScreenLocation = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProjectionDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                LatLng latLng = (LatLng) sgh.a(parcelTransactAndReadException, LatLng.CREATOR);
                parcelTransactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public VisibleRegion getVisibleRegion() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                VisibleRegion visibleRegion = (VisibleRegion) sgh.a(parcelTransactAndReadException, VisibleRegion.CREATOR);
                parcelTransactAndReadException.recycle();
                return visibleRegion;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public IObjectWrapper toScreenLocation(LatLng latLng) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IProjectionDelegate");
        }

        public static IProjectionDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            return iInterfaceQueryLocalInterface instanceof IProjectionDelegate ? (IProjectionDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                LatLng latLngFromScreenLocation = fromScreenLocation(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                sgh.e(parcel2, latLngFromScreenLocation);
            } else if (i == 2) {
                LatLng latLng = (LatLng) sgh.a(parcel, LatLng.CREATOR);
                enforceNoDataAvail(parcel);
                IObjectWrapper screenLocation = toScreenLocation(latLng);
                parcel2.writeNoException();
                sgh.f(parcel2, screenLocation);
            } else {
                if (i != 3) {
                    return false;
                }
                VisibleRegion visibleRegion = getVisibleRegion();
                parcel2.writeNoException();
                sgh.e(parcel2, visibleRegion);
            }
            return true;
        }
    }

    LatLng fromScreenLocation(IObjectWrapper iObjectWrapper);

    VisibleRegion getVisibleRegion();

    IObjectWrapper toScreenLocation(LatLng latLng);
}
