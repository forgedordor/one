package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.internal.IBootCountCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBootCountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBootCountService {
        static final int TRANSACTION_getBootCount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBootCountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IBootCountService");
            }

            @Override // com.google.android.gms.clearcut.internal.IBootCountService
            public void getBootCount(IBootCountCallbacks iBootCountCallbacks) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iBootCountCallbacks);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IBootCountService");
        }

        public static IBootCountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountService");
            return iInterfaceQueryLocalInterface instanceof IBootCountService ? (IBootCountService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IBootCountCallbacks iBootCountCallbacksAsInterface = IBootCountCallbacks.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getBootCount(iBootCountCallbacksAsInterface);
            return true;
        }
    }

    void getBootCount(IBootCountCallbacks iBootCountCallbacks);
}
