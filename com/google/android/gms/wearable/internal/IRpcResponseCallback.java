package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IRpcResponseCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRpcResponseCallback {
        static final int TRANSACTION_onResponse = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRpcResponseCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
            }

            @Override // com.google.android.gms.wearable.internal.IRpcResponseCallback
            public void onResponse(boolean z, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IRpcResponseCallback");
        }

        public static IRpcResponseCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            return iInterfaceQueryLocalInterface instanceof IRpcResponseCallback ? (IRpcResponseCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            boolean zG = sgh.g(parcel);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onResponse(zG, bArrCreateByteArray);
            return true;
        }
    }

    void onResponse(boolean z, byte[] bArr);
}
