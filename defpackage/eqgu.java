package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqgu implements eqgk {
    private final String a;
    private final int b;

    public eqgu(int i, String str) {
        this.b = i;
        this.a = str;
    }

    static /* synthetic */ exzo d(eqgu eqguVar, int i) {
        return eqguVar.e(i, null);
    }

    private final exzo e(int i, eqcx eqcxVar) {
        exzn exznVar = (exzn) exzo.a.createBuilder();
        exznVar.getClass();
        exzc.c(this.a, exznVar);
        exzs exzsVar = (exzs) exzu.a.createBuilder();
        exzsVar.getClass();
        exzsVar.copyOnWrite();
        ((exzu) exzsVar.instance).c = this.b - 2;
        exzsVar.copyOnWrite();
        ((exzu) exzsVar.instance).d = exzh.a(3);
        exzsVar.copyOnWrite();
        ((exzu) exzsVar.instance).e = exzi.a(i);
        if (eqcxVar != null) {
            exzm exzmVarQ = eqhr.q(eqcxVar);
            exzsVar.copyOnWrite();
            exzu exzuVar = (exzu) exzsVar.instance;
            exzuVar.f = exzmVarQ;
            exzuVar.b |= 1;
        }
        evsn evsnVarBuild = exzsVar.build();
        evsnVarBuild.getClass();
        exznVar.copyOnWrite();
        exzo exzoVar = (exzo) exznVar.instance;
        exzoVar.d = (exzu) evsnVarBuild;
        exzoVar.c = 3;
        return exzc.a(exznVar);
    }

    @Override // defpackage.eqgk
    public final exzo a(eqcx eqcxVar) {
        return e(4, eqcxVar);
    }

    @Override // defpackage.eqgk
    public final exzo b() {
        return d(this, 5);
    }

    @Override // defpackage.eqgk
    public final exzo c() {
        return d(this, 3);
    }
}
