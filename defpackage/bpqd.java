package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpqd {
    public final bpqe a;
    public final bpqe b;
    public final bpqe c;
    public final bpqe d;
    public final bpqe e;
    public final bpqe f;
    public final bpqe g;
    public final bpqe h;
    public final bpqe i;
    public final bpqe j;
    public final bpqe k;
    final bpqe[] l;

    public bpqd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "generic_worker_queue._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bppj
        };
        bpqe bpqeVar = new bpqe(dqprVarM.a());
        this.a = bpqeVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqogVar2.a = "generic_worker_queue.worker_type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bppm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bppn
        };
        bpqe bpqeVar2 = new bpqe(dqprVarM2.a());
        this.b = bpqeVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "generic_worker_queue.item_table_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bppo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bppp
        };
        bpqe bpqeVar3 = new bpqe(dqprVarM3.a());
        this.c = bpqeVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "generic_worker_queue.item_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bppq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bppr
        };
        bpqe bpqeVar4 = new bpqe(dqprVarM4.a());
        this.d = bpqeVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "generic_worker_queue.account_id";
        dqprVarM5.i(39020);
        dqogVar5.d = new Supplier() { // from class: bppt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bppu
        };
        bpqe bpqeVar5 = new bpqe(dqprVarM5.a());
        this.e = bpqeVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqprVarM6.d(true);
        dqogVar6.a = "generic_worker_queue.in_flight";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bpps
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bppv
        };
        bpqe bpqeVar6 = new bpqe(dqprVarM6.a());
        this.f = bpqeVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "generic_worker_queue.retry_count";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bppw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bppx
        };
        bpqe bpqeVar7 = new bpqe(dqprVarM7.a());
        this.g = bpqeVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqogVar8.a = "generic_worker_queue.flags";
        dqprVarM8.i(32000);
        dqogVar8.d = new Supplier() { // from class: bppy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bppz
        };
        bpqe bpqeVar8 = new bpqe(dqprVarM8.a());
        this.h = bpqeVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 2;
        dqprVarM9.d(true);
        dqogVar9.a = "generic_worker_queue.next_execute_timestamp";
        dqprVarM9.i(34000);
        dqogVar9.d = new Supplier() { // from class: bpqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bpqb
        };
        bpqe bpqeVar9 = new bpqe(dqprVarM9.a());
        this.i = bpqeVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqogVar10.a = "generic_worker_queue.trigger_name";
        dqprVarM10.i(59700);
        dqogVar10.d = new Supplier() { // from class: bpqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: bppi
        };
        bpqe bpqeVar10 = new bpqe(dqprVarM10.a());
        this.j = bpqeVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 2;
        dqogVar11.a = "generic_worker_queue.enqueued_timestamp";
        dqprVarM11.i(59970);
        dqogVar11.d = new Supplier() { // from class: bppk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bprf.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: bppl
        };
        bpqe bpqeVar11 = new bpqe(dqprVarM11.a());
        this.k = bpqeVar11;
        this.l = new bpqe[]{bpqeVar, bpqeVar2, bpqeVar3, bpqeVar4, bpqeVar5, bpqeVar6, bpqeVar7, bpqeVar8, bpqeVar9, bpqeVar10, bpqeVar11};
    }
}
