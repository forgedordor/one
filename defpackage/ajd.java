package defpackage;

import android.app.appsearch.SearchSpec;
import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajd {
    static void a(SearchSpec.Builder builder, agu aguVar) {
        if (aguVar.g()) {
            builder.setNumericSearchEnabled(true);
        }
        if (aguVar.h()) {
            builder.setVerbatimSearchEnabled(true);
        }
        if (aguVar.f()) {
            builder.setListFilterQueryLanguageEnabled(true);
        }
    }

    static void b(Context context, SearchSpec.Builder builder, agb agbVar) {
        lcg.i(context);
        lcg.i(agbVar);
        throw null;
    }

    static void c(SearchSpec.Builder builder, Map<String, Map<String, Double>> map) {
        for (Map.Entry<String, Map<String, Double>> entry : map.entrySet()) {
            builder.setPropertyWeights(entry.getKey(), entry.getValue());
        }
    }

    static void d(SearchSpec.Builder builder, String str) {
        builder.setRankingStrategy(str);
    }
}
