package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvcm {
    public final bvcn a;
    public final bvcn b;
    public final bvcn c;
    public final bvcn d;
    final bvcn[] e;

    public bvcm() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bvcd
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d.a;
            }
        };
        dqogVar.a = "vmt.part_id";
        dqprVarM.f(true);
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bvce
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.c();
            }
        };
        dqogVar.c = new dqps() { // from class: bvcf
        };
        bvcn bvcnVar = new bvcn(dqprVarM.a());
        this.a = bvcnVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqogVar2.a = "vmt.vmt_status";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bvcg
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.c();
            }
        };
        dqogVar2.c = new dqps() { // from class: bvch
        };
        bvcn bvcnVar2 = new bvcn(dqprVarM2.a());
        this.b = bvcnVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "vmt.text";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bvci
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.c();
            }
        };
        dqogVar3.c = new dqps() { // from class: bvcj
        };
        bvcn bvcnVar3 = new bvcn(dqprVarM3.a());
        this.c = bvcnVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "vmt.locale";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bvck
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.c();
            }
        };
        dqogVar4.c = new dqps() { // from class: bvcl
        };
        bvcn bvcnVar4 = new bvcn(dqprVarM4.a());
        this.d = bvcnVar4;
        this.e = new bvcn[]{bvcnVar, bvcnVar2, bvcnVar3, bvcnVar4};
    }
}
