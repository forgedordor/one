package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phv extends fcyz implements fdat {
    final /* synthetic */ fdap a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phv(fcxy fcxyVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.a = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((phv) c((phc) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        phc phcVar = (phc) this.b;
        phcVar.getClass();
        return this.a.invoke(phcVar.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        phv phvVar = new phv(fcxyVar, this.a);
        phvVar.b = obj;
        return phvVar;
    }
}
