package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnStreetViewPanoramaClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaClickListener {
        static final int TRANSACTION_onStreetViewPanoramaClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener
            public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, streetViewPanoramaOrientation);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
        }

        public static IOnStreetViewPanoramaClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnStreetViewPanoramaClickListener ? (IOnStreetViewPanoramaClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) sgh.a(parcel, StreetViewPanoramaOrientation.CREATOR);
            enforceNoDataAvail(parcel);
            onStreetViewPanoramaClick(streetViewPanoramaOrientation);
            parcel2.writeNoException();
            return true;
        }
    }

    void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
}
