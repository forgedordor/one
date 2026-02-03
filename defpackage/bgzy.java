package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bgzy extends dqpd {
    public long A;
    public String B;
    public String C;
    public long D;
    public String E;
    public boolean F;
    public long G;
    public byte[] H;
    public byte[] I;
    public long J;
    public bvdy K;
    public boolean L;
    private MessageIdType M;
    private ConversationIdType N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private long S;
    private Instant T;
    private long U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    public String a;
    private String aA;
    private long aB;
    private long aC;
    private basd aD;
    private cjnm aE;
    private String aF;
    private byte[] aG;
    private long aH;
    private eyga aI;
    private String aJ;
    private String aK;
    private MessageIdType aL;
    private MessageIdType aM;
    private boolean aN;
    private Uri aO;
    private Optional aP;
    private int aQ;
    private cpyi aR;
    private cgrd aS;
    private bvdn aT;
    private int aU;
    private boolean aV;
    private fhaz aW;
    private bvdx aX;
    private bvdx aY;
    private bvec aZ;
    private Uri aa;
    private int ab;
    private long ac;
    private String ad;
    private String ae;
    private String af;
    private long ag;
    private long ah;
    private String ai;
    private int aj;
    private String ak;
    private axcm al;
    private long am;
    private String an;
    private basd ao;
    private int ap;
    private bvdz aq;
    private int ar;
    private boolean as;
    private String at;
    private long au;
    private int av;
    private String aw;
    private String ax;
    private String ay;
    private long az;
    public MessageIdType b;
    private int ba;
    private baro bb;
    private cbqz bc;
    private Optional bd;
    private Uri be;
    private bvdl bf;
    private int bg;
    private String bh;
    private byte[] bi;
    private byte[] bj;
    private String bk;
    private boolean bl;
    private boolean bm;
    private String bn;
    private bvdr bo;
    private dqbw bp;
    private bvef bq;
    private athh br;
    private bvdq bs;
    public String c;
    public String d;
    public Uri e;
    public String f;
    public Uri g;
    public int h;
    public int i;
    public long j;
    public Uri k;
    public long l;
    public bvdt m;
    public ConversationIdType n;
    public bvdg o;
    public bvdg p;
    public long q;
    public double r;
    public double s;
    public Uri t;
    public String u;
    public Uri v;
    public int w;
    public String x;
    public String y;
    public boolean z;

    protected bgzy() {
        MessageIdType messageIdType = bary.a;
        this.M = messageIdType;
        ConversationIdType conversationIdType = barn.a;
        this.N = conversationIdType;
        this.S = 0L;
        this.T = bart.b(0L);
        this.U = 0L;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.ab = 0;
        this.ac = 0L;
        this.ag = 0L;
        this.ah = 0L;
        this.aj = 0;
        this.al = null;
        this.am = 0L;
        basd basdVar = basd.a;
        this.ao = basdVar;
        this.ap = 0;
        this.aq = bvdz.VERIFICATION_NA;
        this.ar = 0;
        this.as = false;
        this.au = -1L;
        this.av = -1;
        this.aA = "";
        this.aB = 0L;
        this.aC = 1L;
        this.aD = basdVar;
        this.aH = 0L;
        this.aL = messageIdType;
        this.aM = messageIdType;
        this.aN = false;
        this.aP = basg.a;
        this.aQ = -2;
        this.aR = cpyi.UNKNOWN;
        this.aS = cgrd.c;
        this.aT = bvdn.UNKNOWN;
        this.aU = 0;
        this.aV = false;
        bvdx bvdxVar = bvdx.UNKNOWN;
        this.aX = bvdxVar;
        this.aY = bvdxVar;
        this.aZ = bvec.UNKNOWN;
        this.ba = -1;
        this.bb = baro.a;
        this.bc = new cbqz(0L);
        this.bd = basc.a();
        this.b = messageIdType;
        this.h = -1;
        this.i = -1;
        this.l = 0L;
        this.m = bvdt.SUCCEEDED;
        this.bf = bvdl.NOT_FROM_CMS;
        this.n = conversationIdType;
        this.o = new bvdg(-1);
        this.p = new bvdg(-1);
        this.q = -1L;
        this.r = 0.0d;
        this.s = 0.0d;
        this.w = 13;
        this.bg = 0;
        this.z = false;
        this.A = 0L;
        this.F = false;
        this.G = 0L;
        this.bm = false;
        this.bo = bvdr.STANDARD;
        this.bq = bvef.UNKNOWN;
        this.br = null;
        this.K = bvdy.NONE;
        this.bs = bvdq.DEFAULT_NO_VERDICT;
        this.L = false;
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.M);
        String strValueOf2 = String.valueOf(this.N);
        String strValueOf3 = String.valueOf(this.O);
        String strValueOf4 = String.valueOf(this.P);
        String strValueOf5 = String.valueOf(this.Q);
        String strValueOf6 = String.valueOf(this.R);
        String strValueOf7 = String.valueOf(this.S);
        String strValueOf8 = String.valueOf(this.T);
        String strValueOf9 = String.valueOf(this.U);
        String strValueOf10 = String.valueOf(this.V);
        String strValueOf11 = String.valueOf(this.W);
        String strValueOf12 = String.valueOf(this.X);
        String strValueOf13 = String.valueOf(this.Y);
        String strValueOf14 = String.valueOf(this.Z);
        String strValueOf15 = String.valueOf(this.aa);
        String strValueOf16 = String.valueOf(this.ab);
        String strValueOf17 = String.valueOf(this.ac);
        String strValueOf18 = String.valueOf(this.ad);
        String strValueOf19 = String.valueOf(this.ae);
        String strValueOf20 = String.valueOf(this.af);
        String strValueOf21 = String.valueOf(this.ag);
        String strValueOf22 = String.valueOf(this.ah);
        String strValueOf23 = String.valueOf(this.ai);
        String strValueOf24 = String.valueOf(this.aj);
        String strValueOf25 = String.valueOf(this.ak);
        String strValueOf26 = String.valueOf(this.al);
        String strValueOf27 = String.valueOf(this.am);
        String strValueOf28 = String.valueOf(this.an);
        String strValueOf29 = String.valueOf(this.ao);
        String strValueOf30 = String.valueOf(this.ap);
        String strValueOf31 = String.valueOf(this.aq);
        String strValueOf32 = String.valueOf(this.ar);
        String strValueOf33 = String.valueOf(this.as);
        String strValueOf34 = String.valueOf(this.at);
        String strValueOf35 = String.valueOf(this.au);
        String strValueOf36 = String.valueOf(this.av);
        String strValueOf37 = String.valueOf(this.aw);
        String strValueOf38 = String.valueOf(this.ax);
        String strValueOf39 = String.valueOf(this.ay);
        String strValueOf40 = String.valueOf(this.az);
        String strValueOf41 = String.valueOf(this.aA);
        String strValueOf42 = String.valueOf(this.aB);
        String strValueOf43 = String.valueOf(this.aC);
        String strValueOf44 = String.valueOf(this.aD);
        String strValueOf45 = String.valueOf(this.aE);
        String strValueOf46 = String.valueOf(this.aF);
        byte[] bArr = this.aG;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        String strValueOf47 = String.valueOf(this.aH);
        String strValueOf48 = String.valueOf(this.aI);
        String strValueOf49 = String.valueOf(this.aJ);
        String strValueOf50 = String.valueOf(this.aK);
        String strValueOf51 = String.valueOf(this.aL);
        String strValueOf52 = String.valueOf(this.aM);
        String strValueOf53 = String.valueOf(this.aN);
        String strValueOf54 = String.valueOf(this.aO);
        String strValueOf55 = String.valueOf(this.aP);
        String strValueOf56 = String.valueOf(this.aQ);
        String strValueOf57 = String.valueOf(this.aR);
        String strValueOf58 = String.valueOf(this.aS);
        String strValueOf59 = String.valueOf(this.aT);
        String strValueOf60 = String.valueOf(this.aU);
        String strValueOf61 = String.valueOf(this.aV);
        String strValueOf62 = String.valueOf(this.aW);
        String strValueOf63 = String.valueOf(this.aX);
        String strValueOf64 = String.valueOf(this.aY);
        String strValueOf65 = String.valueOf(this.aZ);
        String strValueOf66 = String.valueOf(this.ba);
        String strValueOf67 = String.valueOf(this.bb);
        String strValueOf68 = String.valueOf(this.bc);
        String strValueOf69 = String.valueOf(this.bd);
        String strValueOf70 = String.valueOf(this.a);
        String strValueOf71 = String.valueOf(this.b);
        String strValueOf72 = String.valueOf(this.c);
        String strValueOf73 = String.valueOf(this.d);
        String strValueOf74 = String.valueOf(this.e);
        String strValueOf75 = String.valueOf(this.f);
        String strValueOf76 = String.valueOf(this.g);
        String strValueOf77 = String.valueOf(this.be);
        String strValueOf78 = String.valueOf(this.h);
        String strValueOf79 = String.valueOf(this.i);
        String strValueOf80 = String.valueOf(this.j);
        String strValueOf81 = String.valueOf(this.k);
        String strValueOf82 = String.valueOf(this.l);
        String strValueOf83 = String.valueOf(this.m);
        String strValueOf84 = String.valueOf(this.bf);
        String strValueOf85 = String.valueOf(this.n);
        String strValueOf86 = String.valueOf(this.o);
        String strValueOf87 = String.valueOf(this.p);
        String strValueOf88 = String.valueOf(this.q);
        String strValueOf89 = String.valueOf(this.r);
        String strValueOf90 = String.valueOf(this.s);
        String strValueOf91 = String.valueOf(this.t);
        String strValueOf92 = String.valueOf(this.u);
        String strValueOf93 = String.valueOf(this.v);
        String strValueOf94 = String.valueOf(this.w);
        String strValueOf95 = String.valueOf(this.bg);
        String strValueOf96 = String.valueOf(this.x);
        String strValueOf97 = String.valueOf(this.bh);
        byte[] bArr2 = this.bi;
        String strConcat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        byte[] bArr3 = this.bj;
        String strConcat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
        String strValueOf98 = String.valueOf(this.z);
        String strValueOf99 = String.valueOf(this.A);
        String strValueOf100 = String.valueOf(this.B);
        String strValueOf101 = String.valueOf(this.C);
        String strValueOf102 = String.valueOf(this.D);
        String strValueOf103 = String.valueOf(this.E);
        String strValueOf104 = String.valueOf(this.bk);
        String strValueOf105 = String.valueOf(this.F);
        String strValueOf106 = String.valueOf(this.G);
        byte[] bArr4 = this.H;
        String strConcat4 = "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL"));
        byte[] bArr5 = this.I;
        return String.format(locale, "DraftsView [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_raw_rcs_message_to_send: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_parent_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_raw_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, strValueOf37, strValueOf38, strValueOf39, strValueOf40, strValueOf41, strValueOf42, strValueOf43, strValueOf44, strValueOf45, strValueOf46, strConcat, strValueOf47, strValueOf48, strValueOf49, strValueOf50, strValueOf51, strValueOf52, strValueOf53, strValueOf54, strValueOf55, strValueOf56, strValueOf57, strValueOf58, strValueOf59, strValueOf60, strValueOf61, strValueOf62, strValueOf63, strValueOf64, strValueOf65, strValueOf66, strValueOf67, strValueOf68, strValueOf69, strValueOf70, strValueOf71, strValueOf72, strValueOf73, strValueOf74, strValueOf75, strValueOf76, strValueOf77, strValueOf78, strValueOf79, strValueOf80, strValueOf81, strValueOf82, strValueOf83, strValueOf84, strValueOf85, strValueOf86, strValueOf87, strValueOf88, strValueOf89, strValueOf90, strValueOf91, strValueOf92, strValueOf93, strValueOf94, strValueOf95, strValueOf96, "REDACTED", strValueOf97, strConcat2, strConcat3, strValueOf98, strValueOf99, strValueOf100, strValueOf101, strValueOf102, strValueOf103, strValueOf104, strValueOf105, strValueOf106, strConcat4, "BLOB".concat(String.valueOf(bArr5 != null ? String.valueOf(bArr5.length) : "NULL")), String.valueOf(this.bl), String.valueOf(this.bm), String.valueOf(this.J), String.valueOf(this.bn), String.valueOf(this.bo), String.valueOf(this.bp), String.valueOf(this.bq), String.valueOf(this.br), String.valueOf(this.K), String.valueOf(this.bs), String.valueOf(this.L));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bhka.c().intValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgzy)) {
            return false;
        }
        bgzy bgzyVar = (bgzy) obj;
        return super.aE(bgzyVar.cN) && Objects.equals(this.M, bgzyVar.M) && Objects.equals(this.N, bgzyVar.N) && Objects.equals(this.O, bgzyVar.O) && Objects.equals(this.P, bgzyVar.P) && Objects.equals(this.Q, bgzyVar.Q) && Objects.equals(this.R, bgzyVar.R) && this.S == bgzyVar.S && Objects.equals(this.T, bgzyVar.T) && this.U == bgzyVar.U && this.V == bgzyVar.V && this.W == bgzyVar.W && this.X == bgzyVar.X && this.Y == bgzyVar.Y && this.Z == bgzyVar.Z && Objects.equals(this.aa, bgzyVar.aa) && this.ab == bgzyVar.ab && this.ac == bgzyVar.ac && Objects.equals(this.ad, bgzyVar.ad) && Objects.equals(this.ae, bgzyVar.ae) && Objects.equals(this.af, bgzyVar.af) && this.ag == bgzyVar.ag && this.ah == bgzyVar.ah && Objects.equals(this.ai, bgzyVar.ai) && this.aj == bgzyVar.aj && Objects.equals(this.ak, bgzyVar.ak) && Objects.equals(this.al, bgzyVar.al) && this.am == bgzyVar.am && Objects.equals(this.an, bgzyVar.an) && Objects.equals(this.ao, bgzyVar.ao) && this.ap == bgzyVar.ap && this.aq == bgzyVar.aq && this.ar == bgzyVar.ar && this.as == bgzyVar.as && Objects.equals(this.at, bgzyVar.at) && this.au == bgzyVar.au && this.av == bgzyVar.av && Objects.equals(this.aw, bgzyVar.aw) && Objects.equals(this.ax, bgzyVar.ax) && Objects.equals(this.ay, bgzyVar.ay) && this.az == bgzyVar.az && Objects.equals(this.aA, bgzyVar.aA) && this.aB == bgzyVar.aB && this.aC == bgzyVar.aC && Objects.equals(this.aD, bgzyVar.aD) && Objects.equals(this.aE, bgzyVar.aE) && Objects.equals(this.aF, bgzyVar.aF) && Arrays.equals(this.aG, bgzyVar.aG) && this.aH == bgzyVar.aH && Objects.equals(this.aI, bgzyVar.aI) && Objects.equals(this.aJ, bgzyVar.aJ) && Objects.equals(this.aK, bgzyVar.aK) && Objects.equals(this.aL, bgzyVar.aL) && Objects.equals(this.aM, bgzyVar.aM) && this.aN == bgzyVar.aN && Objects.equals(this.aO, bgzyVar.aO) && Objects.equals(this.aP, bgzyVar.aP) && this.aQ == bgzyVar.aQ && this.aR == bgzyVar.aR && this.aS == bgzyVar.aS && this.aT == bgzyVar.aT && this.aU == bgzyVar.aU && this.aV == bgzyVar.aV && Objects.equals(this.aW, bgzyVar.aW) && this.aX == bgzyVar.aX && this.aY == bgzyVar.aY && this.aZ == bgzyVar.aZ && this.ba == bgzyVar.ba && Objects.equals(this.bb, bgzyVar.bb) && Objects.equals(this.bc, bgzyVar.bc) && Objects.equals(this.bd, bgzyVar.bd) && Objects.equals(this.a, bgzyVar.a) && Objects.equals(this.b, bgzyVar.b) && Objects.equals(this.c, bgzyVar.c) && Objects.equals(this.d, bgzyVar.d) && Objects.equals(this.e, bgzyVar.e) && Objects.equals(this.f, bgzyVar.f) && Objects.equals(this.g, bgzyVar.g) && Objects.equals(this.be, bgzyVar.be) && this.h == bgzyVar.h && this.i == bgzyVar.i && this.j == bgzyVar.j && Objects.equals(this.k, bgzyVar.k) && this.l == bgzyVar.l && this.m == bgzyVar.m && this.bf == bgzyVar.bf && Objects.equals(this.n, bgzyVar.n) && Objects.equals(this.o, bgzyVar.o) && Objects.equals(this.p, bgzyVar.p) && this.q == bgzyVar.q && this.r == bgzyVar.r && this.s == bgzyVar.s && Objects.equals(this.t, bgzyVar.t) && Objects.equals(this.u, bgzyVar.u) && Objects.equals(this.v, bgzyVar.v) && this.w == bgzyVar.w && this.bg == bgzyVar.bg && Objects.equals(this.x, bgzyVar.x) && Objects.equals(this.y, bgzyVar.y) && Objects.equals(this.bh, bgzyVar.bh) && Arrays.equals(this.bi, bgzyVar.bi) && Arrays.equals(this.bj, bgzyVar.bj) && this.z == bgzyVar.z && this.A == bgzyVar.A && Objects.equals(this.B, bgzyVar.B) && Objects.equals(this.C, bgzyVar.C) && this.D == bgzyVar.D && Objects.equals(this.E, bgzyVar.E) && Objects.equals(this.bk, bgzyVar.bk) && this.F == bgzyVar.F && this.G == bgzyVar.G && Arrays.equals(this.H, bgzyVar.H) && Arrays.equals(this.I, bgzyVar.I) && this.bl == bgzyVar.bl && this.bm == bgzyVar.bm && this.J == bgzyVar.J && Objects.equals(this.bn, bgzyVar.bn) && this.bo == bgzyVar.bo && Objects.equals(this.bp, bgzyVar.bp) && this.bq == bgzyVar.bq && Objects.equals(this.br, bgzyVar.br) && this.K == bgzyVar.K && this.bs == bgzyVar.bs && this.L == bgzyVar.L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dqpd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(bhjv bhjvVar) {
        fhaz fhazVar;
        eyga eygaVar;
        cjnm cjnmVar;
        aC();
        this.cN = bhjvVar.cV();
        if (bhjvVar.dj(0)) {
            this.M = new MessageIdType(bhjvVar.getLong(bhjvVar.cO(0, bhka.a)));
            fN(0);
        }
        if (bhjvVar.dj(1)) {
            this.N = new ConversationIdType(bhjvVar.getLong(bhjvVar.cO(1, bhka.a)));
            fN(1);
        }
        if (bhjvVar.dj(2)) {
            this.O = bhjvVar.getString(bhjvVar.cO(2, bhka.a));
            fN(2);
        }
        if (bhjvVar.dj(3)) {
            this.P = bhjvVar.getString(bhjvVar.cO(3, bhka.a));
            fN(3);
        }
        if (bhjvVar.dj(4)) {
            this.Q = bhjvVar.getString(bhjvVar.cO(4, bhka.a));
            fN(4);
        }
        if (bhjvVar.dj(5)) {
            this.R = bhjvVar.getString(bhjvVar.cO(5, bhka.a));
            fN(5);
        }
        if (bhjvVar.dj(6)) {
            this.S = bhjvVar.getLong(bhjvVar.cO(6, bhka.a));
            fN(6);
        }
        if (bhjvVar.dj(7)) {
            this.T = bart.b(bhjvVar.getLong(bhjvVar.cO(7, bhka.a)));
            fN(7);
        }
        if (bhjvVar.dj(8)) {
            this.U = bhjvVar.getLong(bhjvVar.cO(8, bhka.a));
            fN(8);
        }
        if (bhjvVar.dj(9)) {
            this.V = bhjvVar.getInt(bhjvVar.cO(9, bhka.a));
            fN(9);
        }
        if (bhjvVar.dj(10)) {
            this.W = bhjvVar.getInt(bhjvVar.cO(10, bhka.a));
            fN(10);
        }
        if (bhjvVar.dj(11)) {
            this.X = bhjvVar.getInt(bhjvVar.cO(11, bhka.a));
            fN(11);
        }
        if (bhjvVar.dj(12)) {
            this.Y = bhjvVar.getInt(bhjvVar.cO(12, bhka.a)) == 1;
            fN(12);
        }
        if (bhjvVar.dj(13)) {
            this.Z = bhjvVar.getInt(bhjvVar.cO(13, bhka.a)) == 1;
            fN(13);
        }
        dqbw dqbwVar = null;
        if (bhjvVar.dj(14)) {
            String string = bhjvVar.getString(bhjvVar.cO(14, bhka.a));
            this.aa = string == null ? null : Uri.parse(string);
            fN(14);
        }
        if (bhjvVar.dj(15)) {
            this.ab = bhjvVar.getInt(bhjvVar.cO(15, bhka.a));
            fN(15);
        }
        if (bhjvVar.dj(16)) {
            this.ac = bhjvVar.getLong(bhjvVar.cO(16, bhka.a));
            fN(16);
        }
        if (bhjvVar.dj(17)) {
            this.ad = cssq.a(bhjvVar.getString(bhjvVar.cO(17, bhka.a)));
            fN(17);
        }
        if (bhjvVar.dj(18)) {
            this.ae = bhjvVar.getString(bhjvVar.cO(18, bhka.a));
            fN(18);
        }
        if (bhjvVar.dj(19)) {
            this.af = bhjvVar.getString(bhjvVar.cO(19, bhka.a));
            fN(19);
        }
        if (bhjvVar.dj(20)) {
            this.ag = bhjvVar.getLong(bhjvVar.cO(20, bhka.a));
            fN(20);
        }
        if (bhjvVar.dj(21)) {
            this.ah = bhjvVar.getLong(bhjvVar.cO(21, bhka.a));
            fN(21);
        }
        if (bhjvVar.dj(22)) {
            this.ai = bhjvVar.getString(bhjvVar.cO(22, bhka.a));
            fN(22);
        }
        if (bhjvVar.dj(23)) {
            this.aj = bhjvVar.getInt(bhjvVar.cO(23, bhka.a));
            fN(23);
        }
        if (bhjvVar.dj(24)) {
            this.ak = bhjvVar.getString(bhjvVar.cO(24, bhka.a));
            fN(24);
        }
        if (bhjvVar.dj(25)) {
            this.al = axcn.a(bhjvVar.getString(bhjvVar.cO(25, bhka.a)));
            fN(25);
        }
        if (bhjvVar.dj(26)) {
            this.am = bhjvVar.getLong(bhjvVar.cO(26, bhka.a));
            fN(26);
        }
        if (bhjvVar.dj(27)) {
            this.an = bhjvVar.getString(bhjvVar.cO(27, bhka.a));
            fN(27);
        }
        if (bhjvVar.dj(28)) {
            this.ao = basd.a(bhjvVar.getString(bhjvVar.cO(28, bhka.a)));
            fN(28);
        }
        if (bhjvVar.dj(29)) {
            this.ap = bhjvVar.getInt(bhjvVar.cO(29, bhka.a));
            fN(29);
        }
        if (bhjvVar.dj(30)) {
            bvdz[] bvdzVarArrValues = bvdz.values();
            int i = bhjvVar.getInt(bhjvVar.cO(30, bhka.a));
            if (i >= bvdzVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aq = bvdzVarArrValues[i];
            fN(30);
        }
        if (bhjvVar.dj(31)) {
            this.ar = bhjvVar.getInt(bhjvVar.cO(31, bhka.a));
            fN(31);
        }
        if (bhjvVar.dj(32)) {
            this.as = bhjvVar.getInt(bhjvVar.cO(32, bhka.a)) == 1;
            fN(32);
        }
        if (bhjvVar.dj(33)) {
            this.at = bhjvVar.getString(bhjvVar.cO(33, bhka.a));
            fN(33);
        }
        if (bhjvVar.dj(34)) {
            this.au = bhjvVar.getLong(bhjvVar.cO(34, bhka.a));
            fN(34);
        }
        if (bhjvVar.dj(35)) {
            this.av = bhjvVar.getInt(bhjvVar.cO(35, bhka.a));
            fN(35);
        }
        if (bhjvVar.dj(36)) {
            this.aw = bhjvVar.getString(bhjvVar.cO(36, bhka.a));
            fN(36);
        }
        if (bhjvVar.dj(37)) {
            this.ax = bhjvVar.getString(bhjvVar.cO(37, bhka.a));
            fN(37);
        }
        if (bhjvVar.dj(38)) {
            this.ay = bhjvVar.getString(bhjvVar.cO(38, bhka.a));
            fN(38);
        }
        if (bhjvVar.dj(39)) {
            this.az = bhjvVar.getLong(bhjvVar.cO(39, bhka.a));
            fN(39);
        }
        if (bhjvVar.dj(40)) {
            this.aA = bhjvVar.getString(bhjvVar.cO(40, bhka.a));
            fN(40);
        }
        if (bhjvVar.dj(41)) {
            this.aB = bhjvVar.getLong(bhjvVar.cO(41, bhka.a));
            fN(41);
        }
        if (bhjvVar.dj(42)) {
            this.aC = bhjvVar.getLong(bhjvVar.cO(42, bhka.a));
            fN(42);
        }
        if (bhjvVar.dj(43)) {
            this.aD = basd.a(bhjvVar.getString(bhjvVar.cO(43, bhka.a)));
            fN(43);
        }
        if (bhjvVar.dj(44)) {
            byte[] blob = bhjvVar.getBlob(bhjvVar.cO(44, bhka.a));
            if (blob == null) {
                cjnmVar = null;
            } else {
                try {
                    cjnmVar = (cjnm) evsn.parseFrom(cjnm.a, blob, evrr.a());
                } catch (Throwable unused) {
                    cjnmVar = cjnm.a;
                }
            }
            this.aE = cjnmVar;
            fN(44);
        }
        if (bhjvVar.dj(45)) {
            this.aF = bhjvVar.getString(bhjvVar.cO(45, bhka.a));
            fN(45);
        }
        if (bhjvVar.dj(46)) {
            this.aG = bhjvVar.getBlob(bhjvVar.cO(46, bhka.a));
            fN(46);
        }
        if (bhjvVar.dj(47)) {
            this.aH = bhjvVar.getLong(bhjvVar.cO(47, bhka.a));
            fN(47);
        }
        if (bhjvVar.dj(48)) {
            byte[] blob2 = bhjvVar.getBlob(bhjvVar.cO(48, bhka.a));
            if (blob2 == null) {
                eygaVar = null;
            } else {
                try {
                    eygaVar = (eyga) evsn.parseFrom(eyga.a, blob2, evrr.a());
                } catch (Throwable unused2) {
                    eygaVar = eyga.a;
                }
            }
            this.aI = eygaVar;
            fN(48);
        }
        if (bhjvVar.dj(49)) {
            this.aJ = bhjvVar.getString(bhjvVar.cO(49, bhka.a));
            fN(49);
        }
        if (bhjvVar.dj(50)) {
            this.aK = bhjvVar.getString(bhjvVar.cO(50, bhka.a));
            fN(50);
        }
        if (bhjvVar.dj(51)) {
            this.aL = new MessageIdType(bhjvVar.getLong(bhjvVar.cO(51, bhka.a)));
            fN(51);
        }
        if (bhjvVar.dj(52)) {
            this.aM = new MessageIdType(bhjvVar.getLong(bhjvVar.cO(52, bhka.a)));
            fN(52);
        }
        if (bhjvVar.dj(53)) {
            this.aN = bhjvVar.getInt(bhjvVar.cO(53, bhka.a)) == 1;
            fN(53);
        }
        if (bhjvVar.dj(54)) {
            String string2 = bhjvVar.getString(bhjvVar.cO(54, bhka.a));
            this.aO = string2 == null ? null : Uri.parse(string2);
            fN(54);
        }
        if (bhjvVar.dj(55)) {
            this.aP = basg.a(bhjvVar.getString(bhjvVar.cO(55, bhka.a)));
            fN(55);
        }
        if (bhjvVar.dj(56)) {
            this.aQ = bhjvVar.getInt(bhjvVar.cO(56, bhka.a));
            fN(56);
        }
        if (bhjvVar.dj(57)) {
            cpyi[] cpyiVarArrValues = cpyi.values();
            int i2 = bhjvVar.getInt(bhjvVar.cO(57, bhka.a));
            if (i2 >= cpyiVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aR = cpyiVarArrValues[i2];
            fN(57);
        }
        if (bhjvVar.dj(58)) {
            cgrd[] cgrdVarArrValues = cgrd.values();
            int i3 = bhjvVar.getInt(bhjvVar.cO(58, bhka.a));
            if (i3 >= cgrdVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aS = cgrdVarArrValues[i3];
            fN(58);
        }
        if (bhjvVar.dj(59)) {
            bvdn[] bvdnVarArrValues = bvdn.values();
            int i4 = bhjvVar.getInt(bhjvVar.cO(59, bhka.a));
            if (i4 >= bvdnVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aT = bvdnVarArrValues[i4];
            fN(59);
        }
        if (bhjvVar.dj(60)) {
            this.aU = bhjvVar.c();
            fN(60);
        }
        if (bhjvVar.dj(61)) {
            this.aV = bhjvVar.getInt(bhjvVar.cO(61, bhka.a)) == 1;
            fN(61);
        }
        if (bhjvVar.dj(62)) {
            byte[] blob3 = bhjvVar.getBlob(bhjvVar.cO(62, bhka.a));
            if (blob3 == null) {
                fhazVar = null;
            } else {
                try {
                    fhazVar = (fhaz) evsn.parseFrom(fhaz.a, blob3, evrr.a());
                } catch (Throwable unused3) {
                    fhazVar = fhaz.a;
                }
            }
            this.aW = fhazVar;
            fN(62);
        }
        if (bhjvVar.dj(63)) {
            bvdx[] bvdxVarArrValues = bvdx.values();
            int i5 = bhjvVar.getInt(bhjvVar.cO(63, bhka.a));
            if (i5 >= bvdxVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aX = bvdxVarArrValues[i5];
            fN(63);
        }
        if (bhjvVar.dj(64)) {
            bvdx[] bvdxVarArrValues2 = bvdx.values();
            int i6 = bhjvVar.getInt(bhjvVar.cO(64, bhka.a));
            if (i6 >= bvdxVarArrValues2.length) {
                throw new IllegalArgumentException();
            }
            this.aY = bvdxVarArrValues2[i6];
            fN(64);
        }
        if (bhjvVar.dj(65)) {
            bvec[] bvecVarArrValues = bvec.values();
            int i7 = bhjvVar.getInt(bhjvVar.cO(65, bhka.a));
            if (i7 >= bvecVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aZ = bvecVarArrValues[i7];
            fN(65);
        }
        if (bhjvVar.dj(66)) {
            this.ba = bhjvVar.getInt(bhjvVar.cO(66, bhka.a));
            fN(66);
        }
        if (bhjvVar.dj(67)) {
            this.bb = new baro(bhjvVar.getString(bhjvVar.cO(67, bhka.a)));
            fN(67);
        }
        if (bhjvVar.dj(68)) {
            this.bc = new cbqz(bhjvVar.getLong(bhjvVar.cO(68, bhka.a)));
            fN(68);
        }
        if (bhjvVar.dj(69)) {
            this.bd = basg.a(bhjvVar.getString(bhjvVar.cO(69, bhka.a)));
            fN(69);
        }
        if (bhjvVar.dj(70)) {
            this.a = bhjvVar.getString(bhjvVar.cO(70, bhka.a));
            fN(70);
        }
        if (bhjvVar.dj(71)) {
            this.b = new MessageIdType(bhjvVar.getLong(bhjvVar.cO(71, bhka.a)));
            fN(71);
        }
        if (bhjvVar.dj(72)) {
            this.c = cssq.a(bhjvVar.getString(bhjvVar.cO(72, bhka.a)));
            fN(72);
        }
        if (bhjvVar.dj(73)) {
            this.d = bhjvVar.getString(bhjvVar.cO(73, bhka.a));
            fN(73);
        }
        if (bhjvVar.dj(74)) {
            String string3 = bhjvVar.getString(bhjvVar.cO(74, bhka.a));
            this.e = string3 == null ? null : Uri.parse(string3);
            fN(74);
        }
        if (bhjvVar.dj(75)) {
            this.f = bhjvVar.getString(bhjvVar.cO(75, bhka.a));
            fN(75);
        }
        if (bhjvVar.dj(76)) {
            String string4 = bhjvVar.getString(bhjvVar.cO(76, bhka.a));
            this.g = string4 == null ? null : Uri.parse(string4);
            fN(76);
        }
        if (bhjvVar.dj(77)) {
            String string5 = bhjvVar.getString(bhjvVar.cO(77, bhka.a));
            this.be = string5 == null ? null : Uri.parse(string5);
            fN(77);
        }
        if (bhjvVar.dj(78)) {
            this.h = bhjvVar.getInt(bhjvVar.cO(78, bhka.a));
            fN(78);
        }
        if (bhjvVar.dj(79)) {
            this.i = bhjvVar.getInt(bhjvVar.cO(79, bhka.a));
            fN(79);
        }
        if (bhjvVar.dj(80)) {
            this.j = bhjvVar.getLong(bhjvVar.cO(80, bhka.a));
            fN(80);
        }
        if (bhjvVar.dj(81)) {
            String string6 = bhjvVar.getString(bhjvVar.cO(81, bhka.a));
            this.k = string6 == null ? null : Uri.parse(string6);
            fN(81);
        }
        if (bhjvVar.dj(82)) {
            this.l = bhjvVar.getLong(bhjvVar.cO(82, bhka.a));
            fN(82);
        }
        if (bhjvVar.dj(83)) {
            bvdt[] bvdtVarArrValues = bvdt.values();
            int i8 = bhjvVar.getInt(bhjvVar.cO(83, bhka.a));
            if (i8 >= bvdtVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.m = bvdtVarArrValues[i8];
            fN(83);
        }
        if (bhjvVar.dj(84)) {
            bvdl[] bvdlVarArrValues = bvdl.values();
            int i9 = bhjvVar.getInt(bhjvVar.cO(84, bhka.a));
            if (i9 >= bvdlVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.bf = bvdlVarArrValues[i9];
            fN(84);
        }
        if (bhjvVar.dj(85)) {
            this.n = new ConversationIdType(bhjvVar.getLong(bhjvVar.cO(85, bhka.a)));
            fN(85);
        }
        if (bhjvVar.dj(86)) {
            this.o = bvdf.a(bhjvVar.getString(bhjvVar.cO(86, bhka.a)));
            fN(86);
        }
        if (bhjvVar.dj(87)) {
            this.p = bvdf.a(bhjvVar.getString(bhjvVar.cO(87, bhka.a)));
            fN(87);
        }
        if (bhjvVar.dj(88)) {
            this.q = bhjvVar.getLong(bhjvVar.cO(88, bhka.a));
            fN(88);
        }
        if (bhjvVar.dj(89)) {
            this.r = bhjvVar.getDouble(bhjvVar.cO(89, bhka.a));
            fN(89);
        }
        if (bhjvVar.dj(90)) {
            this.s = bhjvVar.getDouble(bhjvVar.cO(90, bhka.a));
            fN(90);
        }
        if (bhjvVar.dj(91)) {
            String string7 = bhjvVar.getString(bhjvVar.cO(91, bhka.a));
            this.t = string7 == null ? null : Uri.parse(string7);
            fN(91);
        }
        if (bhjvVar.dj(92)) {
            this.u = bhjvVar.getString(bhjvVar.cO(92, bhka.a));
            fN(92);
        }
        if (bhjvVar.dj(93)) {
            String string8 = bhjvVar.getString(bhjvVar.cO(93, bhka.a));
            this.v = string8 == null ? null : Uri.parse(string8);
            fN(93);
        }
        if (bhjvVar.dj(94)) {
            this.w = bhjvVar.getInt(bhjvVar.cO(94, bhka.a));
            fN(94);
        }
        if (bhjvVar.dj(95)) {
            this.bg = bhjvVar.getInt(bhjvVar.cO(95, bhka.a));
            fN(95);
        }
        if (bhjvVar.dj(96)) {
            this.x = bhjvVar.getString(bhjvVar.cO(96, bhka.a));
            fN(96);
        }
        if (bhjvVar.dj(97)) {
            this.y = bhjvVar.getString(bhjvVar.cO(97, bhka.a));
            fN(97);
        }
        if (bhjvVar.dj(98)) {
            this.bh = bhjvVar.getString(bhjvVar.cO(98, bhka.a));
            fN(98);
        }
        if (bhjvVar.dj(99)) {
            this.bi = bhjvVar.getBlob(bhjvVar.cO(99, bhka.a));
            fN(99);
        }
        if (bhjvVar.dj(100)) {
            this.bj = bhjvVar.getBlob(bhjvVar.cO(100, bhka.a));
            fN(100);
        }
        if (bhjvVar.dj(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.z = bhjvVar.getInt(bhjvVar.cO(EnergyProfile.EVCONNECTOR_TYPE_OTHER, bhka.a)) == 1;
            fN(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (bhjvVar.dj(102)) {
            this.A = bhjvVar.getLong(bhjvVar.cO(102, bhka.a));
            fN(102);
        }
        if (bhjvVar.dj(103)) {
            this.B = bhjvVar.getString(bhjvVar.cO(103, bhka.a));
            fN(103);
        }
        if (bhjvVar.dj(104)) {
            this.C = bhjvVar.getString(bhjvVar.cO(104, bhka.a));
            fN(104);
        }
        if (bhjvVar.dj(105)) {
            this.D = bhjvVar.getLong(bhjvVar.cO(105, bhka.a));
            fN(105);
        }
        if (bhjvVar.dj(106)) {
            this.E = bhjvVar.getString(bhjvVar.cO(106, bhka.a));
            fN(106);
        }
        if (bhjvVar.dj(107)) {
            this.bk = bhjvVar.getString(bhjvVar.cO(107, bhka.a));
            fN(107);
        }
        if (bhjvVar.dj(108)) {
            this.F = bhjvVar.getInt(bhjvVar.cO(108, bhka.a)) == 1;
            fN(108);
        }
        if (bhjvVar.dj(109)) {
            this.G = bhjvVar.getLong(bhjvVar.cO(109, bhka.a));
            fN(109);
        }
        if (bhjvVar.dj(110)) {
            this.H = bhjvVar.getBlob(bhjvVar.cO(110, bhka.a));
            fN(110);
        }
        if (bhjvVar.dj(111)) {
            this.I = bhjvVar.getBlob(bhjvVar.cO(111, bhka.a));
            fN(111);
        }
        if (bhjvVar.dj(112)) {
            this.bl = bhjvVar.getInt(bhjvVar.cO(112, bhka.a)) == 1;
            fN(112);
        }
        if (bhjvVar.dj(113)) {
            this.bm = bhjvVar.getInt(bhjvVar.cO(113, bhka.a)) == 1;
            fN(113);
        }
        if (bhjvVar.dj(114)) {
            this.J = bhjvVar.getLong(bhjvVar.cO(114, bhka.a));
            fN(114);
        }
        if (bhjvVar.dj(115)) {
            this.bn = bhjvVar.getString(bhjvVar.cO(115, bhka.a));
            fN(115);
        }
        if (bhjvVar.dj(116)) {
            bvdr[] bvdrVarArrValues = bvdr.values();
            int i10 = bhjvVar.getInt(bhjvVar.cO(116, bhka.a));
            if (i10 >= bvdrVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.bo = bvdrVarArrValues[i10];
            fN(116);
        }
        if (bhjvVar.dj(117)) {
            byte[] blob4 = bhjvVar.getBlob(bhjvVar.cO(117, bhka.a));
            if (blob4 != null) {
                try {
                    dqbwVar = (dqbw) evsn.parseFrom(dqbw.a, blob4, evrr.a());
                } catch (Throwable unused4) {
                    dqbwVar = dqbw.a;
                }
            }
            this.bp = dqbwVar;
            fN(117);
        }
        if (bhjvVar.dj(118)) {
            bvef[] bvefVarArrValues = bvef.values();
            int i11 = bhjvVar.getInt(bhjvVar.cO(118, bhka.a));
            if (i11 >= bvefVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.bq = bvefVarArrValues[i11];
            fN(118);
        }
        if (bhjvVar.dj(119)) {
            this.br = athg.a(bhjvVar.getString(bhjvVar.cO(119, bhka.a)));
            fN(119);
        }
        if (bhjvVar.dj(120)) {
            bvdy[] bvdyVarArrValues = bvdy.values();
            int i12 = bhjvVar.getInt(bhjvVar.cO(120, bhka.a));
            if (i12 >= bvdyVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.K = bvdyVarArrValues[i12];
            fN(120);
        }
        if (bhjvVar.dj(121)) {
            bvdq[] bvdqVarArrValues = bvdq.values();
            int i13 = bhjvVar.getInt(bhjvVar.cO(121, bhka.a));
            if (i13 >= bvdqVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.bs = bvdqVarArrValues[i13];
            fN(121);
        }
        if (bhjvVar.dj(122)) {
            this.L = bhjvVar.getInt(bhjvVar.cO(122, bhka.a)) == 1;
            fN(122);
        }
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        MessageIdType messageIdType = this.M;
        ConversationIdType conversationIdType = this.N;
        String str = this.O;
        String str2 = this.P;
        String str3 = this.Q;
        String str4 = this.R;
        Long lValueOf = Long.valueOf(this.S);
        Instant instant = this.T;
        Long lValueOf2 = Long.valueOf(this.U);
        Integer numValueOf = Integer.valueOf(this.V);
        Integer numValueOf2 = Integer.valueOf(this.W);
        Integer numValueOf3 = Integer.valueOf(this.X);
        Boolean boolValueOf = Boolean.valueOf(this.Y);
        Boolean boolValueOf2 = Boolean.valueOf(this.Z);
        dqqe dqqeVar3 = dqqeVar2;
        Uri uri = this.aa;
        Integer numValueOf4 = Integer.valueOf(this.ab);
        Long lValueOf3 = Long.valueOf(this.ac);
        String str5 = this.ad;
        String str6 = this.ae;
        String str7 = this.af;
        Long lValueOf4 = Long.valueOf(this.ag);
        Long lValueOf5 = Long.valueOf(this.ah);
        String str8 = this.ai;
        Integer numValueOf5 = Integer.valueOf(this.aj);
        String str9 = this.ak;
        axcm axcmVar = this.al;
        Long lValueOf6 = Long.valueOf(this.am);
        String str10 = this.an;
        basd basdVar = this.ao;
        Integer numValueOf6 = Integer.valueOf(this.ap);
        bvdz bvdzVar = this.aq;
        Integer numValueOf7 = Integer.valueOf(bvdzVar == null ? 0 : bvdzVar.ordinal());
        Integer numValueOf8 = Integer.valueOf(this.ar);
        Boolean boolValueOf3 = Boolean.valueOf(this.as);
        String str11 = this.at;
        Long lValueOf7 = Long.valueOf(this.au);
        Integer numValueOf9 = Integer.valueOf(this.av);
        String str12 = this.aw;
        String str13 = this.ax;
        String str14 = this.ay;
        Long lValueOf8 = Long.valueOf(this.az);
        String str15 = this.aA;
        Long lValueOf9 = Long.valueOf(this.aB);
        Long lValueOf10 = Long.valueOf(this.aC);
        basd basdVar2 = this.aD;
        cjnm cjnmVar = this.aE;
        String str16 = this.aF;
        Integer numValueOf10 = Integer.valueOf(Arrays.hashCode(this.aG));
        Long lValueOf11 = Long.valueOf(this.aH);
        eyga eygaVar = this.aI;
        String str17 = this.aJ;
        String str18 = this.aK;
        MessageIdType messageIdType2 = this.aL;
        MessageIdType messageIdType3 = this.aM;
        Boolean boolValueOf4 = Boolean.valueOf(this.aN);
        Uri uri2 = this.aO;
        Optional optional = this.aP;
        Integer numValueOf11 = Integer.valueOf(this.aQ);
        cpyi cpyiVar = this.aR;
        Integer numValueOf12 = Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal());
        cgrd cgrdVar = this.aS;
        Integer numValueOf13 = Integer.valueOf(cgrdVar == null ? 0 : cgrdVar.ordinal());
        bvdn bvdnVar = this.aT;
        Integer numValueOf14 = Integer.valueOf(bvdnVar == null ? 0 : bvdnVar.ordinal());
        Integer numValueOf15 = Integer.valueOf(this.aU);
        Boolean boolValueOf5 = Boolean.valueOf(this.aV);
        fhaz fhazVar = this.aW;
        bvdx bvdxVar = this.aX;
        Integer numValueOf16 = Integer.valueOf(bvdxVar == null ? 0 : bvdxVar.ordinal());
        bvdx bvdxVar2 = this.aY;
        Integer numValueOf17 = Integer.valueOf(bvdxVar2 == null ? 0 : bvdxVar2.ordinal());
        bvec bvecVar = this.aZ;
        Integer numValueOf18 = Integer.valueOf(bvecVar == null ? 0 : bvecVar.ordinal());
        Integer numValueOf19 = Integer.valueOf(this.ba);
        baro baroVar = this.bb;
        cbqz cbqzVar = this.bc;
        Optional optional2 = this.bd;
        String str19 = this.a;
        MessageIdType messageIdType4 = this.b;
        String str20 = this.c;
        String str21 = this.d;
        Uri uri3 = this.e;
        String str22 = this.f;
        Uri uri4 = this.g;
        Uri uri5 = this.be;
        Integer numValueOf20 = Integer.valueOf(this.h);
        Integer numValueOf21 = Integer.valueOf(this.i);
        Long lValueOf12 = Long.valueOf(this.j);
        Uri uri6 = this.k;
        Long lValueOf13 = Long.valueOf(this.l);
        bvdt bvdtVar = this.m;
        Integer numValueOf22 = Integer.valueOf(bvdtVar == null ? 0 : bvdtVar.ordinal());
        bvdl bvdlVar = this.bf;
        Integer numValueOf23 = Integer.valueOf(bvdlVar == null ? 0 : bvdlVar.ordinal());
        ConversationIdType conversationIdType2 = this.n;
        bvdg bvdgVar = this.o;
        bvdg bvdgVar2 = this.p;
        Long lValueOf14 = Long.valueOf(this.q);
        Double dValueOf = Double.valueOf(this.r);
        Double dValueOf2 = Double.valueOf(this.s);
        Uri uri7 = this.t;
        String str23 = this.u;
        Uri uri8 = this.v;
        Integer numValueOf24 = Integer.valueOf(this.w);
        Integer numValueOf25 = Integer.valueOf(this.bg);
        String str24 = this.x;
        String str25 = this.y;
        String str26 = this.bh;
        Integer numValueOf26 = Integer.valueOf(Arrays.hashCode(this.bi));
        Integer numValueOf27 = Integer.valueOf(Arrays.hashCode(this.bj));
        Boolean boolValueOf6 = Boolean.valueOf(this.z);
        Long lValueOf15 = Long.valueOf(this.A);
        String str27 = this.B;
        String str28 = this.C;
        Long lValueOf16 = Long.valueOf(this.D);
        String str29 = this.E;
        String str30 = this.bk;
        Boolean boolValueOf7 = Boolean.valueOf(this.F);
        Long lValueOf17 = Long.valueOf(this.G);
        Integer numValueOf28 = Integer.valueOf(Arrays.hashCode(this.H));
        Integer numValueOf29 = Integer.valueOf(Arrays.hashCode(this.I));
        Boolean boolValueOf8 = Boolean.valueOf(this.bl);
        Boolean boolValueOf9 = Boolean.valueOf(this.bm);
        Long lValueOf18 = Long.valueOf(this.J);
        String str31 = this.bn;
        bvdr bvdrVar = this.bo;
        Integer numValueOf30 = Integer.valueOf(bvdrVar == null ? 0 : bvdrVar.ordinal());
        dqbw dqbwVar = this.bp;
        bvef bvefVar = this.bq;
        Integer numValueOf31 = Integer.valueOf(bvefVar == null ? 0 : bvefVar.ordinal());
        athh athhVar = this.br;
        bvdy bvdyVar = this.K;
        Integer numValueOf32 = Integer.valueOf(bvdyVar == null ? 0 : bvdyVar.ordinal());
        bvdq bvdqVar = this.bs;
        return Objects.hash(dqqeVar3, messageIdType, conversationIdType, str, str2, str3, str4, lValueOf, instant, lValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf, boolValueOf2, uri, numValueOf4, lValueOf3, str5, str6, str7, lValueOf4, lValueOf5, str8, numValueOf5, str9, axcmVar, lValueOf6, str10, basdVar, numValueOf6, numValueOf7, numValueOf8, boolValueOf3, str11, lValueOf7, numValueOf9, str12, str13, str14, lValueOf8, str15, lValueOf9, lValueOf10, basdVar2, cjnmVar, str16, numValueOf10, lValueOf11, eygaVar, str17, str18, messageIdType2, messageIdType3, boolValueOf4, uri2, optional, numValueOf11, numValueOf12, numValueOf13, numValueOf14, numValueOf15, boolValueOf5, fhazVar, numValueOf16, numValueOf17, numValueOf18, numValueOf19, baroVar, cbqzVar, optional2, str19, messageIdType4, str20, str21, uri3, str22, uri4, uri5, numValueOf20, numValueOf21, lValueOf12, uri6, lValueOf13, numValueOf22, numValueOf23, conversationIdType2, bvdgVar, bvdgVar2, lValueOf14, dValueOf, dValueOf2, uri7, str23, uri8, numValueOf24, numValueOf25, str24, str25, str26, numValueOf26, numValueOf27, boolValueOf6, lValueOf15, str27, str28, lValueOf16, str29, str30, boolValueOf7, lValueOf17, numValueOf28, numValueOf29, boolValueOf8, boolValueOf9, lValueOf18, str31, numValueOf30, dqbwVar, numValueOf31, athhVar, numValueOf32, Integer.valueOf(bvdqVar == null ? 0 : bvdqVar.ordinal()), Boolean.valueOf(this.L), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "DraftsView -- REDACTED") : a();
    }
}
