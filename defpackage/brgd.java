package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brgd {
    public final brge a;
    public final brge b;
    public final brge c;
    final brge[] d;

    public brgd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: brfw
            @Override // java.util.function.Supplier
            public final Object get() {
                return brhv.b.a;
            }
        };
        dqogVar.a = "smarts_personalization_decayed_feature_values.feature_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: brfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return brgt.a();
            }
        };
        dqogVar.c = new dqps() { // from class: brfy
        };
        brge brgeVar = new brge(dqprVarM.a());
        this.a = brgeVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "smarts_personalization_decayed_feature_values.date";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: brfz
            @Override // java.util.function.Supplier
            public final Object get() {
                return brgt.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: brga
        };
        brge brgeVar2 = new brge(dqprVarM2.a());
        this.b = brgeVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 3;
        dqogVar3.a = "smarts_personalization_decayed_feature_values.feature_value";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: brgb
            @Override // java.util.function.Supplier
            public final Object get() {
                return brgt.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: brgc
        };
        brge brgeVar3 = new brge(dqprVarM3.a());
        this.c = brgeVar3;
        this.d = new brge[]{brgeVar, brgeVar2, brgeVar3};
    }
}
