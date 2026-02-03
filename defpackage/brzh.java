package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brzh {
    public final brzi A;
    public final brzi B;
    public final brzi C;
    public final brzi D;
    public final brzi E;
    public final brzi F;
    public final brzi G;
    public final brzi H;
    public final brzi I;
    public final brzi J;
    public final brzi K;
    public final brzi L;
    public final brzi M;
    public final brzi N;
    public final brzi O;
    public final brzi P;
    public final brzi Q;
    public final brzi R;
    public final brzi S;
    public final brzi T;
    final brzi[] U;
    public final brzi a;
    public final brzi b;
    public final brzi c;
    public final brzi d;
    public final brzi e;
    public final brzi f;
    public final brzi g;
    public final brzi h;
    public final brzi i;
    public final brzi j;
    public final brzi k;
    public final brzi l;
    public final brzi m;
    public final brzi n;
    public final brzi o;
    public final brzi p;
    public final brzi q;
    public final brzi r;
    public final brzi s;
    public final brzi t;
    public final brzi u;
    public final brzi v;
    public final brzi w;
    public final brzi x;
    public final brzi y;
    public final brzi z;

    public brzh() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "participants._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: brvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar.c = new dqps() { // from class: brvt
        };
        brzi brziVar = new brzi(dqprVarM.a());
        this.a = brziVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "participants.my_identity_token";
        dqprVarM2.i(59930);
        dqogVar2.d = new Supplier() { // from class: brwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar2.c = new dqps() { // from class: brwr
        };
        brzi brziVar2 = new brzi(dqprVarM2.a());
        this.b = brziVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: brxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar3.a = "participants.my_identity_token_foreign_key";
        dqprVarM3.i(60160);
        dqogVar3.d = new Supplier() { // from class: brxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar3.c = new dqps() { // from class: bryb
        };
        brzi brziVar3 = new brzi(dqprVarM3.a());
        this.c = brziVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 1;
        dqprVarM4.d(true);
        dqogVar4.a = "participants.sub_id";
        dqprVarM4.f(true);
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bryn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar4.c = new dqps() { // from class: bryz
        };
        brzi brziVar4 = new brzi(dqprVarM4.a());
        this.d = brziVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 1;
        dqogVar5.a = "participants.sim_slot_id";
        dqprVarM5.i(2000);
        dqogVar5.d = new Supplier() { // from class: brzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar5.c = new dqps() { // from class: brwc
        };
        brzi brziVar5 = new brzi(dqprVarM5.a());
        this.e = brziVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqogVar6.a = "participants.normalized_destination";
        dqprVarM6.f(true);
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: brwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar6.c = new dqps() { // from class: brwy
        };
        brzi brziVar6 = new brzi(dqprVarM6.a());
        this.f = brziVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "participants.send_destination";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: brxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar7.c = new dqps() { // from class: brxu
        };
        brzi brziVar7 = new brzi(dqprVarM7.a());
        this.g = brziVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqogVar8.a = "participants.display_destination";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bryf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar8.c = new dqps() { // from class: bryq
        };
        brzi brziVar8 = new brzi(dqprVarM8.a());
        this.h = brziVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqprVarM9.l(true);
        dqprVarM9.d(true);
        dqogVar9.a = "participants.comparable_destination";
        dqprVarM9.f(true);
        dqprVarM9.i(54040);
        dqogVar9.d = new Supplier() { // from class: brzb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar9.c = new dqps() { // from class: brzg
        };
        brzi brziVar9 = new brzi(dqprVarM9.a());
        this.i = brziVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqogVar10.a = "participants.country_code";
        dqprVarM10.i(54040);
        dqogVar10.d = new Supplier() { // from class: brvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar10.c = new dqps() { // from class: brvu
        };
        brzi brziVar10 = new brzi(dqprVarM10.a());
        this.j = brziVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 2;
        dqprVarM11.l(true);
        dqprVarM11.d(true);
        dqogVar11.a = "participants.recipient_id";
        dqprVarM11.f(true);
        dqprVarM11.i(58090);
        dqogVar11.d = new Supplier() { // from class: brvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar11.c = new dqps() { // from class: brvw
        };
        brzi brziVar11 = new brzi(dqprVarM11.a());
        this.k = brziVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "participants.recipient_canonical_address";
        dqprVarM12.i(58090);
        dqogVar12.d = new Supplier() { // from class: brvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar12.c = new dqps() { // from class: brvy
        };
        brzi brziVar12 = new brzi(dqprVarM12.a());
        this.l = brziVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqogVar13.a = "participants.full_name";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: brvz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar13.c = new dqps() { // from class: brwa
        };
        brzi brziVar13 = new brzi(dqprVarM13.a());
        this.m = brziVar13;
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 4;
        dqogVar14.a = "participants.first_name";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: brwb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar14.c = new dqps() { // from class: brwd
        };
        brzi brziVar14 = new brzi(dqprVarM14.a());
        this.n = brziVar14;
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqogVar15.a = "participants.profile_photo_uri";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: brwe
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar15.c = new dqps() { // from class: brwg
        };
        brzi brziVar15 = new brzi(dqprVarM15.a());
        this.o = brziVar15;
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 4;
        dqogVar16.a = "participants.contact_photo_uri";
        dqprVarM16.i(59850);
        dqogVar16.d = new Supplier() { // from class: brwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar16.c = new dqps() { // from class: brwi
        };
        brzi brziVar16 = new brzi(dqprVarM16.a());
        this.p = brziVar16;
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "participants.contact_id";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: brwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar17.c = new dqps() { // from class: brwk
        };
        brzi brziVar17 = new brzi(dqprVarM17.a());
        this.q = brziVar17;
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 4;
        dqogVar18.a = "participants.lookup_key";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: brwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar18.c = new dqps() { // from class: brwm
        };
        brzi brziVar18 = new brzi(dqprVarM18.a());
        this.r = brziVar18;
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "participants.color_palette_index";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: brwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar19.c = new dqps() { // from class: brwp
        };
        brzi brziVar19 = new brzi(dqprVarM19.a());
        this.s = brziVar19;
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 1;
        dqogVar20.a = "participants.color_type";
        dqprVarM20.i(1000);
        dqogVar20.d = new Supplier() { // from class: brwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar20.c = new dqps() { // from class: brws
        };
        brzi brziVar20 = new brzi(dqprVarM20.a());
        this.t = brziVar20;
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqogVar21.a = "participants.extended_color";
        dqprVarM21.i(10027);
        dqogVar21.d = new Supplier() { // from class: brwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar21.c = new dqps() { // from class: brwu
        };
        brzi brziVar21 = new brzi(dqprVarM21.a());
        this.u = brziVar21;
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqogVar22.a = "participants.blocked";
        dqprVarM22.i(-1);
        dqogVar22.d = new Supplier() { // from class: brwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar22.c = new dqps() { // from class: brww
        };
        brzi brziVar22 = new brzi(dqprVarM22.a());
        this.v = brziVar22;
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqogVar23.a = "participants.subscription_name";
        dqprVarM23.i(2000);
        dqogVar23.d = new Supplier() { // from class: brwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar23.c = new dqps() { // from class: brwz
        };
        brzi brziVar23 = new brzi(dqprVarM23.a());
        this.w = brziVar23;
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "participants.subscription_color";
        dqprVarM24.i(2000);
        dqogVar24.d = new Supplier() { // from class: brxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar24.c = new dqps() { // from class: brxb
        };
        brzi brziVar24 = new brzi(dqprVarM24.a());
        this.x = brziVar24;
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 4;
        dqogVar25.a = "participants.contact_destination";
        dqprVarM25.i(4000);
        dqogVar25.d = new Supplier() { // from class: brxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar25.c = new dqps() { // from class: brxe
        };
        brzi brziVar25 = new brzi(dqprVarM25.a());
        this.y = brziVar25;
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 1;
        dqogVar26.a = "participants.participant_type";
        dqprVarM26.i(12001);
        dqogVar26.d = new Supplier() { // from class: brxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar26.c = new dqps() { // from class: brxg
        };
        brzi brziVar26 = new brzi(dqprVarM26.a());
        this.z = brziVar26;
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 1;
        dqogVar27.a = "participants.video_reachability";
        dqprVarM27.i(13050);
        dqogVar27.d = new Supplier() { // from class: brxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar27.c = new dqps() { // from class: brxi
        };
        brzi brziVar27 = new brzi(dqprVarM27.a());
        this.A = brziVar27;
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "participants.alias";
        dqprVarM28.i(20060);
        dqogVar28.d = new Supplier() { // from class: brxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar28.c = new dqps() { // from class: brxl
        };
        brzi brziVar28 = new brzi(dqprVarM28.a());
        this.B = brziVar28;
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 1;
        dqogVar29.a = "participants.is_spam";
        dqprVarM29.i(24060);
        dqogVar29.d = new Supplier() { // from class: brxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar29.c = new dqps() { // from class: brxn
        };
        brzi brziVar29 = new brzi(dqprVarM29.a());
        this.C = brziVar29;
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 1;
        dqogVar30.a = "participants.is_spam_source";
        dqprVarM30.i(30000);
        dqogVar30.d = new Supplier() { // from class: brxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar30.c = new dqps() { // from class: brxq
        };
        brzi brziVar30 = new brzi(dqprVarM30.a());
        this.D = brziVar30;
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 4;
        dqprVarM31.l(true);
        dqprVarM31.d(true);
        dqogVar31.a = "participants.cms_id";
        dqprVarM31.f(true);
        dqprVarM31.i(31020);
        dqogVar31.d = new Supplier() { // from class: brxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar31.c = new dqps() { // from class: brxs
        };
        brzi brziVar31 = new brzi(dqprVarM31.a());
        this.E = brziVar31;
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "participants.latest_verification_status";
        dqprVarM32.i(31030);
        dqogVar32.d = new Supplier() { // from class: brxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar32.c = new dqps() { // from class: brxv
        };
        brzi brziVar32 = new brzi(dqprVarM32.a());
        this.F = brziVar32;
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 4;
        dqogVar33.a = "participants.profile_photo_blob_id";
        dqprVarM33.i(33000);
        dqogVar33.d = new Supplier() { // from class: brxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar33.c = new dqps() { // from class: brxx
        };
        brzi brziVar33 = new brzi(dqprVarM33.a());
        this.G = brziVar33;
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 5;
        dqogVar34.a = "participants.profile_photo_encryption_key";
        dqprVarM34.i(33060);
        dqogVar34.d = new Supplier() { // from class: brxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar34.c = new dqps() { // from class: brxz
        };
        brzi brziVar34 = new brzi(dqprVarM34.a());
        this.H = brziVar34;
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqogVar35.a = "participants.directory_id";
        dqprVarM35.i(35010);
        dqogVar35.d = new Supplier() { // from class: brya
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar35.c = new dqps() { // from class: bryc
        };
        brzi brziVar35 = new brzi(dqprVarM35.a());
        this.I = brziVar35;
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 1;
        dqogVar36.a = "participants.is_check_constraint_enabled_via_phenotype";
        dqprVarM36.i(55010);
        dqogVar36.d = new Supplier() { // from class: bryd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar36.c = new dqps() { // from class: brye
        };
        brzi brziVar36 = new brzi(dqprVarM36.a());
        this.J = brziVar36;
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 1;
        dqogVar37.a = "participants.is_valid_phone_number_data";
        dqprVarM37.i(55010);
        dqogVar37.d = new Supplier() { // from class: bryg
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar37.c = new dqps() { // from class: bryh
        };
        brzi brziVar37 = new brzi(dqprVarM37.a());
        this.K = brziVar37;
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 2;
        dqprVarM38.d(true);
        dqprVarM38.e(true);
        dqogVar38.b = new Supplier() { // from class: bryi
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar38.a = "participants.duplicate_of";
        dqprVarM38.i(58090);
        dqogVar38.d = new Supplier() { // from class: bryj
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar38.c = new dqps() { // from class: bryk
        };
        brzi brziVar38 = new brzi(dqprVarM38.a());
        this.L = brziVar38;
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 1;
        dqogVar39.a = "participants.cms_life_cycle";
        dqprVarM39.i(58210);
        dqogVar39.d = new Supplier() { // from class: bryl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar39.c = new dqps() { // from class: brym
        };
        brzi brziVar39 = new brzi(dqprVarM39.a());
        this.M = brziVar39;
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "participants.norm_ui_status";
        dqprVarM40.i(58620);
        dqogVar40.d = new Supplier() { // from class: bryo
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar40.c = new dqps() { // from class: bryp
        };
        brzi brziVar40 = new brzi(dqprVarM40.a());
        this.N = brziVar40;
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 4;
        dqogVar41.a = "participants.last_modified_by_key";
        dqprVarM41.i(59440);
        dqogVar41.d = new Supplier() { // from class: bryr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar41.c = new dqps() { // from class: brys
        };
        brzi brziVar41 = new brzi(dqprVarM41.a());
        this.O = brziVar41;
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 1;
        dqogVar42.a = "participants.name_source";
        dqprVarM42.i(59550);
        dqogVar42.d = new Supplier() { // from class: bryt
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar42.c = new dqps() { // from class: bryu
        };
        brzi brziVar42 = new brzi(dqprVarM42.a());
        this.P = brziVar42;
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "participants.photo_source";
        dqprVarM43.i(59550);
        dqogVar43.d = new Supplier() { // from class: bryv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar43.c = new dqps() { // from class: bryw
        };
        brzi brziVar43 = new brzi(dqprVarM43.a());
        this.Q = brziVar43;
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "participants.profile_photo_user_preference";
        dqprVarM44.i(60060);
        dqogVar44.d = new Supplier() { // from class: bryx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar44.c = new dqps() { // from class: bryy
        };
        brzi brziVar44 = new brzi(dqprVarM44.a());
        this.R = brziVar44;
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 5;
        dqogVar45.a = "participants.contact_metadata";
        dqprVarM45.i(60070);
        dqogVar45.d = new Supplier() { // from class: brza
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar45.c = new dqps() { // from class: brzc
        };
        brzi brziVar45 = new brzi(dqprVarM45.a());
        this.S = brziVar45;
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 1;
        dqprVarM46.d(true);
        dqogVar46.a = "participants.is_enterprise_contact";
        dqprVarM46.i(60640);
        dqogVar46.d = new Supplier() { // from class: brzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.g();
            }
        };
        dqogVar46.c = new dqps() { // from class: brze
        };
        brzi brziVar46 = new brzi(dqprVarM46.a());
        this.T = brziVar46;
        this.U = new brzi[]{brziVar, brziVar2, brziVar3, brziVar4, brziVar5, brziVar6, brziVar7, brziVar8, brziVar9, brziVar10, brziVar11, brziVar12, brziVar13, brziVar14, brziVar15, brziVar16, brziVar17, brziVar18, brziVar19, brziVar20, brziVar21, brziVar22, brziVar23, brziVar24, brziVar25, brziVar26, brziVar27, brziVar28, brziVar29, brziVar30, brziVar31, brziVar32, brziVar33, brziVar34, brziVar35, brziVar36, brziVar37, brziVar38, brziVar39, brziVar40, brziVar41, brziVar42, brziVar43, brziVar44, brziVar45, brziVar46};
    }
}
