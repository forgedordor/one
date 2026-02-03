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
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bfsb extends dqpd {
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
    public String K;
    public String[] L;
    public MessageIdType M;
    public String[] N;
    public String O;
    public Uri[] P;
    public String[] Q;
    public Uri[] R;
    public Uri[] S;
    public int[] T;
    public int[] U;
    public long V;
    public Uri W;
    public long[] X;
    public bvdt Y;
    public bvdl[] Z;
    public MessageIdType a;
    public byte[][] aA;
    public boolean[] aB;
    public boolean aC;
    public long aD;
    public String aE;
    public bvdr[] aF;
    public dqbw aG;
    public bvef aH;
    public athh aI;
    public bvdy aJ;
    public bvdq aK;
    public boolean aL;
    public long[] aM;
    public PartsTable.BindData[] aN;
    public String aO;
    public String aP;
    public String aQ;
    public String aR;
    public String aS;
    public Uri aT;
    public long aU;
    public String aV;
    public int aW;
    public int aX;
    public int aY;
    public boolean aZ;
    public ConversationIdType aa;
    public bvdg ab;
    public bvdg ac;
    public long ad;
    public double ae;
    public double af;
    public Uri[] ag;
    public String ah;
    public Uri[] ai;
    public int[] aj;
    public int[] ak;
    public String[] al;
    public String[] am;
    public String an;
    public byte[] ao;
    public byte[] ap;
    public boolean[] aq;
    public long[] ar;
    public String[] as;
    public String[] at;
    public long[] au;
    public String[] av;
    public String aw;
    public boolean[] ax;
    public long[] ay;
    public byte[][] az;
    public ConversationIdType b;
    public int[] bA;
    public long[] bB;
    public busr bC;
    public MessageIdType bD;
    public String bE;
    public long bF;
    public String bG;
    public String bH;
    public String bI;
    public String bJ;
    public String bK;
    public boolean bL;
    public boolean bM;
    public bpvd bN;
    public String bO;
    public String bP;
    public Uri bQ;
    public buzr bR;
    public String bS;
    public int bT;
    public boolean bU;
    public String bV;
    public String bW;
    public boolean bX;
    public Optional bY;
    public cklv bZ;
    public int ba;
    public boolean bb;
    public bvdz bc;
    public long bd;
    public chpq be;
    public chpq bf;
    public ParticipantsTable.BindData bg;
    public String bh;
    public MessageIdType bi;
    public long[] bj;
    public long[] bk;
    public long[] bl;
    public Optional[] bm;
    public long[] bn;
    public bkva bo;
    public MessageIdType bp;
    public long[] bq;
    public long[] br;
    public long[] bs;
    public String[] bt;
    public String[] bu;
    public String[] bv;
    public String[] bw;
    public String[] bx;
    public int[] by;
    public int[] bz;
    public String c;
    public long cA;
    public String cB;
    public String cC;
    public boolean cD;
    public bjqs cE;
    public String cF;
    public String cG;
    public MessagesTable.BindData cH;
    public String ca;
    public MessageIdType cb;
    public cgvx cc;
    public String[] cd;
    public aonp[] ce;
    public String[] cf;
    public String[] cg;
    public long[] ch;
    public VmtTable.BindData[] ci;
    public MessageIdType cj;
    public MessageIdType ck;
    public long cl;
    public String cm;
    public int cn;
    public String co;
    public String cp;
    public String cq;
    public String cr;
    public String[] cs;
    public String[] ct;
    public Uri[] cu;
    public String[] cv;
    public String[] cw;
    public long[] cx;
    public long[] cy;
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

    protected bfsb() {
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
        this.M = messageIdType;
        this.Y = bvdt.SUCCEEDED;
        this.aa = conversationIdType;
        this.ab = new bvdg(-1);
        this.ac = new bvdg(-1);
        this.ad = -1L;
        this.ae = 0.0d;
        this.af = 0.0d;
        this.aC = false;
        this.aH = bvef.UNKNOWN;
        this.aI = null;
        this.aJ = bvdy.NONE;
        this.aK = bvdq.DEFAULT_NO_VERDICT;
        this.aL = false;
        this.aU = -1L;
        this.aW = -1;
        this.aX = 0;
        this.aY = 0;
        this.aZ = false;
        this.ba = 0;
        this.bb = false;
        this.bc = bvdzVar;
        this.bd = -1L;
        chpq chpqVar = chpq.PROFILE_CONTACT_SOURCE;
        this.be = chpqVar;
        this.bf = chpqVar;
        this.bi = messageIdType;
        this.bp = messageIdType;
        this.bD = messageIdType;
        this.bF = 0L;
        this.bL = false;
        this.bM = false;
        this.bT = 0;
        this.bU = false;
        this.bX = true;
        this.bY = basb.b(-1L);
        this.cb = messageIdType;
        this.cj = messageIdType;
        this.ck = messageIdType;
    }

    private final String[] m() {
        aA(37, "_id");
        return this.L;
    }

    private final String[] n() {
        aA(153, "part_id");
        return this.cd;
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
        String strAM = aM(this.L);
        String strValueOf37 = String.valueOf(this.M);
        String strAM2 = aM(this.N);
        String strValueOf38 = String.valueOf(this.O);
        String strAL = aL(this.P);
        String strAM3 = aM(this.Q);
        String strAL2 = aL(this.R);
        String strAL3 = aL(this.S);
        String strAJ = aJ(this.T);
        String strAJ2 = aJ(this.U);
        String strValueOf39 = String.valueOf(this.V);
        String strValueOf40 = String.valueOf(this.W);
        String strAK = aK(this.X);
        String strValueOf41 = String.valueOf(this.Y);
        String strAL4 = aL(this.Z);
        String strValueOf42 = String.valueOf(this.aa);
        String strValueOf43 = String.valueOf(this.ab);
        String strValueOf44 = String.valueOf(this.ac);
        String strValueOf45 = String.valueOf(this.ad);
        String strValueOf46 = String.valueOf(this.ae);
        String strValueOf47 = String.valueOf(this.af);
        String strAL5 = aL(this.ag);
        String strValueOf48 = String.valueOf(this.ah);
        String strAL6 = aL(this.ai);
        String strAJ3 = aJ(this.aj);
        String strAJ4 = aJ(this.ak);
        String strAM4 = aM(this.al);
        String strValueOf49 = String.valueOf(this.an);
        byte[] bArr = this.ao;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.ap;
        return String.format(locale, "ConversationMessagesQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_xms_transport: %s,\n  null.parts_count: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_raw_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s,\n  parts.parts_rowid: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_profile_photo_uri: %s,\n  participants.participants_contact_id: %s,\n  participants.participants_lookup_key: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_blocked: %s,\n  participants.participants_participant_type: %s,\n  participants.participants_is_spam: %s,\n  participants.participants_latest_verification_status: %s,\n  participants.participants_directory_id: %s,\n  participants.participants_name_source: %s,\n  participants.participants_photo_source: %s,\n  reports_concat_view.reports_concat_view_read_reports__id: %s,\n  reports_concat_view.reports_concat_view_read_reports_message_id: %s,\n  reports_concat_view.reports_concat_view_read_reports_participant_id: %s,\n  reports_concat_view.reports_concat_view_read_reports_receive_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_read_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_ftd_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_read_reports__ROWID: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_message_id: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_participant_id: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_user_ref_datetime: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_user_references__ROWID: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_display_name: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_profile_photo_uri: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_full_name: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_lookup_key: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_normalized_destination: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_color_palette_index: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_color_type: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_extended_color: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_participants__ROWID: %s,\n  link_preview.link_preview_message_id: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_description: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_domain: %s,\n  link_preview.link_preview_link_canonical_url: %s,\n  link_preview.link_preview_link_preview_prevented: %s,\n  link_preview.link_preview_link_preview_failed: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  message_reactions.message_reactions_reactions_data: %s,\n  file_transfer.file_transfer_transfer_id: %s,\n  message_star.message_star_message_id: %s,\n  message_photos_sharing.message_photos_sharing_sharing_state: %s,\n  vmt.vmt_part_id: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  vmt.vmt_locale: %s,\n  vmt.vmt_rowid: %s,\n  message_replies_view.message_replies_view_message_replies_message_id: %s,\n  message_replies_view.message_replies_view_messages__id: %s,\n  message_replies_view.message_replies_view_messages_received_timestamp: %s,\n  message_replies_view.message_replies_view_participants__id: %s,\n  message_replies_view.message_replies_view_participants_sub_id: %s,\n  message_replies_view.message_replies_view_participants_normalized_destination: %s,\n  message_replies_view.message_replies_view_participants_display_destination: %s,\n  message_replies_view.message_replies_view_participants_full_name: %s,\n  message_replies_view.message_replies_view_participants_first_name: %s,\n  message_replies_view.message_replies_view_parts__id: %s,\n  message_replies_view.message_replies_view_parts_text: %s,\n  message_replies_view.message_replies_view_parts_uri: %s,\n  message_replies_view.message_replies_view_parts_content_type: %s,\n  message_replies_view.message_replies_view_parts_file_name: %s,\n  message_replies_view.message_replies_view_parts_duration: %s,\n  message_replies_view.message_replies_view_parts_parts__ROWID: %s,\n  message_replies_view.message_replies_view_link_preview_trigger_url: %s,\n  message_replies_view.message_replies_view_link_preview_expiration_time_millis: %s,\n  message_replies_view.message_replies_view_link_preview_link_title: %s,\n  message_replies_view.message_replies_view_link_preview_link_image_url: %s,\n  message_replies_view.message_replies_view_link_preview_link_preview_failed: %s,\n  profiles_table.profiles_table_display_name: %s,\n  message_captions.message_captions_caption: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, "REDACTED", strAM, strValueOf37, strAM2, strValueOf38, strAL, strAM3, strAL2, strAL3, strAJ, strAJ2, strValueOf39, strValueOf40, strAK, strValueOf41, strAL4, strValueOf42, strValueOf43, strValueOf44, strValueOf45, strValueOf46, strValueOf47, strAL5, strValueOf48, strAL6, strAJ3, strAJ4, strAM4, "REDACTED", strValueOf49, strConcat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), aN(this.aq), aK(this.ar), aM(this.as), aM(this.at), aK(this.au), aM(this.av), String.valueOf(this.aw), aN(this.ax), aK(this.ay), aL(this.az), aL(this.aA), aN(this.aB), String.valueOf(this.aC), String.valueOf(this.aD), String.valueOf(this.aE), aL(this.aF), String.valueOf(this.aG), String.valueOf(this.aH), String.valueOf(this.aI), String.valueOf(this.aJ), String.valueOf(this.aK), String.valueOf(this.aL), aK(this.aM), String.valueOf(this.aO), String.valueOf(this.aP), String.valueOf(this.aQ), String.valueOf(this.aR), String.valueOf(this.aS), String.valueOf(this.aT), String.valueOf(this.aU), String.valueOf(this.aV), String.valueOf(this.aW), String.valueOf(this.aX), String.valueOf(this.aY), String.valueOf(this.aZ), String.valueOf(this.ba), String.valueOf(this.bb), String.valueOf(this.bc), String.valueOf(this.bd), String.valueOf(this.be), String.valueOf(this.bf), String.valueOf(this.bh), String.valueOf(this.bi), aK(this.bj), aK(this.bk), aK(this.bl), aL(this.bm), aK(this.bn), String.valueOf(this.bp), aK(this.bq), aK(this.br), aK(this.bs), aM(this.bt), aM(this.bu), aM(this.bv), aM(this.bw), aM(this.bx), aJ(this.by), aJ(this.bz), aJ(this.bA), aK(this.bB), String.valueOf(this.bD), String.valueOf(this.bE), String.valueOf(this.bF), String.valueOf(this.bG), String.valueOf(this.bH), String.valueOf(this.bI), String.valueOf(this.bJ), String.valueOf(this.bK), String.valueOf(this.bL), String.valueOf(this.bM), String.valueOf(this.bO), String.valueOf(this.bP), String.valueOf(this.bQ), String.valueOf(this.bS), String.valueOf(this.bT), String.valueOf(this.bU), String.valueOf(this.bV), String.valueOf(this.bW), String.valueOf(this.bX), String.valueOf(this.bY), String.valueOf(this.bZ), String.valueOf(this.ca), String.valueOf(this.cb), String.valueOf(this.cc), aM(this.cd), aL(this.ce), aM(this.cf), aM(this.cg), aK(this.ch), String.valueOf(this.cj), String.valueOf(this.ck), String.valueOf(this.cl), String.valueOf(this.cm), String.valueOf(this.cn), String.valueOf(this.co), String.valueOf(this.cp), String.valueOf(this.cq), String.valueOf(this.cr), aM(this.cs), aM(this.ct), aL(this.cu), aM(this.cv), aM(this.cw), aK(this.cx), aK(this.cy), String.valueOf(this.cz), String.valueOf(this.cA), String.valueOf(this.cB), String.valueOf(this.cC), String.valueOf(this.cD), String.valueOf(this.cF), String.valueOf(this.cG));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bgvl.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        dqbw dqbwVar;
        bgvc bgvcVar = (bgvc) ((bgvb) dqqjVar);
        aC();
        this.cN = bgvcVar.cV();
        if (bgvcVar.dj(0)) {
            this.a = bgvcVar.j();
            fN(0);
        }
        if (bgvcVar.dj(1)) {
            this.b = bgvcVar.i();
            fN(1);
        }
        if (bgvcVar.dj(2)) {
            this.c = bgvcVar.r();
            fN(2);
        }
        if (bgvcVar.dj(3)) {
            this.d = bgvcVar.R();
            fN(3);
        }
        if (bgvcVar.dj(4)) {
            this.e = bgvcVar.f();
            fN(4);
        }
        if (bgvcVar.dj(5)) {
            this.f = bgvcVar.c();
            fN(5);
        }
        if (bgvcVar.dj(6)) {
            this.g = bgvcVar.e();
            fN(6);
        }
        if (bgvcVar.dj(7)) {
            this.h = bgvcVar.A();
            fN(7);
        }
        if (bgvcVar.dj(8)) {
            this.i = bgvcVar.bn();
            fN(8);
        }
        if (bgvcVar.dj(9)) {
            this.j = bgvcVar.bq();
            fN(9);
        }
        if (bgvcVar.dj(10)) {
            this.k = bgvcVar.h();
            fN(10);
        }
        if (bgvcVar.dj(11)) {
            this.l = bgvcVar.F();
            fN(11);
        }
        if (bgvcVar.dj(12)) {
            this.m = bgvcVar.S();
            fN(12);
        }
        if (bgvcVar.dj(13)) {
            this.n = bgvcVar.aR();
            fN(13);
        }
        if (bgvcVar.dj(14)) {
            this.o = bgvcVar.N();
            fN(14);
        }
        if (bgvcVar.dj(15)) {
            this.p = bgvcVar.O();
            fN(15);
        }
        if (bgvcVar.dj(16)) {
            this.q = bgvcVar.o();
            fN(16);
        }
        if (bgvcVar.dj(17)) {
            this.r = bgvcVar.d();
            fN(17);
        }
        if (bgvcVar.dj(18)) {
            this.s = bgvcVar.q();
            fN(18);
        }
        if (bgvcVar.dj(19)) {
            this.t = bgvcVar.af();
            fN(19);
        }
        if (bgvcVar.dj(20)) {
            this.u = bgvcVar.C();
            fN(20);
        }
        if (bgvcVar.dj(21)) {
            this.v = bgvcVar.m();
            fN(21);
        }
        if (bgvcVar.dj(22)) {
            this.w = bgvcVar.bi();
            fN(22);
        }
        if (bgvcVar.dj(23)) {
            this.x = bgvcVar.P();
            fN(23);
        }
        if (bgvcVar.dj(24)) {
            this.y = bgvcVar.E();
            fN(24);
        }
        if (bgvcVar.dj(25)) {
            this.z = bgvcVar.bb();
            fN(25);
        }
        if (bgvcVar.dj(26)) {
            this.A = bgvcVar.ax();
            fN(26);
        }
        if (bgvcVar.dj(27)) {
            this.B = bgvcVar.getString(bgvcVar.cO(27, bgvl.a));
            fN(27);
        }
        if (bgvcVar.dj(28)) {
            this.C = bgvcVar.T();
            fN(28);
        }
        if (bgvcVar.dj(29)) {
            this.D = bgvcVar.ae();
            fN(29);
        }
        if (bgvcVar.dj(30)) {
            this.E = bgvcVar.D();
            fN(30);
        }
        if (bgvcVar.dj(31)) {
            this.F = bgvcVar.as();
            fN(31);
        }
        if (bgvcVar.dj(32)) {
            this.G = bgvcVar.ao();
            fN(32);
        }
        if (bgvcVar.dj(33)) {
            this.H = bgvcVar.ai();
            fN(33);
        }
        if (bgvcVar.dj(34)) {
            this.I = bgvcVar.bf();
            fN(34);
        }
        if (bgvcVar.dj(35)) {
            bvec[] bvecVarArrValues = bvec.values();
            int i = bgvcVar.getInt(bgvcVar.cO(35, bgvl.a));
            if (i >= bvecVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.J = bvecVarArrValues[i];
            fN(35);
        }
        if (bgvcVar.dj(36)) {
            this.K = bgvcVar.aW();
            fN(36);
        }
        if (bgvcVar.dj(37)) {
            this.L = bgvcVar.t();
            fN(37);
        }
        if (bgvcVar.dj(38)) {
            this.M = bgvcVar.ab();
            fN(38);
        }
        if (bgvcVar.dj(39)) {
            this.N = bgvcVar.cl();
            fN(39);
        }
        if (bgvcVar.dj(40)) {
            this.O = bgvcVar.aY();
            fN(40);
        }
        if (bgvcVar.dj(41)) {
            this.P = bgvcVar.bT();
            fN(41);
        }
        if (bgvcVar.dj(42)) {
            this.Q = bgvcVar.cc();
            fN(42);
        }
        if (bgvcVar.dj(43)) {
            this.R = bgvcVar.bQ();
            fN(43);
        }
        if (bgvcVar.dj(44)) {
            this.S = bgvcVar.bS();
            fN(44);
        }
        if (bgvcVar.dj(45)) {
            this.T = dqru.A(bgvc.dt(bgvcVar.getString(90)), bgvc.ds(bgvcVar.getString(bgvcVar.cO(45, bgvl.a))));
            fN(45);
        }
        if (bgvcVar.dj(46)) {
            this.U = bgvcVar.bx();
            fN(46);
        }
        if (bgvcVar.dj(47)) {
            this.V = bgvcVar.g();
            fN(47);
        }
        if (bgvcVar.dj(48)) {
            this.W = bgvcVar.V();
            fN(48);
        }
        if (bgvcVar.dj(49)) {
            this.X = bgvcVar.bL();
            fN(49);
        }
        if (bgvcVar.dj(50)) {
            this.Y = bgvcVar.ak();
            fN(50);
        }
        if (bgvcVar.dj(51)) {
            this.Z = bgvcVar.bW();
            fN(51);
        }
        if (bgvcVar.dj(52)) {
            this.aa = bgvcVar.Y();
            fN(52);
        }
        if (bgvcVar.dj(53)) {
            this.ab = bgvcVar.ah();
            fN(53);
        }
        if (bgvcVar.dj(54)) {
            this.ac = bgvcVar.ag();
            fN(54);
        }
        if (bgvcVar.dj(55)) {
            this.ad = bgvcVar.M();
            fN(55);
        }
        if (bgvcVar.dj(56)) {
            this.ae = bgvcVar.v();
            fN(56);
        }
        if (bgvcVar.dj(57)) {
            this.af = bgvcVar.u();
            fN(57);
        }
        if (bgvcVar.dj(58)) {
            this.ag = bgvcVar.bR();
            fN(58);
        }
        if (bgvcVar.dj(59)) {
            this.ah = bgvcVar.aX();
            fN(59);
        }
        if (bgvcVar.dj(60)) {
            this.ai = bgvcVar.bP();
            fN(60);
        }
        if (bgvcVar.dj(61)) {
            this.aj = bgvcVar.by();
            fN(61);
        }
        if (bgvcVar.dj(62)) {
            this.ak = bgvcVar.bt();
            fN(62);
        }
        if (bgvcVar.dj(63)) {
            this.al = bgvcVar.ca();
            fN(63);
        }
        if (bgvcVar.dj(64)) {
            this.am = bgvcVar.bZ();
            fN(64);
        }
        if (bgvcVar.dj(65)) {
            this.an = bgvcVar.aw();
            fN(65);
        }
        if (bgvcVar.dj(66)) {
            this.ao = bgvcVar.bs();
            fN(66);
        }
        if (bgvcVar.dj(67)) {
            this.ap = bgvcVar.br();
            fN(67);
        }
        if (bgvcVar.dj(68)) {
            this.aq = bgvcVar.cs();
            fN(68);
        }
        if (bgvcVar.dj(69)) {
            this.ar = bgvcVar.bz();
            fN(69);
        }
        if (bgvcVar.dj(70)) {
            this.as = bgvcVar.ce();
            fN(70);
        }
        if (bgvcVar.dj(71)) {
            this.at = bgvcVar.cf();
            fN(71);
        }
        if (bgvcVar.dj(72)) {
            this.au = bgvcVar.bB();
            fN(72);
        }
        if (bgvcVar.dj(73)) {
            this.av = bgvcVar.cb();
            fN(73);
        }
        if (bgvcVar.dj(74)) {
            this.aw = bgvcVar.av();
            fN(74);
        }
        if (bgvcVar.dj(75)) {
            this.ax = bgvcVar.ct();
            fN(75);
        }
        if (bgvcVar.dj(76)) {
            this.ay = bgvcVar.bA();
            fN(76);
        }
        if (bgvcVar.dj(77)) {
            this.az = bgvcVar.cw();
            fN(77);
        }
        if (bgvcVar.dj(78)) {
            this.aA = bgvcVar.cv();
            fN(78);
        }
        if (bgvcVar.dj(79)) {
            this.aB = bgvcVar.cu();
            fN(79);
        }
        if (bgvcVar.dj(80)) {
            this.aC = bgvcVar.bg();
            fN(80);
        }
        if (bgvcVar.dj(81)) {
            this.aD = bgvcVar.L();
            fN(81);
        }
        if (bgvcVar.dj(82)) {
            this.aE = bgvcVar.aP();
            fN(82);
        }
        if (bgvcVar.dj(83)) {
            this.aF = bgvcVar.bX();
            fN(83);
        }
        if (bgvcVar.dj(84)) {
            byte[] blob = bgvcVar.getBlob(bgvcVar.cO(84, bgvl.a));
            if (blob == null) {
                dqbwVar = null;
            } else {
                try {
                    dqbwVar = (dqbw) evsn.parseFrom(dqbw.a, blob, evrr.a());
                } catch (Throwable unused) {
                    dqbwVar = dqbw.a;
                }
            }
            this.aG = dqbwVar;
            fN(84);
        }
        if (bgvcVar.dj(85)) {
            this.aH = bgvcVar.an();
            fN(85);
        }
        if (bgvcVar.dj(86)) {
            this.aI = bgvcVar.X();
            fN(86);
        }
        if (bgvcVar.dj(87)) {
            this.aJ = bgvcVar.al();
            fN(87);
        }
        if (bgvcVar.dj(88)) {
            this.aK = bgvcVar.aj();
            fN(88);
        }
        if (bgvcVar.dj(89)) {
            this.aL = bgvcVar.bo();
            fN(89);
        }
        if (bgvcVar.dj(90)) {
            this.aM = bgvcVar.bG();
            fN(90);
        }
        if (bgvcVar.dj(91)) {
            this.aO = bgvcVar.aT();
            fN(91);
        }
        if (bgvcVar.dj(92)) {
            this.aP = bgvcVar.ba();
            fN(92);
        }
        if (bgvcVar.dj(93)) {
            this.aQ = bgvcVar.az();
            fN(93);
        }
        if (bgvcVar.dj(94)) {
            this.aR = bgvcVar.aE();
            fN(94);
        }
        if (bgvcVar.dj(95)) {
            this.aS = bgvcVar.aC();
            fN(95);
        }
        if (bgvcVar.dj(96)) {
            this.aT = bgvcVar.W();
            fN(96);
        }
        if (bgvcVar.dj(97)) {
            this.aU = bgvcVar.H();
            fN(97);
        }
        if (bgvcVar.dj(98)) {
            this.aV = bgvcVar.aQ();
            fN(98);
        }
        if (bgvcVar.dj(99)) {
            this.aW = bgvcVar.w();
            fN(99);
        }
        if (bgvcVar.dj(100)) {
            this.aX = bgvcVar.x();
            fN(100);
        }
        if (bgvcVar.dj(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.aY = bgvcVar.z();
            fN(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (bgvcVar.dj(102)) {
            this.aZ = bgvcVar.bh();
            fN(102);
        }
        if (bgvcVar.dj(103)) {
            this.ba = bgvcVar.B();
            fN(103);
        }
        if (bgvcVar.dj(104)) {
            this.bb = bgvcVar.bj();
            fN(104);
        }
        if (bgvcVar.dj(105)) {
            this.bc = bgvcVar.am();
            fN(105);
        }
        if (bgvcVar.dj(106)) {
            this.bd = bgvcVar.I();
            fN(106);
        }
        if (bgvcVar.dj(107)) {
            this.be = bgvcVar.aq();
            fN(107);
        }
        if (bgvcVar.dj(108)) {
            this.bf = bgvcVar.ar();
            fN(108);
        }
        if (bgvcVar.dj(109)) {
            this.bh = bgvcVar.aH();
            fN(109);
        }
        if (bgvcVar.dj(110)) {
            this.bi = bgvcVar.ac();
            fN(110);
        }
        if (bgvcVar.dj(111)) {
            this.bj = bgvcVar.bD();
            fN(111);
        }
        if (bgvcVar.dj(112)) {
            this.bk = bgvcVar.bK();
            fN(112);
        }
        if (bgvcVar.dj(113)) {
            this.bl = bgvcVar.bJ();
            fN(113);
        }
        if (bgvcVar.dj(114)) {
            this.bm = bgvcVar.bY();
            fN(114);
        }
        if (bgvcVar.dj(115)) {
            this.bn = bgvcVar.bI();
            fN(115);
        }
        if (bgvcVar.dj(116)) {
            this.bp = bgvcVar.ad();
            fN(116);
        }
        if (bgvcVar.dj(117)) {
            this.bq = bgvcVar.bE();
            fN(117);
        }
        if (bgvcVar.dj(118)) {
            this.br = bgvcVar.bM();
            fN(118);
        }
        if (bgvcVar.dj(119)) {
            this.bs = bgvcVar.bN();
            fN(119);
        }
        if (bgvcVar.dj(120)) {
            this.bt = bgvcVar.co();
            fN(120);
        }
        if (bgvcVar.dj(121)) {
            this.bu = bgvcVar.cr();
            fN(121);
        }
        if (bgvcVar.dj(122)) {
            this.bv = bgvcVar.cp();
            fN(122);
        }
        if (bgvcVar.dj(123)) {
            this.bw = bgvcVar.cq();
            fN(123);
        }
        if (bgvcVar.dj(124)) {
            this.bx = bgvcVar.cj();
            fN(124);
        }
        if (bgvcVar.dj(125)) {
            this.by = bgvcVar.bu();
            fN(125);
        }
        if (bgvcVar.dj(126)) {
            this.bz = bgvcVar.bv();
            fN(126);
        }
        if (bgvcVar.dj(127)) {
            this.bA = bgvcVar.bw();
            fN(127);
        }
        if (bgvcVar.dj(128)) {
            this.bB = bgvcVar.bF();
            fN(128);
        }
        if (bgvcVar.dj(129)) {
            this.bD = bgvcVar.aa();
            fN(129);
        }
        if (bgvcVar.dj(130)) {
            this.bE = bgvcVar.bd();
            fN(130);
        }
        if (bgvcVar.dj(131)) {
            this.bF = bgvcVar.J();
            fN(131);
        }
        if (bgvcVar.dj(132)) {
            this.bG = bgvcVar.aN();
            fN(132);
        }
        if (bgvcVar.dj(133)) {
            this.bH = bgvcVar.aJ();
            fN(133);
        }
        if (bgvcVar.dj(134)) {
            this.bI = bgvcVar.aL();
            fN(134);
        }
        if (bgvcVar.dj(135)) {
            this.bJ = bgvcVar.aK();
            fN(135);
        }
        if (bgvcVar.dj(136)) {
            this.bK = bgvcVar.aI();
            fN(136);
        }
        if (bgvcVar.dj(137)) {
            this.bL = bgvcVar.bm();
            fN(137);
        }
        if (bgvcVar.dj(138)) {
            this.bM = bgvcVar.bk();
            fN(138);
        }
        if (bgvcVar.dj(139)) {
            this.bO = bgvcVar.aS();
            fN(139);
        }
        if (bgvcVar.dj(140)) {
            this.bP = bgvcVar.ay();
            fN(140);
        }
        if (bgvcVar.dj(141)) {
            this.bQ = bgvcVar.U();
            fN(141);
        }
        if (bgvcVar.dj(142)) {
            this.bS = bgvcVar.aV();
            fN(142);
        }
        if (bgvcVar.dj(143)) {
            this.bT = bgvcVar.y();
            fN(143);
        }
        if (bgvcVar.dj(144)) {
            this.bU = bgvcVar.s();
            fN(144);
        }
        if (bgvcVar.dj(145)) {
            this.bV = bgvcVar.p();
            fN(145);
        }
        if (bgvcVar.dj(146)) {
            this.bW = bgvcVar.aZ();
            fN(146);
        }
        if (bgvcVar.dj(147)) {
            this.bX = bgvcVar.bp();
            fN(147);
        }
        if (bgvcVar.dj(148)) {
            this.bY = bgvcVar.at();
            fN(148);
        }
        if (bgvcVar.dj(149)) {
            this.bZ = bgvcVar.n();
            fN(149);
        }
        if (bgvcVar.dj(150)) {
            this.ca = bgvcVar.bc();
            fN(150);
        }
        if (bgvcVar.dj(151)) {
            this.cb = bgvcVar.l();
            fN(151);
        }
        if (bgvcVar.dj(152)) {
            this.cc = bgvcVar.ap();
            fN(152);
        }
        if (bgvcVar.dj(153)) {
            this.cd = bgvcVar.ck();
            fN(153);
        }
        if (bgvcVar.dj(154)) {
            this.ce = bgvcVar.bV();
            fN(154);
        }
        if (bgvcVar.dj(155)) {
            this.cf = bgvcVar.cn();
            fN(155);
        }
        if (bgvcVar.dj(156)) {
            this.cg = bgvcVar.ci();
            fN(156);
        }
        if (bgvcVar.dj(157)) {
            this.ch = bgvcVar.bO();
            fN(157);
        }
        if (bgvcVar.dj(158)) {
            this.cj = bgvcVar.k();
            fN(158);
        }
        if (bgvcVar.dj(159)) {
            this.ck = bgvcVar.Z();
            fN(159);
        }
        if (bgvcVar.dj(160)) {
            this.cl = bgvcVar.Q();
            fN(160);
        }
        if (bgvcVar.dj(161)) {
            this.cm = bgvcVar.aG();
            fN(161);
        }
        if (bgvcVar.dj(162)) {
            this.cn = bgvcVar.G();
            fN(162);
        }
        if (bgvcVar.dj(163)) {
            this.co = bgvcVar.aU();
            fN(163);
        }
        if (bgvcVar.dj(164)) {
            this.cp = bgvcVar.aA();
            fN(164);
        }
        if (bgvcVar.dj(165)) {
            this.cq = bgvcVar.aF();
            fN(165);
        }
        if (bgvcVar.dj(166)) {
            this.cr = bgvcVar.aD();
            fN(166);
        }
        if (bgvcVar.dj(167)) {
            this.cs = bgvcVar.ch();
            fN(167);
        }
        if (bgvcVar.dj(168)) {
            this.ct = bgvcVar.cm();
            fN(168);
        }
        if (bgvcVar.dj(169)) {
            this.cu = bgvcVar.bU();
            fN(169);
        }
        if (bgvcVar.dj(170)) {
            this.cv = bgvcVar.cd();
            fN(170);
        }
        if (bgvcVar.dj(171)) {
            this.cw = bgvcVar.cg();
            fN(171);
        }
        if (bgvcVar.dj(172)) {
            this.cx = bgvcVar.bC();
            fN(172);
        }
        if (bgvcVar.dj(173)) {
            this.cy = bgvcVar.bH();
            fN(173);
        }
        if (bgvcVar.dj(174)) {
            this.cz = bgvcVar.be();
            fN(174);
        }
        if (bgvcVar.dj(175)) {
            this.cA = bgvcVar.K();
            fN(175);
        }
        if (bgvcVar.dj(176)) {
            this.cB = bgvcVar.aO();
            fN(176);
        }
        if (bgvcVar.dj(177)) {
            this.cC = bgvcVar.aM();
            fN(177);
        }
        if (bgvcVar.dj(178)) {
            this.cD = bgvcVar.bl();
            fN(178);
        }
        if (bgvcVar.dj(179)) {
            this.cF = bgvcVar.aB();
            fN(179);
        }
        if (bgvcVar.dj(180)) {
            this.cG = bgvcVar.au();
            fN(180);
        }
        i();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bfsb)) {
            return false;
        }
        bfsb bfsbVar = (bfsb) obj;
        return super.aE(bfsbVar.cN) && Objects.equals(this.a, bfsbVar.a) && Objects.equals(this.b, bfsbVar.b) && Objects.equals(this.c, bfsbVar.c) && this.d == bfsbVar.d && this.e == bfsbVar.e && this.f == bfsbVar.f && this.g == bfsbVar.g && this.h == bfsbVar.h && this.i == bfsbVar.i && this.j == bfsbVar.j && Objects.equals(this.k, bfsbVar.k) && this.l == bfsbVar.l && this.m == bfsbVar.m && Objects.equals(this.n, bfsbVar.n) && this.o == bfsbVar.o && this.p == bfsbVar.p && Objects.equals(this.q, bfsbVar.q) && this.r == bfsbVar.r && Objects.equals(this.s, bfsbVar.s) && Objects.equals(this.t, bfsbVar.t) && this.u == bfsbVar.u && this.v == bfsbVar.v && this.w == bfsbVar.w && this.x == bfsbVar.x && this.y == bfsbVar.y && Objects.equals(this.z, bfsbVar.z) && Objects.equals(this.A, bfsbVar.A) && Objects.equals(this.B, bfsbVar.B) && this.C == bfsbVar.C && Objects.equals(this.D, bfsbVar.D) && this.E == bfsbVar.E && this.F == bfsbVar.F && this.G == bfsbVar.G && this.H == bfsbVar.H && Objects.equals(this.I, bfsbVar.I) && this.J == bfsbVar.J && Objects.equals(this.K, bfsbVar.K) && Arrays.equals(this.L, bfsbVar.L) && Objects.equals(this.M, bfsbVar.M) && Arrays.equals(this.N, bfsbVar.N) && Objects.equals(this.O, bfsbVar.O) && Arrays.equals(this.P, bfsbVar.P) && Arrays.equals(this.Q, bfsbVar.Q) && Arrays.equals(this.R, bfsbVar.R) && Arrays.equals(this.S, bfsbVar.S) && Arrays.equals(this.T, bfsbVar.T) && Arrays.equals(this.U, bfsbVar.U) && this.V == bfsbVar.V && Objects.equals(this.W, bfsbVar.W) && Arrays.equals(this.X, bfsbVar.X) && this.Y == bfsbVar.Y && Arrays.equals(this.Z, bfsbVar.Z) && Objects.equals(this.aa, bfsbVar.aa) && Objects.equals(this.ab, bfsbVar.ab) && Objects.equals(this.ac, bfsbVar.ac) && this.ad == bfsbVar.ad && this.ae == bfsbVar.ae && this.af == bfsbVar.af && Arrays.equals(this.ag, bfsbVar.ag) && Objects.equals(this.ah, bfsbVar.ah) && Arrays.equals(this.ai, bfsbVar.ai) && Arrays.equals(this.aj, bfsbVar.aj) && Arrays.equals(this.ak, bfsbVar.ak) && Arrays.equals(this.al, bfsbVar.al) && Arrays.equals(this.am, bfsbVar.am) && Objects.equals(this.an, bfsbVar.an) && Arrays.equals(this.ao, bfsbVar.ao) && Arrays.equals(this.ap, bfsbVar.ap) && Arrays.equals(this.aq, bfsbVar.aq) && Arrays.equals(this.ar, bfsbVar.ar) && Arrays.equals(this.as, bfsbVar.as) && Arrays.equals(this.at, bfsbVar.at) && Arrays.equals(this.au, bfsbVar.au) && Arrays.equals(this.av, bfsbVar.av) && Objects.equals(this.aw, bfsbVar.aw) && Arrays.equals(this.ax, bfsbVar.ax) && Arrays.equals(this.ay, bfsbVar.ay) && Arrays.deepEquals(this.az, bfsbVar.az) && Arrays.deepEquals(this.aA, bfsbVar.aA) && Arrays.equals(this.aB, bfsbVar.aB) && this.aC == bfsbVar.aC && this.aD == bfsbVar.aD && Objects.equals(this.aE, bfsbVar.aE) && Arrays.equals(this.aF, bfsbVar.aF) && Objects.equals(this.aG, bfsbVar.aG) && this.aH == bfsbVar.aH && Objects.equals(this.aI, bfsbVar.aI) && this.aJ == bfsbVar.aJ && this.aK == bfsbVar.aK && this.aL == bfsbVar.aL && Arrays.equals(this.aM, bfsbVar.aM) && Objects.equals(this.aO, bfsbVar.aO) && Objects.equals(this.aP, bfsbVar.aP) && Objects.equals(this.aQ, bfsbVar.aQ) && Objects.equals(this.aR, bfsbVar.aR) && Objects.equals(this.aS, bfsbVar.aS) && Objects.equals(this.aT, bfsbVar.aT) && this.aU == bfsbVar.aU && Objects.equals(this.aV, bfsbVar.aV) && this.aW == bfsbVar.aW && this.aX == bfsbVar.aX && this.aY == bfsbVar.aY && this.aZ == bfsbVar.aZ && this.ba == bfsbVar.ba && this.bb == bfsbVar.bb && this.bc == bfsbVar.bc && this.bd == bfsbVar.bd && this.be == bfsbVar.be && this.bf == bfsbVar.bf && Objects.equals(this.bh, bfsbVar.bh) && Objects.equals(this.bi, bfsbVar.bi) && Arrays.equals(this.bj, bfsbVar.bj) && Arrays.equals(this.bk, bfsbVar.bk) && Arrays.equals(this.bl, bfsbVar.bl) && Arrays.equals(this.bm, bfsbVar.bm) && Arrays.equals(this.bn, bfsbVar.bn) && Objects.equals(this.bp, bfsbVar.bp) && Arrays.equals(this.bq, bfsbVar.bq) && Arrays.equals(this.br, bfsbVar.br) && Arrays.equals(this.bs, bfsbVar.bs) && Arrays.equals(this.bt, bfsbVar.bt) && Arrays.equals(this.bu, bfsbVar.bu) && Arrays.equals(this.bv, bfsbVar.bv) && Arrays.equals(this.bw, bfsbVar.bw) && Arrays.equals(this.bx, bfsbVar.bx) && Arrays.equals(this.by, bfsbVar.by) && Arrays.equals(this.bz, bfsbVar.bz) && Arrays.equals(this.bA, bfsbVar.bA) && Arrays.equals(this.bB, bfsbVar.bB) && Objects.equals(this.bD, bfsbVar.bD) && Objects.equals(this.bE, bfsbVar.bE) && this.bF == bfsbVar.bF && Objects.equals(this.bG, bfsbVar.bG) && Objects.equals(this.bH, bfsbVar.bH) && Objects.equals(this.bI, bfsbVar.bI) && Objects.equals(this.bJ, bfsbVar.bJ) && Objects.equals(this.bK, bfsbVar.bK) && this.bL == bfsbVar.bL && this.bM == bfsbVar.bM && Objects.equals(this.bO, bfsbVar.bO) && Objects.equals(this.bP, bfsbVar.bP) && Objects.equals(this.bQ, bfsbVar.bQ) && Objects.equals(this.bS, bfsbVar.bS) && this.bT == bfsbVar.bT && this.bU == bfsbVar.bU && Objects.equals(this.bV, bfsbVar.bV) && Objects.equals(this.bW, bfsbVar.bW) && this.bX == bfsbVar.bX && Objects.equals(this.bY, bfsbVar.bY) && Objects.equals(this.bZ, bfsbVar.bZ) && Objects.equals(this.ca, bfsbVar.ca) && Objects.equals(this.cb, bfsbVar.cb) && Objects.equals(this.cc, bfsbVar.cc) && Arrays.equals(this.cd, bfsbVar.cd) && Arrays.equals(this.ce, bfsbVar.ce) && Arrays.equals(this.cf, bfsbVar.cf) && Arrays.equals(this.cg, bfsbVar.cg) && Arrays.equals(this.ch, bfsbVar.ch) && Objects.equals(this.cj, bfsbVar.cj) && Objects.equals(this.ck, bfsbVar.ck) && this.cl == bfsbVar.cl && Objects.equals(this.cm, bfsbVar.cm) && this.cn == bfsbVar.cn && Objects.equals(this.co, bfsbVar.co) && Objects.equals(this.cp, bfsbVar.cp) && Objects.equals(this.cq, bfsbVar.cq) && Objects.equals(this.cr, bfsbVar.cr) && Arrays.equals(this.cs, bfsbVar.cs) && Arrays.equals(this.ct, bfsbVar.ct) && Arrays.equals(this.cu, bfsbVar.cu) && Arrays.equals(this.cv, bfsbVar.cv) && Arrays.equals(this.cw, bfsbVar.cw) && Arrays.equals(this.cx, bfsbVar.cx) && Arrays.equals(this.cy, bfsbVar.cy) && Objects.equals(this.cz, bfsbVar.cz) && this.cA == bfsbVar.cA && Objects.equals(this.cB, bfsbVar.cB) && Objects.equals(this.cC, bfsbVar.cC) && this.cD == bfsbVar.cD && Objects.equals(this.cF, bfsbVar.cF) && Objects.equals(this.cG, bfsbVar.cG);
    }

    public final int f() {
        aA(143, "conv_type");
        return this.bT;
    }

    public final String g() {
        aA(179, "display_name");
        return this.cF;
    }

    public final String h() {
        aA(142, "participant_normalized_destination");
        return this.bS;
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
        String str8 = this.K;
        Integer numValueOf14 = Integer.valueOf(Arrays.hashCode(this.L));
        MessageIdType messageIdType2 = this.M;
        Integer numValueOf15 = Integer.valueOf(Arrays.hashCode(this.N));
        String str9 = this.O;
        Integer numValueOf16 = Integer.valueOf(Arrays.hashCode(this.P));
        Integer numValueOf17 = Integer.valueOf(Arrays.hashCode(this.Q));
        Integer numValueOf18 = Integer.valueOf(Arrays.hashCode(this.R));
        Integer numValueOf19 = Integer.valueOf(Arrays.hashCode(this.S));
        Integer numValueOf20 = Integer.valueOf(Arrays.hashCode(this.T));
        Integer numValueOf21 = Integer.valueOf(Arrays.hashCode(this.U));
        Long lValueOf8 = Long.valueOf(this.V);
        Uri uri2 = this.W;
        Integer numValueOf22 = Integer.valueOf(Arrays.hashCode(this.X));
        bvdt bvdtVar = this.Y;
        Integer numValueOf23 = Integer.valueOf(bvdtVar == null ? 0 : bvdtVar.ordinal());
        Integer numValueOf24 = Integer.valueOf(Arrays.hashCode(this.Z));
        ConversationIdType conversationIdType2 = this.aa;
        bvdg bvdgVar = this.ab;
        bvdg bvdgVar2 = this.ac;
        Long lValueOf9 = Long.valueOf(this.ad);
        Double dValueOf = Double.valueOf(this.ae);
        Double dValueOf2 = Double.valueOf(this.af);
        Integer numValueOf25 = Integer.valueOf(Arrays.hashCode(this.ag));
        String str10 = this.ah;
        Integer numValueOf26 = Integer.valueOf(Arrays.hashCode(this.ai));
        Integer numValueOf27 = Integer.valueOf(Arrays.hashCode(this.aj));
        Integer numValueOf28 = Integer.valueOf(Arrays.hashCode(this.ak));
        Integer numValueOf29 = Integer.valueOf(Arrays.hashCode(this.al));
        Integer numValueOf30 = Integer.valueOf(Arrays.hashCode(this.am));
        String str11 = this.an;
        Integer numValueOf31 = Integer.valueOf(Arrays.hashCode(this.ao));
        Integer numValueOf32 = Integer.valueOf(Arrays.hashCode(this.ap));
        Integer numValueOf33 = Integer.valueOf(Arrays.hashCode(this.aq));
        Integer numValueOf34 = Integer.valueOf(Arrays.hashCode(this.ar));
        Integer numValueOf35 = Integer.valueOf(Arrays.hashCode(this.as));
        Integer numValueOf36 = Integer.valueOf(Arrays.hashCode(this.at));
        Integer numValueOf37 = Integer.valueOf(Arrays.hashCode(this.au));
        Integer numValueOf38 = Integer.valueOf(Arrays.hashCode(this.av));
        String str12 = this.aw;
        Integer numValueOf39 = Integer.valueOf(Arrays.hashCode(this.ax));
        Integer numValueOf40 = Integer.valueOf(Arrays.hashCode(this.ay));
        Integer numValueOf41 = Integer.valueOf(Arrays.hashCode(this.az));
        Integer numValueOf42 = Integer.valueOf(Arrays.hashCode(this.aA));
        Integer numValueOf43 = Integer.valueOf(Arrays.hashCode(this.aB));
        Boolean boolValueOf4 = Boolean.valueOf(this.aC);
        Long lValueOf10 = Long.valueOf(this.aD);
        String str13 = this.aE;
        Integer numValueOf44 = Integer.valueOf(Arrays.hashCode(this.aF));
        dqbw dqbwVar = this.aG;
        bvef bvefVar = this.aH;
        Integer numValueOf45 = Integer.valueOf(bvefVar == null ? 0 : bvefVar.ordinal());
        athh athhVar = this.aI;
        bvdy bvdyVar = this.aJ;
        Integer numValueOf46 = Integer.valueOf(bvdyVar == null ? 0 : bvdyVar.ordinal());
        bvdq bvdqVar = this.aK;
        Integer numValueOf47 = Integer.valueOf(bvdqVar == null ? 0 : bvdqVar.ordinal());
        Boolean boolValueOf5 = Boolean.valueOf(this.aL);
        Integer numValueOf48 = Integer.valueOf(Arrays.hashCode(this.aM));
        String str14 = this.aO;
        String str15 = this.aP;
        String str16 = this.aQ;
        String str17 = this.aR;
        String str18 = this.aS;
        Uri uri3 = this.aT;
        Long lValueOf11 = Long.valueOf(this.aU);
        String str19 = this.aV;
        Integer numValueOf49 = Integer.valueOf(this.aW);
        Integer numValueOf50 = Integer.valueOf(this.aX);
        Integer numValueOf51 = Integer.valueOf(this.aY);
        Boolean boolValueOf6 = Boolean.valueOf(this.aZ);
        Integer numValueOf52 = Integer.valueOf(this.ba);
        Boolean boolValueOf7 = Boolean.valueOf(this.bb);
        bvdz bvdzVar2 = this.bc;
        return Objects.hash(dqqeVar3, messageIdType, conversationIdType, str, lValueOf, lValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf, boolValueOf2, uri, numValueOf4, lValueOf3, str2, lValueOf4, lValueOf5, str3, numValueOf5, str4, basdVar, numValueOf6, numValueOf7, boolValueOf3, lValueOf6, numValueOf8, str5, str6, str7, lValueOf7, basdVar2, numValueOf9, numValueOf10, numValueOf11, numValueOf12, fhazVar, numValueOf13, str8, numValueOf14, messageIdType2, numValueOf15, str9, numValueOf16, numValueOf17, numValueOf18, numValueOf19, numValueOf20, numValueOf21, lValueOf8, uri2, numValueOf22, numValueOf23, numValueOf24, conversationIdType2, bvdgVar, bvdgVar2, lValueOf9, dValueOf, dValueOf2, numValueOf25, str10, numValueOf26, numValueOf27, numValueOf28, numValueOf29, numValueOf30, str11, numValueOf31, numValueOf32, numValueOf33, numValueOf34, numValueOf35, numValueOf36, numValueOf37, numValueOf38, str12, numValueOf39, numValueOf40, numValueOf41, numValueOf42, numValueOf43, boolValueOf4, lValueOf10, str13, numValueOf44, dqbwVar, numValueOf45, athhVar, numValueOf46, numValueOf47, boolValueOf5, numValueOf48, str14, str15, str16, str17, str18, uri3, lValueOf11, str19, numValueOf49, numValueOf50, numValueOf51, boolValueOf6, numValueOf52, boolValueOf7, Integer.valueOf(bvdzVar2 == null ? 0 : bvdzVar2.ordinal()), Long.valueOf(this.bd), this.be, this.bf, this.bh, this.bi, Integer.valueOf(Arrays.hashCode(this.bj)), Integer.valueOf(Arrays.hashCode(this.bk)), Integer.valueOf(Arrays.hashCode(this.bl)), Integer.valueOf(Arrays.hashCode(this.bm)), Integer.valueOf(Arrays.hashCode(this.bn)), this.bp, Integer.valueOf(Arrays.hashCode(this.bq)), Integer.valueOf(Arrays.hashCode(this.br)), Integer.valueOf(Arrays.hashCode(this.bs)), Integer.valueOf(Arrays.hashCode(this.bt)), Integer.valueOf(Arrays.hashCode(this.bu)), Integer.valueOf(Arrays.hashCode(this.bv)), Integer.valueOf(Arrays.hashCode(this.bw)), Integer.valueOf(Arrays.hashCode(this.bx)), Integer.valueOf(Arrays.hashCode(this.by)), Integer.valueOf(Arrays.hashCode(this.bz)), Integer.valueOf(Arrays.hashCode(this.bA)), Integer.valueOf(Arrays.hashCode(this.bB)), this.bD, this.bE, Long.valueOf(this.bF), this.bG, this.bH, this.bI, this.bJ, this.bK, Boolean.valueOf(this.bL), Boolean.valueOf(this.bM), this.bO, this.bP, this.bQ, this.bS, Integer.valueOf(this.bT), Boolean.valueOf(this.bU), this.bV, this.bW, Boolean.valueOf(this.bX), this.bY, this.bZ, this.ca, this.cb, this.cc, Integer.valueOf(Arrays.hashCode(this.cd)), Integer.valueOf(Arrays.hashCode(this.ce)), Integer.valueOf(Arrays.hashCode(this.cf)), Integer.valueOf(Arrays.hashCode(this.cg)), Integer.valueOf(Arrays.hashCode(this.ch)), this.cj, this.ck, Long.valueOf(this.cl), this.cm, Integer.valueOf(this.cn), this.co, this.cp, this.cq, this.cr, Integer.valueOf(Arrays.hashCode(this.cs)), Integer.valueOf(Arrays.hashCode(this.ct)), Integer.valueOf(Arrays.hashCode(this.cu)), Integer.valueOf(Arrays.hashCode(this.cv)), Integer.valueOf(Arrays.hashCode(this.cw)), Integer.valueOf(Arrays.hashCode(this.cx)), Integer.valueOf(Arrays.hashCode(this.cy)), this.cz, Long.valueOf(this.cA), this.cB, this.cC, Boolean.valueOf(this.cD), this.cF, this.cG, null);
    }

    public final void i() {
        int length;
        int length2;
        int iIntValue = bgvl.c().intValue();
        bquu bquuVarC = MessagesTable.c();
        aA(0, "_id");
        bquuVarC.v(this.a);
        aA(1, "conversation_id");
        bquuVarC.m(this.b);
        aA(2, "sender_id");
        bquuVarC.ai(this.c);
        aA(3, "sent_timestamp");
        bquuVarC.ak(this.d);
        aA(4, "received_timestamp");
        bquuVarC.aa(this.e);
        aA(5, "message_protocol");
        bquuVarC.P(this.f);
        aA(6, "message_status");
        bquuVarC.aq(this.g);
        if (iIntValue >= 13020) {
            aA(7, "message_report_status");
            bquuVarC.y(this.h);
        }
        aA(8, "seen");
        bquuVarC.H(this.i);
        aA(9, "read");
        bquuVarC.Z(this.j);
        aA(10, "sms_message_uri");
        bquuVarC.ao(this.k);
        aA(11, "sms_priority");
        bquuVarC.ap(this.l);
        aA(12, "sms_message_size");
        bquuVarC.an(this.m);
        aA(13, "mms_subject");
        bquuVarC.C(this.n);
        aA(14, "mms_expiry");
        bquuVarC.A(this.o);
        if (iIntValue >= 59890) {
            aA(15, "rcs_expiry");
            bquuVarC.U(this.p);
        }
        if (iIntValue >= 9030) {
            aA(16, "mms_retrieve_text");
            bquuVarC.B(this.q);
        }
        aA(17, "raw_status");
        bquuVarC.S(this.r);
        aA(18, "self_id");
        bquuVarC.ag(this.s);
        if (iIntValue >= 41040) {
            aA(19, "rcs_message_id_with_text_type");
            bquuVarC.W(this.t);
        }
        if (iIntValue >= 29060) {
            aA(20, "etouffee_status");
            bquuVarC.T(this.u);
        }
        if (iIntValue >= 29090) {
            aA(21, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            bquuVarC.at(this.v);
        }
        if (iIntValue >= 30010) {
            aA(22, "is_hidden");
            bquuVarC.w(this.w);
        }
        if (iIntValue >= 10004) {
            aA(23, "rcs_file_transfer_session_id");
            bquuVarC.V(this.x);
        }
        if (iIntValue >= 9000) {
            aA(24, "sms_error_code");
            bquuVarC.al(this.y);
        }
        if (iIntValue >= 9000) {
            aA(25, "sms_error_desc_map_name");
            bquuVarC.am(this.z);
        }
        if (iIntValue >= 31010) {
            aA(26, "cms_id");
            bquuVarC.j(this.A);
        }
        if (iIntValue >= 19020) {
            aA(27, "web_id");
            bquuVarC.au(this.B);
        }
        if (iIntValue >= 29100) {
            aA(28, "usage_stats_logging_id");
            bquuVarC.as(this.C);
        }
        if (iIntValue >= 35030) {
            aA(29, "original_rcs_message_id");
            bquuVarC.L(this.D);
        }
        if (iIntValue >= 58040) {
            aA(30, "result_code");
            bquuVarC.ad(this.E);
        }
        if (iIntValue >= 58210) {
            aA(31, "cms_life_cycle");
            bquuVarC.l(this.F);
        }
        if (iIntValue >= 60750) {
            aA(32, "mute_priority");
            bquuVarC.F(this.G);
        }
        if (iIntValue >= 58710) {
            aA(33, "fallback_reason");
            bquuVarC.t(this.H);
        }
        if (iIntValue >= 58680) {
            aA(34, "trace_id");
            bquuVarC.ar(this.I);
        }
        if (iIntValue >= 59310) {
            aA(35, "xms_transport");
            bquuVarC.av(this.J);
        }
        this.cH = bquuVarC.a();
        ArrayList arrayList = new ArrayList();
        long[] jArr = this.aM;
        int length3 = (jArr == null || (length2 = jArr.length) == 0 || (length2 == 1 && jArr[0] == 0)) ? 0 : m().length;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < length3; i++) {
            long j = jArr[i];
            if (j != 0) {
                Long lValueOf = Long.valueOf(j);
                if (!hashSet.contains(lValueOf)) {
                    hashSet.add(lValueOf);
                    bscl bsclVarB = PartsTable.b();
                    bsclVarB.B(m()[i]);
                    aA(38, "message_id");
                    bsclVarB.J(this.M);
                    aA(39, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    bsclVarB.Z(this.N[i]);
                    if (iIntValue >= 60990) {
                        aA(40, "raw_text");
                        bsclVarB.S(this.O);
                    }
                    aA(41, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    bsclVarB.ab(this.P[i]);
                    aA(42, "content_type");
                    bsclVarB.t(this.Q[i]);
                    if (iIntValue >= 10021) {
                        aA(43, "original_uri");
                        bsclVarB.L(this.R[i]);
                    }
                    if (iIntValue >= 29060) {
                        aA(44, "storage_uri");
                        bsclVarB.X(this.S[i]);
                    }
                    aA(45, "width");
                    bsclVarB.ae(this.T[i]);
                    aA(46, "height");
                    bsclVarB.A(this.U[i]);
                    if (iIntValue >= 3010) {
                        aA(47, "timestamp");
                        bsclVarB.aa(this.V);
                    }
                    if (iIntValue >= 4020) {
                        aA(48, "output_uri");
                        bsclVarB.Q(this.W);
                    }
                    if (iIntValue >= 4020) {
                        aA(49, "target_size");
                        bsclVarB.Y(this.X[i]);
                    }
                    if (iIntValue >= 4020) {
                        aA(50, "processing_status");
                        bsclVarB.R(this.Y);
                    }
                    if (iIntValue >= 44010) {
                        aA(51, "cms_attachment_processing_status");
                        bsclVarB.k(this.Z[i]);
                    }
                    aA(52, "conversation_id");
                    bsclVarB.u(this.aa);
                    if (iIntValue >= 5020) {
                        aA(53, "sticker_set_id");
                        bsclVarB.W(this.ab);
                    }
                    if (iIntValue >= 5020) {
                        aA(54, "sticker_id");
                        bsclVarB.V(this.ac);
                    }
                    if (iIntValue >= 7000) {
                        aA(55, "media_modified_timestamp");
                        bsclVarB.H(this.ad);
                    }
                    if (iIntValue >= 10005) {
                        aA(56, "longitude");
                        bsclVarB.F(this.ae);
                    }
                    if (iIntValue >= 10005) {
                        aA(57, "latitude");
                        bsclVarB.D(this.af);
                    }
                    if (iIntValue >= 10017) {
                        aA(58, "preview_content_uri");
                        bsclVarB.O(this.ag[i]);
                    }
                    if (iIntValue >= 10017) {
                        aA(59, "preview_content_type");
                        bsclVarB.N(this.ah);
                    }
                    if (iIntValue >= 13000) {
                        aA(60, "fallback_uri");
                        bsclVarB.x(this.ai[i]);
                    }
                    if (iIntValue >= 14010) {
                        aA(61, "source");
                        bsclVarB.U(this.aj[i]);
                    }
                    if (iIntValue >= 17010) {
                        aA(62, "bundle_index");
                        bsclVarB.j(this.ak[i]);
                    }
                    if (iIntValue >= 17020) {
                        aA(63, "blob_id");
                        bsclVarB.g(this.al[i]);
                    }
                    if (iIntValue >= 59570) {
                        aA(64, "blob_gaia_email");
                        bsclVarB.f(this.am[i]);
                    }
                    if (iIntValue >= 40040) {
                        aA(65, "cms_full_size_blob_id");
                        bsclVarB.n(this.an);
                    }
                    if (iIntValue >= 42010) {
                        aA(66, "cms_media_encryption_key");
                        bsclVarB.o(this.ao);
                    }
                    if (iIntValue >= 42070) {
                        aA(67, "cms_compressed_media_encryption_key");
                        bsclVarB.m(this.ap);
                    }
                    if (iIntValue >= 18000) {
                        aA(68, "blob_upload_permanent_failure");
                        bsclVarB.h(this.aq[i]);
                    }
                    if (iIntValue >= 19030) {
                        aA(69, "blob_upload_timestamp");
                        bsclVarB.i(this.ar[i]);
                    }
                    if (iIntValue >= 22060) {
                        aA(70, "expressive_sticker_name");
                        bsclVarB.w(this.as[i]);
                    }
                    if (iIntValue >= 26000) {
                        aA(71, "file_name");
                        bsclVarB.y(this.at[i]);
                    }
                    if (iIntValue >= 26040) {
                        aA(72, "duration");
                        bsclVarB.v(this.au[i]);
                    }
                    if (iIntValue >= 27000) {
                        aA(73, "compressed_blob_id");
                        bsclVarB.p(this.av[i]);
                    }
                    if (iIntValue >= 40040) {
                        aA(74, "cms_compressed_blob_id");
                        bsclVarB.l(this.aw);
                    }
                    if (iIntValue >= 27000) {
                        aA(75, "compressed_blob_upload_permanent_failure");
                        bsclVarB.q(this.ax[i]);
                    }
                    if (iIntValue >= 27000) {
                        aA(76, "compressed_blob_upload_timestamp");
                        bsclVarB.r(this.ay[i]);
                    }
                    if (iIntValue >= 30040) {
                        aA(77, "media_encryption_key");
                        bsclVarB.G(this.az[i]);
                    }
                    if (iIntValue >= 30040) {
                        aA(78, "compressed_media_encryption_key");
                        bsclVarB.s(this.aA[i]);
                    }
                    if (iIntValue >= 52030) {
                        aA(79, "missing_entry_in_telephony");
                        bsclVarB.K(this.aB[i]);
                    }
                    if (iIntValue >= 53040) {
                        aA(80, "awaiting_reverse_sync");
                        bsclVarB.e(this.aC);
                    }
                    if (iIntValue >= 52050) {
                        aA(81, "file_size_bytes");
                        bsclVarB.z(this.aD);
                    }
                    if (iIntValue >= 52050) {
                        aA(82, "local_cache_path");
                        bsclVarB.E(this.aE);
                    }
                    if (iIntValue >= 58150) {
                        aA(83, "media_send_type");
                        bsclVarB.I(this.aF[i]);
                    }
                    if (iIntValue >= 59470) {
                        aA(84, "voice_metadata");
                        bsclVarB.ad(this.aG);
                    }
                    if (iIntValue >= 58770) {
                        aA(85, "validation_status");
                        bsclVarB.ac(this.aH);
                    }
                    if (iIntValue >= 60080) {
                        aA(86, "processing_id");
                        bsclVarB.P(this.aI);
                    }
                    if (iIntValue >= 60230) {
                        aA(87, "rich_card_media_download_failure_reason");
                        bsclVarB.T(this.aJ);
                    }
                    if (iIntValue >= 60240) {
                        aA(88, "image_display_state");
                        bsclVarB.C(this.aK);
                    }
                    if (iIntValue >= 60680) {
                        aA(89, "preserve_size");
                        bsclVarB.M(this.aL);
                    }
                    arrayList.add(bsclVarB.a());
                }
            }
        }
        this.aN = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[0]);
        brvp brvpVarD = ParticipantsTable.d();
        aA(91, "normalized_destination");
        brvpVarD.I(this.aO);
        aA(92, "send_destination");
        brvpVarD.R(this.aP);
        aA(93, "display_destination");
        brvpVarD.q(this.aQ);
        aA(94, "full_name");
        brvpVarD.u(this.aR);
        aA(95, "first_name");
        brvpVarD.t(this.aS);
        aA(96, "profile_photo_uri");
        brvpVarD.N(this.aT);
        aA(97, "contact_id");
        brvpVarD.l(this.aU);
        aA(98, "lookup_key");
        brvpVarD.D(this.aV);
        aA(99, "color_palette_index");
        brvpVarD.h(this.aW);
        if (iIntValue >= 1000) {
            aA(100, "color_type");
            brvpVarD.i(this.aX);
        }
        if (iIntValue >= 10027) {
            aA(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "extended_color");
            brvpVarD.s(this.aY);
        }
        aA(102, "blocked");
        brvpVarD.e(this.aZ);
        if (iIntValue >= 12001) {
            aA(103, "participant_type");
            brvpVarD.J(this.ba);
        }
        if (iIntValue >= 24060) {
            aA(104, "is_spam");
            brvpVarD.y(this.bb);
        }
        if (iIntValue >= 31030) {
            aA(105, "latest_verification_status");
            brvpVarD.C(this.bc);
        }
        if (iIntValue >= 35010) {
            aA(106, "directory_id");
            brvpVarD.p(this.bd);
        }
        if (iIntValue >= 59550) {
            aA(107, "name_source");
            brvpVarD.G(this.be);
        }
        if (iIntValue >= 59550) {
            aA(108, "photo_source");
            brvpVarD.K(this.bf);
        }
        this.bg = brvpVarD.a();
        String[] strArr = bkvv.a;
        bkvd bkvdVar = new bkvd();
        bkvdVar.aF();
        aA(109, "_id");
        String str = this.bh;
        bkvdVar.aE(0);
        bkvdVar.a = str;
        aA(110, "message_id");
        MessageIdType messageIdType = this.bi;
        bkvdVar.aE(1);
        bkvdVar.b = messageIdType;
        aA(111, "participant_id");
        long[] jArr2 = this.bj;
        bkvdVar.aE(2);
        bkvdVar.c = jArr2;
        aA(112, "receive_time");
        long[] jArr3 = this.bk;
        bkvdVar.aE(3);
        bkvdVar.d = jArr3;
        aA(113, "read_time");
        long[] jArr4 = this.bl;
        bkvdVar.aE(4);
        bkvdVar.e = jArr4;
        aA(114, "ftd_time");
        Optional[] optionalArr = this.bm;
        int i2 = bkvdVar.aB;
        if (i2 < 58880) {
            dqru.x("ftd_time", i2);
        }
        bkvdVar.aE(5);
        bkvdVar.f = optionalArr;
        aA(115, "read_reports__ROWID");
        long[] jArr5 = this.bn;
        if (i2 < 0) {
            dqru.x("read_reports.rowid", i2);
        }
        bkvdVar.aE(6);
        bkvdVar.g = jArr5;
        bkvb bkvbVar = new bkvb();
        bkvbVar.aD(bkvdVar.aB());
        bkvbVar.a = bkvdVar.a;
        bkvbVar.b = bkvdVar.b;
        bkvbVar.c = bkvdVar.c;
        bkvbVar.d = bkvdVar.d;
        bkvbVar.e = bkvdVar.e;
        bkvbVar.f = bkvdVar.f;
        bkvbVar.g = bkvdVar.g;
        bkvbVar.cM = bkvdVar.aC();
        this.bo = bkvbVar;
        String[] strArr2 = buxk.a;
        busu busuVar = new busu();
        busuVar.aF();
        aA(116, "message_id");
        MessageIdType messageIdType2 = this.bp;
        busuVar.aE(0);
        busuVar.a = messageIdType2;
        aA(117, "participant_id");
        long[] jArr6 = this.bq;
        busuVar.aE(1);
        busuVar.b = jArr6;
        aA(118, "user_ref_datetime");
        long[] jArr7 = this.br;
        busuVar.aE(2);
        busuVar.c = jArr7;
        aA(119, "user_references__ROWID");
        long[] jArr8 = this.bs;
        int i3 = busuVar.aB;
        if (i3 < 0) {
            dqru.x("user_references.rowid", i3);
        }
        busuVar.aE(3);
        busuVar.d = jArr8;
        aA(120, "user_ref_display_name");
        String[] strArr3 = this.bt;
        if (i3 < 0) {
            dqru.x("(coalesce(participants.first_name,participants.full_name,participants.display_destination))", i3);
        }
        busuVar.aE(4);
        busuVar.e = strArr3;
        aA(121, "user_ref_profile_photo_uri");
        String[] strArr4 = this.bu;
        if (i3 < 0) {
            dqru.x("(ifnull(participants.profile_photo_uri,\"\"))", i3);
        }
        busuVar.aE(5);
        busuVar.f = strArr4;
        aA(122, "user_ref_full_name");
        String[] strArr5 = this.bv;
        if (i3 < 0) {
            dqru.x("(ifnull(participants.full_name,\"\"))", i3);
        }
        busuVar.aE(6);
        busuVar.g = strArr5;
        aA(123, "user_ref_lookup_key");
        String[] strArr6 = this.bw;
        if (i3 < 0) {
            dqru.x("(ifnull(participants.lookup_key,\"\"))", i3);
        }
        busuVar.aE(7);
        busuVar.h = strArr6;
        aA(124, "normalized_destination");
        String[] strArr7 = this.bx;
        busuVar.aE(8);
        busuVar.i = strArr7;
        aA(125, "color_palette_index");
        int[] iArr = this.by;
        busuVar.aE(9);
        busuVar.j = iArr;
        aA(126, "color_type");
        int[] iArr2 = this.bz;
        if (i3 < 1000) {
            dqru.x("color_type", i3);
        }
        busuVar.aE(10);
        busuVar.k = iArr2;
        aA(127, "extended_color");
        int[] iArr3 = this.bA;
        if (i3 < 10027) {
            dqru.x("extended_color", i3);
        }
        busuVar.aE(11);
        busuVar.l = iArr3;
        aA(128, "participants__ROWID");
        long[] jArr9 = this.bB;
        if (i3 < 0) {
            dqru.x("participants.rowid", i3);
        }
        busuVar.aE(12);
        busuVar.m = jArr9;
        buss bussVar = new buss();
        bussVar.aD(busuVar.aB());
        bussVar.a = busuVar.a;
        bussVar.b = busuVar.b;
        bussVar.c = busuVar.c;
        bussVar.d = busuVar.d;
        bussVar.e = busuVar.e;
        bussVar.f = busuVar.f;
        bussVar.g = busuVar.g;
        bussVar.h = busuVar.h;
        bussVar.i = busuVar.i;
        bussVar.j = busuVar.j;
        bussVar.k = busuVar.k;
        bussVar.l = busuVar.l;
        bussVar.m = busuVar.m;
        bussVar.cM = busuVar.aC();
        this.bC = bussVar;
        bpvh bpvhVarA = bpxj.a();
        aA(129, "message_id");
        bpvhVarA.n(this.bD);
        aA(130, "trigger_url");
        bpvhVarA.o(this.bE);
        aA(131, "expiration_time_millis");
        bpvhVarA.f(this.bF);
        aA(132, "link_title");
        bpvhVarA.m(this.bG);
        aA(133, "link_description");
        bpvhVarA.h(this.bH);
        aA(134, "link_image_url");
        bpvhVarA.j(this.bI);
        aA(135, "link_domain");
        bpvhVarA.i(this.bJ);
        aA(136, "link_canonical_url");
        bpvhVarA.g(this.bK);
        if (iIntValue >= 21010) {
            aA(137, "link_preview_prevented");
            bpvhVarA.l(this.bL);
        }
        if (iIntValue >= 22020) {
            aA(138, "link_preview_failed");
            bpvhVarA.k(this.bM);
        }
        this.bN = bpvhVarA.a();
        bvbu.a().a();
        buzt buztVarA = bvaz.a();
        aA(139, "name");
        buztVarA.g(this.bO);
        aA(140, "description");
        buztVarA.c(this.bP);
        aA(141, "logo_uri");
        buztVarA.e(this.bQ);
        this.bR = buztVarA.a();
        ArrayList arrayList2 = new ArrayList();
        long[] jArr10 = this.ch;
        int length4 = (jArr10 == null || (length = jArr10.length) == 0 || (length == 1 && jArr10[0] == 0)) ? 0 : n().length;
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < length4; i4++) {
            long j2 = jArr10[i4];
            if (j2 != 0) {
                Long lValueOf2 = Long.valueOf(j2);
                if (!hashSet2.contains(lValueOf2)) {
                    hashSet2.add(lValueOf2);
                    bvcb bvcbVarB = VmtTable.b();
                    bvcbVarB.c(n()[i4]);
                    aA(154, "vmt_status");
                    bvcbVarB.e(this.ce[i4]);
                    aA(155, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    bvcbVarB.d(this.cf[i4]);
                    aA(156, "locale");
                    bvcbVarB.b(this.cg[i4]);
                    arrayList2.add(bvcbVarB.a());
                }
            }
        }
        this.ci = (VmtTable.BindData[]) arrayList2.toArray(new VmtTable.BindData[0]);
        String[] strArr8 = bkgf.a;
        bjqv bjqvVar = new bjqv();
        bjqvVar.aF();
        aA(158, "message_id");
        MessageIdType messageIdType3 = this.cj;
        bjqvVar.aE(0);
        bjqvVar.a = messageIdType3;
        aA(159, "_id");
        MessageIdType messageIdType4 = this.ck;
        bjqvVar.aE(1);
        bjqvVar.b = messageIdType4;
        aA(160, "received_timestamp");
        long j3 = this.cl;
        bjqvVar.aE(2);
        bjqvVar.c = j3;
        aA(161, "_id");
        String str2 = this.cm;
        bjqvVar.aE(3);
        bjqvVar.d = str2;
        aA(162, "sub_id");
        int i5 = this.cn;
        bjqvVar.aE(4);
        bjqvVar.e = i5;
        aA(163, "normalized_destination");
        String strA = this.co;
        bjqvVar.aE(5);
        if (!bjqvVar.aC) {
            strA = cssb.a(strA);
        }
        bjqvVar.f = strA;
        aA(164, "display_destination");
        bjqvVar.b(this.cp);
        aA(165, "full_name");
        String strA2 = this.cq;
        bjqvVar.aE(7);
        if (!bjqvVar.aC) {
            strA2 = cssq.a(strA2);
        }
        bjqvVar.h = strA2;
        aA(166, "first_name");
        String strA3 = this.cr;
        bjqvVar.aE(8);
        if (!bjqvVar.aC) {
            strA3 = cssq.a(strA3);
        }
        bjqvVar.i = strA3;
        aA(167, "_id");
        String[] strArr9 = this.cs;
        bjqvVar.aE(9);
        bjqvVar.j = strArr9;
        aA(168, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        String[] strArr10 = this.ct;
        bjqvVar.aE(10);
        bjqvVar.k = strArr10;
        aA(169, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        Uri[] uriArr = this.cu;
        bjqvVar.aE(11);
        bjqvVar.l = uriArr;
        aA(170, "content_type");
        String[] strArr11 = this.cv;
        bjqvVar.aE(12);
        bjqvVar.m = strArr11;
        aA(171, "file_name");
        String[] strArr12 = this.cw;
        int i6 = bjqvVar.aB;
        if (i6 < 26000) {
            dqru.x("file_name", i6);
        }
        bjqvVar.aE(13);
        bjqvVar.n = strArr12;
        aA(172, "duration");
        bjqvVar.c(this.cx);
        aA(173, "parts__ROWID");
        long[] jArr11 = this.cy;
        if (i6 < 0) {
            dqru.x("parts.rowid", i6);
        }
        bjqvVar.aE(15);
        bjqvVar.p = jArr11;
        aA(174, "trigger_url");
        String str3 = this.cz;
        bjqvVar.aE(16);
        bjqvVar.q = str3;
        aA(175, "expiration_time_millis");
        long j4 = this.cA;
        bjqvVar.aE(17);
        bjqvVar.r = j4;
        aA(176, "link_title");
        String strA4 = this.cB;
        bjqvVar.aE(18);
        if (!bjqvVar.aC) {
            strA4 = cssq.a(strA4);
        }
        bjqvVar.s = strA4;
        aA(177, "link_image_url");
        String str4 = this.cC;
        bjqvVar.aE(19);
        bjqvVar.t = str4;
        aA(178, "link_preview_failed");
        boolean z = this.cD;
        if (i6 < 22020) {
            dqru.x("link_preview_failed", i6);
        }
        bjqvVar.aE(20);
        bjqvVar.u = z;
        this.cE = bjqvVar.a();
    }

    public final boolean j() {
        aA(144, "has_ea2p_bot_recipient");
        return this.bU;
    }

    public final boolean k() {
        aA(147, "rcs_session_allows_revocation");
        return this.bX;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationMessagesQuery -- REDACTED") : a();
    }
}
