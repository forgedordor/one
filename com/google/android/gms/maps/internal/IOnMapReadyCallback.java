package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMapReadyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMapReadyCallback {
        static final int TRANSACTION_onMapReady = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMapReadyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
            }

            @Override // com.google.android.gms.maps.internal.IOnMapReadyCallback
            public void onMapReady(IGoogleMapDelegate iGoogleMapDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGoogleMapDelegate);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        }

        public static IOnMapReadyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            return iInterfaceQueryLocalInterface instanceof IOnMapReadyCallback ? (IOnMapReadyCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IGoogleMapDelegate iGoogleMapDelegateAsInterface = IGoogleMapDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onMapReady(iGoogleMapDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onMapReady(IGoogleMapDelegate iGoogleMapDelegate);
}
