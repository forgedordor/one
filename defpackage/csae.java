package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csae {
    public final csaf a;
    public final csaf b;
    public final csaf c;
    public final csaf d;
    public final csaf e;
    final csaf[] f;

    public csae() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: crzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "spam_logging_ids_table.message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: crzx
            @Override // java.util.function.Supplier
            public final Object get() {
                return csav.a();
            }
        };
        dqogVar.c = new dqps() { // from class: crzy
        };
        csaf csafVar = new csaf(dqprVarM.a());
        this.a = csafVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqogVar2.a = "spam_logging_ids_table.message_logging_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: crzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return csav.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: csaa
        };
        csaf csafVar2 = new csaf(dqprVarM2.a());
        this.b = csafVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: csab
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar3.a = "spam_logging_ids_table.conversation_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: csac
            @Override // java.util.function.Supplier
            public final Object get() {
                return csav.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: csad
        };
        csaf csafVar3 = new csaf(dqprVarM3.a());
        this.c = csafVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "spam_logging_ids_table.conversation_logging_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: crzt
            @Override // java.util.function.Supplier
            public final Object get() {
                return csav.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: crzu
        };
        csaf csafVar4 = new csaf(dqprVarM4.a());
        this.d = csafVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.d(true);
        dqogVar5.a = "spam_logging_ids_table.generation_timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: crzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return csav.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: crzw
        };
        csaf csafVar5 = new csaf(dqprVarM5.a());
        this.e = csafVar5;
        this.f = new csaf[]{csafVar, csafVar2, csafVar3, csafVar4, csafVar5};
    }
}
