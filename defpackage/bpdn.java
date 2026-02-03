package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpdn {
    public final bpdo a;
    public final bpdo b;
    final bpdo[] c;

    public bpdn() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.k(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bpdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "emergency_questionnaire_option.message_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bpdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bped.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bpdk
        };
        bpdo bpdoVar = new bpdo(dqprVarM.a());
        this.a = bpdoVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqogVar2.a = "emergency_questionnaire_option.option_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bpdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bped.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpdm
        };
        bpdo bpdoVar2 = new bpdo(dqprVarM2.a());
        this.b = bpdoVar2;
        this.c = new bpdo[]{bpdoVar, bpdoVar2};
    }
}
