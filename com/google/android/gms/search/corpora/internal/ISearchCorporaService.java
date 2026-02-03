package com.google.android.gms.search.corpora.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchCorporaService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchCorporaService {
        static final int TRANSACTION_clearCorpus = 3;
        static final int TRANSACTION_deleteUsageReport = 6;
        static final int TRANSACTION_getCorpusInfo = 5;
        static final int TRANSACTION_getCorpusStatus = 4;
        static final int TRANSACTION_registerCorpusInfo = 7;
        static final int TRANSACTION_requestIndexing = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchCorporaService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaService");
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void clearCorpus(ClearCorpusCall$Request clearCorpusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, clearCorpusCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void deleteUsageReport(DeleteUsageReportCall$Request deleteUsageReportCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, deleteUsageReportCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void getCorpusInfo(GetCorpusInfoCall$Request getCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCorpusInfoCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void getCorpusStatus(GetCorpusStatusCall$Request getCorpusStatusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getCorpusStatusCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void registerCorpusInfo(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, registerCorpusInfoCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void requestIndexing(RequestIndexingCall$Request requestIndexingCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, requestIndexingCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
        }

        public static ISearchCorporaService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
            return iInterfaceQueryLocalInterface instanceof ISearchCorporaService ? (ISearchCorporaService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) sgh.a(parcel, RequestIndexingCall$Request.CREATOR);
                    ISearchCorporaCallbacks iSearchCorporaCallbacksAsInterface = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestIndexing(requestIndexingCall$Request, iSearchCorporaCallbacksAsInterface, apiMetadata);
                    break;
                case 3:
                    ClearCorpusCall$Request clearCorpusCall$Request = (ClearCorpusCall$Request) sgh.a(parcel, ClearCorpusCall$Request.CREATOR);
                    ISearchCorporaCallbacks iSearchCorporaCallbacksAsInterface2 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearCorpus(clearCorpusCall$Request, iSearchCorporaCallbacksAsInterface2, apiMetadata2);
                    break;
                case 4:
                    GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) sgh.a(parcel, GetCorpusStatusCall$Request.CREATOR);
                    ISearchCorporaCallbacks iSearchCorporaCallbacksAsInterface3 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCorpusStatus(getCorpusStatusCall$Request, iSearchCorporaCallbacksAsInterface3, apiMetadata3);
                    break;
                case 5:
                    GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) sgh.a(parcel, GetCorpusInfoCall$Request.CREATOR);
                    ISearchCorporaCallbacks iSearchCorporaCallbacksAsInterface4 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCorpusInfo(getCorpusInfoCall$Request, iSearchCorporaCallbacksAsInterface4, apiMetadata4);
                    break;
                case 6:
                    DeleteUsageReportCall$Request deleteUsageReportCall$Request = (DeleteUsageReportCall$Request) sgh.a(parcel, DeleteUsageReportCall$Request.CREATOR);
                    ISearchCorporaCallbacks iSearchCorporaCallbacksAsInterface5 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteUsageReport(deleteUsageReportCall$Request, iSearchCorporaCallbacksAsInterface5, apiMetadata5);
                    break;
                case 7:
                    RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) sgh.a(parcel, RegisterCorpusInfoCall$Request.CREATOR);
                    ISearchCorporaCallbacks iSearchCorporaCallbacksAsInterface6 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerCorpusInfo(registerCorpusInfoCall$Request, iSearchCorporaCallbacksAsInterface6, apiMetadata6);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearCorpus(ClearCorpusCall$Request clearCorpusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void deleteUsageReport(DeleteUsageReportCall$Request deleteUsageReportCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void getCorpusInfo(GetCorpusInfoCall$Request getCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void getCorpusStatus(GetCorpusStatusCall$Request getCorpusStatusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void registerCorpusInfo(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void requestIndexing(RequestIndexingCall$Request requestIndexingCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);
}
