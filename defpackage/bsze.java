package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsze {
    public final bszf a;
    public final bszf b;
    public final bszf c;
    public final bszf d;
    final bszf[] e;

    public bsze() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "rbm_business_verifier_info.verifier_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bsyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszx.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bsyx
        };
        bszf bszfVar = new bszf(dqprVarM.a());
        this.a = bszfVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "rbm_business_verifier_info.verifier_name";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bsyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszx.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bsyz
        };
        bszf bszfVar2 = new bszf(dqprVarM2.a());
        this.b = bszfVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.k(true);
        dqogVar3.a = "rbm_business_verifier_info.verifier_logo_image_remote_url";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bsza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszx.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bszb
        };
        bszf bszfVar3 = new bszf(dqprVarM3.a());
        this.c = bszfVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.k(true);
        dqogVar4.a = "rbm_business_verifier_info.verifier_logo_image_local_uri";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bszc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszx.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bszd
        };
        bszf bszfVar4 = new bszf(dqprVarM4.a());
        this.d = bszfVar4;
        this.e = new bszf[]{bszfVar, bszfVar2, bszfVar3, bszfVar4};
    }
}
