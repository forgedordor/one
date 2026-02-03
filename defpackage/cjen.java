package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjen extends cjct {
    @Override // defpackage.cjct
    public final void b(augi augiVar, cjkb cjkbVar) {
        audu auduVar = augiVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        audu auduVar2 = augiVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        cjgr cjgrVarA = cjdj.a(aubqVar, auduVar2.c);
        cjkbVar.copyOnWrite();
        cjkc cjkcVar = (cjkc) cjkbVar.instance;
        cjkc cjkcVar2 = cjkc.a;
        cjgrVarA.getClass();
        cjkcVar.d = cjgrVarA;
        cjkcVar.b |= 4;
    }

    @Override // defpackage.cjct
    public final void c(augi augiVar, cjkb cjkbVar) {
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqs evqsVar = augiVar.e;
        evqdVar.copyOnWrite();
        evqe evqeVar = (evqe) evqdVar.instance;
        evqsVar.getClass();
        evqeVar.c = evqsVar;
        cjkbVar.copyOnWrite();
        cjkc cjkcVar = (cjkc) cjkbVar.instance;
        evqe evqeVar2 = (evqe) evqdVar.build();
        cjkc cjkcVar2 = cjkc.a;
        evqeVar2.getClass();
        cjkcVar.c = evqeVar2;
        cjkcVar.b |= 1;
    }

    @Override // defpackage.cjct
    public final void d(augi augiVar, cjkb cjkbVar) {
        Stream map = Collection.EL.stream(augiVar.d).map(new Function() { // from class: cjem
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
        cjkbVar.copyOnWrite();
        cjkc cjkcVar = (cjkc) cjkbVar.instance;
        cjkc cjkcVar2 = cjkc.a;
        evtg evtgVar = cjkcVar.e;
        if (!evtgVar.c()) {
            cjkcVar.e = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cjkcVar.e);
    }
}
