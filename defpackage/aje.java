package defpackage;

import android.app.appsearch.SearchSpec;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aje {
    static void a(SearchSpec.Builder builder, Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            builder.addFilterProperties(entry.getKey(), entry.getValue());
        }
    }

    static void b(SearchSpec.Builder builder, agu aguVar) {
        if (aguVar.e()) {
            builder.setListFilterHasPropertyFunctionEnabled(true);
        }
    }

    static void c(SearchSpec.Builder builder, String str) {
        builder.setSearchSourceLogTag(str);
    }
}
