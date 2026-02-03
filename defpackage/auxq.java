package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auxq implements auyl {
    private final fctc a;

    public auxq(fdae fdaeVar) {
        this.a = fctd.a(fdaeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (defpackage.fdkj.b(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.auxp
            if (r0 == 0) goto L13
            r0 = r7
            auxp r0 = (defpackage.auxp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            auxp r0 = new auxp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            defpackage.fctl.b(r7)
            goto L5f
        L32:
            defpackage.fctl.b(r7)
            goto L56
        L36:
            defpackage.fctl.b(r7)
            fcyh r7 = r0.u()
            fdlq r2 = defpackage.fdlr.c
            fcyf r7 = r7.get(r2)
            fdlr r7 = (defpackage.fdlr) r7
            if (r7 == 0) goto L4a
            defpackage.fdlw.g(r7)
        L4a:
            java.lang.Object r7 = r5.c()
            r0.c = r4
            java.lang.Object r6 = r6.fO(r7, r0)
            if (r6 == r1) goto L65
        L56:
            r0.c = r3
            java.lang.Object r6 = defpackage.fdkj.b(r0)
            if (r6 != r1) goto L5f
            goto L65
        L5f:
            fcta r6 = new fcta
            r6.<init>()
            throw r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auxq.a(fdpm, fcxy):java.lang.Object");
    }

    @Override // defpackage.auyl
    public final Object b() {
        return c();
    }

    public final Object c() {
        return this.a.a();
    }
}
