package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnc implements jfe {
    public fdat a;
    private ini b;
    private final AndroidComposeView c;
    private fdae d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private ijz o;
    private boolean p;
    private boolean q;
    private boolean s;
    private final iie u;
    private long e = 9223372034707292159L;
    private final float[] g = iju.f();
    private kio j = new kip(1.0f);
    private kji k = kji.a;
    private final imu l = new imu();
    private long n = ikz.a;
    private boolean r = true;
    private final fdap t = new jnb(this);

    public jnc(ini iniVar, iie iieVar, AndroidComposeView androidComposeView, fdat fdatVar, fdae fdaeVar) {
        this.b = iniVar;
        this.u = iieVar;
        this.c = androidComposeView;
        this.a = fdatVar;
        this.d = fdaeVar;
    }

    private final void n(boolean z) {
        if (z != this.i) {
            this.i = z;
            this.c.I(this, z);
        }
    }

    private final void o() {
        jpx.a(this.c);
    }

    private final float[] p() {
        float[] fArrF = this.h;
        if (fArrF == null) {
            fArrF = iju.f();
            this.h = fArrF;
        }
        if (this.q) {
            this.q = false;
            float[] fArrQ = q();
            if (this.r) {
                return fArrQ;
            }
            if (!jnl.a(fArrQ, fArrF)) {
                fArrF[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrF[0])) {
            return null;
        }
        return fArrF;
    }

    private final float[] q() {
        if (this.p) {
            ini iniVar = this.b;
            long jB = iniVar.o;
            if ((9223372034707292159L & jB) == 9205357640488583168L) {
                jB = iia.b(kjh.d(this.e));
            }
            float[] fArr = this.g;
            inl inlVar = iniVar.a;
            int i = (int) (4294967295L & jB);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat(i);
            float fI = inlVar.i();
            float fJ = inlVar.j();
            float fC = inlVar.c();
            float fD = inlVar.d();
            float fE = inlVar.e();
            float f = inlVar.f();
            float fG = inlVar.g();
            double d = fC * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f2 = fJ * fCos;
            float f3 = fJ * fSin;
            double d2 = fD * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = fI * fCos2;
            float f5 = -fI;
            double d3 = fE * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f6 = fSin * fSin2;
            float f7 = ((fCos3 * fCos2) + (fSin3 * f6)) * f;
            float f8 = fSin3 * fCos * f;
            float f9 = fSin * fCos2;
            float f10 = -fSin2;
            float f11 = ((fCos3 * f10) + (fSin3 * f9)) * f;
            float f12 = -fSin3;
            float f13 = ((f12 * fCos2) + (f6 * fCos3)) * fG;
            float f14 = fCos * fCos3 * fG;
            float f15 = ((f12 * f10) + (fCos3 * f9)) * fG;
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f11;
            fArr[3] = 0.0f;
            fArr[4] = f13;
            fArr[5] = f14;
            fArr[6] = f15;
            fArr[7] = 0.0f;
            fArr[8] = fCos * fSin2;
            fArr[9] = -fSin;
            fArr[10] = fCos * fCos2;
            fArr[11] = 0.0f;
            float f16 = -fIntBitsToFloat;
            float f17 = f3 + fCos;
            fArr[12] = ((f7 * f16) - (f13 * fIntBitsToFloat2)) + f4 + (f17 * fSin2) + fIntBitsToFloat;
            fArr[13] = ((f8 * f16) - (fIntBitsToFloat2 * f14)) + (f2 - fSin) + fIntBitsToFloat2;
            fArr[14] = ((f16 * f11) - (fIntBitsToFloat2 * f15)) + (f5 * fSin2) + (f17 * fCos2);
            fArr[15] = 1.0f;
            this.p = false;
            this.r = ijv.a(fArr);
        }
        return this.g;
    }

    @Override // defpackage.jfe
    public final long a(long j, boolean z) {
        float[] fArrQ;
        if (z) {
            fArrQ = p();
            if (fArrQ == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrQ = q();
        }
        return this.r ? j : iju.a(fArrQ, j);
    }

    @Override // defpackage.jfe
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        n(false);
        iie iieVar = this.u;
        if (iieVar != null) {
            iieVar.b(this.b);
            this.c.R(this);
        }
    }

    @Override // defpackage.jfe
    public final void c(ijb ijbVar, ini iniVar) {
        j();
        this.s = this.b.b() > 0.0f;
        imu imuVar = this.l;
        imt imtVar = imuVar.b;
        imtVar.e(ijbVar);
        imtVar.a = iniVar;
        inm.a(imuVar, this.b);
    }

    @Override // defpackage.jfe
    public final void d(float[] fArr) {
        float[] fArrP = p();
        if (fArrP != null) {
            iju.e(fArr, fArrP);
        }
    }

    @Override // defpackage.jfe
    public final void e(ihp ihpVar, boolean z) {
        float[] fArrP = z ? p() : q();
        if (this.r) {
            return;
        }
        if (fArrP == null) {
            ihpVar.b(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            iju.b(fArrP, ihpVar);
        }
    }

    @Override // defpackage.jfe
    public final void f(long j) {
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.h) {
            androidComposeView.z(-4.0f);
        }
        ini iniVar = this.b;
        if (!kjb.f(iniVar.m, j)) {
            iniVar.m = j;
            iniVar.l(j, iniVar.n);
        }
        o();
    }

    @Override // defpackage.jfe
    public final void g(long j) {
        if (kjg.e(j, this.e)) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.h) {
            androidComposeView.z(-4.0f);
        }
        this.e = j;
        invalidate();
    }

    @Override // defpackage.jfe
    public final void h(fdat fdatVar, fdae fdaeVar) {
        iie iieVar = this.u;
        if (iieVar == null) {
            itw.b("currently reuse is only supported when we manage the layer lifecycle");
            throw new fcta();
        }
        if (!this.b.l) {
            itw.c("layer should have been released before reuse");
        }
        this.b = iieVar.a();
        this.f = false;
        this.a = fdatVar;
        this.d = fdaeVar;
        this.p = false;
        this.q = false;
        this.r = true;
        iju.c(this.g);
        float[] fArr = this.h;
        if (fArr != null) {
            iju.c(fArr);
        }
        this.n = ikz.a;
        this.s = false;
        this.e = 9223372034707292159L;
        this.o = null;
        this.m = 0;
    }

    @Override // defpackage.jfe
    public final void i(float[] fArr) {
        iju.e(fArr, q());
    }

    @Override // defpackage.jfe
    public final void invalidate() {
        if (this.i || this.f) {
            return;
        }
        this.c.invalidate();
        n(true);
    }

    @Override // defpackage.jfe
    public final void j() {
        if (this.i) {
            if (!ikz.d(this.n, ikz.a)) {
                ini iniVar = this.b;
                if (!kjg.e(iniVar.n, this.e)) {
                    float fA = ikz.a(this.n) * ((int) (this.e >> 32));
                    float fB = ikz.b(this.n) * ((int) (this.e & 4294967295L));
                    iniVar.k((Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32));
                }
            }
            this.b.g(this.j, this.k, this.e, this.t);
            n(false);
        }
    }

    @Override // defpackage.jfe
    public final void k(ikl iklVar) {
        fdae fdaeVar;
        int i;
        fdae fdaeVar2;
        int i2 = iklVar.a | this.m;
        this.k = iklVar.t;
        this.j = iklVar.s;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.n = iklVar.n;
        }
        if ((i2 & 1) != 0) {
            ini iniVar = this.b;
            float f = iklVar.b;
            inl inlVar = iniVar.a;
            if (inlVar.f() != f) {
                inlVar.G(f);
            }
        }
        if ((i2 & 2) != 0) {
            ini iniVar2 = this.b;
            float f2 = iklVar.c;
            inl inlVar2 = iniVar2.a;
            if (inlVar2.g() != f2) {
                inlVar2.H(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.b.i(iklVar.d);
        }
        if ((i2 & 8) != 0) {
            ini iniVar3 = this.b;
            float f3 = iklVar.e;
            inl inlVar3 = iniVar3.a;
            if (inlVar3.i() != f3) {
                inlVar3.K(f3);
            }
        }
        if ((i2 & 16) != 0) {
            ini iniVar4 = this.b;
            float f4 = iklVar.f;
            inl inlVar4 = iniVar4.a;
            if (inlVar4.j() != f4) {
                inlVar4.L(f4);
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            ini iniVar5 = this.b;
            float f5 = iklVar.g;
            inl inlVar5 = iniVar5.a;
            if (inlVar5.h() != f5) {
                inlVar5.I(f5);
                iniVar5.d = true;
                iniVar5.d();
            }
            if (iklVar.g > 0.0f && !this.s && (fdaeVar2 = this.d) != null) {
                fdaeVar2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            ini iniVar6 = this.b;
            long j = iklVar.h;
            inl inlVar6 = iniVar6.a;
            long jM = inlVar6.m();
            long j2 = ije.a;
            if (!fcts.a(j, jM)) {
                inlVar6.u(j);
            }
        }
        if ((i2 & 128) != 0) {
            ini iniVar7 = this.b;
            long j3 = iklVar.i;
            inl inlVar7 = iniVar7.a;
            long jN = inlVar7.n();
            long j4 = ije.a;
            if (!fcts.a(j3, jN)) {
                inlVar7.J(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            ini iniVar8 = this.b;
            float f6 = iklVar.l;
            inl inlVar8 = iniVar8.a;
            if (inlVar8.e() != f6) {
                inlVar8.F(f6);
            }
        }
        if ((i2 & 256) != 0) {
            ini iniVar9 = this.b;
            float f7 = iklVar.j;
            inl inlVar9 = iniVar9.a;
            if (inlVar9.c() != f7) {
                inlVar9.D(f7);
            }
        }
        if ((i2 & 512) != 0) {
            ini iniVar10 = this.b;
            float f8 = iklVar.k;
            inl inlVar10 = iniVar10.a;
            if (inlVar10.d() != f8) {
                inlVar10.E(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            ini iniVar11 = this.b;
            float f9 = iklVar.m;
            inl inlVar11 = iniVar11.a;
            if (inlVar11.b() != f9) {
                inlVar11.w(f9);
            }
        }
        if (i3 != 0) {
            if (ikz.d(this.n, ikz.a)) {
                this.b.k(9205357640488583168L);
            } else {
                ini iniVar12 = this.b;
                float fA = ikz.a(this.n) * ((int) (this.e >> 32));
                iniVar12.k((Float.floatToRawIntBits(ikz.b(this.n) * ((int) (this.e & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32));
            }
        }
        if ((i2 & 16384) != 0) {
            ini iniVar13 = this.b;
            boolean z2 = iklVar.p;
            if (iniVar13.p != z2) {
                iniVar13.p = z2;
                iniVar13.d = true;
                iniVar13.d();
            }
        }
        if ((131072 & i2) != 0) {
            ini iniVar14 = this.b;
            ikk ikkVar = iklVar.u;
            inl inlVar12 = iniVar14.a;
            if (!fdbq.f(inlVar12.p(), ikkVar)) {
                inlVar12.C(ikkVar);
            }
        }
        if ((262144 & i2) != 0) {
            ini iniVar15 = this.b;
            ijf ijfVar = iklVar.v;
            inl inlVar13 = iniVar15.a;
            if (!fdbq.f(null, null)) {
                inlVar13.N();
            }
        }
        if ((524288 & i2) != 0) {
            ini iniVar16 = this.b;
            int i4 = iklVar.w;
            inl inlVar14 = iniVar16.a;
            if (!iis.b(inlVar14.k(), i4)) {
                inlVar14.v(i4);
            }
        }
        if ((32768 & i2) != 0) {
            ini iniVar17 = this.b;
            int i5 = iklVar.q;
            if (ijk.b(i5, 0)) {
                i = 0;
            } else if (ijk.b(i5, 1)) {
                i = 1;
            } else {
                i = 2;
                if (!ijk.b(i5, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            inl inlVar15 = iniVar17.a;
            if (!inf.a(inlVar15.l(), i)) {
                inlVar15.y(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.p = true;
            this.q = true;
        }
        if (fdbq.f(this.o, iklVar.x)) {
            z = false;
        } else {
            ijz ijzVar = iklVar.x;
            this.o = ijzVar;
            if (ijzVar != null) {
                ini iniVar18 = this.b;
                if (ijzVar instanceof ijx) {
                    ihu ihuVar = ((ijx) ijzVar).a;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(ihuVar.b);
                    float f10 = ihuVar.c;
                    iniVar18.m((Float.floatToRawIntBits(f10) & 4294967295L) | (jFloatToRawIntBits << 32), (Float.floatToRawIntBits(ihuVar.d - r11) << 32) | (Float.floatToRawIntBits(ihuVar.e - f10) & 4294967295L), 0.0f);
                } else if (ijzVar instanceof ijw) {
                    iniVar18.j(((ijw) ijzVar).a);
                } else {
                    if (!(ijzVar instanceof ijy)) {
                        throw new fctg();
                    }
                    ijy ijyVar = (ijy) ijzVar;
                    ikd ikdVar = ijyVar.b;
                    if (ikdVar != null) {
                        iniVar18.j(ikdVar);
                    } else {
                        ihw ihwVar = ijyVar.a;
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(ihwVar.a);
                        float fB = ihwVar.b();
                        iniVar18.m((Float.floatToRawIntBits(ihwVar.b) & 4294967295L) | (jFloatToRawIntBits2 << 32), (Float.floatToRawIntBits(ihwVar.a()) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32), Float.intBitsToFloat((int) (ihwVar.h >> 32)));
                    }
                }
                if ((ijzVar instanceof ijw) && Build.VERSION.SDK_INT < 33 && (fdaeVar = this.d) != null) {
                    fdaeVar.invoke();
                }
                z = true;
            }
        }
        this.m = iklVar.a;
        if (i2 != 0 || z) {
            o();
            AndroidComposeView androidComposeView = this.c;
            if (androidComposeView.h) {
                androidComposeView.z(0.0f);
            }
        }
    }

    @Override // defpackage.jfe
    public final boolean l(long j) {
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        ini iniVar = this.b;
        if (iniVar.p) {
            return joi.a(iniVar.c(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // defpackage.jfe
    public final float[] m() {
        return q();
    }
}
