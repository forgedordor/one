package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bouw {
    public final boux a;
    public final boux b;
    final boux[] c;

    public bouw() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "data_upgrade_workers._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bous
            @Override // java.util.function.Supplier
            public final Object get() {
                return bovn.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bout
        };
        boux bouxVar = new boux(dqprVarM.a());
        this.a = bouxVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "data_upgrade_workers.last_update_version";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bouu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bovn.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bouv
        };
        boux bouxVar2 = new boux(dqprVarM2.a());
        this.b = bouxVar2;
        this.c = new boux[]{bouxVar, bouxVar2};
    }
}
