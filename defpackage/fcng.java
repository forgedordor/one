package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcng extends fcyz implements fdat {
    int a;
    final /* synthetic */ fbnc b;
    final /* synthetic */ fbnd c;
    final /* synthetic */ fbrk d;
    final /* synthetic */ fbrg e;
    final /* synthetic */ fcna f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcng(fbnc fbncVar, fbnd fbndVar, fbrk fbrkVar, fbrg fbrgVar, fcna fcnaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fbncVar;
        this.c = fbndVar;
        this.d = fbrkVar;
        this.e = fbrgVar;
        this.f = fcnaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcng) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fcnf fcnfVar = new fcnf(this.b, this.c, this.d, this.e, (fdpm) this.g, this.f, null);
            this.a = 1;
            if (fdjy.a(fcnfVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fcng fcngVar = new fcng(this.b, this.c, this.d, this.e, this.f, fcxyVar);
        fcngVar.g = obj;
        return fcngVar;
    }
}
