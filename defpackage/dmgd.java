package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgd extends fcyz implements fdat {
    final /* synthetic */ ddp a;
    final /* synthetic */ Duration b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgd(ddp ddpVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ddpVar;
        this.b = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fdil.d((fdjx) this.c, null, null, new dmgc(this.a, this.b, null), 3);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmgd dmgdVar = new dmgd(this.a, this.b, fcxyVar);
        dmgdVar.c = obj;
        return dmgdVar;
    }
}
