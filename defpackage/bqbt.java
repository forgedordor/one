package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqbt {
    public final bqbu a;
    public final bqbu b;
    public final bqbu c;
    public final bqbu d;
    final bqbu[] e;

    public bqbt() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "message_classifications_table._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bqbk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqcn.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bqbl
        };
        bqbu bqbuVar = new bqbu(dqprVarM.a());
        this.a = bqbuVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "message_classifications_table.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqcn.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bqbo
        };
        bqbu bqbuVar2 = new bqbu(dqprVarM2.a());
        this.b = bqbuVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqogVar3.a = "message_classifications_table.classification_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqcn.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqbq
        };
        bqbu bqbuVar3 = new bqbu(dqprVarM3.a());
        this.c = bqbuVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 5;
        dqogVar4.a = "message_classifications_table.classification_details";
        dqprVarM4.i(58480);
        dqogVar4.d = new Supplier() { // from class: bqbr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqcn.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqbs
        };
        bqbu bqbuVar4 = new bqbu(dqprVarM4.a());
        this.d = bqbuVar4;
        this.e = new bqbu[]{bqbuVar, bqbuVar2, bqbuVar3, bqbuVar4};
    }
}
