package com.google.android.gms.auth.api.fido.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IListWebauthnCredentialSpecificsCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IListWebauthnCredentialSpecificsCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IListWebauthnCredentialSpecificsCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback
            public void onResult(Status status, List<byte[]> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback");
        }

        public static IListWebauthnCredentialSpecificsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IListWebauthnCredentialSpecificsCallback");
            return iInterfaceQueryLocalInterface instanceof IListWebauthnCredentialSpecificsCallback ? (IListWebauthnCredentialSpecificsCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ArrayList arrayListB = sgh.b(parcel);
            enforceNoDataAvail(parcel);
            onResult(status, arrayListB);
            return true;
        }
    }

    void onResult(Status status, List<byte[]> list);
}
