package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmtj {
    public final bmtk a;
    public final bmtk b;
    public final bmtk c;
    public final bmtk d;
    public final bmtk e;
    public final bmtk f;
    public final bmtk g;
    final bmtk[] h;

    public bmtj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_incremental_events._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmua.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmte
        };
        bmtk bmtkVar = new bmtk(dqprVarM.a());
        this.a = bmtkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "cms_incremental_events.table_type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmtf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmua.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmtg
        };
        bmtk bmtkVar2 = new bmtk(dqprVarM2.a());
        this.b = bmtkVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "cms_incremental_events.operation";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmth
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmua.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmti
        };
        bmtk bmtkVar3 = new bmtk(dqprVarM3.a());
        this.c = bmtkVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.k(true);
        dqogVar4.a = "cms_incremental_events.bugle_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmua.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmsx
        };
        bmtk bmtkVar4 = new bmtk(dqprVarM4.a());
        this.d = bmtkVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "cms_incremental_events.attempt_count";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bmsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmua.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmsz
        };
        bmtk bmtkVar5 = new bmtk(dqprVarM5.a());
        this.e = bmtkVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "cms_incremental_events.create_timestamp";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bmta
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmua.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bmtb
        };
        bmtk bmtkVar6 = new bmtk(dqprVarM6.a());
        this.f = bmtkVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "cms_incremental_events.last_attempt_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bmtc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmua.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bmtd
        };
        bmtk bmtkVar7 = new bmtk(dqprVarM7.a());
        this.g = bmtkVar7;
        this.h = new bmtk[]{bmtkVar, bmtkVar2, bmtkVar3, bmtkVar4, bmtkVar5, bmtkVar6, bmtkVar7};
    }
}
