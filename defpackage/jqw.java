package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jqw extends fcyz implements fdat {
    int a;
    final /* synthetic */ jrb b;
    final /* synthetic */ Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqw(jrb jrbVar, Runnable runnable, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = jrbVar;
        this.c = runnable;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jqw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            jrb jrbVar = this.b;
            this.a = 1;
            if (jrbVar.b.c(0.0f, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.c.a(false);
        this.c.run();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new jqw(this.b, this.c, fcxyVar);
    }
}
