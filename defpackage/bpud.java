package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpud {
    public final bpue a;
    public final bpue b;
    public final bpue c;
    final bpue[] d;

    public bpud() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "link_preview_participants_table._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bptw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bput.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bptx
        };
        bpue bpueVar = new bpue(dqprVarM.a());
        this.a = bpueVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bpty
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar2.a = "link_preview_participants_table.participant_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bptz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bput.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bpua
        };
        bpue bpueVar2 = new bpue(dqprVarM2.a());
        this.b = bpueVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "link_preview_participants_table.manual_link_preview_count";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bpub
            @Override // java.util.function.Supplier
            public final Object get() {
                return bput.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bpuc
        };
        bpue bpueVar3 = new bpue(dqprVarM3.a());
        this.c = bpueVar3;
        this.d = new bpue[]{bpueVar, bpueVar2, bpueVar3};
    }
}
