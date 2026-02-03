package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lll extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ llo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lll(llo lloVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = lloVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lll) c((lmh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            lmh lmhVar = (lmh) this.b;
            llo lloVar = this.c;
            this.a = 1;
            if (lloVar.f(lmhVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lll lllVar = new lll(this.c, fcxyVar);
        lllVar.b = obj;
        return lllVar;
    }
}
