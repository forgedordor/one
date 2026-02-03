package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbmh b;
    final /* synthetic */ String c;
    final /* synthetic */ Runnable d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cblz(fcxy fcxyVar, cbmh cbmhVar, String str, Runnable runnable) {
        super(2, fcxyVar);
        this.b = cbmhVar;
        this.c = str;
        this.d = runnable;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cblz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbmh cbmhVar = this.b;
        String str = this.c;
        Runnable runnable = this.d;
        this.a = 1;
        Object objF = cbmhVar.f(str, runnable, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cblz cblzVar = new cblz(fcxyVar, this.b, this.c, this.d);
        cblzVar.e = obj;
        return cblzVar;
    }
}
