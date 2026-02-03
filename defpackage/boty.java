package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boty {
    public final botz a;
    public final botz b;
    final botz[] c;

    public boty() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bott
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "custodian_rcs_group_ids.conversation_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: botu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bouk.a();
            }
        };
        dqogVar.c = new dqps() { // from class: botv
        };
        botz botzVar = new botz(dqprVarM.a());
        this.a = botzVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "custodian_rcs_group_ids.rcs_group_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: botw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bouk.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: botx
        };
        botz botzVar2 = new botz(dqprVarM2.a());
        this.b = botzVar2;
        this.c = new botz[]{botzVar, botzVar2};
    }
}
