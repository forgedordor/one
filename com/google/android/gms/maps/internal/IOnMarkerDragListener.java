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
public interface IOnMarkerDragListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMarkerDragListener {
        static final int TRANSACTION_onMarkerDrag = 2;
        static final int TRANSACTION_onMarkerDragEnd = 3;
        static final int TRANSACTION_onMarkerDragStart = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMarkerDragListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDrag(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDragStart(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        public static IOnMarkerDragListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            return iInterfaceQueryLocalInterface instanceof IOnMarkerDragListener ? (IOnMarkerDragListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMarkerDragStart(iMarkerDelegateAsInterface);
            } else if (i == 2) {
                IMarkerDelegate iMarkerDelegateAsInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMarkerDrag(iMarkerDelegateAsInterface2);
            } else {
                if (i != 3) {
                    return false;
                }
                IMarkerDelegate iMarkerDelegateAsInterface3 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMarkerDragEnd(iMarkerDelegateAsInterface3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onMarkerDrag(IMarkerDelegate iMarkerDelegate);

    void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate);

    void onMarkerDragStart(IMarkerDelegate iMarkerDelegate);
}
