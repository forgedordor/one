package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boic {
    public final boid a;
    public final boid b;
    public final boid c;
    public final boid d;
    final boid[] e;

    public boic() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bohs
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar.a = "conversation_to_participants.conversation_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: boht
            @Override // java.util.function.Supplier
            public final Object get() {
                return boiv.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bohu
        };
        boid boidVar = new boid(dqprVarM.a());
        this.a = boidVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bohv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar2.a = "conversation_to_participants.participant_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bohw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boiv.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bohx
        };
        boid boidVar2 = new boid(dqprVarM2.a());
        this.b = boidVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqogVar3.a = "conversation_to_participants.rcs_group_join_status";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bohy
            @Override // java.util.function.Supplier
            public final Object get() {
                return boiv.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bohz
        };
        boid boidVar3 = new boid(dqprVarM3.a());
        this.c = boidVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "conversation_to_participants.last_modified_by_key";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: boia
            @Override // java.util.function.Supplier
            public final Object get() {
                return boiv.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: boib
        };
        boid boidVar4 = new boid(dqprVarM4.a());
        this.d = boidVar4;
        this.e = new boid[]{boidVar, boidVar2, boidVar3, boidVar4};
    }
}
