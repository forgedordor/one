package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvi {
    public final btvj a;
    public final btvj b;
    public final btvj c;
    public final btvj d;
    final btvj[] e;

    public btvi() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.d(true);
        dqogVar.a = "restore_workflow_scratch_timestamps.which_database";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btva
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvz.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btvb
        };
        btvj btvjVar = new btvj(dqprVarM.a());
        this.a = btvjVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "restore_workflow_scratch_timestamps.message_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvz.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btvd
        };
        btvj btvjVar2 = new btvj(dqprVarM2.a());
        this.b = btvjVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqogVar3.a = "restore_workflow_scratch_timestamps.timestamp_in_seconds";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btve
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvz.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: btvf
        };
        btvj btvjVar3 = new btvj(dqprVarM3.a());
        this.c = btvjVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "restore_workflow_scratch_timestamps.timestamp_mod_1000";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: btvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvz.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: btvh
        };
        btvj btvjVar4 = new btvj(dqprVarM4.a());
        this.d = btvjVar4;
        this.e = new btvj[]{btvjVar, btvjVar2, btvjVar3, btvjVar4};
    }
}
