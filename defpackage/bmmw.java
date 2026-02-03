package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmmw {
    public final bmmx a;
    public final bmmx b;
    public final bmmx c;
    public final bmmx d;
    final bmmx[] e;

    public bmmw() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_backup_dependency_cache_table._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmmo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmnn.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmmp
        };
        bmmx bmmxVar = new bmmx(dqprVarM.a());
        this.a = bmmxVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "cms_backup_dependency_cache_table.dependent_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmmq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmnn.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmmr
        };
        bmmx bmmxVar2 = new bmmx(dqprVarM2.a());
        this.b = bmmxVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqogVar3.a = "cms_backup_dependency_cache_table.dependency_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmms
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmnn.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmmt
        };
        bmmx bmmxVar3 = new bmmx(dqprVarM3.a());
        this.c = bmmxVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqprVarM4.d(true);
        dqogVar4.a = "cms_backup_dependency_cache_table.inserted_at_timestamp";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmnn.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmmv
        };
        bmmx bmmxVar4 = new bmmx(dqprVarM4.a());
        this.d = bmmxVar4;
        this.e = new bmmx[]{bmmxVar, bmmxVar2, bmmxVar3, bmmxVar4};
    }
}
