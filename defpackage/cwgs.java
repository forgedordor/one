package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgs implements fdau {
    final /* synthetic */ dbs a;
    final /* synthetic */ List b;
    final /* synthetic */ cwfq c;
    final /* synthetic */ cyg d;

    public cwgs(dbs dbsVar, List list, cwfq cwfqVar, cyg cygVar) {
        this.a = dbsVar;
        this.b = list;
        this.c = cwfqVar;
        this.d = cygVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((egc) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dbs dbsVar = this.a;
            List list = this.b;
            cwfq cwfqVar = this.c;
            cwhc.e(dbsVar, list, cwfqVar.c, cwfqVar.e, !cwfqVar.f.a, this.d, hmlVar, 0);
        }
        return fctx.a;
    }
}
