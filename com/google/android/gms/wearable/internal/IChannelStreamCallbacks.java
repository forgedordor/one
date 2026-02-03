package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IChannelStreamCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IChannelStreamCallbacks {
        static final int TRANSACTION_onChannelUnexpectedlyClosed = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IChannelStreamCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            }

            @Override // com.google.android.gms.wearable.internal.IChannelStreamCallbacks
            public void onChannelUnexpectedlyClosed(int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
        }

        public static IChannelStreamCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            return iInterfaceQueryLocalInterface instanceof IChannelStreamCallbacks ? (IChannelStreamCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onChannelUnexpectedlyClosed(i3, i4);
            parcel2.writeNoException();
            return true;
        }
    }

    void onChannelUnexpectedlyClosed(int i, int i2);
}
