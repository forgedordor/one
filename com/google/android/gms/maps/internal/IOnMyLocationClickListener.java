package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMyLocationClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMyLocationClickListener {
        static final int TRANSACTION_onMyLocationClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMyLocationClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMyLocationClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMyLocationClickListener
            public void onMyLocationClick(Location location) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, location);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
        }

        public static IOnMyLocationClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnMyLocationClickListener ? (IOnMyLocationClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Location location = (Location) sgh.a(parcel, Location.CREATOR);
            enforceNoDataAvail(parcel);
            onMyLocationClick(location);
            parcel2.writeNoException();
            return true;
        }
    }

    void onMyLocationClick(Location location);
}
