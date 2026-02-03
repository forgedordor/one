package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buhq {
    public final buhr a;
    public final buhr b;
    public final buhr c;
    public final buhr d;
    public final buhr e;
    final buhr[] f;

    public buhq() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: buhe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bugy.b.b;
            }
        };
        dqogVar.a = "stickers_localization.sticker_set_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: buhj
            @Override // java.util.function.Supplier
            public final Object get() {
                return buid.a();
            }
        };
        dqogVar.c = new dqps() { // from class: buhk
        };
        buhr buhrVar = new buhr(dqprVarM.a());
        this.a = buhrVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "stickers_localization.sticker_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: buhl
            @Override // java.util.function.Supplier
            public final Object get() {
                return buid.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: buhm
        };
        buhr buhrVar2 = new buhr(dqprVarM2.a());
        this.b = buhrVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.l(true);
        dqprVarM3.g(true);
        dqprVarM3.d(true);
        dqogVar3.a = "stickers_localization.locale";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: buhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return buid.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: buho
        };
        buhr buhrVar3 = new buhr(dqprVarM3.a());
        this.c = buhrVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "stickers_localization.display_name";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: buhp
            @Override // java.util.function.Supplier
            public final Object get() {
                return buid.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: buhf
        };
        buhr buhrVar4 = new buhr(dqprVarM4.a());
        this.d = buhrVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.e(true);
        dqogVar5.b = new Supplier() { // from class: buhg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bugy.b.a;
            }
        };
        dqogVar5.a = "stickers_localization.sticker_local_id";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: buhh
            @Override // java.util.function.Supplier
            public final Object get() {
                return buid.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: buhi
        };
        buhr buhrVar5 = new buhr(dqprVarM5.a());
        this.e = buhrVar5;
        this.f = new buhr[]{buhrVar, buhrVar2, buhrVar3, buhrVar4, buhrVar5};
    }
}
