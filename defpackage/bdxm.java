package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bdxm extends dqpd {
    public String A;
    public String B;
    public long C;
    public basd D;
    public int E;
    public cpyi F;
    public cgrd G;
    public bvdn H;
    public fhaz I;
    public bvec J;
    public String[] K;
    public String[] L;
    public String[] M;
    public String[] N;
    public String O;
    public String[] P;
    public MessageIdType Q;
    public String[] R;
    public String S;
    public Uri[] T;
    public String[] U;
    public Uri[] V;
    public Uri[] W;
    public int[] X;
    public int[] Y;
    public long Z;
    public MessageIdType a;
    public String aA;
    public boolean[] aB;
    public long[] aC;
    public byte[][] aD;
    public byte[][] aE;
    public boolean[] aF;
    public boolean aG;
    public long aH;
    public String aI;
    public bvdr[] aJ;
    public dqbw aK;
    public bvef aL;
    public athh aM;
    public bvdy aN;
    public bvdq aO;
    public boolean aP;
    public long[] aQ;
    public PartsTable.BindData[] aR;
    public String aS;
    public String aT;
    public String aU;
    public String aV;
    public String aW;
    public Uri aX;
    public long aY;
    public String aZ;
    public Uri aa;
    public long[] ab;
    public bvdt ac;
    public bvdl[] ad;
    public ConversationIdType ae;
    public bvdg af;
    public bvdg ag;
    public long ah;
    public double ai;
    public double aj;
    public Uri[] ak;
    public String al;
    public Uri[] am;
    public int[] an;
    public int[] ao;
    public String[] ap;
    public String[] aq;
    public String ar;
    public byte[] as;
    public byte[] at;
    public boolean[] au;
    public long[] av;
    public String[] aw;
    public String[] ax;
    public long[] ay;
    public String[] az;
    public ConversationIdType b;
    public int[] bA;
    public int[] bB;
    public int[] bC;
    public int[] bD;
    public long[] bE;
    public ParticipantsTable.BindData[] bF;
    public MessageIdType bG;
    public String bH;
    public long bI;
    public String bJ;
    public String bK;
    public String bL;
    public String bM;
    public String bN;
    public boolean bO;
    public boolean bP;
    public bpvd bQ;
    public String bR;
    public String bS;
    public Uri bT;
    public buzr bU;
    public String bV;
    public int bW;
    public boolean bX;
    public String bY;
    public String bZ;
    public int ba;
    public int bb;
    public int bc;
    public boolean bd;
    public int be;
    public boolean bf;
    public bvdz bg;
    public long bh;
    public chpq bi;
    public chpq bj;
    public ParticipantsTable.BindData bk;
    public String bl;
    public MessageIdType bm;
    public long[] bn;
    public long[] bo;
    public long[] bp;
    public Optional[] bq;
    public long[] br;
    public btai[] bs;
    public String bt;
    public MessageIdType bu;
    public long[] bv;
    public long[] bw;
    public long[] bx;
    public buxp[] by;
    public String[] bz;
    public String c;
    public long cA;
    public PartsTable.BindData cB;
    public String cC;
    public long cD;
    public String cE;
    public String cF;
    public boolean cG;
    public bpvd cH;
    public String cI;
    public String cJ;
    public MessagesTable.BindData cK;
    public boolean ca;
    public Optional cb;
    public cklv cc;
    public String cd;
    public MessageIdType ce;
    public cgvx cf;
    public String[] cg;
    public aonp[] ch;
    public String[] ci;
    public String[] cj;
    public long[] ck;
    public VmtTable.BindData[] cl;
    public MessageIdType cm;
    public long cn;
    public MessagesTable.BindData co;
    public String cp;
    public int cq;
    public String cr;
    public String cs;
    public String ct;
    public String cu;
    public ParticipantsTable.BindData cv;
    public String cw;
    public Uri cx;
    public String cy;
    public String cz;
    public long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public Uri k;
    public int l;
    public long m;
    public String n;
    public long o;
    public long p;
    public String q;
    public int r;
    public String s;
    public basd t;
    public int u;
    public bvdz v;
    public boolean w;
    public long x;
    public int y;
    public String z;

    protected bdxm() {
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        ConversationIdType conversationIdType = barn.a;
        this.b = conversationIdType;
        this.d = 0L;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.l = 0;
        this.m = 0L;
        this.o = 0L;
        this.p = 0L;
        this.r = 0;
        basd basdVar = basd.a;
        this.t = basdVar;
        this.u = 0;
        bvdz bvdzVar = bvdz.VERIFICATION_NA;
        this.v = bvdzVar;
        this.w = false;
        this.x = -1L;
        this.y = -1;
        this.B = "";
        this.C = 0L;
        this.D = basdVar;
        this.E = -2;
        this.F = cpyi.UNKNOWN;
        this.G = cgrd.c;
        this.H = bvdn.UNKNOWN;
        this.J = bvec.UNKNOWN;
        this.Q = messageIdType;
        this.ac = bvdt.SUCCEEDED;
        this.ae = conversationIdType;
        this.af = new bvdg(-1);
        this.ag = new bvdg(-1);
        this.ah = -1L;
        this.ai = 0.0d;
        this.aj = 0.0d;
        this.aG = false;
        this.aL = bvef.UNKNOWN;
        this.aM = null;
        this.aN = bvdy.NONE;
        this.aO = bvdq.DEFAULT_NO_VERDICT;
        this.aP = false;
        this.aY = -1L;
        this.ba = -1;
        this.bb = 0;
        this.bc = 0;
        this.bd = false;
        this.be = 0;
        this.bf = false;
        this.bg = bvdzVar;
        this.bh = -1L;
        chpq chpqVar = chpq.PROFILE_CONTACT_SOURCE;
        this.bi = chpqVar;
        this.bj = chpqVar;
        this.bm = messageIdType;
        this.bu = messageIdType;
        this.bG = messageIdType;
        this.bI = 0L;
        this.bO = false;
        this.bP = false;
        this.bW = 0;
        this.bX = false;
        this.ca = true;
        this.cb = basb.b(-1L);
        this.ce = messageIdType;
        this.cm = messageIdType;
        this.cn = 0L;
        this.cq = -2;
        this.cD = 0L;
        this.cG = false;
    }

    private final long[] m() {
        aA(115, "participant_id");
        return this.bn;
    }

    private final long[] n() {
        aA(122, "user_ref_id");
        return this.bv;
    }

    private final String[] o() {
        aA(41, "_id");
        return this.P;
    }

    private final String[] p() {
        aA(125, "normalized_destination");
        return this.bz;
    }

    private final String[] q() {
        aA(155, "part_id");
        return this.cg;
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
        String strAM = aM(this.P);
        String strValueOf37 = String.valueOf(this.Q);
        String strAM2 = aM(this.R);
        String strValueOf38 = String.valueOf(this.S);
        String strAL = aL(this.T);
        String strAM3 = aM(this.U);
        String strAL2 = aL(this.V);
        String strAL3 = aL(this.W);
        String strAJ = aJ(this.X);
        String strAJ2 = aJ(this.Y);
        String strValueOf39 = String.valueOf(this.Z);
        String strValueOf40 = String.valueOf(this.aa);
        String strAK = aK(this.ab);
        String strValueOf41 = String.valueOf(this.ac);
        String strAL4 = aL(this.ad);
        String strValueOf42 = String.valueOf(this.ae);
        String strValueOf43 = String.valueOf(this.af);
        String strValueOf44 = String.valueOf(this.ag);
        String strValueOf45 = String.valueOf(this.ah);
        String strValueOf46 = String.valueOf(this.ai);
        String strValueOf47 = String.valueOf(this.aj);
        String strAL5 = aL(this.ak);
        String strValueOf48 = String.valueOf(this.al);
        String strAL6 = aL(this.am);
        String strAJ3 = aJ(this.an);
        String strAJ4 = aJ(this.ao);
        String strAM4 = aM(this.ap);
        String strValueOf49 = String.valueOf(this.ar);
        byte[] bArr = this.as;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.at;
        return String.format(locale, "ConversationMessagesOptimizedQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_xms_transport: %s,\n  null.user_ref_display_name: %s,\n  null.user_ref_profile_photo_uri: %s,\n  null.user_ref_full_name: %s,\n  null.user_ref_lookup_key: %s,\n  null.parts_count: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_raw_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s,\n  parts.parts_rowid: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_profile_photo_uri: %s,\n  participants.participants_contact_id: %s,\n  participants.participants_lookup_key: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_blocked: %s,\n  participants.participants_participant_type: %s,\n  participants.participants_is_spam: %s,\n  participants.participants_latest_verification_status: %s,\n  participants.participants_directory_id: %s,\n  participants.participants_name_source: %s,\n  participants.participants_photo_source: %s,\n  read_reports.read_reports__id: %s,\n  read_reports.read_reports_message_id: %s,\n  read_reports.read_reports_participant_id: %s,\n  read_reports.read_reports_receive_time: %s,\n  read_reports.read_reports_read_time: %s,\n  read_reports.read_reports_ftd_time: %s,\n  read_reports.read_reports_rowid: %s,\n  user_references.user_references__id: %s,\n  user_references.user_references_message_id: %s,\n  user_references.user_references_user_ref_id: %s,\n  user_references.user_references_user_ref_datetime: %s,\n  user_references.user_references_rowid: %s,\n  user_ref_participant.user_ref_participant_normalized_destination: %s,\n  user_ref_participant.user_ref_participant_color_palette_index: %s,\n  user_ref_participant.user_ref_participant_color_type: %s,\n  user_ref_participant.user_ref_participant_extended_color: %s,\n  user_ref_participant.user_ref_participant_participant_type: %s,\n  user_ref_participant.user_ref_participant_rowid: %s,\n  link_preview.link_preview_message_id: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_description: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_domain: %s,\n  link_preview.link_preview_link_canonical_url: %s,\n  link_preview.link_preview_link_preview_prevented: %s,\n  link_preview.link_preview_link_preview_failed: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  message_reactions.message_reactions_reactions_data: %s,\n  file_transfer.file_transfer_transfer_id: %s,\n  message_star.message_star_message_id: %s,\n  message_photos_sharing.message_photos_sharing_sharing_state: %s,\n  vmt.vmt_part_id: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  vmt.vmt_locale: %s,\n  vmt.vmt_rowid: %s,\n  replied_to_message.replied_to_message__id: %s,\n  replied_to_message.replied_to_message_received_timestamp: %s,\n  replied_to_participant.replied_to_participant__id: %s,\n  replied_to_participant.replied_to_participant_sub_id: %s,\n  replied_to_participant.replied_to_participant_normalized_destination: %s,\n  replied_to_participant.replied_to_participant_display_destination: %s,\n  replied_to_participant.replied_to_participant_full_name: %s,\n  replied_to_participant.replied_to_participant_first_name: %s,\n  replied_to_message_part.replied_to_message_part_text: %s,\n  replied_to_message_part.replied_to_message_part_uri: %s,\n  replied_to_message_part.replied_to_message_part_content_type: %s,\n  replied_to_message_part.replied_to_message_part_file_name: %s,\n  replied_to_message_part.replied_to_message_part_duration: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_trigger_url: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_expiration_time_millis: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_link_title: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_link_image_url: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_link_preview_failed: %s,\n  profiles_table.profiles_table_display_name: %s,\n  message_captions.message_captions_caption: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, "REDACTED", "REDACTED", "REDACTED", "REDACTED", "REDACTED", strAM, strValueOf37, strAM2, strValueOf38, strAL, strAM3, strAL2, strAL3, strAJ, strAJ2, strValueOf39, strValueOf40, strAK, strValueOf41, strAL4, strValueOf42, strValueOf43, strValueOf44, strValueOf45, strValueOf46, strValueOf47, strAL5, strValueOf48, strAL6, strAJ3, strAJ4, strAM4, "REDACTED", strValueOf49, strConcat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), aN(this.au), aK(this.av), aM(this.aw), aM(this.ax), aK(this.ay), aM(this.az), String.valueOf(this.aA), aN(this.aB), aK(this.aC), aL(this.aD), aL(this.aE), aN(this.aF), String.valueOf(this.aG), String.valueOf(this.aH), String.valueOf(this.aI), aL(this.aJ), String.valueOf(this.aK), String.valueOf(this.aL), String.valueOf(this.aM), String.valueOf(this.aN), String.valueOf(this.aO), String.valueOf(this.aP), aK(this.aQ), String.valueOf(this.aS), String.valueOf(this.aT), String.valueOf(this.aU), String.valueOf(this.aV), String.valueOf(this.aW), String.valueOf(this.aX), String.valueOf(this.aY), String.valueOf(this.aZ), String.valueOf(this.ba), String.valueOf(this.bb), String.valueOf(this.bc), String.valueOf(this.bd), String.valueOf(this.be), String.valueOf(this.bf), String.valueOf(this.bg), String.valueOf(this.bh), String.valueOf(this.bi), String.valueOf(this.bj), String.valueOf(this.bl), String.valueOf(this.bm), aK(this.bn), aK(this.bo), aK(this.bp), aL(this.bq), aK(this.br), String.valueOf(this.bt), String.valueOf(this.bu), aK(this.bv), aK(this.bw), aK(this.bx), aM(this.bz), aJ(this.bA), aJ(this.bB), aJ(this.bC), aJ(this.bD), aK(this.bE), String.valueOf(this.bG), String.valueOf(this.bH), String.valueOf(this.bI), String.valueOf(this.bJ), String.valueOf(this.bK), String.valueOf(this.bL), String.valueOf(this.bM), String.valueOf(this.bN), String.valueOf(this.bO), String.valueOf(this.bP), String.valueOf(this.bR), String.valueOf(this.bS), String.valueOf(this.bT), String.valueOf(this.bV), String.valueOf(this.bW), String.valueOf(this.bX), String.valueOf(this.bY), String.valueOf(this.bZ), String.valueOf(this.ca), String.valueOf(this.cb), String.valueOf(this.cc), String.valueOf(this.cd), String.valueOf(this.ce), String.valueOf(this.cf), aM(this.cg), aL(this.ch), aM(this.ci), aM(this.cj), aK(this.ck), String.valueOf(this.cm), String.valueOf(this.cn), String.valueOf(this.cp), String.valueOf(this.cq), String.valueOf(this.cr), String.valueOf(this.cs), String.valueOf(this.ct), String.valueOf(this.cu), String.valueOf(this.cw), String.valueOf(this.cx), String.valueOf(this.cy), String.valueOf(this.cz), String.valueOf(this.cA), String.valueOf(this.cC), String.valueOf(this.cD), String.valueOf(this.cE), String.valueOf(this.cF), String.valueOf(this.cG), String.valueOf(this.cI), String.valueOf(this.cJ));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bfrt.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        dqbw dqbwVar;
        bfrk bfrkVar = (bfrk) ((bfrj) dqqjVar);
        aC();
        this.cN = bfrkVar.cV();
        if (bfrkVar.dj(0)) {
            this.a = bfrkVar.g();
            fN(0);
        }
        if (bfrkVar.dj(1)) {
            this.b = bfrkVar.W();
            fN(1);
        }
        if (bfrkVar.dj(2)) {
            this.c = bfrkVar.m();
            fN(2);
        }
        if (bfrkVar.dj(3)) {
            this.d = bfrkVar.O();
            fN(3);
        }
        if (bfrkVar.dj(4)) {
            this.e = bfrkVar.e();
            fN(4);
        }
        if (bfrkVar.dj(5)) {
            this.f = bfrkVar.c();
            fN(5);
        }
        if (bfrkVar.dj(6)) {
            this.g = bfrkVar.d();
            fN(6);
        }
        if (bfrkVar.dj(7)) {
            this.h = bfrkVar.v();
            fN(7);
        }
        if (bfrkVar.dj(8)) {
            this.i = bfrkVar.br();
            fN(8);
        }
        if (bfrkVar.dj(9)) {
            this.j = bfrkVar.bu();
            fN(9);
        }
        if (bfrkVar.dj(10)) {
            this.k = bfrkVar.T();
            fN(10);
        }
        if (bfrkVar.dj(11)) {
            this.l = bfrkVar.B();
            fN(11);
        }
        if (bfrkVar.dj(12)) {
            this.m = bfrkVar.P();
            fN(12);
        }
        if (bfrkVar.dj(13)) {
            this.n = bfrkVar.aT();
            fN(13);
        }
        if (bfrkVar.dj(14)) {
            this.o = bfrkVar.K();
            fN(14);
        }
        if (bfrkVar.dj(15)) {
            this.p = bfrkVar.L();
            fN(15);
        }
        if (bfrkVar.dj(16)) {
            this.q = bfrkVar.aS();
            fN(16);
        }
        if (bfrkVar.dj(17)) {
            this.r = bfrkVar.x();
            fN(17);
        }
        if (bfrkVar.dj(18)) {
            this.s = bfrkVar.l();
            fN(18);
        }
        if (bfrkVar.dj(19)) {
            this.t = bfrkVar.ad();
            fN(19);
        }
        if (bfrkVar.dj(20)) {
            this.u = bfrkVar.y();
            fN(20);
        }
        if (bfrkVar.dj(21)) {
            this.v = bfrkVar.j();
            fN(21);
        }
        if (bfrkVar.dj(22)) {
            this.w = bfrkVar.n();
            fN(22);
        }
        if (bfrkVar.dj(23)) {
            this.x = bfrkVar.M();
            fN(23);
        }
        if (bfrkVar.dj(24)) {
            this.y = bfrkVar.A();
            fN(24);
        }
        if (bfrkVar.dj(25)) {
            this.z = bfrkVar.be();
            fN(25);
        }
        if (bfrkVar.dj(26)) {
            this.A = bfrkVar.av();
            fN(26);
        }
        if (bfrkVar.dj(27)) {
            this.B = bfrkVar.getString(bfrkVar.cO(27, bfrt.a));
            fN(27);
        }
        if (bfrkVar.dj(28)) {
            this.C = bfrkVar.getLong(bfrkVar.cO(28, bfrt.a));
            fN(28);
        }
        if (bfrkVar.dj(29)) {
            this.D = bfrkVar.ac();
            fN(29);
        }
        if (bfrkVar.dj(30)) {
            this.E = bfrkVar.z();
            fN(30);
        }
        if (bfrkVar.dj(31)) {
            this.F = bfrkVar.aq();
            fN(31);
        }
        if (bfrkVar.dj(32)) {
            this.G = bfrkVar.am();
            fN(32);
        }
        if (bfrkVar.dj(33)) {
            this.H = bfrkVar.ag();
            fN(33);
        }
        if (bfrkVar.dj(34)) {
            this.I = bfrkVar.bj();
            fN(34);
        }
        if (bfrkVar.dj(35)) {
            bvec[] bvecVarArrValues = bvec.values();
            int i = bfrkVar.getInt(bfrkVar.cO(35, bfrt.a));
            if (i >= bvecVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.J = bvecVarArrValues[i];
            fN(35);
        }
        if (bfrkVar.dj(36)) {
            this.K = bfrkVar.cl();
            fN(36);
        }
        if (bfrkVar.dj(37)) {
            this.L = bfrkVar.co();
            fN(37);
        }
        if (bfrkVar.dj(38)) {
            this.M = bfrkVar.cm();
            fN(38);
        }
        if (bfrkVar.dj(39)) {
            this.N = bfrkVar.cn();
            fN(39);
        }
        if (bfrkVar.dj(40)) {
            this.O = bfrkVar.aY();
            fN(40);
        }
        if (bfrkVar.dj(41)) {
            this.P = bfrkVar.o();
            fN(41);
        }
        if (bfrkVar.dj(42)) {
            this.Q = bfrkVar.Z();
            fN(42);
        }
        if (bfrkVar.dj(43)) {
            this.R = bfrkVar.cj();
            fN(43);
        }
        if (bfrkVar.dj(44)) {
            this.S = bfrkVar.ba();
            fN(44);
        }
        if (bfrkVar.dj(45)) {
            this.T = bfrkVar.bV();
            fN(45);
        }
        if (bfrkVar.dj(46)) {
            this.U = bfrkVar.cd();
            fN(46);
        }
        if (bfrkVar.dj(47)) {
            this.V = bfrkVar.bS();
            fN(47);
        }
        if (bfrkVar.dj(48)) {
            this.W = bfrkVar.bU();
            fN(48);
        }
        if (bfrkVar.dj(49)) {
            this.X = dqru.A(bfrk.dt(bfrkVar.getString(94)), bfrk.ds(bfrkVar.getString(bfrkVar.cO(49, bfrt.a))));
            fN(49);
        }
        if (bfrkVar.dj(50)) {
            this.Y = bfrkVar.bB();
            fN(50);
        }
        if (bfrkVar.dj(51)) {
            this.Z = bfrkVar.f();
            fN(51);
        }
        if (bfrkVar.dj(52)) {
            this.aa = bfrkVar.R();
            fN(52);
        }
        if (bfrkVar.dj(53)) {
            this.ab = bfrkVar.bN();
            fN(53);
        }
        if (bfrkVar.dj(54)) {
            this.ac = bfrkVar.ai();
            fN(54);
        }
        if (bfrkVar.dj(55)) {
            this.ad = bfrkVar.bX();
            fN(55);
        }
        if (bfrkVar.dj(56)) {
            this.ae = bfrkVar.X();
            fN(56);
        }
        if (bfrkVar.dj(57)) {
            this.af = bfrkVar.af();
            fN(57);
        }
        if (bfrkVar.dj(58)) {
            this.ag = bfrkVar.ae();
            fN(58);
        }
        if (bfrkVar.dj(59)) {
            this.ah = bfrkVar.J();
            fN(59);
        }
        if (bfrkVar.dj(60)) {
            this.ai = bfrkVar.q();
            fN(60);
        }
        if (bfrkVar.dj(61)) {
            this.aj = bfrkVar.p();
            fN(61);
        }
        if (bfrkVar.dj(62)) {
            this.ak = bfrkVar.bT();
            fN(62);
        }
        if (bfrkVar.dj(63)) {
            this.al = bfrkVar.aZ();
            fN(63);
        }
        if (bfrkVar.dj(64)) {
            this.am = bfrkVar.bR();
            fN(64);
        }
        if (bfrkVar.dj(65)) {
            this.an = bfrkVar.bD();
            fN(65);
        }
        if (bfrkVar.dj(66)) {
            this.ao = bfrkVar.bx();
            fN(66);
        }
        if (bfrkVar.dj(67)) {
            this.ap = bfrkVar.cb();
            fN(67);
        }
        if (bfrkVar.dj(68)) {
            this.aq = bfrkVar.ca();
            fN(68);
        }
        if (bfrkVar.dj(69)) {
            this.ar = bfrkVar.au();
            fN(69);
        }
        if (bfrkVar.dj(70)) {
            this.as = bfrkVar.bw();
            fN(70);
        }
        if (bfrkVar.dj(71)) {
            this.at = bfrkVar.bv();
            fN(71);
        }
        if (bfrkVar.dj(72)) {
            this.au = bfrkVar.cp();
            fN(72);
        }
        if (bfrkVar.dj(73)) {
            this.av = bfrkVar.bE();
            fN(73);
        }
        if (bfrkVar.dj(74)) {
            this.aw = bfrkVar.ce();
            fN(74);
        }
        if (bfrkVar.dj(75)) {
            this.ax = bfrkVar.cf();
            fN(75);
        }
        if (bfrkVar.dj(76)) {
            this.ay = bfrkVar.bG();
            fN(76);
        }
        if (bfrkVar.dj(77)) {
            this.az = bfrkVar.cc();
            fN(77);
        }
        if (bfrkVar.dj(78)) {
            this.aA = bfrkVar.at();
            fN(78);
        }
        if (bfrkVar.dj(79)) {
            this.aB = bfrkVar.cq();
            fN(79);
        }
        if (bfrkVar.dj(80)) {
            this.aC = bfrkVar.bF();
            fN(80);
        }
        if (bfrkVar.dj(81)) {
            this.aD = bfrkVar.ct();
            fN(81);
        }
        if (bfrkVar.dj(82)) {
            this.aE = bfrkVar.cs();
            fN(82);
        }
        if (bfrkVar.dj(83)) {
            this.aF = bfrkVar.cr();
            fN(83);
        }
        if (bfrkVar.dj(84)) {
            this.aG = bfrkVar.bk();
            fN(84);
        }
        if (bfrkVar.dj(85)) {
            this.aH = bfrkVar.I();
            fN(85);
        }
        if (bfrkVar.dj(86)) {
            this.aI = bfrkVar.aQ();
            fN(86);
        }
        if (bfrkVar.dj(87)) {
            this.aJ = bfrkVar.bY();
            fN(87);
        }
        if (bfrkVar.dj(88)) {
            byte[] blob = bfrkVar.getBlob(bfrkVar.cO(88, bfrt.a));
            if (blob == null) {
                dqbwVar = null;
            } else {
                try {
                    dqbwVar = (dqbw) evsn.parseFrom(dqbw.a, blob, evrr.a());
                } catch (Throwable unused) {
                    dqbwVar = dqbw.a;
                }
            }
            this.aK = dqbwVar;
            fN(88);
        }
        if (bfrkVar.dj(89)) {
            this.aL = bfrkVar.al();
            fN(89);
        }
        if (bfrkVar.dj(90)) {
            this.aM = bfrkVar.V();
            fN(90);
        }
        if (bfrkVar.dj(91)) {
            this.aN = bfrkVar.aj();
            fN(91);
        }
        if (bfrkVar.dj(92)) {
            this.aO = bfrkVar.ah();
            fN(92);
        }
        if (bfrkVar.dj(93)) {
            this.aP = bfrkVar.bs();
            fN(93);
        }
        if (bfrkVar.dj(94)) {
            this.aQ = bfrkVar.bJ();
            fN(94);
        }
        if (bfrkVar.dj(95)) {
            this.aS = bfrkVar.aV();
            fN(95);
        }
        if (bfrkVar.dj(96)) {
            this.aT = bfrkVar.bd();
            fN(96);
        }
        if (bfrkVar.dj(97)) {
            this.aU = bfrkVar.ay();
            fN(97);
        }
        if (bfrkVar.dj(98)) {
            this.aV = bfrkVar.aE();
            fN(98);
        }
        if (bfrkVar.dj(99)) {
            this.aW = bfrkVar.aC();
            fN(99);
        }
        if (bfrkVar.dj(100)) {
            this.aX = bfrkVar.S();
            fN(100);
        }
        if (bfrkVar.dj(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.aY = bfrkVar.D();
            fN(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (bfrkVar.dj(102)) {
            this.aZ = bfrkVar.aR();
            fN(102);
        }
        if (bfrkVar.dj(103)) {
            this.ba = bfrkVar.r();
            fN(103);
        }
        if (bfrkVar.dj(104)) {
            this.bb = bfrkVar.s();
            fN(104);
        }
        if (bfrkVar.dj(105)) {
            this.bc = bfrkVar.u();
            fN(105);
        }
        if (bfrkVar.dj(106)) {
            this.bd = bfrkVar.bl();
            fN(106);
        }
        if (bfrkVar.dj(107)) {
            this.be = bfrkVar.w();
            fN(107);
        }
        if (bfrkVar.dj(108)) {
            this.bf = bfrkVar.bn();
            fN(108);
        }
        if (bfrkVar.dj(109)) {
            this.bg = bfrkVar.ak();
            fN(109);
        }
        if (bfrkVar.dj(110)) {
            this.bh = bfrkVar.E();
            fN(110);
        }
        if (bfrkVar.dj(111)) {
            this.bi = bfrkVar.ao();
            fN(111);
        }
        if (bfrkVar.dj(112)) {
            this.bj = bfrkVar.ap();
            fN(112);
        }
        if (bfrkVar.dj(113)) {
            this.bl = bfrkVar.aG();
            fN(113);
        }
        if (bfrkVar.dj(114)) {
            this.bm = bfrkVar.aa();
            fN(114);
        }
        if (bfrkVar.dj(115)) {
            this.bn = bfrkVar.bH();
            fN(115);
        }
        if (bfrkVar.dj(116)) {
            this.bo = bfrkVar.bM();
            fN(116);
        }
        if (bfrkVar.dj(117)) {
            this.bp = bfrkVar.bL();
            fN(117);
        }
        if (bfrkVar.dj(118)) {
            this.bq = bfrkVar.bZ();
            fN(118);
        }
        if (bfrkVar.dj(119)) {
            this.br = bfrkVar.bK();
            fN(119);
        }
        if (bfrkVar.dj(120)) {
            this.bt = bfrkVar.aI();
            fN(120);
        }
        if (bfrkVar.dj(121)) {
            this.bu = bfrkVar.ab();
            fN(121);
        }
        if (bfrkVar.dj(122)) {
            this.bv = bfrkVar.bI();
            fN(122);
        }
        if (bfrkVar.dj(123)) {
            this.bw = bfrkVar.bO();
            fN(123);
        }
        if (bfrkVar.dj(124)) {
            this.bx = dqru.C(null, bfrk.dt(bfrkVar.getString(bfrkVar.cO(124, bfrt.a))));
            fN(124);
        }
        if (bfrkVar.dj(125)) {
            this.bz = bfrkVar.ch();
            fN(125);
        }
        if (bfrkVar.dj(126)) {
            this.bA = bfrkVar.by();
            fN(126);
        }
        if (bfrkVar.dj(127)) {
            this.bB = bfrkVar.bz();
            fN(127);
        }
        if (bfrkVar.dj(128)) {
            this.bC = bfrkVar.bA();
            fN(128);
        }
        if (bfrkVar.dj(129)) {
            this.bD = bfrkVar.bC();
            fN(129);
        }
        if (bfrkVar.dj(130)) {
            this.bE = bfrkVar.bP();
            fN(130);
        }
        if (bfrkVar.dj(131)) {
            this.bG = bfrkVar.Y();
            fN(131);
        }
        if (bfrkVar.dj(132)) {
            this.bH = bfrkVar.bh();
            fN(132);
        }
        if (bfrkVar.dj(133)) {
            this.bI = bfrkVar.G();
            fN(133);
        }
        if (bfrkVar.dj(134)) {
            this.bJ = bfrkVar.aO();
            fN(134);
        }
        if (bfrkVar.dj(135)) {
            this.bK = bfrkVar.aK();
            fN(135);
        }
        if (bfrkVar.dj(136)) {
            this.bL = bfrkVar.aM();
            fN(136);
        }
        if (bfrkVar.dj(137)) {
            this.bM = bfrkVar.aL();
            fN(137);
        }
        if (bfrkVar.dj(138)) {
            this.bN = bfrkVar.aJ();
            fN(138);
        }
        if (bfrkVar.dj(139)) {
            this.bO = bfrkVar.bq();
            fN(139);
        }
        if (bfrkVar.dj(140)) {
            this.bP = bfrkVar.bo();
            fN(140);
        }
        if (bfrkVar.dj(141)) {
            this.bR = bfrkVar.aU();
            fN(141);
        }
        if (bfrkVar.dj(142)) {
            this.bS = bfrkVar.ax();
            fN(142);
        }
        if (bfrkVar.dj(143)) {
            this.bT = bfrkVar.Q();
            fN(143);
        }
        if (bfrkVar.dj(144)) {
            this.bV = bfrkVar.aX();
            fN(144);
        }
        if (bfrkVar.dj(145)) {
            this.bW = bfrkVar.t();
            fN(145);
        }
        if (bfrkVar.dj(146)) {
            this.bX = bfrkVar.bm();
            fN(146);
        }
        if (bfrkVar.dj(147)) {
            this.bY = bfrkVar.bc();
            fN(147);
        }
        if (bfrkVar.dj(148)) {
            this.bZ = bfrkVar.bb();
            fN(148);
        }
        if (bfrkVar.dj(149)) {
            this.ca = bfrkVar.bt();
            fN(149);
        }
        if (bfrkVar.dj(150)) {
            this.cb = bfrkVar.ar();
            fN(150);
        }
        if (bfrkVar.dj(151)) {
            this.cc = bfrkVar.k();
            fN(151);
        }
        if (bfrkVar.dj(152)) {
            this.cd = bfrkVar.bg();
            fN(152);
        }
        if (bfrkVar.dj(153)) {
            this.ce = bfrkVar.i();
            fN(153);
        }
        if (bfrkVar.dj(154)) {
            this.cf = bfrkVar.an();
            fN(154);
        }
        if (bfrkVar.dj(155)) {
            this.cg = bfrkVar.ci();
            fN(155);
        }
        if (bfrkVar.dj(156)) {
            this.ch = bfrkVar.bW();
            fN(156);
        }
        if (bfrkVar.dj(157)) {
            this.ci = bfrkVar.ck();
            fN(157);
        }
        if (bfrkVar.dj(158)) {
            this.cj = bfrkVar.cg();
            fN(158);
        }
        if (bfrkVar.dj(159)) {
            this.ck = bfrkVar.bQ();
            fN(159);
        }
        if (bfrkVar.dj(160)) {
            this.cm = bfrkVar.h();
            fN(160);
        }
        if (bfrkVar.dj(161)) {
            this.cn = bfrkVar.N();
            fN(161);
        }
        if (bfrkVar.dj(162)) {
            this.cp = bfrkVar.aH();
            fN(162);
        }
        if (bfrkVar.dj(163)) {
            this.cq = bfrkVar.C();
            fN(163);
        }
        if (bfrkVar.dj(164)) {
            this.cr = bfrkVar.aW();
            fN(164);
        }
        if (bfrkVar.dj(165)) {
            this.cs = bfrkVar.az();
            fN(165);
        }
        if (bfrkVar.dj(166)) {
            this.ct = bfrkVar.aF();
            fN(166);
        }
        if (bfrkVar.dj(167)) {
            this.cu = bfrkVar.aD();
            fN(167);
        }
        if (bfrkVar.dj(168)) {
            this.cw = bfrkVar.bf();
            fN(168);
        }
        if (bfrkVar.dj(169)) {
            this.cx = bfrkVar.U();
            fN(169);
        }
        if (bfrkVar.dj(170)) {
            this.cy = bfrkVar.aw();
            fN(170);
        }
        if (bfrkVar.dj(171)) {
            this.cz = bfrkVar.aB();
            fN(171);
        }
        if (bfrkVar.dj(172)) {
            this.cA = bfrkVar.F();
            fN(172);
        }
        if (bfrkVar.dj(173)) {
            this.cC = bfrkVar.bi();
            fN(173);
        }
        if (bfrkVar.dj(174)) {
            this.cD = bfrkVar.H();
            fN(174);
        }
        if (bfrkVar.dj(175)) {
            this.cE = bfrkVar.aP();
            fN(175);
        }
        if (bfrkVar.dj(176)) {
            this.cF = bfrkVar.aN();
            fN(176);
        }
        if (bfrkVar.dj(177)) {
            this.cG = bfrkVar.bp();
            fN(177);
        }
        if (bfrkVar.dj(178)) {
            this.cI = bfrkVar.aA();
            fN(178);
        }
        if (bfrkVar.dj(179)) {
            this.cJ = bfrkVar.as();
            fN(179);
        }
        i();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdxm)) {
            return false;
        }
        bdxm bdxmVar = (bdxm) obj;
        return super.aE(bdxmVar.cN) && Objects.equals(this.a, bdxmVar.a) && Objects.equals(this.b, bdxmVar.b) && Objects.equals(this.c, bdxmVar.c) && this.d == bdxmVar.d && this.e == bdxmVar.e && this.f == bdxmVar.f && this.g == bdxmVar.g && this.h == bdxmVar.h && this.i == bdxmVar.i && this.j == bdxmVar.j && Objects.equals(this.k, bdxmVar.k) && this.l == bdxmVar.l && this.m == bdxmVar.m && Objects.equals(this.n, bdxmVar.n) && this.o == bdxmVar.o && this.p == bdxmVar.p && Objects.equals(this.q, bdxmVar.q) && this.r == bdxmVar.r && Objects.equals(this.s, bdxmVar.s) && Objects.equals(this.t, bdxmVar.t) && this.u == bdxmVar.u && this.v == bdxmVar.v && this.w == bdxmVar.w && this.x == bdxmVar.x && this.y == bdxmVar.y && Objects.equals(this.z, bdxmVar.z) && Objects.equals(this.A, bdxmVar.A) && Objects.equals(this.B, bdxmVar.B) && this.C == bdxmVar.C && Objects.equals(this.D, bdxmVar.D) && this.E == bdxmVar.E && this.F == bdxmVar.F && this.G == bdxmVar.G && this.H == bdxmVar.H && Objects.equals(this.I, bdxmVar.I) && this.J == bdxmVar.J && Arrays.equals(this.K, bdxmVar.K) && Arrays.equals(this.L, bdxmVar.L) && Arrays.equals(this.M, bdxmVar.M) && Arrays.equals(this.N, bdxmVar.N) && Objects.equals(this.O, bdxmVar.O) && Arrays.equals(this.P, bdxmVar.P) && Objects.equals(this.Q, bdxmVar.Q) && Arrays.equals(this.R, bdxmVar.R) && Objects.equals(this.S, bdxmVar.S) && Arrays.equals(this.T, bdxmVar.T) && Arrays.equals(this.U, bdxmVar.U) && Arrays.equals(this.V, bdxmVar.V) && Arrays.equals(this.W, bdxmVar.W) && Arrays.equals(this.X, bdxmVar.X) && Arrays.equals(this.Y, bdxmVar.Y) && this.Z == bdxmVar.Z && Objects.equals(this.aa, bdxmVar.aa) && Arrays.equals(this.ab, bdxmVar.ab) && this.ac == bdxmVar.ac && Arrays.equals(this.ad, bdxmVar.ad) && Objects.equals(this.ae, bdxmVar.ae) && Objects.equals(this.af, bdxmVar.af) && Objects.equals(this.ag, bdxmVar.ag) && this.ah == bdxmVar.ah && this.ai == bdxmVar.ai && this.aj == bdxmVar.aj && Arrays.equals(this.ak, bdxmVar.ak) && Objects.equals(this.al, bdxmVar.al) && Arrays.equals(this.am, bdxmVar.am) && Arrays.equals(this.an, bdxmVar.an) && Arrays.equals(this.ao, bdxmVar.ao) && Arrays.equals(this.ap, bdxmVar.ap) && Arrays.equals(this.aq, bdxmVar.aq) && Objects.equals(this.ar, bdxmVar.ar) && Arrays.equals(this.as, bdxmVar.as) && Arrays.equals(this.at, bdxmVar.at) && Arrays.equals(this.au, bdxmVar.au) && Arrays.equals(this.av, bdxmVar.av) && Arrays.equals(this.aw, bdxmVar.aw) && Arrays.equals(this.ax, bdxmVar.ax) && Arrays.equals(this.ay, bdxmVar.ay) && Arrays.equals(this.az, bdxmVar.az) && Objects.equals(this.aA, bdxmVar.aA) && Arrays.equals(this.aB, bdxmVar.aB) && Arrays.equals(this.aC, bdxmVar.aC) && Arrays.deepEquals(this.aD, bdxmVar.aD) && Arrays.deepEquals(this.aE, bdxmVar.aE) && Arrays.equals(this.aF, bdxmVar.aF) && this.aG == bdxmVar.aG && this.aH == bdxmVar.aH && Objects.equals(this.aI, bdxmVar.aI) && Arrays.equals(this.aJ, bdxmVar.aJ) && Objects.equals(this.aK, bdxmVar.aK) && this.aL == bdxmVar.aL && Objects.equals(this.aM, bdxmVar.aM) && this.aN == bdxmVar.aN && this.aO == bdxmVar.aO && this.aP == bdxmVar.aP && Arrays.equals(this.aQ, bdxmVar.aQ) && Objects.equals(this.aS, bdxmVar.aS) && Objects.equals(this.aT, bdxmVar.aT) && Objects.equals(this.aU, bdxmVar.aU) && Objects.equals(this.aV, bdxmVar.aV) && Objects.equals(this.aW, bdxmVar.aW) && Objects.equals(this.aX, bdxmVar.aX) && this.aY == bdxmVar.aY && Objects.equals(this.aZ, bdxmVar.aZ) && this.ba == bdxmVar.ba && this.bb == bdxmVar.bb && this.bc == bdxmVar.bc && this.bd == bdxmVar.bd && this.be == bdxmVar.be && this.bf == bdxmVar.bf && this.bg == bdxmVar.bg && this.bh == bdxmVar.bh && this.bi == bdxmVar.bi && this.bj == bdxmVar.bj && Objects.equals(this.bl, bdxmVar.bl) && Objects.equals(this.bm, bdxmVar.bm) && Arrays.equals(this.bn, bdxmVar.bn) && Arrays.equals(this.bo, bdxmVar.bo) && Arrays.equals(this.bp, bdxmVar.bp) && Arrays.equals(this.bq, bdxmVar.bq) && Arrays.equals(this.br, bdxmVar.br) && Objects.equals(this.bt, bdxmVar.bt) && Objects.equals(this.bu, bdxmVar.bu) && Arrays.equals(this.bv, bdxmVar.bv) && Arrays.equals(this.bw, bdxmVar.bw) && Arrays.equals(this.bx, bdxmVar.bx) && Arrays.equals(this.bz, bdxmVar.bz) && Arrays.equals(this.bA, bdxmVar.bA) && Arrays.equals(this.bB, bdxmVar.bB) && Arrays.equals(this.bC, bdxmVar.bC) && Arrays.equals(this.bD, bdxmVar.bD) && Arrays.equals(this.bE, bdxmVar.bE) && Objects.equals(this.bG, bdxmVar.bG) && Objects.equals(this.bH, bdxmVar.bH) && this.bI == bdxmVar.bI && Objects.equals(this.bJ, bdxmVar.bJ) && Objects.equals(this.bK, bdxmVar.bK) && Objects.equals(this.bL, bdxmVar.bL) && Objects.equals(this.bM, bdxmVar.bM) && Objects.equals(this.bN, bdxmVar.bN) && this.bO == bdxmVar.bO && this.bP == bdxmVar.bP && Objects.equals(this.bR, bdxmVar.bR) && Objects.equals(this.bS, bdxmVar.bS) && Objects.equals(this.bT, bdxmVar.bT) && Objects.equals(this.bV, bdxmVar.bV) && this.bW == bdxmVar.bW && this.bX == bdxmVar.bX && Objects.equals(this.bY, bdxmVar.bY) && Objects.equals(this.bZ, bdxmVar.bZ) && this.ca == bdxmVar.ca && Objects.equals(this.cb, bdxmVar.cb) && Objects.equals(this.cc, bdxmVar.cc) && Objects.equals(this.cd, bdxmVar.cd) && Objects.equals(this.ce, bdxmVar.ce) && Objects.equals(this.cf, bdxmVar.cf) && Arrays.equals(this.cg, bdxmVar.cg) && Arrays.equals(this.ch, bdxmVar.ch) && Arrays.equals(this.ci, bdxmVar.ci) && Arrays.equals(this.cj, bdxmVar.cj) && Arrays.equals(this.ck, bdxmVar.ck) && Objects.equals(this.cm, bdxmVar.cm) && this.cn == bdxmVar.cn && Objects.equals(this.cp, bdxmVar.cp) && this.cq == bdxmVar.cq && Objects.equals(this.cr, bdxmVar.cr) && Objects.equals(this.cs, bdxmVar.cs) && Objects.equals(this.ct, bdxmVar.ct) && Objects.equals(this.cu, bdxmVar.cu) && Objects.equals(this.cw, bdxmVar.cw) && Objects.equals(this.cx, bdxmVar.cx) && Objects.equals(this.cy, bdxmVar.cy) && Objects.equals(this.cz, bdxmVar.cz) && this.cA == bdxmVar.cA && Objects.equals(this.cC, bdxmVar.cC) && this.cD == bdxmVar.cD && Objects.equals(this.cE, bdxmVar.cE) && Objects.equals(this.cF, bdxmVar.cF) && this.cG == bdxmVar.cG && Objects.equals(this.cI, bdxmVar.cI) && Objects.equals(this.cJ, bdxmVar.cJ);
    }

    public final int f() {
        aA(145, "conv_type");
        return this.bW;
    }

    public final String g() {
        aA(178, "display_name");
        return this.cI;
    }

    public final String h() {
        aA(144, "participant_normalized_destination");
        return this.bV;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        MessageIdType messageIdType = this.a;
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        Long lValueOf = Long.valueOf(this.d);
        Long lValueOf2 = Long.valueOf(this.e);
        Integer numValueOf = Integer.valueOf(this.f);
        Integer numValueOf2 = Integer.valueOf(this.g);
        Integer numValueOf3 = Integer.valueOf(this.h);
        Boolean boolValueOf = Boolean.valueOf(this.i);
        Boolean boolValueOf2 = Boolean.valueOf(this.j);
        Uri uri = this.k;
        Integer numValueOf4 = Integer.valueOf(this.l);
        Long lValueOf3 = Long.valueOf(this.m);
        String str2 = this.n;
        dqqe dqqeVar3 = dqqeVar2;
        Long lValueOf4 = Long.valueOf(this.o);
        Long lValueOf5 = Long.valueOf(this.p);
        String str3 = this.q;
        Integer numValueOf5 = Integer.valueOf(this.r);
        String str4 = this.s;
        basd basdVar = this.t;
        Integer numValueOf6 = Integer.valueOf(this.u);
        bvdz bvdzVar = this.v;
        Integer numValueOf7 = Integer.valueOf(bvdzVar == null ? 0 : bvdzVar.ordinal());
        Boolean boolValueOf3 = Boolean.valueOf(this.w);
        Long lValueOf6 = Long.valueOf(this.x);
        Integer numValueOf8 = Integer.valueOf(this.y);
        String str5 = this.z;
        String str6 = this.A;
        String str7 = this.B;
        Long lValueOf7 = Long.valueOf(this.C);
        basd basdVar2 = this.D;
        Integer numValueOf9 = Integer.valueOf(this.E);
        cpyi cpyiVar = this.F;
        Integer numValueOf10 = Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal());
        cgrd cgrdVar = this.G;
        Integer numValueOf11 = Integer.valueOf(cgrdVar == null ? 0 : cgrdVar.ordinal());
        bvdn bvdnVar = this.H;
        Integer numValueOf12 = Integer.valueOf(bvdnVar == null ? 0 : bvdnVar.ordinal());
        fhaz fhazVar = this.I;
        bvec bvecVar = this.J;
        Integer numValueOf13 = Integer.valueOf(bvecVar == null ? 0 : bvecVar.ordinal());
        Integer numValueOf14 = Integer.valueOf(Arrays.hashCode(this.K));
        Integer numValueOf15 = Integer.valueOf(Arrays.hashCode(this.L));
        Integer numValueOf16 = Integer.valueOf(Arrays.hashCode(this.M));
        Integer numValueOf17 = Integer.valueOf(Arrays.hashCode(this.N));
        String str8 = this.O;
        Integer numValueOf18 = Integer.valueOf(Arrays.hashCode(this.P));
        MessageIdType messageIdType2 = this.Q;
        Integer numValueOf19 = Integer.valueOf(Arrays.hashCode(this.R));
        String str9 = this.S;
        Integer numValueOf20 = Integer.valueOf(Arrays.hashCode(this.T));
        Integer numValueOf21 = Integer.valueOf(Arrays.hashCode(this.U));
        Integer numValueOf22 = Integer.valueOf(Arrays.hashCode(this.V));
        Integer numValueOf23 = Integer.valueOf(Arrays.hashCode(this.W));
        Integer numValueOf24 = Integer.valueOf(Arrays.hashCode(this.X));
        Integer numValueOf25 = Integer.valueOf(Arrays.hashCode(this.Y));
        Long lValueOf8 = Long.valueOf(this.Z);
        Uri uri2 = this.aa;
        Integer numValueOf26 = Integer.valueOf(Arrays.hashCode(this.ab));
        bvdt bvdtVar = this.ac;
        Integer numValueOf27 = Integer.valueOf(bvdtVar == null ? 0 : bvdtVar.ordinal());
        Integer numValueOf28 = Integer.valueOf(Arrays.hashCode(this.ad));
        ConversationIdType conversationIdType2 = this.ae;
        bvdg bvdgVar = this.af;
        bvdg bvdgVar2 = this.ag;
        Long lValueOf9 = Long.valueOf(this.ah);
        Double dValueOf = Double.valueOf(this.ai);
        Double dValueOf2 = Double.valueOf(this.aj);
        Integer numValueOf29 = Integer.valueOf(Arrays.hashCode(this.ak));
        String str10 = this.al;
        Integer numValueOf30 = Integer.valueOf(Arrays.hashCode(this.am));
        Integer numValueOf31 = Integer.valueOf(Arrays.hashCode(this.an));
        Integer numValueOf32 = Integer.valueOf(Arrays.hashCode(this.ao));
        Integer numValueOf33 = Integer.valueOf(Arrays.hashCode(this.ap));
        Integer numValueOf34 = Integer.valueOf(Arrays.hashCode(this.aq));
        String str11 = this.ar;
        Integer numValueOf35 = Integer.valueOf(Arrays.hashCode(this.as));
        Integer numValueOf36 = Integer.valueOf(Arrays.hashCode(this.at));
        Integer numValueOf37 = Integer.valueOf(Arrays.hashCode(this.au));
        Integer numValueOf38 = Integer.valueOf(Arrays.hashCode(this.av));
        Integer numValueOf39 = Integer.valueOf(Arrays.hashCode(this.aw));
        Integer numValueOf40 = Integer.valueOf(Arrays.hashCode(this.ax));
        Integer numValueOf41 = Integer.valueOf(Arrays.hashCode(this.ay));
        Integer numValueOf42 = Integer.valueOf(Arrays.hashCode(this.az));
        String str12 = this.aA;
        Integer numValueOf43 = Integer.valueOf(Arrays.hashCode(this.aB));
        Integer numValueOf44 = Integer.valueOf(Arrays.hashCode(this.aC));
        Integer numValueOf45 = Integer.valueOf(Arrays.hashCode(this.aD));
        Integer numValueOf46 = Integer.valueOf(Arrays.hashCode(this.aE));
        Integer numValueOf47 = Integer.valueOf(Arrays.hashCode(this.aF));
        Boolean boolValueOf4 = Boolean.valueOf(this.aG);
        Long lValueOf10 = Long.valueOf(this.aH);
        String str13 = this.aI;
        Integer numValueOf48 = Integer.valueOf(Arrays.hashCode(this.aJ));
        dqbw dqbwVar = this.aK;
        bvef bvefVar = this.aL;
        Integer numValueOf49 = Integer.valueOf(bvefVar == null ? 0 : bvefVar.ordinal());
        athh athhVar = this.aM;
        bvdy bvdyVar = this.aN;
        Integer numValueOf50 = Integer.valueOf(bvdyVar == null ? 0 : bvdyVar.ordinal());
        bvdq bvdqVar = this.aO;
        Integer numValueOf51 = Integer.valueOf(bvdqVar == null ? 0 : bvdqVar.ordinal());
        Boolean boolValueOf5 = Boolean.valueOf(this.aP);
        Integer numValueOf52 = Integer.valueOf(Arrays.hashCode(this.aQ));
        String str14 = this.aS;
        String str15 = this.aT;
        String str16 = this.aU;
        String str17 = this.aV;
        String str18 = this.aW;
        Uri uri3 = this.aX;
        Long lValueOf11 = Long.valueOf(this.aY);
        String str19 = this.aZ;
        Integer numValueOf53 = Integer.valueOf(this.ba);
        Integer numValueOf54 = Integer.valueOf(this.bb);
        Integer numValueOf55 = Integer.valueOf(this.bc);
        Boolean boolValueOf6 = Boolean.valueOf(this.bd);
        Integer numValueOf56 = Integer.valueOf(this.be);
        Boolean boolValueOf7 = Boolean.valueOf(this.bf);
        bvdz bvdzVar2 = this.bg;
        return Objects.hash(dqqeVar3, messageIdType, conversationIdType, str, lValueOf, lValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf, boolValueOf2, uri, numValueOf4, lValueOf3, str2, lValueOf4, lValueOf5, str3, numValueOf5, str4, basdVar, numValueOf6, numValueOf7, boolValueOf3, lValueOf6, numValueOf8, str5, str6, str7, lValueOf7, basdVar2, numValueOf9, numValueOf10, numValueOf11, numValueOf12, fhazVar, numValueOf13, numValueOf14, numValueOf15, numValueOf16, numValueOf17, str8, numValueOf18, messageIdType2, numValueOf19, str9, numValueOf20, numValueOf21, numValueOf22, numValueOf23, numValueOf24, numValueOf25, lValueOf8, uri2, numValueOf26, numValueOf27, numValueOf28, conversationIdType2, bvdgVar, bvdgVar2, lValueOf9, dValueOf, dValueOf2, numValueOf29, str10, numValueOf30, numValueOf31, numValueOf32, numValueOf33, numValueOf34, str11, numValueOf35, numValueOf36, numValueOf37, numValueOf38, numValueOf39, numValueOf40, numValueOf41, numValueOf42, str12, numValueOf43, numValueOf44, numValueOf45, numValueOf46, numValueOf47, boolValueOf4, lValueOf10, str13, numValueOf48, dqbwVar, numValueOf49, athhVar, numValueOf50, numValueOf51, boolValueOf5, numValueOf52, str14, str15, str16, str17, str18, uri3, lValueOf11, str19, numValueOf53, numValueOf54, numValueOf55, boolValueOf6, numValueOf56, boolValueOf7, Integer.valueOf(bvdzVar2 == null ? 0 : bvdzVar2.ordinal()), Long.valueOf(this.bh), this.bi, this.bj, this.bl, this.bm, Integer.valueOf(Arrays.hashCode(this.bn)), Integer.valueOf(Arrays.hashCode(this.bo)), Integer.valueOf(Arrays.hashCode(this.bp)), Integer.valueOf(Arrays.hashCode(this.bq)), Integer.valueOf(Arrays.hashCode(this.br)), this.bt, this.bu, Integer.valueOf(Arrays.hashCode(this.bv)), Integer.valueOf(Arrays.hashCode(this.bw)), Integer.valueOf(Arrays.hashCode(this.bx)), Integer.valueOf(Arrays.hashCode(this.bz)), Integer.valueOf(Arrays.hashCode(this.bA)), Integer.valueOf(Arrays.hashCode(this.bB)), Integer.valueOf(Arrays.hashCode(this.bC)), Integer.valueOf(Arrays.hashCode(this.bD)), Integer.valueOf(Arrays.hashCode(this.bE)), this.bG, this.bH, Long.valueOf(this.bI), this.bJ, this.bK, this.bL, this.bM, this.bN, Boolean.valueOf(this.bO), Boolean.valueOf(this.bP), this.bR, this.bS, this.bT, this.bV, Integer.valueOf(this.bW), Boolean.valueOf(this.bX), this.bY, this.bZ, Boolean.valueOf(this.ca), this.cb, this.cc, this.cd, this.ce, this.cf, Integer.valueOf(Arrays.hashCode(this.cg)), Integer.valueOf(Arrays.hashCode(this.ch)), Integer.valueOf(Arrays.hashCode(this.ci)), Integer.valueOf(Arrays.hashCode(this.cj)), Integer.valueOf(Arrays.hashCode(this.ck)), this.cm, Long.valueOf(this.cn), this.cp, Integer.valueOf(this.cq), this.cr, this.cs, this.ct, this.cu, this.cw, this.cx, this.cy, this.cz, Long.valueOf(this.cA), this.cC, Long.valueOf(this.cD), this.cE, this.cF, Boolean.valueOf(this.cG), this.cI, this.cJ, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 2969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdxm.i():void");
    }

    public final boolean j() {
        aA(146, "has_ea2p_bot_recipient");
        return this.bX;
    }

    public final boolean k() {
        aA(149, "rcs_session_allows_revocation");
        return this.ca;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationMessagesOptimizedQuery -- REDACTED") : a();
    }
}
