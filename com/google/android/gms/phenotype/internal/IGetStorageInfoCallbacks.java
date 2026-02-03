package com.google.android.gms.phenotype.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetStorageInfoCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetStorageInfoCallbacks {
        static final int TRANSACTION_onResult = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetStorageInfoCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
            }

            @Override // com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks
            public void onResult(Status status, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        }

        public static IGetStorageInfoCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
            return iInterfaceQueryLocalInterface instanceof IGetStorageInfoCallbacks ? (IGetStorageInfoCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onResult(status, bArrCreateByteArray);
            return true;
        }
    }

    void onResult(Status status, byte[] bArr);
}
