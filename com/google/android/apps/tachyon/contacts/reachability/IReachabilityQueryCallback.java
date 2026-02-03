package com.google.android.apps.tachyon.contacts.reachability;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IReachabilityQueryCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IReachabilityQueryCallback {
        static final int TRANSACTION_onFinished = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IReachabilityQueryCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback");
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback
            public void onFinished(Map map) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeMap(map);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback");
        }

        public static IReachabilityQueryCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryCallback");
            return iInterfaceQueryLocalInterface instanceof IReachabilityQueryCallback ? (IReachabilityQueryCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            HashMap mapC = sgh.c(parcel);
            enforceNoDataAvail(parcel);
            onFinished(mapC);
            return true;
        }
    }

    void onFinished(Map map);
}
