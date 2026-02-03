package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class clpq extends dqpd {
    private String A;
    private String B;
    private String C;
    private long D;
    private long E;
    private String F;
    private int G;
    private String H;
    private axcm I;
    private long J;
    private String K;
    private basd L;
    private int M;
    private bvdz N;
    private int O;
    private boolean P;
    private String Q;
    private long R;
    private int S;
    private String T;
    private String U;
    private String V;
    private long W;
    private String X;
    private long Y;
    private long Z;
    public MessagesTable.BindData a;
    private Optional aA;
    private String[] aB;
    private MessageIdType aC;
    private String[] aD;
    private String aE;
    private Uri[] aF;
    private String[] aG;
    private Uri[] aH;
    private Uri[] aI;
    private int[] aJ;
    private int[] aK;
    private long aL;
    private Uri aM;
    private long[] aN;
    private bvdt aO;
    private bvdl[] aP;
    private ConversationIdType aQ;
    private bvdg aR;
    private bvdg aS;
    private long aT;
    private double aU;
    private double aV;
    private Uri[] aW;
    private String aX;
    private Uri[] aY;
    private int[] aZ;
    private basd aa;
    private cjnm ab;
    private String ac;
    private byte[] ad;
    private long ae;
    private eyga af;
    private String ag;
    private String ah;
    private MessageIdType ai;
    private MessageIdType aj;
    private boolean ak;
    private Uri al;
    private Optional am;
    private int an;
    private cpyi ao;
    private cgrd ap;
    private bvdn aq;
    private int ar;
    private boolean as;
    private fhaz at;
    private bvdx au;
    private bvdx av;
    private bvec aw;
    private int ax;
    private baro ay;
    private cbqz az;
    public PartsTable.BindData[] b;
    private bvdq bA;
    private boolean bB;
    private long[] bC;
    private String bD;
    private int[] ba;
    private String[] bb;
    private String bc;
    private String bd;
    private byte[] be;
    private byte[] bf;
    private boolean[] bg;
    private long[] bh;
    private String[] bi;
    private String[] bj;
    private long[] bk;
    private String[] bl;
    private String bm;
    private boolean[] bn;
    private long[] bo;
    private byte[][] bp;
    private byte[][] bq;
    private boolean[] br;
    private boolean bs;
    private long bt;
    private String bu;
    private bvdr bv;
    private dqbw bw;
    private bvef bx;
    private athh by;
    private bvdy bz;
    public ScheduledSendTable.BindData c;
    private String d;
    private MessageIdType e;
    private ConversationIdType f;
    private Instant g;
    private cmct h;
    private Instant i;
    private MessageIdType j;
    private ConversationIdType k;
    private String l;
    private String m;
    private String n;
    private String o;
    private long p;
    private Instant q;
    private long r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private Uri x;
    private int y;
    private long z;

    protected clpq() {
        MessageIdType messageIdType = bary.a;
        this.e = messageIdType;
        ConversationIdType conversationIdType = barn.a;
        this.f = conversationIdType;
        this.g = bart.b(0L);
        this.h = cmct.SCHEDULED;
        this.i = bart.b(0L);
        this.j = messageIdType;
        this.k = conversationIdType;
        this.p = 0L;
        this.q = bart.b(0L);
        this.r = 0L;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.y = 0;
        this.z = 0L;
        this.D = 0L;
        this.E = 0L;
        this.G = 0;
        this.I = null;
        this.J = 0L;
        basd basdVar = basd.a;
        this.L = basdVar;
        this.M = 0;
        this.N = bvdz.VERIFICATION_NA;
        this.O = 0;
        this.P = false;
        this.R = -1L;
        this.S = -1;
        this.X = "";
        this.Y = 0L;
        this.Z = 1L;
        this.aa = basdVar;
        this.ae = 0L;
        this.ai = messageIdType;
        this.aj = messageIdType;
        this.ak = false;
        this.am = basg.a;
        this.an = -2;
        this.ao = cpyi.UNKNOWN;
        this.ap = cgrd.c;
        this.aq = bvdn.UNKNOWN;
        this.ar = 0;
        this.as = false;
        bvdx bvdxVar = bvdx.UNKNOWN;
        this.au = bvdxVar;
        this.av = bvdxVar;
        this.aw = bvec.UNKNOWN;
        this.ax = -1;
        this.ay = baro.a;
        this.az = new cbqz(0L);
        this.aA = basc.a();
        this.aC = messageIdType;
        this.aO = bvdt.SUCCEEDED;
        this.aQ = conversationIdType;
        this.aR = new bvdg(-1);
        this.aS = new bvdg(-1);
        this.aT = -1L;
        this.aU = 0.0d;
        this.aV = 0.0d;
        this.bs = false;
        this.bv = bvdr.STANDARD;
        this.bx = bvef.UNKNOWN;
        this.by = null;
        this.bz = bvdy.NONE;
        this.bA = bvdq.DEFAULT_NO_VERDICT;
        this.bB = false;
    }

    private final void g() {
        int iIntValue = cmas.c().intValue();
        cmbh cmbhVarA = ScheduledSendTable.a();
        aA(0, "_id");
        cmbhVarA.e(this.d);
        aA(1, "message_id");
        cmbhVarA.f(this.e);
        aA(2, "conversation_id");
        cmbhVarA.c(this.f);
        aA(3, "scheduled_time");
        cmbhVarA.g(this.g);
        aA(4, "status");
        cmbhVarA.h(this.h);
        if (iIntValue >= 58020) {
            aA(5, "creation_time");
            cmbhVarA.d(this.i);
        }
        this.c = cmbhVarA.a();
        bquu bquuVarC = MessagesTable.c();
        aA(6, "_id");
        bquuVarC.v(this.j);
        aA(7, "conversation_id");
        bquuVarC.m(this.k);
        aA(8, "sender_id");
        bquuVarC.ai(this.l);
        if (iIntValue >= 54040) {
            aA(9, "sender_send_destination");
            bquuVarC.aj(this.m);
        }
        if (iIntValue >= 59340) {
            aA(10, "msisdn_receiving_rcs_message");
            bquuVarC.E(this.n);
        }
        if (iIntValue >= 54040) {
            aA(11, "receiving_network_country");
            bquuVarC.ab(this.o);
        }
        aA(12, "sent_timestamp");
        bquuVarC.ak(this.p);
        if (iIntValue >= 17030) {
            aA(13, "queue_insert_timestamp");
            bquuVarC.Q(this.q);
        }
        aA(14, "received_timestamp");
        bquuVarC.aa(this.r);
        aA(15, "message_protocol");
        bquuVarC.P(this.s);
        aA(16, "message_status");
        bquuVarC.aq(this.t);
        if (iIntValue >= 13020) {
            aA(17, "message_report_status");
            bquuVarC.y(this.u);
        }
        aA(18, "seen");
        bquuVarC.H(this.v);
        aA(19, "read");
        bquuVarC.Z(this.w);
        aA(20, "sms_message_uri");
        bquuVarC.ao(this.x);
        aA(21, "sms_priority");
        bquuVarC.ap(this.y);
        aA(22, "sms_message_size");
        bquuVarC.an(this.z);
        aA(23, "mms_subject");
        bquuVarC.C(this.A);
        aA(24, "mms_transaction_id");
        bquuVarC.D(this.B);
        aA(25, "mms_content_location");
        bquuVarC.z(this.C);
        aA(26, "mms_expiry");
        bquuVarC.A(this.D);
        if (iIntValue >= 59890) {
            aA(27, "rcs_expiry");
            bquuVarC.U(this.E);
        }
        if (iIntValue >= 9030) {
            aA(28, "mms_retrieve_text");
            bquuVarC.B(this.F);
        }
        aA(29, "raw_status");
        bquuVarC.S(this.G);
        aA(30, "self_id");
        bquuVarC.ag(this.H);
        if (iIntValue >= 60160) {
            aA(31, "my_identity_foreign_key");
            bquuVarC.G(this.I);
        }
        aA(32, "retry_start_timestamp");
        bquuVarC.ae(this.J);
        if (iIntValue >= 8500) {
            aA(33, "cloud_sync_id");
            bquuVarC.h(this.K);
        }
        if (iIntValue >= 41040) {
            aA(34, "rcs_message_id_with_text_type");
            bquuVarC.W(this.L);
        }
        if (iIntValue >= 29060) {
            aA(35, "etouffee_status");
            bquuVarC.T(this.M);
        }
        if (iIntValue >= 29090) {
            aA(36, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            bquuVarC.at(this.N);
        }
        if (iIntValue >= 39000) {
            aA(37, "rcs_ui_status");
            bquuVarC.Y(this.O);
        }
        if (iIntValue >= 30010) {
            aA(38, "is_hidden");
            bquuVarC.w(this.P);
        }
        if (iIntValue >= 10002) {
            aA(39, "rcs_remote_instance");
            bquuVarC.X(this.Q);
        }
        if (iIntValue >= 10004) {
            aA(40, "rcs_file_transfer_session_id");
            bquuVarC.V(this.R);
        }
        if (iIntValue >= 9000) {
            aA(41, "sms_error_code");
            bquuVarC.al(this.S);
        }
        if (iIntValue >= 9000) {
            aA(42, "sms_error_desc_map_name");
            bquuVarC.am(this.T);
        }
        if (iIntValue >= 9010) {
            aA(43, "correlation_id");
            bquuVarC.n(this.U);
        }
        if (iIntValue >= 31010) {
            aA(44, "cms_id");
            bquuVarC.j(this.V);
        }
        if (iIntValue >= 37040) {
            aA(45, "cms_last_mod_seq");
            bquuVarC.k(this.W);
        }
        if (iIntValue >= 19020) {
            aA(46, "web_id");
            bquuVarC.au(this.X);
        }
        if (iIntValue >= 29100) {
            aA(47, "usage_stats_logging_id");
            bquuVarC.as(this.Y);
        }
        if (iIntValue >= 35030) {
            aA(48, "send_counter");
            bquuVarC.ah(this.Z);
        }
        if (iIntValue >= 35030) {
            aA(49, "original_rcs_message_id");
            bquuVarC.L(this.aa);
        }
        if (iIntValue >= 60820) {
            aA(50, "raw_rcs_message_to_send");
            bquuVarC.R(this.ab);
        }
        if (iIntValue >= 37020) {
            aA(51, "custom_delivery_receipt_mime_type");
            bquuVarC.p(this.ac);
        }
        if (iIntValue >= 37020) {
            aA(52, "custom_delivery_receipt_content");
            bquuVarC.o(this.ad);
        }
        if (iIntValue >= 37030) {
            aA(53, "report_attempt_acounter");
            bquuVarC.ac(this.ae);
        }
        if (iIntValue >= 45020) {
            aA(54, "custom_headers");
            bquuVarC.q(this.af);
        }
        if (iIntValue >= 46010) {
            aA(55, "cms_correlation_id");
            bquuVarC.i(this.ag);
        }
        if (iIntValue >= 48030) {
            aA(56, "group_private_participant");
            bquuVarC.u(this.ah);
        }
        if (iIntValue >= 48030) {
            aA(57, "original_message_id");
            bquuVarC.J(this.ai);
        }
        if (iIntValue >= 60950) {
            aA(58, "parent_message_id");
            bquuVarC.O(this.aj);
        }
        if (iIntValue >= 49060) {
            aA(59, "awaiting_reverse_sync");
            bquuVarC.f(this.ak);
        }
        if (iIntValue >= 49060) {
            aA(60, "old_sms_message_uri");
            bquuVarC.I(this.al);
        }
        if (iIntValue >= 56000) {
            aA(61, "draft_id");
            bquuVarC.r(this.am);
        }
        if (iIntValue >= 58040) {
            aA(62, "result_code");
            bquuVarC.ad(this.an);
        }
        if (iIntValue >= 58210) {
            aA(63, "cms_life_cycle");
            bquuVarC.l(this.ao);
        }
        if (iIntValue >= 60750) {
            aA(64, "mute_priority");
            bquuVarC.F(this.ap);
        }
        if (iIntValue >= 58710) {
            aA(65, "fallback_reason");
            bquuVarC.t(this.aq);
        }
        if (iIntValue >= 58230) {
            aA(66, "auto_retry_counter");
            bquuVarC.e(this.ar);
        }
        if (iIntValue >= 58280) {
            aA(67, "can_revoke_before_delivered_with_rcs");
            bquuVarC.g(this.as);
        }
        if (iIntValue >= 58680) {
            aA(68, "trace_id");
            bquuVarC.ar(this.at);
        }
        if (iIntValue >= 58720) {
            aA(69, "outgoing_delivery_report_status");
            bquuVarC.M(this.au);
        }
        if (iIntValue >= 58720) {
            aA(70, "outgoing_read_report_status");
            bquuVarC.N(this.av);
        }
        if (iIntValue >= 59310) {
            aA(71, "xms_transport");
            bquuVarC.av(this.aw);
        }
        if (iIntValue >= 59430) {
            aA(72, "message_original_protocol");
            bquuVarC.K(this.ax);
        }
        if (iIntValue >= 59490) {
            aA(73, "satellite_datagram_id");
            bquuVarC.af(this.ay);
        }
        if (iIntValue >= 60190) {
            aA(74, "encryption_protocol");
            bquuVarC.s(this.az);
        }
        if (iIntValue >= 60370) {
            aA(75, "message_persistence_id");
            bquuVarC.x(this.aA);
        }
        this.a = bquuVarC.a();
        ArrayList arrayList = new ArrayList();
        int length = h() == null ? 0 : h().length;
        new HashSet();
        for (int i = 0; i < length; i++) {
            bscl bsclVarB = PartsTable.b();
            bsclVarB.B(h()[i]);
            aA(77, "message_id");
            bsclVarB.J(this.aC);
            aA(78, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            bsclVarB.Z(this.aD[i]);
            if (iIntValue >= 60990) {
                aA(79, "raw_text");
                bsclVarB.S(this.aE);
            }
            aA(80, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            bsclVarB.ab(this.aF[i]);
            aA(81, "content_type");
            bsclVarB.t(this.aG[i]);
            if (iIntValue >= 10021) {
                aA(82, "original_uri");
                bsclVarB.L(this.aH[i]);
            }
            if (iIntValue >= 29060) {
                aA(83, "storage_uri");
                bsclVarB.X(this.aI[i]);
            }
            aA(84, "width");
            bsclVarB.ae(this.aJ[i]);
            aA(85, "height");
            bsclVarB.A(this.aK[i]);
            if (iIntValue >= 3010) {
                aA(86, "timestamp");
                bsclVarB.aa(this.aL);
            }
            if (iIntValue >= 4020) {
                aA(87, "output_uri");
                bsclVarB.Q(this.aM);
            }
            if (iIntValue >= 4020) {
                aA(88, "target_size");
                bsclVarB.Y(this.aN[i]);
            }
            if (iIntValue >= 4020) {
                aA(89, "processing_status");
                bsclVarB.R(this.aO);
            }
            if (iIntValue >= 44010) {
                aA(90, "cms_attachment_processing_status");
                bsclVarB.k(this.aP[i]);
            }
            aA(91, "conversation_id");
            bsclVarB.u(this.aQ);
            if (iIntValue >= 5020) {
                aA(92, "sticker_set_id");
                bsclVarB.W(this.aR);
            }
            if (iIntValue >= 5020) {
                aA(93, "sticker_id");
                bsclVarB.V(this.aS);
            }
            if (iIntValue >= 7000) {
                aA(94, "media_modified_timestamp");
                bsclVarB.H(this.aT);
            }
            if (iIntValue >= 10005) {
                aA(95, "longitude");
                bsclVarB.F(this.aU);
            }
            if (iIntValue >= 10005) {
                aA(96, "latitude");
                bsclVarB.D(this.aV);
            }
            if (iIntValue >= 10017) {
                aA(97, "preview_content_uri");
                bsclVarB.O(this.aW[i]);
            }
            if (iIntValue >= 10017) {
                aA(98, "preview_content_type");
                bsclVarB.N(this.aX);
            }
            if (iIntValue >= 13000) {
                aA(99, "fallback_uri");
                bsclVarB.x(this.aY[i]);
            }
            if (iIntValue >= 14010) {
                aA(100, "source");
                bsclVarB.U(this.aZ[i]);
            }
            if (iIntValue >= 17010) {
                aA(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "bundle_index");
                bsclVarB.j(this.ba[i]);
            }
            if (iIntValue >= 17020) {
                aA(102, "blob_id");
                bsclVarB.g(this.bb[i]);
            }
            if (iIntValue >= 59570) {
                aA(103, "blob_gaia_email");
                bsclVarB.f(this.bc);
            }
            if (iIntValue >= 40040) {
                aA(104, "cms_full_size_blob_id");
                bsclVarB.n(this.bd);
            }
            if (iIntValue >= 42010) {
                aA(105, "cms_media_encryption_key");
                bsclVarB.o(this.be);
            }
            if (iIntValue >= 42070) {
                aA(106, "cms_compressed_media_encryption_key");
                bsclVarB.m(this.bf);
            }
            if (iIntValue >= 18000) {
                aA(107, "blob_upload_permanent_failure");
                bsclVarB.h(this.bg[i]);
            }
            if (iIntValue >= 19030) {
                aA(108, "blob_upload_timestamp");
                bsclVarB.i(this.bh[i]);
            }
            if (iIntValue >= 22060) {
                aA(109, "expressive_sticker_name");
                bsclVarB.w(this.bi[i]);
            }
            if (iIntValue >= 26000) {
                aA(110, "file_name");
                bsclVarB.y(this.bj[i]);
            }
            if (iIntValue >= 26040) {
                aA(111, "duration");
                bsclVarB.v(this.bk[i]);
            }
            if (iIntValue >= 27000) {
                aA(112, "compressed_blob_id");
                bsclVarB.p(this.bl[i]);
            }
            if (iIntValue >= 40040) {
                aA(113, "cms_compressed_blob_id");
                bsclVarB.l(this.bm);
            }
            if (iIntValue >= 27000) {
                aA(114, "compressed_blob_upload_permanent_failure");
                bsclVarB.q(this.bn[i]);
            }
            if (iIntValue >= 27000) {
                aA(115, "compressed_blob_upload_timestamp");
                bsclVarB.r(this.bo[i]);
            }
            if (iIntValue >= 30040) {
                aA(116, "media_encryption_key");
                bsclVarB.G(this.bp[i]);
            }
            if (iIntValue >= 30040) {
                aA(117, "compressed_media_encryption_key");
                bsclVarB.s(this.bq[i]);
            }
            if (iIntValue >= 52030) {
                aA(118, "missing_entry_in_telephony");
                bsclVarB.K(this.br[i]);
            }
            if (iIntValue >= 53040) {
                aA(119, "awaiting_reverse_sync");
                bsclVarB.e(this.bs);
            }
            if (iIntValue >= 52050) {
                aA(120, "file_size_bytes");
                bsclVarB.z(this.bt);
            }
            if (iIntValue >= 52050) {
                aA(121, "local_cache_path");
                bsclVarB.E(this.bu);
            }
            if (iIntValue >= 58150) {
                aA(122, "media_send_type");
                bsclVarB.I(this.bv);
            }
            if (iIntValue >= 59470) {
                aA(123, "voice_metadata");
                bsclVarB.ad(this.bw);
            }
            if (iIntValue >= 58770) {
                aA(124, "validation_status");
                bsclVarB.ac(this.bx);
            }
            if (iIntValue >= 60080) {
                aA(125, "processing_id");
                bsclVarB.P(this.by);
            }
            if (iIntValue >= 60230) {
                aA(126, "rich_card_media_download_failure_reason");
                bsclVarB.T(this.bz);
            }
            if (iIntValue >= 60240) {
                aA(127, "image_display_state");
                bsclVarB.C(this.bA);
            }
            if (iIntValue >= 60680) {
                aA(128, "preserve_size");
                bsclVarB.M(this.bB);
            }
            arrayList.add(bsclVarB.a());
        }
        this.b = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[0]);
    }

    private final String[] h() {
        aA(76, "_id");
        return this.aB;
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf(this.f);
        String strValueOf4 = String.valueOf(this.g);
        String strValueOf5 = String.valueOf(this.h);
        String strValueOf6 = String.valueOf(this.i);
        String strValueOf7 = String.valueOf(this.j);
        String strValueOf8 = String.valueOf(this.k);
        String strValueOf9 = String.valueOf(this.l);
        String strValueOf10 = String.valueOf(this.m);
        String strValueOf11 = String.valueOf(this.n);
        String strValueOf12 = String.valueOf(this.o);
        String strValueOf13 = String.valueOf(this.p);
        String strValueOf14 = String.valueOf(this.q);
        String strValueOf15 = String.valueOf(this.r);
        String strValueOf16 = String.valueOf(this.s);
        String strValueOf17 = String.valueOf(this.t);
        String strValueOf18 = String.valueOf(this.u);
        String strValueOf19 = String.valueOf(this.v);
        String strValueOf20 = String.valueOf(this.w);
        String strValueOf21 = String.valueOf(this.x);
        String strValueOf22 = String.valueOf(this.y);
        String strValueOf23 = String.valueOf(this.z);
        String strValueOf24 = String.valueOf(this.A);
        String strValueOf25 = String.valueOf(this.B);
        String strValueOf26 = String.valueOf(this.C);
        String strValueOf27 = String.valueOf(this.D);
        String strValueOf28 = String.valueOf(this.E);
        String strValueOf29 = String.valueOf(this.F);
        String strValueOf30 = String.valueOf(this.G);
        String strValueOf31 = String.valueOf(this.H);
        String strValueOf32 = String.valueOf(this.I);
        String strValueOf33 = String.valueOf(this.J);
        String strValueOf34 = String.valueOf(this.K);
        String strValueOf35 = String.valueOf(this.L);
        String strValueOf36 = String.valueOf(this.M);
        String strValueOf37 = String.valueOf(this.N);
        String strValueOf38 = String.valueOf(this.O);
        String strValueOf39 = String.valueOf(this.P);
        String strValueOf40 = String.valueOf(this.Q);
        String strValueOf41 = String.valueOf(this.R);
        String strValueOf42 = String.valueOf(this.S);
        String strValueOf43 = String.valueOf(this.T);
        String strValueOf44 = String.valueOf(this.U);
        String strValueOf45 = String.valueOf(this.V);
        String strValueOf46 = String.valueOf(this.W);
        String strValueOf47 = String.valueOf(this.X);
        String strValueOf48 = String.valueOf(this.Y);
        String strValueOf49 = String.valueOf(this.Z);
        String strValueOf50 = String.valueOf(this.aa);
        String strValueOf51 = String.valueOf(this.ab);
        String strValueOf52 = String.valueOf(this.ac);
        byte[] bArr = this.ad;
        String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        String strValueOf53 = String.valueOf(this.ae);
        String strValueOf54 = String.valueOf(this.af);
        String strValueOf55 = String.valueOf(this.ag);
        String strValueOf56 = String.valueOf(this.ah);
        String strValueOf57 = String.valueOf(this.ai);
        String strValueOf58 = String.valueOf(this.aj);
        String strValueOf59 = String.valueOf(this.ak);
        String strValueOf60 = String.valueOf(this.al);
        String strValueOf61 = String.valueOf(this.am);
        String strValueOf62 = String.valueOf(this.an);
        String strValueOf63 = String.valueOf(this.ao);
        String strValueOf64 = String.valueOf(this.ap);
        String strValueOf65 = String.valueOf(this.aq);
        String strValueOf66 = String.valueOf(this.ar);
        String strValueOf67 = String.valueOf(this.as);
        String strValueOf68 = String.valueOf(this.at);
        String strValueOf69 = String.valueOf(this.au);
        String strValueOf70 = String.valueOf(this.av);
        String strValueOf71 = String.valueOf(this.aw);
        String strValueOf72 = String.valueOf(this.ax);
        String strValueOf73 = String.valueOf(this.ay);
        String strValueOf74 = String.valueOf(this.az);
        String strValueOf75 = String.valueOf(this.aA);
        String strAM = aM(this.aB);
        String strValueOf76 = String.valueOf(this.aC);
        String strAM2 = aM(this.aD);
        String strValueOf77 = String.valueOf(this.aE);
        String strAL = aL(this.aF);
        String strAM3 = aM(this.aG);
        String strAL2 = aL(this.aH);
        String strAL3 = aL(this.aI);
        String strAJ = aJ(this.aJ);
        String strAJ2 = aJ(this.aK);
        String strValueOf78 = String.valueOf(this.aL);
        String strValueOf79 = String.valueOf(this.aM);
        String strAK = aK(this.aN);
        String strValueOf80 = String.valueOf(this.aO);
        String strAL4 = aL(this.aP);
        String strValueOf81 = String.valueOf(this.aQ);
        String strValueOf82 = String.valueOf(this.aR);
        String strValueOf83 = String.valueOf(this.aS);
        String strValueOf84 = String.valueOf(this.aT);
        String strValueOf85 = String.valueOf(this.aU);
        String strValueOf86 = String.valueOf(this.aV);
        String strAL5 = aL(this.aW);
        String strValueOf87 = String.valueOf(this.aX);
        String strAL6 = aL(this.aY);
        String strAJ3 = aJ(this.aZ);
        String strAJ4 = aJ(this.ba);
        String strAM4 = aM(this.bb);
        String strValueOf88 = String.valueOf(this.bd);
        byte[] bArr2 = this.be;
        String strConcat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        byte[] bArr3 = this.bf;
        return String.format(locale, "ScheduledMessagesQuery [scheduled_send.scheduled_send__id: %s,\n  scheduled_send.scheduled_send_message_id: %s,\n  scheduled_send.scheduled_send_conversation_id: %s,\n  scheduled_send.scheduled_send_scheduled_time: %s,\n  scheduled_send.scheduled_send_status: %s,\n  scheduled_send.scheduled_send_creation_time: %s,\n  messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_raw_rcs_message_to_send: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_parent_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_raw_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s,\n  parts.parts_rowid: %s,\n  message_captions.message_captions_caption: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, strValueOf37, strValueOf38, strValueOf39, strValueOf40, strValueOf41, strValueOf42, strValueOf43, strValueOf44, strValueOf45, strValueOf46, strValueOf47, strValueOf48, strValueOf49, strValueOf50, strValueOf51, strValueOf52, strConcat, strValueOf53, strValueOf54, strValueOf55, strValueOf56, strValueOf57, strValueOf58, strValueOf59, strValueOf60, strValueOf61, strValueOf62, strValueOf63, strValueOf64, strValueOf65, strValueOf66, strValueOf67, strValueOf68, strValueOf69, strValueOf70, strValueOf71, strValueOf72, strValueOf73, strValueOf74, strValueOf75, strAM, strValueOf76, strAM2, strValueOf77, strAL, strAM3, strAL2, strAL3, strAJ, strAJ2, strValueOf78, strValueOf79, strAK, strValueOf80, strAL4, strValueOf81, strValueOf82, strValueOf83, strValueOf84, strValueOf85, strValueOf86, strAL5, strValueOf87, strAL6, strAJ3, strAJ4, strAM4, "REDACTED", strValueOf88, strConcat2, "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL")), aN(this.bg), aK(this.bh), aM(this.bi), aM(this.bj), aK(this.bk), aM(this.bl), String.valueOf(this.bm), aN(this.bn), aK(this.bo), aL(this.bp), aL(this.bq), aN(this.br), String.valueOf(this.bs), String.valueOf(this.bt), String.valueOf(this.bu), String.valueOf(this.bv), String.valueOf(this.bw), String.valueOf(this.bx), String.valueOf(this.by), String.valueOf(this.bz), String.valueOf(this.bA), String.valueOf(this.bB), aK(this.bC), String.valueOf(this.bD));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        cmas.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        dqbw dqbwVar;
        fhaz fhazVar;
        cjnm cjnmVar;
        cmal cmalVar = (cmal) ((cmak) dqqjVar);
        aC();
        this.cN = cmalVar.cV();
        if (cmalVar.dj(0)) {
            this.d = cmalVar.C();
            fN(0);
        }
        if (cmalVar.dj(1)) {
            this.e = new MessageIdType(cmalVar.getLong(cmalVar.cO(1, cmas.a)));
            fN(1);
        }
        if (cmalVar.dj(2)) {
            this.f = cmalVar.j();
            fN(2);
        }
        if (cmalVar.dj(3)) {
            this.g = bart.b(cmalVar.getLong(cmalVar.cO(3, cmas.a)));
            fN(3);
        }
        if (cmalVar.dj(4)) {
            cmct[] cmctVarArrValues = cmct.values();
            int i = cmalVar.getInt(cmalVar.cO(4, cmas.a));
            if (i >= cmctVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.h = cmctVarArrValues[i];
            fN(4);
        }
        if (cmalVar.dj(5)) {
            this.i = cmalVar.q();
            fN(5);
        }
        if (cmalVar.dj(6)) {
            this.j = cmalVar.k();
            fN(6);
        }
        if (cmalVar.dj(7)) {
            this.k = cmalVar.h();
            fN(7);
        }
        if (cmalVar.dj(8)) {
            this.l = cmalVar.getString(cmalVar.cO(8, cmas.a));
            fN(8);
        }
        if (cmalVar.dj(9)) {
            this.m = cmalVar.getString(cmalVar.cO(9, cmas.a));
            fN(9);
        }
        if (cmalVar.dj(10)) {
            this.n = cmalVar.getString(cmalVar.cO(10, cmas.a));
            fN(10);
        }
        if (cmalVar.dj(11)) {
            this.o = cmalVar.getString(cmalVar.cO(11, cmas.a));
            fN(11);
        }
        if (cmalVar.dj(12)) {
            this.p = cmalVar.getLong(cmalVar.cO(12, cmas.a));
            fN(12);
        }
        if (cmalVar.dj(13)) {
            this.q = bart.b(cmalVar.getLong(cmalVar.cO(13, cmas.a)));
            fN(13);
        }
        if (cmalVar.dj(14)) {
            this.r = cmalVar.getLong(cmalVar.cO(14, cmas.a));
            fN(14);
        }
        if (cmalVar.dj(15)) {
            this.s = cmalVar.getInt(cmalVar.cO(15, cmas.a));
            fN(15);
        }
        if (cmalVar.dj(16)) {
            this.t = cmalVar.getInt(cmalVar.cO(16, cmas.a));
            fN(16);
        }
        if (cmalVar.dj(17)) {
            this.u = cmalVar.getInt(cmalVar.cO(17, cmas.a));
            fN(17);
        }
        if (cmalVar.dj(18)) {
            this.v = cmalVar.getInt(cmalVar.cO(18, cmas.a)) == 1;
            fN(18);
        }
        if (cmalVar.dj(19)) {
            this.w = cmalVar.getInt(cmalVar.cO(19, cmas.a)) == 1;
            fN(19);
        }
        if (cmalVar.dj(20)) {
            String string = cmalVar.getString(cmalVar.cO(20, cmas.a));
            this.x = string == null ? null : Uri.parse(string);
            fN(20);
        }
        if (cmalVar.dj(21)) {
            this.y = cmalVar.getInt(cmalVar.cO(21, cmas.a));
            fN(21);
        }
        if (cmalVar.dj(22)) {
            this.z = cmalVar.getLong(cmalVar.cO(22, cmas.a));
            fN(22);
        }
        if (cmalVar.dj(23)) {
            this.A = cssq.a(cmalVar.getString(cmalVar.cO(23, cmas.a)));
            fN(23);
        }
        if (cmalVar.dj(24)) {
            this.B = cmalVar.getString(cmalVar.cO(24, cmas.a));
            fN(24);
        }
        if (cmalVar.dj(25)) {
            this.C = cmalVar.getString(cmalVar.cO(25, cmas.a));
            fN(25);
        }
        if (cmalVar.dj(26)) {
            this.D = cmalVar.getLong(cmalVar.cO(26, cmas.a));
            fN(26);
        }
        if (cmalVar.dj(27)) {
            this.E = cmalVar.getLong(cmalVar.cO(27, cmas.a));
            fN(27);
        }
        if (cmalVar.dj(28)) {
            this.F = cmalVar.getString(cmalVar.cO(28, cmas.a));
            fN(28);
        }
        if (cmalVar.dj(29)) {
            this.G = cmalVar.getInt(cmalVar.cO(29, cmas.a));
            fN(29);
        }
        if (cmalVar.dj(30)) {
            this.H = cmalVar.getString(cmalVar.cO(30, cmas.a));
            fN(30);
        }
        if (cmalVar.dj(31)) {
            this.I = axcn.a(cmalVar.getString(cmalVar.cO(31, cmas.a)));
            fN(31);
        }
        if (cmalVar.dj(32)) {
            this.J = cmalVar.getLong(cmalVar.cO(32, cmas.a));
            fN(32);
        }
        if (cmalVar.dj(33)) {
            this.K = cmalVar.u();
            fN(33);
        }
        if (cmalVar.dj(34)) {
            this.L = basd.a(cmalVar.getString(cmalVar.cO(34, cmas.a)));
            fN(34);
        }
        if (cmalVar.dj(35)) {
            this.M = cmalVar.getInt(cmalVar.cO(35, cmas.a));
            fN(35);
        }
        if (cmalVar.dj(36)) {
            bvdz[] bvdzVarArrValues = bvdz.values();
            int i2 = cmalVar.getInt(cmalVar.cO(36, cmas.a));
            if (i2 >= bvdzVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.N = bvdzVarArrValues[i2];
            fN(36);
        }
        if (cmalVar.dj(37)) {
            this.O = cmalVar.getInt(cmalVar.cO(37, cmas.a));
            fN(37);
        }
        if (cmalVar.dj(38)) {
            this.P = cmalVar.H();
            fN(38);
        }
        if (cmalVar.dj(39)) {
            this.Q = cmalVar.getString(cmalVar.cO(39, cmas.a));
            fN(39);
        }
        if (cmalVar.dj(40)) {
            this.R = cmalVar.getLong(cmalVar.cO(40, cmas.a));
            fN(40);
        }
        if (cmalVar.dj(41)) {
            this.S = cmalVar.getInt(cmalVar.cO(41, cmas.a));
            fN(41);
        }
        if (cmalVar.dj(42)) {
            this.T = cmalVar.getString(cmalVar.cO(42, cmas.a));
            fN(42);
        }
        if (cmalVar.dj(43)) {
            this.U = cmalVar.z();
            fN(43);
        }
        if (cmalVar.dj(44)) {
            this.V = cmalVar.y();
            fN(44);
        }
        if (cmalVar.dj(45)) {
            this.W = cmalVar.f();
            fN(45);
        }
        if (cmalVar.dj(46)) {
            this.X = cmalVar.getString(cmalVar.cO(46, cmas.a));
            fN(46);
        }
        if (cmalVar.dj(47)) {
            this.Y = cmalVar.getLong(cmalVar.cO(47, cmas.a));
            fN(47);
        }
        if (cmalVar.dj(48)) {
            this.Z = cmalVar.getLong(cmalVar.cO(48, cmas.a));
            fN(48);
        }
        if (cmalVar.dj(49)) {
            this.aa = basd.a(cmalVar.getString(cmalVar.cO(49, cmas.a)));
            fN(49);
        }
        if (cmalVar.dj(50)) {
            byte[] blob = cmalVar.getBlob(cmalVar.cO(50, cmas.a));
            if (blob == null) {
                cjnmVar = null;
            } else {
                try {
                    cjnmVar = (cjnm) evsn.parseFrom(cjnm.a, blob, evrr.a());
                } catch (Throwable unused) {
                    cjnmVar = cjnm.a;
                }
            }
            this.ab = cjnmVar;
            fN(50);
        }
        if (cmalVar.dj(51)) {
            this.ac = cmalVar.A();
            fN(51);
        }
        if (cmalVar.dj(52)) {
            this.ad = cmalVar.K();
            fN(52);
        }
        if (cmalVar.dj(53)) {
            this.ae = cmalVar.getLong(cmalVar.cO(53, cmas.a));
            fN(53);
        }
        if (cmalVar.dj(54)) {
            this.af = cmalVar.p();
            fN(54);
        }
        if (cmalVar.dj(55)) {
            this.ag = cmalVar.w();
            fN(55);
        }
        if (cmalVar.dj(56)) {
            this.ah = cmalVar.B();
            fN(56);
        }
        if (cmalVar.dj(57)) {
            this.ai = new MessageIdType(cmalVar.getLong(cmalVar.cO(57, cmas.a)));
            fN(57);
        }
        if (cmalVar.dj(58)) {
            this.aj = new MessageIdType(cmalVar.getLong(cmalVar.cO(58, cmas.a)));
            fN(58);
        }
        if (cmalVar.dj(59)) {
            this.ak = cmalVar.E();
            fN(59);
        }
        if (cmalVar.dj(60)) {
            String string2 = cmalVar.getString(cmalVar.cO(60, cmas.a));
            this.al = string2 == null ? null : Uri.parse(string2);
            fN(60);
        }
        if (cmalVar.dj(61)) {
            this.am = cmalVar.r();
            fN(61);
        }
        if (cmalVar.dj(62)) {
            this.an = cmalVar.getInt(cmalVar.cO(62, cmas.a));
            fN(62);
        }
        if (cmalVar.dj(63)) {
            this.ao = cmalVar.o();
            fN(63);
        }
        if (cmalVar.dj(64)) {
            cgrd[] cgrdVarArrValues = cgrd.values();
            int i3 = cmalVar.getInt(cmalVar.cO(64, cmas.a));
            if (i3 >= cgrdVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.ap = cgrdVarArrValues[i3];
            fN(64);
        }
        if (cmalVar.dj(65)) {
            this.aq = cmalVar.l();
            fN(65);
        }
        if (cmalVar.dj(66)) {
            this.ar = cmalVar.e();
            fN(66);
        }
        if (cmalVar.dj(67)) {
            this.as = cmalVar.G();
            fN(67);
        }
        if (cmalVar.dj(68)) {
            byte[] blob2 = cmalVar.getBlob(cmalVar.cO(68, cmas.a));
            if (blob2 == null) {
                fhazVar = null;
            } else {
                try {
                    fhazVar = (fhaz) evsn.parseFrom(fhaz.a, blob2, evrr.a());
                } catch (Throwable unused2) {
                    fhazVar = fhaz.a;
                }
            }
            this.at = fhazVar;
            fN(68);
        }
        if (cmalVar.dj(69)) {
            bvdx[] bvdxVarArrValues = bvdx.values();
            int i4 = cmalVar.getInt(cmalVar.cO(69, cmas.a));
            if (i4 >= bvdxVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.au = bvdxVarArrValues[i4];
            fN(69);
        }
        if (cmalVar.dj(70)) {
            bvdx[] bvdxVarArrValues2 = bvdx.values();
            int i5 = cmalVar.getInt(cmalVar.cO(70, cmas.a));
            if (i5 >= bvdxVarArrValues2.length) {
                throw new IllegalArgumentException();
            }
            this.av = bvdxVarArrValues2[i5];
            fN(70);
        }
        if (cmalVar.dj(71)) {
            bvec[] bvecVarArrValues = bvec.values();
            int i6 = cmalVar.getInt(cmalVar.cO(71, cmas.a));
            if (i6 >= bvecVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aw = bvecVarArrValues[i6];
            fN(71);
        }
        if (cmalVar.dj(72)) {
            this.ax = cmalVar.getInt(cmalVar.cO(72, cmas.a));
            fN(72);
        }
        if (cmalVar.dj(73)) {
            this.ay = new baro(cmalVar.getString(cmalVar.cO(73, cmas.a)));
            fN(73);
        }
        if (cmalVar.dj(74)) {
            this.az = cmalVar.n();
            fN(74);
        }
        if (cmalVar.dj(75)) {
            this.aA = basg.a(cmalVar.getString(cmalVar.cO(75, cmas.a)));
            fN(75);
        }
        if (cmalVar.dj(76)) {
            this.aB = cmalVar.X();
            fN(76);
        }
        if (cmalVar.dj(77)) {
            this.aC = new MessageIdType(cmalVar.getLong(cmalVar.cO(77, cmas.a)));
            fN(77);
        }
        if (cmalVar.dj(78)) {
            String[] strArrDu = cmal.du(cmalVar.getString(cmalVar.cO(78, cmas.a)));
            for (int i7 = 0; i7 < strArrDu.length; i7++) {
                strArrDu[i7] = cssq.a(strArrDu[i7]);
            }
            this.aD = (String[]) dqru.D(null, strArrDu, new String[0]);
            fN(78);
        }
        if (cmalVar.dj(79)) {
            this.aE = cmalVar.getString(cmalVar.cO(79, cmas.a));
            fN(79);
        }
        if (cmalVar.dj(80)) {
            String[] strArrDu2 = cmal.du(cmalVar.getString(cmalVar.cO(80, cmas.a)));
            int length = strArrDu2.length;
            Uri[] uriArr = new Uri[length];
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                String str = strArrDu2[i8];
                int i10 = i9 + 1;
                uriArr[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i8++;
                i9 = i10;
            }
            this.aF = (Uri[]) dqru.D(null, uriArr, new Uri[0]);
            fN(80);
        }
        if (cmalVar.dj(81)) {
            this.aG = cmalVar.U();
            fN(81);
        }
        if (cmalVar.dj(82)) {
            String[] strArrDu3 = cmal.du(cmalVar.getString(cmalVar.cO(82, cmas.a)));
            int length2 = strArrDu3.length;
            Uri[] uriArr2 = new Uri[length2];
            int i11 = 0;
            int i12 = 0;
            while (i11 < length2) {
                String str2 = strArrDu3[i11];
                int i13 = i12 + 1;
                uriArr2[i12] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                i11++;
                i12 = i13;
            }
            this.aH = (Uri[]) dqru.D(null, uriArr2, new Uri[0]);
            fN(82);
        }
        if (cmalVar.dj(83)) {
            String[] strArrDu4 = cmal.du(cmalVar.getString(cmalVar.cO(83, cmas.a)));
            int length3 = strArrDu4.length;
            Uri[] uriArr3 = new Uri[length3];
            int i14 = 0;
            int i15 = 0;
            while (i14 < length3) {
                String str3 = strArrDu4[i14];
                int i16 = i15 + 1;
                uriArr3[i15] = (str3 == null || str3.length() == 0) ? null : Uri.parse(str3);
                i14++;
                i15 = i16;
            }
            this.aI = (Uri[]) dqru.D(null, uriArr3, new Uri[0]);
            fN(83);
        }
        if (cmalVar.dj(84)) {
            this.aJ = dqru.A(null, cmal.ds(cmalVar.getString(cmalVar.cO(84, cmas.a))));
            fN(84);
        }
        if (cmalVar.dj(85)) {
            this.aK = cmalVar.M();
            fN(85);
        }
        if (cmalVar.dj(86)) {
            this.aL = cmalVar.getLong(cmalVar.cO(86, cmas.a));
            fN(86);
        }
        if (cmalVar.dj(87)) {
            String string3 = cmalVar.getString(cmalVar.cO(87, cmas.a));
            this.aM = string3 == null ? null : Uri.parse(string3);
            fN(87);
        }
        if (cmalVar.dj(88)) {
            this.aN = dqru.C(null, cmal.dt(cmalVar.getString(cmalVar.cO(88, cmas.a))));
            fN(88);
        }
        if (cmalVar.dj(89)) {
            bvdt[] bvdtVarArrValues = bvdt.values();
            int i17 = cmalVar.getInt(cmalVar.cO(89, cmas.a));
            if (i17 >= bvdtVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.aO = bvdtVarArrValues[i17];
            fN(89);
        }
        if (cmalVar.dj(90)) {
            this.aP = cmalVar.R();
            fN(90);
        }
        if (cmalVar.dj(91)) {
            this.aQ = cmalVar.i();
            fN(91);
        }
        if (cmalVar.dj(92)) {
            this.aR = bvdf.a(cmalVar.getString(cmalVar.cO(92, cmas.a)));
            fN(92);
        }
        if (cmalVar.dj(93)) {
            this.aS = bvdf.a(cmalVar.getString(cmalVar.cO(93, cmas.a)));
            fN(93);
        }
        if (cmalVar.dj(94)) {
            this.aT = cmalVar.getLong(cmalVar.cO(94, cmas.a));
            fN(94);
        }
        if (cmalVar.dj(95)) {
            this.aU = cmalVar.getDouble(cmalVar.cO(95, cmas.a));
            fN(95);
        }
        if (cmalVar.dj(96)) {
            this.aV = cmalVar.c();
            fN(96);
        }
        if (cmalVar.dj(97)) {
            String[] strArrDu5 = cmal.du(cmalVar.getString(cmalVar.cO(97, cmas.a)));
            int length4 = strArrDu5.length;
            Uri[] uriArr4 = new Uri[length4];
            int i18 = 0;
            int i19 = 0;
            while (i18 < length4) {
                String str4 = strArrDu5[i18];
                int i20 = i19 + 1;
                uriArr4[i19] = (str4 == null || str4.length() == 0) ? null : Uri.parse(str4);
                i18++;
                i19 = i20;
            }
            this.aW = (Uri[]) dqru.D(null, uriArr4, new Uri[0]);
            fN(97);
        }
        if (cmalVar.dj(98)) {
            this.aX = cmalVar.getString(cmalVar.cO(98, cmas.a));
            fN(98);
        }
        if (cmalVar.dj(99)) {
            this.aY = cmalVar.Q();
            fN(99);
        }
        if (cmalVar.dj(100)) {
            this.aZ = dqru.A(null, cmal.ds(cmalVar.getString(cmalVar.cO(100, cmas.a))));
            fN(100);
        }
        if (cmalVar.dj(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.ba = cmalVar.L();
            fN(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (cmalVar.dj(102)) {
            this.bb = cmalVar.S();
            fN(102);
        }
        if (cmalVar.dj(103)) {
            this.bc = cmalVar.s();
            fN(103);
        }
        if (cmalVar.dj(104)) {
            this.bd = cmalVar.x();
            fN(104);
        }
        if (cmalVar.dj(105)) {
            this.be = cmalVar.J();
            fN(105);
        }
        if (cmalVar.dj(106)) {
            this.bf = cmalVar.I();
            fN(106);
        }
        if (cmalVar.dj(107)) {
            this.bg = cmalVar.Y();
            fN(107);
        }
        if (cmalVar.dj(108)) {
            this.bh = cmalVar.N();
            fN(108);
        }
        if (cmalVar.dj(109)) {
            this.bi = cmalVar.V();
            fN(109);
        }
        if (cmalVar.dj(110)) {
            this.bj = cmalVar.W();
            fN(110);
        }
        if (cmalVar.dj(111)) {
            this.bk = cmalVar.P();
            fN(111);
        }
        if (cmalVar.dj(112)) {
            this.bl = cmalVar.T();
            fN(112);
        }
        if (cmalVar.dj(113)) {
            this.bm = cmalVar.v();
            fN(113);
        }
        if (cmalVar.dj(114)) {
            this.bn = cmalVar.Z();
            fN(114);
        }
        if (cmalVar.dj(115)) {
            this.bo = cmalVar.O();
            fN(115);
        }
        if (cmalVar.dj(116)) {
            this.bp = dqru.F(null, cmal.dD(cmalVar.getString(cmalVar.cO(116, cmas.a))));
            fN(116);
        }
        if (cmalVar.dj(117)) {
            this.bq = cmalVar.aa();
            fN(117);
        }
        if (cmalVar.dj(118)) {
            this.br = dqru.E(null, cmal.dv(cmalVar.getString(cmalVar.cO(118, cmas.a))));
            fN(118);
        }
        if (cmalVar.dj(119)) {
            this.bs = cmalVar.F();
            fN(119);
        }
        if (cmalVar.dj(120)) {
            this.bt = cmalVar.g();
            fN(120);
        }
        if (cmalVar.dj(121)) {
            this.bu = cmalVar.D();
            fN(121);
        }
        if (cmalVar.dj(122)) {
            bvdr[] bvdrVarArrValues = bvdr.values();
            int i21 = cmalVar.getInt(cmalVar.cO(122, cmas.a));
            if (i21 >= bvdrVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.bv = bvdrVarArrValues[i21];
            fN(122);
        }
        if (cmalVar.dj(123)) {
            byte[] blob3 = cmalVar.getBlob(cmalVar.cO(123, cmas.a));
            if (blob3 == null) {
                dqbwVar = null;
            } else {
                try {
                    dqbwVar = (dqbw) evsn.parseFrom(dqbw.a, blob3, evrr.a());
                } catch (Throwable unused3) {
                    dqbwVar = dqbw.a;
                }
            }
            this.bw = dqbwVar;
            fN(123);
        }
        if (cmalVar.dj(124)) {
            bvef[] bvefVarArrValues = bvef.values();
            int i22 = cmalVar.getInt(cmalVar.cO(124, cmas.a));
            if (i22 >= bvefVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.bx = bvefVarArrValues[i22];
            fN(124);
        }
        if (cmalVar.dj(125)) {
            this.by = athg.a(cmalVar.getString(cmalVar.cO(125, cmas.a)));
            fN(125);
        }
        if (cmalVar.dj(126)) {
            bvdy[] bvdyVarArrValues = bvdy.values();
            int i23 = cmalVar.getInt(cmalVar.cO(126, cmas.a));
            if (i23 >= bvdyVarArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.bz = bvdyVarArrValues[i23];
            fN(126);
        }
        if (cmalVar.dj(127)) {
            this.bA = cmalVar.m();
            fN(127);
        }
        if (cmalVar.dj(128)) {
            this.bB = cmalVar.getInt(cmalVar.cO(128, cmas.a)) == 1;
            fN(128);
        }
        if (cmalVar.dj(129)) {
            this.bC = dqru.C(null, cmal.dt(cmalVar.getString(cmalVar.cO(129, cmas.a))));
            fN(129);
        }
        if (cmalVar.dj(130)) {
            this.bD = cmalVar.t();
            fN(130);
        }
        g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof clpq)) {
            return false;
        }
        clpq clpqVar = (clpq) obj;
        return super.aE(clpqVar.cN) && Objects.equals(this.d, clpqVar.d) && Objects.equals(this.e, clpqVar.e) && Objects.equals(this.f, clpqVar.f) && Objects.equals(this.g, clpqVar.g) && this.h == clpqVar.h && Objects.equals(this.i, clpqVar.i) && Objects.equals(this.j, clpqVar.j) && Objects.equals(this.k, clpqVar.k) && Objects.equals(this.l, clpqVar.l) && Objects.equals(this.m, clpqVar.m) && Objects.equals(this.n, clpqVar.n) && Objects.equals(this.o, clpqVar.o) && this.p == clpqVar.p && Objects.equals(this.q, clpqVar.q) && this.r == clpqVar.r && this.s == clpqVar.s && this.t == clpqVar.t && this.u == clpqVar.u && this.v == clpqVar.v && this.w == clpqVar.w && Objects.equals(this.x, clpqVar.x) && this.y == clpqVar.y && this.z == clpqVar.z && Objects.equals(this.A, clpqVar.A) && Objects.equals(this.B, clpqVar.B) && Objects.equals(this.C, clpqVar.C) && this.D == clpqVar.D && this.E == clpqVar.E && Objects.equals(this.F, clpqVar.F) && this.G == clpqVar.G && Objects.equals(this.H, clpqVar.H) && Objects.equals(this.I, clpqVar.I) && this.J == clpqVar.J && Objects.equals(this.K, clpqVar.K) && Objects.equals(this.L, clpqVar.L) && this.M == clpqVar.M && this.N == clpqVar.N && this.O == clpqVar.O && this.P == clpqVar.P && Objects.equals(this.Q, clpqVar.Q) && this.R == clpqVar.R && this.S == clpqVar.S && Objects.equals(this.T, clpqVar.T) && Objects.equals(this.U, clpqVar.U) && Objects.equals(this.V, clpqVar.V) && this.W == clpqVar.W && Objects.equals(this.X, clpqVar.X) && this.Y == clpqVar.Y && this.Z == clpqVar.Z && Objects.equals(this.aa, clpqVar.aa) && Objects.equals(this.ab, clpqVar.ab) && Objects.equals(this.ac, clpqVar.ac) && Arrays.equals(this.ad, clpqVar.ad) && this.ae == clpqVar.ae && Objects.equals(this.af, clpqVar.af) && Objects.equals(this.ag, clpqVar.ag) && Objects.equals(this.ah, clpqVar.ah) && Objects.equals(this.ai, clpqVar.ai) && Objects.equals(this.aj, clpqVar.aj) && this.ak == clpqVar.ak && Objects.equals(this.al, clpqVar.al) && Objects.equals(this.am, clpqVar.am) && this.an == clpqVar.an && this.ao == clpqVar.ao && this.ap == clpqVar.ap && this.aq == clpqVar.aq && this.ar == clpqVar.ar && this.as == clpqVar.as && Objects.equals(this.at, clpqVar.at) && this.au == clpqVar.au && this.av == clpqVar.av && this.aw == clpqVar.aw && this.ax == clpqVar.ax && Objects.equals(this.ay, clpqVar.ay) && Objects.equals(this.az, clpqVar.az) && Objects.equals(this.aA, clpqVar.aA) && Arrays.equals(this.aB, clpqVar.aB) && Objects.equals(this.aC, clpqVar.aC) && Arrays.equals(this.aD, clpqVar.aD) && Objects.equals(this.aE, clpqVar.aE) && Arrays.equals(this.aF, clpqVar.aF) && Arrays.equals(this.aG, clpqVar.aG) && Arrays.equals(this.aH, clpqVar.aH) && Arrays.equals(this.aI, clpqVar.aI) && Arrays.equals(this.aJ, clpqVar.aJ) && Arrays.equals(this.aK, clpqVar.aK) && this.aL == clpqVar.aL && Objects.equals(this.aM, clpqVar.aM) && Arrays.equals(this.aN, clpqVar.aN) && this.aO == clpqVar.aO && Arrays.equals(this.aP, clpqVar.aP) && Objects.equals(this.aQ, clpqVar.aQ) && Objects.equals(this.aR, clpqVar.aR) && Objects.equals(this.aS, clpqVar.aS) && this.aT == clpqVar.aT && this.aU == clpqVar.aU && this.aV == clpqVar.aV && Arrays.equals(this.aW, clpqVar.aW) && Objects.equals(this.aX, clpqVar.aX) && Arrays.equals(this.aY, clpqVar.aY) && Arrays.equals(this.aZ, clpqVar.aZ) && Arrays.equals(this.ba, clpqVar.ba) && Arrays.equals(this.bb, clpqVar.bb) && Objects.equals(this.bc, clpqVar.bc) && Objects.equals(this.bd, clpqVar.bd) && Arrays.equals(this.be, clpqVar.be) && Arrays.equals(this.bf, clpqVar.bf) && Arrays.equals(this.bg, clpqVar.bg) && Arrays.equals(this.bh, clpqVar.bh) && Arrays.equals(this.bi, clpqVar.bi) && Arrays.equals(this.bj, clpqVar.bj) && Arrays.equals(this.bk, clpqVar.bk) && Arrays.equals(this.bl, clpqVar.bl) && Objects.equals(this.bm, clpqVar.bm) && Arrays.equals(this.bn, clpqVar.bn) && Arrays.equals(this.bo, clpqVar.bo) && Arrays.deepEquals(this.bp, clpqVar.bp) && Arrays.deepEquals(this.bq, clpqVar.bq) && Arrays.equals(this.br, clpqVar.br) && this.bs == clpqVar.bs && this.bt == clpqVar.bt && Objects.equals(this.bu, clpqVar.bu) && this.bv == clpqVar.bv && Objects.equals(this.bw, clpqVar.bw) && this.bx == clpqVar.bx && Objects.equals(this.by, clpqVar.by) && this.bz == clpqVar.bz && this.bA == clpqVar.bA && this.bB == clpqVar.bB && Arrays.equals(this.bC, clpqVar.bC) && Objects.equals(this.bD, clpqVar.bD);
    }

    public final String f() {
        aA(130, "caption");
        return this.bD;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.d;
        MessageIdType messageIdType = this.e;
        ConversationIdType conversationIdType = this.f;
        Instant instant = this.g;
        cmct cmctVar = this.h;
        Integer numValueOf = Integer.valueOf(cmctVar == null ? 0 : cmctVar.ordinal());
        Instant instant2 = this.i;
        MessageIdType messageIdType2 = this.j;
        ConversationIdType conversationIdType2 = this.k;
        String str2 = this.l;
        String str3 = this.m;
        String str4 = this.n;
        String str5 = this.o;
        Long lValueOf = Long.valueOf(this.p);
        Instant instant3 = this.q;
        Long lValueOf2 = Long.valueOf(this.r);
        Integer numValueOf2 = Integer.valueOf(this.s);
        dqqe dqqeVar3 = dqqeVar2;
        Integer numValueOf3 = Integer.valueOf(this.t);
        Integer numValueOf4 = Integer.valueOf(this.u);
        Boolean boolValueOf = Boolean.valueOf(this.v);
        Boolean boolValueOf2 = Boolean.valueOf(this.w);
        Uri uri = this.x;
        Integer numValueOf5 = Integer.valueOf(this.y);
        Long lValueOf3 = Long.valueOf(this.z);
        String str6 = this.A;
        String str7 = this.B;
        String str8 = this.C;
        Long lValueOf4 = Long.valueOf(this.D);
        Long lValueOf5 = Long.valueOf(this.E);
        String str9 = this.F;
        Integer numValueOf6 = Integer.valueOf(this.G);
        String str10 = this.H;
        axcm axcmVar = this.I;
        Long lValueOf6 = Long.valueOf(this.J);
        String str11 = this.K;
        basd basdVar = this.L;
        Integer numValueOf7 = Integer.valueOf(this.M);
        bvdz bvdzVar = this.N;
        Integer numValueOf8 = Integer.valueOf(bvdzVar == null ? 0 : bvdzVar.ordinal());
        Integer numValueOf9 = Integer.valueOf(this.O);
        Boolean boolValueOf3 = Boolean.valueOf(this.P);
        String str12 = this.Q;
        Long lValueOf7 = Long.valueOf(this.R);
        Integer numValueOf10 = Integer.valueOf(this.S);
        String str13 = this.T;
        String str14 = this.U;
        String str15 = this.V;
        Long lValueOf8 = Long.valueOf(this.W);
        String str16 = this.X;
        Long lValueOf9 = Long.valueOf(this.Y);
        Long lValueOf10 = Long.valueOf(this.Z);
        basd basdVar2 = this.aa;
        cjnm cjnmVar = this.ab;
        String str17 = this.ac;
        Integer numValueOf11 = Integer.valueOf(Arrays.hashCode(this.ad));
        Long lValueOf11 = Long.valueOf(this.ae);
        eyga eygaVar = this.af;
        String str18 = this.ag;
        String str19 = this.ah;
        MessageIdType messageIdType3 = this.ai;
        MessageIdType messageIdType4 = this.aj;
        Boolean boolValueOf4 = Boolean.valueOf(this.ak);
        Uri uri2 = this.al;
        Optional optional = this.am;
        Integer numValueOf12 = Integer.valueOf(this.an);
        cpyi cpyiVar = this.ao;
        Integer numValueOf13 = Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal());
        cgrd cgrdVar = this.ap;
        Integer numValueOf14 = Integer.valueOf(cgrdVar == null ? 0 : cgrdVar.ordinal());
        bvdn bvdnVar = this.aq;
        Integer numValueOf15 = Integer.valueOf(bvdnVar == null ? 0 : bvdnVar.ordinal());
        Integer numValueOf16 = Integer.valueOf(this.ar);
        Boolean boolValueOf5 = Boolean.valueOf(this.as);
        fhaz fhazVar = this.at;
        bvdx bvdxVar = this.au;
        Integer numValueOf17 = Integer.valueOf(bvdxVar == null ? 0 : bvdxVar.ordinal());
        bvdx bvdxVar2 = this.av;
        Integer numValueOf18 = Integer.valueOf(bvdxVar2 == null ? 0 : bvdxVar2.ordinal());
        bvec bvecVar = this.aw;
        Integer numValueOf19 = Integer.valueOf(bvecVar == null ? 0 : bvecVar.ordinal());
        Integer numValueOf20 = Integer.valueOf(this.ax);
        baro baroVar = this.ay;
        cbqz cbqzVar = this.az;
        Optional optional2 = this.aA;
        Integer numValueOf21 = Integer.valueOf(Arrays.hashCode(this.aB));
        MessageIdType messageIdType5 = this.aC;
        Integer numValueOf22 = Integer.valueOf(Arrays.hashCode(this.aD));
        String str20 = this.aE;
        Integer numValueOf23 = Integer.valueOf(Arrays.hashCode(this.aF));
        Integer numValueOf24 = Integer.valueOf(Arrays.hashCode(this.aG));
        Integer numValueOf25 = Integer.valueOf(Arrays.hashCode(this.aH));
        Integer numValueOf26 = Integer.valueOf(Arrays.hashCode(this.aI));
        Integer numValueOf27 = Integer.valueOf(Arrays.hashCode(this.aJ));
        Integer numValueOf28 = Integer.valueOf(Arrays.hashCode(this.aK));
        Long lValueOf12 = Long.valueOf(this.aL);
        Uri uri3 = this.aM;
        Integer numValueOf29 = Integer.valueOf(Arrays.hashCode(this.aN));
        bvdt bvdtVar = this.aO;
        Integer numValueOf30 = Integer.valueOf(bvdtVar == null ? 0 : bvdtVar.ordinal());
        Integer numValueOf31 = Integer.valueOf(Arrays.hashCode(this.aP));
        ConversationIdType conversationIdType3 = this.aQ;
        bvdg bvdgVar = this.aR;
        bvdg bvdgVar2 = this.aS;
        Long lValueOf13 = Long.valueOf(this.aT);
        Double dValueOf = Double.valueOf(this.aU);
        Double dValueOf2 = Double.valueOf(this.aV);
        Integer numValueOf32 = Integer.valueOf(Arrays.hashCode(this.aW));
        String str21 = this.aX;
        Integer numValueOf33 = Integer.valueOf(Arrays.hashCode(this.aY));
        Integer numValueOf34 = Integer.valueOf(Arrays.hashCode(this.aZ));
        Integer numValueOf35 = Integer.valueOf(Arrays.hashCode(this.ba));
        Integer numValueOf36 = Integer.valueOf(Arrays.hashCode(this.bb));
        String str22 = this.bc;
        String str23 = this.bd;
        Integer numValueOf37 = Integer.valueOf(Arrays.hashCode(this.be));
        Integer numValueOf38 = Integer.valueOf(Arrays.hashCode(this.bf));
        Integer numValueOf39 = Integer.valueOf(Arrays.hashCode(this.bg));
        Integer numValueOf40 = Integer.valueOf(Arrays.hashCode(this.bh));
        Integer numValueOf41 = Integer.valueOf(Arrays.hashCode(this.bi));
        Integer numValueOf42 = Integer.valueOf(Arrays.hashCode(this.bj));
        Integer numValueOf43 = Integer.valueOf(Arrays.hashCode(this.bk));
        Integer numValueOf44 = Integer.valueOf(Arrays.hashCode(this.bl));
        String str24 = this.bm;
        Integer numValueOf45 = Integer.valueOf(Arrays.hashCode(this.bn));
        Integer numValueOf46 = Integer.valueOf(Arrays.hashCode(this.bo));
        Integer numValueOf47 = Integer.valueOf(Arrays.hashCode(this.bp));
        Integer numValueOf48 = Integer.valueOf(Arrays.hashCode(this.bq));
        Integer numValueOf49 = Integer.valueOf(Arrays.hashCode(this.br));
        Boolean boolValueOf6 = Boolean.valueOf(this.bs);
        Long lValueOf14 = Long.valueOf(this.bt);
        String str25 = this.bu;
        bvdr bvdrVar = this.bv;
        Integer numValueOf50 = Integer.valueOf(bvdrVar == null ? 0 : bvdrVar.ordinal());
        dqbw dqbwVar = this.bw;
        bvef bvefVar = this.bx;
        Integer numValueOf51 = Integer.valueOf(bvefVar == null ? 0 : bvefVar.ordinal());
        athh athhVar = this.by;
        bvdy bvdyVar = this.bz;
        Integer numValueOf52 = Integer.valueOf(bvdyVar == null ? 0 : bvdyVar.ordinal());
        bvdq bvdqVar = this.bA;
        return Objects.hash(dqqeVar3, str, messageIdType, conversationIdType, instant, numValueOf, instant2, messageIdType2, conversationIdType2, str2, str3, str4, str5, lValueOf, instant3, lValueOf2, numValueOf2, numValueOf3, numValueOf4, boolValueOf, boolValueOf2, uri, numValueOf5, lValueOf3, str6, str7, str8, lValueOf4, lValueOf5, str9, numValueOf6, str10, axcmVar, lValueOf6, str11, basdVar, numValueOf7, numValueOf8, numValueOf9, boolValueOf3, str12, lValueOf7, numValueOf10, str13, str14, str15, lValueOf8, str16, lValueOf9, lValueOf10, basdVar2, cjnmVar, str17, numValueOf11, lValueOf11, eygaVar, str18, str19, messageIdType3, messageIdType4, boolValueOf4, uri2, optional, numValueOf12, numValueOf13, numValueOf14, numValueOf15, numValueOf16, boolValueOf5, fhazVar, numValueOf17, numValueOf18, numValueOf19, numValueOf20, baroVar, cbqzVar, optional2, numValueOf21, messageIdType5, numValueOf22, str20, numValueOf23, numValueOf24, numValueOf25, numValueOf26, numValueOf27, numValueOf28, lValueOf12, uri3, numValueOf29, numValueOf30, numValueOf31, conversationIdType3, bvdgVar, bvdgVar2, lValueOf13, dValueOf, dValueOf2, numValueOf32, str21, numValueOf33, numValueOf34, numValueOf35, numValueOf36, str22, str23, numValueOf37, numValueOf38, numValueOf39, numValueOf40, numValueOf41, numValueOf42, numValueOf43, numValueOf44, str24, numValueOf45, numValueOf46, numValueOf47, numValueOf48, numValueOf49, boolValueOf6, lValueOf14, str25, numValueOf50, dqbwVar, numValueOf51, athhVar, numValueOf52, Integer.valueOf(bvdqVar == null ? 0 : bvdqVar.ordinal()), Boolean.valueOf(this.bB), Integer.valueOf(Arrays.hashCode(this.bC)), this.bD, null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ScheduledMessagesQuery -- REDACTED") : a();
    }
}
