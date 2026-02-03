package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbye extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ enba b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbye(fcxy fcxyVar, cbyh cbyhVar, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbye) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.o(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbye cbyeVar = new cbye(fcxyVar, this.a, this.b);
        cbyeVar.c = obj;
        return cbyeVar;
    }
}
