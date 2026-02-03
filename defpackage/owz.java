package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owz {
    public final oww a;

    public owz() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.owx
            if (r0 == 0) goto L13
            r0 = r6
            owx r0 = (defpackage.owx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            owx r0 = new owx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: defpackage.owt -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            owy r6 = new owy     // Catch: defpackage.owt -> L27
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: defpackage.owt -> L27
            r0.c = r3     // Catch: defpackage.owt -> L27
            java.lang.Object r5 = defpackage.fdjy.a(r6, r0)     // Catch: defpackage.owt -> L27
            if (r5 != r1) goto L47
            return r1
        L43:
            owz r6 = r5.a
            if (r6 != r4) goto L4a
        L47:
            fctx r5 = defpackage.fctx.a
            return r5
        L4a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owz.a(fdap, fcxy):java.lang.Object");
    }

    public /* synthetic */ owz(byte[] bArr) {
        this.a = new oww(this);
    }
}
