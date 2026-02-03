package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqw {
    private final cogw a;
    private final eosc b;
    private final cjxi c;
    private final fcsu d;

    public cjqw(cogw cogwVar, eosc eoscVar, cjxi cjxiVar, fcsu fcsuVar) {
        this.a = cogwVar;
        this.b = eoscVar;
        this.c = cjxiVar;
        this.d = fcsuVar;
    }

    public static elzz b(cjro cjroVar) {
        elzy elzyVar = (elzy) elzz.a.createBuilder();
        long jA = cjroVar.a() + 1;
        elzyVar.copyOnWrite();
        elzz elzzVar = (elzz) elzyVar.instance;
        elzzVar.b |= 1;
        elzzVar.c = jA;
        long jB = cjroVar.b();
        elzyVar.copyOnWrite();
        elzz elzzVar2 = (elzz) elzyVar.instance;
        elzzVar2.b |= 2;
        elzzVar2.d = jB;
        return (elzz) elzyVar.build();
    }

    private final cjqq g(cjqt cjqtVar, int i) {
        cjqq cjqqVar = (cjqq) cjqu.a.createBuilder();
        cjqqVar.copyOnWrite();
        cjqu cjquVar = (cjqu) cjqqVar.instance;
        cjquVar.d = cjqtVar.a();
        cjquVar.b |= 2;
        cjqqVar.copyOnWrite();
        cjqu cjquVar2 = (cjqu) cjqqVar.instance;
        cjquVar2.e = i - 2;
        cjquVar2.b |= 4;
        cjqqVar.copyOnWrite();
        cjqu cjquVar3 = (cjqu) cjqqVar.instance;
        cjquVar3.c = 1;
        cjquVar3.b = 1 | cjquVar3.b;
        evvp evvpVarC = evxc.c(this.a.f().toEpochMilli());
        cjqqVar.copyOnWrite();
        cjqu cjquVar4 = (cjqu) cjqqVar.instance;
        evvpVarC.getClass();
        cjquVar4.f = evvpVarC;
        cjquVar4.b |= 8;
        return cjqqVar;
    }

    public final eiju a(final cjqu cjquVar) {
        cjxi cjxiVar = this.c;
        eiju eijuVarJ = cjxiVar.d.j(new ejvr() { // from class: cjvp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjuu cjuuVar = (cjuu) obj;
                cjub cjubVar = (cjub) cjuuVar.toBuilder();
                cjubVar.copyOnWrite();
                ((cjuu) cjubVar.instance).p = cjuu.emptyProtobufList();
                ekgb ekgbVarH = cjxi.h(cjuuVar.p, cjquVar);
                cjubVar.copyOnWrite();
                cjuu cjuuVar2 = (cjuu) cjubVar.instance;
                evtg evtgVar = cjuuVar2.p;
                if (!evtgVar.c()) {
                    cjuuVar2.p = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(ekgbVarH, cjuuVar2.p);
                return (cjuu) cjubVar.build();
            }
        });
        egzg egzgVar = cjxiVar.g;
        egxy egxyVar = new egxy();
        egxyVar.b(eijuVarJ);
        egxyVar.a = new ejvr() { // from class: cjvq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cjxi.h((List) obj, cjquVar);
            }
        };
        egxyVar.c(cjxi.c);
        return eiju.g(egzgVar.a(egxyVar.a())).h(new ejvr() { // from class: cjvr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final void c(emfc emfcVar, cjro cjroVar) {
        cjya cjyaVar = (cjya) this.d.b();
        Optional optionalOf = Optional.of(b(cjroVar));
        emfcVar.getClass();
        auvw.k(cjyaVar.a, null, null, new cjxs(emfcVar, cjyaVar, optionalOf, null), 3);
    }

    public final void d(emfc emfcVar, Optional optional) {
        cjya cjyaVar = (cjya) this.d.b();
        Optional map = optional.map(new Function() { // from class: cjqv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cjqw.b((cjro) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        emfcVar.getClass();
        map.getClass();
        auvw.k(cjyaVar.a, null, null, new cjxt(emfcVar, cjyaVar, map, null), 3);
    }

    public final void e(int i) {
        a((cjqu) g(cjqt.BANNER, i).build()).k(auvh.b(), this.b);
    }

    public final void f(int i) {
        a((cjqu) g(cjqt.BOTTOMSHEET, i).build()).k(auvh.b(), this.b);
    }
}
