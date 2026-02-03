package com.google.android.gms.auth.account.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBooleanResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBooleanResultCallback {
        static final int TRANSACTION_onResult = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBooleanResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.internal.IBooleanResultCallback");
            }

            @Override // com.google.android.gms.auth.account.internal.IBooleanResultCallback
            public void onResult(int i, boolean z) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                int i2 = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
        }

        public static IBooleanResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
            return iInterfaceQueryLocalInterface instanceof IBooleanResultCallback ? (IBooleanResultCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            boolean zG = sgh.g(parcel);
            enforceNoDataAvail(parcel);
            onResult(i3, zG);
            return true;
        }
    }

    void onResult(int i, boolean z);
}
