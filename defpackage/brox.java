package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brox extends dqpg {
    public int A;
    public String B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public int G;
    public String H;
    public bvdz I;
    public String J;
    public byte[] K;
    public long L;
    public boolean M;
    public boolean N;
    public String O;
    public cpyi P;
    public alwm Q;
    public bbaj R;
    public chpq S;
    public chpq T;
    public chpm U;
    public anuc V;
    public boolean W;
    public String a;
    public Instant b;
    public long c;
    public String d;
    public axcm e;
    public axcm f;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;
    public String o;
    public String p;
    public String q;
    public Uri r;
    public Uri s;
    public long t;
    public String u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public String z;

    public brox() {
        super(brvd.f());
        this.b = Instant.EPOCH;
        this.e = null;
        this.f = null;
        this.Q = alwm.b(0);
        this.R = bbaj.a;
        this.S = chpq.b(0);
        this.T = chpq.b(0);
        this.U = chpm.b(0);
    }

    public final void A(bvdz bvdzVar) {
        aE(34);
        this.I = bvdzVar;
    }

    public final void B(String str) {
        aE(20);
        this.u = str;
    }

    public final void C(axcm axcmVar) {
        int i = this.aB;
        if (i < 59930) {
            dqru.x("my_identity_token", i);
        }
        aE(4);
        this.e = axcmVar;
    }

    public final void D(axcm axcmVar) {
        int i = this.aB;
        if (i < 60160) {
            dqru.x("my_identity_token_foreign_key", i);
        }
        aE(5);
        this.f = axcmVar;
    }

    public final void E(chpq chpqVar) {
        int i = this.aB;
        if (i < 59550) {
            dqru.x("name_source", i);
        }
        aE(44);
        this.S = chpqVar;
    }

    public final void F(alwm alwmVar) {
        aE(42);
        this.Q = alwmVar;
    }

    public final void G(String str) {
        aE(8);
        this.i = str;
    }

    public final void H(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void I(long j) {
        aE(2);
        this.c = j;
    }

    public final void J(String str) {
        aE(3);
        this.d = str;
    }

    public final void K(int i) {
        aE(28);
        this.C = i;
    }

    public final void L(chpq chpqVar) {
        int i = this.aB;
        if (i < 59550) {
            dqru.x("photo_source", i);
        }
        aE(45);
        this.T = chpqVar;
    }

    public final void M(String str) {
        aE(35);
        this.J = str;
    }

    public final void N(byte[] bArr) {
        aE(36);
        this.K = bArr;
    }

    public final void O(chpm chpmVar) {
        int i = this.aB;
        if (i < 60060) {
            dqru.x("profile_photo_user_preference", i);
        }
        aE(46);
        this.U = chpmVar;
    }

    public final brov a() {
        brow browVar = new brow();
        browVar.aD(aB());
        browVar.a = this.a;
        browVar.b = this.b;
        browVar.c = this.c;
        browVar.d = this.d;
        browVar.e = this.e;
        browVar.f = this.f;
        browVar.g = this.g;
        browVar.h = this.h;
        browVar.i = this.i;
        browVar.j = this.j;
        browVar.k = this.k;
        browVar.l = this.l;
        browVar.m = this.m;
        browVar.n = this.n;
        browVar.o = this.o;
        browVar.p = this.p;
        browVar.q = this.q;
        browVar.r = this.r;
        browVar.s = this.s;
        browVar.t = this.t;
        browVar.u = this.u;
        browVar.v = this.v;
        browVar.w = this.w;
        browVar.x = this.x;
        browVar.y = this.y;
        browVar.z = this.z;
        browVar.A = this.A;
        browVar.B = this.B;
        browVar.C = this.C;
        browVar.D = this.D;
        browVar.E = this.E;
        browVar.F = this.F;
        browVar.G = this.G;
        browVar.H = this.H;
        browVar.I = this.I;
        browVar.J = this.J;
        browVar.K = this.K;
        browVar.L = this.L;
        browVar.M = this.M;
        browVar.N = this.N;
        browVar.O = this.O;
        browVar.P = this.P;
        browVar.Q = this.Q;
        browVar.R = this.R;
        browVar.S = this.S;
        browVar.T = this.T;
        browVar.U = this.U;
        browVar.V = this.V;
        browVar.W = this.W;
        browVar.cM = aC();
        return browVar;
    }

    public final void b(String str) {
        aE(30);
        this.E = str;
    }

    public final void c(boolean z) {
        aE(24);
        this.y = z;
    }

    public final void d(String str) {
        aE(33);
        this.H = str;
    }

    public final void e(cpyi cpyiVar) {
        aE(41);
        this.P = cpyiVar;
    }

    public final void f(int i) {
        aE(21);
        this.v = i;
    }

    public final void g(int i) {
        aE(22);
        this.w = i;
    }

    public final void h(String str) {
        aE(11);
        this.l = str;
    }

    public final void i(String str) {
        aE(27);
        this.B = str;
    }

    public final void j(long j) {
        aE(19);
        this.t = j;
    }

    public final void k(anuc anucVar) {
        int i = this.aB;
        if (i < 60070) {
            dqru.x("contact_metadata", i);
        }
        aE(47);
        this.V = anucVar;
    }

    public final void l(Uri uri) {
        int i = this.aB;
        if (i < 59850) {
            dqru.x("contact_photo_uri", i);
        }
        aE(18);
        this.s = uri;
    }

    public final void m(String str) {
        aE(12);
        this.m = str;
    }

    public final void n(long j) {
        aE(37);
        this.L = j;
    }

    public final void o(String str) {
        aE(10);
        this.k = str;
    }

    public final void p(String str) {
        aE(40);
        this.O = str;
    }

    public final void q(int i) {
        aE(23);
        this.x = i;
    }

    public final void r(String str) {
        aE(16);
        this.q = str;
    }

    public final void s(String str) {
        aE(15);
        this.p = str;
    }

    public final void t(String str) {
        aE(0);
        this.a = str;
    }

    public final void u(boolean z) {
        aE(38);
        this.M = z;
    }

    public final void v(boolean z) {
        int i = this.aB;
        if (i < 60640) {
            dqru.x("is_enterprise_contact", i);
        }
        aE(48);
        this.W = z;
    }

    public final void w(boolean z) {
        aE(31);
        this.F = z;
    }

    public final void x(int i) {
        aE(32);
        this.G = i;
    }

    public final void y(boolean z) {
        aE(39);
        this.N = z;
    }

    public final void z(bbaj bbajVar) {
        int i = this.aB;
        if (i < 59440) {
            dqru.x("last_modified_by_key", i);
        }
        aE(43);
        this.R = bbajVar;
    }
}
