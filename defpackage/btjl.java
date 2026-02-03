package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btjl {
    public final btjm a;
    public final btjm b;
    public final btjm c;
    public final btjm d;
    public final btjm e;
    public final btjm f;
    public final btjm g;
    public final btjm h;
    public final btjm i;
    final btjm[] j;

    public btjl() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "remote_instances._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btit
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar.c = new dqps() { // from class: btjk
        };
        btjm btjmVar = new btjm(dqprVarM.a());
        this.a = btjmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.k(true);
        dqogVar2.a = "remote_instances.remote_instance_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: btiv
        };
        btjm btjmVar2 = new btjm(dqprVarM2.a());
        this.b = btjmVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "remote_instances.etouffee";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: btix
        };
        btjm btjmVar3 = new btjm(dqprVarM3.a());
        this.c = btjmVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "remote_instances.tachyon_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: btiy
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: btiz
        };
        btjm btjmVar4 = new btjm(dqprVarM4.a());
        this.d = btjmVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "remote_instances.last_modified_timestamp";
        dqprVarM5.i(35040);
        dqogVar5.d = new Supplier() { // from class: btja
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: btjb
        };
        btjm btjmVar5 = new btjm(dqprVarM5.a());
        this.e = btjmVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqogVar6.a = "remote_instances.identity_key";
        dqprVarM6.i(38010);
        dqogVar6.d = new Supplier() { // from class: btjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: btjd
        };
        btjm btjmVar6 = new btjm(dqprVarM6.a());
        this.f = btjmVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "remote_instances.updated_at_hash";
        dqprVarM7.i(39040);
        dqogVar7.d = new Supplier() { // from class: btje
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: btjf
        };
        btjm btjmVar7 = new btjm(dqprVarM7.a());
        this.g = btjmVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqogVar8.a = "remote_instances.guaranteed_fresh_as_of_timestamp";
        dqprVarM8.i(40010);
        dqogVar8.d = new Supplier() { // from class: btjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: btjh
        };
        btjm btjmVar8 = new btjm(dqprVarM8.a());
        this.h = btjmVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 2;
        dqogVar9.a = "remote_instances.is_updated_at_hash_valid";
        dqprVarM9.i(40030);
        dqogVar9.d = new Supplier() { // from class: btji
            @Override // java.util.function.Supplier
            public final Object get() {
                return btkh.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: btjj
        };
        btjm btjmVar9 = new btjm(dqprVarM9.a());
        this.i = btjmVar9;
        this.j = new btjm[]{btjmVar, btjmVar2, btjmVar3, btjmVar4, btjmVar5, btjmVar6, btjmVar7, btjmVar8, btjmVar9};
    }
}
