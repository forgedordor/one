package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckhi extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckhm b;
    final /* synthetic */ int c;
    final /* synthetic */ ewjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckhi(ckhm ckhmVar, int i, ewjm ewjmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckhmVar;
        this.c = i;
        this.d = ewjmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckhi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckhm ckhmVar = this.b;
            int i2 = this.c;
            ewjm ewjmVar = this.d;
            this.a = 1;
            if (ckhmVar.f(i2, ewjmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckhi(this.b, this.c, this.d, fcxyVar);
    }
}
