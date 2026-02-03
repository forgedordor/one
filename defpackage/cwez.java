package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwez extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwfa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwez(cwfa cwfaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwfaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwez) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (fdkj.c(250L, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.b.f(null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwez(this.b, fcxyVar);
    }
}
