package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hza extends hzg {
    private static final int[] l = new int[0];
    public final fdap a;
    public final fdap b;
    public int c;
    public cva d;
    public hzn e;
    public int[] f;
    public boolean g;
    private List m;
    private int n;

    public hza(long j, hzn hznVar, fdap fdapVar, fdap fdapVar2) {
        super(j, hznVar);
        this.a = fdapVar;
        this.b = fdapVar2;
        this.e = hzn.a;
        this.f = l;
        this.n = 1;
    }

    private final void F() {
        if (!this.g || this.k >= 0) {
            return;
        }
        hpq.b("Unsupported operation on a disposed or applied snapshot");
    }

    public hza a(fdap fdapVar, fdap fdapVar2) throws Throwable {
        C();
        F();
        q(v());
        synchronized (hzt.c) {
            try {
                long j = hzt.e;
                hzt.e = j + 1;
                hzt.d = hzt.d.d(j);
                hzn hznVarX = x();
                A(hznVarX.d(j));
                try {
                    hzb hzbVar = new hzb(j, hzt.d(hznVarX, v() + 1, j), hzt.p(fdapVar, k(), true), hzt.q(fdapVar2, m()), this);
                    if (this.g || this.j) {
                        return hzbVar;
                    }
                    long jV = v();
                    synchronized (hzt.c) {
                        long j2 = hzt.e;
                        hzt.e = j2 + 1;
                        B(j2);
                        hzt.d = hzt.d.d(v());
                    }
                    A(hzt.d(x(), jV + 1, v()));
                    return hzbVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.hzg
    public hzg b(fdap fdapVar) throws Throwable {
        C();
        F();
        long jV = v();
        q(v());
        synchronized (hzt.c) {
            try {
                long j = hzt.e;
                hzt.e = j + 1;
                hzt.d = hzt.d.d(j);
                try {
                    hzc hzcVar = new hzc(j, hzt.d(x(), jV + 1, j), hzt.p(fdapVar, k(), true), this);
                    if (this.g || this.j) {
                        return hzcVar;
                    }
                    long jV2 = v();
                    synchronized (hzt.c) {
                        long j2 = hzt.e;
                        hzt.e = j2 + 1;
                        B(j2);
                        hzt.d = hzt.d.d(v());
                    }
                    A(hzt.d(x(), jV2 + 1, v()));
                    return hzcVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.hzj c() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hza.c():hzj");
    }

    @Override // defpackage.hzg
    public void d() {
        if (this.j) {
            return;
        }
        super.d();
        g();
    }

    @Override // defpackage.hzg
    public void e() {
        if (this.g || this.j) {
            return;
        }
        n();
    }

    @Override // defpackage.hzg
    public void f() {
        this.n++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // defpackage.hzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.n
            if (r1 > 0) goto Lb
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.hpq.a(r1)
        Lb:
            int r1 = r0.n
            int r1 = r1 + (-1)
            r0.n = r1
            if (r1 != 0) goto L93
            boolean r1 = r0.g
            if (r1 != 0) goto L93
            cva r1 = r0.i()
            if (r1 == 0) goto L90
            boolean r2 = r0.g
            if (r2 == 0) goto L26
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.hpq.b(r2)
        L26:
            r2 = 0
            r0.s(r2)
            long r2 = r0.v()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L90
            r7 = 0
        L38:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8b
            int r10 = r7 - r5
            int r10 = ~r10
            r11 = 0
        L4c:
            int r12 = r10 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L89
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.32E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L85
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r4[r12]
            iaw r12 = (defpackage.iaw) r12
            iay r12 = r12.d()
        L68:
            if (r12 == 0) goto L85
            long r14 = r12.g
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7c
            hzn r6 = r0.e
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.fcva.az(r6, r14)
            if (r6 == 0) goto L82
        L7c:
            fdap r6 = defpackage.hzt.a
            r14 = 0
            r12.g = r14
        L82:
            iay r12 = r12.h
            goto L68
        L85:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L4c
        L89:
            if (r12 != r13) goto L90
        L8b:
            if (r7 == r5) goto L90
            int r7 = r7 + 1
            goto L38
        L90:
            r0.y()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hza.g():void");
    }

    @Override // defpackage.hzg
    public int h() {
        return this.c;
    }

    public cva i() {
        return this.d;
    }

    public final hzj j(long j, cva cvaVar, Map map, hzn hznVar) {
        List listAh;
        hzn hznVar2;
        Object[] objArr;
        long[] jArr;
        hzn hznVar3;
        long[] jArr2;
        int i;
        ArrayList arrayList;
        long j2;
        int i2;
        iay iayVarG;
        hzn hznVarC = x().d(v()).c(this.e);
        Object[] objArr2 = cvaVar.b;
        long[] jArr3 = cvaVar.a;
        int length = jArr3.length - 2;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            listAh = null;
            int i3 = 0;
            while (true) {
                long j3 = jArr3[i3];
                ArrayList arrayList3 = arrayList2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    objArr = objArr2;
                    arrayList2 = arrayList3;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            hznVar2 = hznVarC;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j3 & 255) < 128) {
                                iaw iawVar = (iaw) objArr[(i3 << 3) + i5];
                                jArr2 = jArr3;
                                iay iayVarD = iawVar.d();
                                i = i4;
                                arrayList = arrayList2;
                                iay iayVarK = hzt.k(iayVarD, j, hznVar);
                                if (iayVarK != null) {
                                    j2 = j3;
                                    iay iayVarK2 = hzt.k(iayVarD, v(), hznVarC);
                                    if (iayVarK2 == null) {
                                        hznVar3 = hznVarC;
                                    } else {
                                        i2 = i5;
                                        if (iayVarK2.g == 1 || fdbq.f(iayVarK, iayVarK2)) {
                                            hznVar3 = hznVarC;
                                        } else {
                                            hznVar3 = hznVarC;
                                            iay iayVarK3 = hzt.k(iayVarD, v(), x());
                                            if (iayVarK3 == null) {
                                                hzt.z();
                                                throw new fcta();
                                            }
                                            if (map == null || (iayVarG = (iay) map.get(iayVarK)) == null) {
                                                iayVarG = iawVar.g(iayVarK2, iayVarK, iayVarK3);
                                            }
                                            if (iayVarG == null) {
                                                return new hzh();
                                            }
                                            if (!fdbq.f(iayVarG, iayVarK3)) {
                                                if (fdbq.f(iayVarG, iayVarK)) {
                                                    ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList4.add(new fcti(iawVar, iayVarK.a(v())));
                                                    if (listAh == null) {
                                                        listAh = new ArrayList();
                                                    }
                                                    listAh.add(iawVar);
                                                    arrayList2 = arrayList4;
                                                } else {
                                                    arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList2.add(!fdbq.f(iayVarG, iayVarK2) ? new fcti(iawVar, iayVarG) : new fcti(iawVar, iayVarK2.a(v())));
                                                }
                                            }
                                            j3 = j2 >> 8;
                                            i5 = i2 + 1;
                                            jArr3 = jArr2;
                                            i4 = i;
                                            hznVarC = hznVar3;
                                        }
                                    }
                                } else {
                                    hznVar3 = hznVarC;
                                    j2 = j3;
                                }
                                i2 = i5;
                            } else {
                                hznVar3 = hznVarC;
                                jArr2 = jArr3;
                                i = i4;
                                arrayList = arrayList2;
                                j2 = j3;
                                i2 = i5;
                            }
                            arrayList2 = arrayList;
                            j3 = j2 >> 8;
                            i5 = i2 + 1;
                            jArr3 = jArr2;
                            i4 = i;
                            hznVarC = hznVar3;
                        }
                    }
                } else {
                    hznVar2 = hznVarC;
                    objArr = objArr2;
                    jArr = jArr3;
                    arrayList2 = arrayList3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr2 = objArr;
                jArr3 = jArr;
                hznVarC = hznVar2;
            }
        } else {
            listAh = null;
        }
        if (arrayList2 != null) {
            n();
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                fcti fctiVar = (fcti) arrayList2.get(i7);
                iaw iawVar2 = (iaw) fctiVar.a;
                iay iayVar = (iay) fctiVar.b;
                iayVar.g = j;
                synchronized (hzt.c) {
                    iayVar.h = iawVar2.d();
                    iawVar2.e(iayVar);
                }
            }
        }
        if (listAh != null) {
            int size2 = listAh.size();
            for (int i8 = 0; i8 < size2; i8++) {
                cvaVar.i((iaw) listAh.get(i8));
            }
            List list = this.m;
            if (list != null) {
                listAh = fcva.ah(list, listAh);
            }
            this.m = listAh;
        }
        return hzi.a;
    }

    @Override // defpackage.hzg
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public fdap k() {
        return this.a;
    }

    @Override // defpackage.hzg
    public fdap m() {
        return this.b;
    }

    public final void n() {
        q(v());
        if (this.g || this.j) {
            return;
        }
        long jV = v();
        synchronized (hzt.c) {
            long j = hzt.e;
            hzt.e = j + 1;
            B(j);
            hzt.d = hzt.d.d(v());
        }
        A(hzt.d(x(), jV + 1, v()));
    }

    @Override // defpackage.hzg
    public final void o() {
        hzt.d = hzt.d.b(v()).a(this.e);
    }

    @Override // defpackage.hzg
    public void p(iaw iawVar) {
        cva cvaVarI = i();
        if (cvaVarI == null) {
            int i = cvs.a;
            cvaVarI = new cva((byte[]) null);
            s(cvaVarI);
        }
        cvaVarI.g(iawVar);
    }

    public final void q(long j) {
        synchronized (hzt.c) {
            this.e = this.e.d(j);
        }
    }

    @Override // defpackage.hzg
    public final void r() {
        int length = this.f.length;
        for (int i = 0; i < length; i++) {
            hzt.v(this.f[i]);
        }
        z();
    }

    public void s(cva cvaVar) {
        this.d = cvaVar;
    }

    @Override // defpackage.hzg
    public void t(int i) {
        this.c = i;
    }

    @Override // defpackage.hzg
    public boolean u() {
        return false;
    }
}
