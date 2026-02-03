package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsqh {
    public final bsqi a;
    public final bsqi b;
    public final bsqi c;
    public final bsqi d;
    public final bsqi e;
    public final bsqi f;
    public final bsqi g;
    public final bsqi h;
    public final bsqi i;
    final bsqi[] j;

    public bsqh() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "pipeline_work.work_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bspp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bsqg
        };
        bsqi bsqiVar = new bsqi(dqprVarM.a());
        this.a = bsqiVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqogVar2.a = "pipeline_work.pipeline_type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bspq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bspr
        };
        bsqi bsqiVar2 = new bsqi(dqprVarM2.a());
        this.b = bsqiVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "pipeline_work.sequencing_key";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bsps
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bspt
        };
        bsqi bsqiVar3 = new bsqi(dqprVarM3.a());
        this.c = bsqiVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqogVar4.a = "pipeline_work.insertion_timestamp";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bspu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bspv
        };
        bsqi bsqiVar4 = new bsqi(dqprVarM4.a());
        this.d = bsqiVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.k(true);
        dqogVar5.a = "pipeline_work.execution_attempt_count";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bspw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bspx
        };
        bsqi bsqiVar5 = new bsqi(dqprVarM5.a());
        this.e = bsqiVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqprVarM6.k(true);
        dqogVar6.a = "pipeline_work.execution_state";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bspy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bspz
        };
        bsqi bsqiVar6 = new bsqi(dqprVarM6.a());
        this.f = bsqiVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "pipeline_work.client_supplied_id";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bsqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bsqb
        };
        bsqi bsqiVar7 = new bsqi(dqprVarM7.a());
        this.g = bsqiVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 5;
        dqogVar8.a = "pipeline_work.payload";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bsqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bsqd
        };
        bsqi bsqiVar8 = new bsqi(dqprVarM8.a());
        this.h = bsqiVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 2;
        dqogVar9.a = "pipeline_work.execute_after_timestamp";
        dqprVarM9.i(60840);
        dqogVar9.d = new Supplier() { // from class: bsqe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsrg.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bsqf
        };
        bsqi bsqiVar9 = new bsqi(dqprVarM9.a());
        this.i = bsqiVar9;
        this.j = new bsqi[]{bsqiVar, bsqiVar2, bsqiVar3, bsqiVar4, bsqiVar5, bsqiVar6, bsqiVar7, bsqiVar8, bsqiVar9};
    }
}
