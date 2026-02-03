package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atkn extends fcyz implements fdat {
    final /* synthetic */ athh a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atkn(fcxy fcxyVar, athh athhVar) {
        super(2, fcxyVar);
        this.a = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atkn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = atmx.a;
        atmn atmnVar = new atmn();
        atmnVar.b = new atmv((atmw) new atkp(this.a).apply(new atmw()));
        final atmv atmvVar = (atmv) atmnVar.b().b;
        return (ekgb) atmx.b().p("file_processing-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: atlb
            @Override // defpackage.ejxr
            public final Object get() {
                atms atmsVarA = atmx.a();
                atmv atmvVar2 = atmvVar;
                atmsVarA.k(atmvVar2);
                atmsVarA.A("file_processing-deleteAndReturnDeletedRows-query");
                ekgb ekgbVarZ = atmsVarA.b().z();
                atmn atmnVar2 = new atmn();
                atmnVar2.b = atmvVar2;
                atmnVar2.f("file_processing-deleteAndReturnDeletedRows-delete");
                atmnVar2.b().b();
                return ekgbVarZ;
            }
        });
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atkn atknVar = new atkn(fcxyVar, this.a);
        atknVar.b = obj;
        return atknVar;
    }
}
