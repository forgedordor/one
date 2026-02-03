package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dksb implements fdau {
    final /* synthetic */ dkeg a;
    final /* synthetic */ int b;

    public dksb(dkeg dkegVar, int i) {
        this.a = dkegVar;
        this.b = i;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        ics icsVarJ = efy.j(ics.e, 52.0f, 0.0f, 0.0f, 0.0f, 14);
        ArrayList arrayList = new ArrayList();
        dkeg dkegVar = this.a;
        Iterator it = dkegVar.d.iterator();
        while (it.hasNext()) {
            fcva.y(arrayList, ((dkdi) it.next()).a);
        }
        dijr.f(new diju(dkegVar.a, arrayList, 4), null, icsVarJ, glz.a(hmlVar).q, jyq.y(glz.d(hmlVar).k, 0L, 0L, null, null, null, null, 0L, null, this.b, 0, 0L, null, null, 0, 16744447), null, 0L, null, false, null, null, null, null, hmlVar, 384, 0, 8162);
        return fctx.a;
    }
}
