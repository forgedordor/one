package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bson {
    public final bsoo a;
    public final bsoo b;
    public final bsoo c;
    public final bsoo d;
    final bsoo[] e;

    public bson() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "pii_hash._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bsof
            @Override // java.util.function.Supplier
            public final Object get() {
                return bspe.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bsog
        };
        bsoo bsooVar = new bsoo(dqprVarM.a());
        this.a = bsooVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "pii_hash.timestamp";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bsoh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bspe.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bsoi
        };
        bsoo bsooVar2 = new bsoo(dqprVarM2.a());
        this.b = bsooVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "pii_hash.hash_value";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bsoj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bspe.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bsok
        };
        bsoo bsooVar3 = new bsoo(dqprVarM3.a());
        this.c = bsooVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "pii_hash.hash_key";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bsol
            @Override // java.util.function.Supplier
            public final Object get() {
                return bspe.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bsom
        };
        bsoo bsooVar4 = new bsoo(dqprVarM4.a());
        this.d = bsooVar4;
        this.e = new bsoo[]{bsooVar, bsooVar2, bsooVar3, bsooVar4};
    }
}
