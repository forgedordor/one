package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awtc {
    public final awtd a;
    public final awtd b;
    public final awtd c;
    final awtd[] d;

    public awtc() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: awsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return axer.c.b;
            }
        };
        dqogVar.a = "active_sims.sim_serial_number";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: awsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return awtp.a();
            }
        };
        dqogVar.c = new dqps() { // from class: awsw
        };
        awtd awtdVar = new awtd(dqprVarM.a());
        this.a = awtdVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: awsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return axer.c.a;
            }
        };
        dqogVar2.a = "active_sims.active_sub_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: awsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awtp.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: awsz
        };
        awtd awtdVar2 = new awtd(dqprVarM2.a());
        this.b = awtdVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "active_sims.sim_slot_index";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: awta
            @Override // java.util.function.Supplier
            public final Object get() {
                return awtp.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: awtb
        };
        awtd awtdVar3 = new awtd(dqprVarM3.a());
        this.c = awtdVar3;
        this.d = new awtd[]{awtdVar, awtdVar2, awtdVar3};
    }
}
