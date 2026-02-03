package com.google.android.gms.identity.intents.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAddressCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAddressCallbacks {
        static final int TRANSACTION_onRequestUserAddressIntentReceived = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAddressCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressCallbacks");
            }

            @Override // com.google.android.gms.identity.intents.internal.IAddressCallbacks
            public void onRequestUserAddressIntentReceived(int i, Bundle bundle) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
        }

        public static IAddressCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
            return iInterfaceQueryLocalInterface instanceof IAddressCallbacks ? (IAddressCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            onRequestUserAddressIntentReceived(i3, bundle);
            parcel2.writeNoException();
            return true;
        }
    }

    void onRequestUserAddressIntentReceived(int i, Bundle bundle);
}
