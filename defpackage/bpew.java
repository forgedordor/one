package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpew {
    public final bpex a;
    public final bpex b;
    public final bpex c;
    public final bpex d;
    public final bpex e;
    final bpex[] f;

    public bpew() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "emergency_sessions.emergency_destination";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpfo.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bpen
        };
        bpex bpexVar = new bpex(dqprVarM.a());
        this.a = bpexVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "emergency_sessions.type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpfo.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpep
        };
        bpex bpexVar2 = new bpex(dqprVarM2.a());
        this.b = bpexVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "emergency_sessions.start_timestamp";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bpeq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpfo.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bper
        };
        bpex bpexVar3 = new bpex(dqprVarM3.a());
        this.c = bpexVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqogVar4.a = "emergency_sessions.end_timestamp";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bpes
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpfo.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bpet
        };
        bpex bpexVar4 = new bpex(dqprVarM4.a());
        this.d = bpexVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.k(true);
        dqogVar5.a = "emergency_sessions.refill_duration_ms";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bpeu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpfo.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bpev
        };
        bpex bpexVar5 = new bpex(dqprVarM5.a());
        this.e = bpexVar5;
        this.f = new bpex[]{bpexVar, bpexVar2, bpexVar3, bpexVar4, bpexVar5};
    }
}
