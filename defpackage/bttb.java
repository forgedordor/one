package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bttb {
    public final bttc a;
    public final bttc b;
    public final bttc c;
    final bttc[] d;

    public bttb() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.d(true);
        dqogVar.a = "restore_workflow_scratch_duplicates.key";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttr.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btsw
        };
        bttc bttcVar = new bttc(dqprVarM.a());
        this.a = bttcVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "restore_workflow_scratch_duplicates.backup_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttr.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btsy
        };
        bttc bttcVar2 = new bttc(dqprVarM2.a());
        this.b = bttcVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.d(true);
        dqogVar3.a = "restore_workflow_scratch_duplicates.bugle_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttr.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: btta
        };
        bttc bttcVar3 = new bttc(dqprVarM3.a());
        this.c = bttcVar3;
        this.d = new bttc[]{bttcVar, bttcVar2, bttcVar3};
    }
}
