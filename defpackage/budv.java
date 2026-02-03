package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class budv {
    public final budw a;
    public final budw b;
    public final budw c;
    final budw[] d;

    public budv() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqogVar.a = "sqlite_stat1.tbl";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: budp
            @Override // java.util.function.Supplier
            public final Object get() {
                return buei.a();
            }
        };
        dqogVar.c = new dqps() { // from class: budq
        };
        budw budwVar = new budw(dqprVarM.a());
        this.a = budwVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "sqlite_stat1.idx";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: budr
            @Override // java.util.function.Supplier
            public final Object get() {
                return buei.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: buds
        };
        budw budwVar2 = new budw(dqprVarM2.a());
        this.b = budwVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "sqlite_stat1.stat";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: budt
            @Override // java.util.function.Supplier
            public final Object get() {
                return buei.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: budu
        };
        budw budwVar3 = new budw(dqprVarM3.a());
        this.c = budwVar3;
        this.d = new budw[]{budwVar, budwVar2, budwVar3};
    }
}
