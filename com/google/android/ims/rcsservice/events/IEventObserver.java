package com.google.android.ims.rcsservice.events;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IEventObserver extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IEventObserver {
        static final int TRANSACTION_notifyEvent = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IEventObserver {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.events.IEventObserver");
            }

            @Override // com.google.android.ims.rcsservice.events.IEventObserver
            public void notifyEvent(Event event) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, event);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.events.IEventObserver");
        }

        public static IEventObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.events.IEventObserver");
            return iInterfaceQueryLocalInterface instanceof IEventObserver ? (IEventObserver) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Event event = (Event) sgh.a(parcel, Event.CREATOR);
            enforceNoDataAvail(parcel);
            notifyEvent(event);
            return true;
        }
    }

    void notifyEvent(Event event);
}
