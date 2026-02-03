package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btrt {
    public final btru a;
    public final btru b;
    public final btru c;
    public final btru d;
    public final btru e;
    final btru[] f;

    public btrt() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "restore_workflow_files._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btri
            @Override // java.util.function.Supplier
            public final Object get() {
                return btsn.a();
            }
        };
        dqogVar.c = new dqps() { // from class: btrl
        };
        btru btruVar = new btru(dqprVarM.a());
        this.a = btruVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: btrm
            @Override // java.util.function.Supplier
            public final Object get() {
                return btqy.c.a;
            }
        };
        dqogVar2.a = "restore_workflow_files.workflow_execution_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return btsn.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: btro
        };
        btru btruVar2 = new btru(dqprVarM2.a());
        this.b = btruVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqprVarM3.k(true);
        dqogVar3.a = "restore_workflow_files.backup_file";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return btsn.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: btrq
        };
        btru btruVar3 = new btru(dqprVarM3.a());
        this.c = btruVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqogVar4.a = "restore_workflow_files.file_type";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: btrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return btsn.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: btrs
        };
        btru btruVar4 = new btru(dqprVarM4.a());
        this.d = btruVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqprVarM5.k(true);
        dqogVar5.a = "restore_workflow_files.status";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: btrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return btsn.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: btrk
        };
        btru btruVar5 = new btru(dqprVarM5.a());
        this.e = btruVar5;
        this.f = new btru[]{btruVar, btruVar2, btruVar3, btruVar4, btruVar5};
    }
}
