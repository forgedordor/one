package defpackage;

import android.app.appsearch.SearchResult;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiy {
    static List<Double> a(SearchResult searchResult) {
        return searchResult.getInformationalRankingSignals();
    }

    static Map<String, List<String>> b(SearchResult searchResult) {
        return searchResult.getParentTypeMap();
    }
}
