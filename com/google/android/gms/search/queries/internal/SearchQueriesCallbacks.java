package com.google.android.gms.search.queries.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks;
import defpackage.dcjb;
import defpackage.ddlh;
import defpackage.dedh;
import defpackage.defr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SearchQueriesCallbacks<T> extends ISearchQueriesCallbacks.Stub {
    private final dedh a;
    private final defr b;

    public SearchQueriesCallbacks(dedh dedhVar, defr<T> defrVar) {
        this.a = dedhVar;
        this.b = defrVar;
    }

    private final void a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("should_log_stats")) {
            return;
        }
        bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
        try {
            dedh dedhVar = this.a;
            ISearchQueriesService iSearchQueriesService = (ISearchQueriesService) dedhVar.M();
            Context context = dedhVar.c;
            iSearchQueriesService.logApiTraceEvents(bundle, ddlh.a());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onAnnotateResponse(AnnotateCall$Response annotateCall$Response) {
        a(annotateCall$Response.c);
        dcjb.b(annotateCall$Response.a, annotateCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetDocumentsResponse(GetDocumentsCall$Response getDocumentsCall$Response) {
        a(getDocumentsCall$Response.c);
        dcjb.b(getDocumentsCall$Response.a, getDocumentsCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetPhraseAffinityResponse(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        a(getPhraseAffinityCall$Response.c);
        dcjb.b(getPhraseAffinityCall$Response.a, getPhraseAffinityCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGlobalQueryResponse(GlobalQueryCall$Response globalQueryCall$Response) {
        a(globalQueryCall$Response.c);
        dcjb.b(globalQueryCall$Response.a, globalQueryCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQueryResponse(QueryCall$Response queryCall$Response) {
        a(queryCall$Response.c);
        dcjb.b(queryCall$Response.a, queryCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQuerySuggestResponse(QuerySuggestCall$Response querySuggestCall$Response) {
        a(querySuggestCall$Response.c);
        dcjb.b(querySuggestCall$Response.a, querySuggestCall$Response.b, this.b);
    }
}
