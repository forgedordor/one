package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfmu extends fcyz implements fdat {
    public cfmu(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new cfmu((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        epct epctVar = (epct) epcu.a.createBuilder();
        epctVar.getClass();
        evsn evsnVarBuild = epctVar.build();
        evsnVarBuild.getClass();
        return (epcu) evsnVarBuild;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfmu(fcxyVar);
    }
}
