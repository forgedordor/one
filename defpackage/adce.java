package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adce implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ adcg b;

    public adce(fdpm fdpmVar, adcg adcgVar) {
        this.a = fdpmVar;
        this.b = adcgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.adcd
            if (r0 == 0) goto L13
            r0 = r7
            adcd r0 = (defpackage.adcd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            adcd r0 = new adcd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fdpm r7 = r5.a
            cljh r6 = (defpackage.cljh) r6
            adcg r2 = r5.b
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.g
            boolean r2 = r2.get()
            r4 = 0
            if (r2 != 0) goto L46
            cljh r2 = defpackage.cljh.d
            if (r6 != r2) goto L46
            r4 = r3
        L46:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r0.b = r3
            java.lang.Object r6 = r7.fO(r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adce.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
