package com.google.android.gms.auth.api.fido;

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
public interface IListPasskeysForRpCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IListPasskeysForRpCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IListPasskeysForRpCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
            }

            @Override // com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback
            public void onError(Status status) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback
            public void onSuccess(List list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
        }

        public static IListPasskeysForRpCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
            return iInterfaceQueryLocalInterface instanceof IListPasskeysForRpCallback ? (IListPasskeysForRpCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ArrayList arrayListB = sgh.b(parcel);
                enforceNoDataAvail(parcel);
                onSuccess(arrayListB);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onError(status);
            }
            return true;
        }
    }

    void onError(Status status);

    void onSuccess(List list);
}
