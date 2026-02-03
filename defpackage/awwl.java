package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awwl {
    public final awwm a;
    public final awwm b;
    public final awwm c;
    public final awwm d;
    public final awwm e;
    public final awwm f;
    public final awwm g;
    final awwm[] h;

    public awwl() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "my_identities.token";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: awvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.b();
            }
        };
        dqogVar.c = new dqps() { // from class: awwh
        };
        awwm awwmVar = new awwm(dqprVarM.a());
        this.a = awwmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: awwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar2.a = "my_identities.canonical_token";
        dqprVarM2.i(60530);
        dqogVar2.d = new Supplier() { // from class: awwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: awwk
        };
        awwm awwmVar2 = new awwm(dqprVarM2.a());
        this.b = awwmVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "my_identities.provisioning_id_v2";
        dqprVarM3.i(60810);
        dqogVar3.d = new Supplier() { // from class: awvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: awvy
        };
        awwm awwmVar3 = new awwm(dqprVarM3.a());
        this.c = awwmVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.k(true);
        dqogVar4.a = "my_identities.is_verified_v2";
        dqprVarM4.i(60810);
        dqogVar4.d = new Supplier() { // from class: awvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: awwa
        };
        awwm awwmVar4 = new awwm(dqprVarM4.a());
        this.d = awwmVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "my_identities.address_type";
        dqprVarM5.i(59980);
        dqogVar5.d = new Supplier() { // from class: awwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: awwc
        };
        awwm awwmVar5 = new awwm(dqprVarM5.a());
        this.e = awwmVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "my_identities.phone_number";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: awwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: awwe
        };
        awwm awwmVar6 = new awwm(dqprVarM6.a());
        this.f = awwmVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "my_identities.display_name";
        dqprVarM7.i(60120);
        dqogVar7.d = new Supplier() { // from class: awwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: awwg
        };
        awwm awwmVar7 = new awwm(dqprVarM7.a());
        this.g = awwmVar7;
        this.h = new awwm[]{awwmVar, awwmVar2, awwmVar3, awwmVar4, awwmVar5, awwmVar6, awwmVar7};
    }
}
