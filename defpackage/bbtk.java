package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bbtk extends dqpd {
    public boolean A;
    public int B;
    public long C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public String I;
    public long J;
    public String K;
    public String L;
    public String M;
    public boolean N;
    public boolean O;
    public avoe P;
    public Optional Q;
    public boolean R;
    public boolean S;
    public cbqz T;
    public int U;
    public MessageIdType V;
    public long W;
    public long X;
    public int Y;
    public int Z;
    public ConversationIdType a;
    public boolean aa;
    public int ab;
    public int ac;
    public basd ad;
    public int ae;
    public String af;
    public int ag;
    public String ah;
    public String ai;
    public String aj;
    public long ak;
    public long al;
    public String am;
    public String an;
    public String ao;
    public String ap;
    public Uri aq;
    public String ar;
    public aonp as;
    public String at;
    public long au;
    public int av;
    public ezds aw;
    public long ax;
    public ConversationIdType ay;
    public cnqj b;
    public String c;
    public bvdp d;
    public String e;
    public String f;
    public Uri g;
    public String h;
    public boolean i;
    public String j;
    public String k;
    public Uri l;
    public String m;
    public int n;
    public bvdk o;
    public long p;
    public String q;
    public long r;
    public String s;
    public String t;
    public String u;
    public axcm v;
    public int w;
    public boolean x;
    public String y;
    public boolean z;

    protected bbtk() {
        ConversationIdType conversationIdType = barn.a;
        this.a = conversationIdType;
        this.b = new cnqj();
        this.d = bvdp.NAME_IS_AUTOMATIC;
        this.i = false;
        this.n = 0;
        this.o = bvdk.UNARCHIVED;
        this.p = 0L;
        this.r = -1L;
        this.v = null;
        this.w = 0;
        this.x = true;
        this.z = true;
        this.A = false;
        this.B = 0;
        this.C = -1L;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = false;
        this.J = 0L;
        this.N = true;
        this.O = false;
        this.P = avoe.b(0);
        this.Q = basb.b(-1L);
        this.R = false;
        this.S = false;
        this.T = new cbqz(0L);
        this.V = bary.a;
        this.W = 0L;
        this.X = 0L;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = 0;
        this.ac = 0;
        this.ad = basd.a;
        this.ae = -1;
        this.ag = -2;
        this.ak = -1L;
        this.as = aonp.VMT_STATUS_UNKNOWN;
        this.au = 0L;
        this.av = 0;
        this.ay = conversationIdType;
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationListFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_unread_count: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_directory_id: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  reminders.reminders_trigger_time: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bcve.d().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* synthetic */ void c(dqqj dqqjVar) {
        ezds ezdsVar;
        bcuu bcuuVar = (bcuu) ((bcut) dqqjVar);
        aC();
        this.cN = bcuuVar.cV();
        if (bcuuVar.dj(0)) {
            this.a = bcuuVar.u();
            fN(0);
        }
        if (bcuuVar.dj(1)) {
            this.b = cnqj.b(bcuuVar.getLong(bcuuVar.cO(1, bcve.a)));
            fN(1);
        }
        if (bcuuVar.dj(2)) {
            this.c = bcuuVar.I();
            fN(2);
        }
        if (bcuuVar.dj(3)) {
            bvdp[] bvdpVarArrValues = bvdp.values();
            int i = bcuuVar.getInt(bcuuVar.cO(3, bcve.a));
            if (i >= bvdpVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.d = bvdpVarArrValues[i];
            fN(3);
        }
        if (bcuuVar.dj(4)) {
            this.e = cssq.a(bcuuVar.getString(bcuuVar.cO(4, bcve.a)));
            fN(4);
        }
        if (bcuuVar.dj(5)) {
            this.f = bcuuVar.N();
            fN(5);
        }
        if (bcuuVar.dj(6)) {
            String string = bcuuVar.getString(bcuuVar.cO(6, bcve.a));
            this.g = string == null ? null : Uri.parse(string);
            fN(6);
        }
        if (bcuuVar.dj(7)) {
            this.h = bcuuVar.getString(bcuuVar.cO(7, bcve.a));
            fN(7);
        }
        if (bcuuVar.dj(8)) {
            this.i = bcuuVar.W();
            fN(8);
        }
        if (bcuuVar.dj(9)) {
            this.j = bcuuVar.B();
            fN(9);
        }
        if (bcuuVar.dj(10)) {
            this.k = bcuuVar.C();
            fN(10);
        }
        if (bcuuVar.dj(11)) {
            this.l = bcuuVar.q();
            fN(11);
        }
        if (bcuuVar.dj(12)) {
            this.m = bcuuVar.A();
            fN(12);
        }
        if (bcuuVar.dj(13)) {
            this.n = bcuuVar.getInt(bcuuVar.cO(13, bcve.a));
            fN(13);
        }
        if (bcuuVar.dj(14)) {
            this.o = bcuuVar.w();
            fN(14);
        }
        if (bcuuVar.dj(15)) {
            this.p = bcuuVar.getLong(bcuuVar.cO(15, bcve.a));
            fN(15);
        }
        if (bcuuVar.dj(16)) {
            this.q = bcuuVar.H();
            fN(16);
        }
        if (bcuuVar.dj(17)) {
            this.r = bcuuVar.getLong(bcuuVar.cO(17, bcve.a));
            fN(17);
        }
        if (bcuuVar.dj(18)) {
            this.s = bcuuVar.K();
            fN(18);
        }
        if (bcuuVar.dj(19)) {
            this.t = bcuuVar.L();
            fN(19);
        }
        if (bcuuVar.dj(20)) {
            this.u = bcuuVar.getString(bcuuVar.cO(20, bcve.a));
            fN(20);
        }
        if (bcuuVar.dj(21)) {
            this.v = axcn.a(bcuuVar.getString(bcuuVar.cO(21, bcve.a)));
            fN(21);
        }
        if (bcuuVar.dj(22)) {
            this.w = bcuuVar.e();
            fN(22);
        }
        if (bcuuVar.dj(23)) {
            this.x = bcuuVar.T();
            fN(23);
        }
        if (bcuuVar.dj(24)) {
            this.y = bcuuVar.getString(bcuuVar.cO(24, bcve.a));
            fN(24);
        }
        if (bcuuVar.dj(25)) {
            this.z = bcuuVar.getInt(bcuuVar.cO(25, bcve.a)) == 1;
            fN(25);
        }
        if (bcuuVar.dj(26)) {
            this.A = bcuuVar.getInt(bcuuVar.cO(26, bcve.a)) == 1;
            fN(26);
        }
        if (bcuuVar.dj(27)) {
            this.B = bcuuVar.j();
            fN(27);
        }
        if (bcuuVar.dj(28)) {
            this.C = bcuuVar.m();
            fN(28);
        }
        if (bcuuVar.dj(29)) {
            this.D = bcuuVar.d();
            fN(29);
        }
        if (bcuuVar.dj(30)) {
            this.E = bcuuVar.c();
            fN(30);
        }
        if (bcuuVar.dj(31)) {
            this.F = bcuuVar.getInt(bcuuVar.cO(31, bcve.a));
            fN(31);
        }
        if (bcuuVar.dj(32)) {
            this.G = bcuuVar.R();
            fN(32);
        }
        if (bcuuVar.dj(33)) {
            this.H = bcuuVar.Q();
            fN(33);
        }
        if (bcuuVar.dj(34)) {
            this.I = bcuuVar.J();
            fN(34);
        }
        if (bcuuVar.dj(35)) {
            this.J = bcuuVar.getLong(bcuuVar.cO(35, bcve.a));
            fN(35);
        }
        if (bcuuVar.dj(36)) {
            this.K = bcuuVar.getString(bcuuVar.cO(36, bcve.a));
            fN(36);
        }
        if (bcuuVar.dj(37)) {
            this.L = bcuuVar.getString(bcuuVar.cO(37, bcve.a));
            fN(37);
        }
        if (bcuuVar.dj(38)) {
            this.M = csrz.a(bcuuVar.getString(bcuuVar.cO(38, bcve.a)));
            fN(38);
        }
        if (bcuuVar.dj(39)) {
            this.N = bcuuVar.U();
            fN(39);
        }
        if (bcuuVar.dj(40)) {
            this.O = bcuuVar.getInt(bcuuVar.cO(40, bcve.a)) == 1;
            fN(40);
        }
        if (bcuuVar.dj(41)) {
            this.P = avoe.b(bcuuVar.getInt(bcuuVar.cO(41, bcve.a)));
            fN(41);
        }
        if (bcuuVar.dj(42)) {
            this.Q = basb.b(bcuuVar.getLong(bcuuVar.cO(42, bcve.a)));
            fN(42);
        }
        if (bcuuVar.dj(43)) {
            this.R = bcuuVar.getInt(bcuuVar.cO(43, bcve.a)) == 1;
            fN(43);
        }
        if (bcuuVar.dj(44)) {
            this.S = bcuuVar.S();
            fN(44);
        }
        if (bcuuVar.dj(45)) {
            this.T = new cbqz(bcuuVar.getLong(bcuuVar.cO(45, bcve.a)));
            fN(45);
        }
        if (bcuuVar.dj(46)) {
            this.U = bcuuVar.getInt(bcuuVar.cO(46, bcve.a));
            fN(46);
        }
        if (bcuuVar.dj(47)) {
            this.V = bcuuVar.v();
            fN(47);
        }
        if (bcuuVar.dj(48)) {
            this.W = bcuuVar.o();
            fN(48);
        }
        if (bcuuVar.dj(49)) {
            this.X = bcuuVar.n();
            fN(49);
        }
        if (bcuuVar.dj(50)) {
            this.Y = bcuuVar.f();
            fN(50);
        }
        if (bcuuVar.dj(51)) {
            this.Z = bcuuVar.k();
            fN(51);
        }
        if (bcuuVar.dj(52)) {
            this.aa = bcuuVar.V();
            fN(52);
        }
        if (bcuuVar.dj(53)) {
            this.ab = bcuuVar.i();
            fN(53);
        }
        if (bcuuVar.dj(54)) {
            this.ac = bcuuVar.g();
            fN(54);
        }
        if (bcuuVar.dj(55)) {
            this.ad = basd.a(bcuuVar.getString(bcuuVar.cO(55, bcve.a)));
            fN(55);
        }
        if (bcuuVar.dj(56)) {
            this.ae = bcuuVar.h();
            fN(56);
        }
        if (bcuuVar.dj(57)) {
            this.af = bcuuVar.M();
            fN(57);
        }
        if (bcuuVar.dj(58)) {
            this.ag = bcuuVar.l();
            fN(58);
        }
        if (bcuuVar.dj(59)) {
            this.ah = bcuuVar.z();
            fN(59);
        }
        if (bcuuVar.dj(60)) {
            this.ai = bcuuVar.G();
            fN(60);
        }
        if (bcuuVar.dj(61)) {
            this.aj = bcuuVar.E();
            fN(61);
        }
        if (bcuuVar.dj(62)) {
            this.ak = bcuuVar.getLong(bcuuVar.cO(62, bcve.a));
            fN(62);
        }
        if (bcuuVar.dj(63)) {
            this.al = bcuuVar.getLong(bcuuVar.cO(63, bcve.a));
            fN(63);
        }
        if (bcuuVar.dj(64)) {
            this.am = bcuuVar.F();
            fN(64);
        }
        if (bcuuVar.dj(65)) {
            this.an = bcuuVar.D();
            fN(65);
        }
        if (bcuuVar.dj(66)) {
            this.ao = bcuuVar.getString(bcuuVar.cO(66, bcve.a));
            fN(66);
        }
        if (bcuuVar.dj(67)) {
            this.ap = bcuuVar.O();
            fN(67);
        }
        if (bcuuVar.dj(68)) {
            this.aq = bcuuVar.r();
            fN(68);
        }
        if (bcuuVar.dj(69)) {
            this.ar = bcuuVar.y();
            fN(69);
        }
        if (bcuuVar.dj(70)) {
            this.as = bcuuVar.s();
            fN(70);
        }
        if (bcuuVar.dj(71)) {
            this.at = bcuuVar.P();
            fN(71);
        }
        if (bcuuVar.dj(72)) {
            this.au = bcuuVar.p();
            fN(72);
        }
        if (bcuuVar.dj(73)) {
            this.av = bcuuVar.getInt(bcuuVar.cO(73, bcve.a));
            fN(73);
        }
        if (bcuuVar.dj(74)) {
            byte[] blob = bcuuVar.getBlob(bcuuVar.cO(74, bcve.a));
            if (blob == null) {
                ezdsVar = null;
            } else {
                try {
                    ezdsVar = (ezds) evsn.parseFrom(ezds.a, blob, evrr.a());
                } catch (Throwable unused) {
                    ezdsVar = ezds.a;
                }
            }
            this.aw = ezdsVar;
            fN(74);
        }
        if (bcuuVar.dj(75)) {
            this.ax = bcuuVar.getLong(bcuuVar.cO(75, bcve.a));
            fN(75);
        }
        if (bcuuVar.dj(76)) {
            this.ay = bcuuVar.t();
            fN(76);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbtk)) {
            return false;
        }
        bbtk bbtkVar = (bbtk) obj;
        return super.aE(bbtkVar.cN) && Objects.equals(this.a, bbtkVar.a) && Objects.equals(this.b, bbtkVar.b) && Objects.equals(this.c, bbtkVar.c) && this.d == bbtkVar.d && Objects.equals(this.e, bbtkVar.e) && Objects.equals(this.f, bbtkVar.f) && Objects.equals(this.g, bbtkVar.g) && Objects.equals(this.h, bbtkVar.h) && this.i == bbtkVar.i && Objects.equals(this.j, bbtkVar.j) && Objects.equals(this.k, bbtkVar.k) && Objects.equals(this.l, bbtkVar.l) && Objects.equals(this.m, bbtkVar.m) && this.n == bbtkVar.n && this.o == bbtkVar.o && this.p == bbtkVar.p && Objects.equals(this.q, bbtkVar.q) && this.r == bbtkVar.r && Objects.equals(this.s, bbtkVar.s) && Objects.equals(this.t, bbtkVar.t) && Objects.equals(this.u, bbtkVar.u) && Objects.equals(this.v, bbtkVar.v) && this.w == bbtkVar.w && this.x == bbtkVar.x && Objects.equals(this.y, bbtkVar.y) && this.z == bbtkVar.z && this.A == bbtkVar.A && this.B == bbtkVar.B && this.C == bbtkVar.C && this.D == bbtkVar.D && this.E == bbtkVar.E && this.F == bbtkVar.F && this.G == bbtkVar.G && this.H == bbtkVar.H && Objects.equals(this.I, bbtkVar.I) && this.J == bbtkVar.J && Objects.equals(this.K, bbtkVar.K) && Objects.equals(this.L, bbtkVar.L) && Objects.equals(this.M, bbtkVar.M) && this.N == bbtkVar.N && this.O == bbtkVar.O && this.P == bbtkVar.P && Objects.equals(this.Q, bbtkVar.Q) && this.R == bbtkVar.R && this.S == bbtkVar.S && Objects.equals(this.T, bbtkVar.T) && this.U == bbtkVar.U && Objects.equals(this.V, bbtkVar.V) && this.W == bbtkVar.W && this.X == bbtkVar.X && this.Y == bbtkVar.Y && this.Z == bbtkVar.Z && this.aa == bbtkVar.aa && this.ab == bbtkVar.ab && this.ac == bbtkVar.ac && Objects.equals(this.ad, bbtkVar.ad) && this.ae == bbtkVar.ae && Objects.equals(this.af, bbtkVar.af) && this.ag == bbtkVar.ag && Objects.equals(this.ah, bbtkVar.ah) && Objects.equals(this.ai, bbtkVar.ai) && Objects.equals(this.aj, bbtkVar.aj) && this.ak == bbtkVar.ak && this.al == bbtkVar.al && Objects.equals(this.am, bbtkVar.am) && Objects.equals(this.an, bbtkVar.an) && Objects.equals(this.ao, bbtkVar.ao) && Objects.equals(this.ap, bbtkVar.ap) && Objects.equals(this.aq, bbtkVar.aq) && Objects.equals(this.ar, bbtkVar.ar) && this.as == bbtkVar.as && Objects.equals(this.at, bbtkVar.at) && this.au == bbtkVar.au && this.av == bbtkVar.av && Objects.equals(this.aw, bbtkVar.aw) && this.ax == bbtkVar.ax && Objects.equals(this.ay, bbtkVar.ay);
    }

    public final int f() {
        aA(27, "source_type");
        return this.B;
    }

    public final int g() {
        aA(51, "message_status");
        return this.Z;
    }

    public final ConversationIdType h() {
        aA(0, "_id");
        return this.a;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        ConversationIdType conversationIdType = this.a;
        cnqj cnqjVar = this.b;
        String str = this.c;
        bvdp bvdpVar = this.d;
        return Objects.hash(dqqeVar2, conversationIdType, cnqjVar, str, Integer.valueOf(bvdpVar == null ? 0 : bvdpVar.ordinal()), this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), this.j, this.k, this.l, this.m, Integer.valueOf(this.n), this.o, Long.valueOf(this.p), this.q, Long.valueOf(this.r), this.s, this.t, this.u, this.v, Integer.valueOf(this.w), Boolean.valueOf(this.x), this.y, Boolean.valueOf(this.z), Boolean.valueOf(this.A), Integer.valueOf(this.B), Long.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H), this.I, Long.valueOf(this.J), this.K, this.L, this.M, Boolean.valueOf(this.N), Boolean.valueOf(this.O), this.P, this.Q, Boolean.valueOf(this.R), Boolean.valueOf(this.S), this.T, Integer.valueOf(this.U), this.V, Long.valueOf(this.W), Long.valueOf(this.X), Integer.valueOf(this.Y), Integer.valueOf(this.Z), Boolean.valueOf(this.aa), Integer.valueOf(this.ab), Integer.valueOf(this.ac), this.ad, Integer.valueOf(this.ae), this.af, Integer.valueOf(this.ag), this.ah, this.ai, this.aj, Long.valueOf(this.ak), Long.valueOf(this.al), this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, this.at, Long.valueOf(this.au), Integer.valueOf(this.av), this.aw, Long.valueOf(this.ax), this.ay, null);
    }

    public final MessageIdType i() {
        aA(47, "_id");
        return this.V;
    }

    public final basd j() {
        aA(55, "rcs_message_id_with_text_type");
        return this.ad;
    }

    public final String k() {
        aA(16, "icon");
        return this.q;
    }

    public final String l() {
        aA(2, "name");
        return this.c;
    }

    public final String m() {
        aA(19, "participant_normalized_destination");
        return this.t;
    }

    public final boolean n() {
        aA(33, "has_ea2p_bot_recipient");
        return this.H;
    }

    public final boolean o() {
        aA(8, "show_draft");
        return this.i;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationListFromConversationToParticipantsQuery -- REDACTED") : a();
    }
}
