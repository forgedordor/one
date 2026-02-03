package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnCameraMoveStartedListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnCameraMoveStartedListener {
        static final int TRANSACTION_onCameraMoveStarted = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnCameraMoveStartedListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnCameraMoveStartedListener
            public void onCameraMoveStarted(int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        }

        public static IOnCameraMoveStartedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
            return iInterfaceQueryLocalInterface instanceof IOnCameraMoveStartedListener ? (IOnCameraMoveStartedListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onCameraMoveStarted(i3);
            parcel2.writeNoException();
            return true;
        }
    }

    void onCameraMoveStarted(int i);
}
