package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tas extends fcyz implements fdat {
    int a;
    final /* synthetic */ tbe b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tas(fcxy fcxyVar, tbe tbeVar) {
        super(2, fcxyVar);
        this.b = tbeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tas) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        tbt tbtVar = (tbt) this.b.i.b();
        this.a = 1;
        Object objA = fdin.a(eicg.a(tbtVar.a), new tbq(null, tbtVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tas tasVar = new tas(fcxyVar, this.b);
        tasVar.c = obj;
        return tasVar;
    }
}
