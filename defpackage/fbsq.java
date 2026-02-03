package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbsq {
    public static fbst a(fbmx fbmxVar, fbso... fbsoVarArr) {
        fbst fbstVarN = fbmxVar.n();
        List listAsList = Arrays.asList(fbsoVarArr);
        if (listAsList.isEmpty()) {
            return fbstVarN;
        }
        fbsy fbsyVar = fbstVarN.a;
        HashMap map = new HashMap();
        Iterator it = fbstVarN.a().iterator();
        while (true) {
            String str = fbsyVar.a;
            if (!it.hasNext()) {
                return fbss.a(str, fbsyVar, map);
            }
            fbsr fbsrVar = (fbsr) it.next();
            fbsn fbspVar = fbsrVar.b;
            Iterator it2 = listAsList.iterator();
            while (it2.hasNext()) {
                fbspVar = new fbsp((fbso) it2.next(), fbspVar);
            }
            fbss.c(fbsrVar.a(fbspVar), str, map);
        }
    }
}
