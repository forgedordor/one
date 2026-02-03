package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.internal.ISearchQueriesService;
import com.google.android.gms.search.queries.internal.SearchQueriesCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedg extends dcfm implements dedd {
    public static final /* synthetic */ int a = 0;
    private static final dcfd b;
    private static final dceu m;
    private static final dcfe n;

    static {
        dcfd dcfdVar = new dcfd();
        b = dcfdVar;
        dedf dedfVar = new dedf();
        m = dedfVar;
        n = new dcfe("SearchIndex.QUERIES_API", dedfVar, dcfdVar);
    }

    public dedg(Context context) {
        super(context, n, null, dcfl.a);
        context.getPackageName();
    }

    @Override // defpackage.dedd
    public final defn a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
        final QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.g = new Bundle();
        queryCall$Request.g.putLong("request_timestamp_ms", System.currentTimeMillis());
        queryCall$Request.a = str;
        queryCall$Request.b = str2;
        queryCall$Request.c = strArr;
        queryCall$Request.d = i;
        queryCall$Request.e = i2;
        queryCall$Request.f = querySpecification;
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dede
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                dedh dedhVar = (dedh) obj;
                int i3 = dedg.a;
                SearchQueriesCallbacks searchQueriesCallbacks = new SearchQueriesCallbacks(dedhVar, (defr) obj2);
                ISearchQueriesService iSearchQueriesService = (ISearchQueriesService) dedhVar.w();
                Context context = dedhVar.c;
                iSearchQueriesService.query(queryCall$Request, searchQueriesCallbacks, ddlh.a());
            }
        };
        dcizVar.c = 8117;
        return j(dcizVar.a());
    }
}
