package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyb implements nyf {
    private static final byte[] c = {73, 68, 51};
    private final boolean d;
    private final String g;
    private final int h;
    private final String i;
    private String j;
    private nox k;
    private nox l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int t;
    private boolean u;
    private int v;
    private nox w;
    private long x;
    private final mfq e = new mfq(new byte[7]);
    private final mfr f = new mfr(Arrays.copyOf(c, 10));
    private int r = -1;
    private int s = -1;
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;

    public nyb(boolean z, String str, int i, String str2) {
        this.d = z;
        this.g = str;
        this.h = i;
        this.i = str2;
        h();
    }

    public static boolean f(int i) {
        return (i & 65526) == 65520;
    }

    private final void g() {
        this.q = false;
        h();
    }

    private final void h() {
        this.m = 0;
        this.n = 0;
        this.o = 256;
    }

    private final void i() {
        this.m = 3;
        this.n = 0;
    }

    private final void j(nox noxVar, long j, int i, int i2) {
        this.m = 4;
        this.n = i;
        this.w = noxVar;
        this.x = j;
        this.v = i2;
    }

    private final boolean k(mfr mfrVar, byte[] bArr, int i) {
        int iMin = Math.min(mfrVar.a(), i - this.n);
        mfrVar.F(bArr, this.n, iMin);
        int i2 = this.n + iMin;
        this.n = i2;
        return i2 == i;
    }

    private static final boolean l(byte b) {
        return f((b & 255) | 65280);
    }

    private static final boolean m(mfr mfrVar, byte[] bArr, int i) {
        if (mfrVar.a() < i) {
            return false;
        }
        mfrVar.F(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022f, code lost:
    
        r17.m = 1;
        r17.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0235, code lost:
    
        i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0238, code lost:
    
        r18.K(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x021b, code lost:
    
        r17.t = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0224, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0226, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0228, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0229, code lost:
    
        r17.p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022d, code lost:
    
        if (r17.q != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021b A[EDGE_INSN: B:143:0x021b->B:94:0x021b BREAK  A[LOOP:1: B:48:0x0178->B:169:0x0178], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    @Override // defpackage.nyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.mfr r18) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyb.a(mfr):void");
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.j = nzqVar.b();
        nox noxVarP = nnuVar.p(nzqVar.a(), 1);
        this.k = noxVarP;
        this.w = noxVarP;
        if (!this.d) {
            this.l = new nno();
            return;
        }
        nzqVar.c();
        nox noxVarP2 = nnuVar.p(nzqVar.a(), 5);
        this.l = noxVarP2;
        mat matVar = new mat();
        matVar.a = nzqVar.b();
        matVar.a(this.i);
        matVar.c("application/id3");
        noxVarP2.i(new mau(matVar));
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.b = -9223372036854775807L;
        g();
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
    }
}
