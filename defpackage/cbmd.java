package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbmd extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbmh c;
    final /* synthetic */ String d;
    final /* synthetic */ Runnable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbmd(cbmh cbmhVar, String str, Runnable runnable, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbmhVar;
        this.d = str;
        this.e = runnable;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbmd) c((cbmm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbmm cbmmVar = (cbmm) this.b;
        cbmh cbmhVar = this.c;
        String str = this.d;
        Runnable runnable = this.e;
        this.a = 1;
        Object objF = cbmhVar.a.f(str, cbmmVar, runnable, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbmd cbmdVar = new cbmd(this.c, this.d, this.e, fcxyVar);
        cbmdVar.b = obj;
        return cbmdVar;
    }
}
