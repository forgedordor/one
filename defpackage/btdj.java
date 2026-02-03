package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btdj {
    public final btdk a;
    public final btdk b;
    public final btdk c;
    public final btdk d;
    public final btdk e;
    public final btdk f;
    final btdk[] g;

    public btdj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "recent_expressive_stickers.name";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return btee.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btdc
        };
        btdk btdkVar = new btdk(dqprVarM.a());
        this.a = btdkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "recent_expressive_stickers.content_uri";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return btee.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btde
        };
        btdk btdkVar2 = new btdk(dqprVarM2.a());
        this.b = btdkVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.k(true);
        dqogVar3.a = "recent_expressive_stickers.content_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btdf
            @Override // java.util.function.Supplier
            public final Object get() {
                return btee.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: btdg
        };
        btdk btdkVar3 = new btdk(dqprVarM3.a());
        this.c = btdkVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.k(true);
        dqogVar4.a = "recent_expressive_stickers.width";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: btdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return btee.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: btdi
        };
        btdk btdkVar4 = new btdk(dqprVarM4.a());
        this.d = btdkVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqprVarM5.k(true);
        dqogVar5.a = "recent_expressive_stickers.height";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: btcy
            @Override // java.util.function.Supplier
            public final Object get() {
                return btee.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: btcz
        };
        btdk btdkVar5 = new btdk(dqprVarM5.a());
        this.e = btdkVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqprVarM6.k(true);
        dqprVarM6.d(true);
        dqogVar6.a = "recent_expressive_stickers.last_used_timestamp";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: btda
            @Override // java.util.function.Supplier
            public final Object get() {
                return btee.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: btdb
        };
        btdk btdkVar6 = new btdk(dqprVarM6.a());
        this.f = btdkVar6;
        this.g = new btdk[]{btdkVar, btdkVar2, btdkVar3, btdkVar4, btdkVar5, btdkVar6};
    }
}
