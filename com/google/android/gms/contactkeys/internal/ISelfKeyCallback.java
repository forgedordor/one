package com.google.android.gms.contactkeys.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeSelfKeyParcelable;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISelfKeyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISelfKeyCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISelfKeyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.contactkeys.internal.ISelfKeyCallback");
            }

            @Override // com.google.android.gms.contactkeys.internal.ISelfKeyCallback
            public void onResult(Status status, E2eeSelfKeyParcelable e2eeSelfKeyParcelable) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, e2eeSelfKeyParcelable);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.contactkeys.internal.ISelfKeyCallback");
        }

        public static ISelfKeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contactkeys.internal.ISelfKeyCallback");
            return iInterfaceQueryLocalInterface instanceof ISelfKeyCallback ? (ISelfKeyCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            E2eeSelfKeyParcelable e2eeSelfKeyParcelable = (E2eeSelfKeyParcelable) sgh.a(parcel, E2eeSelfKeyParcelable.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, e2eeSelfKeyParcelable);
            return true;
        }
    }

    void onResult(Status status, E2eeSelfKeyParcelable e2eeSelfKeyParcelable);
}
