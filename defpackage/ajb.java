package defpackage;

import android.app.appsearch.SearchResult;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajb {
    public static agr a(SearchResult searchResult) {
        lcg.i(searchResult);
        afv afvVarB = air.b(searchResult.getGenericDocument());
        agm agmVar = new agm(searchResult.getPackageName(), searchResult.getDatabaseName());
        agmVar.e(afvVarB);
        double rankingSignal = searchResult.getRankingSignal();
        agmVar.b();
        agmVar.b = rankingSignal;
        List matchInfos = searchResult.getMatchInfos();
        for (int i = 0; i < matchInfos.size(); i++) {
            SearchResult.MatchInfo matchInfoM = air$$ExternalSyntheticApiModelOutline1.m(matchInfos.get(i));
            lcg.i(matchInfoM);
            agn agnVar = new agn(matchInfoM.getPropertyPath());
            agnVar.a = new agp(matchInfoM.getExactMatchRange().getStart(), matchInfoM.getExactMatchRange().getEnd());
            agnVar.c = new agp(matchInfoM.getSnippetRange().getStart(), matchInfoM.getSnippetRange().getEnd());
            if (Build.VERSION.SDK_INT >= 33) {
                agnVar.b = new agp(aiz.b(matchInfoM), aiz.a(matchInfoM));
            }
            agmVar.d(agnVar.a());
        }
        if (Build.VERSION.SDK_INT >= 34) {
            Iterator<SearchResult> it = aja.a(searchResult).iterator();
            while (it.hasNext()) {
                agmVar.c(a(aib$$ExternalSyntheticApiModelOutline0.m93m((Object) it.next())));
            }
        }
        if (ajk.b()) {
            List<Double> listA = aiy.a(searchResult);
            for (int i2 = 0; i2 < listA.size(); i2++) {
                Double d = listA.get(i2);
                d.doubleValue();
                agmVar.b();
                agmVar.c.add(d);
            }
            try {
                agmVar.f(aiy.b(searchResult));
            } catch (NoSuchMethodError e) {
                Log.e("AppSearchSearchResPlatC", "Failed to set parent type map.", e);
            }
        }
        return agmVar.a();
    }
}
