package com.google.android.gms.auth.api.identity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICreateCredentialCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICreateCredentialCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICreateCredentialCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICreateCredentialCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICreateCredentialCallback
            public void onResult(List<Bundle> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ICreateCredentialCallback");
        }

        public static ICreateCredentialCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICreateCredentialCallback");
            return iInterfaceQueryLocalInterface instanceof ICreateCredentialCallback ? (ICreateCredentialCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(arrayListCreateTypedArrayList);
            return true;
        }
    }

    void onResult(List<Bundle> list);
}
