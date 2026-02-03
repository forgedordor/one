package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class phr extends fcyz implements fdat {
    int a;
    final /* synthetic */ pex b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ fdap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phr(pex pexVar, boolean z, boolean z2, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pexVar;
        this.c = z;
        this.d = z2;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((phr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        pex pexVar = this.b;
        phq phqVar = new phq(!(pexVar.r() && pexVar.s()) && this.c, this.d, pexVar, null, this.e);
        this.a = 1;
        Object objW = pexVar.w(phqVar, this);
        return objW == fcylVar ? fcylVar : objW;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new phr(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
