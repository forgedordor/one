package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbnq extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ cbno c;
    final /* synthetic */ cbod d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbnq(cbno cbnoVar, cbod cbodVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = cbnoVar;
        this.d = cbodVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            cbno cbnoVar = this.c;
            this.b = 1;
            obj = cbnoVar.a(this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            Object obj2 = this.a;
            fctl.b(obj);
            return obj2;
        }
        fctl.b(obj);
        final cbod cbodVar = this.d;
        final cbno cbnoVar2 = this.c;
        final cbcw cbcwVar = (cbcw) obj;
        this.a = cbcwVar;
        this.b = 2;
        eiju eijuVarB = cbodVar.g.b("WorkQueueTikTokWorker::handleTrancheExecutionResults", new Runnable() { // from class: cbnf
            @Override // java.lang.Runnable
            public final void run() {
                dqxl dqxlVar;
                cbfd cbfdVarA = cbfi.a();
                final cbno cbnoVar3 = cbnoVar2;
                cbfdVarA.e(new Function() { // from class: cbng
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        List list = cbnoVar3.c;
                        cbfh cbfhVar = (cbfh) obj3;
                        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((cbdg) it.next()).m()));
                        }
                        cbfhVar.d(arrayList);
                        return cbfhVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                cbfdVarA.A("WorkQueueTikTokWorker::countRowsToUpdate");
                int iH = cbfdVarA.b().h();
                final List list = cbnoVar3.c;
                if (iH != list.size()) {
                    throw new cayj();
                }
                cbod cbodVar2 = cbodVar;
                cbcw cbcwVar2 = cbcwVar;
                if (cbcwVar2.e()) {
                    cqbd cqbdVarD = cbod.a.d();
                    cqbdVarD.I("Tranche succeeded");
                    cbod.c(cqbdVarD, cbnoVar3);
                    ekgb ekgbVarC = cbcwVar2.c();
                    cqbdVarD.y("follow-up items", ekgbVarC != null ? ekgbVarC.size() : 0);
                    cqbdVarD.r();
                    ekgb ekgbVarC2 = cbcwVar2.c();
                    if (ekgbVarC2 != null && !ekgbVarC2.isEmpty()) {
                        ekgb ekgbVarC3 = cbcwVar2.c();
                        ekgbVarC3.getClass();
                        ((ekhx) cbodVar2.c.d(ekfv.a(ekgbVarC3)).keySet()).containsAll(ekgbVarC3);
                    }
                    cbod.d(list);
                    return;
                }
                if (!cbcwVar2.f()) {
                    cqbd cqbdVarE = cbod.a.e();
                    cqbdVarE.I("Tranche failed permanently");
                    cbod.c(cqbdVarE, cbnoVar3);
                    cqbdVarE.r();
                    cbod.d(list);
                    return;
                }
                cqce cqceVar = cbod.a;
                cqbd cqbdVarD2 = cqceVar.d();
                cqbdVarD2.I("Tranche failed retriably");
                cbod.c(cqbdVarD2, cbnoVar3);
                cqbdVarD2.r();
                cazg cazgVar = cbnoVar3.a;
                caya cayaVarA = cazgVar.a();
                cbff cbffVar = new cbff();
                cbffVar.ap("incrementAttemptCountAndApplyBackoff");
                cbffVar.af(new cbfg((cbfh) new Function() { // from class: cbna
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        List list2 = list;
                        cbfh cbfhVar = (cbfh) obj3;
                        ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((cbdg) it.next()).m()));
                        }
                        cbfhVar.d(arrayList);
                        return cbfhVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new cbfh())));
                cbeh cbehVar = cbfi.c.d;
                cbffVar.ag("attempts", new dqxl("$V + 1", new Object[]{cbehVar}));
                Long lValueOf = Long.valueOf(cbodVar2.b.f().toEpochMilli());
                caxl caxlVar = (caxl) cayaVarA;
                Long lValueOf2 = Long.valueOf(caxlVar.e);
                pza pzaVar = caxlVar.f;
                pzaVar.getClass();
                int iOrdinal = pzaVar.ordinal();
                if (iOrdinal == 0) {
                    dqxlVar = new dqxl("1 << $V", new Object[]{cbehVar});
                } else {
                    if (iOrdinal != 1) {
                        throw new fctg();
                    }
                    dqxlVar = new dqxl("$V + 1", new Object[]{cbehVar});
                }
                cbffVar.ag("minimum_start_time", new dqxl("$V + min($V, $V * ($V))", new Object[]{lValueOf, 18000000L, lValueOf2, dqxlVar}));
                if (cbffVar.a().e() != list.size()) {
                    throw new IllegalStateException("Could not update attempt counts for all " + list.size() + " failed items");
                }
                final int i2 = ((caxl) cazgVar.a()).d;
                cbew cbewVar = new cbew();
                cbewVar.f("deleteExhaustedItems");
                cbewVar.c(new Function() { // from class: cbnc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        List list2 = cbnoVar3.c;
                        cbfh cbfhVar = (cbfh) obj3;
                        ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(((cbdg) it.next()).m()));
                        }
                        int i3 = i2;
                        cbfhVar.d(arrayList);
                        cbfhVar.ap(new dqty("work_queue.attempts", 9, Integer.valueOf(i3)));
                        return cbfhVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int iD = cbewVar.d();
                if (iD > 0) {
                    cqbd cqbdVarE2 = cqceVar.e();
                    cqbdVarE2.I("Retries exhausted for items");
                    cqbdVarE2.A("queue", cbnoVar3.b);
                    cqbdVarE2.y("count", iD);
                    cqbdVarE2.y("attempts", i2);
                    cqbdVarE2.r();
                }
            }
        });
        eijuVarB.getClass();
        Object objC = fdxs.c(eijuVarB, this);
        if (objC != fcylVar) {
            objC = fctx.a;
        }
        return objC != fcylVar ? cbcwVar : fcylVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbnq(this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
