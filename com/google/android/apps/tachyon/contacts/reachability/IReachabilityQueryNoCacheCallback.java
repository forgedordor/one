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
public interface IReachabilityQueryNoCacheCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IReachabilityQueryNoCacheCallback {
        static final int TRANSACTION_onFinished = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IReachabilityQueryNoCacheCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback");
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback
            public void onFinished(Map map) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeMap(map);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback");
        }

        public static IReachabilityQueryNoCacheCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback");
            return iInterfaceQueryLocalInterface instanceof IReachabilityQueryNoCacheCallback ? (IReachabilityQueryNoCacheCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
