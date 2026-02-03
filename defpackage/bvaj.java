package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvaj {
    public final bvak a;
    public final bvak b;
    public final bvak c;
    public final bvak d;
    public final bvak e;
    public final bvak f;
    public final bvak g;
    final bvak[] h;

    public bvaj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "verified_sms_brands._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: buzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvaz.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bvae
        };
        bvak bvakVar = new bvak(dqprVarM.a());
        this.a = bvakVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "verified_sms_brands.brand_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bvaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvaz.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bvag
        };
        bvak bvakVar2 = new bvak(dqprVarM2.a());
        this.b = bvakVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.k(true);
        dqogVar3.a = "verified_sms_brands.name";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bvah
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvaz.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bvai
        };
        bvak bvakVar3 = new bvak(dqprVarM3.a());
        this.c = bvakVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.k(true);
        dqogVar4.a = "verified_sms_brands.description";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: buzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvaz.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: buzx
        };
        bvak bvakVar4 = new bvak(dqprVarM4.a());
        this.d = bvakVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqprVarM5.k(true);
        dqogVar5.a = "verified_sms_brands.logo_url";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: buzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvaz.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: buzz
        };
        bvak bvakVar5 = new bvak(dqprVarM5.a());
        this.e = bvakVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "verified_sms_brands.logo_uri";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bvaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvaz.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bvab
        };
        bvak bvakVar6 = new bvak(dqprVarM6.a());
        this.f = bvakVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqprVarM7.k(true);
        dqogVar7.a = "verified_sms_brands.version_token";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bvac
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvaz.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bvad
        };
        bvak bvakVar7 = new bvak(dqprVarM7.a());
        this.g = bvakVar7;
        this.h = new bvak[]{bvakVar, bvakVar2, bvakVar3, bvakVar4, bvakVar5, bvakVar6, bvakVar7};
    }
}
