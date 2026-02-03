package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmzp {
    public final bmzq a;
    public final bmzq b;
    public final bmzq c;
    public final bmzq d;
    public final bmzq e;
    public final bmzq f;
    public final bmzq g;
    public final bmzq h;
    final bmzq[] i;

    public bmzp() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "cms_status._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bmyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bmzm
        };
        bmzq bmzqVar = new bmzq(dqprVarM.a());
        this.a = bmzqVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "cms_status.table_type";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bmzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bmzo
        };
        bmzq bmzqVar2 = new bmzq(dqprVarM2.a());
        this.b = bmzqVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "cms_status.item_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bmza
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bmzb
        };
        bmzq bmzqVar3 = new bmzq(dqprVarM3.a());
        this.c = bmzqVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "cms_status.cms_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bmzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bmzd
        };
        bmzq bmzqVar4 = new bmzq(dqprVarM4.a());
        this.d = bmzqVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "cms_status.timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bmze
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bmzf
        };
        bmzq bmzqVar5 = new bmzq(dqprVarM5.a());
        this.e = bmzqVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqogVar6.a = "cms_status.event_type";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bmzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bmzh
        };
        bmzq bmzqVar6 = new bmzq(dqprVarM6.a());
        this.f = bmzqVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "cms_status.status";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bmzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bmzj
        };
        bmzq bmzqVar7 = new bmzq(dqprVarM7.a());
        this.g = bmzqVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqogVar8.a = "cms_status.attempt_number";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bmzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bnak.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bmzl
        };
        bmzq bmzqVar8 = new bmzq(dqprVarM8.a());
        this.h = bmzqVar8;
        this.i = new bmzq[]{bmzqVar, bmzqVar2, bmzqVar3, bmzqVar4, bmzqVar5, bmzqVar6, bmzqVar7, bmzqVar8};
    }
}
