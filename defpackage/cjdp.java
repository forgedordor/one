package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdp extends cjcl {
    @Override // defpackage.cjcl
    public final void b(auce auceVar, cjgw cjgwVar) {
        cjjq cjjqVar = (cjjq) cjjr.a.createBuilder();
        String str = auceVar.c;
        cjjqVar.copyOnWrite();
        cjjr cjjrVar = (cjjr) cjjqVar.instance;
        str.getClass();
        cjjrVar.b |= 1;
        cjjrVar.c = str;
        cjgwVar.copyOnWrite();
        cjgx cjgxVar = (cjgx) cjgwVar.instance;
        cjjr cjjrVar2 = (cjjr) cjjqVar.build();
        cjgx cjgxVar2 = cjgx.a;
        cjjrVar2.getClass();
        cjgxVar.d = cjjrVar2;
        cjgxVar.b |= 4;
    }

    @Override // defpackage.cjcl
    public final void c(auce auceVar, cjgw cjgwVar) {
        Stream map = Collection.EL.stream(auceVar.g).map(new Function() { // from class: cjdo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cjel.b((aubq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        Iterable iterable = (Iterable) map.collect(ekcv.a);
        cjgwVar.copyOnWrite();
        cjgx cjgxVar = (cjgx) cjgwVar.instance;
        cjgx cjgxVar2 = cjgx.a;
        evtg evtgVar = cjgxVar.f;
        if (!evtgVar.c()) {
            cjgxVar.f = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cjgxVar.f);
    }

    @Override // defpackage.cjcl
    public final void d(auce auceVar, cjgw cjgwVar) {
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqs evqsVar = auceVar.h;
        evqdVar.copyOnWrite();
        evqe evqeVar = (evqe) evqdVar.instance;
        evqsVar.getClass();
        evqeVar.c = evqsVar;
        cjgwVar.copyOnWrite();
        cjgx cjgxVar = (cjgx) cjgwVar.instance;
        evqe evqeVar2 = (evqe) evqdVar.build();
        cjgx cjgxVar2 = cjgx.a;
        evqeVar2.getClass();
        cjgxVar.c = evqeVar2;
        cjgxVar.b |= 1;
    }
}
