package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btue {
    public final btuf a;
    public final btuf b;
    public final btuf c;
    final btuf[] d;

    public btue() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.d(true);
        dqogVar.a = "restore_workflow_scratch_suffix.which_database";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btty
            @Override // java.util.function.Supplier
            public final Object get() {
                return btuu.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bttz
        };
        btuf btufVar = new btuf(dqprVarM.a());
        this.a = btufVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "restore_workflow_scratch_suffix.participant_id";
        dqprVarM2.f(true);
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btua
            @Override // java.util.function.Supplier
            public final Object get() {
                return btuu.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btub
        };
        btuf btufVar2 = new btuf(dqprVarM2.a());
        this.b = btufVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.d(true);
        dqogVar3.a = "restore_workflow_scratch_suffix.destination_suffix";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btuu.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: btud
        };
        btuf btufVar3 = new btuf(dqprVarM3.a());
        this.c = btufVar3;
        this.d = new btuf[]{btufVar, btufVar2, btufVar3};
    }
}
