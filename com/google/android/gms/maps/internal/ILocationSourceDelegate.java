package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.internal.IOnLocationChangeListener;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILocationSourceDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILocationSourceDelegate {
        static final int TRANSACTION_activate = 1;
        static final int TRANSACTION_deactivate = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILocationSourceDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
            }

            @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
            public void activate(IOnLocationChangeListener iOnLocationChangeListener) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iOnLocationChangeListener);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
            public void deactivate() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        public static ILocationSourceDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            return iInterfaceQueryLocalInterface instanceof ILocationSourceDelegate ? (ILocationSourceDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IOnLocationChangeListener iOnLocationChangeListenerAsInterface = IOnLocationChangeListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                activate(iOnLocationChangeListenerAsInterface);
            } else {
                if (i != 2) {
                    return false;
                }
                deactivate();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void activate(IOnLocationChangeListener iOnLocationChangeListener);

    void deactivate();
}
