package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cozl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cozm b;
    final /* synthetic */ Map c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cozl(cozm cozmVar, Map map, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cozmVar;
        this.c = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cozl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjx fdjxVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            fdjxVar = (fdjx) this.d;
            cozm cozmVar = this.b;
            Map map = this.c;
            Map map2 = cozmVar.b;
            ArrayList arrayList = new ArrayList(((ekoj) map2).d);
            for (Map.Entry entry : ((ekgp) map2).entrySet()) {
                coze cozeVar = (coze) entry.getKey();
                cozo cozoVar = (cozo) entry.getValue();
                arrayList.add(fdin.b(fdjxVar, eicg.a(fcyi.a), fdjz.a, new cozj(null, cozmVar, cozeVar, map, cozoVar)));
            }
            this.d = fdjxVar;
            this.a = 1;
            if (fdii.a(arrayList, this) != fcylVar) {
            }
        }
        if (i != 1) {
            fctl.b(obj);
            return obj;
        }
        fdjxVar = (fdjx) this.d;
        fctl.b(obj);
        cozm cozmVar2 = this.b;
        Set<Map.Entry> setEntrySet = ((cozw) cozmVar2.d.b()).a().entrySet();
        setEntrySet.getClass();
        Map map3 = this.c;
        ArrayList arrayList2 = new ArrayList(fcva.p(setEntrySet, 10));
        for (Map.Entry entry2 : setEntrySet) {
            entry2.getClass();
            dggp dggpVar = (dggp) entry2.getKey();
            coze cozeVar2 = (coze) entry2.getValue();
            arrayList2.add(fdin.b(fdjxVar, eicg.a(fcyi.a), fdjz.a, new cozk(null, map3, dggpVar, cozeVar2, cozmVar2)));
        }
        this.d = null;
        this.a = 2;
        Object objA = fdii.a(arrayList2, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cozl cozlVar = new cozl(this.b, this.c, fcxyVar);
        cozlVar.d = obj;
        return cozlVar;
    }
}
