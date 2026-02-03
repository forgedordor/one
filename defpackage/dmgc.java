package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgc extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ Duration c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgc(ddp ddpVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(1.0f);
            dia diaVarA = dmgk.a(this.c, dev.d);
            this.a = 1;
            if (ddp.k(ddpVar, f, diaVarA, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmgc(this.b, this.c, fcxyVar);
    }
}
