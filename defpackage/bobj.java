package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bobj {
    public final bobk a;
    public final bobk b;
    public final bobk c;
    public final bobk d;
    public final bobk e;
    public final bobk f;
    final bobk[] g;

    public bobj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_participants._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: boav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bocg.c();
            }
        };
        dqogVar.c = new dqps() { // from class: bobe
        };
        bobk bobkVar = new bobk(dqprVarM.a());
        this.a = bobkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bobf
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "conversation_participants.conversation_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bobg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bocg.c();
            }
        };
        dqogVar2.c = new dqps() { // from class: bobh
        };
        bobk bobkVar2 = new bobk(dqprVarM2.a());
        this.b = bobkVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bobi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar3.a = "conversation_participants.participant_id";
        dqprVarM3.f(true);
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: boaw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bocg.c();
            }
        };
        dqogVar3.c = new dqps() { // from class: boax
        };
        bobk bobkVar3 = new bobk(dqprVarM3.a());
        this.c = bobkVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.d(true);
        dqogVar4.a = "conversation_participants.is_normalized";
        dqprVarM4.f(true);
        dqprVarM4.i(58090);
        dqogVar4.d = new Supplier() { // from class: boay
            @Override // java.util.function.Supplier
            public final Object get() {
                return bocg.c();
            }
        };
        dqogVar4.c = new dqps() { // from class: boaz
        };
        bobk bobkVar4 = new bobk(dqprVarM4.a());
        this.d = bobkVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "conversation_participants.rcs_group_join_status";
        dqprVarM5.i(58570);
        dqogVar5.d = new Supplier() { // from class: boba
            @Override // java.util.function.Supplier
            public final Object get() {
                return bocg.c();
            }
        };
        dqogVar5.c = new dqps() { // from class: bobb
        };
        bobk bobkVar5 = new bobk(dqprVarM5.a());
        this.e = bobkVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "conversation_participants.last_modified_by_key";
        dqprVarM6.i(59440);
        dqogVar6.d = new Supplier() { // from class: bobc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bocg.c();
            }
        };
        dqogVar6.c = new dqps() { // from class: bobd
        };
        bobk bobkVar6 = new bobk(dqprVarM6.a());
        this.f = bobkVar6;
        this.g = new bobk[]{bobkVar, bobkVar2, bobkVar3, bobkVar4, bobkVar5, bobkVar6};
    }
}
