package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgx extends fcyz implements fdat {
    int a;
    final /* synthetic */ qgy b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgx(qgy qgyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qgyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qgx) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.c;
            qgy qgyVar = this.b;
            qgw qgwVar = new qgw(qgyVar, fdosVar);
            qhp qhpVar = qgyVar.a;
            synchronized (qhpVar.b) {
                LinkedHashSet linkedHashSet = qhpVar.c;
                if (linkedHashSet.add(qgwVar)) {
                    if (linkedHashSet.size() == 1) {
                        qhpVar.d = qhpVar.b();
                        qas.c().a(qhq.a, qhpVar.getClass().getSimpleName() + ": initial state = " + qhpVar.d);
                        qhpVar.d();
                    }
                    qgwVar.a(qhpVar.d);
                }
            }
            qgv qgvVar = new qgv(this.b, qgwVar);
            this.a = 1;
            if (fdor.b(fdosVar, qgvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        qgx qgxVar = new qgx(this.b, fcxyVar);
        qgxVar.c = obj;
        return qgxVar;
    }
}
