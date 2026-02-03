package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsvm {
    public final bsvn a;
    public final bsvn b;
    public final bsvn c;
    public final bsvn d;
    public final bsvn e;
    public final bsvn f;
    final bsvn[] g;

    public bsvm() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "rbm_business_info_properties._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bsuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bsvg
        };
        bsvn bsvnVar = new bsvn(dqprVarM.a());
        this.a = bsvnVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bsvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyn.b.a;
            }
        };
        dqogVar2.a = "rbm_business_info_properties.rbm_bot_id";
        dqprVarM2.i(51020);
        dqogVar2.d = new Supplier() { // from class: bsvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bsvj
        };
        bsvn bsvnVar2 = new bsvn(dqprVarM2.a());
        this.b = bsvnVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqogVar3.a = "rbm_business_info_properties.type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bsvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bsvl
        };
        bsvn bsvnVar3 = new bsvn(dqprVarM3.a());
        this.c = bsvnVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "rbm_business_info_properties.header";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bsva
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bsvb
        };
        bsvn bsvnVar4 = new bsvn(dqprVarM4.a());
        this.d = bsvnVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "rbm_business_info_properties.subheader";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bsvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bsvd
        };
        bsvn bsvnVar5 = new bsvn(dqprVarM5.a());
        this.e = bsvnVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "rbm_business_info_properties.property_value";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bsve
            @Override // java.util.function.Supplier
            public final Object get() {
                return bswf.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bsvf
        };
        bsvn bsvnVar6 = new bsvn(dqprVarM6.a());
        this.f = bsvnVar6;
        this.g = new bsvn[]{bsvnVar, bsvnVar2, bsvnVar3, bsvnVar4, bsvnVar5, bsvnVar6};
    }
}
