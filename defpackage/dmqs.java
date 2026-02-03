package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqs extends fcyz implements fdat {
    final /* synthetic */ ddp a;
    final /* synthetic */ Duration b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmqs(ddp ddpVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ddpVar;
        this.b = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdil.d((fdjx) this.c, null, null, new dmqr(this.a, this.b, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmqs dmqsVar = new dmqs(this.a, this.b, fcxyVar);
        dmqsVar.c = obj;
        return dmqsVar;
    }
}
