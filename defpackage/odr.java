package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class odr implements oal {
    final /* synthetic */ odu a;
    private final long b;
    private final boolean c;
    private final boolean d;
    private final mau e;
    private final mau f;
    private boolean g;
    private boolean h;

    public odr(odu oduVar, long j) {
        this.a = oduVar;
        this.b = j;
        boolean z = oduVar.r;
        this.c = z;
        boolean z2 = oduVar.s;
        this.d = z2;
        boolean z3 = true;
        if (!z && !z2) {
            z3 = false;
        }
        mee.c(z3);
        mat matVar = new mat();
        matVar.c("audio/raw");
        this.e = new mau(matVar);
        mat matVar2 = new mat();
        matVar2.c("audio/raw");
        matVar2.F = 44100;
        matVar2.E = 2;
        matVar2.G = 2;
        this.f = new mau(matVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            boolean r0 = r6.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            boolean r0 = r6.g
            if (r0 != 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            boolean r3 = r6.d
            if (r3 == 0) goto L17
            boolean r3 = r6.h
            if (r3 != 0) goto L17
            r3 = r1
            goto L18
        L17:
            r3 = r2
        L18:
            if (r0 != 0) goto L1f
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r4 = r2
            goto L20
        L1f:
            r4 = r1
        L20:
            defpackage.mee.c(r4)
            if (r0 == 0) goto L4b
            odu r0 = r6.a     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            mau r4 = r6.f     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            odt r0 = r0.j(r4)     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            if (r0 != 0) goto L31
            r2 = r1
            goto L4b
        L31:
            odu r4 = r0.c     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            java.util.concurrent.atomic.AtomicInteger r5 = r4.h     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            int r5 = r5.decrementAndGet()     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            if (r5 != 0) goto L44
            boolean r4 = r4.m()     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            if (r4 != 0) goto L44
            r0.d()     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
        L44:
            r6.g = r1     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            goto L4b
        L47:
            r0 = move-exception
            goto L71
        L49:
            r0 = move-exception
            goto L80
        L4b:
            if (r3 == 0) goto L61
            odu r0 = r6.a     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            mau r3 = defpackage.odu.a     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            odt r3 = r0.j(r3)     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            if (r3 != 0) goto L58
            goto L64
        L58:
            android.graphics.Bitmap r3 = defpackage.odu.i()     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            r0.l(r3)     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            r6.h = r1     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
        L61:
            if (r2 != 0) goto L64
            return
        L64:
            odu r0 = r6.a     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            mew r0 = r0.e     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            odq r1 = new odq     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            r1.<init>()     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            r0.h(r1)     // Catch: java.lang.RuntimeException -> L47 defpackage.ocp -> L49
            return
        L71:
            odu r1 = r6.a
            ocp r2 = new ocp
            java.lang.String r3 = "Asset loader error"
            r4 = 1000(0x3e8, float:1.401E-42)
            r2.<init>(r3, r0, r4)
            r1.b(r2)
            return
        L80:
            odu r1 = r6.a
            r1.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odr.a():void");
    }

    @Override // defpackage.oal
    public final int e(odj odjVar) {
        boolean z = this.c && !this.g;
        boolean z2 = this.d && !this.h;
        if (z && z2) {
            odjVar.a = 0;
            return 2;
        }
        if (z || z2) {
            odjVar.a = 50;
            return 2;
        }
        odjVar.a = 99;
        return 2;
    }

    @Override // defpackage.oal
    public final ekgp f() {
        return ekoj.a;
    }

    @Override // defpackage.oal
    public final void h() {
        odu oduVar = this.a;
        oduVar.a(this.b);
        boolean z = this.c;
        int i = 1;
        if (z && this.d) {
            i = 2;
        }
        oduVar.c(i);
        if (z) {
            oduVar.d(this.e, 2);
        }
        if (this.d) {
            oduVar.d(odu.a, 2);
        }
        a();
    }

    @Override // defpackage.oal
    public final void g() {
    }
}
