package com.google.android.gms.fido.credentialstore.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILongValueCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILongValueCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILongValueCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks
            public void onResult(Status status, long j) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
        }

        public static ILongValueCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks");
            return iInterfaceQueryLocalInterface instanceof ILongValueCallbacks ? (ILongValueCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            long j = parcel.readLong();
            enforceNoDataAvail(parcel);
            onResult(status, j);
            return true;
        }
    }

    void onResult(Status status, long j);
}
