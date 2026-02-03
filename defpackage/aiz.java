package defpackage;

import android.app.appsearch.SearchResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiz {
    static int a(SearchResult.MatchInfo matchInfo) {
        return matchInfo.getSubmatchRange().getEnd();
    }

    static int b(SearchResult.MatchInfo matchInfo) {
        return matchInfo.getSubmatchRange().getStart();
    }
}
