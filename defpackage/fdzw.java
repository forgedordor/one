package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzw extends Thread {
    public final feag a;
    public final fdhx b;
    public boolean c;
    final /* synthetic */ fdzx d;
    public int e;
    private final fdci f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public fdzw(fdzx fdzxVar, int i) {
        this.d = fdzxVar;
        setDaemon(true);
        setContextClassLoader(fdzxVar.getClass().getClassLoader());
        this.a = new feag();
        this.f = new fdci();
        this.e = 4;
        this.b = new fdhx(0, fdia.a);
        this.nextParkedWorker = fdzx.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final feac e() {
        if (a(2) == 0) {
            fdzx fdzxVar = this.d;
            feac feacVar = (feac) fdzxVar.f.b();
            return feacVar != null ? feacVar : (feac) fdzxVar.g.b();
        }
        fdzx fdzxVar2 = this.d;
        feac feacVar2 = (feac) fdzxVar2.g.b();
        return feacVar2 != null ? feacVar2 : (feac) fdzxVar2.f.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        r8 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.feac f(int r26) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdzw.f(int):feac");
    }

    private final boolean g() {
        return this.nextParkedWorker != fdzx.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Alert.DURATION_SHOW_INDEFINITELY) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.feac b(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            goto L6a
        L7:
            fdzx r0 = r9.d
        L9:
            fdhy r3 = r0.j
            long r4 = r3.c
            r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r6 = r6 & r4
            r8 = 42
            long r6 = r6 >> r8
            int r6 = (int) r6
            if (r6 != 0) goto L5c
            feag r10 = r9.a
        L1b:
            fdhz r3 = r10.a
            java.lang.Object r4 = r3.a
            feac r4 = (defpackage.feac) r4
            if (r4 != 0) goto L24
            goto L30
        L24:
            boolean r5 = r4.h
            if (r5 != r2) goto L30
            boolean r3 = r3.d(r4, r1)
            if (r3 == 0) goto L1b
            r1 = r4
            goto L4a
        L30:
            fdhx r3 = r10.c
            int r3 = r3.c
            fdhx r4 = r10.b
            int r4 = r4.c
        L38:
            if (r3 == r4) goto L4a
            fdhx r5 = r10.d
            int r5 = r5.c
            if (r5 != 0) goto L41
            goto L4a
        L41:
            int r4 = r4 + (-1)
            feac r5 = r10.d(r4, r2)
            if (r5 == 0) goto L38
            r1 = r5
        L4a:
            if (r1 != 0) goto L5b
            feaa r10 = r0.g
            java.lang.Object r10 = r10.b()
            feac r10 = (defpackage.feac) r10
            if (r10 != 0) goto L5a
            feac r10 = r9.f(r2)
        L5a:
            return r10
        L5b:
            return r1
        L5c:
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r4
            boolean r3 = r3.c(r4, r6)
            if (r3 == 0) goto L9
            r9.e = r2
        L6a:
            if (r10 == 0) goto L9e
            fdzx r10 = r9.d
            int r10 = r10.b
            int r10 = r10 + r10
            int r10 = r9.a(r10)
            if (r10 != 0) goto L78
            goto L79
        L78:
            r2 = 0
        L79:
            if (r2 == 0) goto L82
            feac r10 = r9.e()
            if (r10 == 0) goto L82
            return r10
        L82:
            feag r10 = r9.a
            fdhz r0 = r10.a
            java.lang.Object r0 = r0.a(r1)
            feac r0 = (defpackage.feac) r0
            if (r0 != 0) goto L92
            feac r0 = r10.c()
        L92:
            if (r0 == 0) goto L95
            return r0
        L95:
            if (r2 != 0) goto La5
            feac r10 = r9.e()
            if (r10 == 0) goto La5
            return r10
        L9e:
            feac r10 = r9.e()
            if (r10 == 0) goto La5
            return r10
        La5:
            r10 = 3
            feac r10 = r9.f(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdzw.b(boolean):feac");
    }

    public final void c(int i) {
        String strValueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.d.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            this.d.j.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                fdzx fdzxVar = this.d;
                if (fdzxVar.d() || this.e == 5) {
                    break loop0;
                }
                feac feacVarB = b(this.c);
                long j = -2097152;
                if (feacVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z2 = fdkb.a;
                        this.e = 2;
                    }
                    if (feacVarB.h) {
                        if (d(2)) {
                            fdzxVar.c();
                        }
                        fdzx.f(feacVarB);
                        fdzxVar.j.a(-2097152L);
                        if (this.e != 5) {
                            boolean z3 = fdkb.a;
                            this.e = 4;
                        }
                    } else {
                        fdzx.f(feacVarB);
                    }
                } else {
                    this.c = false;
                    if (this.h == 0) {
                        long j2 = 2097151;
                        if (g()) {
                            fdhx fdhxVar = this.b;
                            fdhxVar.c = -1;
                            while (g() && fdhxVar.c == -1 && !fdzxVar.d() && this.e != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = System.nanoTime() + fdzxVar.d;
                                }
                                LockSupport.parkNanos(fdzxVar.d);
                                long j3 = j2;
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    fdzd fdzdVar = fdzxVar.i;
                                    synchronized (fdzdVar) {
                                        if (!fdzxVar.d()) {
                                            fdhy fdhyVar = fdzxVar.j;
                                            if (((int) (fdhyVar.c & j3)) > fdzxVar.b) {
                                                if (fdhxVar.c(-1, 1)) {
                                                    int i = this.indexInArray;
                                                    c(0);
                                                    fdzxVar.b(this, i, 0);
                                                    int andDecrement = (int) (fdhy.a.getAndDecrement(fdhyVar) & j3);
                                                    if (andDecrement != i) {
                                                        Object objA = fdzdVar.a(andDecrement);
                                                        objA.getClass();
                                                        fdzw fdzwVar = (fdzw) objA;
                                                        fdzdVar.b(i, fdzwVar);
                                                        fdzwVar.c(i);
                                                        fdzxVar.b(fdzwVar, andDecrement, i);
                                                    }
                                                    fdzdVar.b(andDecrement, null);
                                                    this.e = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3;
                            }
                        } else if (this.nextParkedWorker == fdzx.a) {
                            fdhy fdhyVar2 = fdzxVar.h;
                            while (true) {
                                long j4 = fdhyVar2.c;
                                int i2 = this.indexInArray;
                                boolean z4 = fdkb.a;
                                long j5 = j;
                                this.nextParkedWorker = fdzxVar.i.a((int) (j4 & 2097151));
                                if (fdhyVar2.c(j4, ((2097152 + j4) & j5) | i2)) {
                                    break;
                                } else {
                                    j = j5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        d(5);
    }
}
