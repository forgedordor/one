package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdnw implements fdoa {
    public final fdhy a;
    public final fdhy b;
    public final fdhz c;
    public final fdhz d;
    private final int f;
    private final fdhy g;
    private final fdhy h;
    private final fdhz i;
    private final fdhz j;
    private final fdhz k;

    public fdnw(int i) {
        this.f = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        fdia fdiaVar = fdia.a;
        this.a = new fdhy(0L, fdiaVar);
        this.b = new fdhy(0L, fdiaVar);
        fdoh fdohVar = fdny.a;
        this.g = new fdhy(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, fdiaVar);
        this.h = new fdhy(F(), fdiaVar);
        fdoh fdohVar2 = new fdoh(0L, null, this, 3);
        this.c = new fdhz(fdohVar2, fdiaVar);
        this.d = new fdhz(fdohVar2, fdiaVar);
        if (Q()) {
            fdohVar2 = fdny.a;
            fdohVar2.getClass();
        }
        this.i = new fdhz(fdohVar2, fdiaVar);
        this.j = new fdhz(fdny.s, fdiaVar);
        this.k = new fdhz(null, fdiaVar);
    }

    public static final void D(fdne fdneVar, fdoh fdohVar, int i) {
        fdneVar.C(fdohVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int E(defpackage.fdoh r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L35
            boolean r0 = r5.N(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L29
            fdzi r0 = defpackage.fdny.d
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 != 0) goto L29
            if (r11 != 0) goto L21
            r6 = 3
            return r6
        L21:
            boolean r0 = r6.k(r7, r4, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L29:
            fdzi r0 = defpackage.fdny.j
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.h(r7, r2)
            return r1
        L35:
            fdzi r4 = defpackage.fdny.e
            if (r0 != r4) goto L42
            fdzi r1 = defpackage.fdny.d
            boolean r0 = r6.k(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L42:
            fdzi r9 = defpackage.fdny.k
            r10 = 5
            if (r0 == r9) goto L7e
            fdzi r11 = defpackage.fdny.h
            if (r0 == r11) goto L7a
            fdzi r11 = defpackage.fdny.l
            if (r0 != r11) goto L56
            r6.g(r7)
            r5.f()
            return r1
        L56:
            boolean r11 = defpackage.fdkb.a
            r6.g(r7)
            boolean r11 = r0 instanceof defpackage.fdox
            if (r11 == 0) goto L63
            fdox r0 = (defpackage.fdox) r0
            fdne r0 = r0.a
        L63:
            boolean r8 = r5.R(r0, r8)
            if (r8 == 0) goto L6f
            fdzi r8 = defpackage.fdny.i
            r6.j(r7, r8)
            return r2
        L6f:
            java.lang.Object r8 = r6.b(r7, r9)
            if (r8 != r9) goto L76
            return r10
        L76:
            r6.h(r7, r3)
            return r10
        L7a:
            r6.g(r7)
            return r10
        L7e:
            r6.g(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.E(fdoh, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long F() {
        return this.g.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        r1 = (defpackage.fdoh) r1.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.fdoh G(long r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.G(long):fdoh");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0175, code lost:
    
        I(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0178, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.H():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        fdhy fdhyVar = this.h;
        if ((fdhyVar.a(j) & 4611686018427387904L) != 0) {
            while ((fdhyVar.c & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(long r5, defpackage.fdoh r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            fdxy r0 = r7.n()
            fdoh r0 = (defpackage.fdoh) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.r()
            if (r5 == 0) goto L22
            fdxy r5 = r7.n()
            fdoh r5 = (defpackage.fdoh) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            fdhz r5 = r4.i
        L24:
            java.lang.Object r6 = r5.a
            fdzf r6 = (defpackage.fdzf) r6
            long r0 = r6.b
            long r2 = r7.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L46
        L31:
            boolean r0 = r7.v()
            if (r0 == 0) goto L11
            boolean r0 = r5.d(r6, r7)
            if (r0 == 0) goto L47
            boolean r5 = r6.u()
            if (r5 == 0) goto L46
            r6.q()
        L46:
            return
        L47:
            boolean r6 = r7.u()
            if (r6 == 0) goto L24
            r7.q()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.J(long, fdoh):void");
    }

    private final void K(fdne fdneVar) {
        M(fdneVar, true);
    }

    private final void L(fdne fdneVar) {
        M(fdneVar, false);
    }

    private final void M(fdne fdneVar, boolean z) {
        if (fdneVar instanceof fdnr) {
            throw null;
        }
        if (fdneVar instanceof fdis) {
            ((fcxy) fdneVar).w(fctl.a(z ? p() : q()));
            return;
        }
        if (fdneVar instanceof fdot) {
            ((fdot) fdneVar).a.w(new fdog(new fdoe(o())));
            return;
        }
        if (!(fdneVar instanceof fdnq)) {
            if (fdneVar instanceof fear) {
                ((fear) fdneVar).j(this, fdny.l);
                return;
            } else {
                Objects.toString(fdneVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(fdneVar)));
            }
        }
        fdnq fdnqVar = (fdnq) fdneVar;
        fdiu fdiuVar = fdnqVar.b;
        fdiuVar.getClass();
        fdnqVar.b = null;
        fdnqVar.a = fdny.l;
        Throwable thO = fdnqVar.c.o();
        if (thO == null) {
            fdiuVar.w(false);
            return;
        }
        if (fdkb.b) {
            thO = fdzh.a(thO, fdiuVar);
        }
        fdiuVar.w(fctl.a(thO));
    }

    private final boolean N(long j) {
        return j < F() || j < g() + ((long) this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
    
        r12 = (defpackage.fdoh) r12.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean O(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.O(long, boolean):boolean");
    }

    private final boolean P(long j) {
        return O(j, true);
    }

    private final boolean Q() {
        long jF = F();
        return jF == 0 || jF == Long.MAX_VALUE;
    }

    private final boolean R(Object obj, Object obj2) {
        if (obj instanceof fear) {
            return ((fear) obj).j(this, obj2);
        }
        if (obj instanceof fdot) {
            obj.getClass();
            return fdny.c(((fdot) obj).a, new fdog(obj2));
        }
        if (!(obj instanceof fdnq)) {
            if (obj instanceof fdis) {
                obj.getClass();
                return fdny.c((fdis) obj, obj2);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        fdnq fdnqVar = (fdnq) obj;
        fdiu fdiuVar = fdnqVar.b;
        fdiuVar.getClass();
        fdnqVar.b = null;
        fdnqVar.a = obj2;
        return fdny.c(fdiuVar, true);
    }

    private final boolean S(Object obj, fdoh fdohVar, int i) {
        if (obj instanceof fdis) {
            obj.getClass();
            return fdny.c((fdis) obj, fctx.a);
        }
        if (!(obj instanceof fear)) {
            if (obj instanceof fdnr) {
                throw null;
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        int iC = ((feaq) obj).c(this, fctx.a);
        char c = iC != 0 ? iC != 1 ? iC != 2 ? (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c != 2) {
            return c == 1;
        }
        fdohVar.g(i);
        return false;
    }

    private final Object T(fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        Throwable thQ = q();
        if (fdkb.b) {
            thQ = fdzh.a(thQ, fdiuVar);
        }
        fdiuVar.w(fctl.a(thQ));
        Object objM = fdiuVar.m();
        fcyl fcylVar = fcyl.a;
        if (objM == fcylVar) {
            fcxyVar.getClass();
        }
        return objM == fcylVar ? objM : fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void U(fdis fdisVar) {
        Throwable thQ = q();
        if (fdkb.b) {
            thQ = fdzh.a(thQ, fdisVar);
        }
        fdisVar.w(fctl.a(thQ));
    }

    private static final void V(fdne fdneVar, fdoh fdohVar, int i) {
        fdneVar.C(fdohVar, i + fdny.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object k(defpackage.fdnw r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.fdnu
            if (r0 == 0) goto L13
            r0 = r14
            fdnu r0 = (defpackage.fdnu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdnu r0 = new fdnu
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            defpackage.fctl.b(r14)
            fdog r14 = (defpackage.fdog) r14
            java.lang.Object r13 = r14.b
            return r13
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            defpackage.fctl.b(r14)
            fdhz r14 = r13.d
            java.lang.Object r14 = r14.a
            fdoh r14 = (defpackage.fdoh) r14
        L3d:
            boolean r1 = r13.y()
            if (r1 == 0) goto L4d
            java.lang.Throwable r13 = r13.o()
            fdoe r14 = new fdoe
            r14.<init>(r13)
            return r14
        L4d:
            fdhy r1 = r13.b
            long r4 = r1.b()
            int r1 = defpackage.fdny.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.b
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L69
            fdoh r1 = r13.s(r9, r14)
            if (r1 == 0) goto L3d
            r8 = r1
            goto L6a
        L69:
            r8 = r14
        L6a:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.n(r8, r9, r10, r12)
            r1 = r7
            fdzi r14 = defpackage.fdny.m
            if (r13 == r14) goto L9c
            fdzi r14 = defpackage.fdny.o
            if (r13 != r14) goto L89
            long r13 = r1.h()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L86
            r8.p()
        L86:
            r13 = r1
            r14 = r8
            goto L3d
        L89:
            fdzi r14 = defpackage.fdny.n
            if (r13 != r14) goto L98
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.l(r2, r3, r4, r6)
            if (r13 != r0) goto L97
            return r0
        L97:
            return r13
        L98:
            r8.p()
            return r13
        L9c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.k(fdnw, fcxy):java.lang.Object");
    }

    protected boolean A() {
        return false;
    }

    @Override // defpackage.fdou
    public final feam B() {
        fdns fdnsVar = fdns.a;
        fdcm.e(fdnsVar, 3);
        fdnt fdntVar = fdnt.a;
        fdcm.e(fdntVar, 3);
        return new feam(this, fdnsVar, fdntVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135 A[RETURN] */
    @Override // defpackage.fdow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Object r23, defpackage.fcxy r24) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.a(java.lang.Object, fcxy):java.lang.Object");
    }

    @Override // defpackage.fdow
    public Object b(Object obj) {
        fdoh fdohVar;
        fdhy fdhyVar = this.a;
        long j = fdhyVar.c;
        if (!z(j) && !N(j & 1152921504606846975L)) {
            return fdog.a;
        }
        fdhz fdhzVar = this.c;
        fdzi fdziVar = fdny.j;
        fdoh fdohVar2 = (fdoh) fdhzVar.a;
        while (true) {
            long jB = fdhyVar.b();
            long j2 = jB & 1152921504606846975L;
            boolean z = z(jB);
            long j3 = fdny.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (fdohVar2.b != j4) {
                fdoh fdohVarU = u(j4, fdohVar2);
                if (fdohVarU != null) {
                    fdohVar = fdohVarU;
                } else if (z) {
                    return new fdoe(q());
                }
            } else {
                fdohVar = fdohVar2;
            }
            Object obj2 = obj;
            int iC = c(fdohVar, i, obj2, j2, fdziVar, z);
            fdohVar2 = fdohVar;
            if (iC == 0) {
                fdohVar2.p();
                return fctx.a;
            }
            if (iC == 1) {
                return fctx.a;
            }
            if (iC == 2) {
                if (z) {
                    fdohVar2.t();
                    return new fdoe(q());
                }
                fdohVar2.t();
                return fdog.a;
            }
            if (iC == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iC == 4) {
                if (j2 < g()) {
                    fdohVar2.p();
                }
                return new fdoe(q());
            }
            fdohVar2.p();
            obj = obj2;
        }
    }

    public final int c(fdoh fdohVar, int i, Object obj, long j, Object obj2, boolean z) {
        fdohVar.i(i, obj);
        if (z) {
            return E(fdohVar, i, obj, j, obj2, true);
        }
        Object objD = fdohVar.d(i);
        if (objD == null) {
            if (N(j)) {
                if (fdohVar.k(i, null, fdny.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (fdohVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof fdne) {
            fdohVar.g(i);
            if (R(objD, obj)) {
                fdohVar.j(i, fdny.i);
                return 0;
            }
            fdzi fdziVar = fdny.k;
            if (fdohVar.b(i, fdziVar) == fdziVar) {
                return 5;
            }
            fdohVar.h(i, true);
            return 5;
        }
        return E(fdohVar, i, obj, j, obj2, false);
    }

    @Override // defpackage.fdow
    public final void d(fdap fdapVar) {
        fdzi fdziVar;
        fdhz fdhzVar = this.k;
        if (fdhzVar.d(null, fdapVar)) {
            return;
        }
        do {
            Object obj = fdhzVar.a;
            fdziVar = fdny.q;
            if (obj != fdziVar) {
                if (obj == fdny.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!fdhzVar.d(fdziVar, fdny.r));
        fdapVar.invoke(o());
    }

    @Override // defpackage.fdow
    public final boolean e(Throwable th) {
        return x(th, false);
    }

    @Override // defpackage.fdow
    public final boolean f() {
        return z(this.a.c);
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        return this.a.c & 1152921504606846975L;
    }

    @Override // defpackage.fdou
    public final Object i(fcxy fcxyVar) throws Throwable {
        fdoh fdohVarS;
        fdnw fdnwVar = this;
        fdhz fdhzVar = fdnwVar.d;
        fdoh fdohVar = (fdoh) fdhzVar.a;
        while (!fdnwVar.y()) {
            fdhy fdhyVar = fdnwVar.b;
            long jB = fdhyVar.b();
            long j = fdny.b;
            long j2 = jB / j;
            int i = (int) (jB % j);
            if (fdohVar.b != j2) {
                fdoh fdohVarS2 = fdnwVar.s(j2, fdohVar);
                if (fdohVarS2 != null) {
                    fdohVar = fdohVarS2;
                } else {
                    continue;
                }
            }
            Object objN = fdnwVar.n(fdohVar, i, jB, null);
            fdzi fdziVar = fdny.m;
            if (objN == fdziVar) {
                throw new IllegalStateException("unexpected");
            }
            fdzi fdziVar2 = fdny.o;
            if (objN != fdziVar2) {
                fdzi fdziVar3 = fdny.n;
                if (objN != fdziVar3) {
                    fdohVar.p();
                    return objN;
                }
                fdiu fdiuVarA = fdiw.a(fcym.c(fcxyVar));
                fdnw fdnwVar2 = this;
                try {
                    Object objN2 = fdnwVar2.n(fdohVar, i, jB, fdiuVarA);
                    if (objN2 == fdziVar) {
                        D(fdiuVarA, fdohVar, i);
                    } else if (objN2 == fdziVar2) {
                        if (jB < fdnwVar2.h()) {
                            fdohVar.p();
                        }
                        fdoh fdohVar2 = (fdoh) fdhzVar.a;
                        while (true) {
                            if (fdnwVar2.y()) {
                                fdiuVarA.w(fctl.a(fdnwVar2.p()));
                                break;
                            }
                            long jB2 = fdhyVar.b();
                            long j3 = jB2 / j;
                            int i2 = (int) (jB2 % j);
                            if (fdohVar2.b != j3) {
                                fdohVarS = fdnwVar2.s(j3, fdohVar2);
                                if (fdohVarS == null) {
                                    continue;
                                }
                            } else {
                                fdohVarS = fdohVar2;
                            }
                            Object objN3 = fdnwVar2.n(fdohVarS, i2, jB2, fdiuVarA);
                            if (objN3 == fdziVar) {
                                D(fdiuVarA, fdohVarS, i2);
                                break;
                            }
                            if (objN3 == fdziVar2) {
                                if (jB2 < h()) {
                                    fdohVarS.p();
                                }
                                fdnwVar2 = this;
                                fdohVar2 = fdohVarS;
                            } else {
                                if (objN3 == fdziVar3) {
                                    throw new IllegalStateException("unexpected");
                                }
                                fdohVarS.p();
                                fdiuVarA.f(objN3, null);
                            }
                        }
                    } else {
                        fdohVar.p();
                        fdiuVarA.f(objN2, null);
                    }
                    Object objM = fdiuVarA.m();
                    if (objM == fcyl.a) {
                        fcxyVar.getClass();
                    }
                    return objM;
                } catch (Throwable th) {
                    fdiuVarA.E();
                    throw th;
                }
            }
            if (jB < h()) {
                fdohVar.p();
            }
            fdnwVar = this;
        }
        throw fdzh.b(p());
    }

    @Override // defpackage.fdou
    public final Object j(fcxy fcxyVar) {
        return k(this, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fdoh r17, int r18, long r19, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.l(fdoh, int, long, fcxy):java.lang.Object");
    }

    @Override // defpackage.fdou
    public final Object m() {
        fdoh fdohVar;
        fdhy fdhyVar = this.b;
        long j = fdhyVar.c;
        long j2 = this.a.c;
        if (P(j2)) {
            return new fdoe(o());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return fdog.a;
        }
        fdhz fdhzVar = this.d;
        fdzi fdziVar = fdny.k;
        fdoh fdohVar2 = (fdoh) fdhzVar.a;
        while (!y()) {
            long jB = fdhyVar.b();
            long j3 = fdny.b;
            long j4 = jB / j3;
            int i = (int) (jB % j3);
            if (fdohVar2.b != j4) {
                fdoh fdohVarS = s(j4, fdohVar2);
                if (fdohVarS != null) {
                    fdohVar = fdohVarS;
                } else {
                    continue;
                }
            } else {
                fdohVar = fdohVar2;
            }
            Object objN = n(fdohVar, i, jB, fdziVar);
            fdoh fdohVar3 = fdohVar;
            if (objN == fdny.m) {
                w(jB);
                fdohVar3.t();
                return fdog.a;
            }
            if (objN != fdny.o) {
                if (objN == fdny.n) {
                    throw new IllegalStateException("unexpected");
                }
                fdohVar3.p();
                return objN;
            }
            if (jB < h()) {
                fdohVar3.p();
            }
            fdohVar2 = fdohVar3;
        }
        return new fdoe(o());
    }

    public final Object n(fdoh fdohVar, int i, long j, Object obj) {
        Object objD = fdohVar.d(i);
        if (objD == null) {
            if (j >= (this.a.c & 1152921504606846975L)) {
                if (obj == null) {
                    return fdny.n;
                }
                if (fdohVar.k(i, null, obj)) {
                    H();
                    return fdny.m;
                }
            }
        } else if (objD == fdny.d && fdohVar.k(i, objD, fdny.i)) {
            H();
            return fdohVar.e(i);
        }
        while (true) {
            Object objD2 = fdohVar.d(i);
            if (objD2 == null || objD2 == fdny.e) {
                if (j < (this.a.c & 1152921504606846975L)) {
                    if (fdohVar.k(i, objD2, fdny.h)) {
                        H();
                        return fdny.o;
                    }
                } else {
                    if (obj == null) {
                        return fdny.n;
                    }
                    if (fdohVar.k(i, objD2, obj)) {
                        H();
                        return fdny.m;
                    }
                }
            } else if (objD2 != fdny.d) {
                fdzi fdziVar = fdny.j;
                if (objD2 == fdziVar) {
                    return fdny.o;
                }
                if (objD2 == fdny.h) {
                    return fdny.o;
                }
                if (objD2 == fdny.l) {
                    H();
                    return fdny.o;
                }
                if (objD2 != fdny.g && fdohVar.k(i, objD2, fdny.f)) {
                    boolean z = objD2 instanceof fdox;
                    if (z) {
                        objD2 = ((fdox) objD2).a;
                    }
                    if (S(objD2, fdohVar, i)) {
                        fdohVar.j(i, fdny.i);
                        H();
                        return fdohVar.e(i);
                    }
                    fdohVar.j(i, fdziVar);
                    fdohVar.h(i, false);
                    if (z) {
                        H();
                    }
                    return fdny.o;
                }
            } else if (fdohVar.k(i, objD2, fdny.i)) {
                H();
                return fdohVar.e(i);
            }
        }
    }

    protected final Throwable o() {
        return (Throwable) this.j.a;
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new fdol() : thO;
    }

    protected final Throwable q() {
        Throwable thO = o();
        return thO == null ? new fdom("Channel was closed") : thO;
    }

    @Override // defpackage.fdou
    public final fdoc r() {
        return new fdnq(this);
    }

    public final fdoh s(long j, fdoh fdohVar) {
        Object objA;
        long j2;
        long j3;
        fdoh fdohVar2 = fdny.a;
        fdnx fdnxVar = fdnx.a;
        loop0: while (true) {
            objA = fdxx.a(fdohVar, j, fdnxVar);
            if (!fdzg.b(objA)) {
                fdzf fdzfVarA = fdzg.a(objA);
                while (true) {
                    fdhz fdhzVar = this.d;
                    fdzf fdzfVar = (fdzf) fdhzVar.a;
                    if (fdzfVar.b >= fdzfVarA.b) {
                        break loop0;
                    }
                    if (fdzfVarA.v()) {
                        if (fdhzVar.d(fdzfVar, fdzfVarA)) {
                            if (fdzfVar.u()) {
                                fdzfVar.q();
                            }
                        } else if (fdzfVarA.u()) {
                            fdzfVarA.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (fdzg.b(objA)) {
            f();
            if (fdohVar.b * fdny.b >= h()) {
                return null;
            }
            fdohVar.p();
            return null;
        }
        fdoh fdohVar3 = (fdoh) fdzg.a(objA);
        if (!Q() && j <= F() / fdny.b) {
            fdhz fdhzVar2 = this.i;
            while (true) {
                fdzf fdzfVar2 = (fdzf) fdhzVar2.a;
                if (fdzfVar2.b >= ((fdzf) fdohVar3).b || !fdohVar3.v()) {
                    break;
                }
                if (fdhzVar2.d(fdzfVar2, fdohVar3)) {
                    if (fdzfVar2.u()) {
                        fdzfVar2.q();
                    }
                } else if (fdohVar3.u()) {
                    fdohVar3.q();
                }
            }
        }
        long j4 = fdohVar3.b;
        if (j4 <= j) {
            boolean z = fdkb.a;
            return fdohVar3;
        }
        long j5 = fdny.b;
        fdhy fdhyVar = this.b;
        do {
            j2 = j4 * j5;
            j3 = fdhyVar.c;
            if (j3 >= j2) {
                break;
            }
        } while (!fdhyVar.c(j3, j2));
        if (j2 >= h()) {
            return null;
        }
        fdohVar3.p();
        return null;
    }

    @Override // defpackage.fdou
    public final void t(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        x(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        r4 = (defpackage.fdoh) r4.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        if (r4 != null) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnw.toString():java.lang.String");
    }

    public final fdoh u(long j, fdoh fdohVar) {
        Object objA;
        long j2;
        long j3;
        long j4;
        fdoh fdohVar2 = fdny.a;
        fdnx fdnxVar = fdnx.a;
        loop0: while (true) {
            objA = fdxx.a(fdohVar, j, fdnxVar);
            if (!fdzg.b(objA)) {
                fdzf fdzfVarA = fdzg.a(objA);
                while (true) {
                    fdhz fdhzVar = this.c;
                    fdzf fdzfVar = (fdzf) fdhzVar.a;
                    if (fdzfVar.b >= fdzfVarA.b) {
                        break loop0;
                    }
                    if (fdzfVarA.v()) {
                        if (fdhzVar.d(fdzfVar, fdzfVarA)) {
                            if (fdzfVar.u()) {
                                fdzfVar.q();
                            }
                        } else if (fdzfVarA.u()) {
                            fdzfVarA.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (fdzg.b(objA)) {
            f();
            if (fdohVar.b * fdny.b >= g()) {
                return null;
            }
            fdohVar.p();
            return null;
        }
        fdoh fdohVar3 = (fdoh) fdzg.a(objA);
        long j5 = fdohVar3.b;
        if (j5 <= j) {
            boolean z = fdkb.a;
            return fdohVar3;
        }
        long j6 = fdny.b;
        fdhy fdhyVar = this.a;
        do {
            j2 = j5 * j6;
            j3 = fdhyVar.c;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!fdhyVar.c(j3, fdny.b(j4, (int) (j3 >> 60))));
        if (j2 >= g()) {
            return null;
        }
        fdohVar3.p();
        return null;
    }

    protected final void v(long j) {
        fdoh fdohVar;
        boolean z = fdkb.a;
        fdoh fdohVar2 = (fdoh) this.d.a;
        while (true) {
            fdhy fdhyVar = this.b;
            int i = this.f;
            long j2 = fdhyVar.c;
            if (j < Math.max(i + j2, F())) {
                return;
            }
            if (fdhyVar.c(j2, 1 + j2)) {
                long j3 = fdny.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (fdohVar2.b != j4) {
                    fdoh fdohVarS = s(j4, fdohVar2);
                    if (fdohVarS != null) {
                        fdohVar = fdohVarS;
                    }
                } else {
                    fdohVar = fdohVar2;
                }
                if (n(fdohVar, i2, j2, null) != fdny.o || j2 < h()) {
                    fdohVar.p();
                }
                fdohVar2 = fdohVar;
            }
        }
    }

    public final void w(long j) {
        long j2;
        long j3;
        if (Q()) {
            return;
        }
        while (F() <= j) {
        }
        int i = fdny.c;
        for (int i2 = 0; i2 < i; i2++) {
            long jF = F();
            if (jF == (4611686018427387903L & this.h.c) && jF == F()) {
                return;
            }
        }
        fdhy fdhyVar = this.h;
        do {
            j2 = fdhyVar.c;
        } while (!fdhyVar.c(j2, fdny.a(j2 & 4611686018427387903L, true)));
        while (true) {
            long jF2 = F();
            long j4 = fdhyVar.c;
            long j5 = j4 & 4611686018427387903L;
            long j6 = 4611686018427387904L & j4;
            if (jF2 == j5 && jF2 == F()) {
                break;
            } else if (j6 == 0) {
                fdhyVar.c(j4, fdny.a(j5, true));
            }
        }
        do {
            j3 = fdhyVar.c;
        } while (!fdhyVar.c(j3, fdny.a(j3 & 4611686018427387903L, false)));
    }

    protected final boolean x(Throwable th, boolean z) {
        long j;
        long jB;
        Object obj;
        long j2;
        long j3;
        if (z) {
            fdhy fdhyVar = this.a;
            do {
                j3 = fdhyVar.c;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!fdhyVar.c(j3, fdny.b(j3 & 1152921504606846975L, 1)));
        }
        boolean zD = this.j.d(fdny.s, th);
        if (z) {
            fdhy fdhyVar2 = this.a;
            do {
                j2 = fdhyVar2.c;
            } while (!fdhyVar2.c(j2, fdny.b(j2 & 1152921504606846975L, 3)));
        } else {
            fdhy fdhyVar3 = this.a;
            do {
                j = fdhyVar3.c;
                int i = (int) (j >> 60);
                if (i == 0) {
                    jB = fdny.b(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    jB = fdny.b(j & 1152921504606846975L, 3);
                }
            } while (!fdhyVar3.c(j, jB));
        }
        f();
        if (zD) {
            fdhz fdhzVar = this.k;
            do {
                obj = fdhzVar.a;
            } while (!fdhzVar.d(obj, obj == null ? fdny.q : fdny.r));
            if (obj != null) {
                fdcm.e(obj, 1);
                ((fdap) obj).invoke(o());
                return true;
            }
        }
        return zD;
    }

    public final boolean y() {
        return P(this.a.c);
    }

    public final boolean z(long j) {
        return O(j, false);
    }
}
