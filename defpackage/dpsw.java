package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpsw extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ dptt b;
    final /* synthetic */ hsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpsw(boolean z, dptt dpttVar, hsf hsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = dpttVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpsw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!this.a && dpti.g(this.c)) {
            this.b.b();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpsw(this.a, this.b, this.c, fcxyVar);
    }
}
