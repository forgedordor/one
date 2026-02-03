package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aodu extends fcyz implements fdat {
    final /* synthetic */ ajna a;
    final /* synthetic */ aodw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aodu(ajna ajnaVar, aodw aodwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ajnaVar;
        this.b = aodwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aodu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        aodw aodwVar = this.b;
        if (aodwVar.C().isEmpty()) {
            return false;
        }
        cqey cqeyVar = (cqey) aodwVar.d.a();
        Integer numB = aodwVar.B();
        cqgk cqgkVarD = cqeyVar.d(true != this.a.g ? 0 : 3, numB != null ? numB.intValue() : ((Number) fcva.M(aodwVar.C())).intValue());
        cqgkVarD.getClass();
        return Boolean.valueOf(cqgkVarD == cqgk.AVAILABLE);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aodu(this.a, this.b, fcxyVar);
    }
}
