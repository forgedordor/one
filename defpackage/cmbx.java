package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmbx {
    public final cmby a;
    public final cmby b;
    public final cmby c;
    public final cmby d;
    public final cmby e;
    public final cmby f;
    final cmby[] g;

    public cmbx() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "scheduled_send._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: cmbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dqogVar.c = new dqps() { // from class: cmbs
        };
        cmby cmbyVar = new cmby(dqprVarM.a());
        this.a = cmbyVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: cmbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "scheduled_send.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: cmbu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dqogVar2.c = new dqps() { // from class: cmbv
        };
        cmby cmbyVar2 = new cmby(dqprVarM2.a());
        this.b = cmbyVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: cmbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar3.a = "scheduled_send.conversation_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: cmbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dqogVar3.c = new dqps() { // from class: cmbl
        };
        cmby cmbyVar3 = new cmby(dqprVarM3.a());
        this.c = cmbyVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "scheduled_send.scheduled_time";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: cmbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dqogVar4.c = new dqps() { // from class: cmbn
        };
        cmby cmbyVar4 = new cmby(dqprVarM4.a());
        this.d = cmbyVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.d(true);
        dqogVar5.a = "scheduled_send.status";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: cmbo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dqogVar5.c = new dqps() { // from class: cmbp
        };
        cmby cmbyVar5 = new cmby(dqprVarM5.a());
        this.e = cmbyVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqprVarM6.k(true);
        dqogVar6.a = "scheduled_send.creation_time";
        dqprVarM6.i(58020);
        dqogVar6.d = new Supplier() { // from class: cmbq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dqogVar6.c = new dqps() { // from class: cmbr
        };
        cmby cmbyVar6 = new cmby(dqprVarM6.a());
        this.f = cmbyVar6;
        this.g = new cmby[]{cmbyVar, cmbyVar2, cmbyVar3, cmbyVar4, cmbyVar5, cmbyVar6};
    }
}
