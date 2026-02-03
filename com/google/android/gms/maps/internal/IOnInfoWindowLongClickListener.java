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
public interface IOnInfoWindowLongClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnInfoWindowLongClickListener {
        static final int TRANSACTION_onInfoWindowLongClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnInfoWindowLongClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener
            public void onInfoWindowLongClick(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
        }

        public static IOnInfoWindowLongClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
            return iInterfaceQueryLocalInterface instanceof IOnInfoWindowLongClickListener ? (IOnInfoWindowLongClickListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onInfoWindowLongClick(iMarkerDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onInfoWindowLongClick(IMarkerDelegate iMarkerDelegate);
}
