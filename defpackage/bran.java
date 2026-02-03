package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bran {
    public final brao A;
    public final brao B;
    public final brao C;
    public final brao D;
    public final brao E;
    public final brao F;
    public final brao G;
    public final brao H;
    public final brao I;
    public final brao J;
    public final brao K;
    public final brao L;
    public final brao M;
    public final brao N;
    public final brao O;
    public final brao P;
    public final brao Q;
    public final brao R;
    public final brao S;
    public final brao T;
    public final brao U;
    public final brao V;
    public final brao W;
    public final brao X;
    public final brao Y;
    public final brao Z;
    public final brao a;
    public final brao aa;
    public final brao ab;
    public final brao ac;
    public final brao ad;
    public final brao ae;
    public final brao af;
    public final brao ag;
    public final brao ah;
    public final brao ai;
    public final brao aj;
    public final brao ak;
    public final brao al;
    public final brao am;
    public final brao an;
    public final brao ao;
    public final brao ap;
    public final brao aq;
    public final brao ar;
    final brao[] as;
    public final brao b;
    public final brao c;
    public final brao d;
    public final brao e;
    public final brao f;
    public final brao g;
    public final brao h;
    public final brao i;
    public final brao j;
    public final brao k;
    public final brao l;
    public final brao m;
    public final brao n;
    public final brao o;
    public final brao p;
    public final brao q;
    public final brao r;
    public final brao s;
    public final brao t;
    public final brao u;
    public final brao v;
    public final brao w;
    public final brao x;
    public final brao y;
    public final brao z;

    public bran() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "messages._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bquw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar.c = new dqps() { // from class: bqys
        };
        brao braoVar = new brao(dqprVarM.a());
        this.a = braoVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bqze
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar2.a = "messages.conversation_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bqzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar2.c = new dqps() { // from class: brad
        };
        brao braoVar2 = new brao(dqprVarM2.a());
        this.b = braoVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 1;
        dqprVarM3.d(true);
        dqprVarM3.e(true);
        dqogVar3.b = new Supplier() { // from class: bquz
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar3.a = "messages.sender_id";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bqvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar3.c = new dqps() { // from class: bqvx
        };
        brao braoVar3 = new brao(dqprVarM3.a());
        this.c = braoVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "messages.sender_send_destination";
        dqprVarM4.i(54040);
        dqogVar4.d = new Supplier() { // from class: bqwj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar4.c = new dqps() { // from class: bqwv
        };
        brao braoVar4 = new brao(dqprVarM4.a());
        this.d = braoVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "messages.msisdn_receiving_rcs_message";
        dqprVarM5.i(59340);
        dqogVar5.d = new Supplier() { // from class: bqvs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar5.c = new dqps() { // from class: bqxf
        };
        brao braoVar5 = new brao(dqprVarM5.a());
        this.e = braoVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "messages.receiving_network_country";
        dqprVarM6.i(54040);
        dqogVar6.d = new Supplier() { // from class: bqxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar6.c = new dqps() { // from class: bqyd
        };
        brao braoVar6 = new brao(dqprVarM6.a());
        this.f = braoVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 1;
        dqprVarM7.d(true);
        dqogVar7.a = "messages.sent_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bqym
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar7.c = new dqps() { // from class: bqyn
        };
        brao braoVar7 = new brao(dqprVarM7.a());
        this.g = braoVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 1;
        dqogVar8.a = "messages.queue_insert_timestamp";
        dqprVarM8.i(17030);
        dqogVar8.d = new Supplier() { // from class: bqyo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar8.c = new dqps() { // from class: bqyp
        };
        brao braoVar8 = new brao(dqprVarM8.a());
        this.h = braoVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqprVarM9.d(true);
        dqogVar9.a = "messages.received_timestamp";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bqyq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar9.c = new dqps() { // from class: bqyr
        };
        brao braoVar9 = new brao(dqprVarM9.a());
        this.i = braoVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "messages.message_protocol";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bqyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar10.c = new dqps() { // from class: bqyv
        };
        brao braoVar10 = new brao(dqprVarM10.a());
        this.j = braoVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqprVarM11.d(true);
        dqogVar11.a = "messages.message_status";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bqyw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar11.c = new dqps() { // from class: bqyx
        };
        brao braoVar11 = new brao(dqprVarM11.a());
        this.k = braoVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 1;
        dqogVar12.a = "messages.message_report_status";
        dqprVarM12.i(13020);
        dqogVar12.d = new Supplier() { // from class: bqyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar12.c = new dqps() { // from class: bqyz
        };
        brao braoVar12 = new brao(dqprVarM12.a());
        this.l = braoVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqprVarM13.d(true);
        dqogVar13.a = "messages.seen";
        dqprVarM13.f(true);
        dqprVarM13.i(-1);
        dqogVar13.d = new Supplier() { // from class: bqza
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar13.c = new dqps() { // from class: bqzb
        };
        brao braoVar13 = new brao(dqprVarM13.a());
        this.m = braoVar13;
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 1;
        dqprVarM14.d(true);
        dqogVar14.a = "messages.read";
        dqprVarM14.i(-1);
        dqogVar14.d = new Supplier() { // from class: bqzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar14.c = new dqps() { // from class: bqzd
        };
        brao braoVar14 = new brao(dqprVarM14.a());
        this.n = braoVar14;
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqprVarM15.d(true);
        dqogVar15.a = "messages.sms_message_uri";
        dqprVarM15.i(-1);
        dqogVar15.d = new Supplier() { // from class: bqzg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar15.c = new dqps() { // from class: bqzh
        };
        brao braoVar15 = new brao(dqprVarM15.a());
        this.o = braoVar15;
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 1;
        dqogVar16.a = "messages.sms_priority";
        dqprVarM16.i(-1);
        dqogVar16.d = new Supplier() { // from class: bqzi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar16.c = new dqps() { // from class: bqzj
        };
        brao braoVar16 = new brao(dqprVarM16.a());
        this.p = braoVar16;
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "messages.sms_message_size";
        dqprVarM17.i(-1);
        dqogVar17.d = new Supplier() { // from class: bqzk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar17.c = new dqps() { // from class: bqzl
        };
        brao braoVar17 = new brao(dqprVarM17.a());
        this.q = braoVar17;
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 4;
        dqogVar18.a = "messages.mms_subject";
        dqprVarM18.i(-1);
        dqogVar18.d = new Supplier() { // from class: bqzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar18.c = new dqps() { // from class: bqzn
        };
        brao braoVar18 = new brao(dqprVarM18.a());
        this.r = braoVar18;
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 4;
        dqogVar19.a = "messages.mms_transaction_id";
        dqprVarM19.i(-1);
        dqogVar19.d = new Supplier() { // from class: bqzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar19.c = new dqps() { // from class: bqzp
        };
        brao braoVar19 = new brao(dqprVarM19.a());
        this.s = braoVar19;
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 4;
        dqogVar20.a = "messages.mms_content_location";
        dqprVarM20.i(-1);
        dqogVar20.d = new Supplier() { // from class: bqzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar20.c = new dqps() { // from class: bqzt
        };
        brao braoVar20 = new brao(dqprVarM20.a());
        this.t = braoVar20;
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 1;
        dqogVar21.a = "messages.mms_expiry";
        dqprVarM21.i(-1);
        dqogVar21.d = new Supplier() { // from class: bqzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar21.c = new dqps() { // from class: bqzv
        };
        brao braoVar21 = new brao(dqprVarM21.a());
        this.u = braoVar21;
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 1;
        dqprVarM22.d(true);
        dqogVar22.a = "messages.rcs_expiry";
        dqprVarM22.i(59890);
        dqogVar22.d = new Supplier() { // from class: bqzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar22.c = new dqps() { // from class: bqzx
        };
        brao braoVar22 = new brao(dqprVarM22.a());
        this.v = braoVar22;
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqogVar23.a = "messages.mms_retrieve_text";
        dqprVarM23.i(9030);
        dqogVar23.d = new Supplier() { // from class: bqzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar23.c = new dqps() { // from class: bqzz
        };
        brao braoVar23 = new brao(dqprVarM23.a());
        this.w = braoVar23;
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 1;
        dqogVar24.a = "messages.raw_status";
        dqprVarM24.i(-1);
        dqogVar24.d = new Supplier() { // from class: braa
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar24.c = new dqps() { // from class: brac
        };
        brao braoVar24 = new brao(dqprVarM24.a());
        this.x = braoVar24;
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 1;
        dqprVarM25.d(true);
        dqprVarM25.e(true);
        dqogVar25.b = new Supplier() { // from class: brae
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar25.a = "messages.self_id";
        dqprVarM25.i(-1);
        dqogVar25.d = new Supplier() { // from class: braf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar25.c = new dqps() { // from class: brag
        };
        brao braoVar25 = new brao(dqprVarM25.a());
        this.y = braoVar25;
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 4;
        dqprVarM26.d(true);
        dqprVarM26.e(true);
        dqogVar26.b = new Supplier() { // from class: brah
            @Override // java.util.function.Supplier
            public final Object get() {
                return awxh.c.a;
            }
        };
        dqogVar26.a = "messages.my_identity_foreign_key";
        dqprVarM26.i(60160);
        dqogVar26.d = new Supplier() { // from class: brai
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar26.c = new dqps() { // from class: braj
        };
        brao braoVar26 = new brao(dqprVarM26.a());
        this.z = braoVar26;
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 1;
        dqogVar27.a = "messages.retry_start_timestamp";
        dqprVarM27.i(-1);
        dqogVar27.d = new Supplier() { // from class: brak
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar27.c = new dqps() { // from class: bral
        };
        brao braoVar27 = new brao(dqprVarM27.a());
        this.A = braoVar27;
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqprVarM28.d(true);
        dqogVar28.a = "messages.cloud_sync_id";
        dqprVarM28.i(8500);
        dqogVar28.d = new Supplier() { // from class: bqux
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar28.c = new dqps() { // from class: bquy
        };
        brao braoVar28 = new brao(dqprVarM28.a());
        this.B = braoVar28;
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqprVarM29.d(true);
        dqogVar29.a = "messages.rcs_message_id_with_text_type";
        dqprVarM29.f(true);
        dqprVarM29.i(41040);
        dqogVar29.d = new Supplier() { // from class: bqva
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar29.c = new dqps() { // from class: bqvb
        };
        brao braoVar29 = new brao(dqprVarM29.a());
        this.C = braoVar29;
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 1;
        dqogVar30.a = "messages.etouffee_status";
        dqprVarM30.i(29060);
        dqogVar30.d = new Supplier() { // from class: bqvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar30.c = new dqps() { // from class: bqvd
        };
        brao braoVar30 = new brao(dqprVarM30.a());
        this.D = braoVar30;
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 1;
        dqogVar31.a = "messages.verification_status";
        dqprVarM31.i(29090);
        dqogVar31.d = new Supplier() { // from class: bqve
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar31.c = new dqps() { // from class: bqvf
        };
        brao braoVar31 = new brao(dqprVarM31.a());
        this.E = braoVar31;
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "messages.rcs_ui_status";
        dqprVarM32.i(39000);
        dqogVar32.d = new Supplier() { // from class: bqvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar32.c = new dqps() { // from class: bqvi
        };
        brao braoVar32 = new brao(dqprVarM32.a());
        this.F = braoVar32;
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqprVarM33.d(true);
        dqogVar33.a = "messages.is_hidden";
        dqprVarM33.i(30010);
        dqogVar33.d = new Supplier() { // from class: bqvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar33.c = new dqps() { // from class: bqvk
        };
        brao braoVar33 = new brao(dqprVarM33.a());
        this.G = braoVar33;
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 7;
        dqogVar34.a = "messages.rcs_remote_instance";
        dqprVarM34.i(10002);
        dqogVar34.d = new Supplier() { // from class: bqvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar34.c = new dqps() { // from class: bqvn
        };
        brao braoVar34 = new brao(dqprVarM34.a());
        this.H = braoVar34;
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 1;
        dqogVar35.a = "messages.rcs_file_transfer_session_id";
        dqprVarM35.i(10004);
        dqogVar35.d = new Supplier() { // from class: bqvo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar35.c = new dqps() { // from class: bqvp
        };
        brao braoVar35 = new brao(dqprVarM35.a());
        this.I = braoVar35;
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 1;
        dqogVar36.a = "messages.sms_error_code";
        dqprVarM36.i(9000);
        dqogVar36.d = new Supplier() { // from class: bqvq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar36.c = new dqps() { // from class: bqvr
        };
        brao braoVar36 = new brao(dqprVarM36.a());
        this.J = braoVar36;
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 4;
        dqogVar37.a = "messages.sms_error_desc_map_name";
        dqprVarM37.i(9000);
        dqogVar37.d = new Supplier() { // from class: bqvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar37.c = new dqps() { // from class: bqvu
        };
        brao braoVar37 = new brao(dqprVarM37.a());
        this.K = braoVar37;
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 4;
        dqogVar38.a = "messages.correlation_id";
        dqprVarM38.i(9010);
        dqogVar38.d = new Supplier() { // from class: bqvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar38.c = new dqps() { // from class: bqvw
        };
        brao braoVar38 = new brao(dqprVarM38.a());
        this.L = braoVar38;
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 4;
        dqprVarM39.l(true);
        dqprVarM39.d(true);
        dqogVar39.a = "messages.cms_id";
        dqprVarM39.f(true);
        dqprVarM39.i(31010);
        dqogVar39.d = new Supplier() { // from class: bqvy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar39.c = new dqps() { // from class: bqvz
        };
        brao braoVar39 = new brao(dqprVarM39.a());
        this.M = braoVar39;
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 2;
        dqogVar40.a = "messages.cms_last_mod_seq";
        dqprVarM40.i(37040);
        dqogVar40.d = new Supplier() { // from class: bqwa
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar40.c = new dqps() { // from class: bqwb
        };
        brao braoVar40 = new brao(dqprVarM40.a());
        this.N = braoVar40;
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 4;
        dqprVarM41.d(true);
        dqogVar41.a = "messages.web_id";
        dqprVarM41.i(19020);
        dqogVar41.d = new Supplier() { // from class: bqwc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar41.c = new dqps() { // from class: bqwe
        };
        brao braoVar41 = new brao(dqprVarM41.a());
        this.O = braoVar41;
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 1;
        dqogVar42.a = "messages.usage_stats_logging_id";
        dqprVarM42.i(29100);
        dqogVar42.d = new Supplier() { // from class: bqwf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar42.c = new dqps() { // from class: bqwg
        };
        brao braoVar42 = new brao(dqprVarM42.a());
        this.P = braoVar42;
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "messages.send_counter";
        dqprVarM43.i(35030);
        dqogVar43.d = new Supplier() { // from class: bqwh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar43.c = new dqps() { // from class: bqwi
        };
        brao braoVar43 = new brao(dqprVarM43.a());
        this.Q = braoVar43;
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 4;
        dqprVarM44.d(true);
        dqogVar44.a = "messages.original_rcs_message_id";
        dqprVarM44.i(35030);
        dqogVar44.d = new Supplier() { // from class: bqwk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar44.c = new dqps() { // from class: bqwl
        };
        brao braoVar44 = new brao(dqprVarM44.a());
        this.R = braoVar44;
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 5;
        dqogVar45.a = "messages.raw_rcs_message_to_send";
        dqprVarM45.i(60820);
        dqogVar45.d = new Supplier() { // from class: bqwm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar45.c = new dqps() { // from class: bqwn
        };
        brao braoVar45 = new brao(dqprVarM45.a());
        this.S = braoVar45;
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 4;
        dqogVar46.a = "messages.custom_delivery_receipt_mime_type";
        dqprVarM46.i(37020);
        dqogVar46.d = new Supplier() { // from class: bqwp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar46.c = new dqps() { // from class: bqwq
        };
        brao braoVar46 = new brao(dqprVarM46.a());
        this.T = braoVar46;
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 5;
        dqogVar47.a = "messages.custom_delivery_receipt_content";
        dqprVarM47.i(37020);
        dqogVar47.d = new Supplier() { // from class: bqwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar47.c = new dqps() { // from class: bqws
        };
        brao braoVar47 = new brao(dqprVarM47.a());
        this.U = braoVar47;
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 1;
        dqogVar48.a = "messages.report_attempt_acounter";
        dqprVarM48.i(37030);
        dqogVar48.d = new Supplier() { // from class: bqwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar48.c = new dqps() { // from class: bqwu
        };
        brao braoVar48 = new brao(dqprVarM48.a());
        this.V = braoVar48;
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 5;
        dqogVar49.a = "messages.custom_headers";
        dqprVarM49.i(45020);
        dqogVar49.d = new Supplier() { // from class: bqxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar49.c = new dqps() { // from class: bqxn
        };
        brao braoVar49 = new brao(dqprVarM49.a());
        this.W = braoVar49;
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 4;
        dqprVarM50.l(true);
        dqprVarM50.d(true);
        dqogVar50.a = "messages.cms_correlation_id";
        dqprVarM50.f(true);
        dqprVarM50.i(46010);
        dqogVar50.d = new Supplier() { // from class: bqxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar50.c = new dqps() { // from class: bqyj
        };
        brao braoVar50 = new brao(dqprVarM50.a());
        this.X = braoVar50;
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 1;
        dqprVarM51.d(true);
        dqprVarM51.e(true);
        dqogVar51.b = new Supplier() { // from class: bqyu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dqogVar51.a = "messages.group_private_participant";
        dqprVarM51.i(48030);
        dqogVar51.d = new Supplier() { // from class: bqzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar51.c = new dqps() { // from class: bqzq
        };
        brao braoVar51 = new brao(dqprVarM51.a());
        this.Y = braoVar51;
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 1;
        dqprVarM52.d(true);
        dqprVarM52.e(true);
        dqogVar52.b = new Supplier() { // from class: brab
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar52.a = "messages.original_message_id";
        dqprVarM52.i(48030);
        dqogVar52.d = new Supplier() { // from class: bram
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar52.c = new dqps() { // from class: bqvh
        };
        brao braoVar52 = new brao(dqprVarM52.a());
        this.Z = braoVar52;
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 2;
        dqprVarM53.d(true);
        dqprVarM53.e(true);
        dqogVar53.b = new Supplier() { // from class: bqwd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar53.a = "messages.parent_message_id";
        dqprVarM53.i(60950);
        dqogVar53.d = new Supplier() { // from class: bqwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar53.c = new dqps() { // from class: bqww
        };
        brao braoVar53 = new brao(dqprVarM53.a());
        this.aa = braoVar53;
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 1;
        dqogVar54.a = "messages.awaiting_reverse_sync";
        dqprVarM54.i(49060);
        dqogVar54.d = new Supplier() { // from class: bqwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar54.c = new dqps() { // from class: bqwy
        };
        brao braoVar54 = new brao(dqprVarM54.a());
        this.ab = braoVar54;
        dqpr dqprVarM55 = dqpt.m();
        dqog dqogVar55 = (dqog) dqprVarM55;
        dqogVar55.e = 4;
        dqogVar55.a = "messages.old_sms_message_uri";
        dqprVarM55.i(49060);
        dqogVar55.d = new Supplier() { // from class: bqwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar55.c = new dqps() { // from class: bqxa
        };
        brao braoVar55 = new brao(dqprVarM55.a());
        this.ac = braoVar55;
        dqpr dqprVarM56 = dqpt.m();
        dqog dqogVar56 = (dqog) dqprVarM56;
        dqogVar56.e = 4;
        dqprVarM56.l(true);
        dqprVarM56.d(true);
        dqogVar56.a = "messages.draft_id";
        dqprVarM56.f(true);
        dqprVarM56.i(56000);
        dqogVar56.d = new Supplier() { // from class: bqxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar56.c = new dqps() { // from class: bqxd
        };
        brao braoVar56 = new brao(dqprVarM56.a());
        this.ad = braoVar56;
        dqpr dqprVarM57 = dqpt.m();
        dqog dqogVar57 = (dqog) dqprVarM57;
        dqogVar57.e = 1;
        dqogVar57.a = "messages.result_code";
        dqprVarM57.i(58040);
        dqogVar57.d = new Supplier() { // from class: bqxe
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar57.c = new dqps() { // from class: bqxg
        };
        brao braoVar57 = new brao(dqprVarM57.a());
        this.ae = braoVar57;
        dqpr dqprVarM58 = dqpt.m();
        dqog dqogVar58 = (dqog) dqprVarM58;
        dqogVar58.e = 1;
        dqogVar58.a = "messages.cms_life_cycle";
        dqprVarM58.i(58210);
        dqogVar58.d = new Supplier() { // from class: bqxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar58.c = new dqps() { // from class: bqxi
        };
        brao braoVar58 = new brao(dqprVarM58.a());
        this.af = braoVar58;
        dqpr dqprVarM59 = dqpt.m();
        dqog dqogVar59 = (dqog) dqprVarM59;
        dqogVar59.e = 1;
        dqogVar59.a = "messages.mute_priority";
        dqprVarM59.i(60750);
        dqogVar59.d = new Supplier() { // from class: bqxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar59.c = new dqps() { // from class: bqxk
        };
        brao braoVar59 = new brao(dqprVarM59.a());
        this.ag = braoVar59;
        dqpr dqprVarM60 = dqpt.m();
        dqog dqogVar60 = (dqog) dqprVarM60;
        dqogVar60.e = 1;
        dqogVar60.a = "messages.fallback_reason";
        dqprVarM60.i(58710);
        dqogVar60.d = new Supplier() { // from class: bqxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar60.c = new dqps() { // from class: bqxm
        };
        brao braoVar60 = new brao(dqprVarM60.a());
        this.ah = braoVar60;
        dqpr dqprVarM61 = dqpt.m();
        dqog dqogVar61 = (dqog) dqprVarM61;
        dqogVar61.e = 1;
        dqogVar61.a = "messages.auto_retry_counter";
        dqprVarM61.i(58230);
        dqogVar61.d = new Supplier() { // from class: bqxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar61.c = new dqps() { // from class: bqxp
        };
        brao braoVar61 = new brao(dqprVarM61.a());
        this.ai = braoVar61;
        dqpr dqprVarM62 = dqpt.m();
        dqog dqogVar62 = (dqog) dqprVarM62;
        dqogVar62.e = 2;
        dqogVar62.a = "messages.can_revoke_before_delivered_with_rcs";
        dqprVarM62.i(58280);
        dqogVar62.d = new Supplier() { // from class: bqxq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar62.c = new dqps() { // from class: bqxs
        };
        brao braoVar62 = new brao(dqprVarM62.a());
        this.aj = braoVar62;
        dqpr dqprVarM63 = dqpt.m();
        dqog dqogVar63 = (dqog) dqprVarM63;
        dqogVar63.e = 5;
        dqogVar63.a = "messages.trace_id";
        dqprVarM63.i(58680);
        dqogVar63.d = new Supplier() { // from class: bqxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar63.c = new dqps() { // from class: bqxu
        };
        brao braoVar63 = new brao(dqprVarM63.a());
        this.ak = braoVar63;
        dqpr dqprVarM64 = dqpt.m();
        dqog dqogVar64 = (dqog) dqprVarM64;
        dqogVar64.e = 1;
        dqogVar64.a = "messages.outgoing_delivery_report_status";
        dqprVarM64.i(58720);
        dqogVar64.d = new Supplier() { // from class: bqxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar64.c = new dqps() { // from class: bqxw
        };
        brao braoVar64 = new brao(dqprVarM64.a());
        this.al = braoVar64;
        dqpr dqprVarM65 = dqpt.m();
        dqog dqogVar65 = (dqog) dqprVarM65;
        dqogVar65.e = 1;
        dqogVar65.a = "messages.outgoing_read_report_status";
        dqprVarM65.i(58720);
        dqogVar65.d = new Supplier() { // from class: bqxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar65.c = new dqps() { // from class: bqxz
        };
        brao braoVar65 = new brao(dqprVarM65.a());
        this.am = braoVar65;
        dqpr dqprVarM66 = dqpt.m();
        dqog dqogVar66 = (dqog) dqprVarM66;
        dqogVar66.e = 1;
        dqogVar66.a = "messages.xms_transport";
        dqprVarM66.i(59310);
        dqogVar66.d = new Supplier() { // from class: bqya
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar66.c = new dqps() { // from class: bqyb
        };
        brao braoVar66 = new brao(dqprVarM66.a());
        this.an = braoVar66;
        dqpr dqprVarM67 = dqpt.m();
        dqog dqogVar67 = (dqog) dqprVarM67;
        dqogVar67.e = 1;
        dqogVar67.a = "messages.message_original_protocol";
        dqprVarM67.i(59430);
        dqogVar67.d = new Supplier() { // from class: bqyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar67.c = new dqps() { // from class: bqye
        };
        brao braoVar67 = new brao(dqprVarM67.a());
        this.ao = braoVar67;
        dqpr dqprVarM68 = dqpt.m();
        dqog dqogVar68 = (dqog) dqprVarM68;
        dqogVar68.e = 4;
        dqprVarM68.l(true);
        dqprVarM68.d(true);
        dqogVar68.a = "messages.satellite_datagram_id";
        dqprVarM68.f(true);
        dqprVarM68.i(59490);
        dqogVar68.d = new Supplier() { // from class: bqyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar68.c = new dqps() { // from class: bqyg
        };
        brao braoVar68 = new brao(dqprVarM68.a());
        this.ap = braoVar68;
        dqpr dqprVarM69 = dqpt.m();
        dqog dqogVar69 = (dqog) dqprVarM69;
        dqogVar69.e = 1;
        dqogVar69.a = "messages.encryption_protocol";
        dqprVarM69.i(60190);
        dqogVar69.d = new Supplier() { // from class: bqyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar69.c = new dqps() { // from class: bqyi
        };
        brao braoVar69 = new brao(dqprVarM69.a());
        this.aq = braoVar69;
        dqpr dqprVarM70 = dqpt.m();
        dqog dqogVar70 = (dqog) dqprVarM70;
        dqogVar70.e = 4;
        dqprVarM70.l(true);
        dqprVarM70.d(true);
        dqogVar70.a = "messages.message_persistence_id";
        dqprVarM70.f(true);
        dqprVarM70.i(60370);
        dqogVar70.d = new Supplier() { // from class: bqyk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.f();
            }
        };
        dqogVar70.c = new dqps() { // from class: bqyl
        };
        brao braoVar70 = new brao(dqprVarM70.a());
        this.ar = braoVar70;
        this.as = new brao[]{braoVar, braoVar2, braoVar3, braoVar4, braoVar5, braoVar6, braoVar7, braoVar8, braoVar9, braoVar10, braoVar11, braoVar12, braoVar13, braoVar14, braoVar15, braoVar16, braoVar17, braoVar18, braoVar19, braoVar20, braoVar21, braoVar22, braoVar23, braoVar24, braoVar25, braoVar26, braoVar27, braoVar28, braoVar29, braoVar30, braoVar31, braoVar32, braoVar33, braoVar34, braoVar35, braoVar36, braoVar37, braoVar38, braoVar39, braoVar40, braoVar41, braoVar42, braoVar43, braoVar44, braoVar45, braoVar46, braoVar47, braoVar48, braoVar49, braoVar50, braoVar51, braoVar52, braoVar53, braoVar54, braoVar55, braoVar56, braoVar57, braoVar58, braoVar59, braoVar60, braoVar61, braoVar62, braoVar63, braoVar64, braoVar65, braoVar66, braoVar67, braoVar68, braoVar69, braoVar70};
    }
}
