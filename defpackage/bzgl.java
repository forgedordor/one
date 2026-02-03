package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzgl extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzgt c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgl(bzgt bzgtVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzgtVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzgl) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        final Map map = (Map) this.b;
        final bzgt bzgtVar = this.c;
        final int i2 = this.d;
        fdae fdaeVar = new fdae() { // from class: bzgj
            @Override // defpackage.fdae
            public final Object invoke() {
                Set setKeySet = map.keySet();
                int i3 = bzbc.a;
                final bzgt bzgtVar2 = bzgtVar;
                Map mapB = bzfl.b(bzgtVar2.f.e(setKeySet, bzbd.a), new fdat() { // from class: bzgk
                    @Override // defpackage.fdat
                    public final Object a(Object obj2, Object obj3) {
                        String str = (String) obj2;
                        bzgt bzgtVar3 = bzgtVar2;
                        cpyi cpyiVarA = bzgtVar3.f.a(obj3);
                        if (!cpyiVarA.a()) {
                            return obj3;
                        }
                        eksl ekslVar = (eksl) bzgtVar3.j.j();
                        ekslVar.X(bzmz.c, str);
                        ekslVar.X(bzmz.f, cpyiVarA);
                        ekslVar.q("Inserted item has already been backed up. Skipping.");
                        throw new bzfm(bzgtVar3.c, str);
                    }
                });
                Set setEntrySet = mapB.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setEntrySet) {
                    if (fctk.d(((fctk) ((Map.Entry) obj2).getValue()).a)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it.next()).getKey());
                }
                if (fcva.ay(arrayList2)) {
                    bzgtVar2.h(arrayList2, i2, 2);
                }
                return mapB;
            }
        };
        this.a = 1;
        Object objD = bzgtVar.d("Collecting data for CMS Insert", fdaeVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzgl bzglVar = new bzgl(this.c, this.d, fcxyVar);
        bzglVar.b = obj;
        return bzglVar;
    }
}
