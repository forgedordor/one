package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbd extends fcyz implements fdat {
    final /* synthetic */ hbl a;
    final /* synthetic */ int b;
    final /* synthetic */ igr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbd(hbl hblVar, int i, igr igrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hblVar;
        this.b = i;
        this.c = igrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hbd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (hbk.b(this.a.f(), this.b)) {
            this.c.a(new igq());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hbd(this.a, this.b, this.c, fcxyVar);
    }
}
