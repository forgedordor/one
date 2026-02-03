package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqgt implements eqgk {
    private final eqeq a;
    private final String b;

    public eqgt(eqeq eqeqVar, String str) {
        eqeqVar.getClass();
        this.a = eqeqVar;
        this.b = str;
    }

    static /* synthetic */ exzo d(eqgt eqgtVar, int i) {
        return eqgtVar.e(i, null);
    }

    private final exzo e(int i, eqcx eqcxVar) {
        exzn exznVar = (exzn) exzo.a.createBuilder();
        exznVar.getClass();
        exzc.c(this.b, exznVar);
        exzp exzpVar = (exzp) exzr.a.createBuilder();
        exzpVar.getClass();
        exzv.c(this.a.a, exzpVar);
        exzv.f(i, exzpVar);
        if (eqcxVar != null) {
            exzv.e(eqhr.q(eqcxVar), exzpVar);
        }
        exzc.d(exzv.a(exzpVar), exznVar);
        return exzc.a(exznVar);
    }

    @Override // defpackage.eqgk
    public final exzo a(eqcx eqcxVar) {
        return e(9, eqcxVar);
    }

    @Override // defpackage.eqgk
    public final exzo b() {
        throw null;
    }

    @Override // defpackage.eqgk
    public final exzo c() {
        return d(this, 8);
    }
}
