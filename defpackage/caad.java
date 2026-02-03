package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caad implements caap {
    private final caah a;
    private final awlc b;
    private final caag c;

    public caad(caah caahVar, awlc awlcVar) {
        this.a = caahVar;
        this.b = awlcVar;
        this.c = caahVar.a();
    }

    @Override // defpackage.caap
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, cayy cayyVar, caas caasVar, Exception exc, fcxy fcxyVar) {
        return b((bzzy) obj, obj2, cayyVar, exc, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bzzy r8, java.lang.Object r9, defpackage.cayy r10, java.lang.Exception r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.caac
            if (r0 == 0) goto L13
            r0 = r12
            caac r0 = (defpackage.caac) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            caac r0 = new caac
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r12)
            goto L42
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r12)
            caag r1 = r7.c
            r6.c = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r8 = r1.b(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L42
            return r0
        L42:
            awlc r8 = r7.b
            caab r9 = new caab
            r9.<init>()
            r8.d(r9)
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caad.b(bzzy, java.lang.Object, cayy, java.lang.Exception, fcxy):java.lang.Object");
    }
}
