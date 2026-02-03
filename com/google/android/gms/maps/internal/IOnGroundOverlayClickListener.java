package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IGroundOverlayDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnGroundOverlayClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnGroundOverlayClickListener {
        static final int TRANSACTION_onGroundOverlayClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnGroundOverlayClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnGroundOverlayClickListener
            public void onGroundOverlayClick(IGroundOverlayDelegate iGroundOverlayDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iGroundOverlayDelegate);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
        }

        public static IOnGroundOverlayClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnGroundOverlayClickListener ? (IOnGroundOverlayClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IGroundOverlayDelegate iGroundOverlayDelegateAsInterface = IGroundOverlayDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onGroundOverlayClick(iGroundOverlayDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onGroundOverlayClick(IGroundOverlayDelegate iGroundOverlayDelegate);
}
