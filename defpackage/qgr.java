package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgr {
    private final List a;

    public qgr(qhw qhwVar) {
        qgh qghVar;
        qhb[] qhbVarArr = new qhb[8];
        qhbVarArr[0] = new qgz(qhwVar.b);
        qhbVarArr[1] = new qha(qhwVar.c);
        qhbVarArr[2] = new qhg(qhwVar.e);
        qhp qhpVar = qhwVar.d;
        qhbVarArr[3] = new qhc(qhpVar);
        qhbVarArr[4] = new qhf(qhpVar);
        qhbVarArr[5] = new qhe(qhwVar.d);
        qhbVarArr[6] = new qhd(qhwVar.d);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = qhwVar.a;
            String str = qgu.a;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            qghVar = new qgh((ConnectivityManager) systemService);
        } else {
            qghVar = null;
        }
        qhbVarArr[7] = qghVar;
        this.a = fcur.K(qhbVarArr);
    }

    public final fdpl a(qjn qjnVar) {
        qjnVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((qhb) obj).b(qjnVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qhb) it.next()).a(qjnVar.l));
        }
        return fdqq.a(new qgq((fdpl[]) fcva.ao(arrayList2).toArray(new fdpl[0])));
    }

    public final boolean b(qjn qjnVar) {
        qjnVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((qhb) obj).c(qjnVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            qas.c().a(qgu.a, "Work " + qjnVar.c + " constrained by " + fcva.aF(arrayList, null, null, null, qgn.a, 31));
        }
        return arrayList.isEmpty();
    }
}
