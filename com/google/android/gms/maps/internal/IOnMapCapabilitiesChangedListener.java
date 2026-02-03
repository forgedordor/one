package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMapCapabilitiesChangedListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMapCapabilitiesChangedListener {
        static final int TRANSACTION_onMapCapabilitiesChanged = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMapCapabilitiesChangedListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener
            public void onMapCapabilitiesChanged(IMapCapabilitiesDelegate iMapCapabilitiesDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMapCapabilitiesDelegate);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
        }

        public static IOnMapCapabilitiesChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
            return iInterfaceQueryLocalInterface instanceof IOnMapCapabilitiesChangedListener ? (IOnMapCapabilitiesChangedListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IMapCapabilitiesDelegate iMapCapabilitiesDelegateAsInterface = IMapCapabilitiesDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onMapCapabilitiesChanged(iMapCapabilitiesDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onMapCapabilitiesChanged(IMapCapabilitiesDelegate iMapCapabilitiesDelegate);
}
