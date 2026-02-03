package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgf(ddp ddpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(2.0f);
            Duration duration = dmcc.a;
            dia diaVarC = dea.c((int) dmcc.c.toMillis(), 0, null, 6);
            this.a = 1;
            if (ddp.k(ddpVar, f, diaVarC, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmgf(this.b, fcxyVar);
    }
}
