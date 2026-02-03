package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brsu {
    public final brsv A;
    public final brsv B;
    public final brsv C;
    public final brsv D;
    public final brsv E;
    public final brsv F;
    public final brsv G;
    public final brsv H;
    public final brsv I;
    public final brsv J;
    public final brsv K;
    public final brsv L;
    public final brsv M;
    public final brsv N;
    public final brsv O;
    public final brsv P;
    public final brsv Q;
    public final brsv R;
    public final brsv S;
    public final brsv T;
    public final brsv U;
    public final brsv V;
    public final brsv W;
    final brsv[] X;
    public final brsv a;
    public final brsv b;
    public final brsv c;
    public final brsv d;
    public final brsv e;
    public final brsv f;
    public final brsv g;
    public final brsv h;
    public final brsv i;
    public final brsv j;
    public final brsv k;
    public final brsv l;
    public final brsv m;
    public final brsv n;
    public final brsv o;
    public final brsv p;
    public final brsv q;
    public final brsv r;
    public final brsv s;
    public final brsv t;
    public final brsv u;
    public final brsv v;
    public final brsv w;
    public final brsv x;
    public final brsv y;
    public final brsv z;

    public brsu() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "participants_audit_log._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: broz
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar.c = new dqps() { // from class: brpb
        };
        brsv brsvVar = new brsv(dqprVarM.a());
        this.a = brsvVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.k(true);
        dqogVar2.a = "participants_audit_log.operation_datetime";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: brpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: brpz
        };
        brsv brsvVar2 = new brsv(dqprVarM2.a());
        this.b = brsvVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 2;
        dqprVarM3.k(true);
        dqogVar3.a = "participants_audit_log.operation_type";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: brql
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: brqx
        };
        brsv brsvVar3 = new brsv(dqprVarM3.a());
        this.c = brsvVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 2;
        dqprVarM4.k(true);
        dqogVar4.a = "participants_audit_log.participant_id";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: brrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: brrv
        };
        brsv brsvVar4 = new brsv(dqprVarM4.a());
        this.d = brsvVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "participants_audit_log.my_identity_token";
        dqprVarM5.i(59930);
        dqogVar5.d = new Supplier() { // from class: brsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: brss
        };
        brsv brsvVar5 = new brsv(dqprVarM5.a());
        this.e = brsvVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqprVarM6.e(true);
        dqogVar6.b = new Supplier() { // from class: brpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar6.a = "participants_audit_log.my_identity_token_foreign_key";
        dqprVarM6.i(60160);
        dqogVar6.d = new Supplier() { // from class: brpv
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: brqg
        };
        brsv brsvVar6 = new brsv(dqprVarM6.a());
        this.f = brsvVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 1;
        dqogVar7.a = "participants_audit_log.sub_id";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: brqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: brrc
        };
        brsv brsvVar7 = new brsv(dqprVarM7.a());
        this.g = brsvVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqogVar8.a = "participants_audit_log.sim_slot_id";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: brrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: brry
        };
        brsv brsvVar8 = new brsv(dqprVarM8.a());
        this.h = brsvVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqogVar9.a = "participants_audit_log.normalized_destination";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: brsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: brst
        };
        brsv brsvVar9 = new brsv(dqprVarM9.a());
        this.i = brsvVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 4;
        dqogVar10.a = "participants_audit_log.send_destination";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: brpa
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: brpc
        };
        brsv brsvVar10 = new brsv(dqprVarM10.a());
        this.j = brsvVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 4;
        dqogVar11.a = "participants_audit_log.display_destination";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: brpd
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: brpe
        };
        brsv brsvVar11 = new brsv(dqprVarM11.a());
        this.k = brsvVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqogVar12.a = "participants_audit_log.comparable_destination";
        dqprVarM12.i(-1);
        dqogVar12.d = new Supplier() { // from class: brpf
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar12.c = new dqps() { // from class: brpg
        };
        brsv brsvVar12 = new brsv(dqprVarM12.a());
        this.l = brsvVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 4;
        dqogVar13.a = "participants_audit_log.country_code";
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: brph
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar13.c = new dqps() { // from class: brpi
        };
        brsv brsvVar13 = new brsv(dqprVarM13.a());
        this.m = brsvVar13;
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 2;
        dqogVar14.a = "participants_audit_log.recipient_id";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: brpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar14.c = new dqps() { // from class: brpl
        };
        brsv brsvVar14 = new brsv(dqprVarM14.a());
        this.n = brsvVar14;
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqogVar15.a = "participants_audit_log.recipient_canonical_address";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: brpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar15.c = new dqps() { // from class: brpo
        };
        brsv brsvVar15 = new brsv(dqprVarM15.a());
        this.o = brsvVar15;
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 4;
        dqogVar16.a = "participants_audit_log.full_name";
        dqprVarM16.i(-1);
        dqogVar16.d = new Supplier() { // from class: brpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar16.c = new dqps() { // from class: brpq
        };
        brsv brsvVar16 = new brsv(dqprVarM16.a());
        this.p = brsvVar16;
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 4;
        dqogVar17.a = "participants_audit_log.first_name";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: brpr
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar17.c = new dqps() { // from class: brps
        };
        brsv brsvVar17 = new brsv(dqprVarM17.a());
        this.q = brsvVar17;
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 4;
        dqogVar18.a = "participants_audit_log.profile_photo_uri";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: brpt
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar18.c = new dqps() { // from class: brpu
        };
        brsv brsvVar18 = new brsv(dqprVarM18.a());
        this.r = brsvVar18;
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 4;
        dqogVar19.a = "participants_audit_log.contact_photo_uri";
        dqprVarM19.i(59850);
        dqogVar19.d = new Supplier() { // from class: brpw
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar19.c = new dqps() { // from class: brpx
        };
        brsv brsvVar19 = new brsv(dqprVarM19.a());
        this.s = brsvVar19;
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 1;
        dqogVar20.a = "participants_audit_log.contact_id";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: brpy
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar20.c = new dqps() { // from class: brqa
        };
        brsv brsvVar20 = new brsv(dqprVarM20.a());
        this.t = brsvVar20;
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 4;
        dqogVar21.a = "participants_audit_log.lookup_key";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: brqb
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar21.c = new dqps() { // from class: brqc
        };
        brsv brsvVar21 = new brsv(dqprVarM21.a());
        this.u = brsvVar21;
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqogVar22.a = "participants_audit_log.color_palette_index";
        dqprVarM22.i(-1);
        dqogVar22.d = new Supplier() { // from class: brqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar22.c = new dqps() { // from class: brqe
        };
        brsv brsvVar22 = new brsv(dqprVarM22.a());
        this.v = brsvVar22;
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 1;
        dqogVar23.a = "participants_audit_log.color_type";
        dqprVarM23.i(-1);
        dqogVar23.d = new Supplier() { // from class: brqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar23.c = new dqps() { // from class: brqh
        };
        brsv brsvVar23 = new brsv(dqprVarM23.a());
        this.w = brsvVar23;
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "participants_audit_log.extended_color";
        dqprVarM24.i(-1);
        dqogVar24.d = new Supplier() { // from class: brqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar24.c = new dqps() { // from class: brqj
        };
        brsv brsvVar24 = new brsv(dqprVarM24.a());
        this.x = brsvVar24;
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 1;
        dqogVar25.a = "participants_audit_log.blocked";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: brqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar25.c = new dqps() { // from class: brqm
        };
        brsv brsvVar25 = new brsv(dqprVarM25.a());
        this.y = brsvVar25;
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 4;
        dqogVar26.a = "participants_audit_log.subscription_name";
        dqprVarM26.i(-1);
        dqogVar26.d = new Supplier() { // from class: brqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar26.c = new dqps() { // from class: brqo
        };
        brsv brsvVar26 = new brsv(dqprVarM26.a());
        this.z = brsvVar26;
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 1;
        dqogVar27.a = "participants_audit_log.subscription_color";
        dqprVarM27.i(-1);
        dqogVar27.d = new Supplier() { // from class: brqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar27.c = new dqps() { // from class: brqq
        };
        brsv brsvVar27 = new brsv(dqprVarM27.a());
        this.A = brsvVar27;
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "participants_audit_log.contact_destination";
        dqprVarM28.i(-1);
        dqogVar28.d = new Supplier() { // from class: brqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar28.c = new dqps() { // from class: brqt
        };
        brsv brsvVar28 = new brsv(dqprVarM28.a());
        this.B = brsvVar28;
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 1;
        dqogVar29.a = "participants_audit_log.participant_type";
        dqprVarM29.i(-1);
        dqogVar29.d = new Supplier() { // from class: brqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar29.c = new dqps() { // from class: brqv
        };
        brsv brsvVar29 = new brsv(dqprVarM29.a());
        this.C = brsvVar29;
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 1;
        dqogVar30.a = "participants_audit_log.video_reachability";
        dqprVarM30.i(-1);
        dqogVar30.d = new Supplier() { // from class: brqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar30.c = new dqps() { // from class: brqy
        };
        brsv brsvVar30 = new brsv(dqprVarM30.a());
        this.D = brsvVar30;
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 4;
        dqogVar31.a = "participants_audit_log.alias";
        dqprVarM31.i(-1);
        dqogVar31.d = new Supplier() { // from class: brqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar31.c = new dqps() { // from class: brra
        };
        brsv brsvVar31 = new brsv(dqprVarM31.a());
        this.E = brsvVar31;
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "participants_audit_log.is_spam";
        dqprVarM32.i(-1);
        dqogVar32.d = new Supplier() { // from class: brrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar32.c = new dqps() { // from class: brrd
        };
        brsv brsvVar32 = new brsv(dqprVarM32.a());
        this.F = brsvVar32;
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqogVar33.a = "participants_audit_log.is_spam_source";
        dqprVarM33.i(-1);
        dqogVar33.d = new Supplier() { // from class: brre
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar33.c = new dqps() { // from class: brrf
        };
        brsv brsvVar33 = new brsv(dqprVarM33.a());
        this.G = brsvVar33;
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 4;
        dqogVar34.a = "participants_audit_log.cms_id";
        dqprVarM34.i(-1);
        dqogVar34.d = new Supplier() { // from class: brrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar34.c = new dqps() { // from class: brrh
        };
        brsv brsvVar34 = new brsv(dqprVarM34.a());
        this.H = brsvVar34;
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqogVar35.a = "participants_audit_log.latest_verification_status";
        dqprVarM35.i(-1);
        dqogVar35.d = new Supplier() { // from class: brri
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar35.c = new dqps() { // from class: brrk
        };
        brsv brsvVar35 = new brsv(dqprVarM35.a());
        this.I = brsvVar35;
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 4;
        dqogVar36.a = "participants_audit_log.profile_photo_blob_id";
        dqprVarM36.i(-1);
        dqogVar36.d = new Supplier() { // from class: brrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar36.c = new dqps() { // from class: brrm
        };
        brsv brsvVar36 = new brsv(dqprVarM36.a());
        this.J = brsvVar36;
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 5;
        dqogVar37.a = "participants_audit_log.profile_photo_encryption_key";
        dqprVarM37.i(-1);
        dqogVar37.d = new Supplier() { // from class: brro
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar37.c = new dqps() { // from class: brrp
        };
        brsv brsvVar37 = new brsv(dqprVarM37.a());
        this.K = brsvVar37;
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 1;
        dqogVar38.a = "participants_audit_log.directory_id";
        dqprVarM38.i(-1);
        dqogVar38.d = new Supplier() { // from class: brrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar38.c = new dqps() { // from class: brrr
        };
        brsv brsvVar38 = new brsv(dqprVarM38.a());
        this.L = brsvVar38;
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 1;
        dqogVar39.a = "participants_audit_log.is_check_constraint_enabled_via_phenotype";
        dqprVarM39.i(-1);
        dqogVar39.d = new Supplier() { // from class: brrs
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar39.c = new dqps() { // from class: brrt
        };
        brsv brsvVar39 = new brsv(dqprVarM39.a());
        this.M = brsvVar39;
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "participants_audit_log.is_valid_phone_number_data";
        dqprVarM40.i(-1);
        dqogVar40.d = new Supplier() { // from class: brru
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar40.c = new dqps() { // from class: brrw
        };
        brsv brsvVar40 = new brsv(dqprVarM40.a());
        this.N = brsvVar40;
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 2;
        dqogVar41.a = "participants_audit_log.duplicate_of";
        dqprVarM41.i(-1);
        dqogVar41.d = new Supplier() { // from class: brrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar41.c = new dqps() { // from class: brrz
        };
        brsv brsvVar41 = new brsv(dqprVarM41.a());
        this.O = brsvVar41;
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 1;
        dqogVar42.a = "participants_audit_log.cms_life_cycle";
        dqprVarM42.i(-1);
        dqogVar42.d = new Supplier() { // from class: brsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar42.c = new dqps() { // from class: brsb
        };
        brsv brsvVar42 = new brsv(dqprVarM42.a());
        this.P = brsvVar42;
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "participants_audit_log.norm_ui_status";
        dqprVarM43.i(-1);
        dqogVar43.d = new Supplier() { // from class: brsc
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar43.c = new dqps() { // from class: brsd
        };
        brsv brsvVar43 = new brsv(dqprVarM43.a());
        this.Q = brsvVar43;
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 4;
        dqogVar44.a = "participants_audit_log.last_modified_by_key";
        dqprVarM44.i(59440);
        dqogVar44.d = new Supplier() { // from class: brse
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar44.c = new dqps() { // from class: brsf
        };
        brsv brsvVar44 = new brsv(dqprVarM44.a());
        this.R = brsvVar44;
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "participants_audit_log.name_source";
        dqprVarM45.i(59550);
        dqogVar45.d = new Supplier() { // from class: brsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar45.c = new dqps() { // from class: brsi
        };
        brsv brsvVar45 = new brsv(dqprVarM45.a());
        this.S = brsvVar45;
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 1;
        dqogVar46.a = "participants_audit_log.photo_source";
        dqprVarM46.i(59550);
        dqogVar46.d = new Supplier() { // from class: brsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar46.c = new dqps() { // from class: brsl
        };
        brsv brsvVar46 = new brsv(dqprVarM46.a());
        this.T = brsvVar46;
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 1;
        dqogVar47.a = "participants_audit_log.profile_photo_user_preference";
        dqprVarM47.i(60060);
        dqogVar47.d = new Supplier() { // from class: brsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar47.c = new dqps() { // from class: brsn
        };
        brsv brsvVar47 = new brsv(dqprVarM47.a());
        this.U = brsvVar47;
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 5;
        dqogVar48.a = "participants_audit_log.contact_metadata";
        dqprVarM48.i(60070);
        dqogVar48.d = new Supplier() { // from class: brso
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar48.c = new dqps() { // from class: brsp
        };
        brsv brsvVar48 = new brsv(dqprVarM48.a());
        this.V = brsvVar48;
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 1;
        dqogVar49.a = "participants_audit_log.is_enterprise_contact";
        dqprVarM49.i(60640);
        dqogVar49.d = new Supplier() { // from class: brsq
            @Override // java.util.function.Supplier
            public final Object get() {
                return brvd.b();
            }
        };
        dqogVar49.c = new dqps() { // from class: brsr
        };
        brsv brsvVar49 = new brsv(dqprVarM49.a());
        this.W = brsvVar49;
        this.X = new brsv[]{brsvVar, brsvVar2, brsvVar3, brsvVar4, brsvVar5, brsvVar6, brsvVar7, brsvVar8, brsvVar9, brsvVar10, brsvVar11, brsvVar12, brsvVar13, brsvVar14, brsvVar15, brsvVar16, brsvVar17, brsvVar18, brsvVar19, brsvVar20, brsvVar21, brsvVar22, brsvVar23, brsvVar24, brsvVar25, brsvVar26, brsvVar27, brsvVar28, brsvVar29, brsvVar30, brsvVar31, brsvVar32, brsvVar33, brsvVar34, brsvVar35, brsvVar36, brsvVar37, brsvVar38, brsvVar39, brsvVar40, brsvVar41, brsvVar42, brsvVar43, brsvVar44, brsvVar45, brsvVar46, brsvVar47, brsvVar48, brsvVar49};
    }
}
