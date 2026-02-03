package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hns extends iay {
    public static final Object a = new Object();
    public long b;
    public int c;
    public cve d;
    public Object e;
    public int f;

    public hns(long j) {
        super(j);
        this.d = cvf.a();
        this.e = a;
    }

    @Override // defpackage.iay
    public final iay a(long j) {
        return new hns(j);
    }

    @Override // defpackage.iay
    public final void b(iay iayVar) {
        iayVar.getClass();
        hns hnsVar = (hns) iayVar;
        this.d = hnsVar.d;
        this.e = hnsVar.e;
        this.f = hnsVar.f;
    }

    public final int c(hzg hzgVar) throws Throwable {
        cve cveVar;
        long[] jArr;
        int i;
        int i2;
        char c;
        long[] jArr2;
        iay iayVarB;
        synchronized (hzt.c) {
            cveVar = this.d;
        }
        int i3 = 7;
        if (!cveVar.i()) {
            return 7;
        }
        hum humVarA = hrp.a();
        Object[] objArr = humVarA.a;
        int i4 = humVarA.b;
        for (int i5 = 0; i5 < i4; i5++) {
            ((hnv) objArr[i5]).b();
        }
        try {
            Object[] objArr2 = cveVar.b;
            int[] iArr = cveVar.c;
            long[] jArr3 = cveVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 7;
                int i7 = 0;
                while (true) {
                    long j = jArr3[i7];
                    if ((((~j) << i3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = i7 - length;
                        int i9 = 0;
                        while (true) {
                            i = i3;
                            i2 = 8 - ((~i8) >>> 31);
                            if (i9 >= i2) {
                                break;
                            }
                            if ((j & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                c = '\b';
                                iaw iawVar = (iaw) objArr2[i10];
                                if (iArr[i10] == 1) {
                                    if (iawVar instanceof hnt) {
                                        try {
                                            hnt hntVar = (hnt) iawVar;
                                            iayVarB = hntVar.b((hns) hzt.f(hntVar.b, hzgVar), hzgVar, false, hntVar.a);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = humVarA.a;
                                            int i11 = humVarA.b;
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                ((hnv) objArr3[i12]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        iayVarB = hzt.f(iawVar.d(), hzgVar);
                                    }
                                    int iIdentityHashCode = ((i6 * 31) + System.identityHashCode(iayVarB)) * 31;
                                    jArr2 = jArr3;
                                    long j2 = iayVarB.g;
                                    i6 = iIdentityHashCode + ((int) (j2 ^ (j2 >>> 32)));
                                    j >>= c;
                                    i9++;
                                    jArr3 = jArr2;
                                    i3 = i;
                                }
                            } else {
                                c = '\b';
                            }
                            jArr2 = jArr3;
                            j >>= c;
                            i9++;
                            jArr3 = jArr2;
                            i3 = i;
                        }
                        jArr = jArr3;
                        if (i2 == 8) {
                            break;
                            break;
                        }
                        break;
                    }
                    jArr = jArr3;
                    i = i3;
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr3 = jArr;
                    i3 = i;
                }
                i3 = i6;
            }
            Object[] objArr4 = humVarA.a;
            int i13 = humVarA.b;
            for (int i14 = 0; i14 < i13; i14++) {
                ((hnv) objArr4[i14]).a();
            }
            return i3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.hzg r6) {
        /*
            r5 = this;
            java.lang.Object r0 = defpackage.hzt.c
            monitor-enter(r0)
            long r1 = r5.b     // Catch: java.lang.Throwable -> L46
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L46
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            int r1 = r5.c     // Catch: java.lang.Throwable -> L46
            int r4 = r6.h()     // Catch: java.lang.Throwable -> L46
            if (r1 == r4) goto L18
            goto L1a
        L18:
            r1 = r2
            goto L1b
        L1a:
            r1 = r3
        L1b:
            monitor-exit(r0)
            java.lang.Object r0 = r5.e
            java.lang.Object r4 = defpackage.hns.a
            if (r0 == r4) goto L2d
            if (r1 == 0) goto L2c
            int r0 = r5.f
            int r4 = r5.c(r6)
            if (r0 != r4) goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r2 == 0) goto L45
            if (r1 == 0) goto L45
            java.lang.Object r0 = defpackage.hzt.c
            monitor-enter(r0)
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L42
            r5.b = r3     // Catch: java.lang.Throwable -> L42
            int r6 = r6.h()     // Catch: java.lang.Throwable -> L42
            r5.c = r6     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            return r2
        L42:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L45:
            return r2
        L46:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hns.d(hzg):boolean");
    }
}
