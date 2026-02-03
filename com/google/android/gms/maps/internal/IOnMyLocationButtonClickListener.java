package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMyLocationButtonClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMyLocationButtonClickListener {
        static final int TRANSACTION_onMyLocationButtonClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMyLocationButtonClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener
            public boolean onMyLocationButtonClick() {
                Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        }

        public static IOnMyLocationButtonClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnMyLocationButtonClickListener ? (IOnMyLocationButtonClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            boolean zOnMyLocationButtonClick = onMyLocationButtonClick();
            parcel2.writeNoException();
            int i3 = sgh.a;
            parcel2.writeInt(zOnMyLocationButtonClick ? 1 : 0);
            return true;
        }
    }

    boolean onMyLocationButtonClick();
}
