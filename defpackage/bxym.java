package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxym {
    public final alrj a;

    public bxym(alrj alrjVar) {
        this.a = alrjVar;
    }

    public static Map a(List list, Function function, Predicate predicate) {
        Stream streamFilter = Collection.EL.stream(list).filter(predicate);
        Supplier supplier = new Supplier() { // from class: bxyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return new HashMap();
            }
        };
        int i = ekgb.d;
        return (Map) streamFilter.collect(Collectors.groupingBy(function, supplier, ekcv.a));
    }

    public static boolean b(UrlSearchResult urlSearchResult) {
        if (urlSearchResult.l() != null) {
            ezds ezdsVarL = urlSearchResult.l();
            if (csss.b((ezdsVarL.c == 8 ? (ezdk) ezdsVarL.d : ezdk.a).c)) {
                return true;
            }
        }
        return csss.b(urlSearchResult.s()) || csss.b(urlSearchResult.o());
    }
}
