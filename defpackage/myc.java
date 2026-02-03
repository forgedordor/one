package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myc {
    private Method A;
    private long B;
    private int C;
    private int D;
    private long E;
    private long F;
    public AudioTrack a;
    public int b;
    public myb c;
    public int d;
    public boolean e;
    public long f;
    public float g;
    public long h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public boolean t;
    public long u;
    public mej v;
    public final myt w;
    private final long[] x;
    private long y;
    private long z;

    public myc(myt mytVar) {
        this.w = mytVar;
        try {
            this.A = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.x = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.v = mej.a;
    }

    private final long e(long j) {
        long jMax = Math.max(0L, (this.D == 0 ? this.p != -9223372036854775807L ? mgb.x(f(), this.d) : c() : mgb.u(j + this.y, this.g)) - this.j);
        return this.p != -9223372036854775807L ? Math.min(mgb.x(this.s, this.d), jMax) : jMax;
    }

    private final long f() {
        AudioTrack audioTrack = this.a;
        mee.f(audioTrack);
        if (audioTrack.getPlayState() == 2) {
            return this.r;
        }
        return this.r + mgb.t(mgb.u(mgb.w(SystemClock.elapsedRealtime()) - this.p, this.g), this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myc.a():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r10 = this;
            long r0 = r10.p
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6f
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.B
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L63
            android.media.AudioTrack r4 = r10.a
            defpackage.mee.f(r4)
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L26
            goto L61
        L26:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 29
            if (r4 > r8) goto L52
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L50
            long r6 = r10.m
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L4f
            r4 = 3
            if (r5 != r4) goto L4f
            long r4 = r10.q
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L61
            r10.q = r0
            goto L61
        L4f:
            r6 = r8
        L50:
            r10.q = r2
        L52:
            long r2 = r10.m
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L5f
            long r2 = r10.n
            r4 = 1
            long r2 = r2 + r4
            r10.n = r2
        L5f:
            r10.m = r6
        L61:
            r10.B = r0
        L63:
            long r0 = r10.m
            long r2 = r10.u
            long r0 = r0 + r2
            long r2 = r10.n
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        L6f:
            long r0 = r10.f()
            long r2 = r10.s
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myc.b():long");
    }

    public final long c() {
        return mgb.x(b(), this.d);
    }

    public final void d() {
        this.y = 0L;
        this.D = 0;
        this.C = 0;
        this.z = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
    }
}
