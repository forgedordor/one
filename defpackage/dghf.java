package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghf extends fcyz implements fdat {
    final /* synthetic */ dghi a;
    final /* synthetic */ dgiq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghf(fcxy fcxyVar, dghi dghiVar, dgiq dgiqVar) {
        super(2, fcxyVar);
        this.a = dghiVar;
        this.b = dgiqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fdct.b(((dgio) this.a.e.b()).a(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghf dghfVar = new dghf(fcxyVar, this.a, this.b);
        dghfVar.c = obj;
        return dghfVar;
    }
}
