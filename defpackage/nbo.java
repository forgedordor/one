package defpackage;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbo extends mpc {
    private nbn A;
    private int B;
    private boolean C;
    private final nbh j;
    private final mix k;
    private final ArrayDeque l;
    private boolean m;
    private boolean n;
    private nbm o;
    private long p;
    private long q;
    private int r;
    private int s;
    private mau t;
    private nbi u;
    private mix v;
    private ImageOutput w;
    private Bitmap x;
    private boolean y;
    private nbn z;

    public nbo(nbh nbhVar) {
        super(4);
        this.j = nbhVar;
        this.w = W(null);
        this.k = new mix(0);
        this.o = nbm.a;
        this.l = new ArrayDeque();
        this.q = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.r = 0;
        this.s = 1;
    }

    private static ImageOutput W(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.a : imageOutput;
    }

    private final void X() {
        this.v = null;
        this.r = 0;
        this.q = -9223372036854775807L;
        nbi nbiVar = this.u;
        if (nbiVar != null) {
            nbiVar.e();
            this.u = null;
        }
    }

    private final void Y() {
        this.s = Math.min(this.s, 1);
    }

    private final void Z() throws mpn {
        if (this.C) {
            mau mauVar = this.t;
            mee.f(mauVar);
            int iA = this.j.a(mauVar);
            if (iA != mti.a(4) && iA != mti.a(3)) {
                throw h(new nbj(), this.t, 4005);
            }
            nbi nbiVar = this.u;
            if (nbiVar != null) {
                nbiVar.e();
            }
            this.u = new nbg();
            this.C = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.mpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void B(defpackage.mau[] r5, long r6, long r8, defpackage.nen r10) {
        /*
            r4 = this;
            nbm r5 = r4.o
            long r5 = r5.c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.l
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.q
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.p
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            nbm r6 = new nbm
            long r0 = r4.q
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            nbm r5 = new nbm
            r5.<init>(r0, r8)
            r4.o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbo.B(mau[], long, long, nen):void");
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "ImageRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ab A[Catch: nbj -> 0x0239, TryCatch #0 {nbj -> 0x0239, blocks: (B:17:0x0040, B:18:0x0045, B:20:0x004c, B:65:0x011f, B:67:0x0123, B:133:0x0235, B:70:0x0129, B:72:0x0131, B:74:0x0135, B:76:0x0139, B:78:0x013d, B:80:0x0147, B:82:0x014b, B:83:0x0163, B:87:0x016e, B:89:0x0179, B:98:0x0191, B:99:0x01a0, B:101:0x01ab, B:121:0x01f5, B:123:0x0200, B:124:0x0205, B:126:0x0216, B:128:0x0221, B:127:0x0219, B:102:0x01ae, B:104:0x01c0, B:106:0x01c9, B:110:0x01d2, B:112:0x01d6, B:117:0x01e1, B:120:0x01ef, B:93:0x0182, B:131:0x0226, B:23:0x0052, B:25:0x0056, B:28:0x005c, B:30:0x0069, B:32:0x006f, B:34:0x0073, B:35:0x0080, B:37:0x008b, B:38:0x008f, B:39:0x009d, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:47:0x00b8, B:48:0x00bf, B:53:0x00d7, B:54:0x00dc, B:58:0x00e3, B:59:0x00f6, B:61:0x00fe, B:63:0x010a, B:64:0x0113), top: B:138:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ae A[Catch: nbj -> 0x0239, TryCatch #0 {nbj -> 0x0239, blocks: (B:17:0x0040, B:18:0x0045, B:20:0x004c, B:65:0x011f, B:67:0x0123, B:133:0x0235, B:70:0x0129, B:72:0x0131, B:74:0x0135, B:76:0x0139, B:78:0x013d, B:80:0x0147, B:82:0x014b, B:83:0x0163, B:87:0x016e, B:89:0x0179, B:98:0x0191, B:99:0x01a0, B:101:0x01ab, B:121:0x01f5, B:123:0x0200, B:124:0x0205, B:126:0x0216, B:128:0x0221, B:127:0x0219, B:102:0x01ae, B:104:0x01c0, B:106:0x01c9, B:110:0x01d2, B:112:0x01d6, B:117:0x01e1, B:120:0x01ef, B:93:0x0182, B:131:0x0226, B:23:0x0052, B:25:0x0056, B:28:0x005c, B:30:0x0069, B:32:0x006f, B:34:0x0073, B:35:0x0080, B:37:0x008b, B:38:0x008f, B:39:0x009d, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:47:0x00b8, B:48:0x00bf, B:53:0x00d7, B:54:0x00dc, B:58:0x00e3, B:59:0x00f6, B:61:0x00fe, B:63:0x010a, B:64:0x0113), top: B:138:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0205 A[Catch: nbj -> 0x0239, TryCatch #0 {nbj -> 0x0239, blocks: (B:17:0x0040, B:18:0x0045, B:20:0x004c, B:65:0x011f, B:67:0x0123, B:133:0x0235, B:70:0x0129, B:72:0x0131, B:74:0x0135, B:76:0x0139, B:78:0x013d, B:80:0x0147, B:82:0x014b, B:83:0x0163, B:87:0x016e, B:89:0x0179, B:98:0x0191, B:99:0x01a0, B:101:0x01ab, B:121:0x01f5, B:123:0x0200, B:124:0x0205, B:126:0x0216, B:128:0x0221, B:127:0x0219, B:102:0x01ae, B:104:0x01c0, B:106:0x01c9, B:110:0x01d2, B:112:0x01d6, B:117:0x01e1, B:120:0x01ef, B:93:0x0182, B:131:0x0226, B:23:0x0052, B:25:0x0056, B:28:0x005c, B:30:0x0069, B:32:0x006f, B:34:0x0073, B:35:0x0080, B:37:0x008b, B:38:0x008f, B:39:0x009d, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:47:0x00b8, B:48:0x00bf, B:53:0x00d7, B:54:0x00dc, B:58:0x00e3, B:59:0x00f6, B:61:0x00fe, B:63:0x010a, B:64:0x0113), top: B:138:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x011f A[EDGE_INSN: B:147:0x011f->B:161:? BREAK  A[LOOP:0: B:18:0x0045->B:64:0x0113], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147 A[Catch: nbj -> 0x0239, PHI: r11
      0x0147: PHI (r11v4 mix) = (r11v3 mix), (r11v14 mix) binds: [B:77:0x013b, B:79:0x0145] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {nbj -> 0x0239, blocks: (B:17:0x0040, B:18:0x0045, B:20:0x004c, B:65:0x011f, B:67:0x0123, B:133:0x0235, B:70:0x0129, B:72:0x0131, B:74:0x0135, B:76:0x0139, B:78:0x013d, B:80:0x0147, B:82:0x014b, B:83:0x0163, B:87:0x016e, B:89:0x0179, B:98:0x0191, B:99:0x01a0, B:101:0x01ab, B:121:0x01f5, B:123:0x0200, B:124:0x0205, B:126:0x0216, B:128:0x0221, B:127:0x0219, B:102:0x01ae, B:104:0x01c0, B:106:0x01c9, B:110:0x01d2, B:112:0x01d6, B:117:0x01e1, B:120:0x01ef, B:93:0x0182, B:131:0x0226, B:23:0x0052, B:25:0x0056, B:28:0x005c, B:30:0x0069, B:32:0x006f, B:34:0x0073, B:35:0x0080, B:37:0x008b, B:38:0x008f, B:39:0x009d, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:47:0x00b8, B:48:0x00bf, B:53:0x00d7, B:54:0x00dc, B:58:0x00e3, B:59:0x00f6, B:61:0x00fe, B:63:0x010a, B:64:0x0113), top: B:138:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191 A[Catch: nbj -> 0x0239, TryCatch #0 {nbj -> 0x0239, blocks: (B:17:0x0040, B:18:0x0045, B:20:0x004c, B:65:0x011f, B:67:0x0123, B:133:0x0235, B:70:0x0129, B:72:0x0131, B:74:0x0135, B:76:0x0139, B:78:0x013d, B:80:0x0147, B:82:0x014b, B:83:0x0163, B:87:0x016e, B:89:0x0179, B:98:0x0191, B:99:0x01a0, B:101:0x01ab, B:121:0x01f5, B:123:0x0200, B:124:0x0205, B:126:0x0216, B:128:0x0221, B:127:0x0219, B:102:0x01ae, B:104:0x01c0, B:106:0x01c9, B:110:0x01d2, B:112:0x01d6, B:117:0x01e1, B:120:0x01ef, B:93:0x0182, B:131:0x0226, B:23:0x0052, B:25:0x0056, B:28:0x005c, B:30:0x0069, B:32:0x006f, B:34:0x0073, B:35:0x0080, B:37:0x008b, B:38:0x008f, B:39:0x009d, B:41:0x00a1, B:43:0x00a5, B:45:0x00a9, B:47:0x00b8, B:48:0x00bf, B:53:0x00d7, B:54:0x00dc, B:58:0x00e3, B:59:0x00f6, B:61:0x00fe, B:63:0x010a, B:64:0x0113), top: B:138:0x0040 }] */
    @Override // defpackage.mth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(long r18, long r20) throws defpackage.mpn {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbo.S(long, long):void");
    }

    @Override // defpackage.mth
    public final boolean T() {
        return this.n;
    }

    @Override // defpackage.mth
    public final boolean U() {
        int i = this.s;
        if (i != 3) {
            return i == 0 && this.y;
        }
        return true;
    }

    @Override // defpackage.mtk
    public final int V(mau mauVar) {
        return this.j.a(mauVar);
    }

    @Override // defpackage.mpc, defpackage.mtd
    public final void r(int i, Object obj) {
        if (i != 15) {
            return;
        }
        this.w = W(obj instanceof ImageOutput ? (ImageOutput) obj : null);
    }

    @Override // defpackage.mpc
    protected final void u() {
        this.t = null;
        this.o = nbm.a;
        this.l.clear();
        X();
        this.w.a();
    }

    @Override // defpackage.mpc
    protected final void v(boolean z, boolean z2) {
        this.s = z2 ? 1 : 0;
    }

    @Override // defpackage.mpc
    protected final void w(long j, boolean z) {
        Y();
        this.n = false;
        this.m = false;
        this.x = null;
        this.z = null;
        this.A = null;
        this.y = false;
        this.v = null;
        nbi nbiVar = this.u;
        if (nbiVar != null) {
            nbiVar.c();
        }
        this.l.clear();
    }

    @Override // defpackage.mpc
    protected final void x() {
        X();
    }

    @Override // defpackage.mpc
    protected final void y() {
        X();
        Y();
    }
}
