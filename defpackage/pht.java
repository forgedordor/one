package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pht extends fcyz implements fdat {
    int a;
    final /* synthetic */ pex b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ fdap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pht(fcxy fcxyVar, pex pexVar, boolean z, boolean z2, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = pexVar;
        this.c = z;
        this.d = z2;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pht) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        phw phwVar = new phw(this.d, this.c, pexVar, null, this.e);
        this.a = 1;
        Object objW = pexVar.w(phwVar, this);
        return objW == fcylVar ? fcylVar : objW;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pht(fcxyVar, this.b, this.c, this.d, this.e);
    }
}
