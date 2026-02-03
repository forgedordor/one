package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdsc {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fdpm r4, java.lang.Object r5, java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.fdrq
            if (r0 == 0) goto L13
            r0 = r7
            fdrq r0 = (defpackage.fdrq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdrq r0 = new fdrq
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L3f
        L31:
            defpackage.fctl.b(r7)
            r0.a = r6
            r0.c = r3
            java.lang.Object r4 = r4.fO(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            fdvn r4 = new fdvn
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdsc.a(fdpm, java.lang.Object, java.lang.Object, fcxy):java.lang.Object");
    }

    public static final fdpl b(fdpl fdplVar, int i) {
        if (i > 0) {
            return new fdrs(fdplVar, i);
        }
        throw new IllegalArgumentException(a.e(i, "Requested element count ", " should be positive"));
    }

    public static final fdpl c(fdpl fdplVar, fdau fdauVar) {
        return new fdui(new fdsb(fdplVar, fdauVar, null));
    }
}
