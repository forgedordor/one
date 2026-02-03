package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btzw {
    public final btzx a;
    public final btzx b;
    public final btzx c;
    public final btzx d;
    public final btzx e;
    public final btzx f;
    public final btzx g;
    final btzx[] h;

    public btzw() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "self_profiles._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: btzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return buat.b();
            }
        };
        dqogVar.c = new dqps() { // from class: btzs
        };
        btzx btzxVar = new btzx(dqprVarM.a());
        this.a = btzxVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: btzt
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar2.a = "self_profiles.my_identity_token";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: btzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return buat.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: btzv
        };
        btzx btzxVar2 = new btzx(dqprVarM2.a());
        this.b = btzxVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "self_profiles.limited_profile_display_name";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: btzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return buat.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: btzj
        };
        btzx btzxVar3 = new btzx(dqprVarM3.a());
        this.c = btzxVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "self_profiles.photo_uri";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: btzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return buat.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: btzl
        };
        btzx btzxVar4 = new btzx(dqprVarM4.a());
        this.d = btzxVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "self_profiles.is_self_profile_shareable";
        dqprVarM5.i(60400);
        dqogVar5.d = new Supplier() { // from class: btzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return buat.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: btzn
        };
        btzx btzxVar5 = new btzx(dqprVarM5.a());
        this.e = btzxVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 1;
        dqogVar6.a = "self_profiles.belongs_to_self_gaia";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: btzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return buat.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: btzp
        };
        btzx btzxVar6 = new btzx(dqprVarM6.a());
        this.f = btzxVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 1;
        dqogVar7.a = "self_profiles.update_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: btzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buat.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: btzr
        };
        btzx btzxVar7 = new btzx(dqprVarM7.a());
        this.g = btzxVar7;
        this.h = new btzx[]{btzxVar, btzxVar2, btzxVar3, btzxVar4, btzxVar5, btzxVar6, btzxVar7};
    }
}
