package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doei implements fdat {
    final /* synthetic */ doem a;

    public doei(doem doemVar) {
        this.a = doemVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dofk, java.lang.Object] */
    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            doem doemVar = this.a;
            doemVar.p().isPresent();
            ?? r0 = doemVar.p().get();
            dodm dodmVarF = doem.f(doemVar);
            dodmVarF.getClass();
            r0.a(dodmVarF, hmlVar, 8);
        }
        return fctx.a;
    }
}
