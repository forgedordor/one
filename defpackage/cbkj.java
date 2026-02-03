package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbkj extends fcyz implements fdap {
    public cbkj(fcxy fcxyVar) {
        super(1, fcxyVar);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = cbjq.a;
        cbjl cbjlVar = new cbjl(cbjq.a);
        cbjlVar.A("WorkQueueWorkManagerTableJanitorTask#findQueuesWithNullWorkManagerUuid");
        cbjlVar.c(cbjq.c.a);
        cbjlVar.d(new Function() { // from class: cbki
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                cbjp cbjpVar = (cbjp) obj2;
                cbjpVar.ap(new dqpn("work_queue_work_manager_ids.workmanager_id", 5));
                return cbjpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = cbjlVar.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((cbht) it.next()).m());
        }
        return arrayList;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbkj((fcxy) obj).b(fctx.a);
    }
}
