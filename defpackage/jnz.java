package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnz {
    private static final hpt a = new hsg(jnw.a);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.jfh r5, defpackage.jle r6, defpackage.fdat r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.jny
            if (r0 == 0) goto L13
            r0 = r8
            jny r0 = (defpackage.jny) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            jny r0 = new jny
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            defpackage.fctl.b(r8)
            fcta r5 = new fcta
            r5.<init>()
            throw r5
        L37:
            defpackage.fctl.b(r8)
            goto L49
        L3b:
            defpackage.fctl.b(r8)
            if (r6 != 0) goto L4f
            r0.b = r4
            java.lang.Object r5 = r5.n(r7, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            fcta r5 = new fcta
            r5.<init>()
            throw r5
        L4f:
            r0.b = r3
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnz.a(jfh, jle, fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ffv r4, defpackage.fdat r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.jnx
            if (r0 == 0) goto L13
            r0 = r6
            jnx r0 = (defpackage.jnx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            jnx r0 = new jnx
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.fctl.b(r6)
            goto L53
        L2f:
            defpackage.fctl.b(r6)
            icr r6 = r4.s
            boolean r6 = r6.C
            if (r6 == 0) goto L59
            jfh r6 = defpackage.jbg.f(r4)
            jcr r4 = defpackage.jbg.d(r4)
            hxi r4 = r4.D
            hpt r2 = defpackage.jnz.a
            java.lang.Object r4 = r4.h(r2)
            jle r4 = (defpackage.jle) r4
            r0.b = r3
            java.lang.Object r4 = a(r6, r4, r5, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            fcta r4 = new fcta
            r4.<init>()
            throw r4
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnz.b(ffv, fdat, fcxy):java.lang.Object");
    }
}
