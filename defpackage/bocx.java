package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bocx {
    public final bocy a;
    public final bocy b;
    public final bocy c;
    final bocy[] d;

    public bocx() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_pin._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bocq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bodn.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bocr
        };
        bocy bocyVar = new bocy(dqprVarM.a());
        this.a = bocyVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bocs
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "conversation_pin.conversation_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: boct
            @Override // java.util.function.Supplier
            public final Object get() {
                return bodn.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bocu
        };
        bocy bocyVar2 = new bocy(dqprVarM2.a());
        this.b = bocyVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "conversation_pin.pin_status";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bocv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bodn.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bocw
        };
        bocy bocyVar3 = new bocy(dqprVarM3.a());
        this.c = bocyVar3;
        this.d = new bocy[]{bocyVar, bocyVar2, bocyVar3};
    }
}
