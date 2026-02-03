package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpjg {
    public final bpjh a;
    public final bpjh b;
    public final bpjh c;
    public final bpjh d;
    final bpjh[] e;

    public bpjg() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "events._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpiy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpjz.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bpiz
        };
        bpjh bpjhVar = new bpjh(dqprVarM.a());
        this.a = bpjhVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "events.timestamp";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpja
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpjz.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpjb
        };
        bpjh bpjhVar2 = new bpjh(dqprVarM2.a());
        this.b = bpjhVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "events.event";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bpjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpjz.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bpjd
        };
        bpjh bpjhVar3 = new bpjh(dqprVarM3.a());
        this.c = bpjhVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "events.data";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bpje
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpjz.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bpjf
        };
        bpjh bpjhVar4 = new bpjh(dqprVarM4.a());
        this.d = bpjhVar4;
        this.e = new bpjh[]{bpjhVar, bpjhVar2, bpjhVar3, bpjhVar4};
    }
}
