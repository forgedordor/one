package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcg extends cjci {
    @Override // defpackage.cjci
    public final void a(aubd aubdVar, cjgg cjggVar) {
        audu auduVar = aubdVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        audu auduVar2 = aubdVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        cjgr cjgrVarA = cjdj.a(aubqVar, auduVar2.c);
        cjggVar.copyOnWrite();
        cjgh cjghVar = (cjgh) cjggVar.instance;
        cjgh cjghVar2 = cjgh.a;
        cjgrVarA.getClass();
        cjghVar.d = cjgrVarA;
        cjghVar.b |= 4;
    }

    @Override // defpackage.cjci
    public final void b(aubd aubdVar, cjgg cjggVar) {
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqs evqsVar = aubdVar.e;
        evqdVar.copyOnWrite();
        evqe evqeVar = (evqe) evqdVar.instance;
        evqsVar.getClass();
        evqeVar.c = evqsVar;
        cjggVar.copyOnWrite();
        cjgh cjghVar = (cjgh) cjggVar.instance;
        evqe evqeVar2 = (evqe) evqdVar.build();
        cjgh cjghVar2 = cjgh.a;
        evqeVar2.getClass();
        cjghVar.c = evqeVar2;
        cjghVar.b |= 1;
    }

    @Override // defpackage.cjci
    public final void c(aubd aubdVar, cjgg cjggVar) {
        Stream map = Collection.EL.stream(aubdVar.d).map(new Function() { // from class: cjcf
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
        cjggVar.copyOnWrite();
        cjgh cjghVar = (cjgh) cjggVar.instance;
        cjgh cjghVar2 = cjgh.a;
        evtg evtgVar = cjghVar.e;
        if (!evtgVar.c()) {
            cjghVar.e = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, cjghVar.e);
    }
}
