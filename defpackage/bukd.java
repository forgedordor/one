package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bukd {
    public final buke a;
    public final buke b;
    public final buke c;
    final buke[] d;

    public bukd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "supersort_labels._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bujx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bukt.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bujy
        };
        buke bukeVar = new buke(dqprVarM.a());
        this.a = bukeVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "supersort_labels.name";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bujz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bukt.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: buka
        };
        buke bukeVar2 = new buke(dqprVarM2.a());
        this.b = bukeVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "supersort_labels.status";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bukb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bukt.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bukc
        };
        buke bukeVar3 = new buke(dqprVarM3.a());
        this.c = bukeVar3;
        this.d = new buke[]{bukeVar, bukeVar2, bukeVar3};
    }
}
