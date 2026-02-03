package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnInfoWindowClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnInfoWindowClickListener {
        static final int TRANSACTION_onInfoWindowClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnInfoWindowClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnInfoWindowClickListener
            public void onInfoWindowClick(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        }

        public static IOnInfoWindowClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnInfoWindowClickListener ? (IOnInfoWindowClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onInfoWindowClick(iMarkerDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onInfoWindowClick(IMarkerDelegate iMarkerDelegate);
}
