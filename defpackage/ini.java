package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ini {
    public final inl a;
    public ikd e;
    public ikd f;
    public boolean g;
    public imu h;
    public ikb i;
    public int j;
    public boolean l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    private Outline s;
    private float v;
    private ijz w;
    private RectF x;
    public kio b = imx.a;
    public kji c = kji.a;
    private fdap q = inh.a;
    private final fdap r = new ing(this);
    public boolean d = true;
    private long t = 0;
    private long u = 9205357640488583168L;
    public final ine k = new ine();

    static {
        int i = inr.a;
    }

    public ini(inl inlVar) {
        this.a = inlVar;
        inlVar.x(false);
        this.m = 0L;
        this.n = 0L;
        this.o = 9205357640488583168L;
    }

    private final Outline n() {
        Outline outline = this.s;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.s = outline2;
        return outline2;
    }

    private final void o() {
        this.j--;
        e();
    }

    private final void p() {
        this.w = null;
        this.e = null;
        this.u = 9205357640488583168L;
        this.t = 0L;
        this.v = 0.0f;
        this.d = true;
        this.g = false;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.h();
    }

    public final ijz c() {
        ijz ijxVar;
        ijz ijzVar = this.w;
        ikd ikdVar = this.e;
        if (ijzVar != null) {
            return ijzVar;
        }
        if (ikdVar != null) {
            ijw ijwVar = new ijw(ikdVar);
            this.w = ijwVar;
            return ijwVar;
        }
        long jD = kjh.d(this.n);
        long j = this.t;
        long j2 = this.u;
        if (j2 != 9205357640488583168L) {
            jD = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = fIntBitsToFloat + Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jD & 4294967295L));
        if (this.v > 0.0f) {
            ijxVar = new ijy(ihx.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L)));
        } else {
            ijxVar = new ijx(new ihu(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.w = ijxVar;
        return ijxVar;
    }

    public final void d() {
        Outline outlineN;
        if (this.d) {
            boolean z = this.p;
            Outline outline = null;
            if (z || b() > 0.0f) {
                ikd ikdVar = this.e;
                if (ikdVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    Path path = ((iik) ikdVar).a;
                    path.computeBounds(rectF, false);
                    if (Build.VERSION.SDK_INT > 28 || ikdVar.p()) {
                        outlineN = n();
                        if (Build.VERSION.SDK_INT >= 30) {
                            outlineN.setPath(path);
                        } else {
                            outlineN.setConvexPath(path);
                        }
                        this.g = !outlineN.canClip();
                    } else {
                        Outline outline2 = this.s;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.g = true;
                        outlineN = null;
                    }
                    this.e = ikdVar;
                    if (outlineN != null) {
                        outlineN.setAlpha(a());
                        outline = outlineN;
                    }
                    inl inlVar = this.a;
                    inlVar.z(outline, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.g && this.p) {
                        inlVar.x(false);
                        inlVar.q();
                    } else {
                        inlVar.x(this.p);
                    }
                } else {
                    inl inlVar2 = this.a;
                    inlVar2.x(z);
                    Outline outlineN2 = n();
                    long jD = kjh.d(this.n);
                    long j = this.t;
                    long j2 = this.u;
                    long j3 = j2 == 9205357640488583168L ? jD : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineN2.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (4294967295L & j3))), this.v);
                    outlineN2.setAlpha(a());
                    inlVar2.z(outlineN2, kjh.c(j3));
                }
            } else {
                inl inlVar3 = this.a;
                inlVar3.x(false);
                inlVar3.z(null, 0L);
            }
        }
        this.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.l
            if (r1 == 0) goto L67
            int r1 = r0.j
            if (r1 != 0) goto L67
            ine r1 = r0.k
            ini r2 = r1.a
            if (r2 == 0) goto L16
            r2.o()
            r2 = 0
            r1.a = r2
        L16:
            cva r1 = r1.c
            if (r1 == 0) goto L62
            java.lang.Object[] r2 = r1.b
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5f
            r5 = 0
            r6 = r5
        L25:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5a
            int r9 = r6 - r4
            r10 = r5
        L38:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            ini r11 = (defpackage.ini) r11
            r11.o()
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L38
        L58:
            if (r11 != r12) goto L5f
        L5a:
            if (r6 == r4) goto L5f
            int r6 = r6 + 1
            goto L25
        L5f:
            r1.a()
        L62:
            inl r1 = r0.a
            r1.q()
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ini.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.imz r18) {
        /*
            r17 = this;
            r0 = r17
            ine r1 = r0.k
            ini r2 = r1.a
            r1.b = r2
            cva r2 = r1.c
            if (r2 == 0) goto L26
            boolean r3 = r2.l()
            if (r3 == 0) goto L26
            cva r3 = r1.d
            if (r3 != 0) goto L20
            int r3 = defpackage.cvs.a
            cva r3 = new cva
            r4 = 0
            r3.<init>(r4)
            r1.d = r3
        L20:
            r3.c(r2)
            r2.a()
        L26:
            r2 = 1
            r1.e = r2
            fdap r2 = r0.q
            r3 = r18
            r2.invoke(r3)
            r2 = 0
            r1.e = r2
            ini r3 = r1.b
            if (r3 == 0) goto L3a
            r3.o()
        L3a:
            cva r1 = r1.d
            if (r1 == 0) goto L8b
            boolean r3 = r1.l()
            if (r3 == 0) goto L8b
            java.lang.Object[] r3 = r1.b
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L88
            r6 = r2
        L4e:
            r7 = r4[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L83
            int r9 = r6 - r5
            r10 = r2
        L61:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L81
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L7d
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            ini r11 = (defpackage.ini) r11
            r11.o()
        L7d:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L61
        L81:
            if (r11 != r12) goto L88
        L83:
            if (r6 == r5) goto L88
            int r6 = r6 + 1
            goto L4e
        L88:
            r1.a()
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ini.f(imz):void");
    }

    public final void g(kio kioVar, kji kjiVar, long j, fdap fdapVar) {
        if (!kjg.e(this.n, j)) {
            this.n = j;
            l(this.m, j);
            if (this.u == 9205357640488583168L) {
                this.d = true;
                d();
            }
        }
        this.b = kioVar;
        this.c = kjiVar;
        this.q = fdapVar;
        h();
    }

    public final void h() {
        this.a.s(this.b, this.c, this, this.r);
    }

    public final void i(float f) {
        inl inlVar = this.a;
        if (inlVar.a() == f) {
            return;
        }
        inlVar.t(f);
    }

    public final void j(ikd ikdVar) {
        p();
        this.e = ikdVar;
        d();
    }

    public final void k(long j) {
        if (ihs.h(this.o, j)) {
            return;
        }
        this.o = j;
        this.a.A(j);
    }

    public final void l(long j, long j2) {
        this.a.B(kjb.a(j), kjb.b(j), j2);
    }

    public final void m(long j, long j2, float f) {
        if (ihs.h(this.t, j) && ihz.f(this.u, j2) && this.v == f && this.e == null) {
            return;
        }
        p();
        this.t = j;
        this.u = j2;
        this.v = f;
        d();
    }
}
