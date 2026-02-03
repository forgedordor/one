package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.firebase.appindexing.internal.IAppIndexingCallback;
import defpackage.esai;
import defpackage.esam;
import defpackage.esaz;
import defpackage.esbk;
import defpackage.esbr;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IAppIndexingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIndexingService {
        static final int TRANSACTION_get = 10;
        static final int TRANSACTION_getIndexable = 5;
        static final int TRANSACTION_mutate = 8;
        static final int TRANSACTION_patch = 7;
        static final int TRANSACTION_remove = 2;
        static final int TRANSACTION_removeAll = 3;
        static final int TRANSACTION_removeTypes = 9;
        static final int TRANSACTION_search = 6;
        static final int TRANSACTION_update = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIndexingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void get(IAppIndexingCallback iAppIndexingCallback, String[] strArr, esai esaiVar, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAppIndexingCallback);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, esaiVar);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void getIndexable(IAppIndexingCallback iAppIndexingCallback, esbk esbkVar, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAppIndexingCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, esbkVar);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public esaz mutate(IStatusCallback iStatusCallback, esbr esbrVar, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, esbrVar);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                esaz esazVar = (esaz) sgh.a(parcelTransactAndReadException, esaz.CREATOR);
                parcelTransactAndReadException.recycle();
                return esazVar;
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void patch(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(thingArr, 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void remove(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void removeAll(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void removeTypes(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void search(IAppIndexingCallback iAppIndexingCallback, esam[] esamVarArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iAppIndexingCallback);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(esamVarArr, 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void update(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.f(parcelObtainAndWriteInterfaceToken, iStatusCallback);
                parcelObtainAndWriteInterfaceToken.writeTypedArray(thingArr, 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.firebase.appindexing.internal.IAppIndexingService");
        }

        public static IAppIndexingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
            return iInterfaceQueryLocalInterface instanceof IAppIndexingService ? (IAppIndexingService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Thing[] thingArr = (Thing[]) parcel.createTypedArray(Thing.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    update(iStatusCallbackAsInterface, thingArr, apiMetadata);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IStatusCallback iStatusCallbackAsInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    remove(iStatusCallbackAsInterface2, strArrCreateStringArray, apiMetadata2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    IStatusCallback iStatusCallbackAsInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeAll(iStatusCallbackAsInterface3, apiMetadata3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                default:
                    return false;
                case 5:
                    IAppIndexingCallback iAppIndexingCallbackAsInterface = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    esbk esbkVar = (esbk) sgh.a(parcel, esbk.CREATOR);
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getIndexable(iAppIndexingCallbackAsInterface, esbkVar, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IAppIndexingCallback iAppIndexingCallbackAsInterface2 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    esam[] esamVarArr = (esam[]) parcel.createTypedArray(esam.CREATOR);
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    search(iAppIndexingCallbackAsInterface2, esamVarArr, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IStatusCallback iStatusCallbackAsInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Thing[] thingArr2 = (Thing[]) parcel.createTypedArray(Thing.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    patch(iStatusCallbackAsInterface4, thingArr2, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    IStatusCallback iStatusCallbackAsInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    esbr esbrVar = (esbr) sgh.a(parcel, esbr.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    esaz esazVarMutate = mutate(iStatusCallbackAsInterface5, esbrVar, apiMetadata7);
                    parcel2.writeNoException();
                    sgh.e(parcel2, esazVarMutate);
                    return true;
                case 9:
                    IStatusCallback iStatusCallbackAsInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] strArrCreateStringArray2 = parcel.createStringArray();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeTypes(iStatusCallbackAsInterface6, strArrCreateStringArray2, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    IAppIndexingCallback iAppIndexingCallbackAsInterface3 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] strArrCreateStringArray3 = parcel.createStringArray();
                    esai esaiVar = (esai) sgh.a(parcel, esai.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    get(iAppIndexingCallbackAsInterface3, strArrCreateStringArray3, esaiVar, apiMetadata9);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    void get(IAppIndexingCallback iAppIndexingCallback, String[] strArr, esai esaiVar, ApiMetadata apiMetadata);

    void getIndexable(IAppIndexingCallback iAppIndexingCallback, esbk esbkVar, ApiMetadata apiMetadata);

    esaz mutate(IStatusCallback iStatusCallback, esbr esbrVar, ApiMetadata apiMetadata);

    void patch(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata);

    void remove(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata);

    void removeAll(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void removeTypes(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata);

    void search(IAppIndexingCallback iAppIndexingCallback, esam[] esamVarArr, ApiMetadata apiMetadata);

    void update(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata);
}
