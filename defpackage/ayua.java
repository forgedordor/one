package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayua {
    public final ayub a;
    public final ayub b;
    public final ayub c;
    public final ayub d;
    public final ayub e;
    public final ayub f;
    final ayub[] g;

    public ayua() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_participants_backup._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: aytm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayuu.b();
            }
        };
        dqogVar.c = new dqps() { // from class: aytv
        };
        ayub ayubVar = new ayub(dqprVarM.a());
        this.a = ayubVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: aytw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayzh.c.a;
            }
        };
        dqogVar2.a = "conversation_participants_backup.conversation_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: aytx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayuu.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: ayty
        };
        ayub ayubVar2 = new ayub(dqprVarM2.a());
        this.b = ayubVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: aytz
            @Override // java.util.function.Supplier
            public final Object get() {
                return azut.c.a;
            }
        };
        dqogVar3.a = "conversation_participants_backup.participant_id";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: aytn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayuu.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: ayto
        };
        ayub ayubVar3 = new ayub(dqprVarM3.a());
        this.c = ayubVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "conversation_participants_backup.is_normalized";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: aytp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayuu.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: aytq
        };
        ayub ayubVar4 = new ayub(dqprVarM4.a());
        this.d = ayubVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "conversation_participants_backup.rcs_group_join_status";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: aytr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayuu.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: ayts
        };
        ayub ayubVar5 = new ayub(dqprVarM5.a());
        this.e = ayubVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqprVarM6.d(true);
        dqogVar6.a = "conversation_participants_backup.is_c2p_only";
        dqprVarM6.i(70);
        dqogVar6.d = new Supplier() { // from class: aytt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ayuu.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: aytu
        };
        ayub ayubVar6 = new ayub(dqprVarM6.a());
        this.f = ayubVar6;
        this.g = new ayub[]{ayubVar, ayubVar2, ayubVar3, ayubVar4, ayubVar5, ayubVar6};
    }
}
