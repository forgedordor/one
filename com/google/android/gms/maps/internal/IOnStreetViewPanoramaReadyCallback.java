package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnStreetViewPanoramaReadyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaReadyCallback {
        static final int TRANSACTION_onStreetViewPanoramaReady = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaReadyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback
            public void onStreetViewPanoramaReady(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStreetViewPanoramaDelegate);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        public static IOnStreetViewPanoramaReadyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            return iInterfaceQueryLocalInterface instanceof IOnStreetViewPanoramaReadyCallback ? (IOnStreetViewPanoramaReadyCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IStreetViewPanoramaDelegate iStreetViewPanoramaDelegateAsInterface = IStreetViewPanoramaDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onStreetViewPanoramaReady(iStreetViewPanoramaDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onStreetViewPanoramaReady(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate);
}
