package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.BitSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bscl extends dqpg {
    public String A;
    public String B;
    public String C;
    public byte[] D;
    public byte[] E;
    public boolean F;
    public long G;
    public String H;
    public String I;
    public long J;
    public String K;
    public String L;
    public boolean M;
    public long N;
    public byte[] O;
    public byte[] P;
    public boolean Q;
    public boolean R;
    public long S;
    public String T;
    public bvdr U;
    public dqbw V;
    public bvef W;
    public athh X;
    public bvdy Y;
    public bvdq Z;
    public String a;
    public boolean aa;
    public MessageIdType b;
    public String c;
    public String d;
    public Uri e;
    public String f;
    public Uri g;
    public Uri h;
    public int i;
    public int j;
    public long k;
    public Uri l;
    public long m;
    public bvdt n;
    public bvdl o;
    public ConversationIdType p;
    public bvdg q;
    public bvdg r;
    public long s;
    public double t;
    public double u;
    public Uri v;
    public String w;
    public Uri x;
    public int y;
    public int z;

    public bscl() {
        super(PartsTable.g());
        this.b = bary.a;
        this.i = -1;
        this.j = -1;
        this.m = 0L;
        this.n = bvdt.SUCCEEDED;
        this.o = bvdl.NOT_FROM_CMS;
        this.p = barn.a;
        this.q = new bvdg(-1);
        this.r = new bvdg(-1);
        this.s = -1L;
        this.t = 0.0d;
        this.u = 0.0d;
        this.y = 13;
        this.z = 0;
        this.F = false;
        this.G = 0L;
        this.M = false;
        this.N = 0L;
        this.R = false;
        this.U = bvdr.STANDARD;
        this.W = bvef.UNKNOWN;
        this.X = null;
        this.Y = bvdy.NONE;
        this.Z = bvdq.DEFAULT_NO_VERDICT;
        this.aa = false;
    }

    public final void A(int i) {
        aE(9);
        this.j = i;
    }

    public final void B(String str) {
        aE(0);
        this.a = str;
    }

    public final void C(bvdq bvdqVar) {
        int i = this.aB;
        if (i < 60240) {
            dqru.x("image_display_state", i);
        }
        aE(51);
        this.Z = bvdqVar;
    }

    public final void D(double d) {
        int i = this.aB;
        if (i < 10005) {
            dqru.x("latitude", i);
        }
        aE(20);
        this.u = d;
    }

    public final void E(String str) {
        int i = this.aB;
        if (i < 52050) {
            dqru.x("local_cache_path", i);
        }
        aE(45);
        this.T = str;
    }

    public final void F(double d) {
        int i = this.aB;
        if (i < 10005) {
            dqru.x("longitude", i);
        }
        aE(19);
        this.t = d;
    }

    public final void G(byte[] bArr) {
        int i = this.aB;
        if (i < 30040) {
            dqru.x("media_encryption_key", i);
        }
        aE(40);
        this.O = bArr;
    }

    public final void H(long j) {
        int i = this.aB;
        if (i < 7000) {
            dqru.x("media_modified_timestamp", i);
        }
        aE(18);
        this.s = j;
    }

    public final void I(bvdr bvdrVar) {
        int i = this.aB;
        if (i < 58150) {
            dqru.x("media_send_type", i);
        }
        aE(46);
        this.U = bvdrVar;
    }

    public final void J(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void K(boolean z) {
        int i = this.aB;
        if (i < 52030) {
            dqru.x("missing_entry_in_telephony", i);
        }
        aE(42);
        this.Q = z;
    }

    public final void L(Uri uri) {
        int i = this.aB;
        if (i < 10021) {
            dqru.x("original_uri", i);
        }
        aE(6);
        this.g = uri;
    }

    public final void M(boolean z) {
        int i = this.aB;
        if (i < 60680) {
            dqru.x("preserve_size", i);
        }
        aE(52);
        this.aa = z;
    }

    public final void N(String str) {
        int i = this.aB;
        if (i < 10017) {
            dqru.x("preview_content_type", i);
        }
        aE(22);
        this.w = str;
    }

    public final void O(Uri uri) {
        int i = this.aB;
        if (i < 10017) {
            dqru.x("preview_content_uri", i);
        }
        aE(21);
        this.v = uri;
    }

    public final void P(athh athhVar) {
        int i = this.aB;
        if (i < 60080) {
            dqru.x("processing_id", i);
        }
        aE(49);
        this.X = athhVar;
    }

    public final void Q(Uri uri) {
        int i = this.aB;
        if (i < 4020) {
            dqru.x("output_uri", i);
        }
        aE(11);
        this.l = uri;
    }

    public final void R(bvdt bvdtVar) {
        int i = this.aB;
        if (i < 4020) {
            dqru.x("processing_status", i);
        }
        aE(13);
        this.n = bvdtVar;
    }

    public final void S(String str) {
        int i = this.aB;
        if (i < 60990) {
            dqru.x("raw_text", i);
        }
        aE(3);
        this.d = str;
    }

    public final void T(bvdy bvdyVar) {
        int i = this.aB;
        if (i < 60230) {
            dqru.x("rich_card_media_download_failure_reason", i);
        }
        aE(50);
        this.Y = bvdyVar;
    }

    public final void U(int i) {
        int i2 = this.aB;
        if (i2 < 14010) {
            dqru.x("source", i2);
        }
        aE(24);
        this.y = i;
    }

    public final void V(bvdg bvdgVar) {
        int i = this.aB;
        if (i < 5020) {
            dqru.x("sticker_id", i);
        }
        aE(17);
        this.r = bvdgVar;
    }

    public final void W(bvdg bvdgVar) {
        int i = this.aB;
        if (i < 5020) {
            dqru.x("sticker_set_id", i);
        }
        aE(16);
        this.q = bvdgVar;
    }

    public final void X(Uri uri) {
        int i = this.aB;
        if (i < 29060) {
            dqru.x("storage_uri", i);
        }
        aE(7);
        this.h = uri;
    }

    public final void Y(long j) {
        int i = this.aB;
        if (i < 4020) {
            dqru.x("target_size", i);
        }
        aE(12);
        this.m = j;
    }

    public final void Z(String str) {
        aE(2);
        if (!this.aC) {
            str = cssq.a(str);
        }
        this.c = str;
    }

    public final PartsTable.BindData a() {
        return b(new Supplier() { // from class: bsck
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bsch();
            }
        });
    }

    public final void aa(long j) {
        int i = this.aB;
        if (i < 3010) {
            dqru.x("timestamp", i);
        }
        aE(10);
        this.k = j;
    }

    public final void ab(Uri uri) {
        aE(4);
        this.e = uri;
    }

    public final void ac(bvef bvefVar) {
        int i = this.aB;
        if (i < 58770) {
            dqru.x("validation_status", i);
        }
        aE(48);
        this.W = bvefVar;
    }

    public final void ad(dqbw dqbwVar) {
        int i = this.aB;
        if (i < 59470) {
            dqru.x("voice_metadata", i);
        }
        aE(47);
        this.V = dqbwVar;
    }

    public final void ae(int i) {
        aE(8);
        this.i = i;
    }

    public final PartsTable.BindData b(Supplier supplier) {
        PartsTable.BindData bindData = (PartsTable.BindData) supplier.get();
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
        bindData.cM = aC();
        return bindData;
    }

    public final void c(PartsTable.BindData bindData, boolean z, BitSet bitSet) {
        this.az = bitSet == null ? null : (BitSet) bitSet.clone();
        if (z) {
            BitSet bitSet2 = this.az;
            if (bitSet2 != null) {
                bitSet2.clear(0);
            }
        } else {
            BitSet bitSet3 = this.az;
            if (bitSet3 == null || bitSet3.get(0)) {
                this.a = bindData.K();
            }
        }
        BitSet bitSet4 = this.az;
        if (bitSet4 == null || bitSet4.get(1)) {
            this.b = bindData.v();
        }
        BitSet bitSet5 = this.az;
        if (bitSet5 == null || bitSet5.get(2)) {
            this.c = bindData.L();
        }
        BitSet bitSet6 = this.az;
        if (bitSet6 == null || bitSet6.get(3)) {
            bindData.aA(3, "raw_text");
            this.d = bindData.d;
        }
        BitSet bitSet7 = this.az;
        if (bitSet7 == null || bitSet7.get(4)) {
            this.e = bindData.t();
        }
        BitSet bitSet8 = this.az;
        if (bitSet8 == null || bitSet8.get(5)) {
            this.f = bindData.I();
        }
        BitSet bitSet9 = this.az;
        if (bitSet9 == null || bitSet9.get(6)) {
            bindData.aA(6, "original_uri");
            this.g = bindData.g;
        }
        BitSet bitSet10 = this.az;
        if (bitSet10 == null || bitSet10.get(7)) {
            bindData.aA(7, "storage_uri");
            this.h = bindData.h;
        }
        BitSet bitSet11 = this.az;
        if (bitSet11 == null || bitSet11.get(8)) {
            this.i = bindData.o();
        }
        BitSet bitSet12 = this.az;
        if (bitSet12 == null || bitSet12.get(9)) {
            this.j = bindData.n();
        }
        BitSet bitSet13 = this.az;
        if (bitSet13 == null || bitSet13.get(10)) {
            bindData.aA(10, "timestamp");
            this.k = bindData.k;
        }
        BitSet bitSet14 = this.az;
        if (bitSet14 == null || bitSet14.get(11)) {
            bindData.aA(11, "output_uri");
            this.l = bindData.l;
        }
        BitSet bitSet15 = this.az;
        if (bitSet15 == null || bitSet15.get(12)) {
            this.m = bindData.s();
        }
        BitSet bitSet16 = this.az;
        if (bitSet16 == null || bitSet16.get(13)) {
            bindData.aA(13, "processing_status");
            this.n = bindData.n;
        }
        BitSet bitSet17 = this.az;
        if (bitSet17 == null || bitSet17.get(14)) {
            this.o = bindData.y();
        }
        BitSet bitSet18 = this.az;
        if (bitSet18 == null || bitSet18.get(15)) {
            this.p = bindData.u();
        }
        BitSet bitSet19 = this.az;
        if (bitSet19 == null || bitSet19.get(16)) {
            bindData.aA(16, "sticker_set_id");
            this.q = bindData.q;
        }
        BitSet bitSet20 = this.az;
        if (bitSet20 == null || bitSet20.get(17)) {
            bindData.aA(17, "sticker_id");
            this.r = bindData.r;
        }
        BitSet bitSet21 = this.az;
        if (bitSet21 == null || bitSet21.get(18)) {
            bindData.aA(18, "media_modified_timestamp");
            this.s = bindData.s;
        }
        BitSet bitSet22 = this.az;
        if (bitSet22 == null || bitSet22.get(19)) {
            this.t = bindData.m();
        }
        BitSet bitSet23 = this.az;
        if (bitSet23 == null || bitSet23.get(20)) {
            this.u = bindData.k();
        }
        BitSet bitSet24 = this.az;
        if (bitSet24 == null || bitSet24.get(21)) {
            bindData.aA(21, "preview_content_uri");
            this.v = bindData.v;
        }
        BitSet bitSet25 = this.az;
        if (bitSet25 == null || bitSet25.get(22)) {
            bindData.aA(22, "preview_content_type");
            this.w = bindData.w;
        }
        BitSet bitSet26 = this.az;
        if (bitSet26 == null || bitSet26.get(23)) {
            bindData.aA(23, "fallback_uri");
            this.x = bindData.x;
        }
        BitSet bitSet27 = this.az;
        if (bitSet27 == null || bitSet27.get(24)) {
            bindData.aA(24, "source");
            this.y = bindData.y;
        }
        BitSet bitSet28 = this.az;
        if (bitSet28 == null || bitSet28.get(25)) {
            bindData.aA(25, "bundle_index");
            this.z = bindData.z;
        }
        BitSet bitSet29 = this.az;
        if (bitSet29 == null || bitSet29.get(26)) {
            this.A = bindData.E();
        }
        BitSet bitSet30 = this.az;
        if (bitSet30 == null || bitSet30.get(27)) {
            this.B = bindData.D();
        }
        BitSet bitSet31 = this.az;
        if (bitSet31 == null || bitSet31.get(28)) {
            this.C = bindData.G();
        }
        BitSet bitSet32 = this.az;
        if (bitSet32 == null || bitSet32.get(29)) {
            this.D = bindData.Q();
        }
        BitSet bitSet33 = this.az;
        if (bitSet33 == null || bitSet33.get(30)) {
            bindData.aA(30, "cms_compressed_media_encryption_key");
            this.E = bindData.E;
        }
        BitSet bitSet34 = this.az;
        if (bitSet34 == null || bitSet34.get(31)) {
            this.F = bindData.O();
        }
        BitSet bitSet35 = this.az;
        if (bitSet35 == null || bitSet35.get(32)) {
            this.G = bindData.p();
        }
        BitSet bitSet36 = this.az;
        if (bitSet36 == null || bitSet36.get(33)) {
            bindData.aA(33, "expressive_sticker_name");
            this.H = bindData.H;
        }
        BitSet bitSet37 = this.az;
        if (bitSet37 == null || bitSet37.get(34)) {
            this.I = bindData.J();
        }
        BitSet bitSet38 = this.az;
        if (bitSet38 == null || bitSet38.get(35)) {
            this.J = bindData.r();
        }
        BitSet bitSet39 = this.az;
        if (bitSet39 == null || bitSet39.get(36)) {
            this.K = bindData.H();
        }
        BitSet bitSet40 = this.az;
        if (bitSet40 == null || bitSet40.get(37)) {
            this.L = bindData.F();
        }
        BitSet bitSet41 = this.az;
        if (bitSet41 == null || bitSet41.get(38)) {
            this.M = bindData.P();
        }
        BitSet bitSet42 = this.az;
        if (bitSet42 == null || bitSet42.get(39)) {
            this.N = bindData.q();
        }
        BitSet bitSet43 = this.az;
        if (bitSet43 == null || bitSet43.get(40)) {
            this.O = bindData.S();
        }
        BitSet bitSet44 = this.az;
        if (bitSet44 == null || bitSet44.get(41)) {
            this.P = bindData.R();
        }
        BitSet bitSet45 = this.az;
        if (bitSet45 == null || bitSet45.get(42)) {
            bindData.aA(42, "missing_entry_in_telephony");
            this.Q = bindData.Q;
        }
        BitSet bitSet46 = this.az;
        if (bitSet46 == null || bitSet46.get(43)) {
            bindData.aA(43, "awaiting_reverse_sync");
            this.R = bindData.R;
        }
        BitSet bitSet47 = this.az;
        if (bitSet47 == null || bitSet47.get(44)) {
            bindData.aA(44, "file_size_bytes");
            this.S = bindData.S;
        }
        BitSet bitSet48 = this.az;
        if (bitSet48 == null || bitSet48.get(45)) {
            bindData.aA(45, "local_cache_path");
            this.T = bindData.T;
        }
        BitSet bitSet49 = this.az;
        if (bitSet49 == null || bitSet49.get(46)) {
            bindData.aA(46, "media_send_type");
            this.U = bindData.U;
        }
        BitSet bitSet50 = this.az;
        if (bitSet50 == null || bitSet50.get(47)) {
            this.V = bindData.A();
        }
        BitSet bitSet51 = this.az;
        if (bitSet51 == null || bitSet51.get(48)) {
            bindData.aA(48, "validation_status");
            this.W = bindData.W;
        }
        BitSet bitSet52 = this.az;
        if (bitSet52 == null || bitSet52.get(49)) {
            bindData.aA(49, "processing_id");
            this.X = bindData.X;
        }
        BitSet bitSet53 = this.az;
        if (bitSet53 == null || bitSet53.get(50)) {
            bindData.aA(50, "rich_card_media_download_failure_reason");
            this.Y = bindData.Y;
        }
        BitSet bitSet54 = this.az;
        if (bitSet54 == null || bitSet54.get(51)) {
            this.Z = bindData.z();
        }
        BitSet bitSet55 = this.az;
        if (bitSet55 == null || bitSet55.get(52)) {
            bindData.aA(52, "preserve_size");
            this.aa = bindData.aa;
        }
    }

    public final void d() {
        b(new Supplier() { // from class: bscj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bsch();
            }
        }).C();
    }

    public final void e(boolean z) {
        int i = this.aB;
        if (i < 53040) {
            dqru.x("awaiting_reverse_sync", i);
        }
        aE(43);
        this.R = z;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 59570) {
            dqru.x("blob_gaia_email", i);
        }
        aE(27);
        this.B = str;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 17020) {
            dqru.x("blob_id", i);
        }
        aE(26);
        this.A = str;
    }

    public final void h(boolean z) {
        int i = this.aB;
        if (i < 18000) {
            dqru.x("blob_upload_permanent_failure", i);
        }
        aE(31);
        this.F = z;
    }

    public final void i(long j) {
        int i = this.aB;
        if (i < 19030) {
            dqru.x("blob_upload_timestamp", i);
        }
        aE(32);
        this.G = j;
    }

    public final void j(int i) {
        int i2 = this.aB;
        if (i2 < 17010) {
            dqru.x("bundle_index", i2);
        }
        aE(25);
        this.z = i;
    }

    public final void k(bvdl bvdlVar) {
        int i = this.aB;
        if (i < 44010) {
            dqru.x("cms_attachment_processing_status", i);
        }
        aE(14);
        this.o = bvdlVar;
    }

    public final void l(String str) {
        int i = this.aB;
        if (i < 40040) {
            dqru.x("cms_compressed_blob_id", i);
        }
        aE(37);
        this.L = str;
    }

    public final void m(byte[] bArr) {
        int i = this.aB;
        if (i < 42070) {
            dqru.x("cms_compressed_media_encryption_key", i);
        }
        aE(30);
        this.E = bArr;
    }

    public final void n(String str) {
        int i = this.aB;
        if (i < 40040) {
            dqru.x("cms_full_size_blob_id", i);
        }
        aE(28);
        this.C = str;
    }

    public final void o(byte[] bArr) {
        int i = this.aB;
        if (i < 42010) {
            dqru.x("cms_media_encryption_key", i);
        }
        aE(29);
        this.D = bArr;
    }

    public final void p(String str) {
        int i = this.aB;
        if (i < 27000) {
            dqru.x("compressed_blob_id", i);
        }
        aE(36);
        this.K = str;
    }

    public final void q(boolean z) {
        int i = this.aB;
        if (i < 27000) {
            dqru.x("compressed_blob_upload_permanent_failure", i);
        }
        aE(38);
        this.M = z;
    }

    public final void r(long j) {
        int i = this.aB;
        if (i < 27000) {
            dqru.x("compressed_blob_upload_timestamp", i);
        }
        aE(39);
        this.N = j;
    }

    public final void s(byte[] bArr) {
        int i = this.aB;
        if (i < 30040) {
            dqru.x("compressed_media_encryption_key", i);
        }
        aE(41);
        this.P = bArr;
    }

    public final void t(String str) {
        aE(5);
        this.f = str;
    }

    public final void u(ConversationIdType conversationIdType) {
        aE(15);
        this.p = conversationIdType;
    }

    public final void v(long j) {
        int i = this.aB;
        if (i < 26040) {
            dqru.x("duration", i);
        }
        aE(35);
        this.J = j;
    }

    public final void w(String str) {
        int i = this.aB;
        if (i < 22060) {
            dqru.x("expressive_sticker_name", i);
        }
        aE(33);
        this.H = str;
    }

    public final void x(Uri uri) {
        int i = this.aB;
        if (i < 13000) {
            dqru.x("fallback_uri", i);
        }
        aE(23);
        this.x = uri;
    }

    public final void y(String str) {
        int i = this.aB;
        if (i < 26000) {
            dqru.x("file_name", i);
        }
        aE(34);
        this.I = str;
    }

    public final void z(long j) {
        int i = this.aB;
        if (i < 52050) {
            dqru.x("file_size_bytes", i);
        }
        aE(44);
        this.S = j;
    }
}
