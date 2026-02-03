package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dptk {
    public final HashMap a = new HashMap();
    private final dpsg b;

    public dptk(dpsg dpsgVar) {
        this.b = dpsgVar;
    }

    public final dpto a(fdjx fdjxVar, final dptm dptmVar) {
        HashMap map = this.a;
        doju dojuVar = dptmVar.b;
        String str = dojuVar.b;
        Uri uri = Uri.parse(str);
        Object obj = map.get(str);
        if (obj == null) {
            dpuk dpukVar = (dpuk) this.b.a.b();
            dpukVar.getClass();
            dpsf dpsfVar = new dpsf(dpukVar, fdjxVar, dojuVar);
            map.put(str, dpsfVar);
            obj = dpsfVar;
        }
        dpsf dpsfVar2 = (dpsf) obj;
        fdlw.c(((fdxz) fdjxVar).a).hK(new fdap() { // from class: dptj
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                HashMap map2 = this.a.a;
                String str2 = dptmVar.b.b;
                dpsf dpsfVar3 = (dpsf) map2.get(str2);
                if (dpsfVar3 != null) {
                    dpsfVar3.e();
                }
                map2.remove(str2);
                return fctx.a;
            }
        });
        fdae fdaeVar = dptmVar.c;
        boolean z = dptmVar.f;
        boolean z2 = dptmVar.e;
        dike dikeVar = dptmVar.g;
        dilo diloVar = dikeVar != null ? new dilo(dikeVar) : null;
        int i = dojuVar.d;
        int i2 = dojuVar.c;
        return new dpto(dptmVar.a, uri, dpsfVar2, dptmVar.d, i2, i, z2, fdaeVar, z, diloVar);
    }
}
