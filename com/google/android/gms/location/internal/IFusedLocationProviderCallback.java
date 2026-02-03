package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFusedLocationProviderCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFusedLocationProviderCallback {
        static final int TRANSACTION_onFusedLocationProviderResult = 1;
        static final int TRANSACTION_onRequestRemoved = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFusedLocationProviderCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            }

            @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
            public void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, fusedLocationProviderResult);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IFusedLocationProviderCallback
            public void onRequestRemoved() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        }

        public static IFusedLocationProviderCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            return iInterfaceQueryLocalInterface instanceof IFusedLocationProviderCallback ? (IFusedLocationProviderCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                FusedLocationProviderResult fusedLocationProviderResult = (FusedLocationProviderResult) sgh.a(parcel, FusedLocationProviderResult.CREATOR);
                enforceNoDataAvail(parcel);
                onFusedLocationProviderResult(fusedLocationProviderResult);
            } else {
                if (i != 2) {
                    return false;
                }
                onRequestRemoved();
            }
            return true;
        }
    }

    void onFusedLocationProviderResult(FusedLocationProviderResult fusedLocationProviderResult);

    void onRequestRemoved();
}
