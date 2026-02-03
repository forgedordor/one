package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class haq extends fcyz implements fdat {
    final /* synthetic */ jfw a;
    final /* synthetic */ hbl b;
    final /* synthetic */ hox c;
    final /* synthetic */ hox d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haq(jfw jfwVar, hbl hblVar, hox hoxVar, hox hoxVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = jfwVar;
        this.b = hblVar;
        this.c = hoxVar;
        this.d = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((haq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        jfw jfwVar = this.a;
        if (fdbq.f(jfwVar.a, true)) {
            hox hoxVar = this.c;
            hbl hblVar = this.b;
            hbj.s(hoxVar, hbj.f(hblVar));
            hbj.t(this.d, hbj.i(hblVar));
        }
        jfwVar.a = true;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new haq(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
