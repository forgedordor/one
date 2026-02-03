package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awka {
    public final awkb a;
    public final awkb b;
    public final awkb c;
    final awkb[] d;

    public awka() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "destinations.token";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: awju
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.a();
            }
        };
        dqogVar.c = new dqps() { // from class: awjv
        };
        awkb awkbVar = new awkb(dqprVarM.a());
        this.a = awkbVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "destinations.address";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: awjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: awjx
        };
        awkb awkbVar2 = new awkb(dqprVarM2.a());
        this.b = awkbVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqogVar3.a = "destinations.address_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: awjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return awko.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: awjz
        };
        awkb awkbVar3 = new awkb(dqprVarM3.a());
        this.c = awkbVar3;
        this.d = new awkb[]{awkbVar, awkbVar2, awkbVar3};
    }
}
