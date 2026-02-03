package com.google.android.gms.auth.api.fido.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.fido.RegisteredCredentialData;
import com.google.android.gms.common.api.Status;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IListRegisteredCredentialsCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IListRegisteredCredentialsCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IListRegisteredCredentialsCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback
            public void onResult(Status status, List<RegisteredCredentialData> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback");
        }

        public static IListRegisteredCredentialsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback");
            return iInterfaceQueryLocalInterface instanceof IListRegisteredCredentialsCallback ? (IListRegisteredCredentialsCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(RegisteredCredentialData.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, arrayListCreateTypedArrayList);
            return true;
        }
    }

    void onResult(Status status, List<RegisteredCredentialData> list);
}
