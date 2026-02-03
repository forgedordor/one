package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jde extends iyl implements jdw, jdz {
    private static final fdap f = jda.a;
    private jdb g;
    private jft h;
    public fdap i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final iyk m;
    public jfx n;
    public cuz o;

    public jde() {
        fdap fdapVar = iyn.a;
        this.m = new iwz(this);
    }

    protected static final void W(jer jerVar) {
        jaj jajVar;
        jer jerVar2 = jerVar.w;
        if (!fdbq.f(jerVar2 != null ? jerVar2.t : null, jerVar.t)) {
            ((jdv) jerVar.af()).w.e();
            return;
        }
        jak jakVarH = jerVar.af().h();
        if (jakVarH == null || (jajVar = ((jdv) jakVarH).w) == null) {
            return;
        }
        jajVar.e();
    }

    public abstract long I();

    public abstract ivy J();

    public abstract ixn K();

    @Override // defpackage.jdw
    public abstract jcr L();

    public final jdb M() {
        jdb jdbVar = this.g;
        if (jdbVar != null) {
            return jdbVar;
        }
        jdb jdbVar2 = new jdb(this);
        this.g = jdbVar2;
        return jdbVar2;
    }

    public abstract jde N();

    public abstract jde O();

    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.jcr r32, defpackage.iyw r33) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jde.P(jcr, iyw):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(defpackage.jft r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jde.Q(jft, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(defpackage.ixn r18) {
        /*
            r17 = this;
            r0 = r17
            r6 = r18
            cuz r1 = r0.o
            boolean r2 = r0.l
            if (r2 == 0) goto Lc
            goto Lbb
        Lc:
            fdap r2 = r6.n()
            r3 = 0
            if (r2 != 0) goto L5d
            if (r1 == 0) goto Lbb
            java.lang.Object[] r2 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L59
            r6 = r3
        L1f:
            r7 = r4[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L54
            int r9 = r6 - r5
            r10 = r3
        L32:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L52
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L4e
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            cva r11 = (defpackage.cva) r11
            r0.S(r11)
        L4e:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L32
        L52:
            if (r11 != r12) goto L59
        L54:
            if (r6 == r5) goto L59
            int r6 = r6 + 1
            goto L1f
        L59:
            r1.d()
            return
        L5d:
            fdap r1 = r0.i
            r4 = 1
            if (r1 == r2) goto L64
            r1 = r4
            goto L65
        L64:
            r1 = r3
        L65:
            r7 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r9 = 0
            if (r1 != 0) goto La0
            jdb r2 = r0.M()
            boolean r2 = r2.a
            if (r2 == 0) goto La0
            ivy r1 = r0.J()
            long r7 = defpackage.ivz.c(r1)
            long r7 = defpackage.kjc.c(r7)
            long r9 = r1.g()
            jdb r1 = r0.M()
            long r1 = r1.b
            boolean r1 = defpackage.kjb.f(r7, r1)
            if (r1 == 0) goto L9e
            jdb r1 = r0.M()
            long r1 = r1.c
            boolean r1 = defpackage.kjg.e(r9, r1)
            if (r1 != 0) goto L9f
        L9e:
            r3 = r4
        L9f:
            r1 = r3
        La0:
            r2 = r7
            r4 = r9
            if (r1 == 0) goto Lbb
            jft r1 = r0.h
            if (r1 == 0) goto Lab
            r1.a = r6
            goto Lb2
        Lab:
            jft r1 = new jft
            r1.<init>(r6, r0)
            r0.h = r1
        Lb2:
            r0.Q(r1, r2, r4)
            fdap r1 = r6.n()
            r0.i = r1
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jde.R(ixn):void");
    }

    public final void S(cva cvaVar) {
        int i;
        jcr jcrVar;
        Object[] objArr = cvaVar.b;
        long[] jArr = cvaVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128 && (jcrVar = (jcr) ((jgj) objArr[(i2 << 3) + i4]).get()) != null) {
                        if (ev()) {
                            jcrVar.ab(false);
                        } else {
                            jcrVar.ac(false);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public abstract void T();

    @Override // defpackage.jdz
    public final void U(boolean z) {
        jde jdeVarO = O();
        jcr jcrVarL = jdeVarO != null ? jdeVarO.L() : null;
        if (fdbq.f(jcrVarL, L())) {
            this.j = z;
        } else {
            if ((jcrVarL == null || jcrVarL.aC() != 3) && (jcrVarL == null || jcrVarL.aC() != 4)) {
                return;
            }
            this.j = z;
        }
    }

    public abstract boolean V();

    @Override // defpackage.kiy
    public final /* synthetic */ float eg(long j) {
        return kix.a(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float eh(float f2) {
        return kin.a(this, f2);
    }

    @Override // defpackage.ixq
    public final int ei(itz itzVar) {
        int iS;
        if (!V() || (iS = s(itzVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = itzVar instanceof izp;
        long j = this.e;
        return iS + (z ? kjb.a(j) : kjb.b(j));
    }

    @Override // defpackage.ixp
    public final /* synthetic */ ixn ej(int i, int i2, Map map, fdap fdapVar) {
        return ixo.a(this, i, i2, map, fdapVar);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float el(int i) {
        return kin.b(this, i);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float em(long j) {
        return kin.c(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float en(float f2) {
        return kin.d(this, f2);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int eo(long j) {
        return kin.e(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int ep(float f2) {
        return kin.f(this, f2);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long eq(long j) {
        return kin.g(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long er(long j) {
        return kin.h(this, j);
    }

    @Override // defpackage.kiy
    public final /* synthetic */ long es(float f2) {
        return kix.b(this, f2);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long et(float f2) {
        return kin.i(this, f2);
    }

    @Override // defpackage.ixp
    public final ixn eu(int i, int i2, Map map, fdap fdapVar, fdap fdapVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            itw.d(a.z(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new jdd(i, i2, map, fdapVar, fdapVar2, this);
    }

    @Override // defpackage.ivu
    public boolean ev() {
        return false;
    }

    public abstract int s(itz itzVar);
}
