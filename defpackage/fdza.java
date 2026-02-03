package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdza {
    public static final fdzi a = new fdzi("REMOVE_FROZEN");
    public final fdhy b;
    private final int c;
    private final boolean d;
    private final int e;
    private final fdhz f;
    private final fdhv g;

    public fdza(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        fdia fdiaVar = fdia.a;
        this.f = new fdhz(null, fdiaVar);
        this.b = new fdhy(0L, fdiaVar);
        this.g = new fdhv(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L4:
            fdhy r2 = r0.b
            long r3 = r2.c
            r5 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r5 = r5 & r3
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 1
            if (r5 == 0) goto L1c
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L1b
            r1 = 2
            return r1
        L1b:
            return r6
        L1c:
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r9 = r9 & r3
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r13 = r3 & r11
            int r5 = r0.e
            r15 = 30
            long r13 = r13 >> r15
            int r13 = (int) r13
            int r14 = r13 + 2
            r14 = r14 & r5
            int r9 = (int) r9
            r10 = r9 & r5
            if (r14 != r10) goto L36
            return r6
        L36:
            boolean r10 = r0.d
            r14 = 1073741823(0x3fffffff, float:1.9999999)
            if (r10 != 0) goto L59
            r10 = r13 & r5
            r16 = r6
            fdhv r6 = r0.g
            fdhz r6 = r6.a(r10)
            java.lang.Object r6 = r6.a
            if (r6 == 0) goto L59
            int r2 = r0.c
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L58
            int r13 = r13 - r9
            r3 = r13 & r14
            int r2 = r2 >> 1
            if (r3 <= r2) goto L4
        L58:
            return r16
        L59:
            int r6 = r13 + 1
            r6 = r6 & r14
            long r9 = defpackage.fdyy.a(r3, r11)
            long r11 = (long) r6
            long r11 = r11 << r15
            long r9 = r9 | r11
            boolean r2 = r2.c(r3, r9)
            if (r2 == 0) goto L4
            r2 = r13 & r5
            fdhv r3 = r0.g
            fdhz r2 = r3.a(r2)
            r2.c(r1)
            r2 = r0
        L75:
            fdhy r3 = r2.b
            long r3 = r3.c
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r3 & r5
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto La5
            fdza r2 = r2.c()
            fdhv r3 = r2.g
            int r4 = r2.e
            r4 = r4 & r13
            fdhz r5 = r3.a(r4)
            java.lang.Object r5 = r5.a
            boolean r6 = r5 instanceof defpackage.fdyz
            r9 = 0
            if (r6 == 0) goto La2
            fdyz r5 = (defpackage.fdyz) r5
            int r5 = r5.a
            if (r5 != r13) goto La2
            fdhz r3 = r3.a(r4)
            r3.c(r1)
            goto La3
        La2:
            r2 = r9
        La3:
            if (r2 != 0) goto L75
        La5:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdza.a(java.lang.Object):int");
    }

    public final Object b() {
        while (true) {
            fdhy fdhyVar = this.b;
            long j = fdhyVar.c;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            long j2 = 1073741823;
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            fdhv fdhvVar = this.g;
            Object obj = fdhvVar.a(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof fdyz) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (fdhyVar.c(j, fdyy.b(j, i4))) {
                    fdhvVar.a(i3).c(null);
                    return obj;
                }
                if (this.d) {
                    fdza fdzaVarC = this;
                    while (true) {
                        fdhy fdhyVar2 = fdzaVarC.b;
                        while (true) {
                            long j3 = fdhyVar2.c;
                            long j4 = j3 & j2;
                            boolean z = fdkb.a;
                            if ((j3 & 1152921504606846976L) != 0) {
                                fdzaVarC = fdzaVarC.c();
                                break;
                            }
                            if (fdhyVar2.c(j3, fdyy.b(j3, i4))) {
                                fdzaVarC.g.a(fdzaVarC.e & ((int) j4)).c(null);
                                fdzaVarC = null;
                                break;
                            }
                            j2 = 1073741823;
                        }
                        if (fdzaVarC == null) {
                            return obj;
                        }
                        j2 = 1073741823;
                    }
                }
            }
        }
    }

    public final fdza c() {
        long j;
        while (true) {
            fdhy fdhyVar = this.b;
            j = fdhyVar.c;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (fdhyVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        fdhz fdhzVar = this.f;
        while (true) {
            fdza fdzaVar = (fdza) fdhzVar.a;
            if (fdzaVar != null) {
                return fdzaVar;
            }
            int i = this.c;
            fdza fdzaVar2 = new fdza(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object fdyzVar = this.g.a(i4).a;
                    if (fdyzVar == null) {
                        fdyzVar = new fdyz(i2);
                    }
                    fdzaVar2.g.a(fdzaVar2.e & i2).c(fdyzVar);
                    i2++;
                }
            }
            fdzaVar2.b.c = fdyy.a(j, 1152921504606846976L);
            fdhzVar.d(null, fdzaVar2);
        }
    }

    public final boolean d() {
        fdhy fdhyVar;
        long j;
        do {
            fdhyVar = this.b;
            j = fdhyVar.c;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!fdhyVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.c;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
