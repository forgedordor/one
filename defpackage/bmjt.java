package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmjt {
    public final bmju a;
    public final bmju b;
    public final bmju c;
    public final bmju d;
    public final bmju e;
    final bmju[] f;

    public bmjt() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "backup_id_map._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmkn.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmjk
        };
        bmju bmjuVar = new bmju(dqprVarM.a());
        this.a = bmjuVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "backup_id_map.table_name";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmkn.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmjm
        };
        bmju bmjuVar2 = new bmju(dqprVarM2.a());
        this.b = bmjuVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqogVar3.a = "backup_id_map.backup_id";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmkn.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmjo
        };
        bmju bmjuVar3 = new bmju(dqprVarM3.a());
        this.c = bmjuVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.d(true);
        dqogVar4.a = "backup_id_map.bugle_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmjp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmkn.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmjq
        };
        bmju bmjuVar4 = new bmju(dqprVarM4.a());
        this.d = bmjuVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.d(true);
        dqogVar5.a = "backup_id_map.status";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bmjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmkn.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmjs
        };
        bmju bmjuVar5 = new bmju(dqprVarM5.a());
        this.e = bmjuVar5;
        this.f = new bmju[]{bmjuVar, bmjuVar2, bmjuVar3, bmjuVar4, bmjuVar5};
    }
}
