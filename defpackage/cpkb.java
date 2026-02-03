package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpkb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cpke b;
    final /* synthetic */ cpkh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpkb(fcxy fcxyVar, cpke cpkeVar, cpkh cpkhVar) {
        super(2, fcxyVar);
        this.b = cpkeVar;
        this.c = cpkhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpkb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cpke cpkeVar = this.b;
        cpkh cpkhVar = this.c;
        this.a = 1;
        Object objD = cpkeVar.d(cpkhVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cpkb cpkbVar = new cpkb(fcxyVar, this.b, this.c);
        cpkbVar.d = obj;
        return cpkbVar;
    }
}
