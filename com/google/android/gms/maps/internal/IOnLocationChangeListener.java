package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnLocationChangeListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnLocationChangeListener {
        static final int TRANSACTION_onLocationChanged = 1;
        static final int TRANSACTION_onLocationChanged2 = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnLocationChangeListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnLocationChangeListener
            public void onLocationChanged(IObjectWrapper iObjectWrapper) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IOnLocationChangeListener
            public void onLocationChanged2(Location location) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, location);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnLocationChangeListener");
        }

        public static IOnLocationChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            return iInterfaceQueryLocalInterface instanceof IOnLocationChangeListener ? (IOnLocationChangeListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onLocationChanged(iObjectWrapperAsInterface);
            } else {
                if (i != 2) {
                    return false;
                }
                Location location = (Location) sgh.a(parcel, Location.CREATOR);
                enforceNoDataAvail(parcel);
                onLocationChanged2(location);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onLocationChanged(IObjectWrapper iObjectWrapper);

    void onLocationChanged2(Location location);
}
