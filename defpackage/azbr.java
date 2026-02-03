package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azbr {
    public final azbs a;
    public final azbs b;
    final azbs[] c;

    public azbr() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: azbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return azlc.c.a;
            }
        };
        dqogVar.a = "message_captions_backup.message_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: azbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return azcg.a();
            }
        };
        dqogVar.c = new dqps() { // from class: azbo
        };
        azbs azbsVar = new azbs(dqprVarM.a());
        this.a = azbsVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "message_captions_backup.caption";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: azbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return azcg.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: azbq
        };
        azbs azbsVar2 = new azbs(dqprVarM2.a());
        this.b = azbsVar2;
        this.c = new azbs[]{azbsVar, azbsVar2};
    }
}
