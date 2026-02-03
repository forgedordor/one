package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eze extends fcyz implements fdat {
    final /* synthetic */ isn a;
    final /* synthetic */ fbh b;
    final /* synthetic */ fmx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eze(isn isnVar, fbh fbhVar, fmx fmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = isnVar;
        this.b = fbhVar;
        this.c = fmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eze) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.d;
        fdjz fdjzVar = fdjz.d;
        isn isnVar = this.a;
        fdil.d(fdjxVar, null, fdjzVar, new ezb(isnVar, this.b, null), 1);
        fdil.d(fdjxVar, null, fdjzVar, new ezd(isnVar, this.c, null), 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        eze ezeVar = new eze(this.a, this.b, this.c, fcxyVar);
        ezeVar.d = obj;
        return ezeVar;
    }
}
