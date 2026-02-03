package defpackage;

import android.app.appsearch.AppSearchResult;
import android.app.appsearch.SearchResults;
import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aig implements ags {
    public final agu a;
    public final Context b;
    private final SearchResults c;
    private final Executor d;

    public aig(SearchResults searchResults, agu aguVar, Executor executor, Context context) {
        lcg.i(searchResults);
        this.c = searchResults;
        this.a = aguVar;
        this.d = executor;
        this.b = context;
    }

    @Override // defpackage.ags
    public final ListenableFuture a() {
        final kop kopVar = new kop();
        this.c.getNextPage(this.d, new Consumer() { // from class: aif
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                AppSearchResult appSearchResultM84m = aib$$ExternalSyntheticApiModelOutline0.m84m(obj);
                boolean zIsSuccess = appSearchResultM84m.isSuccess();
                kop kopVar2 = kopVar;
                if (!zIsSuccess) {
                    kopVar2.h(new ahy(appSearchResultM84m.getResultCode(), appSearchResultM84m.getErrorMessage()));
                    return;
                }
                aig aigVar = this.a;
                List list = (List) appSearchResultM84m.getResultValue();
                ArrayList arrayList = new ArrayList(list.size());
                agu aguVar = aigVar.a;
                Map mapC = aguVar.c();
                int i = 0;
                boolean z = Build.VERSION.SDK_INT < 34 && ajk.a(aigVar.b) < 340800000 && !mapC.isEmpty();
                int i2 = 0;
                while (i2 < list.size()) {
                    if ((Build.VERSION.SDK_INT == 31 || Build.VERSION.SDK_INT == 32) && i2 == 0) {
                        if (!aguVar.a().isEmpty() && !aguVar.a().contains(aib$$ExternalSyntheticApiModelOutline0.m93m(list.get(i)).getGenericDocument().getNamespace())) {
                            kopVar2.g(Collections.EMPTY_LIST);
                            return;
                        }
                        i2 = i;
                    }
                    agr agrVarA = ajb.a(aib$$ExternalSyntheticApiModelOutline0.m93m(list.get(i2)));
                    if (z) {
                        afv afvVarA = agrVarA.a();
                        afu afuVar = new afu(afvVarA);
                        List list2 = (List) mapC.get(afvVarA.m());
                        List list3 = (List) mapC.get("*");
                        css cssVar = list2 != null ? new css(list2) : list3 != null ? new css(list3) : null;
                        if (cssVar != null) {
                            for (String str : afvVarA.o()) {
                                afv afvVarG = afvVarA.g(str);
                                if (afvVarG != null) {
                                    aigVar.b(afuVar, afvVarG, str, cssVar);
                                } else if (!cssVar.contains(str)) {
                                    afuVar.f(str);
                                }
                            }
                        }
                        agm agmVar = new agm(agrVarA);
                        agmVar.e(afuVar.e());
                        List<ago> listB = agrVarA.b();
                        if (!listB.isEmpty()) {
                            agmVar.b();
                            agmVar.a.clear();
                        }
                        for (ago agoVar : listB) {
                            String str2 = agoVar.a;
                            boolean z2 = list2 != null && list2.contains(str2);
                            boolean z3 = list3 != null && list3.contains(str2);
                            if (z2 || z3) {
                                agmVar.d(new agn(agoVar).a());
                            }
                        }
                        arrayList.add(agmVar.a());
                    } else {
                        arrayList.add(agrVarA);
                    }
                    i2++;
                    i = 0;
                }
                kopVar2.g(arrayList);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return kopVar;
    }

    public final void b(afu afuVar, afv afvVar, String str, Set set) {
        css cssVar = new css();
        csr csrVar = new csr((css) set);
        while (csrVar.hasNext()) {
            String str2 = (String) csrVar.next();
            if (str2.startsWith(String.valueOf(str).concat("."))) {
                cssVar.add(str2.substring(str.length() + 1));
            }
        }
        if (cssVar.isEmpty()) {
            return;
        }
        afu afuVar2 = new afu(afvVar);
        for (String str3 : afvVar.o()) {
            afv afvVarG = afvVar.g(str3);
            if (afvVarG != null) {
                b(afuVar2, afvVarG, str3, cssVar);
            } else if (!cssVar.contains(str3)) {
                afuVar2.f(str3);
            }
        }
        afuVar.a(str, afuVar2.e());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}
