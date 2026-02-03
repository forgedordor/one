package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lur extends fcyz implements fdat {
    final /* synthetic */ lvv a;
    final /* synthetic */ lvz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lur(lvv lvvVar, lvz lvzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = lvvVar;
        this.b = lvzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lur) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.k(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lur(this.a, this.b, fcxyVar);
    }
}
