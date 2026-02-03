package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkvk extends fcyz implements fdat {
    final /* synthetic */ dkxv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkvk(dkxv dkxvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dkxvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkvk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c().invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkvk(this.a, fcxyVar);
    }
}
