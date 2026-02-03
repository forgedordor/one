package defpackage;

import android.app.appsearch.EmbeddingVector;
import android.app.appsearch.SearchSpec;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajc {
    static void a(SearchSpec.Builder builder, List<aft> list) {
        EmbeddingVector[] embeddingVectorArr = new EmbeddingVector[list.size()];
        for (int i = 0; i < list.size(); i++) {
            embeddingVectorArr[i] = new EmbeddingVector(list.get(i).a, list.get(i).b);
        }
        builder.addEmbeddingParameters(embeddingVectorArr);
    }

    static void b(SearchSpec.Builder builder, List<String> list) {
        builder.addInformationalRankingExpressions(list);
    }

    static void c(SearchSpec.Builder builder, int i) {
        builder.setDefaultEmbeddingSearchMetricType(i);
    }
}
