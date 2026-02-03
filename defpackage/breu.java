package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class breu {
    public final brev a;
    public final brev b;
    public final brev c;
    public final brev d;
    public final brev e;
    public final brev f;
    final brev[] g;

    public breu() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "modified_by._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: brei
            @Override // java.util.function.Supplier
            public final Object get() {
                return brfk.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bren
        };
        brev brevVar = new brev(dqprVarM.a());
        this.a = brevVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "modified_by.am_version_code";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: breo
            @Override // java.util.function.Supplier
            public final Object get() {
                return brfk.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: brep
        };
        brev brevVar2 = new brev(dqprVarM2.a());
        this.b = brevVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqogVar3.a = "modified_by.stack_trace_hash";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: breq
            @Override // java.util.function.Supplier
            public final Object get() {
                return brfk.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: brer
        };
        brev brevVar3 = new brev(dqprVarM3.a());
        this.c = brevVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.k(true);
        dqogVar4.a = "modified_by.source";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bres
            @Override // java.util.function.Supplier
            public final Object get() {
                return brfk.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bret
        };
        brev brevVar4 = new brev(dqprVarM4.a());
        this.d = brevVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "modified_by.tiktok_trace";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: brej
            @Override // java.util.function.Supplier
            public final Object get() {
                return brfk.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: brek
        };
        brev brevVar5 = new brev(dqprVarM5.a());
        this.e = brevVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "modified_by.stack_trace";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: brel
            @Override // java.util.function.Supplier
            public final Object get() {
                return brfk.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: brem
        };
        brev brevVar6 = new brev(dqprVarM6.a());
        this.f = brevVar6;
        this.g = new brev[]{brevVar, brevVar2, brevVar3, brevVar4, brevVar5, brevVar6};
    }
}
