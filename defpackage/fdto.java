package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdto implements fdpl {
    final /* synthetic */ Object a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdau c;

    public fdto(Object obj, fdpl fdplVar, fdau fdauVar) {
        this.a = obj;
        this.b = fdplVar;
        this.c = fdauVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r8.a(r5, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fdtn
            if (r0 == 0) goto L13
            r0 = r8
            fdtn r0 = (defpackage.fdtn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fdtn r0 = new fdtn
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L6d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            fdci r7 = r0.e
            java.lang.Object r2 = r0.d
            defpackage.fctl.b(r8)
            goto L56
        L3a:
            defpackage.fctl.b(r8)
            fdci r8 = new fdci
            r8.<init>()
            java.lang.Object r2 = r6.a
            r8.a = r2
            java.lang.Object r2 = r8.a
            r0.d = r7
            r0.e = r8
            r0.b = r4
            java.lang.Object r2 = r7.fO(r2, r0)
            if (r2 == r1) goto L70
            r2 = r7
            r7 = r8
        L56:
            fdpl r8 = r6.b
            fdau r4 = r6.c
            fdtq r5 = new fdtq
            r5.<init>(r7, r4, r2)
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.b = r3
            java.lang.Object r7 = r8.a(r5, r0)
            if (r7 != r1) goto L6d
            goto L70
        L6d:
            fctx r7 = defpackage.fctx.a
            return r7
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdto.a(fdpm, fcxy):java.lang.Object");
    }
}
