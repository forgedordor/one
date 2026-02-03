package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bubl {
    public final bubm a;
    public final bubm b;
    public final bubm c;
    public final bubm d;
    public final bubm e;
    final bubm[] f;

    public bubl() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "settings._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bubb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bucf.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bubc
        };
        bubm bubmVar = new bubm(dqprVarM.a());
        this.a = bubmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "settings.key";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bubd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bucf.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bube
        };
        bubm bubmVar2 = new bubm(dqprVarM2.a());
        this.b = bubmVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "settings.sub_key";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bubf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bucf.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bubg
        };
        bubm bubmVar3 = new bubm(dqprVarM3.a());
        this.c = bubmVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqogVar4.a = "settings.data";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bubh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bucf.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bubi
        };
        bubm bubmVar4 = new bubm(dqprVarM4.a());
        this.d = bubmVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "settings.last_modified_timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bubj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bucf.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bubk
        };
        bubm bubmVar5 = new bubm(dqprVarM5.a());
        this.e = bubmVar5;
        this.f = new bubm[]{bubmVar, bubmVar2, bubmVar3, bubmVar4, bubmVar5};
    }
}
