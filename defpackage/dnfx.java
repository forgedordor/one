package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dnfx {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(defpackage.dnga r6, int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.dnfy
            if (r0 == 0) goto L13
            r0 = r8
            dnfy r0 = (defpackage.dnfy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnfy r0 = new dnfy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r8)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.a
            dnga r6 = (defpackage.dnga) r6
            defpackage.fctl.b(r8)
            goto L49
        L3c:
            defpackage.fctl.b(r8)
            r0.a = r6
            r0.c = r4
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 == r1) goto L5d
        L49:
            r0.a = r8
            r0.c = r3
            java.lang.Object r6 = r6.h()
            if (r6 != r1) goto L54
            goto L5d
        L54:
            r5 = r8
            r8 = r6
            r6 = r5
        L57:
            fcti r7 = new fcti
            r7.<init>(r6, r8)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnfx.a(dnga, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object b(defpackage.dnga r4, int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.dnfz
            if (r0 == 0) goto L13
            r0 = r6
            dnfz r0 = (defpackage.dnfz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dnfz r0 = new dnfz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dnfr r4 = r0.c
            defpackage.fctl.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r6)
            r6 = r4
            dnfr r6 = (defpackage.dnfr) r6
            r0.c = r6
            r0.b = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            dnfr r4 = (defpackage.dnfr) r4
            fdue r5 = r4.i
            fdue r4 = r4.d()
            fcto r0 = new fcto
            r0.<init>(r6, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnfx.b(dnga, int, fcxy):java.lang.Object");
    }
}
