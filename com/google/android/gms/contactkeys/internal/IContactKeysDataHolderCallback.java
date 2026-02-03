package com.google.android.gms.contactkeys.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactKeysDataHolderCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactKeysDataHolderCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactKeysDataHolderCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback");
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback
            public void onResult(Status status, DataHolder dataHolder) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                sgh.d(parcelObtainAndWriteInterfaceToken, dataHolder);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback");
        }

        public static IContactKeysDataHolderCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contactkeys.internal.IContactKeysDataHolderCallback");
            return iInterfaceQueryLocalInterface instanceof IContactKeysDataHolderCallback ? (IContactKeysDataHolderCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            DataHolder dataHolder = (DataHolder) sgh.a(parcel, DataHolder.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, dataHolder);
            return true;
        }
    }

    void onResult(Status status, DataHolder dataHolder);
}
