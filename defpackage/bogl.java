package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bogl {
    public final bogm a;
    public final bogm b;
    public final bogm c;
    public final bogm d;
    public final bogm e;
    public final bogm f;
    public final bogm g;
    final bogm[] h;

    public bogl() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "conversation_to_participants_audit_log._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bofx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bohb.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bogg
        };
        bogm bogmVar = new bogm(dqprVarM.a());
        this.a = bogmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqogVar2.a = "conversation_to_participants_audit_log.operation_datetime";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bogh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bohb.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bogi
        };
        bogm bogmVar2 = new bogm(dqprVarM2.a());
        this.b = bogmVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "conversation_to_participants_audit_log.operation_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bogj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bohb.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bogk
        };
        bogm bogmVar3 = new bogm(dqprVarM3.a());
        this.c = bogmVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.k(true);
        dqogVar4.a = "conversation_to_participants_audit_log.conversation_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bofy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bohb.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bofz
        };
        bogm bogmVar4 = new bogm(dqprVarM4.a());
        this.d = bogmVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqprVarM5.k(true);
        dqogVar5.a = "conversation_to_participants_audit_log.participant_id";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: boga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bohb.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bogb
        };
        bogm bogmVar5 = new bogm(dqprVarM5.a());
        this.e = bogmVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqogVar6.a = "conversation_to_participants_audit_log.rcs_group_join_status";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bogc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bohb.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bogd
        };
        bogm bogmVar6 = new bogm(dqprVarM6.a());
        this.f = bogmVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "conversation_to_participants_audit_log.last_modified_by_key";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: boge
            @Override // java.util.function.Supplier
            public final Object get() {
                return bohb.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bogf
        };
        bogm bogmVar7 = new bogm(dqprVarM7.a());
        this.g = bogmVar7;
        this.h = new bogm[]{bogmVar, bogmVar2, bogmVar3, bogmVar4, bogmVar5, bogmVar6, bogmVar7};
    }
}
