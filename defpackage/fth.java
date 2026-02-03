package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fth extends fcyz implements fdat {
    int a;
    final /* synthetic */ ftl b;
    final /* synthetic */ jgt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fth(ftl ftlVar, jgt jgtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ftlVar;
        this.c = jgtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fth) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ftl ftlVar = this.b;
            if (ftlVar != null) {
                jgt jgtVar = this.c;
                int i2 = ftlVar.b;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 - 1 != 0) {
                    throw new fctg();
                }
                long jA = jgtVar != null ? jgtVar.a(4000L, false) : 4000L;
                this.a = 1;
                if (fdkj.c(jA, this) == fcylVar) {
                    return fcylVar;
                }
                this.b.a();
            }
        } else {
            this.b.a();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fth(this.b, this.c, fcxyVar);
    }
}
