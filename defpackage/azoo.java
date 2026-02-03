package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azoo {
    public final azop a;
    public final azop b;
    public final azop c;
    public final azop d;
    public final azop e;
    public final azop f;
    final azop[] g;

    public azoo() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "read_reports_backup._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: azoa
            @Override // java.util.function.Supplier
            public final Object get() {
                return azph.a();
            }
        };
        dqogVar.c = new dqps() { // from class: azoj
        };
        azop azopVar = new azop(dqprVarM.a());
        this.a = azopVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: azok
            @Override // java.util.function.Supplier
            public final Object get() {
                return azlc.c.a;
            }
        };
        dqogVar2.a = "read_reports_backup.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: azol
            @Override // java.util.function.Supplier
            public final Object get() {
                return azph.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: azom
        };
        azop azopVar2 = new azop(dqprVarM2.a());
        this.b = azopVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.k(true);
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: azon
            @Override // java.util.function.Supplier
            public final Object get() {
                return azut.c.a;
            }
        };
        dqogVar3.a = "read_reports_backup.participant_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: azob
            @Override // java.util.function.Supplier
            public final Object get() {
                return azph.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: azoc
        };
        azop azopVar3 = new azop(dqprVarM3.a());
        this.c = azopVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqogVar4.a = "read_reports_backup.receive_time";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: azod
            @Override // java.util.function.Supplier
            public final Object get() {
                return azph.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: azoe
        };
        azop azopVar4 = new azop(dqprVarM4.a());
        this.d = azopVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "read_reports_backup.read_time";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: azof
            @Override // java.util.function.Supplier
            public final Object get() {
                return azph.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: azog
        };
        azop azopVar5 = new azop(dqprVarM5.a());
        this.e = azopVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 2;
        dqogVar6.a = "read_reports_backup.ftd_time";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: azoh
            @Override // java.util.function.Supplier
            public final Object get() {
                return azph.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: azoi
        };
        azop azopVar6 = new azop(dqprVarM6.a());
        this.f = azopVar6;
        this.g = new azop[]{azopVar, azopVar2, azopVar3, azopVar4, azopVar5, azopVar6};
    }
}
