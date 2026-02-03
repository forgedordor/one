package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqno {
    public final bqnp a;
    public final bqnp b;
    public final bqnp c;
    public final bqnp d;
    public final bqnp e;
    public final bqnp f;
    public final bqnp g;
    public final bqnp h;
    public final bqnp i;
    public final bqnp j;
    public final bqnp k;
    public final bqnp l;
    public final bqnp m;
    final bqnp[] n;

    public bqno() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_send_receive_attempt._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqmp
        };
        bqnp bqnpVar = new bqnp(dqprVarM.a());
        this.a = bqnpVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_send_receive_attempt.message_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqna
        };
        bqnp bqnpVar2 = new bqnp(dqprVarM2.a());
        this.b = bqnpVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "message_send_receive_attempt.timestamp";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqnc
        };
        bqnp bqnpVar3 = new bqnp(dqprVarM3.a());
        this.c = bqnpVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqogVar4.a = "message_send_receive_attempt.message_sending_attempt";
        dqprVarM4.f(true);
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bqnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqne
        };
        bqnp bqnpVar4 = new bqnp(dqprVarM4.a());
        this.d = bqnpVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "message_send_receive_attempt.message_protocol";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bqnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bqmy
        };
        bqnp bqnpVar5 = new bqnp(dqprVarM5.a());
        this.e = bqnpVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "message_send_receive_attempt.current_sim_network_country";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bqng
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bqnh
        };
        bqnp bqnpVar6 = new bqnp(dqprVarM6.a());
        this.f = bqnpVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "message_send_receive_attempt.current_sim_country";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bqni
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bqnj
        };
        bqnp bqnpVar7 = new bqnp(dqprVarM7.a());
        this.g = bqnpVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqogVar8.a = "message_send_receive_attempt.current_sim_carrier_country";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bqnk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bqnl
        };
        bqnp bqnpVar8 = new bqnp(dqprVarM8.a());
        this.h = bqnpVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqogVar9.a = "message_send_receive_attempt.settings_country";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bqnm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bqnn
        };
        bqnp bqnpVar9 = new bqnp(dqprVarM9.a());
        this.i = bqnpVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqogVar10.a = "message_send_receive_attempt.default_sms_sim_country";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bqmo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bqmq
        };
        bqnp bqnpVar10 = new bqnp(dqprVarM10.a());
        this.j = bqnpVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 4;
        dqogVar11.a = "message_send_receive_attempt.locale_country";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bqmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bqms
        };
        bqnp bqnpVar11 = new bqnp(dqprVarM11.a());
        this.k = bqnpVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "message_send_receive_attempt.default_sms_sim_network_country";
        dqprVarM12.i(-1);
        dqogVar12.d = new Supplier() { // from class: bqmt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bqmu
        };
        bqnp bqnpVar12 = new bqnp(dqprVarM12.a());
        this.l = bqnpVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqogVar13.a = "message_send_receive_attempt.default_sms_sim_carrier_country";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bqmv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqoo.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: bqmw
        };
        bqnp bqnpVar13 = new bqnp(dqprVarM13.a());
        this.m = bqnpVar13;
        this.n = new bqnp[]{bqnpVar, bqnpVar2, bqnpVar3, bqnpVar4, bqnpVar5, bqnpVar6, bqnpVar7, bqnpVar8, bqnpVar9, bqnpVar10, bqnpVar11, bqnpVar12, bqnpVar13};
    }
}
