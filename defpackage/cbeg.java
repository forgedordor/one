package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbeg {
    public final cbeh a;
    public final cbeh b;
    public final cbeh c;
    public final cbeh d;
    public final cbeh e;
    public final cbeh f;
    public final cbeh g;
    public final cbeh h;
    public final cbeh i;
    public final cbeh j;
    public final cbeh k;
    final cbeh[] l;

    public cbeg() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "work_queue._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: cbdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar.c = new dqps() { // from class: cbdm
        };
        cbeh cbehVar = new cbeh(dqprVarM.a());
        this.a = cbehVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "work_queue.type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: cbdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: cbdq
        };
        cbeh cbehVar2 = new cbeh(dqprVarM2.a());
        this.b = cbehVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqprVarM3.k(true);
        dqogVar3.a = "work_queue.rawdata";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: cbdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: cbds
        };
        cbeh cbehVar3 = new cbeh(dqprVarM3.a());
        this.c = cbehVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "work_queue.attempts";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: cbdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: cbdu
        };
        cbeh cbehVar4 = new cbeh(dqprVarM4.a());
        this.d = cbehVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "work_queue.timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: cbdw
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: cbdx
        };
        cbeh cbehVar5 = new cbeh(dqprVarM5.a());
        this.e = cbehVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqogVar6.a = "work_queue.queue";
        dqprVarM6.i(41030);
        dqogVar6.d = new Supplier() { // from class: cbdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: cbdy
        };
        cbeh cbehVar6 = new cbeh(dqprVarM6.a());
        this.f = cbehVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqprVarM7.d(true);
        dqogVar7.a = "work_queue.deduplication_tag";
        dqprVarM7.i(42050);
        dqogVar7.d = new Supplier() { // from class: cbdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: cbea
        };
        cbeh cbehVar7 = new cbeh(dqprVarM7.a());
        this.g = cbehVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqprVarM8.d(true);
        dqogVar8.a = "work_queue.scheduled_in_workmanager";
        dqprVarM8.i(45030);
        dqogVar8.d = new Supplier() { // from class: cbeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: cbec
        };
        cbeh cbehVar8 = new cbeh(dqprVarM8.a());
        this.h = cbehVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqogVar9.a = "work_queue.workmanager_id";
        dqprVarM9.i(46060);
        dqogVar9.d = new Supplier() { // from class: cbed
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: cbee
        };
        cbeh cbehVar9 = new cbeh(dqprVarM9.a());
        this.i = cbehVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "work_queue.minimum_start_time";
        dqprVarM10.i(46070);
        dqogVar10.d = new Supplier() { // from class: cbef
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: cbdl
        };
        cbeh cbehVar10 = new cbeh(dqprVarM10.a());
        this.j = cbehVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 4;
        dqogVar11.a = "work_queue.cancellation_tag";
        dqprVarM11.i(48020);
        dqogVar11.d = new Supplier() { // from class: cbdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbfi.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: cbdo
        };
        cbeh cbehVar11 = new cbeh(dqprVarM11.a());
        this.k = cbehVar11;
        this.l = new cbeh[]{cbehVar, cbehVar2, cbehVar3, cbehVar4, cbehVar5, cbehVar6, cbehVar7, cbehVar8, cbehVar9, cbehVar10, cbehVar11};
    }
}
