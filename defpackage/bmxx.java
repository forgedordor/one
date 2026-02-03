package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmxx {
    public final bmxy a;
    public final bmxy b;
    public final bmxy c;
    public final bmxy d;
    public final bmxy e;
    public final bmxy f;
    public final bmxy g;
    final bmxy[] h;

    public bmxx() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_restore_dependency_cache_table._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmyr.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bmxs
        };
        bmxy bmxyVar = new bmxy(dqprVarM.a());
        this.a = bmxyVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqogVar2.a = "cms_restore_dependency_cache_table.dependent_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmyr.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmxu
        };
        bmxy bmxyVar2 = new bmxy(dqprVarM2.a());
        this.b = bmxyVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqogVar3.a = "cms_restore_dependency_cache_table.dependent_cms_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmyr.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmxw
        };
        bmxy bmxyVar3 = new bmxy(dqprVarM3.a());
        this.c = bmxyVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.k(true);
        dqprVarM4.d(true);
        dqogVar4.a = "cms_restore_dependency_cache_table.dependency_cms_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmyr.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmxl
        };
        bmxy bmxyVar4 = new bmxy(dqprVarM4.a());
        this.d = bmxyVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqprVarM5.k(true);
        dqogVar5.a = "cms_restore_dependency_cache_table.cms_data_provider_type";
        dqprVarM5.i(59660);
        dqogVar5.d = new Supplier() { // from class: bmxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmyr.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmxn
        };
        bmxy bmxyVar5 = new bmxy(dqprVarM5.a());
        this.e = bmxyVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqprVarM6.k(true);
        dqogVar6.a = "cms_restore_dependency_cache_table.payload";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bmxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmyr.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bmxp
        };
        bmxy bmxyVar6 = new bmxy(dqprVarM6.a());
        this.f = bmxyVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqprVarM7.k(true);
        dqprVarM7.d(true);
        dqogVar7.a = "cms_restore_dependency_cache_table.inserted_at_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bmxq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmyr.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bmxr
        };
        bmxy bmxyVar7 = new bmxy(dqprVarM7.a());
        this.g = bmxyVar7;
        this.h = new bmxy[]{bmxyVar, bmxyVar2, bmxyVar3, bmxyVar4, bmxyVar5, bmxyVar6, bmxyVar7};
    }
}
