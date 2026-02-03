package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccln {
    public final cclo a;
    public final cclo b;
    public final cclo c;
    public final cclo d;
    public final cclo e;
    public final cclo f;
    final cclo[] g;

    public ccln() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "mls_processed_results.self_identity";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: cclb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccmf.a();
            }
        };
        dqogVar.c = new dqps() { // from class: cclg
        };
        cclo ccloVar = new cclo(dqprVarM.a());
        this.a = ccloVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "mls_processed_results.rcs_message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: cclh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccmf.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: ccli
        };
        cclo ccloVar2 = new cclo(dqprVarM2.a());
        this.b = ccloVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.l(true);
        dqprVarM3.k(true);
        dqprVarM3.g(true);
        dqprVarM3.d(true);
        dqogVar3.a = "mls_processed_results.remote_user_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: cclj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccmf.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: cclk
        };
        cclo ccloVar3 = new cclo(dqprVarM3.a());
        this.c = ccloVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqprVarM4.k(true);
        dqogVar4.a = "mls_processed_results.raw_content";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: ccll
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccmf.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: cclm
        };
        cclo ccloVar4 = new cclo(dqprVarM4.a());
        this.d = ccloVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.k(true);
        dqogVar5.a = "mls_processed_results.stage";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: cclc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccmf.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: ccld
        };
        cclo ccloVar5 = new cclo(dqprVarM5.a());
        this.e = ccloVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqprVarM6.k(true);
        dqprVarM6.d(true);
        dqogVar6.a = "mls_processed_results.sort_timestamp";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: ccle
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccmf.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: cclf
        };
        cclo ccloVar6 = new cclo(dqprVarM6.a());
        this.f = ccloVar6;
        this.g = new cclo[]{ccloVar, ccloVar2, ccloVar3, ccloVar4, ccloVar5, ccloVar6};
    }
}
