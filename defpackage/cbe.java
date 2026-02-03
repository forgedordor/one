package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbe implements bkf {
    private final bkf c;
    private final azv d;
    private final Map e = new HashMap();

    public cbe(bkf bkfVar, azv azvVar) {
        this.c = bkfVar;
        this.d = azvVar;
    }

    private final bkj c(int i) {
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return (bkj) map.get(numValueOf);
        }
        bkf bkfVar = this.c;
        bkh bkhVarE = null;
        if (bkfVar.b(i)) {
            bkj bkjVarA = bkfVar.a(i);
            azv azvVar = this.d;
            if (bkjVarA != null) {
                ArrayList arrayList = new ArrayList();
                for (bki bkiVar : bkjVarA.d()) {
                    if (cgx.a(bkiVar, azvVar)) {
                        arrayList.add(bkiVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bkhVarE = bkh.e(bkjVarA.a(), bkjVarA.b(), bkjVarA.c(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), bkhVarE);
        }
        return bkhVarE;
    }

    @Override // defpackage.bkf
    public final bkj a(int i) {
        return c(i);
    }

    @Override // defpackage.bkf
    public final boolean b(int i) {
        return this.c.b(i) && c(i) != null;
    }
}
