package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzdr extends fcyz implements fdat {
    final /* synthetic */ bzds a;
    final /* synthetic */ String b;
    final /* synthetic */ bzbz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzdr(bzds bzdsVar, String str, bzbz bzbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bzdsVar;
        this.b = str;
        this.c = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzdr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final bzds bzdsVar = this.a;
        final String str = this.b;
        final bzbz bzbzVar = this.c;
        bzdsVar.d.d("CmsMessageBackupDelegate#onSuccess", new Runnable() { // from class: bzdq
            @Override // java.lang.Runnable
            public final void run() {
                ekgb ekgbVarR = ekgb.r(str);
                ekgbVarR.getClass();
                bzdsVar.g(bzds.h(ekgbVarR), bzbzVar);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzdr(this.a, this.b, this.c, fcxyVar);
    }
}
