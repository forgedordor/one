package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bojl extends dqpg {
    public String A;
    public axcm B;
    public awjl C;
    public int D;
    public boolean E;
    public String F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public int L;
    public long M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public long S;
    public String T;
    public String U;
    public boolean V;
    public int W;
    public long X;
    public long Y;
    public String Z;
    public ConversationIdType a;
    public String aa;
    public String ab;
    public byte[] ac;
    public long ad;
    public long ae;
    public boolean af;
    public cigb ag;
    public boolean ah;
    public ConversationIdType ai;
    public ConversationIdType aj;
    public avoe ak;
    public cpyi al;
    public String am;
    public Optional an;
    public Optional ao;
    public boolean ap;
    public boolean aq;
    public cidt ar;
    public cins as;
    public int at;
    public cbqz au;
    public cbqx av;
    public String aw;
    public Uri ax;
    public int ay;
    public cnqj b;
    public String c;
    public bvdp d;
    public String e;
    public MessageIdType f;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public Uri n;
    public String o;
    public int p;
    public bvdk q;
    public long r;
    public long s;
    public String t;
    public long u;
    public long v;
    public String w;
    public String x;
    public String y;
    public String z;

    public bojl() {
        super(botm.o());
        ConversationIdType conversationIdType = barn.a;
        this.a = conversationIdType;
        this.b = new cnqj();
        this.d = bvdp.NAME_IS_AUTOMATIC;
        this.f = bary.a;
        this.k = false;
        this.p = 0;
        this.q = bvdk.UNARCHIVED;
        this.r = 0L;
        this.s = 0L;
        this.u = -1L;
        this.v = -1L;
        this.B = null;
        this.C = null;
        this.D = 0;
        this.E = true;
        this.G = true;
        this.H = false;
        this.L = 0;
        this.M = -1L;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = 0L;
        this.V = false;
        this.W = 0;
        this.X = 0L;
        this.Y = 0L;
        this.ad = 0L;
        this.ae = -1L;
        this.af = true;
        this.ag = new cigb(0L);
        this.ah = false;
        this.ai = conversationIdType;
        this.aj = conversationIdType;
        this.ak = avoe.b(0);
        this.al = cpyi.UNKNOWN;
        this.an = basb.b(-1L);
        this.ao = basb.b(-1L);
        this.ap = false;
        this.aq = false;
        this.as = cins.a;
        this.at = 0;
        this.au = new cbqz(0L);
        this.av = null;
    }

    public final void A(String str) {
        aE(19);
        this.t = str;
    }

    public final void B(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void C(boolean z) {
        aE(33);
        this.H = z;
    }

    public final void D(boolean z) {
        int i = this.aB;
        if (i < 10018) {
            dqru.x("IS_ENTERPRISE", i);
        }
        aE(42);
        this.Q = z;
    }

    public final void E(int i) {
        int i2 = this.aB;
        if (i2 < 10006) {
            dqru.x("join_state", i2);
        }
        aE(39);
        this.N = i;
    }

    public final void F(long j) {
        int i = this.aB;
        if (i < 15000) {
            dqru.x("last_interactive_event_timestamp", i);
        }
        aE(44);
        this.S = j;
    }

    public final void G(long j) {
        int i = this.aB;
        if (i < 28010) {
            dqru.x("last_logged_scooby_metadata_timestamp", i);
        }
        aE(49);
        this.X = j;
    }

    public final void H(long j) {
        aE(18);
        this.s = j;
    }

    public final void I(MessageIdType messageIdType) {
        aE(5);
        this.f = messageIdType;
    }

    public final void J(boolean z) {
        int i = this.aB;
        if (i < 59220) {
            dqru.x("marked_as_unread", i);
        }
        aE(68);
        this.aq = z;
    }

    public final void K(int i) {
        int i2 = this.aB;
        if (i2 < 60050) {
            dqru.x("mms_group_upgrade_retries", i2);
        }
        aE(71);
        this.at = i;
    }

    public final void L(cins cinsVar) {
        int i = this.aB;
        if (i < 60050) {
            dqru.x("mms_group_upgrade_status", i);
        }
        aE(70);
        this.as = cinsVar;
    }

    public final void M(String str) {
        aE(2);
        if (!this.aC) {
            str = cssd.a(str);
        }
        this.c = str;
    }

    public final void N(bvdp bvdpVar) {
        int i = this.aB;
        if (i < 10012) {
            dqru.x("name_is_automatic", i);
        }
        aE(3);
        this.d = bvdpVar;
    }

    public final void O(long j) {
        int i = this.aB;
        if (i < 58090) {
            dqru.x("normalized_participant_contact_id", i);
        }
        aE(21);
        this.v = j;
    }

    public final void P(String str) {
        int i = this.aB;
        if (i < 58090) {
            dqru.x("normalized_participant_display_destination", i);
        }
        aE(46);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.U = str;
    }

    public final void Q(String str) {
        int i = this.aB;
        if (i < 58090) {
            dqru.x("normalized_participant_id_list", i);
        }
        aE(36);
        this.K = str;
    }

    public final void R(String str) {
        int i = this.aB;
        if (i < 58090) {
            dqru.x("normalized_participant_lookup_key", i);
        }
        aE(23);
        this.x = str;
    }

    public final void S(boolean z) {
        aE(30);
        this.E = z;
    }

    public final void T(String str) {
        aE(31);
        this.F = str;
    }

    public final void U(boolean z) {
        aE(32);
        this.G = z;
    }

    public final void V(int i) {
        int i2 = this.aB;
        if (i2 < 26020) {
            dqru.x("open_count", i2);
        }
        aE(48);
        this.W = i;
    }

    public final void W(String str) {
        int i = this.aB;
        if (i < 58090) {
            dqru.x("participant_comparable_destination", i);
        }
        aE(25);
        this.z = str;
    }

    public final void X(long j) {
        aE(20);
        this.u = j;
    }

    public final void Y(int i) {
        aE(29);
        this.D = i;
    }

    public final void Z(String str) {
        int i = this.aB;
        if (i < 15010) {
            dqru.x("participant_display_destination", i);
        }
        aE(45);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.T = str;
    }

    public final bojh a() {
        return b(new Supplier() { // from class: bojj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new boji();
            }
        });
    }

    public final void aA(int i) {
        int i2 = this.aB;
        if (i2 < 60740) {
            dqru.x("unread_count", i2);
        }
        aE(76);
        this.ay = i;
    }

    public final void aa(String str) {
        int i = this.aB;
        if (i < 8500) {
            dqru.x("participant_id_list", i);
        }
        aE(35);
        this.J = str;
    }

    public final void ab(String str) {
        aE(22);
        this.w = str;
    }

    public final void ac(String str) {
        aE(24);
        this.y = str;
    }

    public final void ad(String str) {
        aE(9);
        this.j = str;
    }

    public final void ae(Uri uri) {
        aE(8);
        this.i = uri;
    }

    public final void af(String str) {
        int i = this.aB;
        if (i < 40050) {
            dqru.x("rcs_conference_uri", i);
        }
        aE(53);
        if (!this.aC) {
            str = cssa.a(str);
        }
        this.ab = str;
    }

    public final void ag(cigb cigbVar) {
        int i = this.aB;
        if (i < 49020) {
            dqru.x("rcs_group_capabilities", i);
        }
        aE(58);
        this.ag = cigbVar;
    }

    public final void ah(Uri uri) {
        int i = this.aB;
        if (i < 60590) {
            dqru.x("rcs_group_icon_url", i);
        }
        aE(75);
        this.ax = uri;
    }

    public final void ai(String str) {
        int i = this.aB;
        if (i < 40050) {
            dqru.x("rcs_group_id", i);
        }
        aE(52);
        this.aa = str;
    }

    public final void aj(Optional optional) {
        int i = this.aB;
        if (i < 58910) {
            dqru.x("rcs_group_last_sync_timestamp", i);
        }
        aE(66);
        this.ao = optional;
    }

    public final void ak(String str) {
        int i = this.aB;
        if (i < 58540) {
            dqru.x("rcs_group_self_msisdn", i);
        }
        aE(64);
        this.am = str;
    }

    public final void al(boolean z) {
        int i = this.aB;
        if (i < 48040) {
            dqru.x("rcs_session_allows_revocation", i);
        }
        aE(57);
        this.af = z;
    }

    public final void am(long j) {
        int i = this.aB;
        if (i < 10000) {
            dqru.x("rcs_session_id", i);
        }
        aE(38);
        this.M = j;
    }

    public final void an(long j) {
        int i = this.aB;
        if (i < 46050) {
            dqru.x("rcs_subject_change_timestamp_ms", i);
        }
        aE(56);
        this.ae = j;
    }

    public final void ao(Optional optional) {
        int i = this.aB;
        if (i < 58750) {
            dqru.x("recipient_offline_timestamp_ms", i);
        }
        aE(65);
        this.an = optional;
    }

    public final void ap(int i) {
        int i2 = this.aB;
        if (i2 < 10016) {
            dqru.x("send_mode", i2);
        }
        aE(41);
        this.P = i;
    }

    public final void aq(boolean z) {
        aE(10);
        this.k = z;
    }

    public final void ar(String str) {
        aE(34);
        this.I = str;
    }

    public final void as(cnqj cnqjVar) {
        aE(1);
        this.b = cnqjVar;
    }

    public final void at(String str) {
        aE(6);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.g = str;
    }

    public final void au(long j) {
        aE(17);
        this.r = j;
    }

    public final void av(int i) {
        int i2 = this.aB;
        if (i2 < 8500) {
            dqru.x("source_type", i2);
        }
        aE(37);
        this.L = i;
    }

    public final void aw(boolean z) {
        int i = this.aB;
        if (i < 23000) {
            dqru.x("spam_warning_dismiss_status", i);
        }
        aE(47);
        this.V = z;
    }

    public final void ax(String str) {
        aE(7);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.h = str;
    }

    public final void ay(String str) {
        int i = this.aB;
        if (i < 59760) {
            dqru.x("subtitle", i);
        }
        aE(4);
        this.e = str;
    }

    public final void az(byte[] bArr) {
        int i = this.aB;
        if (i < 58120) {
            dqru.x("tachygram_group_routing_info_token", i);
        }
        aE(54);
        this.ac = bArr;
    }

    public final bojh b(Supplier supplier) {
        bojh bojhVar = (bojh) supplier.get();
        bojhVar.aD(aB());
        bojhVar.a = this.a;
        bojhVar.b = this.b;
        bojhVar.c = this.c;
        bojhVar.d = this.d;
        bojhVar.e = this.e;
        bojhVar.f = this.f;
        bojhVar.g = this.g;
        bojhVar.h = this.h;
        bojhVar.i = this.i;
        bojhVar.j = this.j;
        bojhVar.k = this.k;
        bojhVar.l = this.l;
        bojhVar.m = this.m;
        bojhVar.n = this.n;
        bojhVar.o = this.o;
        bojhVar.p = this.p;
        bojhVar.q = this.q;
        bojhVar.r = this.r;
        bojhVar.s = this.s;
        bojhVar.t = this.t;
        bojhVar.u = this.u;
        bojhVar.v = this.v;
        bojhVar.w = this.w;
        bojhVar.x = this.x;
        bojhVar.y = this.y;
        bojhVar.z = this.z;
        bojhVar.A = this.A;
        bojhVar.B = this.B;
        bojhVar.C = this.C;
        bojhVar.D = this.D;
        bojhVar.E = this.E;
        bojhVar.F = this.F;
        bojhVar.G = this.G;
        bojhVar.H = this.H;
        bojhVar.I = this.I;
        bojhVar.J = this.J;
        bojhVar.K = this.K;
        bojhVar.L = this.L;
        bojhVar.M = this.M;
        bojhVar.N = this.N;
        bojhVar.O = this.O;
        bojhVar.P = this.P;
        bojhVar.Q = this.Q;
        bojhVar.R = this.R;
        bojhVar.S = this.S;
        bojhVar.T = this.T;
        bojhVar.U = this.U;
        bojhVar.V = this.V;
        bojhVar.W = this.W;
        bojhVar.X = this.X;
        bojhVar.Y = this.Y;
        bojhVar.Z = this.Z;
        bojhVar.aa = this.aa;
        bojhVar.ab = this.ab;
        bojhVar.ac = this.ac;
        bojhVar.ad = this.ad;
        bojhVar.ae = this.ae;
        bojhVar.af = this.af;
        bojhVar.ag = this.ag;
        bojhVar.ah = this.ah;
        bojhVar.ai = this.ai;
        bojhVar.aj = this.aj;
        bojhVar.ak = this.ak;
        bojhVar.al = this.al;
        bojhVar.am = this.am;
        bojhVar.an = this.an;
        bojhVar.ao = this.ao;
        bojhVar.ap = this.ap;
        bojhVar.aq = this.aq;
        bojhVar.ar = this.ar;
        bojhVar.as = this.as;
        bojhVar.at = this.at;
        bojhVar.au = this.au;
        bojhVar.av = this.av;
        bojhVar.aw = this.aw;
        bojhVar.ax = this.ax;
        bojhVar.ay = this.ay;
        bojhVar.cM = aC();
        return bojhVar;
    }

    public final void c(bvdk bvdkVar) {
        aE(16);
        this.q = bvdkVar;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 49060) {
            dqru.x("awaiting_reverse_sync", i);
        }
        aE(59);
        this.ah = z;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 60250) {
            dqru.x("cms_correlation_id", i);
        }
        aE(74);
        this.aw = str;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 32000) {
            dqru.x("cms_id", i);
        }
        aE(51);
        this.Z = str;
    }

    public final void g(cpyi cpyiVar) {
        int i = this.aB;
        if (i < 58210) {
            dqru.x("cms_life_cycle", i);
        }
        aE(63);
        this.al = cpyiVar;
    }

    public final void h(long j) {
        int i = this.aB;
        if (i < 53030) {
            dqru.x("cms_most_recent_read_message_timestamp_ms", i);
        }
        aE(55);
        this.ad = j;
    }

    public final void i(int i) {
        int i2 = this.aB;
        if (i2 < 10007) {
            dqru.x("conv_type", i2);
        }
        aE(40);
        this.O = i;
    }

    public final void j(axcm axcmVar) {
        int i = this.aB;
        if (i < 60160) {
            dqru.x("current_my_identity_foreign_key", i);
        }
        aE(27);
        this.B = axcmVar;
    }

    public final void k(String str) {
        aE(26);
        this.A = str;
    }

    public final void l(cidt cidtVar) {
        int i = this.aB;
        if (i < 59820) {
            dqru.x("custom_theme", i);
        }
        aE(69);
        this.ar = cidtVar;
    }

    public final void m(long j) {
        int i = this.aB;
        if (i < 29020) {
            dqru.x("delete_timestamp", i);
        }
        aE(50);
        this.Y = j;
    }

    public final void n(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 58090) {
            dqru.x("duplicate_of", i);
        }
        aE(60);
        this.ai = conversationIdType;
    }

    public final void o(awjl awjlVar) {
        int i = this.aB;
        if (i < 60360) {
            dqru.x("destination_token", i);
        }
        aE(28);
        this.C = awjlVar;
    }

    public final void p(int i) {
        int i2 = this.aB;
        if (i2 < 29060) {
            dqru.x("etouffee_default", i2);
        }
        aE(15);
        this.p = i;
    }

    public final void q(String str) {
        aE(14);
        this.o = str;
    }

    public final void r(Uri uri) {
        aE(13);
        this.n = uri;
    }

    public final void s(String str) {
        aE(11);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.l = str;
    }

    public final void t(String str) {
        aE(12);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.m = str;
    }

    public final void u(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 59130) {
            dqru.x("new_duplicate_of", i);
        }
        aE(61);
        this.aj = conversationIdType;
    }

    public final void v(cbqx cbqxVar) {
        int i = this.aB;
        if (i < 60210) {
            dqru.x("encryption_id", i);
        }
        aE(73);
        this.av = cbqxVar;
    }

    public final void w(cbqz cbqzVar) {
        int i = this.aB;
        if (i < 60180) {
            dqru.x("encryption_protocol", i);
        }
        aE(72);
        this.au = cbqzVar;
    }

    public final void x(avoe avoeVar) {
        int i = this.aB;
        if (i < 58140) {
            dqru.x("error_state", i);
        }
        aE(62);
        this.ak = avoeVar;
    }

    public final void y(boolean z) {
        int i = this.aB;
        if (i < 59210) {
            dqru.x("has_been_e2ee", i);
        }
        aE(67);
        this.ap = z;
    }

    public final void z(boolean z) {
        int i = this.aB;
        if (i < 12001) {
            dqru.x("has_ea2p_bot_recipient", i);
        }
        aE(43);
        this.R = z;
    }
}
