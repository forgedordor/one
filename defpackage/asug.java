package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asug {
    public final asuh a;
    public final asuh b;
    public final asuh c;
    final asuh[] d;

    public asug() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "rcs_remote_capabilities_cache.msisdn";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: asua
            @Override // java.util.function.Supplier
            public final Object get() {
                return asux.a();
            }
        };
        dqogVar.c = new dqps() { // from class: asub
        };
        asuh asuhVar = new asuh(dqprVarM.a());
        this.a = asuhVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqogVar2.a = "rcs_remote_capabilities_cache.last_refresh_timestamp";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: asuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return asux.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: asud
        };
        asuh asuhVar2 = new asuh(dqprVarM2.a());
        this.b = asuhVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqprVarM3.k(true);
        dqogVar3.a = "rcs_remote_capabilities_cache.rcs_capabilities";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: asue
            @Override // java.util.function.Supplier
            public final Object get() {
                return asux.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: asuf
        };
        asuh asuhVar3 = new asuh(dqprVarM3.a());
        this.c = asuhVar3;
        this.d = new asuh[]{asuhVar, asuhVar2, asuhVar3};
    }
}
