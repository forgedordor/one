package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brik {
    public final bril a;
    public final bril b;
    final bril[] c;

    public brik() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "smarts_personalization_normalized_feature_values.date";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: brig
            @Override // java.util.function.Supplier
            public final Object get() {
                return briz.a();
            }
        };
        dqogVar.c = new dqps() { // from class: brih
        };
        bril brilVar = new bril(dqprVarM.a());
        this.a = brilVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 5;
        dqogVar2.a = "smarts_personalization_normalized_feature_values.features";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: brii
            @Override // java.util.function.Supplier
            public final Object get() {
                return briz.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: brij
        };
        bril brilVar2 = new bril(dqprVarM2.a());
        this.b = brilVar2;
        this.c = new bril[]{brilVar, brilVar2};
    }
}
