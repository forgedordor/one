package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cthk extends fcyz implements fdat {
    int a;
    final /* synthetic */ cthm b;
    final /* synthetic */ cthd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cthk(cthm cthmVar, cthd cthdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cthmVar;
        this.c = cthdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cthk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cthm cthmVar = this.b;
        cthd cthdVar = this.c;
        this.a = 1;
        Object objL = cthmVar.l(cthdVar, this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cthk(this.b, this.c, fcxyVar);
    }
}
