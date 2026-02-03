package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmwf {
    public final bmwg a;
    public final bmwg b;
    public final bmwg c;
    public final bmwg d;
    public final bmwg e;
    public final bmwg f;
    public final bmwg g;
    public final bmwg h;
    final bmwg[] i;

    public bmwf() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_notifications.cms_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bmwc
        };
        bmwg bmwgVar = new bmwg(dqprVarM.a());
        this.a = bmwgVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqogVar2.a = "cms_notifications.cms_last_mod_seq";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmwe
        };
        bmwg bmwgVar2 = new bmwg(dqprVarM2.a());
        this.b = bmwgVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "cms_notifications.cms_correlation_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmvr
        };
        bmwg bmwgVar3 = new bmwg(dqprVarM3.a());
        this.c = bmwgVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "cms_notifications.from_address";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmvt
        };
        bmwg bmwgVar4 = new bmwg(dqprVarM4.a());
        this.d = bmwgVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "cms_notifications.to_address";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bmvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmvv
        };
        bmwg bmwgVar5 = new bmwg(dqprVarM5.a());
        this.e = bmwgVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqogVar6.a = "cms_notifications.correlation_text";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bmvw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bmvx
        };
        bmwg bmwgVar6 = new bmwg(dqprVarM6.a());
        this.f = bmwgVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "cms_notifications.modified_at_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bmvy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bmvz
        };
        bmwg bmwgVar7 = new bmwg(dqprVarM7.a());
        this.g = bmwgVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqogVar8.a = "cms_notifications.message_received_timestamp";
        dqprVarM8.i(46040);
        dqogVar8.d = new Supplier() { // from class: bmwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bmxa.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bmwb
        };
        bmwg bmwgVar8 = new bmwg(dqprVarM8.a());
        this.h = bmwgVar8;
        this.i = new bmwg[]{bmwgVar, bmwgVar2, bmwgVar3, bmwgVar4, bmwgVar5, bmwgVar6, bmwgVar7, bmwgVar8};
    }
}
