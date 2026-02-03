package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmt {
    public final btmu a;
    public final btmu b;
    public final btmu c;
    final btmu[] d;

    public btmt() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "remote_user_id_info_table.remote_user_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btmn
            @Override // java.util.function.Supplier
            public final Object get() {
                return btnj.b();
            }
        };
        dqogVar.c = new dqps() { // from class: btmo
        };
        btmu btmuVar = new btmu(dqprVarM.a());
        this.a = btmuVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqogVar2.a = "remote_user_id_info_table.last_modified_timestamp";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btmp
            @Override // java.util.function.Supplier
            public final Object get() {
                return btnj.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: btmq
        };
        btmu btmuVar2 = new btmu(dqprVarM2.a());
        this.b = btmuVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqogVar3.a = "remote_user_id_info_table.guaranteed_fresh_as_of_timestamp";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btmr
            @Override // java.util.function.Supplier
            public final Object get() {
                return btnj.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: btms
        };
        btmu btmuVar3 = new btmu(dqprVarM3.a());
        this.c = btmuVar3;
        this.d = new btmu[]{btmuVar, btmuVar2, btmuVar3};
    }
}
