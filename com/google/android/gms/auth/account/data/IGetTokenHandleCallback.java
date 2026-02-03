package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetTokenHandleCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetTokenHandleCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetTokenHandleCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetTokenHandleCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetTokenHandleCallback
            public void onResponse(Status status, String str) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetTokenHandleCallback");
        }

        public static IGetTokenHandleCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetTokenHandleCallback");
            return iInterfaceQueryLocalInterface instanceof IGetTokenHandleCallback ? (IGetTokenHandleCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            onResponse(status, string);
            return true;
        }
    }

    void onResponse(Status status, String str);
}
