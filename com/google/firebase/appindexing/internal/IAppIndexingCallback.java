package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.esao;
import defpackage.esbm;
import defpackage.sgh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IAppIndexingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIndexingCallback {
        static final int TRANSACTION_onGet = 4;
        static final int TRANSACTION_onGetIndexableResponse = 2;
        static final int TRANSACTION_onSearch = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIndexingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingCallback");
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onGet(Status status, List<Thing> list) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeList(list);
                transactOneway(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onGetIndexableResponse(esbm esbmVar) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, esbmVar);
                transactOneway(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onSearch(Status status, esao[] esaoVarArr) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, status);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(esaoVarArr, 0);
                transactOneway(3, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.firebase.appindexing.internal.IAppIndexingCallback");
        }

        public static IAppIndexingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingCallback");
            return iInterfaceQueryLocalInterface instanceof IAppIndexingCallback ? (IAppIndexingCallback) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                esbm esbmVar = (esbm) sgh.a(parcel, esbm.CREATOR);
                enforceNoDataAvail(parcel);
                onGetIndexableResponse(esbmVar);
                return true;
            }
            if (i == 3) {
                Status status = (Status) sgh.a(parcel, Status.CREATOR);
                esao[] esaoVarArr = (esao[]) parcel.createTypedArray(esao.CREATOR);
                enforceNoDataAvail(parcel);
                onSearch(status, esaoVarArr);
                return true;
            }
            if (i != 4) {
                return false;
            }
            Status status2 = (Status) sgh.a(parcel, Status.CREATOR);
            ArrayList arrayListB = sgh.b(parcel);
            enforceNoDataAvail(parcel);
            onGet(status2, arrayListB);
            return true;
        }
    }

    void onGet(Status status, List<Thing> list);

    void onGetIndexableResponse(esbm esbmVar);

    void onSearch(Status status, esao[] esaoVarArr);
}
