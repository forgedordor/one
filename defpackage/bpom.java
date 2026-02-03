package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpom {
    public final bpon a;
    public final bpon b;
    final bpon[] c;

    public bpom() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bpoh
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "gemini.conversation_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpoz.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bpoj
        };
        bpon bponVar = new bpon(dqprVarM.a());
        this.a = bponVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "gemini.desired_gemini_state";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpoz.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpol
        };
        bpon bponVar2 = new bpon(dqprVarM2.a());
        this.b = bponVar2;
        this.c = new bpon[]{bponVar, bponVar2};
    }
}
