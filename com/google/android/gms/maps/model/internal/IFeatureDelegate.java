package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFeatureDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFeatureDelegate {
        static final int TRANSACTION_getDatasetAttributes = 5;
        static final int TRANSACTION_getDatasetId = 4;
        static final int TRANSACTION_getFeatureType = 2;
        static final int TRANSACTION_getPlaceId = 3;
        static final int TRANSACTION_getSubfeatureType = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFeatureDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public Map getDatasetAttributes() {
                Parcel parcelTransactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                HashMap mapC = sgh.c(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return mapC;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public String getDatasetId() {
                Parcel parcelTransactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public String getFeatureType() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public String getPlaceId() {
                Parcel parcelTransactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                String string = parcelTransactAndReadException.readString();
                parcelTransactAndReadException.recycle();
                return string;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public int getSubfeatureType() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                int i = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IFeatureDelegate");
        }

        public static IFeatureDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureDelegate");
            return iInterfaceQueryLocalInterface instanceof IFeatureDelegate ? (IFeatureDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int subfeatureType = getSubfeatureType();
                parcel2.writeNoException();
                parcel2.writeInt(subfeatureType);
            } else if (i == 2) {
                String featureType = getFeatureType();
                parcel2.writeNoException();
                parcel2.writeString(featureType);
            } else if (i == 3) {
                String placeId = getPlaceId();
                parcel2.writeNoException();
                parcel2.writeString(placeId);
            } else if (i == 4) {
                String datasetId = getDatasetId();
                parcel2.writeNoException();
                parcel2.writeString(datasetId);
            } else {
                if (i != 5) {
                    return false;
                }
                Map datasetAttributes = getDatasetAttributes();
                parcel2.writeNoException();
                parcel2.writeMap(datasetAttributes);
            }
            return true;
        }
    }

    Map getDatasetAttributes();

    String getDatasetId();

    String getFeatureType();

    String getPlaceId();

    int getSubfeatureType();
}
