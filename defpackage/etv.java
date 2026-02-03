package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class etv implements dyb {
    public final ebk A;
    public final hri B;
    private final boolean C;
    private int D;
    private epi E;
    private boolean F;
    private final hox G;
    private final hox H;
    private final hri I;
    private final hox a;
    private final dyb b;
    public boolean c;
    public etd d;
    public final etf e;
    public int f;
    public int g;
    public long h;
    public long i;
    public float j;
    public float k;
    public int l;
    public int m;
    public final hox n;
    public kio o;
    public final epj p;
    public final enc q;
    public final emt r;
    public final hox s;
    public final iyr t;
    public long u;
    public final epf v;
    public final hox w;
    public final hox x;
    public final hox y;
    public final hox z;

    public etv(int i, float f) {
        double d = f;
        if (d < -0.5d || d > 0.5d) {
            ebs.c("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        ihs ihsVar = new ihs(0L);
        hsi hsiVar = hsi.a;
        this.a = new hpl(ihsVar, hsiVar);
        etf etfVar = new etf(i, f, this);
        this.e = etfVar;
        this.f = i;
        this.h = Long.MAX_VALUE;
        this.b = new dtd(new fdap() { // from class: etk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                etd etdVar;
                Float f2 = (Float) obj;
                float fFloatValue = f2.floatValue();
                etv etvVar = this.a;
                long jA = etg.a(etvVar);
                float f3 = etvVar.j + fFloatValue;
                long jD = fdcu.d(f3);
                etvVar.j = f3 - jD;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jA + jD;
                    long jM = fddu.m(j, etvVar.i, etvVar.h);
                    long j2 = jM - jA;
                    float f4 = j2;
                    etvVar.k = f4;
                    if (Math.abs(j2) != 0) {
                        etvVar.y.b(Boolean.valueOf(f4 > 0.0f));
                        etvVar.z.b(Boolean.valueOf(f4 < 0.0f));
                    }
                    int i2 = (int) j2;
                    int i3 = -i2;
                    etd etdVarC = ((etd) etvVar.n.a()).c(i3);
                    if (etdVarC != null && (etdVar = etvVar.d) != null) {
                        etd etdVarC2 = etdVar.c(i3);
                        if (etdVarC2 != null) {
                            etvVar.d = etdVarC2;
                        } else {
                            etdVarC = null;
                        }
                    }
                    if (etdVarC != null) {
                        etvVar.s(etdVarC, etvVar.c, true);
                        eqs.b(etvVar.w);
                        etvVar.m++;
                    } else {
                        etf etfVar2 = etvVar.e;
                        etfVar2.c(etfVar2.a() + (etfVar2.a.l() != 0 ? i2 / r11.l() : 0.0f));
                        iyq iyqVarP = etvVar.p();
                        if (iyqVarP != null) {
                            iyqVarP.g();
                        }
                        etvVar.l++;
                    }
                    Number numberValueOf = f2;
                    if (j != jM) {
                        numberValueOf = Long.valueOf(j2);
                    }
                    fFloatValue = numberValueOf.floatValue();
                }
                return Float.valueOf(fFloatValue);
            }
        });
        this.C = true;
        this.D = -1;
        etd etdVar = eua.a;
        hpb hpbVar = hpb.a;
        this.n = new hpl(etdVar, hpbVar);
        this.o = eua.b;
        this.A = new ebk();
        this.I = new hph(-1);
        this.B = new hph(i);
        fdae fdaeVar = new fdae() { // from class: etl
            @Override // defpackage.fdae
            public final Object invoke() {
                etv etvVar = this.a;
                return Integer.valueOf(etvVar.i() ? etvVar.B.c() : etvVar.j());
            }
        };
        hxn hxnVar = hrp.a;
        new hnt(fdaeVar, hsiVar);
        new hnt(new fdae() { // from class: etm
            @Override // defpackage.fdae
            public final Object invoke() {
                etv etvVar = this.a;
                return Integer.valueOf(etvVar.f(!etvVar.i() ? etvVar.j() : etvVar.n() != -1 ? etvVar.n() : Math.abs(etvVar.c()) >= Math.abs(etvVar.d()) ? etvVar.v() ? etvVar.f + 1 : etvVar.f : etvVar.j()));
            }
        }, hsiVar);
        this.p = new epj(new fdap() { // from class: etn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                etv etvVar = this.a;
                eph ephVar = (eph) obj;
                hzg hzgVarA = hzf.a();
                fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                hzg hzgVarB = hzf.b(hzgVarA);
                try {
                    ephVar.a(etvVar.f);
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    return fctx.a;
                } catch (Throwable th) {
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    throw th;
                }
            }
        });
        this.q = new enc();
        this.r = new emt();
        this.s = new hpl(null, hsiVar);
        this.t = new etr(this);
        this.u = kim.k(0, 0, 0, 15);
        this.v = new epf();
        eoz eozVar = etfVar.d;
        fctx fctxVar = fctx.a;
        this.w = new hpl(fctxVar, hpbVar);
        this.x = new hpl(fctxVar, hpbVar);
        this.G = new hpl(false, hsiVar);
        this.H = new hpl(false, hsiVar);
        this.y = new hpl(false, hsiVar);
        this.z = new hpl(false, hsiVar);
    }

    private final void B(int i) {
        this.I.i(i);
    }

    private static final int C(boolean z, etd etdVar) {
        if (!z) {
            return (((erx) fcva.N(etdVar.a)).a - etdVar.h) - 1;
        }
        int i = etdVar.h + 1;
        return i < 0 ? Alert.DURATION_SHOW_INDEFINITELY : ((erx) fcva.S(etdVar.a)).a + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object r(defpackage.etv r5, defpackage.dod r6, defpackage.fdat r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.ett
            if (r0 == 0) goto L13
            r0 = r8
            ett r0 = (defpackage.ett) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ett r0 = new ett
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r7 = r0.b
            dod r6 = r0.f
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r8)
            goto L4f
        L3e:
            defpackage.fctl.b(r8)
            r0.a = r5
            r0.f = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r5.q(r0)
            if (r8 == r1) goto L7c
        L4f:
            r8 = r5
            etv r8 = (defpackage.etv) r8
            boolean r2 = r8.i()
            if (r2 != 0) goto L61
            int r2 = r8.j()
            hri r4 = r8.B
            r4.i(r2)
        L61:
            dyb r8 = r8.b
            r0.a = r5
            r2 = 0
            r0.f = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L73
            goto L7c
        L73:
            etv r5 = (defpackage.etv) r5
            r6 = -1
            r5.B(r6)
            fctx r5 = defpackage.fctx.a
            return r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etv.r(etv, dod, fdat, fcxy):java.lang.Object");
    }

    public static /* synthetic */ Object z(etv etvVar, int i, ddz ddzVar, fcxy fcxyVar, int i2) {
        if ((i2 & 4) != 0) {
            ddzVar = dea.b(0.0f, 0.0f, null, 7);
        }
        return etvVar.y(i, ddzVar, fcxyVar);
    }

    public final void A(int i) {
        B(f(i));
    }

    @Override // defpackage.dyb
    public final float a(float f) {
        return this.b.a(f);
    }

    public abstract int b();

    public final float c() {
        return this.e.a();
    }

    public final float d() {
        kio kioVar = this.o;
        etd etdVar = eua.a;
        return Math.min(kioVar.en(56.0f), k() / 2.0f) / k();
    }

    @Override // defpackage.dyb
    public final Object e(dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        return r(this, dodVar, fdatVar, fcxyVar);
    }

    public final int f(int i) {
        if (b() > 0) {
            return fddu.i(i, 0, b() - 1);
        }
        return 0;
    }

    @Override // defpackage.dyb
    public final boolean g() {
        return ((Boolean) this.H.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean h() {
        return ((Boolean) this.G.a()).booleanValue();
    }

    @Override // defpackage.dyb
    public final boolean i() {
        return this.b.i();
    }

    public final int j() {
        return this.e.e.c();
    }

    public final int k() {
        return ((etd) this.n.a()).b;
    }

    public final int l() {
        return k() + m();
    }

    public final int m() {
        return ((etd) this.n.a()).c;
    }

    public final int n() {
        return this.I.c();
    }

    public final long o() {
        return ((ihs) this.a.a()).a;
    }

    public final iyq p() {
        return (iyq) this.s.a();
    }

    public final Object q(fcxy fcxyVar) throws Throwable {
        Object objD = this.r.d(fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:51:0x00ab, B:55:0x00bd, B:58:0x00c6, B:61:0x00d3, B:63:0x00df, B:72:0x0116, B:78:0x0125, B:80:0x012b, B:82:0x0131, B:84:0x0135, B:86:0x0139, B:88:0x013d, B:89:0x0140, B:92:0x0161, B:94:0x0177, B:96:0x017b, B:97:0x017f, B:99:0x0190, B:101:0x0194, B:69:0x010f, B:66:0x00f7), top: B:114:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.etd r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etv.s(etd, boolean, boolean):void");
    }

    public final void t(long j) {
        this.a.b(new ihs(j));
    }

    public final void u(int i, float f, boolean z) {
        etf etfVar = this.e;
        etfVar.d(i, f);
        etfVar.c = null;
        if (!z) {
            eqs.b(this.x);
            return;
        }
        iyq iyqVarP = p();
        if (iyqVarP != null) {
            iyqVarP.g();
        }
    }

    public final boolean v() {
        return ((Boolean) this.y.a()).booleanValue();
    }

    public final boolean w() {
        return ((int) Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    public final etd x() {
        return (etd) this.n.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (e(defpackage.dod.a, r5, r0) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(int r12, defpackage.ddz r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.eto
            if (r0 == 0) goto L13
            r0 = r14
            eto r0 = (defpackage.eto) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            eto r0 = new eto
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.fctl.b(r14)
        L2a:
            r6 = r11
            goto L80
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            int r12 = r0.a
            java.lang.Object r13 = r0.b
            defpackage.fctl.b(r14)
        L3b:
            r9 = r13
            goto L62
        L3d:
            defpackage.fctl.b(r14)
            int r14 = r11.j()
            if (r12 != r14) goto L4e
            float r14 = r11.c()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L2a
        L4e:
            int r14 = r11.b()
            if (r14 == 0) goto L2a
            r0.b = r13
            r0.a = r12
            r0.e = r5
            java.lang.Object r14 = r11.q(r0)
            if (r14 != r1) goto L3b
            r6 = r11
            goto L7f
        L62:
            int r7 = r11.f(r12)
            int r12 = r11.l()
            float r12 = (float) r12
            float r8 = r12 * r3
            etq r5 = new etq
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 0
            r0.b = r12
            r0.e = r4
            java.lang.Object r12 = defpackage.dya.a(r11, r5, r0)
            if (r12 != r1) goto L80
        L7f:
            return r1
        L80:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etv.y(int, ddz, fcxy):java.lang.Object");
    }
}
