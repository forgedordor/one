package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvk {
    public final ayvl a;
    public final ayvl b;
    public final ayvl c;
    final ayvl[] d;

    public ayvk() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_pins_backup._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: ayvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return aywb.a();
            }
        };
        dqogVar.c = new dqps() { // from class: ayve
        };
        ayvl ayvlVar = new ayvl(dqprVarM.a());
        this.a = ayvlVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: ayvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayzh.c.a;
            }
        };
        dqogVar2.a = "conversation_pins_backup.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: ayvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return aywb.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: ayvh
        };
        ayvl ayvlVar2 = new ayvl(dqprVarM2.a());
        this.b = ayvlVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "conversation_pins_backup.pin_status";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: ayvi
            @Override // java.util.function.Supplier
            public final Object get() {
                return aywb.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: ayvj
        };
        ayvl ayvlVar3 = new ayvl(dqprVarM3.a());
        this.c = ayvlVar3;
        this.d = new ayvl[]{ayvlVar, ayvlVar2, ayvlVar3};
    }
}
