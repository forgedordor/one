package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fau extends fcyz implements fdat {
    final /* synthetic */ isn a;
    final /* synthetic */ fbh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fau(isn isnVar, fbh fbhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = isnVar;
        this.b = fbhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fau) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.c;
        fdjz fdjzVar = fdjz.d;
        isn isnVar = this.a;
        fbh fbhVar = this.b;
        fdil.d(fdjxVar, null, fdjzVar, new fas(isnVar, fbhVar, null), 1);
        return fdil.d(fdjxVar, null, fdjzVar, new fat(isnVar, fbhVar, null), 1);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fau fauVar = new fau(this.a, this.b, fcxyVar);
        fauVar.c = obj;
        return fauVar;
    }
}
