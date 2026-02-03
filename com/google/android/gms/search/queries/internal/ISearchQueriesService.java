package com.google.android.gms.search.queries.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.queries.AnnotateCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchQueriesService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchQueriesService {
        static final int TRANSACTION_annotate = 7;
        static final int TRANSACTION_getDocument = 9;
        static final int TRANSACTION_getDocuments = 4;
        static final int TRANSACTION_getPhraseAffinity = 5;
        static final int TRANSACTION_globalQuery = 3;
        static final int TRANSACTION_logApiTraceEvents = 8;
        static final int TRANSACTION_query = 2;
        static final int TRANSACTION_querySuggest = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchQueriesService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesService");
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void annotate(AnnotateCall$Request annotateCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, annotateCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getDocument(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getDocumentsCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getDocuments(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getDocumentsCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getPhraseAffinity(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, getPhraseAffinityCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void globalQuery(GlobalQueryCall$Request globalQueryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, globalQueryCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void logApiTraceEvents(Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(8, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void query(QueryCall$Request queryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, queryCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void querySuggest(QuerySuggestCall$Request querySuggestCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, querySuggestCall$Request);
                sgh.f(parcelObtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.queries.internal.ISearchQueriesService");
        }

        public static ISearchQueriesService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesService");
            return iInterfaceQueryLocalInterface instanceof ISearchQueriesService ? (ISearchQueriesService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    QueryCall$Request queryCall$Request = (QueryCall$Request) sgh.a(parcel, QueryCall$Request.CREATOR);
                    ISearchQueriesCallbacks iSearchQueriesCallbacksAsInterface = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    query(queryCall$Request, iSearchQueriesCallbacksAsInterface, apiMetadata);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    GlobalQueryCall$Request globalQueryCall$Request = (GlobalQueryCall$Request) sgh.a(parcel, GlobalQueryCall$Request.CREATOR);
                    ISearchQueriesCallbacks iSearchQueriesCallbacksAsInterface2 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    globalQuery(globalQueryCall$Request, iSearchQueriesCallbacksAsInterface2, apiMetadata2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    GetDocumentsCall$Request getDocumentsCall$Request = (GetDocumentsCall$Request) sgh.a(parcel, GetDocumentsCall$Request.CREATOR);
                    ISearchQueriesCallbacks iSearchQueriesCallbacksAsInterface3 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDocuments(getDocumentsCall$Request, iSearchQueriesCallbacksAsInterface3, apiMetadata3);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = (GetPhraseAffinityCall$Request) sgh.a(parcel, GetPhraseAffinityCall$Request.CREATOR);
                    ISearchQueriesCallbacks iSearchQueriesCallbacksAsInterface4 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPhraseAffinity(getPhraseAffinityCall$Request, iSearchQueriesCallbacksAsInterface4, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    QuerySuggestCall$Request querySuggestCall$Request = (QuerySuggestCall$Request) sgh.a(parcel, QuerySuggestCall$Request.CREATOR);
                    ISearchQueriesCallbacks iSearchQueriesCallbacksAsInterface5 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    querySuggest(querySuggestCall$Request, iSearchQueriesCallbacksAsInterface5, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    AnnotateCall$Request annotateCall$Request = (AnnotateCall$Request) sgh.a(parcel, AnnotateCall$Request.CREATOR);
                    ISearchQueriesCallbacks iSearchQueriesCallbacksAsInterface6 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    annotate(annotateCall$Request, iSearchQueriesCallbacksAsInterface6, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    logApiTraceEvents(bundle, apiMetadata7);
                    return true;
                case 9:
                    GetDocumentsCall$Request getDocumentsCall$Request2 = (GetDocumentsCall$Request) sgh.a(parcel, GetDocumentsCall$Request.CREATOR);
                    ISearchQueriesCallbacks iSearchQueriesCallbacksAsInterface7 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDocument(getDocumentsCall$Request2, iSearchQueriesCallbacksAsInterface7, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void annotate(AnnotateCall$Request annotateCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void getDocument(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void getDocuments(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void getPhraseAffinity(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void globalQuery(GlobalQueryCall$Request globalQueryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void logApiTraceEvents(Bundle bundle, ApiMetadata apiMetadata);

    void query(QueryCall$Request queryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void querySuggest(QuerySuggestCall$Request querySuggestCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);
}
