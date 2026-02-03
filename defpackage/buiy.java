package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buiy {
    public final buiz a;
    public final buiz b;
    public final buiz c;
    public final buiz d;
    public final buiz e;
    public final buiz f;
    public final buiz g;
    final buiz[] h;

    public buiy() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "stickers._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: buij
            @Override // java.util.function.Supplier
            public final Object get() {
                return bujn.a();
            }
        };
        dqogVar.c = new dqps() { // from class: buiu
        };
        buiz buizVar = new buiz(dqprVarM.a());
        this.a = buizVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: buiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bugy.b.b;
            }
        };
        dqogVar2.a = "stickers.sticker_set_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: buiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bujn.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: buix
        };
        buiz buizVar2 = new buiz(dqprVarM2.a());
        this.b = buizVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "stickers.sticker_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: buik
            @Override // java.util.function.Supplier
            public final Object get() {
                return bujn.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: buil
        };
        buiz buizVar3 = new buiz(dqprVarM3.a());
        this.c = buizVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "stickers.icon_uri_static";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: buim
            @Override // java.util.function.Supplier
            public final Object get() {
                return bujn.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: buin
        };
        buiz buizVar4 = new buiz(dqprVarM4.a());
        this.d = buizVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "stickers.icon_uri_animated";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: buio
            @Override // java.util.function.Supplier
            public final Object get() {
                return bujn.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: buip
        };
        buiz buizVar5 = new buiz(dqprVarM5.a());
        this.e = buizVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "stickers.display_name";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: buiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bujn.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: buir
        };
        buiz buizVar6 = new buiz(dqprVarM6.a());
        this.f = buizVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 1;
        dqogVar7.a = "stickers.display_order";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: buis
            @Override // java.util.function.Supplier
            public final Object get() {
                return bujn.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: buit
        };
        buiz buizVar7 = new buiz(dqprVarM7.a());
        this.g = buizVar7;
        this.h = new buiz[]{buizVar, buizVar2, buizVar3, buizVar4, buizVar5, buizVar6, buizVar7};
    }
}
