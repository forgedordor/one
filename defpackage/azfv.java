package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfv {
    public final azfw a;
    public final azfw b;
    final azfw[] c;

    public azfv() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_star_backup._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: azfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return azgl.a();
            }
        };
        dqogVar.c = new dqps() { // from class: azfr
        };
        azfw azfwVar = new azfw(dqprVarM.a());
        this.a = azfwVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: azfs
            @Override // java.util.function.Supplier
            public final Object get() {
                return azlc.c.a;
            }
        };
        dqogVar2.a = "message_star_backup.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: azft
            @Override // java.util.function.Supplier
            public final Object get() {
                return azgl.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: azfu
        };
        azfw azfwVar2 = new azfw(dqprVarM2.a());
        this.b = azfwVar2;
        this.c = new azfw[]{azfwVar, azfwVar2};
    }
}
