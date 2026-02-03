package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afwo implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ afwu b;

    public afwo(fdpm fdpmVar, afwu afwuVar) {
        this.a = fdpmVar;
        this.b = afwuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r8.fO(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.afwn
            if (r0 == 0) goto L13
            r0 = r9
            afwn r0 = (defpackage.afwn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            afwn r0 = new afwn
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L5e
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.c
            defpackage.fctl.b(r9)
            goto L52
        L38:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            afvq r8 = (defpackage.afvq) r8
            afwu r2 = r7.b
            java.lang.String r5 = r8.a
            java.util.regex.Pattern r8 = r8.b
            r0.c = r9
            r0.b = r4
            java.lang.Object r8 = r2.e(r5, r8, r0)
            if (r8 == r1) goto L61
            r6 = r9
            r9 = r8
            r8 = r6
        L52:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r8 = r8.fO(r9, r0)
            if (r8 != r1) goto L5e
            goto L61
        L5e:
            fctx r8 = defpackage.fctx.a
            return r8
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwo.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
