package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btlj {
    public final btlk a;
    public final btlk b;
    public final btlk c;
    public final btlk d;
    public final btlk e;
    public final btlk f;
    public final btlk g;
    public final btlk h;
    public final btlk i;
    final btlk[] j;

    public btlj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "remote_registrations_table.tachyon_registration_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btkr
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar.c = new dqps() { // from class: btli
        };
        btlk btlkVar = new btlk(dqprVarM.a());
        this.a = btlkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqogVar2.a = "remote_registrations_table.etouffee";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btks
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: btkt
        };
        btlk btlkVar2 = new btlk(dqprVarM2.a());
        this.b = btlkVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqogVar3.a = "remote_registrations_table.better_etouffee";
        dqprVarM3.i(46000);
        dqogVar3.d = new Supplier() { // from class: btku
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: btkv
        };
        btlk btlkVar3 = new btlk(dqprVarM3.a());
        this.c = btlkVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqogVar4.a = "remote_registrations_table.messages_feature_hash";
        dqprVarM4.i(58800);
        dqogVar4.d = new Supplier() { // from class: btkw
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: btkx
        };
        btlk btlkVar4 = new btlk(dqprVarM4.a());
        this.d = btlkVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "remote_registrations_table.last_modified_timestamp";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: btky
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: btkz
        };
        btlk btlkVar5 = new btlk(dqprVarM5.a());
        this.e = btlkVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqogVar6.a = "remote_registrations_table.identity_key";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: btla
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: btlb
        };
        btlk btlkVar6 = new btlk(dqprVarM6.a());
        this.f = btlkVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "remote_registrations_table.updated_at_hash";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: btlc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: btld
        };
        btlk btlkVar7 = new btlk(dqprVarM7.a());
        this.g = btlkVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqogVar8.a = "remote_registrations_table.guaranteed_fresh_as_of_timestamp";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: btle
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: btlf
        };
        btlk btlkVar8 = new btlk(dqprVarM8.a());
        this.h = btlkVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 2;
        dqogVar9.a = "remote_registrations_table.is_updated_at_hash_valid";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: btlg
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmf.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: btlh
        };
        btlk btlkVar9 = new btlk(dqprVarM9.a());
        this.i = btlkVar9;
        this.j = new btlk[]{btlkVar, btlkVar2, btlkVar3, btlkVar4, btlkVar5, btlkVar6, btlkVar7, btlkVar8, btlkVar9};
    }
}
