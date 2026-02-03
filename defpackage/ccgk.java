package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccgk {
    public final ccgl a;
    public final ccgl b;
    public final ccgl c;
    final ccgl[] d;

    public ccgk() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 5;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "mls_key_packages._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: ccge
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccha.a();
            }
        };
        dqogVar.c = new dqps() { // from class: ccgf
        };
        ccgl ccglVar = new ccgl(dqprVarM.a());
        this.a = ccglVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 5;
        dqprVarM2.k(true);
        dqogVar2.a = "mls_key_packages.key_package";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: ccgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccha.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: ccgh
        };
        ccgl ccglVar2 = new ccgl(dqprVarM2.a());
        this.b = ccglVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "mls_key_packages.expiration_timestamp";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: ccgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccha.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: ccgj
        };
        ccgl ccglVar3 = new ccgl(dqprVarM3.a());
        this.c = ccglVar3;
        this.d = new ccgl[]{ccglVar, ccglVar2, ccglVar3};
    }
}
