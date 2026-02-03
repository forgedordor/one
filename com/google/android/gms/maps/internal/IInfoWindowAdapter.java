package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInfoWindowAdapter extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInfoWindowAdapter {
        static final int TRANSACTION_getInfoContents = 2;
        static final int TRANSACTION_getInfoWindow = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInfoWindowAdapter {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
            }

            @Override // com.google.android.gms.maps.internal.IInfoWindowAdapter
            public IObjectWrapper getInfoContents(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.maps.internal.IInfoWindowAdapter
            public IObjectWrapper getInfoWindow(IMarkerDelegate iMarkerDelegate) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelTransactAndReadException.readStrongBinder());
                parcelTransactAndReadException.recycle();
                return iObjectWrapperAsInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }

        public static IInfoWindowAdapter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return iInterfaceQueryLocalInterface instanceof IInfoWindowAdapter ? (IInfoWindowAdapter) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper infoWindow = getInfoWindow(iMarkerDelegateAsInterface);
                parcel2.writeNoException();
                sgh.f(parcel2, infoWindow);
            } else {
                if (i != 2) {
                    return false;
                }
                IMarkerDelegate iMarkerDelegateAsInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper infoContents = getInfoContents(iMarkerDelegateAsInterface2);
                parcel2.writeNoException();
                sgh.f(parcel2, infoContents);
            }
            return true;
        }
    }

    IObjectWrapper getInfoContents(IMarkerDelegate iMarkerDelegate);

    IObjectWrapper getInfoWindow(IMarkerDelegate iMarkerDelegate);
}
