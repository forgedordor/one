package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bthr {
    public final bths a;
    public final bths b;
    public final bths c;
    public final bths d;
    public final bths e;
    final bths[] f;

    public bthr() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "reminders._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bthf
            @Override // java.util.function.Supplier
            public final Object get() {
                return btin.d();
            }
        };
        dqogVar.c = new dqps() { // from class: bthk
        };
        bths bthsVar = new bths(dqprVarM.a());
        this.a = bthsVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bthl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "reminders.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bthm
            @Override // java.util.function.Supplier
            public final Object get() {
                return btin.d();
            }
        };
        dqogVar2.c = new dqps() { // from class: bthn
        };
        bths bthsVar2 = new bths(dqprVarM2.a());
        this.b = bthsVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: btho
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar3.a = "reminders.conversation_id";
        dqprVarM3.i(35070);
        dqogVar3.d = new Supplier() { // from class: bthp
            @Override // java.util.function.Supplier
            public final Object get() {
                return btin.d();
            }
        };
        dqogVar3.c = new dqps() { // from class: bthq
        };
        bths bthsVar3 = new bths(dqprVarM3.a());
        this.c = bthsVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.d(true);
        dqogVar4.a = "reminders.trigger_time";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bthg
            @Override // java.util.function.Supplier
            public final Object get() {
                return btin.d();
            }
        };
        dqogVar4.c = new dqps() { // from class: bthh
        };
        bths bthsVar4 = new bths(dqprVarM4.a());
        this.d = bthsVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "reminders.status";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bthi
            @Override // java.util.function.Supplier
            public final Object get() {
                return btin.d();
            }
        };
        dqogVar5.c = new dqps() { // from class: bthj
        };
        bths bthsVar5 = new bths(dqprVarM5.a());
        this.e = bthsVar5;
        this.f = new bths[]{bthsVar, bthsVar2, bthsVar3, bthsVar4, bthsVar5};
    }
}
