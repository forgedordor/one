package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmpw {
    public final bmpx a;
    public final bmpx b;
    public final bmpx c;
    public final bmpx d;
    public final bmpx e;
    public final bmpx f;
    public final bmpx g;
    public final bmpx h;
    public final bmpx i;
    public final bmpx j;
    public final bmpx k;
    final bmpx[] l;

    public bmpw() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_dead_letter_queue._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bmpc
        };
        bmpx bmpxVar = new bmpx(dqprVarM.a());
        this.a = bmpxVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "cms_dead_letter_queue.cms_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmpg
        };
        bmpx bmpxVar2 = new bmpx(dqprVarM2.a());
        this.b = bmpxVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "cms_dead_letter_queue.cms_data_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmph
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmpi
        };
        bmpx bmpxVar3 = new bmpx(dqprVarM3.a());
        this.c = bmpxVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.d(true);
        dqogVar4.a = "cms_dead_letter_queue.abandoned_action";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmpk
        };
        bmpx bmpxVar4 = new bmpx(dqprVarM4.a());
        this.d = bmpxVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "cms_dead_letter_queue.failure_reason";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bmpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmpn
        };
        bmpx bmpxVar5 = new bmpx(dqprVarM5.a());
        this.e = bmpxVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "cms_dead_letter_queue.bugle_table_type";
        dqprVarM6.i(57090);
        dqogVar6.d = new Supplier() { // from class: bmpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bmpo
        };
        bmpx bmpxVar6 = new bmpx(dqprVarM6.a());
        this.f = bmpxVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqprVarM7.d(true);
        dqogVar7.a = "cms_dead_letter_queue.bugle_id";
        dqprVarM7.i(57090);
        dqogVar7.d = new Supplier() { // from class: bmpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bmpq
        };
        bmpx bmpxVar7 = new bmpx(dqprVarM7.a());
        this.g = bmpxVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 5;
        dqogVar8.a = "cms_dead_letter_queue.cms_backup_parameters";
        dqprVarM8.i(57090);
        dqogVar8.d = new Supplier() { // from class: bmpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bmps
        };
        bmpx bmpxVar8 = new bmpx(dqprVarM8.a());
        this.h = bmpxVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 2;
        dqogVar9.a = "cms_dead_letter_queue.backup_flags";
        dqprVarM9.i(57090);
        dqogVar9.d = new Supplier() { // from class: bmpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bmpu
        };
        bmpx bmpxVar9 = new bmpx(dqprVarM9.a());
        this.i = bmpxVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 2;
        dqogVar10.a = "cms_dead_letter_queue.backup_dependency_table_type";
        dqprVarM10.i(57090);
        dqogVar10.d = new Supplier() { // from class: bmpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: bmpb
        };
        bmpx bmpxVar10 = new bmpx(dqprVarM10.a());
        this.j = bmpxVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 2;
        dqogVar11.a = "cms_dead_letter_queue.backup_dependency_bugle_id";
        dqprVarM11.i(57090);
        dqogVar11.d = new Supplier() { // from class: bmpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmqy.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: bmpe
        };
        bmpx bmpxVar11 = new bmpx(dqprVarM11.a());
        this.k = bmpxVar11;
        this.l = new bmpx[]{bmpxVar, bmpxVar2, bmpxVar3, bmpxVar4, bmpxVar5, bmpxVar6, bmpxVar7, bmpxVar8, bmpxVar9, bmpxVar10, bmpxVar11};
    }
}
