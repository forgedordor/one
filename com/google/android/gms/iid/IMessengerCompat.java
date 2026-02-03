package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMessengerCompat extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMessengerCompat {
        static final int TRANSACTION_send = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMessengerCompat {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
            }

            @Override // com.google.android.gms.iid.IMessengerCompat
            public void send(Message message) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, message);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.iid.IMessengerCompat");
        }

        public static IMessengerCompat asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            return iInterfaceQueryLocalInterface instanceof IMessengerCompat ? (IMessengerCompat) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Message message = (Message) sgh.a(parcel, Message.CREATOR);
            enforceNoDataAvail(parcel);
            send(message);
            return true;
        }
    }

    void send(Message message);
}
