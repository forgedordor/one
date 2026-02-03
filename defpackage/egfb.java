package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfb {
    public static final void a(String str, egbs egbsVar, Map map) {
        final fdap fdapVar = new fdap() { // from class: egez
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return new LinkedHashMap();
            }
        };
        Object objComputeIfAbsent = Map.EL.computeIfAbsent(map, str, new Function() { // from class: egfa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        objComputeIfAbsent.getClass();
        java.util.Map map2 = (java.util.Map) objComputeIfAbsent;
        if (map2.containsKey(egbsVar.g)) {
            throw new IllegalStateException("Found 2 accounts with the same account name.");
        }
        map2.put(egbsVar.g, egbsVar);
    }
}
