package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpsr {
    public final bpss a;
    public final bpss b;
    public final bpss c;
    public final bpss d;
    public final bpss e;
    public final bpss f;
    public final bpss g;
    public final bpss h;
    public final bpss i;
    final bpss[] j;

    public bpsr() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "lighter_conversations_table._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpry
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bprz
        };
        bpss bpssVar = new bpss(dqprVarM.a());
        this.a = bpssVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bpsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "lighter_conversations_table.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpsc
        };
        bpss bpssVar2 = new bpss(dqprVarM2.a());
        this.b = bpssVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.l(true);
        dqprVarM3.d(true);
        dqogVar3.a = "lighter_conversations_table.business_id";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bpsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bpse
        };
        bpss bpssVar3 = new bpss(dqprVarM3.a());
        this.c = bpssVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "lighter_conversations_table.lighter_conversation_id_json";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bpsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bpsg
        };
        bpss bpssVar4 = new bpss(dqprVarM4.a());
        this.d = bpssVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.d(true);
        dqogVar5.a = "lighter_conversations_table.read";
        dqprVarM5.i(58700);
        dqogVar5.d = new Supplier() { // from class: bpsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bpsi
        };
        bpss bpssVar5 = new bpss(dqprVarM5.a());
        this.e = bpssVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "lighter_conversations_table.is_last_message_outgoing";
        dqprVarM6.i(58810);
        dqogVar6.d = new Supplier() { // from class: bpsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bpsk
        };
        bpss bpssVar6 = new bpss(dqprVarM6.a());
        this.f = bpssVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "lighter_conversations_table.conversation_status";
        dqprVarM7.i(59030);
        dqogVar7.d = new Supplier() { // from class: bpsl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bpsm
        };
        bpss bpssVar7 = new bpss(dqprVarM7.a());
        this.g = bpssVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqogVar8.a = "lighter_conversations_table.last_action_timestamp";
        dqprVarM8.i(59040);
        dqogVar8.d = new Supplier() { // from class: bpsn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bpso
        };
        bpss bpssVar8 = new bpss(dqprVarM8.a());
        this.h = bpssVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqogVar9.a = "lighter_conversations_table.sync_timestamp_ms";
        dqprVarM9.i(59100);
        dqogVar9.d = new Supplier() { // from class: bpsp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bpto.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bpsq
        };
        bpss bpssVar9 = new bpss(dqprVarM9.a());
        this.i = bpssVar9;
        this.j = new bpss[]{bpssVar, bpssVar2, bpssVar3, bpssVar4, bpssVar5, bpssVar6, bpssVar7, bpssVar8, bpssVar9};
    }
}
