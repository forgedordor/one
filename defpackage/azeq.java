package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azeq {
    public final azer a;
    public final azer b;
    public final azer c;
    public final azer d;
    final azer[] e;

    public azeq() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: azeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return azlc.c.a;
            }
        };
        dqogVar.a = "message_replies_backup.message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: azeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return azfi.a();
            }
        };
        dqogVar.c = new dqps() { // from class: azei
        };
        azer azerVar = new azer(dqprVarM.a());
        this.a = azerVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: azej
            @Override // java.util.function.Supplier
            public final Object get() {
                return azlc.c.a;
            }
        };
        dqogVar2.a = "message_replies_backup.replied_to_message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: azek
            @Override // java.util.function.Supplier
            public final Object get() {
                return azfi.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: azel
        };
        azer azerVar2 = new azer(dqprVarM2.a());
        this.b = azerVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqogVar3.a = "message_replies_backup.replied_to_message_id_null_reason";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: azem
            @Override // java.util.function.Supplier
            public final Object get() {
                return azfi.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: azen
        };
        azer azerVar3 = new azer(dqprVarM3.a());
        this.c = azerVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.d(true);
        dqogVar4.a = "message_replies_backup.replied_to_rcs_message_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: azeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return azfi.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: azep
        };
        azer azerVar4 = new azer(dqprVarM4.a());
        this.d = azerVar4;
        this.e = new azer[]{azerVar, azerVar2, azerVar3, azerVar4};
    }
}
