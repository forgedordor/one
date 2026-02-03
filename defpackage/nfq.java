package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfq implements nel, nnu, nja, njd, nga {
    public static final Map a;
    public static final mau b;
    private final mhl A;
    private final nap B;
    private final nak C;
    private final mau D;
    private final long E;
    private boolean H;
    private boolean I;
    private boolean J;
    private nfp K;
    private boolean M;
    private boolean N;
    private int O;
    private final niu Q;
    public final nex c;
    public final nfm d;
    public final nff g;
    public nek k;
    public nqv l;
    public boolean n;
    public noq o;
    public long p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    private final Uri z;
    public final long e = 1048576;
    public final njg f = new njg(new njl(mgb.R("ExoPlayer:Loader:ProgressiveMediaPeriod"), new meo() { // from class: niz
        @Override // defpackage.meo
        public final void a(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    }));
    private final mem F = new mem();
    public final Runnable h = new Runnable() { // from class: nfh
        @Override // java.lang.Runnable
        public final void run() {
            this.a.s();
        }
    };
    public final Runnable i = new Runnable() { // from class: nfi
        @Override // java.lang.Runnable
        public final void run() {
            nfq nfqVar = this.a;
            if (nfqVar.x) {
                return;
            }
            nek nekVar = nfqVar.k;
            mee.f(nekVar);
            nekVar.b(nfqVar);
        }
    };
    public final Handler j = mgb.E();
    private nfo[] G = new nfo[0];
    public ngb[] m = new ngb[0];
    private long P = -9223372036854775807L;
    private int L = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        a = DesugarCollections.unmodifiableMap(map);
        mat matVar = new mat();
        matVar.a = "icy";
        matVar.c("application/x-icy");
        b = new mau(matVar);
    }

    public nfq(Uri uri, mhl mhlVar, nff nffVar, nap napVar, nak nakVar, nex nexVar, nfm nfmVar, niu niuVar, int i, mau mauVar, long j) {
        this.z = uri;
        this.A = mhlVar;
        this.B = napVar;
        this.C = nakVar;
        this.c = nexVar;
        this.d = nfmVar;
        this.Q = niuVar;
        this.D = mauVar;
        this.g = nffVar;
        this.E = j;
    }

    private final void A() {
        mee.c(this.n);
        mee.f(this.K);
        mee.f(this.o);
    }

    private final void B() {
        nfl nflVar = new nfl(this, this.z, this.A, this.g, this, this.F);
        if (this.n) {
            mee.c(C());
            long j = this.p;
            if (j != -9223372036854775807L && this.P > j) {
                this.w = true;
                this.P = -9223372036854775807L;
                return;
            }
            noq noqVar = this.o;
            mee.f(noqVar);
            nflVar.b(noqVar.b(this.P).a.c, this.P);
            for (ngb ngbVar : this.m) {
                ngbVar.g = this.P;
            }
            this.P = -9223372036854775807L;
        }
        this.v = b();
        njg njgVar = this.f;
        Looper looperMyLooper = Looper.myLooper();
        mee.g(looperMyLooper);
        njgVar.d = null;
        SystemClock.elapsedRealtime();
        new njc(njgVar, looperMyLooper, nflVar, this).b(0L);
    }

    private final boolean C() {
        return this.P != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[RETURN] */
    @Override // defpackage.nel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r23, defpackage.mtq r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r0.A()
            noq r4 = r0.o
            boolean r4 = r4.y()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            noq r4 = r0.o
            noo r4 = r4.b(r1)
            nor r7 = r4.a
            nor r4 = r4.b
            long r8 = r3.c
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.d
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.b
            java.lang.String r7 = defpackage.mgb.a
            long r12 = r1 - r8
            long r8 = r8 ^ r1
            long r14 = r1 ^ r12
            r16 = r5
            long r5 = r3.d
            long r18 = r1 + r5
            long r20 = r1 ^ r18
            long r5 = r5 ^ r18
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 >= 0) goto L46
            r12 = -9223372036854775808
        L46:
            long r5 = r20 & r5
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L51
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L51:
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 > 0) goto L5d
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 > 0) goto L5d
            r3 = r5
            goto L5e
        L5d:
            r3 = r6
        L5e:
            long r7 = r4.b
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L69
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 > 0) goto L69
            goto L6a
        L69:
            r5 = r6
        L6a:
            if (r3 == 0) goto L7f
            if (r5 == 0) goto L7f
            long r3 = r10 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L84
            goto L81
        L7f:
            if (r3 == 0) goto L82
        L81:
            return r10
        L82:
            if (r5 == 0) goto L85
        L84:
            return r7
        L85:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfq.a(long, mtq):long");
    }

    public final int b() {
        int iC = 0;
        for (ngb ngbVar : this.m) {
            iC += ngbVar.c();
        }
        return iC;
    }

    @Override // defpackage.nel, defpackage.nge
    public final long c() {
        long jD;
        A();
        if (this.w || this.O == 0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.P;
        }
        if (this.I) {
            int length = this.m.length;
            jD = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                nfp nfpVar = this.K;
                if (nfpVar.b[i] && nfpVar.c[i] && !this.m[i].q()) {
                    jD = Math.min(jD, this.m[i].f());
                }
            }
        } else {
            jD = Long.MAX_VALUE;
        }
        if (jD == Long.MAX_VALUE) {
            jD = d(false);
        }
        return jD == Long.MIN_VALUE ? this.t : jD;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            ngb[] r3 = r5.m
            int r3 = r3.length
            if (r0 >= r3) goto L24
            if (r6 != 0) goto L15
            nfp r3 = r5.K
            defpackage.mee.f(r3)
            boolean[] r3 = r3.c
            boolean r3 = r3[r0]
            if (r3 == 0) goto L21
        L15:
            ngb[] r3 = r5.m
            r3 = r3[r0]
            long r3 = r3.f()
            long r1 = java.lang.Math.max(r1, r3)
        L21:
            int r0 = r0 + 1
            goto L3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfq.d(boolean):long");
    }

    @Override // defpackage.nel, defpackage.nge
    public final long e() {
        return c();
    }

    @Override // defpackage.nel
    public final long f() {
        if (this.N) {
            this.N = false;
        } else {
            if (!this.r) {
                return -9223372036854775807L;
            }
            if (!this.w && b() <= this.v) {
                return -9223372036854775807L;
            }
            this.r = false;
        }
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    @Override // defpackage.nel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(long r9) {
        /*
            r8 = this;
            r8.A()
            nfp r0 = r8.K
            boolean[] r0 = r0.b
            noq r1 = r8.o
            boolean r1 = r1.y()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.r = r1
            long r2 = r8.t
            r8.t = r9
            boolean r4 = r8.C()
            if (r4 == 0) goto L22
            r8.P = r9
            return r9
        L22:
            int r4 = r8.L
            r5 = 7
            if (r4 == r5) goto L65
            boolean r4 = r8.w
            if (r4 != 0) goto L33
            njg r4 = r8.f
            boolean r4 = r4.b()
            if (r4 == 0) goto L65
        L33:
            ngb[] r4 = r8.m
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto L96
            ngb[] r6 = r8.m
            r6 = r6[r5]
            int r7 = r6.a()
            if (r7 != 0) goto L48
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 != 0) goto L48
            goto L62
        L48:
            boolean r7 = r8.J
            if (r7 == 0) goto L53
            int r7 = r6.e
            boolean r6 = r6.s(r7)
            goto L57
        L53:
            boolean r6 = r6.t(r9, r1)
        L57:
            if (r6 != 0) goto L62
            boolean r6 = r0[r5]
            if (r6 != 0) goto L65
            boolean r6 = r8.I
            if (r6 != 0) goto L62
            goto L65
        L62:
            int r5 = r5 + 1
            goto L37
        L65:
            r8.u = r1
            r8.P = r9
            r8.w = r1
            r8.N = r1
            njg r0 = r8.f
            boolean r2 = r0.b()
            if (r2 == 0) goto L86
            ngb[] r2 = r8.m
            int r3 = r2.length
        L78:
            if (r1 >= r3) goto L82
            r4 = r2[r1]
            r4.h()
            int r1 = r1 + 1
            goto L78
        L82:
            r0.a()
            return r9
        L86:
            r2 = 0
            r0.d = r2
            ngb[] r0 = r8.m
            int r2 = r0.length
        L8c:
            if (r1 >= r2) goto L96
            r3 = r0[r1]
            r3.k()
            int r1 = r1 + 1
            goto L8c
        L96:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfq.g(long):long");
    }

    @Override // defpackage.nel
    public final long h(nif[] nifVarArr, boolean[] zArr, ngc[] ngcVarArr, boolean[] zArr2, long j) {
        nif nifVar;
        A();
        nfp nfpVar = this.K;
        ngo ngoVar = nfpVar.a;
        boolean[] zArr3 = nfpVar.c;
        int i = this.O;
        int i2 = 0;
        for (int i3 = 0; i3 < nifVarArr.length; i3++) {
            ngc ngcVar = ngcVarArr[i3];
            if (ngcVar != null && (nifVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((nfn) ngcVar).a;
                mee.c(zArr3[i4]);
                this.O--;
                zArr3[i4] = false;
                ngcVarArr[i3] = null;
            }
        }
        boolean z = !this.M ? j == 0 || this.J : i != 0;
        for (int i5 = 0; i5 < nifVarArr.length; i5++) {
            if (ngcVarArr[i5] == null && (nifVar = nifVarArr[i5]) != null) {
                mee.c(nifVar.h() == 1);
                mee.c(nifVar.e(0) == 0);
                int iA = ngoVar.a(nifVar.c());
                mee.c(!zArr3[iA]);
                this.O++;
                zArr3[iA] = true;
                this.N = nifVar.b().u | this.N;
                ngcVarArr[i5] = new nfn(this, iA);
                zArr2[i5] = true;
                if (!z) {
                    ngb ngbVar = this.m[iA];
                    z = (ngbVar.a() == 0 || ngbVar.t(j, true)) ? false : true;
                }
            }
        }
        if (this.O == 0) {
            this.u = false;
            this.r = false;
            this.N = false;
            njg njgVar = this.f;
            if (njgVar.b()) {
                ngb[] ngbVarArr = this.m;
                int length = ngbVarArr.length;
                while (i2 < length) {
                    ngbVarArr[i2].h();
                    i2++;
                }
                njgVar.a();
            } else {
                this.w = false;
                ngb[] ngbVarArr2 = this.m;
                int length2 = ngbVarArr2.length;
                while (i2 < length2) {
                    ngbVarArr2[i2].k();
                    i2++;
                }
            }
        } else if (z) {
            j = g(j);
            while (i2 < ngcVarArr.length) {
                if (ngcVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.M = true;
        return j;
    }

    @Override // defpackage.nel
    public final ngo i() {
        A();
        return this.K.a;
    }

    @Override // defpackage.nel
    public final void j() throws IOException {
        v();
        if (this.w && !this.n) {
            throw new mby("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // defpackage.nel
    public final void k(nek nekVar, long j) {
        this.k = nekVar;
        mau mauVar = this.D;
        if (mauVar == null) {
            this.F.e();
            B();
        } else {
            p(0, 3).i(mauVar);
            x(new noi(new long[]{0}, new long[]{0}, -9223372036854775807L));
            r();
            this.P = j;
        }
    }

    public final nox m(nfo nfoVar) {
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            if (nfoVar.equals(this.G[i])) {
                return this.m[i];
            }
        }
        if (this.H) {
            mff.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + nfoVar.a + ") after finishing tracks.");
            return new nno();
        }
        ngb ngbVar = new ngb(this.Q, this.B, this.C);
        ngbVar.c = this;
        int i2 = length + 1;
        nfo[] nfoVarArr = (nfo[]) Arrays.copyOf(this.G, i2);
        nfoVarArr[length] = nfoVar;
        String str = mgb.a;
        this.G = nfoVarArr;
        ngb[] ngbVarArr = (ngb[]) Arrays.copyOf(this.m, i2);
        ngbVarArr[length] = ngbVar;
        this.m = ngbVarArr;
        return ngbVar;
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean n(msd msdVar) {
        if (this.w) {
            return false;
        }
        njg njgVar = this.f;
        if (njgVar.d != null || this.u) {
            return false;
        }
        if ((this.n || this.D != null) && this.O == 0) {
            return false;
        }
        boolean zE = this.F.e();
        if (njgVar.b()) {
            return zE;
        }
        B();
        return true;
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean o() {
        return this.f.b() && this.F.d();
    }

    @Override // defpackage.nnu
    public final nox p(int i, int i2) {
        return m(new nfo(i, false));
    }

    @Override // defpackage.nel
    public final void q(long j) {
        if (this.J) {
            return;
        }
        A();
        if (C()) {
            return;
        }
        boolean[] zArr = this.K.c;
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            ngb ngbVar = this.m[i];
            ngbVar.a.c(ngbVar.u(j, zArr[i]));
        }
    }

    @Override // defpackage.nnu
    public final void r() {
        this.H = true;
        this.j.post(this.h);
    }

    public final void s() {
        int i;
        if (this.x || this.n || !this.H || this.o == null) {
            return;
        }
        for (ngb ngbVar : this.m) {
            if (ngbVar.g() == null) {
                return;
            }
        }
        this.F.f();
        int length = this.m.length;
        mcm[] mcmVarArr = new mcm[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            mau mauVarG = this.m[i2].g();
            mee.f(mauVarG);
            String str = mauVarG.o;
            boolean zI = mbw.i(str);
            boolean z = zI || mbw.l(str);
            zArr[i2] = z;
            this.I = z | this.I;
            this.J = this.E != -9223372036854775807L && length == 1 && mbw.j(str);
            nqv nqvVar = this.l;
            if (nqvVar != null) {
                if (zI || this.G[i2].b) {
                    mbt mbtVar = mauVarG.l;
                    mbt mbtVar2 = mbtVar == null ? new mbt(nqvVar) : mbtVar.c(nqvVar);
                    mat matVar = new mat(mauVarG);
                    matVar.k = mbtVar2;
                    mauVarG = new mau(matVar);
                }
                if (zI && mauVarG.h == -1 && mauVarG.i == -1 && (i = nqvVar.a) != -1) {
                    mat matVar2 = new mat(mauVarG);
                    matVar2.h = i;
                    mauVarG = new mau(matVar2);
                }
            }
            mau mauVarB = mauVarG.b(this.B.a(mauVarG));
            mcmVarArr[i2] = new mcm(Integer.toString(i2), mauVarB);
            this.N = mauVarB.u | this.N;
        }
        this.K = new nfp(new ngo(mcmVarArr), zArr);
        if (this.J && this.p == -9223372036854775807L) {
            this.p = this.E;
            this.o = new nfk(this, this.o);
        }
        this.d.a(this.p, this.o, this.q);
        this.n = true;
        nek nekVar = this.k;
        mee.f(nekVar);
        nekVar.d(this);
    }

    public final void t(int i) {
        A();
        nfp nfpVar = this.K;
        boolean[] zArr = nfpVar.d;
        if (zArr[i]) {
            return;
        }
        mau mauVarA = nfpVar.a.b(i).a(0);
        this.c.b(new nej(mbw.b(mauVarA.o), mauVarA, mgb.B(this.t), -9223372036854775807L));
        zArr[i] = true;
    }

    public final void u(int i) {
        A();
        if (this.u) {
            if (!this.I || this.K.b[i]) {
                if (this.m[i].r(false)) {
                    return;
                }
                this.P = 0L;
                this.u = false;
                this.r = true;
                this.t = 0L;
                this.v = 0;
                for (ngb ngbVar : this.m) {
                    ngbVar.k();
                }
                nek nekVar = this.k;
                mee.f(nekVar);
                nekVar.b(this);
            }
        }
    }

    final void v() throws IOException {
        IOException iOException;
        int iA = nix.a(this.L);
        njg njgVar = this.f;
        IOException iOException2 = njgVar.d;
        if (iOException2 != null) {
            throw iOException2;
        }
        njc njcVar = njgVar.c;
        if (njcVar != null && (iOException = njcVar.a) != null && njcVar.b > iA) {
            throw iOException;
        }
    }

    @Override // defpackage.nnu
    public final void w(final noq noqVar) {
        this.j.post(new Runnable() { // from class: nfj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x(noqVar);
            }
        });
    }

    public final void x(noq noqVar) {
        this.o = this.l == null ? noqVar : new nop(-9223372036854775807L);
        this.p = noqVar.w();
        boolean z = false;
        if (!this.s && noqVar.w() == -9223372036854775807L) {
            z = true;
        }
        this.q = z;
        this.L = true == z ? 7 : 1;
        if (this.n) {
            this.d.a(this.p, noqVar, z);
        } else {
            s();
        }
    }

    public final boolean y() {
        return this.r || C();
    }

    @Override // defpackage.nja
    public final /* bridge */ /* synthetic */ void z(nfl nflVar, boolean z) {
        mim mimVar = nflVar.c;
        long j = nflVar.a;
        mht mhtVar = nflVar.k;
        this.c.c(new nee(), new nej(-1, null, mgb.B(nflVar.j), mgb.B(this.p)));
        if (z) {
            return;
        }
        for (ngb ngbVar : this.m) {
            ngbVar.k();
        }
        if (this.O > 0) {
            nek nekVar = this.k;
            mee.f(nekVar);
            nekVar.b(this);
        }
    }

    @Override // defpackage.nel, defpackage.nge
    public final void l(long j) {
    }
}
