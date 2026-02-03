package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpd {
    public static final void a(kpy kpyVar, List list) {
        ArrayList arrayList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ixk ixkVar = (ixk) list.get(i);
            Object objB = iwa.b(ixkVar);
            if (objB == null && (objB = kpi.a(ixkVar)) == null) {
                objB = new kpc();
            }
            kqx kqxVarB = kpyVar.b(objB.toString());
            if (kqxVarB != null) {
                kqxVarB.af = ixkVar;
                krz krzVar = kqxVarB.ag;
                if (krzVar != null) {
                    krzVar.aq = kqxVarB.af;
                }
            }
            Object objF = ixkVar.f();
            kpj kpjVar = objF instanceof kpj ? (kpj) objF : null;
            String strB = kpjVar != null ? kpjVar.b() : null;
            if (strB != null && (objB instanceof String)) {
                String str = (String) objB;
                if (kpyVar.b(str) instanceof kqx) {
                    HashMap map = kpyVar.g;
                    if (map.containsKey(strB)) {
                        arrayList = (ArrayList) map.get(strB);
                    } else {
                        arrayList = new ArrayList();
                        map.put(strB, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }
}
