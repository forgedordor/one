package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlr extends fcyz implements fdat {
    final /* synthetic */ zlz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlr(zlz zlzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = zlzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zlr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.h.h(agfk.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zlr(this.a, fcxyVar);
    }
}
