package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdsb extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdau c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdsb(fdpl fdplVar, fdau fdauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdsb) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdsa fdsaVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdsaVar = (fdsa) this.d;
            try {
                fctl.b(obj);
            } catch (fdvn e) {
                e = e;
                fdwu.a(e, fdsaVar);
                fdlw.f(u());
                return fctx.a;
            }
        } else {
            fctl.b(obj);
            fdpm fdpmVar = (fdpm) this.d;
            fdpl fdplVar = this.b;
            fdsa fdsaVar2 = new fdsa(this.c, fdpmVar);
            try {
                this.d = fdsaVar2;
                this.a = 1;
                if (fdplVar.a(fdsaVar2, this) == fcylVar) {
                    return fcylVar;
                }
            } catch (fdvn e2) {
                e = e2;
                fdsaVar = fdsaVar2;
                fdwu.a(e, fdsaVar);
                fdlw.f(u());
                return fctx.a;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdsb fdsbVar = new fdsb(this.b, this.c, fcxyVar);
        fdsbVar.d = obj;
        return fdsbVar;
    }
}
