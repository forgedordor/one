package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvs implements fdpm {
    final /* synthetic */ fdpm a;

    public wvs(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wvr
            if (r0 == 0) goto L13
            r0 = r8
            wvr r0 = (defpackage.wvr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wvr r0 = new wvr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L6d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r8)
            fdpm r8 = r6.a
            ekgb r7 = (defpackage.ekgb) r7
            r2 = 10
            int r2 = defpackage.fcva.p(r7, r2)
            int r2 = defpackage.fcwa.a(r2)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 16
            int r2 = defpackage.fddu.f(r2, r5)
            r4.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L4f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r7.next()
            r5 = r2
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            anue r5 = r5.F()
            r4.put(r5, r2)
            goto L4f
        L64:
            r0.b = r3
            java.lang.Object r7 = r8.fO(r4, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvs.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
