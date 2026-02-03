package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbir {
    public final cbis a;
    public final cbis b;
    public final cbis c;
    public final cbis d;
    public final cbis e;
    public final cbis f;
    public final cbis g;
    public final cbis h;
    public final cbis i;
    final cbis[] j;

    public cbir() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "work_queue_work_manager_ids.queue";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: cbhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar.c = new dqps() { // from class: cbiq
        };
        cbis cbisVar = new cbis(dqprVarM.a());
        this.a = cbisVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "work_queue_work_manager_ids.workmanager_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: cbia
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: cbib
        };
        cbis cbisVar2 = new cbis(dqprVarM2.a());
        this.b = cbisVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "work_queue_work_manager_ids.scheduled_at_time";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: cbic
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: cbid
        };
        cbis cbisVar3 = new cbis(dqprVarM3.a());
        this.c = cbisVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "work_queue_work_manager_ids.minimum_start_time";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: cbie
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: cbif
        };
        cbis cbisVar4 = new cbis(dqprVarM4.a());
        this.d = cbisVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "work_queue_work_manager_ids.requires_network_type";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: cbig
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: cbih
        };
        cbis cbisVar5 = new cbis(dqprVarM5.a());
        this.e = cbisVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "work_queue_work_manager_ids.requires_charging";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: cbii
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: cbij
        };
        cbis cbisVar6 = new cbis(dqprVarM6.a());
        this.f = cbisVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "work_queue_work_manager_ids.requires_device_idle";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: cbik
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: cbil
        };
        cbis cbisVar7 = new cbis(dqprVarM7.a());
        this.g = cbisVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqogVar8.a = "work_queue_work_manager_ids.requires_battery_not_low";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: cbim
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: cbin
        };
        cbis cbisVar8 = new cbis(dqprVarM8.a());
        this.h = cbisVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 2;
        dqogVar9.a = "work_queue_work_manager_ids.requires_storage_not_low";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: cbio
            @Override // java.util.function.Supplier
            public final Object get() {
                return cbjq.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: cbip
        };
        cbis cbisVar9 = new cbis(dqprVarM9.a());
        this.i = cbisVar9;
        this.j = new cbis[]{cbisVar, cbisVar2, cbisVar3, cbisVar4, cbisVar5, cbisVar6, cbisVar7, cbisVar8, cbisVar9};
    }
}
