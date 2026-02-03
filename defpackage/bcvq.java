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
public class bcvq extends dqpd {
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

    protected bcvq() {
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
        return String.format(Locale.US, "ConversationListQuery [conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_unread_count: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_directory_id: %s,\n  conversation_participants.conversation_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  reminders.reminders_trigger_time: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bdxk.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* synthetic */ void c(dqqj dqqjVar) {
        bdxd bdxdVar = (bdxd) dqqjVar;
        aC();
        this.cN = bdxdVar.cV();
        if (bdxdVar.dj(0)) {
            this.a = new ConversationIdType(bdxdVar.getLong(bdxdVar.cO(0, bdxk.a)));
            fN(0);
        }
        if (bdxdVar.dj(1)) {
            this.b = cnqj.b(bdxdVar.getLong(bdxdVar.cO(1, bdxk.a)));
            fN(1);
        }
        if (bdxdVar.dj(2)) {
            this.c = bdxdVar.getString(bdxdVar.cO(2, bdxk.a));
            fN(2);
        }
        if (bdxdVar.dj(3)) {
            bvdp[] bvdpVarArrValues = bvdp.values();
            int i = bdxdVar.getInt(bdxdVar.cO(3, bdxk.a));
            if (i >= bvdpVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.d = bvdpVarArrValues[i];
            fN(3);
        }
        if (bdxdVar.dj(4)) {
            this.e = cssq.a(bdxdVar.getString(bdxdVar.cO(4, bdxk.a)));
            fN(4);
        }
        if (bdxdVar.dj(5)) {
            this.f = cssq.a(bdxdVar.getString(bdxdVar.cO(5, bdxk.a)));
            fN(5);
        }
        ezds ezdsVar = null;
        if (bdxdVar.dj(6)) {
            String string = bdxdVar.getString(bdxdVar.cO(6, bdxk.a));
            this.g = string == null ? null : Uri.parse(string);
            fN(6);
        }
        if (bdxdVar.dj(7)) {
            this.h = bdxdVar.getString(bdxdVar.cO(7, bdxk.a));
            fN(7);
        }
        if (bdxdVar.dj(8)) {
            this.i = bdxdVar.getInt(bdxdVar.cO(8, bdxk.a)) == 1;
            fN(8);
        }
        if (bdxdVar.dj(9)) {
            this.j = cssq.a(bdxdVar.getString(bdxdVar.cO(9, bdxk.a)));
            fN(9);
        }
        if (bdxdVar.dj(10)) {
            this.k = cssq.a(bdxdVar.getString(bdxdVar.cO(10, bdxk.a)));
            fN(10);
        }
        if (bdxdVar.dj(11)) {
            String string2 = bdxdVar.getString(bdxdVar.cO(11, bdxk.a));
            this.l = string2 == null ? null : Uri.parse(string2);
            fN(11);
        }
        if (bdxdVar.dj(12)) {
            this.m = bdxdVar.getString(bdxdVar.cO(12, bdxk.a));
            fN(12);
        }
        if (bdxdVar.dj(13)) {
            this.n = bdxdVar.getInt(bdxdVar.cO(13, bdxk.a));
            fN(13);
        }
        if (bdxdVar.dj(14)) {
            this.o = bvdk.a(bdxdVar.getInt(bdxdVar.cO(14, bdxk.a)));
            fN(14);
        }
        if (bdxdVar.dj(15)) {
            this.p = bdxdVar.getLong(bdxdVar.cO(15, bdxk.a));
            fN(15);
        }
        if (bdxdVar.dj(16)) {
            this.q = bdxdVar.getString(bdxdVar.cO(16, bdxk.a));
            fN(16);
        }
        if (bdxdVar.dj(17)) {
            this.r = bdxdVar.getLong(bdxdVar.cO(17, bdxk.a));
            fN(17);
        }
        if (bdxdVar.dj(18)) {
            this.s = bdxdVar.getString(bdxdVar.cO(18, bdxk.a));
            fN(18);
        }
        if (bdxdVar.dj(19)) {
            this.t = bdxdVar.getString(bdxdVar.cO(19, bdxk.a));
            fN(19);
        }
        if (bdxdVar.dj(20)) {
            this.u = bdxdVar.getString(bdxdVar.cO(20, bdxk.a));
            fN(20);
        }
        if (bdxdVar.dj(21)) {
            this.v = axcn.a(bdxdVar.getString(bdxdVar.cO(21, bdxk.a)));
            fN(21);
        }
        if (bdxdVar.dj(22)) {
            this.w = bdxdVar.getInt(bdxdVar.cO(22, bdxk.a));
            fN(22);
        }
        if (bdxdVar.dj(23)) {
            this.x = bdxdVar.getInt(bdxdVar.cO(23, bdxk.a)) == 1;
            fN(23);
        }
        if (bdxdVar.dj(24)) {
            this.y = bdxdVar.getString(bdxdVar.cO(24, bdxk.a));
            fN(24);
        }
        if (bdxdVar.dj(25)) {
            this.z = bdxdVar.getInt(bdxdVar.cO(25, bdxk.a)) == 1;
            fN(25);
        }
        if (bdxdVar.dj(26)) {
            this.A = bdxdVar.getInt(bdxdVar.cO(26, bdxk.a)) == 1;
            fN(26);
        }
        if (bdxdVar.dj(27)) {
            this.B = bdxdVar.getInt(bdxdVar.cO(27, bdxk.a));
            fN(27);
        }
        if (bdxdVar.dj(28)) {
            this.C = bdxdVar.getLong(bdxdVar.cO(28, bdxk.a));
            fN(28);
        }
        if (bdxdVar.dj(29)) {
            this.D = bdxdVar.getInt(bdxdVar.cO(29, bdxk.a));
            fN(29);
        }
        if (bdxdVar.dj(30)) {
            this.E = bdxdVar.getInt(bdxdVar.cO(30, bdxk.a));
            fN(30);
        }
        if (bdxdVar.dj(31)) {
            this.F = bdxdVar.getInt(bdxdVar.cO(31, bdxk.a));
            fN(31);
        }
        if (bdxdVar.dj(32)) {
            this.G = bdxdVar.getInt(bdxdVar.cO(32, bdxk.a)) == 1;
            fN(32);
        }
        if (bdxdVar.dj(33)) {
            this.H = bdxdVar.getInt(bdxdVar.cO(33, bdxk.a)) == 1;
            fN(33);
        }
        if (bdxdVar.dj(34)) {
            this.I = cssq.a(bdxdVar.getString(bdxdVar.cO(34, bdxk.a)));
            fN(34);
        }
        if (bdxdVar.dj(35)) {
            this.J = bdxdVar.getLong(bdxdVar.cO(35, bdxk.a));
            fN(35);
        }
        if (bdxdVar.dj(36)) {
            this.K = bdxdVar.getString(bdxdVar.cO(36, bdxk.a));
            fN(36);
        }
        if (bdxdVar.dj(37)) {
            this.L = bdxdVar.getString(bdxdVar.cO(37, bdxk.a));
            fN(37);
        }
        if (bdxdVar.dj(38)) {
            this.M = csrz.a(bdxdVar.getString(bdxdVar.cO(38, bdxk.a)));
            fN(38);
        }
        if (bdxdVar.dj(39)) {
            this.N = bdxdVar.getInt(bdxdVar.cO(39, bdxk.a)) == 1;
            fN(39);
        }
        if (bdxdVar.dj(40)) {
            this.O = bdxdVar.getInt(bdxdVar.cO(40, bdxk.a)) == 1;
            fN(40);
        }
        if (bdxdVar.dj(41)) {
            this.P = avoe.b(bdxdVar.getInt(bdxdVar.cO(41, bdxk.a)));
            fN(41);
        }
        if (bdxdVar.dj(42)) {
            this.Q = basb.b(bdxdVar.getLong(bdxdVar.cO(42, bdxk.a)));
            fN(42);
        }
        if (bdxdVar.dj(43)) {
            this.R = bdxdVar.getInt(bdxdVar.cO(43, bdxk.a)) == 1;
            fN(43);
        }
        if (bdxdVar.dj(44)) {
            this.S = bdxdVar.getInt(bdxdVar.cO(44, bdxk.a)) == 1;
            fN(44);
        }
        if (bdxdVar.dj(45)) {
            this.T = new cbqz(bdxdVar.getLong(bdxdVar.cO(45, bdxk.a)));
            fN(45);
        }
        if (bdxdVar.dj(46)) {
            this.U = bdxdVar.getInt(bdxdVar.cO(46, bdxk.a));
            fN(46);
        }
        if (bdxdVar.dj(47)) {
            this.V = new MessageIdType(bdxdVar.getLong(bdxdVar.cO(47, bdxk.a)));
            fN(47);
        }
        if (bdxdVar.dj(48)) {
            this.W = bdxdVar.getLong(bdxdVar.cO(48, bdxk.a));
            fN(48);
        }
        if (bdxdVar.dj(49)) {
            this.X = bdxdVar.getLong(bdxdVar.cO(49, bdxk.a));
            fN(49);
        }
        if (bdxdVar.dj(50)) {
            this.Y = bdxdVar.getInt(bdxdVar.cO(50, bdxk.a));
            fN(50);
        }
        if (bdxdVar.dj(51)) {
            this.Z = bdxdVar.getInt(bdxdVar.cO(51, bdxk.a));
            fN(51);
        }
        if (bdxdVar.dj(52)) {
            this.aa = bdxdVar.getInt(bdxdVar.cO(52, bdxk.a)) == 1;
            fN(52);
        }
        if (bdxdVar.dj(53)) {
            this.ab = bdxdVar.getInt(bdxdVar.cO(53, bdxk.a));
            fN(53);
        }
        if (bdxdVar.dj(54)) {
            this.ac = bdxdVar.getInt(bdxdVar.cO(54, bdxk.a));
            fN(54);
        }
        if (bdxdVar.dj(55)) {
            this.ad = basd.a(bdxdVar.getString(bdxdVar.cO(55, bdxk.a)));
            fN(55);
        }
        if (bdxdVar.dj(56)) {
            this.ae = bdxdVar.getInt(bdxdVar.cO(56, bdxk.a));
            fN(56);
        }
        if (bdxdVar.dj(57)) {
            this.af = bdxdVar.getString(bdxdVar.cO(57, bdxk.a));
            fN(57);
        }
        if (bdxdVar.dj(58)) {
            this.ag = bdxdVar.getInt(bdxdVar.cO(58, bdxk.a));
            fN(58);
        }
        if (bdxdVar.dj(59)) {
            this.ah = cssb.a(bdxdVar.getString(bdxdVar.cO(59, bdxk.a)));
            fN(59);
        }
        if (bdxdVar.dj(60)) {
            this.ai = cssq.a(bdxdVar.getString(bdxdVar.cO(60, bdxk.a)));
            fN(60);
        }
        if (bdxdVar.dj(61)) {
            this.aj = cssq.a(bdxdVar.getString(bdxdVar.cO(61, bdxk.a)));
            fN(61);
        }
        if (bdxdVar.dj(62)) {
            this.ak = bdxdVar.getLong(bdxdVar.cO(62, bdxk.a));
            fN(62);
        }
        if (bdxdVar.dj(63)) {
            this.al = bdxdVar.getLong(bdxdVar.cO(63, bdxk.a));
            fN(63);
        }
        if (bdxdVar.dj(64)) {
            this.am = cssq.a(bdxdVar.getString(bdxdVar.cO(64, bdxk.a)));
            fN(64);
        }
        if (bdxdVar.dj(65)) {
            this.an = cssq.a(bdxdVar.getString(bdxdVar.cO(65, bdxk.a)));
            fN(65);
        }
        if (bdxdVar.dj(66)) {
            this.ao = bdxdVar.getString(bdxdVar.cO(66, bdxk.a));
            fN(66);
        }
        if (bdxdVar.dj(67)) {
            this.ap = cssq.a(bdxdVar.getString(bdxdVar.cO(67, bdxk.a)));
            fN(67);
        }
        if (bdxdVar.dj(68)) {
            String string3 = bdxdVar.getString(bdxdVar.cO(68, bdxk.a));
            this.aq = string3 == null ? null : Uri.parse(string3);
            fN(68);
        }
        if (bdxdVar.dj(69)) {
            this.ar = bdxdVar.getString(bdxdVar.cO(69, bdxk.a));
            fN(69);
        }
        if (bdxdVar.dj(70)) {
            this.as = aonp.b(bdxdVar.getInt(bdxdVar.cO(70, bdxk.a)));
            fN(70);
        }
        if (bdxdVar.dj(71)) {
            this.at = bdxdVar.getString(bdxdVar.cO(71, bdxk.a));
            fN(71);
        }
        if (bdxdVar.dj(72)) {
            this.au = bdxdVar.getLong(bdxdVar.cO(72, bdxk.a));
            fN(72);
        }
        if (bdxdVar.dj(73)) {
            this.av = bdxdVar.getInt(bdxdVar.cO(73, bdxk.a));
            fN(73);
        }
        if (bdxdVar.dj(74)) {
            byte[] blob = bdxdVar.getBlob(bdxdVar.cO(74, bdxk.a));
            if (blob != null) {
                try {
                    ezdsVar = (ezds) evsn.parseFrom(ezds.a, blob, evrr.a());
                } catch (Throwable unused) {
                    ezdsVar = ezds.a;
                }
            }
            this.aw = ezdsVar;
            fN(74);
        }
        if (bdxdVar.dj(75)) {
            this.ax = bdxdVar.getLong(bdxdVar.cO(75, bdxk.a));
            fN(75);
        }
        if (bdxdVar.dj(76)) {
            this.ay = new ConversationIdType(bdxdVar.getLong(bdxdVar.cO(76, bdxk.a)));
            fN(76);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcvq)) {
            return false;
        }
        bcvq bcvqVar = (bcvq) obj;
        return super.aE(bcvqVar.cN) && Objects.equals(this.a, bcvqVar.a) && Objects.equals(this.b, bcvqVar.b) && Objects.equals(this.c, bcvqVar.c) && this.d == bcvqVar.d && Objects.equals(this.e, bcvqVar.e) && Objects.equals(this.f, bcvqVar.f) && Objects.equals(this.g, bcvqVar.g) && Objects.equals(this.h, bcvqVar.h) && this.i == bcvqVar.i && Objects.equals(this.j, bcvqVar.j) && Objects.equals(this.k, bcvqVar.k) && Objects.equals(this.l, bcvqVar.l) && Objects.equals(this.m, bcvqVar.m) && this.n == bcvqVar.n && this.o == bcvqVar.o && this.p == bcvqVar.p && Objects.equals(this.q, bcvqVar.q) && this.r == bcvqVar.r && Objects.equals(this.s, bcvqVar.s) && Objects.equals(this.t, bcvqVar.t) && Objects.equals(this.u, bcvqVar.u) && Objects.equals(this.v, bcvqVar.v) && this.w == bcvqVar.w && this.x == bcvqVar.x && Objects.equals(this.y, bcvqVar.y) && this.z == bcvqVar.z && this.A == bcvqVar.A && this.B == bcvqVar.B && this.C == bcvqVar.C && this.D == bcvqVar.D && this.E == bcvqVar.E && this.F == bcvqVar.F && this.G == bcvqVar.G && this.H == bcvqVar.H && Objects.equals(this.I, bcvqVar.I) && this.J == bcvqVar.J && Objects.equals(this.K, bcvqVar.K) && Objects.equals(this.L, bcvqVar.L) && Objects.equals(this.M, bcvqVar.M) && this.N == bcvqVar.N && this.O == bcvqVar.O && this.P == bcvqVar.P && Objects.equals(this.Q, bcvqVar.Q) && this.R == bcvqVar.R && this.S == bcvqVar.S && Objects.equals(this.T, bcvqVar.T) && this.U == bcvqVar.U && Objects.equals(this.V, bcvqVar.V) && this.W == bcvqVar.W && this.X == bcvqVar.X && this.Y == bcvqVar.Y && this.Z == bcvqVar.Z && this.aa == bcvqVar.aa && this.ab == bcvqVar.ab && this.ac == bcvqVar.ac && Objects.equals(this.ad, bcvqVar.ad) && this.ae == bcvqVar.ae && Objects.equals(this.af, bcvqVar.af) && this.ag == bcvqVar.ag && Objects.equals(this.ah, bcvqVar.ah) && Objects.equals(this.ai, bcvqVar.ai) && Objects.equals(this.aj, bcvqVar.aj) && this.ak == bcvqVar.ak && this.al == bcvqVar.al && Objects.equals(this.am, bcvqVar.am) && Objects.equals(this.an, bcvqVar.an) && Objects.equals(this.ao, bcvqVar.ao) && Objects.equals(this.ap, bcvqVar.ap) && Objects.equals(this.aq, bcvqVar.aq) && Objects.equals(this.ar, bcvqVar.ar) && this.as == bcvqVar.as && Objects.equals(this.at, bcvqVar.at) && this.au == bcvqVar.au && this.av == bcvqVar.av && Objects.equals(this.aw, bcvqVar.aw) && this.ax == bcvqVar.ax && Objects.equals(this.ay, bcvqVar.ay);
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

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationListQuery -- REDACTED") : a();
    }
}
