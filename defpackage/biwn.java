package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class biwn extends dqpd {
    private long A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private axcm G;
    private awjl H;
    private int I;
    private boolean J;
    private String K;
    private boolean L;
    private boolean M;
    private String N;
    private String O;
    private String P;
    private int Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private long X;
    private String Y;
    private String Z;
    private String a;
    private cbqx aA;
    private String aB;
    private Uri aC;
    private int aD;
    private boolean aa;
    private int ab;
    private long ac;
    private long ad;
    private String ae;
    private String af;
    private String ag;
    private byte[] ah;
    private long ai;
    private long aj;
    private boolean ak;
    private cigb al;
    private boolean am;
    private ConversationIdType an;
    private ConversationIdType ao;
    private avoe ap;
    private cpyi aq;
    private String ar;
    private Optional as;
    private Optional at;
    private boolean au;
    private boolean av;
    private cidt aw;
    private cins ax;
    private int ay;
    private cbqz az;
    private ConversationIdType b;
    private MessageIdType c;
    private int d;
    private ezds e;
    private ConversationIdType f;
    private cnqj g;
    private String h;
    private bvdp i;
    private String j;
    private MessageIdType k;
    private String l;
    private String m;
    private Uri n;
    private String o;
    private boolean p;
    private String q;
    private String r;
    private Uri s;
    private String t;
    private int u;
    private bvdk v;
    private long w;
    private long x;
    private String y;
    private long z;

    protected biwn() {
        ConversationIdType conversationIdType = barn.a;
        this.b = conversationIdType;
        MessageIdType messageIdType = bary.a;
        this.c = messageIdType;
        this.d = 0;
        this.f = conversationIdType;
        this.g = new cnqj();
        this.i = bvdp.NAME_IS_AUTOMATIC;
        this.k = messageIdType;
        this.p = false;
        this.u = 0;
        this.v = bvdk.UNARCHIVED;
        this.w = 0L;
        this.x = 0L;
        this.z = -1L;
        this.A = -1L;
        this.G = null;
        this.H = null;
        this.I = 0;
        this.J = true;
        this.L = true;
        this.M = false;
        this.Q = 0;
        this.R = -1L;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = 0L;
        this.aa = false;
        this.ab = 0;
        this.ac = 0L;
        this.ad = 0L;
        this.ai = 0L;
        this.aj = -1L;
        this.ak = true;
        this.al = new cigb(0L);
        this.am = false;
        this.an = conversationIdType;
        this.ao = conversationIdType;
        this.ap = avoe.b(0);
        this.aq = cpyi.UNKNOWN;
        this.as = basb.b(-1L);
        this.at = basb.b(-1L);
        this.au = false;
        this.av = false;
        this.ax = cins.a;
        this.ay = 0;
        this.az = new cbqz(0L);
        this.aA = null;
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        String strValueOf8 = String.valueOf(this.h);
        String strValueOf9 = String.valueOf(this.i);
        String strValueOf10 = String.valueOf(this.j);
        String strValueOf11 = String.valueOf(this.k);
        String strValueOf12 = String.valueOf(this.l);
        String strValueOf13 = String.valueOf(this.m);
        String strValueOf14 = String.valueOf(this.n);
        String strValueOf15 = String.valueOf(this.o);
        String strValueOf16 = String.valueOf(this.p);
        String strValueOf17 = String.valueOf(this.q);
        String strValueOf18 = String.valueOf(this.r);
        String strValueOf19 = String.valueOf(this.s);
        String strValueOf20 = String.valueOf(this.t);
        String strValueOf21 = String.valueOf(this.u);
        String strValueOf22 = String.valueOf(this.v);
        String strValueOf23 = String.valueOf(this.w);
        String strValueOf24 = String.valueOf(this.x);
        String strValueOf25 = String.valueOf(this.y);
        String strValueOf26 = String.valueOf(this.z);
        String strValueOf27 = String.valueOf(this.A);
        String strValueOf28 = String.valueOf(this.B);
        String strValueOf29 = String.valueOf(this.C);
        String strValueOf30 = String.valueOf(this.D);
        String strValueOf31 = String.valueOf(this.E);
        String strValueOf32 = String.valueOf(this.F);
        String strValueOf33 = String.valueOf(this.G);
        String strValueOf34 = String.valueOf(this.H);
        String strValueOf35 = String.valueOf(this.I);
        String strValueOf36 = String.valueOf(this.J);
        String strValueOf37 = String.valueOf(this.K);
        String strValueOf38 = String.valueOf(this.L);
        String strValueOf39 = String.valueOf(this.M);
        String strValueOf40 = String.valueOf(this.N);
        String strValueOf41 = String.valueOf(this.O);
        String strValueOf42 = String.valueOf(this.P);
        String strValueOf43 = String.valueOf(this.Q);
        String strValueOf44 = String.valueOf(this.R);
        String strValueOf45 = String.valueOf(this.S);
        String strValueOf46 = String.valueOf(this.T);
        String strValueOf47 = String.valueOf(this.U);
        String strValueOf48 = String.valueOf(this.V);
        String strValueOf49 = String.valueOf(this.W);
        String strValueOf50 = String.valueOf(this.X);
        String strValueOf51 = String.valueOf(this.Y);
        String strValueOf52 = String.valueOf(this.Z);
        String strValueOf53 = String.valueOf(this.aa);
        String strValueOf54 = String.valueOf(this.ab);
        String strValueOf55 = String.valueOf(this.ac);
        String strValueOf56 = String.valueOf(this.ad);
        String strValueOf57 = String.valueOf(this.ae);
        String strValueOf58 = String.valueOf(this.af);
        String strValueOf59 = String.valueOf(this.ag);
        byte[] bArr = this.ah;
        return String.format(locale, "MessageAnnotationJoinConversations [messages_annotations.messages_annotations__id: %s,\n  messages_annotations.messages_annotations_conversation_id: %s,\n  messages_annotations.messages_annotations_message_id: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_subtitle: %s,\n  conversations.conversations_latest_message_id: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_last_read_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_normalized_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_normalized_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_comparable_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_destination_token: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_sms_service_center: %s,\n  conversations.conversations_participant_id_list: %s,\n  conversations.conversations_normalized_participant_id_list: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_last_interactive_event_timestamp: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_normalized_participant_display_destination: %s,\n  conversations.conversations_spam_warning_dismiss_status: %s,\n  conversations.conversations_open_count: %s,\n  conversations.conversations_last_logged_scooby_metadata_timestamp: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_tachygram_group_routing_info_token: %s,\n  conversations.conversations_cms_most_recent_read_message_timestamp_ms: %s,\n  conversations.conversations_rcs_subject_change_timestamp_ms: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_rcs_group_capabilities: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_duplicate_of: %s,\n  conversations.conversations_new_duplicate_of: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_cms_life_cycle: %s,\n  conversations.conversations_rcs_group_self_msisdn: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_custom_theme: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_mms_group_upgrade_retries: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_encryption_id: %s,\n  conversations.conversations_cms_correlation_id: %s,\n  conversations.conversations_rcs_group_icon_url: %s,\n  conversations.conversations_unread_count: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, strValueOf37, strValueOf38, strValueOf39, strValueOf40, strValueOf41, strValueOf42, strValueOf43, strValueOf44, strValueOf45, strValueOf46, strValueOf47, strValueOf48, strValueOf49, strValueOf50, strValueOf51, strValueOf52, strValueOf53, strValueOf54, strValueOf55, strValueOf56, strValueOf57, strValueOf58, strValueOf59, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay), String.valueOf(this.az), String.valueOf(this.aA), String.valueOf(this.aB), String.valueOf(this.aC), String.valueOf(this.aD));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bjdf.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* synthetic */ void c(dqqj dqqjVar) {
        cidt cidtVar;
        ezds ezdsVar;
        bjdc bjdcVar = (bjdc) dqqjVar;
        aC();
        this.cN = bjdcVar.cV();
        if (bjdcVar.dj(0)) {
            this.a = bjdcVar.getString(bjdcVar.cO(0, bjdf.a));
            fN(0);
        }
        if (bjdcVar.dj(1)) {
            this.b = barn.b(bjdcVar.getString(bjdcVar.cO(1, bjdf.a)));
            fN(1);
        }
        if (bjdcVar.dj(2)) {
            this.c = new MessageIdType(bjdcVar.getLong(bjdcVar.cO(2, bjdf.a)));
            fN(2);
        }
        if (bjdcVar.dj(3)) {
            this.d = bjdcVar.getInt(bjdcVar.cO(3, bjdf.a));
            fN(3);
        }
        if (bjdcVar.dj(4)) {
            byte[] blob = bjdcVar.getBlob(bjdcVar.cO(4, bjdf.a));
            if (blob == null) {
                ezdsVar = null;
            } else {
                try {
                    ezdsVar = (ezds) evsn.parseFrom(ezds.a, blob, evrr.a());
                } catch (Throwable unused) {
                    ezdsVar = ezds.a;
                }
            }
            this.e = ezdsVar;
            fN(4);
        }
        if (bjdcVar.dj(5)) {
            this.f = new ConversationIdType(bjdcVar.getLong(bjdcVar.cO(5, bjdf.a)));
            fN(5);
        }
        if (bjdcVar.dj(6)) {
            this.g = cnqj.b(bjdcVar.getLong(bjdcVar.cO(6, bjdf.a)));
            fN(6);
        }
        if (bjdcVar.dj(7)) {
            this.h = bjdcVar.getString(bjdcVar.cO(7, bjdf.a));
            fN(7);
        }
        if (bjdcVar.dj(8)) {
            bvdp[] bvdpVarArrValues = bvdp.values();
            int i = bjdcVar.getInt(bjdcVar.cO(8, bjdf.a));
            if (i >= bvdpVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.i = bvdpVarArrValues[i];
            fN(8);
        }
        if (bjdcVar.dj(9)) {
            this.j = bjdcVar.getString(bjdcVar.cO(9, bjdf.a));
            fN(9);
        }
        if (bjdcVar.dj(10)) {
            this.k = new MessageIdType(bjdcVar.getLong(bjdcVar.cO(10, bjdf.a)));
            fN(10);
        }
        if (bjdcVar.dj(11)) {
            this.l = cssq.a(bjdcVar.getString(bjdcVar.cO(11, bjdf.a)));
            fN(11);
        }
        if (bjdcVar.dj(12)) {
            this.m = cssq.a(bjdcVar.getString(bjdcVar.cO(12, bjdf.a)));
            fN(12);
        }
        if (bjdcVar.dj(13)) {
            String string = bjdcVar.getString(bjdcVar.cO(13, bjdf.a));
            this.n = string == null ? null : Uri.parse(string);
            fN(13);
        }
        if (bjdcVar.dj(14)) {
            this.o = bjdcVar.getString(bjdcVar.cO(14, bjdf.a));
            fN(14);
        }
        if (bjdcVar.dj(15)) {
            this.p = bjdcVar.getInt(bjdcVar.cO(15, bjdf.a)) == 1;
            fN(15);
        }
        if (bjdcVar.dj(16)) {
            this.q = cssq.a(bjdcVar.getString(bjdcVar.cO(16, bjdf.a)));
            fN(16);
        }
        if (bjdcVar.dj(17)) {
            this.r = cssq.a(bjdcVar.getString(bjdcVar.cO(17, bjdf.a)));
            fN(17);
        }
        if (bjdcVar.dj(18)) {
            String string2 = bjdcVar.getString(bjdcVar.cO(18, bjdf.a));
            this.s = string2 == null ? null : Uri.parse(string2);
            fN(18);
        }
        if (bjdcVar.dj(19)) {
            this.t = bjdcVar.getString(bjdcVar.cO(19, bjdf.a));
            fN(19);
        }
        if (bjdcVar.dj(20)) {
            this.u = bjdcVar.getInt(bjdcVar.cO(20, bjdf.a));
            fN(20);
        }
        if (bjdcVar.dj(21)) {
            this.v = bvdk.a(bjdcVar.getInt(bjdcVar.cO(21, bjdf.a)));
            fN(21);
        }
        if (bjdcVar.dj(22)) {
            this.w = bjdcVar.getLong(bjdcVar.cO(22, bjdf.a));
            fN(22);
        }
        if (bjdcVar.dj(23)) {
            this.x = bjdcVar.getLong(bjdcVar.cO(23, bjdf.a));
            fN(23);
        }
        if (bjdcVar.dj(24)) {
            this.y = bjdcVar.getString(bjdcVar.cO(24, bjdf.a));
            fN(24);
        }
        if (bjdcVar.dj(25)) {
            this.z = bjdcVar.getLong(bjdcVar.cO(25, bjdf.a));
            fN(25);
        }
        if (bjdcVar.dj(26)) {
            this.A = bjdcVar.getLong(bjdcVar.cO(26, bjdf.a));
            fN(26);
        }
        if (bjdcVar.dj(27)) {
            this.B = bjdcVar.getString(bjdcVar.cO(27, bjdf.a));
            fN(27);
        }
        if (bjdcVar.dj(28)) {
            this.C = bjdcVar.getString(bjdcVar.cO(28, bjdf.a));
            fN(28);
        }
        if (bjdcVar.dj(29)) {
            this.D = bjdcVar.getString(bjdcVar.cO(29, bjdf.a));
            fN(29);
        }
        if (bjdcVar.dj(30)) {
            this.E = bjdcVar.getString(bjdcVar.cO(30, bjdf.a));
            fN(30);
        }
        if (bjdcVar.dj(31)) {
            this.F = bjdcVar.getString(bjdcVar.cO(31, bjdf.a));
            fN(31);
        }
        if (bjdcVar.dj(32)) {
            this.G = axcn.a(bjdcVar.getString(bjdcVar.cO(32, bjdf.a)));
            fN(32);
        }
        if (bjdcVar.dj(33)) {
            this.H = awjm.a(bjdcVar.getString(bjdcVar.cO(33, bjdf.a)));
            fN(33);
        }
        if (bjdcVar.dj(34)) {
            this.I = bjdcVar.getInt(bjdcVar.cO(34, bjdf.a));
            fN(34);
        }
        if (bjdcVar.dj(35)) {
            this.J = bjdcVar.getInt(bjdcVar.cO(35, bjdf.a)) == 1;
            fN(35);
        }
        if (bjdcVar.dj(36)) {
            this.K = bjdcVar.getString(bjdcVar.cO(36, bjdf.a));
            fN(36);
        }
        if (bjdcVar.dj(37)) {
            this.L = bjdcVar.getInt(bjdcVar.cO(37, bjdf.a)) == 1;
            fN(37);
        }
        if (bjdcVar.dj(38)) {
            this.M = bjdcVar.getInt(bjdcVar.cO(38, bjdf.a)) == 1;
            fN(38);
        }
        if (bjdcVar.dj(39)) {
            this.N = bjdcVar.getString(bjdcVar.cO(39, bjdf.a));
            fN(39);
        }
        if (bjdcVar.dj(40)) {
            this.O = bjdcVar.getString(bjdcVar.cO(40, bjdf.a));
            fN(40);
        }
        if (bjdcVar.dj(41)) {
            this.P = bjdcVar.getString(bjdcVar.cO(41, bjdf.a));
            fN(41);
        }
        if (bjdcVar.dj(42)) {
            this.Q = bjdcVar.getInt(bjdcVar.cO(42, bjdf.a));
            fN(42);
        }
        if (bjdcVar.dj(43)) {
            this.R = bjdcVar.getLong(bjdcVar.cO(43, bjdf.a));
            fN(43);
        }
        if (bjdcVar.dj(44)) {
            this.S = bjdcVar.getInt(bjdcVar.cO(44, bjdf.a));
            fN(44);
        }
        if (bjdcVar.dj(45)) {
            this.T = bjdcVar.getInt(bjdcVar.cO(45, bjdf.a));
            fN(45);
        }
        if (bjdcVar.dj(46)) {
            this.U = bjdcVar.getInt(bjdcVar.cO(46, bjdf.a));
            fN(46);
        }
        if (bjdcVar.dj(47)) {
            this.V = bjdcVar.getInt(bjdcVar.cO(47, bjdf.a)) == 1;
            fN(47);
        }
        if (bjdcVar.dj(48)) {
            this.W = bjdcVar.getInt(bjdcVar.cO(48, bjdf.a)) == 1;
            fN(48);
        }
        if (bjdcVar.dj(49)) {
            this.X = bjdcVar.getLong(bjdcVar.cO(49, bjdf.a));
            fN(49);
        }
        if (bjdcVar.dj(50)) {
            this.Y = cssq.a(bjdcVar.getString(bjdcVar.cO(50, bjdf.a)));
            fN(50);
        }
        if (bjdcVar.dj(51)) {
            this.Z = cssq.a(bjdcVar.getString(bjdcVar.cO(51, bjdf.a)));
            fN(51);
        }
        if (bjdcVar.dj(52)) {
            this.aa = bjdcVar.getInt(bjdcVar.cO(52, bjdf.a)) == 1;
            fN(52);
        }
        if (bjdcVar.dj(53)) {
            this.ab = bjdcVar.getInt(bjdcVar.cO(53, bjdf.a));
            fN(53);
        }
        if (bjdcVar.dj(54)) {
            this.ac = bjdcVar.getLong(bjdcVar.cO(54, bjdf.a));
            fN(54);
        }
        if (bjdcVar.dj(55)) {
            this.ad = bjdcVar.getLong(bjdcVar.cO(55, bjdf.a));
            fN(55);
        }
        if (bjdcVar.dj(56)) {
            this.ae = bjdcVar.getString(bjdcVar.cO(56, bjdf.a));
            fN(56);
        }
        if (bjdcVar.dj(57)) {
            this.af = bjdcVar.getString(bjdcVar.cO(57, bjdf.a));
            fN(57);
        }
        if (bjdcVar.dj(58)) {
            this.ag = csrz.a(bjdcVar.getString(bjdcVar.cO(58, bjdf.a)));
            fN(58);
        }
        if (bjdcVar.dj(59)) {
            this.ah = bjdcVar.getBlob(bjdcVar.cO(59, bjdf.a));
            fN(59);
        }
        if (bjdcVar.dj(60)) {
            this.ai = bjdcVar.getLong(bjdcVar.cO(60, bjdf.a));
            fN(60);
        }
        if (bjdcVar.dj(61)) {
            this.aj = bjdcVar.getLong(bjdcVar.cO(61, bjdf.a));
            fN(61);
        }
        if (bjdcVar.dj(62)) {
            this.ak = bjdcVar.getInt(bjdcVar.cO(62, bjdf.a)) == 1;
            fN(62);
        }
        if (bjdcVar.dj(63)) {
            this.al = new cigb(bjdcVar.getLong(bjdcVar.cO(63, bjdf.a)));
            fN(63);
        }
        if (bjdcVar.dj(64)) {
            this.am = bjdcVar.getInt(bjdcVar.cO(64, bjdf.a)) == 1;
            fN(64);
        }
        if (bjdcVar.dj(65)) {
            this.an = new ConversationIdType(bjdcVar.getLong(bjdcVar.cO(65, bjdf.a)));
            fN(65);
        }
        if (bjdcVar.dj(66)) {
            this.ao = new ConversationIdType(bjdcVar.getLong(bjdcVar.cO(66, bjdf.a)));
            fN(66);
        }
        if (bjdcVar.dj(67)) {
            this.ap = avoe.b(bjdcVar.getInt(bjdcVar.cO(67, bjdf.a)));
            fN(67);
        }
        if (bjdcVar.dj(68)) {
            cpyi[] cpyiVarArrValues = cpyi.values();
            int i2 = bjdcVar.getInt(bjdcVar.cO(68, bjdf.a));
            if (i2 >= cpyiVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aq = cpyiVarArrValues[i2];
            fN(68);
        }
        if (bjdcVar.dj(69)) {
            this.ar = bjdcVar.getString(bjdcVar.cO(69, bjdf.a));
            fN(69);
        }
        if (bjdcVar.dj(70)) {
            this.as = basb.b(bjdcVar.getLong(bjdcVar.cO(70, bjdf.a)));
            fN(70);
        }
        if (bjdcVar.dj(71)) {
            this.at = basb.b(bjdcVar.getLong(bjdcVar.cO(71, bjdf.a)));
            fN(71);
        }
        if (bjdcVar.dj(72)) {
            this.au = bjdcVar.getInt(bjdcVar.cO(72, bjdf.a)) == 1;
            fN(72);
        }
        if (bjdcVar.dj(73)) {
            this.av = bjdcVar.getInt(bjdcVar.cO(73, bjdf.a)) == 1;
            fN(73);
        }
        if (bjdcVar.dj(74)) {
            byte[] blob2 = bjdcVar.getBlob(bjdcVar.cO(74, bjdf.a));
            if (blob2 == null) {
                cidtVar = null;
            } else {
                try {
                    cidtVar = (cidt) evsn.parseFrom(cidt.a, blob2, evrr.a());
                } catch (Throwable unused2) {
                    cidtVar = cidt.a;
                }
            }
            this.aw = cidtVar;
            fN(74);
        }
        if (bjdcVar.dj(75)) {
            cins[] cinsVarArrValues = cins.values();
            int i3 = bjdcVar.getInt(bjdcVar.cO(75, bjdf.a));
            if (i3 >= cinsVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.ax = cinsVarArrValues[i3];
            fN(75);
        }
        if (bjdcVar.dj(76)) {
            this.ay = bjdcVar.getInt(bjdcVar.cO(76, bjdf.a));
            fN(76);
        }
        if (bjdcVar.dj(77)) {
            this.az = new cbqz(bjdcVar.getLong(bjdcVar.cO(77, bjdf.a)));
            fN(77);
        }
        if (bjdcVar.dj(78)) {
            this.aA = cbqw.a(bjdcVar.getString(bjdcVar.cO(78, bjdf.a)));
            fN(78);
        }
        if (bjdcVar.dj(79)) {
            this.aB = bjdcVar.getString(bjdcVar.cO(79, bjdf.a));
            fN(79);
        }
        if (bjdcVar.dj(80)) {
            String string3 = bjdcVar.getString(bjdcVar.cO(80, bjdf.a));
            this.aC = string3 != null ? Uri.parse(string3) : null;
            fN(80);
        }
        if (bjdcVar.dj(81)) {
            this.aD = bjdcVar.getInt(bjdcVar.cO(81, bjdf.a));
            fN(81);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof biwn)) {
            return false;
        }
        biwn biwnVar = (biwn) obj;
        return super.aE(biwnVar.cN) && Objects.equals(this.a, biwnVar.a) && Objects.equals(this.b, biwnVar.b) && Objects.equals(this.c, biwnVar.c) && this.d == biwnVar.d && Objects.equals(this.e, biwnVar.e) && Objects.equals(this.f, biwnVar.f) && Objects.equals(this.g, biwnVar.g) && Objects.equals(this.h, biwnVar.h) && this.i == biwnVar.i && Objects.equals(this.j, biwnVar.j) && Objects.equals(this.k, biwnVar.k) && Objects.equals(this.l, biwnVar.l) && Objects.equals(this.m, biwnVar.m) && Objects.equals(this.n, biwnVar.n) && Objects.equals(this.o, biwnVar.o) && this.p == biwnVar.p && Objects.equals(this.q, biwnVar.q) && Objects.equals(this.r, biwnVar.r) && Objects.equals(this.s, biwnVar.s) && Objects.equals(this.t, biwnVar.t) && this.u == biwnVar.u && this.v == biwnVar.v && this.w == biwnVar.w && this.x == biwnVar.x && Objects.equals(this.y, biwnVar.y) && this.z == biwnVar.z && this.A == biwnVar.A && Objects.equals(this.B, biwnVar.B) && Objects.equals(this.C, biwnVar.C) && Objects.equals(this.D, biwnVar.D) && Objects.equals(this.E, biwnVar.E) && Objects.equals(this.F, biwnVar.F) && Objects.equals(this.G, biwnVar.G) && Objects.equals(this.H, biwnVar.H) && this.I == biwnVar.I && this.J == biwnVar.J && Objects.equals(this.K, biwnVar.K) && this.L == biwnVar.L && this.M == biwnVar.M && Objects.equals(this.N, biwnVar.N) && Objects.equals(this.O, biwnVar.O) && Objects.equals(this.P, biwnVar.P) && this.Q == biwnVar.Q && this.R == biwnVar.R && this.S == biwnVar.S && this.T == biwnVar.T && this.U == biwnVar.U && this.V == biwnVar.V && this.W == biwnVar.W && this.X == biwnVar.X && Objects.equals(this.Y, biwnVar.Y) && Objects.equals(this.Z, biwnVar.Z) && this.aa == biwnVar.aa && this.ab == biwnVar.ab && this.ac == biwnVar.ac && this.ad == biwnVar.ad && Objects.equals(this.ae, biwnVar.ae) && Objects.equals(this.af, biwnVar.af) && Objects.equals(this.ag, biwnVar.ag) && Arrays.equals(this.ah, biwnVar.ah) && this.ai == biwnVar.ai && this.aj == biwnVar.aj && this.ak == biwnVar.ak && Objects.equals(this.al, biwnVar.al) && this.am == biwnVar.am && Objects.equals(this.an, biwnVar.an) && Objects.equals(this.ao, biwnVar.ao) && this.ap == biwnVar.ap && this.aq == biwnVar.aq && Objects.equals(this.ar, biwnVar.ar) && Objects.equals(this.as, biwnVar.as) && Objects.equals(this.at, biwnVar.at) && this.au == biwnVar.au && this.av == biwnVar.av && Objects.equals(this.aw, biwnVar.aw) && this.ax == biwnVar.ax && this.ay == biwnVar.ay && Objects.equals(this.az, biwnVar.az) && Objects.equals(this.aA, biwnVar.aA) && Objects.equals(this.aB, biwnVar.aB) && Objects.equals(this.aC, biwnVar.aC) && this.aD == biwnVar.aD;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        ConversationIdType conversationIdType = this.b;
        MessageIdType messageIdType = this.c;
        Integer numValueOf = Integer.valueOf(this.d);
        ezds ezdsVar = this.e;
        ConversationIdType conversationIdType2 = this.f;
        cnqj cnqjVar = this.g;
        String str2 = this.h;
        bvdp bvdpVar = this.i;
        Integer numValueOf2 = Integer.valueOf(bvdpVar == null ? 0 : bvdpVar.ordinal());
        String str3 = this.j;
        MessageIdType messageIdType2 = this.k;
        String str4 = this.l;
        String str5 = this.m;
        Uri uri = this.n;
        dqqe dqqeVar3 = dqqeVar2;
        String str6 = this.o;
        Boolean boolValueOf = Boolean.valueOf(this.p);
        String str7 = this.q;
        String str8 = this.r;
        Uri uri2 = this.s;
        String str9 = this.t;
        Integer numValueOf3 = Integer.valueOf(this.u);
        bvdk bvdkVar = this.v;
        Long lValueOf = Long.valueOf(this.w);
        Long lValueOf2 = Long.valueOf(this.x);
        String str10 = this.y;
        Long lValueOf3 = Long.valueOf(this.z);
        Long lValueOf4 = Long.valueOf(this.A);
        String str11 = this.B;
        String str12 = this.C;
        String str13 = this.D;
        String str14 = this.E;
        String str15 = this.F;
        axcm axcmVar = this.G;
        awjl awjlVar = this.H;
        Integer numValueOf4 = Integer.valueOf(this.I);
        Boolean boolValueOf2 = Boolean.valueOf(this.J);
        String str16 = this.K;
        Boolean boolValueOf3 = Boolean.valueOf(this.L);
        Boolean boolValueOf4 = Boolean.valueOf(this.M);
        String str17 = this.N;
        String str18 = this.O;
        String str19 = this.P;
        Integer numValueOf5 = Integer.valueOf(this.Q);
        Long lValueOf5 = Long.valueOf(this.R);
        Integer numValueOf6 = Integer.valueOf(this.S);
        Integer numValueOf7 = Integer.valueOf(this.T);
        Integer numValueOf8 = Integer.valueOf(this.U);
        Boolean boolValueOf5 = Boolean.valueOf(this.V);
        Boolean boolValueOf6 = Boolean.valueOf(this.W);
        Long lValueOf6 = Long.valueOf(this.X);
        String str20 = this.Y;
        String str21 = this.Z;
        Boolean boolValueOf7 = Boolean.valueOf(this.aa);
        Integer numValueOf9 = Integer.valueOf(this.ab);
        Long lValueOf7 = Long.valueOf(this.ac);
        Long lValueOf8 = Long.valueOf(this.ad);
        String str22 = this.ae;
        String str23 = this.af;
        String str24 = this.ag;
        Integer numValueOf10 = Integer.valueOf(Arrays.hashCode(this.ah));
        Long lValueOf9 = Long.valueOf(this.ai);
        Long lValueOf10 = Long.valueOf(this.aj);
        Boolean boolValueOf8 = Boolean.valueOf(this.ak);
        cigb cigbVar = this.al;
        Boolean boolValueOf9 = Boolean.valueOf(this.am);
        ConversationIdType conversationIdType3 = this.an;
        ConversationIdType conversationIdType4 = this.ao;
        avoe avoeVar = this.ap;
        cpyi cpyiVar = this.aq;
        Integer numValueOf11 = Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal());
        String str25 = this.ar;
        Optional optional = this.as;
        Optional optional2 = this.at;
        Boolean boolValueOf10 = Boolean.valueOf(this.au);
        Boolean boolValueOf11 = Boolean.valueOf(this.av);
        cidt cidtVar = this.aw;
        cins cinsVar = this.ax;
        return Objects.hash(dqqeVar3, str, conversationIdType, messageIdType, numValueOf, ezdsVar, conversationIdType2, cnqjVar, str2, numValueOf2, str3, messageIdType2, str4, str5, uri, str6, boolValueOf, str7, str8, uri2, str9, numValueOf3, bvdkVar, lValueOf, lValueOf2, str10, lValueOf3, lValueOf4, str11, str12, str13, str14, str15, axcmVar, awjlVar, numValueOf4, boolValueOf2, str16, boolValueOf3, boolValueOf4, str17, str18, str19, numValueOf5, lValueOf5, numValueOf6, numValueOf7, numValueOf8, boolValueOf5, boolValueOf6, lValueOf6, str20, str21, boolValueOf7, numValueOf9, lValueOf7, lValueOf8, str22, str23, str24, numValueOf10, lValueOf9, lValueOf10, boolValueOf8, cigbVar, boolValueOf9, conversationIdType3, conversationIdType4, avoeVar, numValueOf11, str25, optional, optional2, boolValueOf10, boolValueOf11, cidtVar, Integer.valueOf(cinsVar == null ? 0 : cinsVar.ordinal()), Integer.valueOf(this.ay), this.az, this.aA, this.aB, this.aC, Integer.valueOf(this.aD), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageAnnotationJoinConversations -- REDACTED") : a();
    }
}
