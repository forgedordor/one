package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcny implements fdpm {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ feav b;
    final /* synthetic */ fcnq c;
    final /* synthetic */ fbsm d;

    public fcny(AtomicBoolean atomicBoolean, feav feavVar, fcnq fcnqVar, fbsm fbsmVar) {
        this.a = atomicBoolean;
        this.b = feavVar;
        this.c = fcnqVar;
        this.d = fbsmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[PHI: r8
      0x0095: PHI (r8v7 java.lang.Object) = (r8v2 java.lang.Object), (r8v14 java.lang.Object) binds: [B:30:0x0093, B:16:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fcnx
            if (r0 == 0) goto L13
            r0 = r9
            fcnx r0 = (defpackage.fcnx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fcnx r0 = new fcnx
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.b
            feaz r1 = r0.f
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r9)
            goto Lad
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            goto L95
        L42:
            java.lang.Object r8 = r0.b
            feaz r2 = r0.f
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r9)
            goto L70
        L4c:
            defpackage.fctl.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.a
            r2 = 0
            boolean r9 = r9.compareAndSet(r2, r5)
            if (r9 == 0) goto L84
            feav r2 = r7.b
            fbsm r9 = r7.d
            r0.a = r8
            r6 = r2
            feaz r6 = (defpackage.feaz) r6
            r0.f = r6
            r0.b = r9
            r0.e = r5
            java.lang.Object r5 = r2.b(r0)
            if (r5 != r1) goto L6e
            goto Lbd
        L6e:
            r5 = r8
            r8 = r9
        L70:
            fbrg r9 = new fbrg     // Catch: java.lang.Throwable -> L7f
            r9.<init>()     // Catch: java.lang.Throwable -> L7f
            fbsm r8 = (defpackage.fbsm) r8     // Catch: java.lang.Throwable -> L7f
            r8.b(r9)     // Catch: java.lang.Throwable -> L7f
            r2.d()
            r8 = r5
            goto L84
        L7f:
            r8 = move-exception
            r2.d()
            throw r8
        L84:
            fcnq r9 = r7.c
            r0.a = r8
            r2 = 0
            r0.f = r2
            r0.b = r2
            r0.e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto Lbd
        L95:
            feav r9 = r7.b
            fbsm r2 = r7.d
            r0.a = r8
            r4 = r9
            feaz r4 = (defpackage.feaz) r4
            r0.f = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r0 = r9.b(r0)
            if (r0 == r1) goto Lbd
            r0 = r8
            r1 = r9
            r8 = r2
        Lad:
            fbsm r8 = (defpackage.fbsm) r8     // Catch: java.lang.Throwable -> Lb8
            r8.e(r0)     // Catch: java.lang.Throwable -> Lb8
            r1.d()
            fctx r8 = defpackage.fctx.a
            return r8
        Lb8:
            r8 = move-exception
            r1.d()
            throw r8
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcny.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
