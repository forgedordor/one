package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.LatLng;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMapClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMapClickListener {
        static final int TRANSACTION_onMapClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMapClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMapClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMapClickListener
            public void onMapClick(LatLng latLng) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMapClickListener");
        }

        public static IOnMapClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnMapClickListener ? (IOnMapClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            LatLng latLng = (LatLng) sgh.a(parcel, LatLng.CREATOR);
            enforceNoDataAvail(parcel);
            onMapClick(latLng);
            parcel2.writeNoException();
            return true;
        }
    }

    void onMapClick(LatLng latLng);
}
