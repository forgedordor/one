package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkvv {
    public static final String[] a = {"reports_concat_view._id_read_reports", "reports_concat_view.message_id_read_reports", "reports_concat_view.participant_id_read_reports", "reports_concat_view.receive_time_read_reports", "reports_concat_view.read_time_read_reports", "reports_concat_view.ftd_time_read_reports", "reports_concat_view.read_reports__ROWID_read_reports"};

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("reports_concat_view.ftd_time_read_reports", 58880);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_null_message_id");
        ekgiVar2.c();
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "reports_concat_view._id_read_reports";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bkve
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkvv.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bkvr
        };
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bkvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "reports_concat_view.message_id_read_reports";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bkvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkvv.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bkvf
        };
        dqprVarM2.a();
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bkvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar3.a = "reports_concat_view.participant_id_read_reports";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bkvh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkvv.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bkvi
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "reports_concat_view.receive_time_read_reports";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bkvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkvv.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bkvk
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "reports_concat_view.read_time_read_reports";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bkvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkvv.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bkvm
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "reports_concat_view.ftd_time_read_reports";
        dqprVarM6.i(58880);
        dqogVar6.d = new Supplier() { // from class: bkvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkvv.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bkvo
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 8;
        dqogVar7.a = "reports_concat_view.read_reports__ROWID_read_reports";
        dqprVarM7.i(0);
        dqogVar7.d = new Supplier() { // from class: bkvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bkvv.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bkvq
        };
        dqprVarM7.a();
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static dqxa b() {
        return a().M();
    }
}
