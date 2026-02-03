package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqr extends fcyz implements fdat {
    int a;
    final /* synthetic */ wqu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqr(fcxy fcxyVar, wqu wquVar) {
        super(2, fcxyVar);
        this.b = wquVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wqr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        wrd wrdVar = (wrd) this.b.f.b();
        this.a = 1;
        Object objE = wrdVar.e(this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wqr wqrVar = new wqr(fcxyVar, this.b);
        wqrVar.c = obj;
        return wqrVar;
    }
}
