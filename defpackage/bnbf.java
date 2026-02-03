package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnbf {
    public final bnbg a;
    public final bnbg b;
    public final bnbg c;
    public final bnbg d;
    public final bnbg e;
    final bnbg[] f;

    public bnbf() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqogVar.a = "cms.key_index";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bnav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bncb.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bnaw
        };
        bnbg bnbgVar = new bnbg(dqprVarM.a());
        this.a = bnbgVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 5;
        dqogVar2.a = "cms.encryption_key";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bnax
            @Override // java.util.function.Supplier
            public final Object get() {
                return bncb.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bnay
        };
        bnbg bnbgVar2 = new bnbg(dqprVarM2.a());
        this.b = bnbgVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "cms.key_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bnaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bncb.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bnba
        };
        bnbg bnbgVar3 = new bnbg(dqprVarM3.a());
        this.c = bnbgVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.l(true);
        dqprVarM4.d(true);
        dqogVar4.a = "cms.cms_correlation_id";
        dqprVarM4.f(true);
        dqprVarM4.i(42060);
        dqogVar4.d = new Supplier() { // from class: bnbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bncb.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bnbc
        };
        bnbg bnbgVar4 = new bnbg(dqprVarM4.a());
        this.d = bnbgVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqprVarM5.l(true);
        dqprVarM5.d(true);
        dqogVar5.a = "cms.cms_id";
        dqprVarM5.f(true);
        dqprVarM5.i(35020);
        dqogVar5.d = new Supplier() { // from class: bnbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bncb.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bnbe
        };
        bnbg bnbgVar5 = new bnbg(dqprVarM5.a());
        this.e = bnbgVar5;
        this.f = new bnbg[]{bnbgVar, bnbgVar2, bnbgVar3, bnbgVar4, bnbgVar5};
    }
}
