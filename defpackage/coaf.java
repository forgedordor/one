package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coaf {
    final /* synthetic */ coaw a;
    private final fctc b;
    private final feav c = new feaz();
    private cnza d;

    public coaf(final fcsu fcsuVar, coaw coawVar) {
        this.a = coawVar;
        this.b = fctd.a(new fdae() { // from class: cnzz
            @Override // defpackage.fdae
            public final Object invoke() {
                cmgk cmgkVar = (cmgk) fcsuVar.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.FORWARD_SYNC_WORK_ORGANIZER);
                cmggVarC.f(cnza.a);
                return cmgkVar.a(cmggVarC.a());
            }
        });
    }

    public final cmfo a() {
        return (cmfo) this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.coaa
            if (r0 == 0) goto L13
            r0 = r9
            coaa r0 = (defpackage.coaa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coaa r0 = new coaa
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            feaz r0 = r0.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L77
        L2c:
            r9 = move-exception
            goto L88
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            coaw r2 = r0.d
            feaz r4 = r0.e
            defpackage.fctl.b(r9)
            r9 = r4
            goto L55
        L3f:
            defpackage.fctl.b(r9)
            feav r9 = r8.c
            coaw r2 = r8.a
            r5 = r9
            feaz r5 = (defpackage.feaz) r5
            r0.e = r5
            r0.d = r2
            r0.c = r4
            java.lang.Object r4 = r9.b(r0)
            if (r4 == r1) goto L8c
        L55:
            cnza r4 = r8.d     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L80
            fcyh r2 = r2.c     // Catch: java.lang.Throwable -> L84
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L84
            coab r4 = new coab     // Catch: java.lang.Throwable -> L84
            r5 = 0
            r4.<init>(r5, r8)     // Catch: java.lang.Throwable -> L84
            r6 = r9
            feaz r6 = (defpackage.feaz) r6     // Catch: java.lang.Throwable -> L84
            r0.e = r6     // Catch: java.lang.Throwable -> L84
            r0.d = r5     // Catch: java.lang.Throwable -> L84
            r0.c = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = defpackage.fdin.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == r1) goto L8c
            r7 = r0
            r0 = r9
            r9 = r7
        L77:
            r4 = r9
            cnza r4 = (defpackage.cnza) r4     // Catch: java.lang.Throwable -> L2c
            r8.d = r4     // Catch: java.lang.Throwable -> L2c
            r9.getClass()     // Catch: java.lang.Throwable -> L2c
            r9 = r0
        L80:
            r9.d()
            return r4
        L84:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L88:
            r0.d()
            throw r9
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaf.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fdap r8, defpackage.fcxy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.coac
            if (r0 == 0) goto L13
            r0 = r9
            coac r0 = (defpackage.coac) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coac r0 = new coac
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.a
            feav r8 = (defpackage.feav) r8
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L7c
        L2e:
            r9 = move-exception
            goto L8b
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            coaw r8 = r0.e
            feaz r2 = r0.f
            java.lang.Object r4 = r0.a
            fdap r4 = (defpackage.fdap) r4
            defpackage.fctl.b(r9)
            r9 = r2
            goto L5f
        L45:
            defpackage.fctl.b(r9)
            feav r9 = r7.c
            coaw r2 = r7.a
            r0.a = r8
            r5 = r9
            feaz r5 = (defpackage.feaz) r5
            r0.f = r5
            r0.e = r2
            r0.d = r4
            java.lang.Object r4 = r9.b(r0)
            if (r4 == r1) goto L8f
            r4 = r8
            r8 = r2
        L5f:
            fcyh r8 = r8.c     // Catch: java.lang.Throwable -> L87
            fcyh r8 = defpackage.eicg.a(r8)     // Catch: java.lang.Throwable -> L87
            coae r2 = new coae     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r5, r7, r4)     // Catch: java.lang.Throwable -> L87
            r0.a = r9     // Catch: java.lang.Throwable -> L87
            r0.f = r5     // Catch: java.lang.Throwable -> L87
            r0.e = r5     // Catch: java.lang.Throwable -> L87
            r0.d = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r8 == r1) goto L8f
            r6 = r9
            r9 = r8
            r8 = r6
        L7c:
            cnza r9 = (defpackage.cnza) r9     // Catch: java.lang.Throwable -> L2e
            r7.d = r9     // Catch: java.lang.Throwable -> L2e
            r8.d()
            r9.getClass()
            return r9
        L87:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L8b:
            r8.d()
            throw r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coaf.c(fdap, fcxy):java.lang.Object");
    }
}
