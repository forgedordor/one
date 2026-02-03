package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgk {
    public final btgl a;
    public final btgl b;
    public final btgl c;
    final btgl[] d;

    public btgk() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "recent_stickers._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btge
            @Override // java.util.function.Supplier
            public final Object get() {
                return btgv.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btgf
        };
        btgl btglVar = new btgl(dqprVarM.a());
        this.a = btglVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "recent_stickers.sticker_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return btgv.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btgh
        };
        btgl btglVar2 = new btgl(dqprVarM2.a());
        this.b = btglVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "recent_stickers.last_used_timestamp";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return btgv.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: btgj
        };
        btgl btglVar3 = new btgl(dqprVarM3.a());
        this.c = btglVar3;
        this.d = new btgl[]{btglVar, btglVar2, btglVar3};
    }
}
