package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngd {
    public final bnge a;
    public final bnge b;
    public final bnge c;
    public final bnge d;
    public final bnge e;
    public final bnge f;
    public final bnge g;
    final bnge[] h;

    public bngd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_classifications_table._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bnfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bngz.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bnfz
        };
        bnge bngeVar = new bnge(dqprVarM.a());
        this.a = bngeVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bnga
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "conversation_classifications_table.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bngb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bngz.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bngc
        };
        bnge bngeVar2 = new bnge(dqprVarM2.a());
        this.b = bngeVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqogVar3.a = "conversation_classifications_table.classification_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bnfp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bngz.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bnfq
        };
        bnge bngeVar3 = new bnge(dqprVarM3.a());
        this.c = bngeVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqogVar4.a = "conversation_classifications_table.classification_state";
        dqprVarM4.i(58690);
        dqogVar4.d = new Supplier() { // from class: bnfr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bngz.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bnfs
        };
        bnge bngeVar4 = new bnge(dqprVarM4.a());
        this.d = bngeVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqprVarM5.d(true);
        dqogVar5.a = "conversation_classifications_table.date";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bnft
            @Override // java.util.function.Supplier
            public final Object get() {
                return bngz.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bnfu
        };
        bnge bngeVar5 = new bnge(dqprVarM5.a());
        this.e = bngeVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "conversation_classifications_table.impression_count";
        dqprVarM6.i(58840);
        dqogVar6.d = new Supplier() { // from class: bnfv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bngz.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bnfw
        };
        bnge bngeVar6 = new bnge(dqprVarM6.a());
        this.f = bngeVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "conversation_classifications_table.generated_timestamp";
        dqprVarM7.i(58840);
        dqogVar7.d = new Supplier() { // from class: bnfx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bngz.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bnfy
        };
        bnge bngeVar7 = new bnge(dqprVarM7.a());
        this.g = bngeVar7;
        this.h = new bnge[]{bngeVar, bngeVar2, bngeVar3, bngeVar4, bngeVar5, bngeVar6, bngeVar7};
    }
}
