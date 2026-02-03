package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brhh {
    public final brhi a;
    public final brhi b;
    public final brhi c;
    final brhi[] d;

    public brhh() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "smarts_personalization_features.feature_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: brhb
            @Override // java.util.function.Supplier
            public final Object get() {
                return brhv.b();
            }
        };
        dqogVar.c = new dqps() { // from class: brhc
        };
        brhi brhiVar = new brhi(dqprVarM.a());
        this.a = brhiVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqogVar2.a = "smarts_personalization_features.feature";
        dqprVarM2.f(true);
        dqprVarM2.i(54060);
        dqogVar2.d = new Supplier() { // from class: brhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return brhv.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: brhe
        };
        brhi brhiVar2 = new brhi(dqprVarM2.a());
        this.b = brhiVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "smarts_personalization_features.start_date";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: brhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return brhv.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: brhg
        };
        brhi brhiVar3 = new brhi(dqprVarM3.a());
        this.c = brhiVar3;
        this.d = new brhi[]{brhiVar, brhiVar2, brhiVar3};
    }
}
