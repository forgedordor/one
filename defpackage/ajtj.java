package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajtj extends ajwj {
    public final akbl A;
    public final akbk B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final cins F;
    public final cbqz G;
    public final awjl H;
    public final Instant I;
    public final boolean J;
    public final boolean K;
    public final Uri L;
    public final boolean M;
    public final ConversationId a;
    public final boolean b;
    public final bvdk c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;
    public final boolean k;
    public final avoe l;
    public final int m;
    public final elwp n;
    public final String o;
    public final String p;
    public final aoer q;
    public final Uri r;
    public final long s;
    public final String t;
    public final Instant u;
    public final cgrc v;
    public final cgrb w;
    public final akcy x;
    public final boolean y;
    public final akgk z;

    public ajtj(ConversationId conversationId, boolean z, bvdk bvdkVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, int i, boolean z7, avoe avoeVar, int i2, elwp elwpVar, String str2, String str3, aoer aoerVar, Uri uri, long j, String str4, Instant instant, cgrc cgrcVar, cgrb cgrbVar, akcy akcyVar, boolean z8, akgk akgkVar, akbl akblVar, akbk akbkVar, boolean z9, boolean z10, boolean z11, cins cinsVar, cbqz cbqzVar, awjl awjlVar, Instant instant2, boolean z12, boolean z13, Uri uri2, boolean z14) {
        this.a = conversationId;
        this.b = z;
        this.c = bvdkVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = str;
        this.j = i;
        this.k = z7;
        this.l = avoeVar;
        this.m = i2;
        this.n = elwpVar;
        this.o = str2;
        this.p = str3;
        this.q = aoerVar;
        this.r = uri;
        this.s = j;
        this.t = str4;
        this.u = instant;
        this.v = cgrcVar;
        this.w = cgrbVar;
        this.x = akcyVar;
        this.y = z8;
        this.z = akgkVar;
        this.A = akblVar;
        this.B = akbkVar;
        this.C = z9;
        this.D = z10;
        this.E = z11;
        this.F = cinsVar;
        this.G = cbqzVar;
        this.H = awjlVar;
        this.I = instant2;
        this.J = z12;
        this.K = z13;
        this.L = uri2;
        this.M = z14;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final int A() {
        return this.j;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final int B() {
        return this.m;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final long C() {
        return this.s;
    }

    @Override // defpackage.ajwj
    public final ajwi D() {
        return new ajti(this);
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final akgk E() {
        return this.z;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final avoe F() {
        return this.l;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final awjl G() {
        return this.H;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final cins H() {
        return this.F;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final elwp I() {
        return this.n;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final Instant J() {
        return this.u;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final Instant K() {
        return this.I;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final String L() {
        return this.t;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final String M() {
        return this.o;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final String N() {
        return this.p;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final boolean O() {
        return this.k;
    }

    @Override // defpackage.ajwj, defpackage.ajts
    public final boolean P() {
        return this.y;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final Uri a() {
        return this.r;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final Uri b() {
        return this.L;
    }

    @Override // defpackage.ajlk
    public final ConversationId d() {
        return this.a;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final akbk e() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        aoer aoerVar;
        Uri uri;
        String str4;
        Instant instant;
        akcy akcyVar;
        Uri uri2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwj) {
            ajwj ajwjVar = (ajwj) obj;
            if (this.a.equals(ajwjVar.d()) && this.b == ajwjVar.w() && this.c.equals(ajwjVar.i()) && this.d == ajwjVar.z() && this.e == ajwjVar.u() && this.f == ajwjVar.t() && this.g == ajwjVar.y() && this.h == ajwjVar.p() && ((str = this.i) != null ? str.equals(ajwjVar.m()) : ajwjVar.m() == null) && this.j == ajwjVar.A() && this.k == ajwjVar.O() && this.l.equals(ajwjVar.F()) && this.m == ajwjVar.B() && this.n.equals(ajwjVar.I()) && ((str2 = this.o) != null ? str2.equals(ajwjVar.M()) : ajwjVar.M() == null) && ((str3 = this.p) != null ? str3.equals(ajwjVar.N()) : ajwjVar.N() == null) && ((aoerVar = this.q) != null ? aoerVar.equals(ajwjVar.h()) : ajwjVar.h() == null) && ((uri = this.r) != null ? uri.equals(ajwjVar.a()) : ajwjVar.a() == null) && this.s == ajwjVar.C() && ((str4 = this.t) != null ? str4.equals(ajwjVar.L()) : ajwjVar.L() == null) && ((instant = this.u) != null ? instant.equals(ajwjVar.J()) : ajwjVar.J() == null) && this.v.equals(ajwjVar.l()) && this.w.equals(ajwjVar.k()) && ((akcyVar = this.x) != null ? akcyVar.equals(ajwjVar.g()) : ajwjVar.g() == null) && this.y == ajwjVar.P() && this.z.equals(ajwjVar.E()) && this.A.equals(ajwjVar.f()) && this.B.equals(ajwjVar.e()) && this.C == ajwjVar.o() && this.D == ajwjVar.r() && this.E == ajwjVar.q() && this.F.equals(ajwjVar.H()) && this.G.equals(ajwjVar.j())) {
                ajwjVar.Q();
                if (this.H.equals(ajwjVar.G()) && this.I.equals(ajwjVar.K()) && this.J == ajwjVar.v() && this.K == ajwjVar.x() && ((uri2 = this.L) != null ? uri2.equals(ajwjVar.b()) : ajwjVar.b() == null) && this.M == ajwjVar.s()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final akbl f() {
        return this.A;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final akcy g() {
        return this.x;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final aoer h() {
        return this.q;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        String str = this.i;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = true != this.d ? 1237 : 1231;
        int i2 = iHashCode * 1000003;
        int i3 = true != this.e ? 1237 : 1231;
        int i4 = (i2 ^ i) * 1000003;
        int iHashCode3 = (((((((((((((((((((i4 ^ i3) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ iHashCode2) * 1000003) ^ this.j) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003;
        String str2 = this.o;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.p;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        aoer aoerVar = this.q;
        int iHashCode6 = (iHashCode5 ^ (aoerVar == null ? 0 : aoerVar.hashCode())) * 1000003;
        Uri uri = this.r;
        int iHashCode7 = uri == null ? 0 : uri.hashCode();
        long j = this.s;
        int i5 = (((iHashCode6 ^ iHashCode7) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str4 = this.t;
        int iHashCode8 = (i5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Instant instant = this.u;
        int iHashCode9 = (((((iHashCode8 ^ (instant == null ? 0 : instant.hashCode())) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003;
        akcy akcyVar = this.x;
        int iHashCode10 = (((((((((((((((((((((((((((iHashCode9 ^ (akcyVar == null ? 0 : akcyVar.hashCode())) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003) ^ (true != this.C ? 1237 : 1231)) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ (true != this.E ? 1237 : 1231)) * 1000003) ^ this.F.hashCode()) * 1000003) ^ this.G.hashCode()) * (-721379959)) ^ this.H.hashCode()) * 1000003) ^ this.I.hashCode()) * 1000003) ^ (true != this.J ? 1237 : 1231)) * 1000003) ^ (true != this.K ? 1237 : 1231)) * 1000003;
        Uri uri2 = this.L;
        return ((iHashCode10 ^ (uri2 != null ? uri2.hashCode() : 0)) * 1000003) ^ (true == this.M ? 1231 : 1237);
    }

    @Override // defpackage.ajlk
    public final bvdk i() {
        return this.c;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final cbqz j() {
        return this.G;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final cgrb k() {
        return this.w;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final cgrc l() {
        return this.v;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final String m() {
        return this.i;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final boolean o() {
        return this.C;
    }

    @Override // defpackage.ajlk
    public final boolean p() {
        return this.h;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final boolean q() {
        return this.E;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final boolean r() {
        return this.D;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final boolean s() {
        return this.M;
    }

    @Override // defpackage.ajlk
    public final boolean t() {
        return this.f;
    }

    @Override // defpackage.ajlk
    public final boolean u() {
        return this.e;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final boolean v() {
        return this.J;
    }

    @Override // defpackage.ajlk
    public final boolean w() {
        return this.b;
    }

    @Override // defpackage.ajwj, defpackage.ajlk
    public final boolean x() {
        return this.K;
    }

    @Override // defpackage.ajlk
    public final boolean y() {
        return this.g;
    }

    @Override // defpackage.ajlk
    public final boolean z() {
        return this.d;
    }

    @Override // defpackage.ajwj
    public final void Q() {
    }
}
