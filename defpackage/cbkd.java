package defpackage;

import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbkd extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ cbkq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkd(cbkq cbkqVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = cbkqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            linkedHashMap = obj2;
        } else {
            fctl.b(obj);
            String[] strArr = cbjq.a;
            cbjl cbjlVar = new cbjl(cbjq.a);
            cbir cbirVar = cbjq.c;
            cbjlVar.c(cbirVar.a, cbirVar.b);
            cbjlVar.A("findFailedWorkManagerTasks");
            cbjlVar.d(new Function() { // from class: cbkb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    cbjp cbjpVar = (cbjp) obj3;
                    cbjpVar.ap(new dqpn("work_queue_work_manager_ids.workmanager_id", 6));
                    return cbjpVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cbjlVar.s();
            ekgb<cbht> ekgbVarZ = cbjlVar.b().z();
            ekgbVarZ.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
            for (cbht cbhtVar : ekgbVarZ) {
                Object obj3 = cbhtVar.k().get();
                String strM = cbhtVar.m();
                strM.getClass();
                fcti fctiVar = new fcti(obj3, strM);
                linkedHashMap2.put(fctiVar.a, fctiVar.b);
            }
            Set<UUID> setKeySet = linkedHashMap2.keySet();
            cbkq cbkqVar = this.c;
            ArrayList arrayList = new ArrayList(fcva.p(setKeySet, 10));
            for (UUID uuid : setKeySet) {
                arrayList.add(fdin.b(cbkqVar.h, eicg.a(fcyi.a), fdjz.a, new cbkc(null, uuid, cbkqVar)));
            }
            this.a = linkedHashMap2;
            this.b = 1;
            obj = fdii.a(arrayList, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            linkedHashMap = linkedHashMap2;
        }
        Set<Map.Entry> setEntrySet = fcwa.k((Iterable) obj).entrySet();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            key.getClass();
            qbp qbpVar = (qbp) entry.getValue();
            Object obj4 = linkedHashMap.get((UUID) key);
            obj4.getClass();
            fcti fctiVar2 = new fcti(obj4, qbpVar);
            linkedHashMap3.put(fctiVar2.a, fctiVar2.b);
        }
        Set setEntrySet2 = linkedHashMap3.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : setEntrySet2) {
            qbp qbpVar2 = (qbp) ((Map.Entry) obj5).getValue();
            if (!Objects.isNull(qbpVar2)) {
                Set set = cbkq.c;
                qbpVar2.getClass();
                if (!set.contains(qbpVar2.b)) {
                }
            }
            arrayList2.add(obj5);
        }
        ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList3;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbkd(this.c, (fcxy) obj).b(fctx.a);
    }
}
