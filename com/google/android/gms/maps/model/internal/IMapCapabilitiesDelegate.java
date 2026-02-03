package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMapCapabilitiesDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMapCapabilitiesDelegate {
        static final int TRANSACTION_isAdvancedMarkersAvailable = 1;
        static final int TRANSACTION_isDataDrivenStylingAvailable = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMapCapabilitiesDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isAdvancedMarkersAvailable() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isDataDrivenStylingAvailable() {
                Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
        }

        public static IMapCapabilitiesDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
            return iInterfaceQueryLocalInterface instanceof IMapCapabilitiesDelegate ? (IMapCapabilitiesDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                boolean zIsAdvancedMarkersAvailable = isAdvancedMarkersAvailable();
                parcel2.writeNoException();
                int i3 = sgh.a;
                parcel2.writeInt(zIsAdvancedMarkersAvailable ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                boolean zIsDataDrivenStylingAvailable = isDataDrivenStylingAvailable();
                parcel2.writeNoException();
                int i4 = sgh.a;
                parcel2.writeInt(zIsDataDrivenStylingAvailable ? 1 : 0);
            }
            return true;
        }
    }

    boolean isAdvancedMarkersAvailable();

    boolean isDataDrivenStylingAvailable();
}
