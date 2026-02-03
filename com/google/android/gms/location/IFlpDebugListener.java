package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFlpDebugListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFlpDebugListener {
        static final int TRANSACTION_onEvent = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFlpDebugListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.IFlpDebugListener");
            }

            @Override // com.google.android.gms.location.IFlpDebugListener
            public void onEvent(byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.IFlpDebugListener");
        }

        public static IFlpDebugListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IFlpDebugListener");
            return iInterfaceQueryLocalInterface instanceof IFlpDebugListener ? (IFlpDebugListener) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onEvent(bArrCreateByteArray);
            return true;
        }
    }

    void onEvent(byte[] bArr);
}
