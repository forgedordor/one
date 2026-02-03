package defpackage;

import android.os.Trace;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hne implements hnq, hqx, hpz {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    public final Set c;
    public final hra d;
    public final cuz e;
    public final cuz f;
    public cuz g;
    public hne h;
    public int i;
    public final hxl j;
    public final hmw k;
    public boolean l;
    private final hnb m;
    private final hlw n;
    private final cva o;
    private final cva p;
    private final hsm q;
    private final hsm r;
    private final cuz s;
    private boolean t;
    private fdat u;

    public /* synthetic */ hne(hnb hnbVar, hlw hlwVar) {
        this.m = hnbVar;
        this.n = hlwVar;
        cvd cvdVar = new cvd(new cva((byte[]) null));
        this.c = cvdVar;
        hra hraVar = new hra();
        if (hnbVar.q()) {
            hraVar.e();
        }
        if (hnbVar.s()) {
            hraVar.f();
        }
        this.d = hraVar;
        long[] jArr = cvp.a;
        this.e = new cuz((byte[]) null);
        this.o = new cva((byte[]) null);
        this.p = new cva((byte[]) null);
        this.f = new cuz((byte[]) null);
        hsm hsmVar = new hsm();
        this.q = hsmVar;
        hsm hsmVar2 = new hsm();
        this.r = hsmVar2;
        this.s = new cuz((byte[]) null);
        this.g = new cuz((byte[]) null);
        this.j = new hxl();
        hmw hmwVar = new hmw(hlwVar, hnbVar, hraVar, cvdVar, hsmVar, hsmVar2, this);
        hnbVar.l(hmwVar);
        this.k = hmwVar;
        this.u = hmf.a;
    }

    private final void A() {
        AtomicReference atomicReference = this.a;
        Object andSet = atomicReference.getAndSet(null);
        if (fdbq.f(andSet, hnf.a)) {
            return;
        }
        if (andSet instanceof Set) {
            h((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                hmz.h("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new fcta();
            }
            Objects.toString(atomicReference);
            hmz.h("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new fcta();
        }
        for (Set set : (Set[]) andSet) {
            h(set, false);
        }
    }

    private final void B(Object obj) {
        int i;
        Object objF = this.e.f(obj);
        if (objF == null) {
            return;
        }
        if (!(objF instanceof cva)) {
            hpx hpxVar = (hpx) objF;
            if (hpxVar.o(obj) == 4) {
                huq.a(this.s, obj, hpxVar);
                return;
            }
            return;
        }
        cva cvaVar = (cva) objF;
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
                    if ((255 & j) < 128) {
                        hpx hpxVar2 = (hpx) objArr[(i2 << 3) + i4];
                        if (hpxVar2.o(obj) == 4) {
                            huq.a(this.s, obj, hpxVar2);
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

    private final boolean C(hpx hpxVar, Object obj) {
        return t() && this.k.aj(hpxVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb A[Catch: all -> 0x00d7, EDGE_INSN: B:70:0x00bb->B:54:0x00bb BREAK  A[LOOP:0: B:37:0x0077->B:51:0x00b4], EDGE_INSN: B:71:0x00bb->B:54:0x00bb BREAK  A[LOOP:0: B:37:0x0077->B:51:0x00b4], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:9:0x001d, B:11:0x0021, B:12:0x0026, B:14:0x002c, B:19:0x003c, B:24:0x0045, B:26:0x004a, B:27:0x0053, B:29:0x0057, B:30:0x005f, B:32:0x0067, B:34:0x006b, B:37:0x0077, B:39:0x0087, B:40:0x008a, B:42:0x0093, B:44:0x009d, B:48:0x00ab, B:51:0x00b4, B:52:0x00b7, B:54:0x00bb), top: B:68:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int D(defpackage.hpx r22, defpackage.hlv r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hne.D(hpx, hlv, java.lang.Object):int");
    }

    public static final void w() {
        fdbq.f(null, null);
    }

    private final void x(Object obj, boolean z) {
        int i;
        Object objF = this.e.f(obj);
        if (objF == null) {
            return;
        }
        if (!(objF instanceof cva)) {
            hpx hpxVar = (hpx) objF;
            if (huq.c(this.s, obj, hpxVar) || hpxVar.o(obj) == 1) {
                return;
            }
            if (!hpxVar.m() || z) {
                this.o.g(hpxVar);
                return;
            } else {
                this.p.g(hpxVar);
                return;
            }
        }
        cva cvaVar = (cva) objF;
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
                    if ((255 & j) < 128) {
                        hpx hpxVar2 = (hpx) objArr[(i2 << 3) + i4];
                        if (!huq.c(this.s, obj, hpxVar2) && hpxVar2.o(obj) != 1) {
                            if (!hpxVar2.m() || z) {
                                this.o.g(hpxVar2);
                            } else {
                                this.p.g(hpxVar2);
                            }
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

    /* JADX WARN: Finally extract failed */
    private final void y(hsm hsmVar) throws Throwable {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        char c2;
        long[] jArr3;
        hmw hmwVar = this.k;
        hxl hxlVar = this.j;
        hxlVar.g(this.c, hmwVar.Q());
        try {
            try {
                if (!hsmVar.d()) {
                    Trace.beginSection("Compose:applyChanges");
                    try {
                        hlw hlwVar = this.n;
                        hxl hxlVar2 = this.j;
                        hre hreVarD = this.d.d();
                        int i2 = 0;
                        try {
                            hsmVar.b(hlwVar, hreVarD, hxlVar2, this.k.Q());
                            hreVarD.A(true);
                            hlwVar.f();
                            Trace.endSection();
                            hxl hxlVar3 = this.j;
                            hxlVar3.e();
                            hum humVar = hxlVar3.c;
                            if (humVar.b != 0) {
                                Trace.beginSection("Compose:sideeffects");
                                try {
                                    Object[] objArr = humVar.a;
                                    int i3 = humVar.b;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        ((fdae) objArr[i4]).invoke();
                                    }
                                    humVar.g();
                                    Trace.endSection();
                                } finally {
                                }
                            }
                            if (this.t) {
                                Trace.beginSection("Compose:unobserve");
                                try {
                                    this.t = false;
                                    cuz cuzVar = this.e;
                                    long[] jArr4 = cuzVar.a;
                                    int length = jArr4.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        while (true) {
                                            long j3 = jArr4[i5];
                                            char c3 = 7;
                                            long j4 = -9187201950435737472L;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = i5 - length;
                                                int i7 = i2;
                                                while (true) {
                                                    i = 8 - ((~i6) >>> 31);
                                                    if (i7 >= i) {
                                                        break;
                                                    }
                                                    if ((j3 & 255) < 128) {
                                                        int i8 = (i5 << 3) + i7;
                                                        c = c3;
                                                        Object obj = cuzVar.b[i8];
                                                        Object obj2 = cuzVar.c[i8];
                                                        j2 = j4;
                                                        if (obj2 instanceof cva) {
                                                            obj2.getClass();
                                                            cva cvaVar = (cva) obj2;
                                                            Object[] objArr2 = cvaVar.b;
                                                            long[] jArr5 = cvaVar.a;
                                                            int length2 = jArr5.length - 2;
                                                            if (length2 >= 0) {
                                                                int i9 = 8;
                                                                while (true) {
                                                                    int i10 = length2;
                                                                    long j5 = jArr5[i2];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i2 - i10)) >>> 31);
                                                                        int i12 = 0;
                                                                        while (i12 < i11) {
                                                                            if ((j5 & 255) < 128) {
                                                                                jArr3 = jArr4;
                                                                                int i13 = (i2 << 3) + i12;
                                                                                if (!((hpx) objArr2[i13]).l()) {
                                                                                    cvaVar.f(i13);
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr4;
                                                                            }
                                                                            j5 >>= i9;
                                                                            i12++;
                                                                            jArr4 = jArr3;
                                                                        }
                                                                        jArr2 = jArr4;
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr2 = jArr4;
                                                                    }
                                                                    length2 = i10;
                                                                    if (i2 == length2) {
                                                                        break;
                                                                    }
                                                                    i2++;
                                                                    j3 = j;
                                                                    jArr4 = jArr2;
                                                                    i9 = 8;
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                                j = j3;
                                                            }
                                                            if (cvaVar.k()) {
                                                                cuzVar.c(i8);
                                                            }
                                                            c2 = '\b';
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j = j3;
                                                            obj2.getClass();
                                                            if (!((hpx) obj2).l()) {
                                                                cuzVar.c(i8);
                                                            }
                                                            c2 = '\b';
                                                        }
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                        c = c3;
                                                        j2 = j4;
                                                        c2 = '\b';
                                                    }
                                                    j3 = j >> c2;
                                                    i7++;
                                                    c3 = c;
                                                    j4 = j2;
                                                    jArr4 = jArr2;
                                                    i2 = 0;
                                                }
                                                jArr = jArr4;
                                                if (i != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr4;
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                            jArr4 = jArr;
                                            i2 = 0;
                                        }
                                    }
                                    z();
                                    Trace.endSection();
                                } finally {
                                }
                            }
                            if (this.r.d()) {
                                this.j.d();
                            }
                        } catch (Throwable th) {
                            hreVarD.A(false);
                            throw th;
                        }
                    } finally {
                    }
                } else if (this.r.d()) {
                    hxlVar.d();
                }
                this.j.c();
            } catch (Throwable th2) {
                th = th2;
                this.j.c();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (this.r.d()) {
                this.j.d();
            }
            this.j.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[PHI: r21 r24 r28 r29
      0x00e4: PHI (r21v8 long) = (r21v7 long), (r21v10 long) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r24v4 int) = (r24v3 int), (r24v7 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r28v6 long[]) = (r28v5 long[]), (r28v9 long[]) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r29v3 int) = (r29v2 int), (r29v6 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hne.z():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    @Override // defpackage.hnq, defpackage.hpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            hmw r2 = r0.k
            int r3 = r2.p
            if (r3 <= 0) goto Lc
            goto Lc5
        Lc:
            hpx r2 = r2.P()
            if (r2 == 0) goto Lc5
            r2.n()
            int r3 = r2.a
            r3 = r3 & 32
            r4 = 0
            if (r3 == 0) goto L1d
            goto L34
        L1d:
            cuq r3 = r2.f
            if (r3 != 0) goto L28
            cuq r3 = new cuq
            r3.<init>(r4)
            r2.f = r3
        L28:
            int r5 = r2.e
            int r3 = r3.d(r1, r5)
            int r5 = r2.e
            if (r3 != r5) goto L34
            goto Lc5
        L34:
            boolean r3 = r1 instanceof defpackage.iax
            r5 = 1
            if (r3 == 0) goto L3f
            r3 = r1
            iax r3 = (defpackage.iax) r3
            r3.j(r5)
        L3f:
            cuz r3 = r0.e
            defpackage.huq.a(r3, r1, r2)
            boolean r3 = r1 instanceof defpackage.hnu
            if (r3 == 0) goto Lc5
            r3 = r1
            hnu r3 = (defpackage.hnu) r3
            hns r6 = r3.f()
            cuz r7 = r0.f
            defpackage.huq.b(r7, r1)
            cve r8 = r6.d
            java.lang.Object[] r9 = r8.b
            long[] r8 = r8.a
            int r10 = r8.length
            int r10 = r10 + (-2)
            if (r10 < 0) goto Lb4
            r12 = 0
        L60:
            r13 = r8[r12]
            r16 = r12
            long r11 = ~r13
            r17 = 7
            long r11 = r11 << r17
            long r11 = r11 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r17
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 == 0) goto Lac
            int r12 = r16 - r10
            r11 = 0
        L78:
            int r15 = ~r12
            int r15 = r15 >>> 31
            r4 = 8
            int r15 = 8 - r15
            if (r11 >= r15) goto Laa
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r13 & r19
            r21 = 128(0x80, double:6.32E-322)
            int r15 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r15 >= 0) goto La2
            int r15 = r16 << 3
            int r15 = r15 + r11
            r15 = r9[r15]
            iaw r15 = (defpackage.iaw) r15
            r19 = r4
            boolean r4 = r15 instanceof defpackage.iax
            if (r4 == 0) goto L9e
            r4 = r15
            iax r4 = (defpackage.iax) r4
            r4.j(r5)
        L9e:
            defpackage.huq.a(r7, r15, r1)
            goto La4
        La2:
            r19 = r4
        La4:
            long r13 = r13 >> r19
            int r11 = r11 + 1
            r4 = 0
            goto L78
        Laa:
            if (r15 != r4) goto Lb4
        Lac:
            r11 = r16
            if (r11 == r10) goto Lb4
            int r12 = r11 + 1
            r4 = 0
            goto L60
        Lb4:
            java.lang.Object r1 = r6.e
            cuz r4 = r2.g
            if (r4 != 0) goto Lc2
            cuz r4 = new cuz
            r5 = 0
            r4.<init>(r5)
            r2.g = r4
        Lc2:
            r4.e(r3, r1)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hne.a(java.lang.Object):void");
    }

    @Override // defpackage.hpz
    public final void b() {
        this.t = true;
    }

    @Override // defpackage.hpz
    public final int c(hpx hpxVar, Object obj) {
        hne hneVar;
        if ((hpxVar.a & 2) != 0) {
            hpxVar.c(true);
        }
        hlv hlvVar = hpxVar.c;
        if (hlvVar != null && hlvVar.a()) {
            if (!this.d.h(hlvVar)) {
                synchronized (this.b) {
                    hneVar = this.h;
                }
                return (hneVar == null || !hneVar.C(hpxVar, obj)) ? 1 : 4;
            }
            if (hpxVar.d != null) {
                return D(hpxVar, hlvVar, obj);
            }
        }
        return 1;
    }

    @Override // defpackage.hna
    public final void d() {
        synchronized (this.b) {
            hmw hmwVar = this.k;
            if (hmwVar.r) {
                hpq.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.l) {
                this.l = true;
                this.u = hmf.b;
                hsm hsmVar = hmwVar.w;
                if (hsmVar != null) {
                    y(hsmVar);
                }
                hra hraVar = this.d;
                boolean z = hraVar.b > 0;
                if (z || !this.c.isEmpty()) {
                    hxl hxlVar = this.j;
                    try {
                        hxlVar.g(this.c, hmwVar.Q());
                        if (z) {
                            hre hreVarD = hraVar.d();
                            try {
                                hmz.l(hreVarD, hxlVar);
                                hreVarD.A(true);
                                hlw hlwVar = this.n;
                                hlwVar.c();
                                hlwVar.f();
                                hxlVar.e();
                            } catch (Throwable th) {
                                hreVarD.A(false);
                                throw th;
                            }
                        }
                        hxlVar.d();
                    } finally {
                        hxlVar.c();
                    }
                }
                hmw hmwVar2 = this.k;
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    hmwVar2.b.o(hmwVar2);
                    hmwVar2.Y();
                    hmwVar2.a.c();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        this.m.p(this);
    }

    @Override // defpackage.hna
    public final boolean e() {
        return this.l;
    }

    public final cuz f() {
        cuz cuzVar = this.g;
        long[] jArr = cvp.a;
        this.g = new cuz((byte[]) null);
        return cuzVar;
    }

    @Override // defpackage.hnq
    public final void g() {
        this.a.set(null);
        this.q.a();
        this.r.a();
        Set set = this.c;
        if (set.isEmpty()) {
            return;
        }
        hxl hxlVar = this.j;
        try {
            hxlVar.g(set, this.k.Q());
            hxlVar.d();
        } finally {
            hxlVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0251 A[PHI: r24 r33
      0x0251: PHI (r24v14 long[]) = (r24v13 long[]), (r24v13 long[]), (r24v15 long[]) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r33v11 long) = (r33v10 long), (r33v10 long), (r33v12 long) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[EDGE_INSN: B:71:0x0176->B:225:0x0113 BREAK  A[LOOP:13: B:61:0x0144->B:72:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.Set r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hne.h(java.util.Set, boolean):void");
    }

    @Override // defpackage.hnq
    public final void i() {
        synchronized (this.b) {
            try {
                y(this.q);
                A();
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        hxl hxlVar = this.j;
                        try {
                            hxlVar.g(set, this.k.Q());
                            hxlVar.d();
                            hxlVar.c();
                        } catch (Throwable th2) {
                            hxlVar.c();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    g();
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.hnq
    public final void j() {
        synchronized (this.b) {
            try {
                hsm hsmVar = this.r;
                if (hsmVar.e()) {
                    y(hsmVar);
                }
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        hxl hxlVar = this.j;
                        try {
                            hxlVar.g(set, this.k.Q());
                            hxlVar.d();
                            hxlVar.c();
                        } catch (Throwable th2) {
                            hxlVar.c();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    g();
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.hnq
    public final void k() {
        hxl hxlVar;
        synchronized (this.b) {
            try {
                hmw hmwVar = this.k;
                hmwVar.k = null;
                Set set = this.c;
                if (!set.isEmpty()) {
                    hxlVar = this.j;
                    try {
                        hxlVar.g(set, hmwVar.Q());
                        hxlVar.d();
                        hxlVar.c();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    Set set2 = this.c;
                    if (!set2.isEmpty()) {
                        hxlVar = this.j;
                        try {
                            hxlVar.g(set2, this.k.Q());
                            hxlVar.d();
                            hxlVar.c();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    g();
                    throw th2;
                }
            }
        }
    }

    public final void l(fdat fdatVar) {
        if (this.l) {
            hpq.b("The composition is disposed");
        }
        this.u = fdatVar;
        this.m.e(this, fdatVar);
    }

    @Override // defpackage.hqx
    public final void m() {
        synchronized (this.b) {
            hra hraVar = this.d;
            boolean z = hraVar.b > 0;
            if (z || !this.c.isEmpty()) {
                Trace.beginSection("Compose:deactivate");
                try {
                    hxl hxlVar = this.j;
                    try {
                        hxlVar.g(this.c, this.k.Q());
                        if (z) {
                            hre hreVarD = hraVar.d();
                            try {
                                hmz.k(hreVarD, hxlVar);
                                hreVarD.A(true);
                                this.n.f();
                                hxlVar.e();
                            } catch (Throwable th) {
                                hreVarD.A(false);
                                throw th;
                            }
                        }
                        hxlVar.d();
                    } finally {
                        hxlVar.c();
                    }
                } finally {
                    Trace.endSection();
                }
            }
            this.e.d();
            this.f.d();
            this.g.d();
            this.q.a();
            this.r.a();
            this.k.Y();
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.a;
        Object obj = hnf.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (fdbq.f(andSet, obj)) {
                hmz.h("pending composition has not been applied");
                throw new fcta();
            }
            if (andSet instanceof Set) {
                h((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                Objects.toString(atomicReference);
                hmz.h("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new fcta();
            }
            for (Set set : (Set[]) andSet) {
                h(set, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010f A[Catch: all -> 0x0213, TryCatch #7 {all -> 0x0213, blocks: (B:10:0x002f, B:12:0x0041, B:14:0x006f, B:16:0x0077, B:17:0x007a, B:19:0x0098, B:68:0x01c2, B:21:0x00a2, B:22:0x00a5, B:23:0x00a6, B:25:0x00ae, B:28:0x00b5, B:30:0x00bb, B:31:0x00c0, B:33:0x00c4, B:34:0x00c9, B:36:0x00d6, B:41:0x00f4, B:42:0x00f6, B:44:0x0106, B:46:0x010f, B:48:0x0117, B:50:0x0128, B:52:0x0130, B:54:0x0143, B:67:0x01bf, B:94:0x01f6, B:95:0x01f9, B:97:0x01fb, B:98:0x01fe, B:37:0x00e4, B:26:0x00b1, B:99:0x01ff, B:18:0x007e, B:43:0x00ff), top: B:136:0x002f, outer: #10, inners: #0, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    @Override // defpackage.hnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.util.List r22) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hne.o(java.util.List):void");
    }

    @Override // defpackage.hnq
    public final void p() {
        synchronized (this.b) {
            for (Object obj : this.d.c) {
                hpx hpxVar = obj instanceof hpx ? (hpx) obj : null;
                if (hpxVar != null) {
                    hpxVar.a();
                }
            }
        }
    }

    @Override // defpackage.hnq
    public final void q(fdae fdaeVar) {
        hmw hmwVar = this.k;
        if (hmwVar.r) {
            hmz.j("Preparing a composition while composing is not supported");
        }
        hmwVar.r = true;
        try {
            fdaeVar.invoke();
        } finally {
            hmwVar.r = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    @Override // defpackage.hnq
    public final void r(Set set) {
        Set setH;
        while (true) {
            AtomicReference atomicReference = this.a;
            Object obj = atomicReference.get();
            if (obj == null || fdbq.f(obj, hnf.a)) {
                setH = set;
            } else if (obj instanceof Set) {
                setH = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    AtomicReference atomicReference2 = this.a;
                    Objects.toString(atomicReference2);
                    throw new IllegalStateException("corrupt pendingModifications: ".concat(atomicReference2.toString()));
                }
                setH = fcur.h((Set[]) obj, set);
            }
            while (!atomicReference.compareAndSet(obj, setH)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.b) {
                    A();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // defpackage.hnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            r17.B(r18)     // Catch: java.lang.Throwable -> L64
            cuz r0 = r1.f     // Catch: java.lang.Throwable -> L64
            r3 = r18
            java.lang.Object r0 = r0.f(r3)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L62
            boolean r3 = r0 instanceof defpackage.cva     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L5d
            cva r0 = (defpackage.cva) r0     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r3 = r0.b     // Catch: java.lang.Throwable -> L64
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L64
            int r4 = r0.length     // Catch: java.lang.Throwable -> L64
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
        L23:
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L64
            long r9 = ~r7     // Catch: java.lang.Throwable -> L64
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L58
            int r9 = r6 - r4
            r10 = r5
        L36:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L64
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L64
            hnu r11 = (defpackage.hnu) r11     // Catch: java.lang.Throwable -> L64
            r1.B(r11)     // Catch: java.lang.Throwable -> L64
        L52:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L36
        L56:
            if (r11 != r12) goto L62
        L58:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L23
        L5d:
            hnu r0 = (defpackage.hnu) r0     // Catch: java.lang.Throwable -> L64
            r1.B(r0)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r2)
            return
        L64:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hne.s(java.lang.Object):void");
    }

    @Override // defpackage.hnq
    public final boolean t() {
        return this.k.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return true;
     */
    @Override // defpackage.hnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.hup
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L5f
            hup r1 = (defpackage.hup) r1
            cvr r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7e
            r6 = r3
        L18:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5a
            int r9 = r6 - r5
            r10 = r3
        L2b:
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
            cuz r13 = r0.e
            boolean r13 = r13.h(r11)
            if (r13 != 0) goto L53
            cuz r13 = r0.f
            boolean r11 = r13.h(r11)
            if (r11 != 0) goto L53
            goto L54
        L53:
            return r4
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2b
        L58:
            if (r11 != r12) goto L7e
        L5a:
            if (r6 == r5) goto L7e
            int r6 = r6 + 1
            goto L18
        L5f:
            java.util.Iterator r1 = r1.iterator()
        L63:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()
            cuz r5 = r0.e
            boolean r5 = r5.h(r2)
            if (r5 != 0) goto L7d
            cuz r5 = r0.f
            boolean r2 = r5.h(r2)
            if (r2 == 0) goto L63
        L7d:
            return r4
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hne.u(java.util.Set):boolean");
    }

    @Override // defpackage.hnq
    public final boolean v() {
        boolean zE;
        synchronized (this.b) {
            n();
            try {
                cuz cuzVarF = f();
                try {
                    w();
                    hmw hmwVar = this.k;
                    if (!hmwVar.d.d()) {
                        hmz.j("Expected applyChanges() to have been called");
                    }
                    if (cuzVarF.e > 0 || !hmwVar.j.isEmpty()) {
                        try {
                            hmwVar.Z(cuzVarF, null);
                            hmwVar.C = null;
                            zE = hmwVar.d.e();
                        } finally {
                            hmwVar.C = null;
                        }
                    } else {
                        zE = false;
                    }
                    if (!zE) {
                        A();
                    }
                } catch (Throwable th) {
                    this.g = cuzVarF;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        hxl hxlVar = this.j;
                        try {
                            hxlVar.g(set, this.k.Q());
                            hxlVar.d();
                            hxlVar.c();
                        } catch (Throwable th3) {
                            hxlVar.c();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    g();
                    throw th4;
                }
            }
        }
        return zE;
    }
}
