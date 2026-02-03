package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bucv {
    public final bucw a;
    public final bucw b;
    public final bucw c;
    public final bucw d;
    public final bucw e;
    final bucw[] f;

    public bucv() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqogVar.a = "sqlite_master.type";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bucl
            @Override // java.util.function.Supplier
            public final Object get() {
                return budi.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bucm
        };
        bucw bucwVar = new bucw(dqprVarM.a());
        this.a = bucwVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "sqlite_master.name";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bucn
            @Override // java.util.function.Supplier
            public final Object get() {
                return budi.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: buco
        };
        bucw bucwVar2 = new bucw(dqprVarM2.a());
        this.b = bucwVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "sqlite_master.tbl_name";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bucp
            @Override // java.util.function.Supplier
            public final Object get() {
                return budi.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bucq
        };
        bucw bucwVar3 = new bucw(dqprVarM3.a());
        this.c = bucwVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "sqlite_master.rootpage";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bucr
            @Override // java.util.function.Supplier
            public final Object get() {
                return budi.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bucs
        };
        bucw bucwVar4 = new bucw(dqprVarM4.a());
        this.d = bucwVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "sqlite_master.sql";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: buct
            @Override // java.util.function.Supplier
            public final Object get() {
                return budi.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bucu
        };
        bucw bucwVar5 = new bucw(dqprVarM5.a());
        this.e = bucwVar5;
        this.f = new bucw[]{bucwVar, bucwVar2, bucwVar3, bucwVar4, bucwVar5};
    }
}
