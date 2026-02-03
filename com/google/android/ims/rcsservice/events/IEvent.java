package com.google.android.ims.rcsservice.events;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.events.IEventObserver;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IEvent extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IEvent {
        static final int TRANSACTION_ping = 3;
        static final int TRANSACTION_subscribe = 1;
        static final int TRANSACTION_unsubscribe = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IEvent {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.events.IEvent");
            }

            @Override // com.google.android.ims.rcsservice.events.IEvent
            public void ping() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.ims.rcsservice.events.IEvent
            public int subscribe(int i, IEventObserver iEventObserver) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.f(parcelObtainAndWriteInterfaceToken, iEventObserver);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                int i2 = parcelTransactAndReadException.readInt();
                parcelTransactAndReadException.recycle();
                return i2;
            }

            @Override // com.google.android.ims.rcsservice.events.IEvent
            public void unsubscribe(int i, int i2) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.events.IEvent");
        }

        public static IEvent asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.events.IEvent");
            return iInterfaceQueryLocalInterface instanceof IEvent ? (IEvent) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int i3 = parcel.readInt();
                IEventObserver iEventObserverAsInterface = IEventObserver.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                int iSubscribe = subscribe(i3, iEventObserverAsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(iSubscribe);
            } else if (i == 2) {
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                enforceNoDataAvail(parcel);
                unsubscribe(i4, i5);
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return false;
                }
                ping();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void ping();

    int subscribe(int i, IEventObserver iEventObserver);

    void unsubscribe(int i, int i2);
}
