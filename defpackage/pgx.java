package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgx extends fcyz implements fdat {
    final /* synthetic */ fdat a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgx(fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fcyf fcyfVar = ((fdjx) this.b).hE().get(fcya.k);
        fcyfVar.getClass();
        fcya fcyaVar = (fcya) fcyfVar;
        fdjd fdjdVar = new fdjd();
        fdin.c(fdlj.a, fcyaVar, fdjz.d, new pgv(fdjdVar, this.a, null));
        while (!fdjdVar.y()) {
            try {
                return fdim.a(fcyaVar, new pgw(fdjdVar, null));
            } catch (InterruptedException unused) {
            }
        }
        return fdjdVar.D();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        pgx pgxVar = new pgx(this.a, fcxyVar);
        pgxVar.b = obj;
        return pgxVar;
    }
}
