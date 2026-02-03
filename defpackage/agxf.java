package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agxf extends fcyz implements fdat {
    final /* synthetic */ agxd a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agxf(agxd agxdVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = agxdVar;
        this.b = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agxf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((cgte) ((Optional) this.a.b.b()).get()).m(((Boolean) this.b).booleanValue());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agxf(this.a, this.b, fcxyVar);
    }
}
