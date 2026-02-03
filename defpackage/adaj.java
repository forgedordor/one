package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adaj extends adan {
    public CharSequence A;
    public String B;
    public String C;
    public String D;
    public String E;
    public Integer F;
    public Integer G;
    public ekhx H;
    public Boolean I;
    public String J;
    public adal K;
    public int L;
    private acyx M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private boolean Z;
    public String a;
    private boolean aa;
    private boolean ab;
    public Typeface b;
    public Integer c;
    public Integer d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Typeface j;
    public Typeface k;
    public Typeface l;
    public Long m;
    public String n;
    public Integer o;
    public Integer p;
    public Integer q;
    public String r;
    public String s;
    public Integer t;
    public boolean u;
    public bbew v;
    public String w;
    public Integer x;
    public Integer y;
    public Integer z;

    public adaj() {
    }

    @Override // defpackage.adan
    public final adao a() {
        acyx acyxVar;
        if (this.L == 131071 && (acyxVar = this.M) != null) {
            return new adak(acyxVar, this.a, this.b, this.c, this.d, this.N, this.e, this.f, this.g, this.h, this.i, this.O, this.P, this.Q, this.R, this.S, this.j, this.k, this.l, this.T, this.m, this.U, this.V, this.n, this.o, this.p, this.q, this.W, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.A, this.Z, this.aa, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.ab, this.K);
        }
        StringBuilder sb = new StringBuilder();
        if (this.M == null) {
            sb.append(" bindData");
        }
        if ((this.L & 1) == 0) {
            sb.append(" typefaceStyle");
        }
        if ((this.L & 2) == 0) {
            sb.append(" maxLines");
        }
        if ((this.L & 4) == 0) {
            sb.append(" subjectVisibility");
        }
        if ((this.L & 8) == 0) {
            sb.append(" incoming");
        }
        if ((this.L & 16) == 0) {
            sb.append(" read");
        }
        if ((this.L & 32) == 0) {
            sb.append(" snoozeIconVisibility");
        }
        if ((this.L & 64) == 0) {
            sb.append(" workProfileIconVisibility");
        }
        if ((this.L & 128) == 0) {
            sb.append(" containsVerifiedSmsParticipant");
        }
        if ((this.L & 256) == 0) {
            sb.append(" isReminderTextVisible");
        }
        if ((this.L & 512) == 0) {
            sb.append(" isReminderIconVisible");
        }
        if ((this.L & 1024) == 0) {
            sb.append(" isNudged");
        }
        if ((this.L & 2048) == 0) {
            sb.append(" addRtlPaddingAndShadow");
        }
        if ((this.L & 4096) == 0) {
            sb.append(" hasMediaPreviewVisible");
        }
        if ((this.L & 8192) == 0) {
            sb.append(" unreadBadgeVisibility");
        }
        if ((this.L & 16384) == 0) {
            sb.append(" pinIconVisibility");
        }
        if ((this.L & 32768) == 0) {
            sb.append(" isBirthday");
        }
        if ((this.L & 65536) == 0) {
            sb.append(" isEmergencyRcs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.adan
    public final void b(acyx acyxVar) {
        if (acyxVar == null) {
            throw new NullPointerException("Null bindData");
        }
        this.M = acyxVar;
    }

    @Override // defpackage.adan
    public final void c(boolean z) {
        this.T = z;
        this.L |= 128;
    }

    @Override // defpackage.adan
    public final void d(boolean z) {
        this.X = z;
        this.L |= 4096;
    }

    @Override // defpackage.adan
    public final void e(boolean z) {
        this.P = z;
        this.L |= 8;
    }

    @Override // defpackage.adan
    public final void f(boolean z) {
        this.aa = z;
        this.L |= 32768;
    }

    @Override // defpackage.adan
    public final void g(boolean z) {
        this.ab = z;
        this.L |= 65536;
    }

    @Override // defpackage.adan
    public final void h(boolean z) {
        this.W = z;
        this.L |= 1024;
    }

    @Override // defpackage.adan
    public final void i(boolean z) {
        this.V = z;
        this.L |= 512;
    }

    @Override // defpackage.adan
    public final void j(boolean z) {
        this.U = z;
        this.L |= 256;
    }

    @Override // defpackage.adan
    public final void k(boolean z) {
        this.Z = z;
        this.L |= 16384;
    }

    @Override // defpackage.adan
    public final void l(boolean z) {
        this.Q = z;
        this.L |= 16;
    }

    @Override // defpackage.adan
    public final void m(int i) {
        this.R = i;
        this.L |= 32;
    }

    @Override // defpackage.adan
    public final void n(int i) {
        this.O = i;
        this.L |= 4;
    }

    @Override // defpackage.adan
    public final void o(int i) {
        this.N = i;
        this.L |= 1;
    }

    @Override // defpackage.adan
    public final void p(int i) {
        this.Y = i;
        this.L |= 8192;
    }

    @Override // defpackage.adan
    public final void q(int i) {
        this.S = i;
        this.L |= 64;
    }

    public adaj(adao adaoVar) {
        adak adakVar = (adak) adaoVar;
        this.M = adakVar.a;
        this.a = adakVar.b;
        this.b = adakVar.c;
        this.c = adakVar.d;
        this.d = adakVar.e;
        this.N = adakVar.f;
        this.e = adakVar.g;
        this.f = adakVar.h;
        this.g = adakVar.i;
        this.h = adakVar.j;
        this.i = adakVar.k;
        this.O = adakVar.l;
        this.P = adakVar.m;
        this.Q = adakVar.n;
        this.R = adakVar.o;
        this.S = adakVar.p;
        this.j = adakVar.q;
        this.k = adakVar.r;
        this.l = adakVar.s;
        this.T = adakVar.t;
        this.m = adakVar.u;
        this.U = adakVar.v;
        this.V = adakVar.w;
        this.n = adakVar.x;
        this.o = adakVar.y;
        this.p = adakVar.z;
        this.q = adakVar.A;
        this.W = adakVar.B;
        this.r = adakVar.C;
        this.s = adakVar.D;
        this.t = adakVar.E;
        this.u = adakVar.F;
        this.v = adakVar.G;
        this.w = adakVar.H;
        this.x = adakVar.I;
        this.y = adakVar.J;
        this.z = adakVar.K;
        this.X = adakVar.L;
        this.Y = adakVar.M;
        this.A = adakVar.N;
        this.Z = adakVar.O;
        this.aa = adakVar.P;
        this.B = adakVar.Q;
        this.C = adakVar.R;
        this.D = adakVar.S;
        this.E = adakVar.T;
        this.F = adakVar.U;
        this.G = adakVar.V;
        this.H = adakVar.W;
        this.I = adakVar.X;
        this.J = adakVar.Y;
        this.ab = adakVar.Z;
        this.K = adakVar.aa;
        this.L = 131071;
    }
}
