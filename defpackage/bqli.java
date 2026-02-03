package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqli {
    public final bqlj a;
    public final bqlj b;
    public final bqlj c;
    public final bqlj d;
    final bqlj[] e;

    public bqli() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bqky
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "message_replies.message_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqkz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmc.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bqla
        };
        bqlj bqljVar = new bqlj(dqprVarM.a());
        this.a = bqljVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqlb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_replies.replied_to_message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqlc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmc.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqld
        };
        bqlj bqljVar2 = new bqlj(dqprVarM2.a());
        this.b = bqljVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "message_replies.replied_to_message_id_null_reason";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqle
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmc.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqlf
        };
        bqlj bqljVar3 = new bqlj(dqprVarM3.a());
        this.c = bqljVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqprVarM4.d(true);
        dqogVar4.a = "message_replies.replied_to_rcs_message_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bqlg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmc.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqlh
        };
        bqlj bqljVar4 = new bqlj(dqprVarM4.a());
        this.d = bqljVar4;
        this.e = new bqlj[]{bqljVar, bqljVar2, bqljVar3, bqljVar4};
    }
}
