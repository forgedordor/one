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
public interface IGetMyPublicKeyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetMyPublicKeyCallback {
        static final int TRANSACTION_onFetchedPublicKey = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetMyPublicKeyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback
            public void onFetchedPublicKey(Status status, byte[] bArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
        }

        public static IGetMyPublicKeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
            return iInterfaceQueryLocalInterface instanceof IGetMyPublicKeyCallback ? (IGetMyPublicKeyCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onFetchedPublicKey(status, bArrCreateByteArray);
            return true;
        }
    }

    void onFetchedPublicKey(Status status, byte[] bArr);
}
