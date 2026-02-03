package com.google.android.gms.fido.credentialstore.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKeyDataListCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKeyDataListCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKeyDataListCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks
            public void onResult(Status status, List<KeyData> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
        }

        public static IKeyDataListCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
            return iInterfaceQueryLocalInterface instanceof IKeyDataListCallbacks ? (IKeyDataListCallbacks) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sgh.a(parcel, Status.CREATOR);
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(KeyData.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, arrayListCreateTypedArrayList);
            return true;
        }
    }

    void onResult(Status status, List<KeyData> list);
}
