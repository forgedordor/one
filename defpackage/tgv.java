package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgv implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ tgz b;

    public tgv(fdpm fdpmVar, tgz tgzVar) {
        this.a = fdpmVar;
        this.b = tgzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r7.fO(r2, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.tgu
            if (r0 == 0) goto L13
            r0 = r8
            tgu r0 = (defpackage.tgu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            tgu r0 = new tgu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.c
            defpackage.fctl.b(r8)
            fctk r8 = (defpackage.fctk) r8
            java.lang.Object r8 = r8.a
            goto L54
        L3c:
            defpackage.fctl.b(r8)
            fdpm r8 = r6.a
            fctk r7 = (defpackage.fctk) r7
            java.lang.Object r7 = r7.a
            tgz r2 = r6.b
            r0.c = r8
            r0.b = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 == r1) goto L68
            r5 = r8
            r8 = r7
            r7 = r5
        L54:
            fctk r2 = new fctk
            r2.<init>(r8)
            r8 = 0
            r0.c = r8
            r0.b = r3
            java.lang.Object r7 = r7.fO(r2, r0)
            if (r7 != r1) goto L65
            goto L68
        L65:
            fctx r7 = defpackage.fctx.a
            return r7
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgv.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
