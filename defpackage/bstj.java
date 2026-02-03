package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bstj {
    public final bstk a;
    public final bstk b;
    public final bstk c;
    public final bstk d;
    public final bstk e;
    public final bstk f;
    public final bstk g;
    public final bstk h;
    public final bstk i;
    public final bstk j;
    public final bstk k;
    public final bstk l;
    public final bstk m;
    public final bstk n;
    public final bstk o;
    public final bstk p;
    public final bstk q;
    public final bstk r;
    public final bstk s;
    public final bstk t;
    final bstk[] u;

    public bstj() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "profiles_table._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bsru
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bsrw
        };
        bstk bstkVar = new bstk(dqprVarM.a());
        this.a = bstkVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bssi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar2.a = "profiles_table.participant_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bssu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bssw
        };
        bstk bstkVar2 = new bstk(dqprVarM2.a());
        this.b = bstkVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "profiles_table.person_id";
        dqprVarM3.i(60170);
        dqogVar3.d = new Supplier() { // from class: bssx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bssy
        };
        bstk bstkVar3 = new bstk(dqprVarM3.a());
        this.c = bstkVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "profiles_table.profile_access_token";
        dqprVarM4.i(60170);
        dqogVar4.d = new Supplier() { // from class: bssz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bsta
        };
        bstk bstkVar4 = new bstk(dqprVarM4.a());
        this.d = bstkVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 2;
        dqogVar5.a = "profiles_table.sending_self_profile_interaction_state";
        dqprVarM5.i(60200);
        dqogVar5.d = new Supplier() { // from class: bstc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bssf
        };
        bstk bstkVar5 = new bstk(dqprVarM5.a());
        this.e = bstkVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 5;
        dqogVar6.a = "profiles_table.self_profile_sharing_metadata";
        dqprVarM6.i(60340);
        dqogVar6.d = new Supplier() { // from class: bssq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bstb
        };
        bstk bstkVar6 = new bstk(dqprVarM6.a());
        this.f = bstkVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "profiles_table.first_name";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bstd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bste
        };
        bstk bstkVar7 = new bstk(dqprVarM7.a());
        this.g = bstkVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqogVar8.a = "profiles_table.last_name";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bstf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bstg
        };
        bstk bstkVar8 = new bstk(dqprVarM8.a());
        this.h = bstkVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqogVar9.a = "profiles_table.display_name";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bsth
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bsti
        };
        bstk bstkVar9 = new bstk(dqprVarM9.a());
        this.i = bstkVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqogVar10.a = "profiles_table.photo_uri";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bsrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: bsrx
        };
        bstk bstkVar10 = new bstk(dqprVarM10.a());
        this.j = bstkVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 4;
        dqogVar11.a = "profiles_table.sender_last_updated_time";
        dqprVarM11.i(60170);
        dqogVar11.d = new Supplier() { // from class: bsry
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: bsrz
        };
        bstk bstkVar11 = new bstk(dqprVarM11.a());
        this.k = bstkVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "profiles_table.sender_last_updated_time_from_rcs";
        dqprVarM12.i(60200);
        dqogVar12.d = new Supplier() { // from class: bssa
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar12.c = new dqps() { // from class: bssb
        };
        bstk bstkVar12 = new bstk(dqprVarM12.a());
        this.l = bstkVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqprVarM13.d(true);
        dqogVar13.a = "profiles_table.contact_lookup_key";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bssc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar13.c = new dqps() { // from class: bssd
        };
        bstk bstkVar13 = new bstk(dqprVarM13.a());
        this.m = bstkVar13;
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 4;
        dqprVarM14.k(true);
        dqprVarM14.d(true);
        dqogVar14.a = "profiles_table.phone_number";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: bsse
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar14.c = new dqps() { // from class: bssg
        };
        bstk bstkVar14 = new bstk(dqprVarM14.a());
        this.n = bstkVar14;
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 1;
        dqogVar15.a = "profiles_table.is_self_profile_shareable";
        dqprVarM15.i(60400);
        dqogVar15.d = new Supplier() { // from class: bssh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar15.c = new dqps() { // from class: bssj
        };
        bstk bstkVar15 = new bstk(dqprVarM15.a());
        this.o = bstkVar15;
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 2;
        dqogVar16.a = "profiles_table.has_shared_access_token_with_user";
        dqprVarM16.i(60170);
        dqogVar16.d = new Supplier() { // from class: bssk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar16.c = new dqps() { // from class: bssl
        };
        bstk bstkVar16 = new bstk(dqprVarM16.a());
        this.p = bstkVar16;
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "profiles_table.name_timestamp";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bssm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar17.c = new dqps() { // from class: bssn
        };
        bstk bstkVar17 = new bstk(dqprVarM17.a());
        this.q = bstkVar17;
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 1;
        dqogVar18.a = "profiles_table.photo_timestamp";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bsso
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar18.c = new dqps() { // from class: bssp
        };
        bstk bstkVar18 = new bstk(dqprVarM18.a());
        this.r = bstkVar18;
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "profiles_table.belongs_to_self_gaia";
        dqprVarM19.i(59940);
        dqogVar19.d = new Supplier() { // from class: bssr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar19.c = new dqps() { // from class: bsss
        };
        bstk bstkVar19 = new bstk(dqprVarM19.a());
        this.s = bstkVar19;
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 1;
        dqogVar20.a = "profiles_table.gaia_update_timestamp";
        dqprVarM20.i(59940);
        dqogVar20.d = new Supplier() { // from class: bsst
            @Override // java.util.function.Supplier
            public final Object get() {
                return ProfilesTable.b();
            }
        };
        dqogVar20.c = new dqps() { // from class: bssv
        };
        bstk bstkVar20 = new bstk(dqprVarM20.a());
        this.t = bstkVar20;
        this.u = new bstk[]{bstkVar, bstkVar2, bstkVar3, bstkVar4, bstkVar5, bstkVar6, bstkVar7, bstkVar8, bstkVar9, bstkVar10, bstkVar11, bstkVar12, bstkVar13, bstkVar14, bstkVar15, bstkVar16, bstkVar17, bstkVar18, bstkVar19, bstkVar20};
    }
}
