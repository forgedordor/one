package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btba {
    public final btbb a;
    public final btbb b;
    public final btbb c;
    public final btbb d;
    public final btbb e;
    public final btbb f;
    final btbb[] g;

    public btba() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "read_reports._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btam
            @Override // java.util.function.Supplier
            public final Object get() {
                return btbt.c();
            }
        };
        dqogVar.c = new dqps() { // from class: btav
        };
        btbb btbbVar = new btbb(dqprVarM.a());
        this.a = btbbVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: btaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "read_reports.message_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btax
            @Override // java.util.function.Supplier
            public final Object get() {
                return btbt.c();
            }
        };
        dqogVar2.c = new dqps() { // from class: btay
        };
        btbb btbbVar2 = new btbb(dqprVarM2.a());
        this.b = btbbVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: btaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar3.a = "read_reports.participant_id";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btan
            @Override // java.util.function.Supplier
            public final Object get() {
                return btbt.c();
            }
        };
        dqogVar3.c = new dqps() { // from class: btao
        };
        btbb btbbVar3 = new btbb(dqprVarM3.a());
        this.c = btbbVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "read_reports.receive_time";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: btap
            @Override // java.util.function.Supplier
            public final Object get() {
                return btbt.c();
            }
        };
        dqogVar4.c = new dqps() { // from class: btaq
        };
        btbb btbbVar4 = new btbb(dqprVarM4.a());
        this.d = btbbVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "read_reports.read_time";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: btar
            @Override // java.util.function.Supplier
            public final Object get() {
                return btbt.c();
            }
        };
        dqogVar5.c = new dqps() { // from class: btas
        };
        btbb btbbVar5 = new btbb(dqprVarM5.a());
        this.e = btbbVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "read_reports.ftd_time";
        dqprVarM6.i(58880);
        dqogVar6.d = new Supplier() { // from class: btat
            @Override // java.util.function.Supplier
            public final Object get() {
                return btbt.c();
            }
        };
        dqogVar6.c = new dqps() { // from class: btau
        };
        btbb btbbVar6 = new btbb(dqprVarM6.a());
        this.f = btbbVar6;
        this.g = new btbb[]{btbbVar, btbbVar2, btbbVar3, btbbVar4, btbbVar5, btbbVar6};
    }
}
