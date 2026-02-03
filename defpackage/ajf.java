package defpackage;

import android.app.appsearch.SearchSpec;
import android.content.Context;
import android.os.Build;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajf {
    public static SearchSpec a(Context context, agu aguVar) {
        SearchSpec.Builder builder = new SearchSpec.Builder();
        String str = aguVar.h;
        if (str.isEmpty()) {
            builder.setRankingStrategy(0);
        } else {
            if (Build.VERSION.SDK_INT < 34) {
                throw new UnsupportedOperationException("SEARCH_SPEC_ADVANCED_RANKING_EXPRESSION is not available on this AppSearch implementation.");
            }
            ajd.d(builder, str);
        }
        SearchSpec.Builder termMatch = builder.setTermMatch(aguVar.a);
        List list = aguVar.b;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        SearchSpec.Builder builderAddFilterNamespaces = termMatch.addFilterSchemas((Collection<String>) list).addFilterNamespaces((Collection<String>) aguVar.a());
        List list2 = aguVar.d;
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
        }
        builderAddFilterNamespaces.addFilterPackageNames((Collection<String>) list2).setResultCountPerPage(aguVar.e).setOrder(0).setSnippetCount(0).setSnippetCountPerProperty(10000).setMaxSnippetSize(0);
        if (Build.VERSION.SDK_INT >= 34 || ajk.a(context) >= 340800000) {
            for (Map.Entry entry : aguVar.c().entrySet()) {
                builder.addProjection((String) entry.getKey(), (Collection) entry.getValue());
            }
        }
        if (!aguVar.d().isEmpty()) {
            if (Build.VERSION.SDK_INT < 34) {
                throw new UnsupportedOperationException("Property weights are not supported with this backend/Android API level combination.");
            }
            ajd.c(builder, aguVar.d());
        }
        List list3 = aguVar.i;
        if (!list3.isEmpty()) {
            if (aguVar.g() || aguVar.h() || aguVar.f()) {
                if (Build.VERSION.SDK_INT < 34) {
                    throw new UnsupportedOperationException("Advanced query features (NUMERIC_SEARCH, VERBATIM_SEARCH and LIST_FILTER_QUERY_LANGUAGE) are not supported with this backend/Android API level combination.");
                }
                ajd.a(builder, aguVar);
            }
            if (aguVar.e()) {
                if (Build.VERSION.SDK_INT < 35) {
                    throw new UnsupportedOperationException("LIST_FILTER_HAS_PROPERTY_FUNCTION is not available on this AppSearch implementation.");
                }
                aje.b(builder, aguVar);
            }
            if (list3.contains("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION")) {
                throw new UnsupportedOperationException("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION is not available on this AppSearch implementation.");
            }
        }
        List list4 = aguVar.j;
        if (!list4.isEmpty()) {
            if (!ajk.b()) {
                throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
            }
            ajc.a(builder, list4);
            ajc.c(builder, 1);
        }
        if (!aguVar.l.isEmpty()) {
            throw new UnsupportedOperationException("SEARCH_SPEC_SEARCH_STRING_PARAMETERS is not available on this AppSearch implementation.");
        }
        if (!aguVar.b().isEmpty()) {
            if (Build.VERSION.SDK_INT < 35) {
                throw new UnsupportedOperationException("SEARCH_SPEC_ADD_FILTER_PROPERTIES is not available on this AppSearch implementation.");
            }
            aje.a(builder, aguVar.b());
        }
        List list5 = aguVar.k;
        if (!list5.isEmpty()) {
            if (!ajk.b()) {
                throw new UnsupportedOperationException("SEARCH_SPEC_ADD_INFORMATIONAL_RANKING_EXPRESSIONS are not available on this AppSearch implementation.");
            }
            ajc.b(builder, list5);
        }
        if (!aguVar.m.isEmpty()) {
            throw new UnsupportedOperationException("SEARCH_SPEC_ADD_FILTER_DOCUMENT_IDS is not available on this AppSearch implementation.");
        }
        if (list3.contains("SCHEMA_SCORABLE_PROPERTY_CONFIG")) {
            throw new UnsupportedOperationException("SCHEMA_SCORABLE_PROPERTY_CONFIG is not available on this AppSearch implementation.");
        }
        return builder.build();
    }
}
