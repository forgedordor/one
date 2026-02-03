package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetFeatureEnabledStateCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetFeatureEnabledStateCallback {
        static final int TRANSACTION_onFetchedFeatureEnabledState = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetFeatureEnabledStateCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback
            public void onFetchedFeatureEnabledState(Status status, int i) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
        }

        public static IGetFeatureEnabledStateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback");
            return iInterfaceQueryLocalInterface instanceof IGetFeatureEnabledStateCallback ? (IGetFeatureEnabledStateCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            int i3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            onFetchedFeatureEnabledState(status, i3);
            return true;
        }
    }

    void onFetchedFeatureEnabledState(Status status, int i);
}
