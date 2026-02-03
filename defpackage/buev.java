package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buev {
    public final buew a;
    public final buew b;
    public final buew c;
    final buew[] d;

    public buev() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bueo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bugy.b.b;
            }
        };
        dqogVar.a = "sticker_sets_localization.sticker_set_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: buep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bufg.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bueq
        };
        buew buewVar = new buew(dqprVarM.a());
        this.a = buewVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "sticker_sets_localization.locale";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: buer
            @Override // java.util.function.Supplier
            public final Object get() {
                return bufg.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bues
        };
        buew buewVar2 = new buew(dqprVarM2.a());
        this.b = buewVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "sticker_sets_localization.display_name";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: buet
            @Override // java.util.function.Supplier
            public final Object get() {
                return bufg.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bueu
        };
        buew buewVar3 = new buew(dqprVarM3.a());
        this.c = buewVar3;
        this.d = new buew[]{buewVar, buewVar2, buewVar3};
    }
}
