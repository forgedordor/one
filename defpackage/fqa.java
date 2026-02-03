package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqa {
    public float a = 6.0f;
    public float b = 12.0f;
    public float c = 8.0f;
    public float d = 8.0f;
    public final ddp e = new ddp(new kir(6.0f), diu.c, null, 12);
    private ebj f;
    private ebj g;

    private final float c(ebj ebjVar) {
        return ebjVar instanceof ebm ? this.b : ebjVar instanceof ebh ? this.c : ebjVar instanceof ebc ? this.d : this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ebj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ebj] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ebj r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fpy
            if (r0 == 0) goto L13
            r0 = r9
            fpy r0 = (defpackage.fpy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fpy r0 = new fpy
            r0.<init>(r7, r9)
        L18:
            r5 = r0
            java.lang.Object r9 = r5.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r5.a
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto Lb0
        L2b:
            r0 = move-exception
            r9 = r0
            goto Lb5
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.fctl.b(r9)
            float r9 = r7.c(r8)
            r7.g = r8
            ddp r1 = r7.e     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r1.c()     // Catch: java.lang.Throwable -> L2b
            kir r3 = (defpackage.kir) r3     // Catch: java.lang.Throwable -> L2b
            float r3 = r3.a     // Catch: java.lang.Throwable -> L2b
            boolean r3 = defpackage.kir.b(r3, r9)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto Lb0
            ebj r3 = r7.f     // Catch: java.lang.Throwable -> L2b
            r5.a = r8     // Catch: java.lang.Throwable -> L2b
            r5.d = r2     // Catch: java.lang.Throwable -> L2b
            dia r2 = defpackage.fpq.a     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r8 == 0) goto L73
            boolean r3 = r8 instanceof defpackage.ebm     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L62
            dia r2 = defpackage.fpq.a     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L62:
            boolean r3 = r8 instanceof defpackage.eba     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L69
        L66:
            dia r2 = defpackage.fpq.a     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L69:
            boolean r3 = r8 instanceof defpackage.ebh     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L6e
            goto L66
        L6e:
            boolean r3 = r8 instanceof defpackage.ebc     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L8d
            goto L66
        L73:
            if (r3 == 0) goto L8d
            boolean r4 = r3 instanceof defpackage.ebm     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L7c
        L79:
            dia r2 = defpackage.fpq.b     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L7c:
            boolean r4 = r3 instanceof defpackage.eba     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L81
            goto L79
        L81:
            boolean r4 = r3 instanceof defpackage.ebh     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L88
            dia r2 = defpackage.fpq.c     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L88:
            boolean r3 = r3 instanceof defpackage.ebc     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L8d
            goto L79
        L8d:
            r3 = r2
            if (r3 == 0) goto La1
            kir r2 = new kir     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            r6 = 12
            java.lang.Object r9 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2b
            if (r9 == r0) goto Lad
        L9e:
            fctx r9 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L2b
            goto Lad
        La1:
            kir r2 = new kir     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r9 = r1.e(r2, r5)     // Catch: java.lang.Throwable -> L2b
            if (r9 == r0) goto Lad
            goto L9e
        Lad:
            if (r9 != r0) goto Lb0
            return r0
        Lb0:
            r7.f = r8
            fctx r8 = defpackage.fctx.a
            return r8
        Lb5:
            r7.f = r8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.a(ebj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.fpz
            if (r0 == 0) goto L13
            r0 = r6
            fpz r0 = (defpackage.fpz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fpz r0 = new fpz
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L57
        L27:
            r6 = move-exception
            goto L5d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            ebj r6 = r5.g
            float r6 = r5.c(r6)
            ddp r2 = r5.e
            java.lang.Object r4 = r2.c()
            kir r4 = (defpackage.kir) r4
            float r4 = r4.a
            boolean r4 = defpackage.kir.b(r4, r6)
            if (r4 != 0) goto L62
            kir r4 = new kir     // Catch: java.lang.Throwable -> L27
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r1) goto L5c
        L57:
            ebj r6 = r5.g
            r5.f = r6
            goto L62
        L5c:
            return r1
        L5d:
            ebj r0 = r5.g
            r5.f = r0
            throw r6
        L62:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.b(fcxy):java.lang.Object");
    }
}
