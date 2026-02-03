package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzt {
    public static hzn d;
    public static long e;
    public static List g;
    public static List h;
    public static final hyz i;
    private static final hwu k;
    public static final fdap a = new fdap() { // from class: hzq
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            fdap fdapVar = hzt.a;
            return fctx.a;
        }
    };
    public static final hxn b = new hxn();
    public static final Object c = new Object();
    public static final hzk f = new hzk();
    private static final iap j = new iap();

    static {
        d = hzn.a;
        e = 2L;
        fcvo fcvoVar = fcvo.a;
        g = fcvoVar;
        h = fcvoVar;
        long j2 = e;
        e = 1 + j2;
        hyz hyzVar = new hyz(j2, hzn.a);
        d = d.d(hyzVar.i);
        i = hyzVar;
        k = new hwu();
    }

    public static final void A() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean B(iaw iawVar) {
        long jA = f.a(e);
        iay iayVar = null;
        int i2 = 0;
        iay iayVarD = null;
        for (iay iayVarD2 = iawVar.d(); iayVarD2 != null; iayVarD2 = iayVarD2.h) {
            long j2 = iayVarD2.g;
            if (j2 != 0) {
                if (fdbq.b(j2, jA) >= 0) {
                    i2++;
                } else if (iayVar == null) {
                    i2++;
                    iayVar = iayVarD2;
                } else {
                    int iB = fdbq.b(j2, iayVar.g);
                    iay iayVar2 = iB < 0 ? iayVarD2 : iayVar;
                    if (iB >= 0) {
                        iayVar = iayVarD2;
                    }
                    if (iayVarD == null) {
                        iayVarD = iawVar.d();
                        iay iayVar3 = iayVarD;
                        while (true) {
                            if (iayVarD == null) {
                                iayVarD = iayVar3;
                                break;
                            }
                            long j3 = iayVarD.g;
                            if (fdbq.b(j3, jA) >= 0) {
                                break;
                            }
                            if (fdbq.b(iayVar3.g, j3) < 0) {
                                iayVar3 = iayVarD;
                            }
                            iayVarD = iayVarD.h;
                        }
                    }
                    iayVar2.g = 0L;
                    iayVar2.b(iayVarD);
                }
            }
        }
        return i2 > 1;
    }

    private static final boolean C(iay iayVar, long j2, hzn hznVar) {
        long j3 = iayVar.g;
        return (j3 == 0 || fdbq.b(j3, j2) > 0 || hznVar.e(j3)) ? false : true;
    }

    public static final hzg a(hzg hzgVar, fdap fdapVar, boolean z) {
        boolean z2 = hzgVar instanceof hza;
        if (z2 || hzgVar == null) {
            return new ibb(z2 ? (hza) hzgVar : null, fdapVar, null, false, z);
        }
        return new ibc(hzgVar, fdapVar, false, z);
    }

    public static final hzg b() {
        hzg hzgVar = (hzg) b.a();
        return hzgVar == null ? i : hzgVar;
    }

    public static final hzg c(final fdap fdapVar) {
        return (hzg) m(new fdap() { // from class: hzs
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdap fdapVar2 = hzt.a;
                hzg hzgVar = (hzg) fdapVar.invoke((hzn) obj);
                synchronized (hzt.c) {
                    hzt.d = hzt.d.d(hzgVar.v());
                }
                return hzgVar;
            }
        });
    }

    public static final hzn d(hzn hznVar, long j2, long j3) {
        while (fdbq.b(j2, j3) < 0) {
            hznVar = hznVar.d(j2);
            j2++;
        }
        return hznVar;
    }

    public static final iay e(iay iayVar) {
        iay iayVarK;
        hzg hzgVarB = b();
        iay iayVarK2 = k(iayVar, hzgVarB.v(), hzgVarB.x());
        if (iayVarK2 != null) {
            return iayVarK2;
        }
        synchronized (c) {
            hzg hzgVarB2 = b();
            iayVarK = k(iayVar, hzgVarB2.v(), hzgVarB2.x());
        }
        if (iayVarK != null) {
            return iayVarK;
        }
        z();
        throw new fcta();
    }

    public static final iay f(iay iayVar, hzg hzgVar) {
        iay iayVarK;
        iay iayVarK2 = k(iayVar, hzgVar.v(), hzgVar.x());
        if (iayVarK2 != null) {
            return iayVarK2;
        }
        synchronized (c) {
            iayVarK = k(iayVar, hzgVar.v(), hzgVar.x());
        }
        if (iayVarK != null) {
            return iayVarK;
        }
        z();
        throw new fcta();
    }

    public static final iay g(iay iayVar, iaw iawVar) {
        iay iayVarD = iawVar.d();
        long jA = f.a(e) - 1;
        hzn hznVar = hzn.a;
        iay iayVar2 = null;
        iay iayVar3 = null;
        while (true) {
            if (iayVarD == null) {
                break;
            }
            if (iayVarD.g == 0) {
                break;
            }
            if (C(iayVarD, jA, hznVar)) {
                if (iayVar3 == null) {
                    iayVar3 = iayVarD;
                } else if (fdbq.b(iayVarD.g, iayVar3.g) >= 0) {
                    iayVar2 = iayVar3;
                }
            }
            iayVarD = iayVarD.h;
        }
        iayVar2 = iayVarD;
        if (iayVar2 != null) {
            iayVar2.g = Long.MAX_VALUE;
            return iayVar2;
        }
        iay iayVarA = iayVar.a(Long.MAX_VALUE);
        iayVarA.h = iawVar.d();
        iawVar.e(iayVarA);
        return iayVarA;
    }

    public static final iay h(iay iayVar, iaw iawVar, hzg hzgVar) {
        iay iayVarG = g(iayVar, iawVar);
        iayVarG.b(iayVar);
        iayVarG.g = hzgVar.v();
        return iayVarG;
    }

    public static final iay i(iay iayVar, iaw iawVar, hzg hzgVar, iay iayVar2) {
        iay iayVarG;
        if (hzgVar.u()) {
            hzgVar.p(iawVar);
        }
        long jV = hzgVar.v();
        if (iayVar2.g == jV) {
            return iayVar2;
        }
        synchronized (c) {
            iayVarG = g(iayVar, iawVar);
        }
        iayVarG.g = jV;
        if (iayVar2.g != 1) {
            hzgVar.p(iawVar);
        }
        return iayVarG;
    }

    public static final iay j(iay iayVar, iaw iawVar) {
        iay iayVarK;
        hzg hzgVarB = b();
        fdap fdapVarK = hzgVarB.k();
        if (fdapVarK != null) {
            fdapVarK.invoke(iawVar);
        }
        iay iayVarK2 = k(iayVar, hzgVarB.v(), hzgVarB.x());
        if (iayVarK2 != null) {
            return iayVarK2;
        }
        synchronized (c) {
            hzg hzgVarB2 = b();
            iay iayVarD = iawVar.d();
            iayVarD.getClass();
            iayVarK = k(iayVarD, hzgVarB2.v(), hzgVarB2.x());
            if (iayVarK == null) {
                z();
                throw new fcta();
            }
        }
        return iayVarK;
    }

    public static final iay k(iay iayVar, long j2, hzn hznVar) {
        iay iayVar2 = null;
        while (iayVar != null) {
            if (C(iayVar, j2, hznVar) && (iayVar2 == null || fdbq.b(iayVar2.g, iayVar.g) < 0)) {
                iayVar2 = iayVar;
            }
            iayVar = iayVar.h;
        }
        if (iayVar2 != null) {
            return iayVar2;
        }
        return null;
    }

    public static final iay l(iay iayVar, iaw iawVar, hzg hzgVar) {
        iay iayVarK;
        if (hzgVar.u()) {
            hzgVar.p(iawVar);
        }
        long jV = hzgVar.v();
        iay iayVarK2 = k(iayVar, jV, hzgVar.x());
        if (iayVarK2 == null) {
            z();
            throw new fcta();
        }
        if (iayVarK2.g == hzgVar.v()) {
            return iayVarK2;
        }
        synchronized (c) {
            iayVarK = k(iawVar.d(), jV, hzgVar.x());
            if (iayVarK == null) {
                z();
                throw new fcta();
            }
            if (iayVarK.g != jV) {
                iayVarK = h(iayVarK, iawVar, hzgVar);
            }
        }
        if (iayVarK2.g != 1) {
            hzgVar.p(iawVar);
        }
        return iayVarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.fdap r17) {
        /*
            hyz r0 = defpackage.hzt.i
            java.lang.Object r1 = defpackage.hzt.c
            monitor-enter(r1)
            cva r2 = r0.d     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto Lf
            hwu r3 = defpackage.hzt.k     // Catch: java.lang.Throwable -> L92
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L92
        Lf:
            r3 = r17
            java.lang.Object r3 = n(r0, r3)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L41
            r4 = -1
            java.util.List r5 = defpackage.hzt.g     // Catch: java.lang.Throwable -> L3a
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L3a
            r7 = r1
        L21:
            if (r7 >= r6) goto L34
            java.lang.Object r8 = r5.get(r7)     // Catch: java.lang.Throwable -> L3a
            fdat r8 = (defpackage.fdat) r8     // Catch: java.lang.Throwable -> L3a
            hup r9 = new hup     // Catch: java.lang.Throwable -> L3a
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            r8.a(r9, r0)     // Catch: java.lang.Throwable -> L3a
            int r7 = r7 + 1
            goto L21
        L34:
            hwu r0 = defpackage.hzt.k
            r0.addAndGet(r4)
            goto L41
        L3a:
            r0 = move-exception
            hwu r1 = defpackage.hzt.k
            r1.addAndGet(r4)
            throw r0
        L41:
            java.lang.Object r4 = defpackage.hzt.c
            monitor-enter(r4)
            s()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8d
            java.lang.Object[] r0 = r2.b     // Catch: java.lang.Throwable -> L8f
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L8f
            int r5 = r2.length     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8d
            r6 = r1
        L53:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L8f
            long r9 = ~r7     // Catch: java.lang.Throwable -> L8f
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L88
            int r9 = r6 - r5
            int r9 = ~r9     // Catch: java.lang.Throwable -> L8f
            r10 = r1
        L67:
            int r11 = r9 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L86
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L82
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r0[r11]     // Catch: java.lang.Throwable -> L8f
            iaw r11 = (defpackage.iaw) r11     // Catch: java.lang.Throwable -> L8f
            u(r11)     // Catch: java.lang.Throwable -> L8f
        L82:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L67
        L86:
            if (r11 != r12) goto L8d
        L88:
            if (r6 == r5) goto L8d
            int r6 = r6 + 1
            goto L53
        L8d:
            monitor-exit(r4)
            return r3
        L8f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L92:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzt.m(fdap):java.lang.Object");
    }

    public static final Object n(hyz hyzVar, fdap fdapVar) {
        long j2 = hyzVar.i;
        Object objInvoke = fdapVar.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        d = d.b(j2);
        hyzVar.i = j3;
        hyzVar.h = d;
        hyzVar.c = 0;
        hyzVar.d = null;
        hyzVar.z();
        d = d.d(j3);
        return objInvoke;
    }

    public static final Map o(long j2, hza hzaVar, hzn hznVar) {
        long[] jArr;
        Map map;
        hzn hznVar2;
        long[] jArr2;
        char c2;
        hzn hznVar3;
        iay iayVarK;
        long j3 = j2;
        cva cvaVarI = hzaVar.i();
        Map map2 = null;
        if (cvaVarI == null) {
            return null;
        }
        hzn hznVarC = hzaVar.x().d(hzaVar.v()).c(hzaVar.e);
        Object[] objArr = cvaVarI.b;
        long[] jArr3 = cvaVarI.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map3 = null;
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    map = map2;
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((j4 & 255) < 128) {
                            iaw iawVar = (iaw) objArr[(i2 << 3) + i4];
                            iay iayVarD = iawVar.d();
                            jArr2 = jArr3;
                            c2 = '\b';
                            iay iayVarK2 = k(iayVarD, j3, hznVar);
                            if (iayVarK2 != null && (iayVarK = k(iayVarD, j3, hznVarC)) != null && !fdbq.f(iayVarK2, iayVarK)) {
                                hznVar3 = hznVarC;
                                iay iayVarK3 = k(iayVarD, hzaVar.v(), hzaVar.x());
                                if (iayVarK3 == null) {
                                    z();
                                    throw new fcta();
                                }
                                iay iayVarG = iawVar.g(iayVarK, iayVarK2, iayVarK3);
                                if (iayVarG == null) {
                                    return map;
                                }
                                if (map3 == null) {
                                    map3 = new HashMap();
                                }
                                map3.put(iayVarK2, iayVarG);
                            }
                            j4 >>= c2;
                            i4++;
                            j3 = j2;
                            map2 = map;
                            jArr3 = jArr2;
                            hznVarC = hznVar3;
                        } else {
                            jArr2 = jArr3;
                            c2 = '\b';
                        }
                        hznVar3 = hznVarC;
                        j4 >>= c2;
                        i4++;
                        j3 = j2;
                        map2 = map;
                        jArr3 = jArr2;
                        hznVarC = hznVar3;
                    } else {
                        jArr = jArr3;
                        hznVar2 = hznVarC;
                        if (i5 != 8) {
                            return map3;
                        }
                    }
                }
            } else {
                jArr = jArr3;
                map = map2;
                hznVar2 = hznVarC;
            }
            if (i2 == length) {
                return map3;
            }
            i2++;
            j3 = j2;
            map2 = map;
            jArr3 = jArr;
            hznVarC = hznVar2;
        }
    }

    public static final fdap p(final fdap fdapVar, final fdap fdapVar2, boolean z) {
        if (true != z) {
            fdapVar2 = null;
        }
        return (fdapVar == null || fdapVar2 == null || fdapVar == fdapVar2) ? fdapVar == null ? fdapVar2 : fdapVar : new fdap() { // from class: hzp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdap fdapVar3 = hzt.a;
                fdapVar.invoke(obj);
                fdapVar2.invoke(obj);
                return fctx.a;
            }
        };
    }

    public static final fdap q(final fdap fdapVar, final fdap fdapVar2) {
        return (fdapVar == null || fdapVar2 == null || fdapVar == fdapVar2) ? fdapVar == null ? fdapVar2 : fdapVar : new fdap() { // from class: hzr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdap fdapVar3 = hzt.a;
                fdapVar.invoke(obj);
                fdapVar2.invoke(obj);
                return fctx.a;
            }
        };
    }

    public static final void r() {
        m(a);
    }

    public static final void s() {
        iap iapVar = j;
        int i2 = iapVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            hxs hxsVar = iapVar.c[i3];
            Object obj = hxsVar != null ? hxsVar.get() : null;
            if (obj != null && B((iaw) obj)) {
                if (i4 != i3) {
                    iapVar.c[i4] = hxsVar;
                    int[] iArr = iapVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            iapVar.c[i5] = null;
            iapVar.b[i5] = 0;
        }
        if (i4 != i2) {
            iapVar.a = i4;
        }
    }

    public static final void t(hzg hzgVar, iaw iawVar) {
        hzgVar.t(hzgVar.h() + 1);
        fdap fdapVarM = hzgVar.m();
        if (fdapVarM != null) {
            fdapVarM.invoke(iawVar);
        }
    }

    public static final void u(iaw iawVar) {
        if (B(iawVar)) {
            iap iapVar = j;
            int i2 = iapVar.a;
            int iIdentityHashCode = System.identityHashCode(iawVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = iapVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = iapVar.b[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        hxs hxsVar = iapVar.c[i6];
                        if (iawVar == (hxsVar != null ? hxsVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        i3 = i6 - 1;
                        while (i3 >= 0 && iapVar.b[i3] == iIdentityHashCode) {
                            hxs hxsVar2 = iapVar.c[i3];
                            if ((hxsVar2 != null ? hxsVar2.get() : null) == iawVar) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        i6++;
                        int i8 = iapVar.a;
                        while (i6 < i8) {
                            if (iapVar.b[i6] == iIdentityHashCode) {
                                hxs hxsVar3 = iapVar.c[i6];
                                if ((hxsVar3 != null ? hxsVar3.get() : null) == iawVar) {
                                    i3 = i6;
                                    break;
                                }
                                i6++;
                            } else {
                                i3 = -(i6 + 1);
                                break;
                            }
                        }
                        i5 = iapVar.a;
                    }
                }
                i3 = -(i5 + 1);
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            hxs[] hxsVarArr = iapVar.c;
            int length = hxsVarArr.length;
            if (i2 == length) {
                int i11 = length + length;
                hxs[] hxsVarArr2 = new hxs[i11];
                int[] iArr = new int[i11];
                System.arraycopy(hxsVarArr, i9, hxsVarArr2, i10, i2 - i9);
                System.arraycopy(iapVar.c, 0, hxsVarArr2, 0, i9);
                fcur.l(iapVar.b, iArr, i10, i9, i2);
                fcur.q(iapVar.b, iArr, 0, i9, 6);
                iapVar.c = hxsVarArr2;
                iapVar.b = iArr;
            } else {
                System.arraycopy(hxsVarArr, i9, hxsVarArr, i10, i2 - i9);
                int[] iArr2 = iapVar.b;
                fcur.l(iArr2, iArr2, i10, i9, i2);
            }
            iapVar.c[i9] = new hxs(iawVar);
            iapVar.b[i9] = iIdentityHashCode;
            iapVar.a++;
        }
    }

    public static final void v(int i2) {
        hzk hzkVar = f;
        int i3 = hzkVar.d[i2];
        hzkVar.c(i3, hzkVar.a - 1);
        hzkVar.a--;
        hzkVar.b(i3);
        long[] jArr = hzkVar.b;
        int i4 = hzkVar.a >> 1;
        while (i3 < i4) {
            int i5 = i3 + 1;
            int i6 = i5 + i5;
            int i7 = i6 - 1;
            if (i6 < hzkVar.a) {
                long j2 = jArr[i6];
                if (fdbq.b(j2, jArr[i7]) < 0) {
                    if (fdbq.b(j2, jArr[i3]) >= 0) {
                        break;
                    }
                    hzkVar.c(i6, i3);
                    i3 = i6;
                }
            }
            if (fdbq.b(jArr[i7], jArr[i3]) >= 0) {
                break;
            }
            hzkVar.c(i7, i3);
            i3 = i7;
        }
        hzkVar.d[i2] = hzkVar.e;
        hzkVar.e = i2;
    }

    public static final void w(hzg hzgVar) {
        long jA;
        if (d.e(hzgVar.v())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(hzgVar.v());
        sb.append(", disposed=");
        sb.append(hzgVar.j);
        sb.append(", applied=");
        hza hzaVar = hzgVar instanceof hza ? (hza) hzgVar : null;
        sb.append(hzaVar != null ? Boolean.valueOf(hzaVar.g) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            jA = f.a(-1L);
        }
        sb.append(jA);
        throw new IllegalStateException(sb.toString());
    }

    public static final void z() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }
}
