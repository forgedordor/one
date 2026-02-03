package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbkg extends fcyz implements fdap {
    int a;
    final /* synthetic */ cbkq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkg(cbkq cbkqVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cbkqVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarC = this.b.g.c(cbbk.b);
            this.a = 1;
            obj = fdxs.c(eijuVarC, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final Collection collection = (Collection) obj;
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("WorkQueueWorkManagerTableJanitorTask#findQueuesNotScheduledInWorkManager");
        cbeh cbehVar = cbfi.c.f;
        cbfdVarA.c(cbehVar);
        String[] strArr = cbjq.a;
        cbjl cbjlVar = new cbjl(cbjq.a);
        cbis cbisVar = cbjq.c.a;
        cbjlVar.c(cbisVar);
        dqtr dqtrVarI = dqts.i(cbjlVar.b(), cbisVar, cbehVar);
        ((dqos) dqtrVarI).e = "wm";
        cbfdVarA.G(dqtrVarI);
        cbfdVarA.e(new Function() { // from class: cbkf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                cbfh cbfhVar = (cbfh) obj2;
                cbfhVar.ap(new dqpm("work_queue.type", 3, cbfh.as(collection), false));
                cbfhVar.ar(new dqxl("$V{wm} is NULL", new Object[]{cbjq.c.a}));
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbfdVarA.w(cbehVar);
        ekgb ekgbVarZ = cbfdVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((cbdg) it.next()).q());
        }
        return fcva.av(arrayList);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbkg(this.b, (fcxy) obj).b(fctx.a);
    }
}
