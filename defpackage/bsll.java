package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsll {
    public final bslm a;
    public final bslm b;
    public final bslm c;
    public final bslm d;
    public final bslm e;
    public final bslm f;
    public final bslm g;
    public final bslm h;
    public final bslm i;
    public final bslm j;
    public final bslm k;
    public final bslm l;
    public final bslm m;
    public final bslm n;
    public final bslm o;
    public final bslm p;
    public final bslm q;
    public final bslm r;
    public final bslm s;
    final bslm[] t;

    public bsll() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "pending_incoming_message_rcs_table.rcs_message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bsjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar.c = new dqps() { // from class: bskb
        };
        bslm bslmVar = new bslm(dqprVarM.a());
        this.a = bslmVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.d(true);
        dqogVar2.a = "pending_incoming_message_rcs_table.remote_user_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bskn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar2.c = new dqps() { // from class: bskx
        };
        bslm bslmVar2 = new bslm(dqprVarM2.a());
        this.b = bslmVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "pending_incoming_message_rcs_table.self_identity";
        dqprVarM3.i(59410);
        dqogVar3.d = new Supplier() { // from class: bsky
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar3.c = new dqps() { // from class: bskz
        };
        bslm bslmVar3 = new bslm(dqprVarM3.a());
        this.c = bslmVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "pending_incoming_message_rcs_table.raw_text";
        dqprVarM4.i(-1);
        dqogVar4.d = new Supplier() { // from class: bsla
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar4.c = new dqps() { // from class: bslb
        };
        bslm bslmVar4 = new bslm(dqprVarM4.a());
        this.d = bslmVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "pending_incoming_message_rcs_table.content_type";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bslc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar5.c = new dqps() { // from class: bsld
        };
        bslm bslmVar5 = new bslm(dqprVarM5.a());
        this.e = bslmVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqogVar6.a = "pending_incoming_message_rcs_table.remote_instance";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bskk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar6.c = new dqps() { // from class: bskv
        };
        bslm bslmVar6 = new bslm(dqprVarM6.a());
        this.f = bslmVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 2;
        dqogVar7.a = "pending_incoming_message_rcs_table.sent_timestamp";
        dqprVarM7.i(-1);
        dqogVar7.d = new Supplier() { // from class: bsle
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar7.c = new dqps() { // from class: bslf
        };
        bslm bslmVar7 = new bslm(dqprVarM7.a());
        this.g = bslmVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 2;
        dqprVarM8.d(true);
        dqogVar8.a = "pending_incoming_message_rcs_table.received_timestamp";
        dqprVarM8.i(-1);
        dqogVar8.d = new Supplier() { // from class: bslg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar8.c = new dqps() { // from class: bslh
        };
        bslm bslmVar8 = new bslm(dqprVarM8.a());
        this.h = bslmVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 4;
        dqogVar9.a = "pending_incoming_message_rcs_table.sip_alias";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bsli
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar9.c = new dqps() { // from class: bslj
        };
        bslm bslmVar9 = new bslm(dqprVarM9.a());
        this.i = bslmVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 2;
        dqogVar10.a = "pending_incoming_message_rcs_table.spam_verdict";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bslk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar10.c = new dqps() { // from class: bska
        };
        bslm bslmVar10 = new bslm(dqprVarM10.a());
        this.j = bslmVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 2;
        dqogVar11.a = "pending_incoming_message_rcs_table.session_id";
        dqprVarM11.i(-1);
        dqogVar11.d = new Supplier() { // from class: bskc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar11.c = new dqps() { // from class: bskd
        };
        bslm bslmVar11 = new bslm(dqprVarM11.a());
        this.k = bslmVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 2;
        dqogVar12.a = "pending_incoming_message_rcs_table.message_status";
        dqprVarM12.i(-1);
        dqogVar12.d = new Supplier() { // from class: bske
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar12.c = new dqps() { // from class: bskf
        };
        bslm bslmVar12 = new bslm(dqprVarM12.a());
        this.l = bslmVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 5;
        dqogVar13.a = "pending_incoming_message_rcs_table.custom_headers";
        dqprVarM13.i(44020);
        dqogVar13.d = new Supplier() { // from class: bskg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar13.c = new dqps() { // from class: bskh
        };
        bslm bslmVar13 = new bslm(dqprVarM13.a());
        this.m = bslmVar13;
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 2;
        dqogVar14.a = "pending_incoming_message_rcs_table.is_group";
        dqprVarM14.i(58820);
        dqogVar14.d = new Supplier() { // from class: bski
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar14.c = new dqps() { // from class: bskj
        };
        bslm bslmVar14 = new bslm(dqprVarM14.a());
        this.n = bslmVar14;
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 4;
        dqogVar15.a = "pending_incoming_message_rcs_table.conversation_id";
        dqprVarM15.i(58820);
        dqogVar15.d = new Supplier() { // from class: bskl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar15.c = new dqps() { // from class: bskm
        };
        bslm bslmVar15 = new bslm(dqprVarM15.a());
        this.o = bslmVar15;
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 4;
        dqogVar16.a = "pending_incoming_message_rcs_table.conference_uri";
        dqprVarM16.i(58820);
        dqogVar16.d = new Supplier() { // from class: bsko
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar16.c = new dqps() { // from class: bskp
        };
        bslm bslmVar16 = new bslm(dqprVarM16.a());
        this.p = bslmVar16;
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 2;
        dqprVarM17.k(true);
        dqogVar17.a = "pending_incoming_message_rcs_table.is_delivery_report_requested";
        dqprVarM17.i(58870);
        dqogVar17.d = new Supplier() { // from class: bskq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar17.c = new dqps() { // from class: bskr
        };
        bslm bslmVar17 = new bslm(dqprVarM17.a());
        this.q = bslmVar17;
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 2;
        dqprVarM18.k(true);
        dqogVar18.a = "pending_incoming_message_rcs_table.is_display_report_requested";
        dqprVarM18.i(58870);
        dqogVar18.d = new Supplier() { // from class: bsks
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar18.c = new dqps() { // from class: bskt
        };
        bslm bslmVar18 = new bslm(dqprVarM18.a());
        this.r = bslmVar18;
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 2;
        dqprVarM19.k(true);
        dqogVar19.a = "pending_incoming_message_rcs_table.is_negative_delivery_report_requested";
        dqprVarM19.i(60560);
        dqogVar19.d = new Supplier() { // from class: bsku
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsmv.b();
            }
        };
        dqogVar19.c = new dqps() { // from class: bskw
        };
        bslm bslmVar19 = new bslm(dqprVarM19.a());
        this.s = bslmVar19;
        this.t = new bslm[]{bslmVar, bslmVar2, bslmVar3, bslmVar4, bslmVar5, bslmVar6, bslmVar7, bslmVar8, bslmVar9, bslmVar10, bslmVar11, bslmVar12, bslmVar13, bslmVar14, bslmVar15, bslmVar16, bslmVar17, bslmVar18, bslmVar19};
    }
}
