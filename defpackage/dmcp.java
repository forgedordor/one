package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcp extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ dmdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmcp(dmdo dmdoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmdoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmcp) c((Duration) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(!fdbq.f((Duration) this.a, this.b.e.a));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmcp dmcpVar = new dmcp(this.b, fcxyVar);
        dmcpVar.a = obj;
        return dmcpVar;
    }
}
