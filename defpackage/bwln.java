package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwln {
    public final fcsu a;
    private final cexn b;
    private final Map c = new ConcurrentHashMap();

    public bwln(cexn cexnVar, fcsu fcsuVar) {
        this.b = cexnVar;
        this.a = fcsuVar;
    }

    public final eiju a(String str) {
        final cexn cexnVar = this.b;
        cexnVar.getClass();
        return eiju.g(((cexm) Map.EL.computeIfAbsent(this.c, str, new Function() { // from class: bwll
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cexnVar.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).b.h().h(new ejvr() { // from class: cexg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cevr) obj).c;
            }
        }, eoqg.a));
    }
}
