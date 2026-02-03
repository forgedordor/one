package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqeu {
    public final bqev a;
    public final bqev b;
    public final bqev c;
    public final bqev d;
    public final bqev e;
    final bqev[] f;

    public bqeu() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bqei
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "message_edits.message_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqen
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfo.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqeo
        };
        bqev bqevVar = new bqev(dqprVarM.a());
        this.a = bqevVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqep
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_edits.latest_message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqeq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfo.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqer
        };
        bqev bqevVar2 = new bqev(dqprVarM2.a());
        this.b = bqevVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.d(true);
        dqogVar3.a = "message_edits.original_rcs_message_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqes
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfo.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqet
        };
        bqev bqevVar3 = new bqev(dqprVarM3.a());
        this.c = bqevVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "message_edits.edited_at_timestamp_ms";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bqej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfo.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqek
        };
        bqev bqevVar4 = new bqev(dqprVarM4.a());
        this.d = bqevVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "message_edits.received_at_timestamp_ms";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bqel
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfo.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bqem
        };
        bqev bqevVar5 = new bqev(dqprVarM5.a());
        this.e = bqevVar5;
        this.f = new bqev[]{bqevVar, bqevVar2, bqevVar3, bqevVar4, bqevVar5};
    }
}
