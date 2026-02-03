package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.LatLng;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFeatureClickEventDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFeatureClickEventDelegate {
        static final int TRANSACTION_getFeatures = 2;
        static final int TRANSACTION_getLatLng = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFeatureClickEventDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate
            public List<IBinder> getFeatures() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                ArrayList<IBinder> arrayListCreateBinderArrayList = parcelTransactAndReadException.createBinderArrayList();
                parcelTransactAndReadException.recycle();
                return arrayListCreateBinderArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate
            public LatLng getLatLng() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) sgh.a(parcelTransactAndReadException, LatLng.CREATOR);
                parcelTransactAndReadException.recycle();
                return latLng;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
        }

        public static IFeatureClickEventDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            return iInterfaceQueryLocalInterface instanceof IFeatureClickEventDelegate ? (IFeatureClickEventDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LatLng latLng = getLatLng();
                parcel2.writeNoException();
                sgh.e(parcel2, latLng);
            } else {
                if (i != 2) {
                    return false;
                }
                List<IBinder> features = getFeatures();
                parcel2.writeNoException();
                parcel2.writeBinderList(features);
            }
            return true;
        }
    }

    List<IBinder> getFeatures();

    LatLng getLatLng();
}
