package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmq extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public cbmq(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cbmq cbmqVar = new cbmq((fcxy) obj3);
        cbmqVar.c = (fdpm) obj;
        cbmqVar.b = obj2;
        return cbmqVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r10 = this.c;
            Map map = (Map) this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((cbmm) entry.getValue()).a());
            }
            fdpl[] fdplVarArr = new fdpl[2];
            fdplVarArr[0] = new fdpu(linkedHashMap);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList.add(new cbmu(new fdrk(((cbmm) entry2.getValue()).a, 1), (String) entry2.getKey()));
            }
            int i2 = fdsn.a;
            fdplVarArr[1] = new fdto(linkedHashMap, new fdwi(arrayList), new cbmr(null));
            fdpl fdplVarC = fdsn.c(fdplVarArr);
            this.a = 1;
            if (fdpy.c(r10, fdplVarC, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
