package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Instant;
import j$.util.Optional;
import java.util.BitSet;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bquu extends dqpg {
    public long A;
    public String B;
    public basd C;
    public int D;
    public bvdz E;
    public int F;
    public boolean G;
    public String H;
    public long I;
    public int J;
    public String K;
    public String L;
    public String M;
    public long N;
    public String O;
    public long P;
    public long Q;
    public basd R;
    public cjnm S;
    public String T;
    public byte[] U;
    public long V;
    public eyga W;
    public String X;
    public String Y;
    public MessageIdType Z;
    public MessageIdType a;
    public MessageIdType aa;
    public boolean ab;
    public Uri ac;
    public Optional ad;
    public int ae;
    public cpyi af;
    public cgrd ag;
    public bvdn ah;
    public int ai;
    public boolean aj;
    public fhaz ak;
    public bvdx al;
    public bvdx am;
    public bvec an;
    public int ao;
    public baro ap;
    public cbqz aq;
    public Optional ar;
    public ConversationIdType b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public Instant h;
    public long i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public Uri o;
    public int p;
    public long q;
    public String r;
    public String s;
    public String t;
    public long u;
    public long v;
    public String w;
    public int x;
    public String y;
    public axcm z;

    public bquu() {
        super(MessagesTable.k());
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = barn.a;
        this.g = 0L;
        this.h = bart.b(0L);
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.p = 0;
        this.q = 0L;
        this.u = 0L;
        this.v = 0L;
        this.x = 0;
        this.z = null;
        this.A = 0L;
        basd basdVar = basd.a;
        this.C = basdVar;
        this.D = 0;
        this.E = bvdz.VERIFICATION_NA;
        this.F = 0;
        this.G = false;
        this.I = -1L;
        this.J = -1;
        this.O = "";
        this.P = 0L;
        this.Q = 1L;
        this.R = basdVar;
        this.V = 0L;
        this.Z = messageIdType;
        this.aa = messageIdType;
        this.ab = false;
        this.ad = basg.a;
        this.ae = -2;
        this.af = cpyi.UNKNOWN;
        this.ag = cgrd.c;
        this.ah = bvdn.UNKNOWN;
        this.ai = 0;
        this.aj = false;
        bvdx bvdxVar = bvdx.UNKNOWN;
        this.al = bvdxVar;
        this.am = bvdxVar;
        this.an = bvec.UNKNOWN;
        this.ao = -1;
        this.ap = baro.a;
        this.aq = new cbqz(0L);
        this.ar = basc.a();
    }

    public final void A(long j) {
        aE(20);
        this.u = j;
    }

    public final void B(String str) {
        int i = this.aB;
        if (i < 9030) {
            dqru.x("mms_retrieve_text", i);
        }
        aE(22);
        this.w = str;
    }

    public final void C(String str) {
        aE(17);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.r = str;
    }

    public final void D(String str) {
        aE(18);
        this.s = str;
    }

    public final void E(String str) {
        int i = this.aB;
        if (i < 59340) {
            dqru.x("msisdn_receiving_rcs_message", i);
        }
        aE(4);
        this.e = str;
    }

    public final void F(cgrd cgrdVar) {
        int i = this.aB;
        if (i < 60750) {
            dqru.x("mute_priority", i);
        }
        aE(58);
        this.ag = cgrdVar;
    }

    public final void G(axcm axcmVar) {
        int i = this.aB;
        if (i < 60160) {
            dqru.x("my_identity_foreign_key", i);
        }
        aE(25);
        this.z = axcmVar;
    }

    public final void H(boolean z) {
        aE(12);
        this.m = z;
    }

    public final void I(Uri uri) {
        int i = this.aB;
        if (i < 49060) {
            dqru.x("old_sms_message_uri", i);
        }
        aE(54);
        this.ac = uri;
    }

    public final void J(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 48030) {
            dqru.x("original_message_id", i);
        }
        aE(51);
        this.Z = messageIdType;
    }

    public final void K(int i) {
        int i2 = this.aB;
        if (i2 < 59430) {
            dqru.x("message_original_protocol", i2);
        }
        aE(66);
        this.ao = i;
    }

    public final void L(basd basdVar) {
        int i = this.aB;
        if (i < 35030) {
            dqru.x("original_rcs_message_id", i);
        }
        aE(43);
        this.R = basdVar;
    }

    public final void M(bvdx bvdxVar) {
        int i = this.aB;
        if (i < 58720) {
            dqru.x("outgoing_delivery_report_status", i);
        }
        aE(63);
        this.al = bvdxVar;
    }

    public final void N(bvdx bvdxVar) {
        int i = this.aB;
        if (i < 58720) {
            dqru.x("outgoing_read_report_status", i);
        }
        aE(64);
        this.am = bvdxVar;
    }

    public final void O(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 60950) {
            dqru.x("parent_message_id", i);
        }
        aE(52);
        this.aa = messageIdType;
    }

    public final void P(int i) {
        aE(9);
        this.j = i;
    }

    public final void Q(Instant instant) {
        int i = this.aB;
        if (i < 17030) {
            dqru.x("queue_insert_timestamp", i);
        }
        aE(7);
        this.h = instant;
    }

    public final void R(cjnm cjnmVar) {
        int i = this.aB;
        if (i < 60820) {
            dqru.x("raw_rcs_message_to_send", i);
        }
        aE(44);
        this.S = cjnmVar;
    }

    public final void S(int i) {
        aE(23);
        this.x = i;
    }

    public final void T(int i) {
        int i2 = this.aB;
        if (i2 < 29060) {
            dqru.x("etouffee_status", i2);
        }
        aE(29);
        this.D = i;
    }

    public final void U(long j) {
        int i = this.aB;
        if (i < 59890) {
            dqru.x("rcs_expiry", i);
        }
        aE(21);
        this.v = j;
    }

    public final void V(long j) {
        int i = this.aB;
        if (i < 10004) {
            dqru.x("rcs_file_transfer_session_id", i);
        }
        aE(34);
        this.I = j;
    }

    public final void W(basd basdVar) {
        int i = this.aB;
        if (i < 41040) {
            dqru.x("rcs_message_id_with_text_type", i);
        }
        aE(28);
        this.C = basdVar;
    }

    public final void X(String str) {
        int i = this.aB;
        if (i < 10002) {
            dqru.x("rcs_remote_instance", i);
        }
        aE(33);
        this.H = str;
    }

    public final void Y(int i) {
        int i2 = this.aB;
        if (i2 < 39000) {
            dqru.x("rcs_ui_status", i2);
        }
        aE(31);
        this.F = i;
    }

    public final void Z(boolean z) {
        aE(13);
        this.n = z;
    }

    public final MessagesTable.BindData a() {
        return b(new Supplier() { // from class: bqus
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqur();
            }
        });
    }

    public final void aa(long j) {
        aE(8);
        this.i = j;
    }

    public final void ab(String str) {
        int i = this.aB;
        if (i < 54040) {
            dqru.x("receiving_network_country", i);
        }
        aE(5);
        this.f = str;
    }

    public final void ac(long j) {
        int i = this.aB;
        if (i < 37030) {
            dqru.x("report_attempt_acounter", i);
        }
        aE(47);
        this.V = j;
    }

    public final void ad(int i) {
        int i2 = this.aB;
        if (i2 < 58040) {
            dqru.x("result_code", i2);
        }
        aE(56);
        this.ae = i;
    }

    public final void ae(long j) {
        aE(26);
        this.A = j;
    }

    public final void af(baro baroVar) {
        int i = this.aB;
        if (i < 59490) {
            dqru.x("satellite_datagram_id", i);
        }
        aE(67);
        this.ap = baroVar;
    }

    public final void ag(String str) {
        aE(24);
        this.y = str;
    }

    public final void ah(long j) {
        int i = this.aB;
        if (i < 35030) {
            dqru.x("send_counter", i);
        }
        aE(42);
        this.Q = j;
    }

    public final void ai(String str) {
        aE(2);
        this.c = str;
    }

    public final void aj(String str) {
        int i = this.aB;
        if (i < 54040) {
            dqru.x("sender_send_destination", i);
        }
        aE(3);
        this.d = str;
    }

    public final void ak(long j) {
        aE(6);
        this.g = j;
    }

    public final void al(int i) {
        int i2 = this.aB;
        if (i2 < 9000) {
            dqru.x("sms_error_code", i2);
        }
        aE(35);
        this.J = i;
    }

    public final void am(String str) {
        int i = this.aB;
        if (i < 9000) {
            dqru.x("sms_error_desc_map_name", i);
        }
        aE(36);
        this.K = str;
    }

    public final void an(long j) {
        aE(16);
        this.q = j;
    }

    public final void ao(Uri uri) {
        aE(14);
        this.o = uri;
    }

    public final void ap(int i) {
        aE(15);
        this.p = i;
    }

    public final void aq(int i) {
        aE(10);
        this.k = i;
    }

    public final void ar(fhaz fhazVar) {
        int i = this.aB;
        if (i < 58680) {
            dqru.x("trace_id", i);
        }
        aE(62);
        this.ak = fhazVar;
    }

    public final void as(long j) {
        int i = this.aB;
        if (i < 29100) {
            dqru.x("usage_stats_logging_id", i);
        }
        aE(41);
        this.P = j;
    }

    public final void at(bvdz bvdzVar) {
        int i = this.aB;
        if (i < 29090) {
            dqru.x(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, i);
        }
        aE(30);
        this.E = bvdzVar;
    }

    public final void au(String str) {
        int i = this.aB;
        if (i < 19020) {
            dqru.x("web_id", i);
        }
        aE(40);
        this.O = str;
    }

    public final void av(bvec bvecVar) {
        int i = this.aB;
        if (i < 59310) {
            dqru.x("xms_transport", i);
        }
        aE(65);
        this.an = bvecVar;
    }

    public final MessagesTable.BindData b(Supplier supplier) {
        MessagesTable.BindData bindData = (MessagesTable.BindData) supplier.get();
        bindData.aD(aB());
        bindData.a = this.a;
        bindData.b = this.b;
        bindData.c = this.c;
        bindData.d = this.d;
        bindData.e = this.e;
        bindData.f = this.f;
        bindData.g = this.g;
        bindData.h = this.h;
        bindData.i = this.i;
        bindData.j = this.j;
        bindData.k = this.k;
        bindData.l = this.l;
        bindData.m = this.m;
        bindData.n = this.n;
        bindData.o = this.o;
        bindData.p = this.p;
        bindData.q = this.q;
        bindData.r = this.r;
        bindData.s = this.s;
        bindData.t = this.t;
        bindData.u = this.u;
        bindData.v = this.v;
        bindData.w = this.w;
        bindData.x = this.x;
        bindData.y = this.y;
        bindData.z = this.z;
        bindData.A = this.A;
        bindData.B = this.B;
        bindData.C = this.C;
        bindData.D = this.D;
        bindData.E = this.E;
        bindData.F = this.F;
        bindData.G = this.G;
        bindData.H = this.H;
        bindData.I = this.I;
        bindData.J = this.J;
        bindData.K = this.K;
        bindData.L = this.L;
        bindData.M = this.M;
        bindData.N = this.N;
        bindData.O = this.O;
        bindData.P = this.P;
        bindData.Q = this.Q;
        bindData.R = this.R;
        bindData.S = this.S;
        bindData.T = this.T;
        bindData.U = this.U;
        bindData.V = this.V;
        bindData.W = this.W;
        bindData.X = this.X;
        bindData.Y = this.Y;
        bindData.Z = this.Z;
        bindData.aa = this.aa;
        bindData.ab = this.ab;
        bindData.ac = this.ac;
        bindData.ad = this.ad;
        bindData.ae = this.ae;
        bindData.af = this.af;
        bindData.ag = this.ag;
        bindData.ah = this.ah;
        bindData.ai = this.ai;
        bindData.aj = this.aj;
        bindData.ak = this.ak;
        bindData.al = this.al;
        bindData.am = this.am;
        bindData.an = this.an;
        bindData.ao = this.ao;
        bindData.ap = this.ap;
        bindData.aq = this.aq;
        bindData.ar = this.ar;
        bindData.cM = aC();
        return bindData;
    }

    public final MessagesTable.BindData c() {
        MessagesTable.BindData bindDataB = b(new Supplier() { // from class: bqut
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqur();
            }
        });
        bindDataB.G();
        return bindDataB;
    }

    public final void d(MessagesTable.BindData bindData, boolean z, BitSet bitSet) {
        this.az = bitSet == null ? null : (BitSet) bitSet.clone();
        if (z) {
            BitSet bitSet2 = this.az;
            if (bitSet2 != null) {
                bitSet2.clear(0);
            }
        } else {
            BitSet bitSet3 = this.az;
            if (bitSet3 == null || bitSet3.get(0)) {
                this.a = bindData.E();
            }
        }
        BitSet bitSet4 = this.az;
        if (bitSet4 == null || bitSet4.get(1)) {
            this.b = bindData.D();
        }
        BitSet bitSet5 = this.az;
        if (bitSet5 == null || bitSet5.get(2)) {
            this.c = bindData.aa();
        }
        BitSet bitSet6 = this.az;
        if (bitSet6 == null || bitSet6.get(3)) {
            bindData.aA(3, "sender_send_destination");
            this.d = bindData.d;
        }
        BitSet bitSet7 = this.az;
        if (bitSet7 == null || bitSet7.get(4)) {
            bindData.aA(4, "msisdn_receiving_rcs_message");
            this.e = bindData.e;
        }
        BitSet bitSet8 = this.az;
        if (bitSet8 == null || bitSet8.get(5)) {
            bindData.aA(5, "receiving_network_country");
            this.f = bindData.f;
        }
        BitSet bitSet9 = this.az;
        if (bitSet9 == null || bitSet9.get(6)) {
            this.g = bindData.z();
        }
        BitSet bitSet10 = this.az;
        if (bitSet10 == null || bitSet10.get(7)) {
            bindData.aA(7, "queue_insert_timestamp");
            this.h = bindData.h;
        }
        BitSet bitSet11 = this.az;
        if (bitSet11 == null || bitSet11.get(8)) {
            this.i = bindData.w();
        }
        BitSet bitSet12 = this.az;
        if (bitSet12 == null || bitSet12.get(9)) {
            this.j = bindData.m();
        }
        BitSet bitSet13 = this.az;
        if (bitSet13 == null || bitSet13.get(10)) {
            this.k = bindData.s();
        }
        BitSet bitSet14 = this.az;
        if (bitSet14 == null || bitSet14.get(11)) {
            this.l = bindData.k();
        }
        BitSet bitSet15 = this.az;
        if (bitSet15 == null || bitSet15.get(12)) {
            this.m = bindData.ah();
        }
        BitSet bitSet16 = this.az;
        if (bitSet16 == null || bitSet16.get(13)) {
            this.n = bindData.ai();
        }
        BitSet bitSet17 = this.az;
        if (bitSet17 == null || bitSet17.get(14)) {
            this.o = bindData.C();
        }
        BitSet bitSet18 = this.az;
        if (bitSet18 == null || bitSet18.get(15)) {
            this.p = bindData.r();
        }
        BitSet bitSet19 = this.az;
        if (bitSet19 == null || bitSet19.get(16)) {
            this.q = bindData.A();
        }
        BitSet bitSet20 = this.az;
        if (bitSet20 == null || bitSet20.get(17)) {
            this.r = bindData.Y();
        }
        BitSet bitSet21 = this.az;
        if (bitSet21 == null || bitSet21.get(18)) {
            bindData.aA(18, "mms_transaction_id");
            this.s = bindData.s;
        }
        BitSet bitSet22 = this.az;
        if (bitSet22 == null || bitSet22.get(19)) {
            this.t = bindData.W();
        }
        BitSet bitSet23 = this.az;
        if (bitSet23 == null || bitSet23.get(20)) {
            this.u = bindData.u();
        }
        BitSet bitSet24 = this.az;
        if (bitSet24 == null || bitSet24.get(21)) {
            bindData.aA(21, "rcs_expiry");
            this.v = bindData.v;
        }
        BitSet bitSet25 = this.az;
        if (bitSet25 == null || bitSet25.get(22)) {
            this.w = bindData.X();
        }
        BitSet bitSet26 = this.az;
        if (bitSet26 == null || bitSet26.get(23)) {
            this.x = bindData.n();
        }
        BitSet bitSet27 = this.az;
        if (bitSet27 == null || bitSet27.get(24)) {
            this.y = bindData.Z();
        }
        BitSet bitSet28 = this.az;
        if (bitSet28 == null || bitSet28.get(25)) {
            bindData.aA(25, "my_identity_foreign_key");
            this.z = bindData.z;
        }
        BitSet bitSet29 = this.az;
        if (bitSet29 == null || bitSet29.get(26)) {
            this.A = bindData.x();
        }
        BitSet bitSet30 = this.az;
        if (bitSet30 == null || bitSet30.get(27)) {
            this.B = bindData.S();
        }
        BitSet bitSet31 = this.az;
        if (bitSet31 == null || bitSet31.get(28)) {
            this.C = bindData.I();
        }
        BitSet bitSet32 = this.az;
        if (bitSet32 == null || bitSet32.get(29)) {
            this.D = bindData.o();
        }
        BitSet bitSet33 = this.az;
        if (bitSet33 == null || bitSet33.get(30)) {
            this.E = bindData.M();
        }
        BitSet bitSet34 = this.az;
        if (bitSet34 == null || bitSet34.get(31)) {
            bindData.aA(31, "rcs_ui_status");
            this.F = bindData.F;
        }
        BitSet bitSet35 = this.az;
        if (bitSet35 == null || bitSet35.get(32)) {
            this.G = bindData.ag();
        }
        BitSet bitSet36 = this.az;
        if (bitSet36 == null || bitSet36.get(33)) {
            bindData.aA(33, "rcs_remote_instance");
            this.H = bindData.H;
        }
        BitSet bitSet37 = this.az;
        if (bitSet37 == null || bitSet37.get(34)) {
            this.I = bindData.v();
        }
        BitSet bitSet38 = this.az;
        if (bitSet38 == null || bitSet38.get(35)) {
            this.J = bindData.q();
        }
        BitSet bitSet39 = this.az;
        if (bitSet39 == null || bitSet39.get(36)) {
            this.K = bindData.ab();
        }
        BitSet bitSet40 = this.az;
        if (bitSet40 == null || bitSet40.get(37)) {
            this.L = bindData.V();
        }
        BitSet bitSet41 = this.az;
        if (bitSet41 == null || bitSet41.get(38)) {
            this.M = bindData.U();
        }
        BitSet bitSet42 = this.az;
        if (bitSet42 == null || bitSet42.get(39)) {
            this.N = bindData.t();
        }
        BitSet bitSet43 = this.az;
        if (bitSet43 == null || bitSet43.get(40)) {
            this.O = bindData.ac();
        }
        BitSet bitSet44 = this.az;
        if (bitSet44 == null || bitSet44.get(41)) {
            this.P = bindData.B();
        }
        BitSet bitSet45 = this.az;
        if (bitSet45 == null || bitSet45.get(42)) {
            this.Q = bindData.y();
        }
        BitSet bitSet46 = this.az;
        if (bitSet46 == null || bitSet46.get(43)) {
            this.R = bindData.H();
        }
        BitSet bitSet47 = this.az;
        if (bitSet47 == null || bitSet47.get(44)) {
            bindData.aA(44, "raw_rcs_message_to_send");
            this.S = bindData.S;
        }
        BitSet bitSet48 = this.az;
        if (bitSet48 == null || bitSet48.get(45)) {
            bindData.aA(45, "custom_delivery_receipt_mime_type");
            this.T = bindData.T;
        }
        BitSet bitSet49 = this.az;
        if (bitSet49 == null || bitSet49.get(46)) {
            bindData.aA(46, "custom_delivery_receipt_content");
            this.U = bindData.U;
        }
        BitSet bitSet50 = this.az;
        if (bitSet50 == null || bitSet50.get(47)) {
            bindData.aA(47, "report_attempt_acounter");
            this.V = bindData.V;
        }
        BitSet bitSet51 = this.az;
        if (bitSet51 == null || bitSet51.get(48)) {
            this.W = bindData.Q();
        }
        BitSet bitSet52 = this.az;
        if (bitSet52 == null || bitSet52.get(49)) {
            this.X = bindData.T();
        }
        BitSet bitSet53 = this.az;
        if (bitSet53 == null || bitSet53.get(50)) {
            bindData.aA(50, "group_private_participant");
            this.Y = bindData.Y;
        }
        BitSet bitSet54 = this.az;
        if (bitSet54 == null || bitSet54.get(51)) {
            this.Z = bindData.F();
        }
        BitSet bitSet55 = this.az;
        if (bitSet55 == null || bitSet55.get(52)) {
            bindData.aA(52, "parent_message_id");
            this.aa = bindData.aa;
        }
        BitSet bitSet56 = this.az;
        if (bitSet56 == null || bitSet56.get(53)) {
            bindData.aA(53, "awaiting_reverse_sync");
            this.ab = bindData.ab;
        }
        BitSet bitSet57 = this.az;
        if (bitSet57 == null || bitSet57.get(54)) {
            bindData.aA(54, "old_sms_message_uri");
            this.ac = bindData.ac;
        }
        BitSet bitSet58 = this.az;
        if (bitSet58 == null || bitSet58.get(55)) {
            bindData.aA(55, "draft_id");
            this.ad = bindData.ad;
        }
        BitSet bitSet59 = this.az;
        if (bitSet59 == null || bitSet59.get(56)) {
            this.ae = bindData.p();
        }
        BitSet bitSet60 = this.az;
        if (bitSet60 == null || bitSet60.get(57)) {
            this.af = bindData.P();
        }
        BitSet bitSet61 = this.az;
        if (bitSet61 == null || bitSet61.get(58)) {
            this.ag = bindData.O();
        }
        BitSet bitSet62 = this.az;
        if (bitSet62 == null || bitSet62.get(59)) {
            this.ah = bindData.L();
        }
        BitSet bitSet63 = this.az;
        if (bitSet63 == null || bitSet63.get(60)) {
            bindData.aA(60, "auto_retry_counter");
            this.ai = bindData.ai;
        }
        BitSet bitSet64 = this.az;
        if (bitSet64 == null || bitSet64.get(61)) {
            bindData.aA(61, "can_revoke_before_delivered_with_rcs");
            this.aj = bindData.aj;
        }
        BitSet bitSet65 = this.az;
        if (bitSet65 == null || bitSet65.get(62)) {
            this.ak = bindData.ad();
        }
        BitSet bitSet66 = this.az;
        if (bitSet66 == null || bitSet66.get(63)) {
            bindData.aA(63, "outgoing_delivery_report_status");
            this.al = bindData.al;
        }
        BitSet bitSet67 = this.az;
        if (bitSet67 == null || bitSet67.get(64)) {
            bindData.aA(64, "outgoing_read_report_status");
            this.am = bindData.am;
        }
        BitSet bitSet68 = this.az;
        if (bitSet68 == null || bitSet68.get(65)) {
            this.an = bindData.N();
        }
        BitSet bitSet69 = this.az;
        if (bitSet69 == null || bitSet69.get(66)) {
            bindData.aA(66, "message_original_protocol");
            this.ao = bindData.ao;
        }
        BitSet bitSet70 = this.az;
        if (bitSet70 == null || bitSet70.get(67)) {
            bindData.aA(67, "satellite_datagram_id");
            this.ap = bindData.ap;
        }
        BitSet bitSet71 = this.az;
        if (bitSet71 == null || bitSet71.get(68)) {
            bindData.aA(68, "encryption_protocol");
            this.aq = bindData.aq;
        }
        BitSet bitSet72 = this.az;
        if (bitSet72 == null || bitSet72.get(69)) {
            this.ar = bindData.R();
        }
    }

    public final void e(int i) {
        int i2 = this.aB;
        if (i2 < 58230) {
            dqru.x("auto_retry_counter", i2);
        }
        aE(60);
        this.ai = i;
    }

    public final void f(boolean z) {
        int i = this.aB;
        if (i < 49060) {
            dqru.x("awaiting_reverse_sync", i);
        }
        aE(53);
        this.ab = z;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 58280) {
            dqru.x("can_revoke_before_delivered_with_rcs", i);
        }
        aE(61);
        this.aj = z;
    }

    public final void h(String str) {
        int i = this.aB;
        if (i < 8500) {
            dqru.x("cloud_sync_id", i);
        }
        aE(27);
        this.B = str;
    }

    public final void i(String str) {
        int i = this.aB;
        if (i < 46010) {
            dqru.x("cms_correlation_id", i);
        }
        aE(49);
        this.X = str;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 31010) {
            dqru.x("cms_id", i);
        }
        aE(38);
        this.M = str;
    }

    public final void k(long j) {
        int i = this.aB;
        if (i < 37040) {
            dqru.x("cms_last_mod_seq", i);
        }
        aE(39);
        this.N = j;
    }

    public final void l(cpyi cpyiVar) {
        int i = this.aB;
        if (i < 58210) {
            dqru.x("cms_life_cycle", i);
        }
        aE(57);
        this.af = cpyiVar;
    }

    public final void m(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void n(String str) {
        int i = this.aB;
        if (i < 9010) {
            dqru.x("correlation_id", i);
        }
        aE(37);
        this.L = str;
    }

    public final void o(byte[] bArr) {
        int i = this.aB;
        if (i < 37020) {
            dqru.x("custom_delivery_receipt_content", i);
        }
        aE(46);
        this.U = bArr;
    }

    public final void p(String str) {
        int i = this.aB;
        if (i < 37020) {
            dqru.x("custom_delivery_receipt_mime_type", i);
        }
        aE(45);
        this.T = str;
    }

    public final void q(eyga eygaVar) {
        int i = this.aB;
        if (i < 45020) {
            dqru.x("custom_headers", i);
        }
        aE(48);
        this.W = eygaVar;
    }

    public final void r(Optional optional) {
        int i = this.aB;
        if (i < 56000) {
            dqru.x("draft_id", i);
        }
        aE(55);
        this.ad = optional;
    }

    public final void s(cbqz cbqzVar) {
        int i = this.aB;
        if (i < 60190) {
            dqru.x("encryption_protocol", i);
        }
        aE(68);
        this.aq = cbqzVar;
    }

    public final void t(bvdn bvdnVar) {
        int i = this.aB;
        if (i < 58710) {
            dqru.x("fallback_reason", i);
        }
        aE(59);
        this.ah = bvdnVar;
    }

    public final void u(String str) {
        int i = this.aB;
        if (i < 48030) {
            dqru.x("group_private_participant", i);
        }
        aE(50);
        this.Y = str;
    }

    public final void v(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void w(boolean z) {
        int i = this.aB;
        if (i < 30010) {
            dqru.x("is_hidden", i);
        }
        aE(32);
        this.G = z;
    }

    public final void x(Optional optional) {
        int i = this.aB;
        if (i < 60370) {
            dqru.x("message_persistence_id", i);
        }
        aE(69);
        if (!this.aC && !optional.isPresent()) {
            ekrd ekrdVar = (ekrd) csse.a.j();
            ekrdVar.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/text/MessagePersistenceIdValueFilterForSet", "filter", 20, "MessagePersistenceIdValueFilterForSet.java")).q("Empty UUID passed to Message Persistence ID!");
            optional = Optional.of(UUID.randomUUID());
        }
        this.ar = optional;
    }

    public final void y(int i) {
        int i2 = this.aB;
        if (i2 < 13020) {
            dqru.x("message_report_status", i2);
        }
        aE(11);
        this.l = i;
    }

    public final void z(String str) {
        aE(19);
        this.t = str;
    }
}
