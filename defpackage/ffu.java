package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffu extends fcyz implements fdat {
    int a;
    final /* synthetic */ ffv b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffu(ffv ffvVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ffvVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ffv ffvVar = this.b;
            fdat fdatVar = this.c;
            this.a = 1;
            if (jnz.b(ffvVar, fdatVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ffu(this.b, this.c, fcxyVar);
    }
}
