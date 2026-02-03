package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuja implements fdpm {
    final /* synthetic */ cujc a;
    final /* synthetic */ fdjx b;

    public cuja(cujc cujcVar, fdjx fdjxVar) {
        this.a = cujcVar;
        this.b = fdjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(defpackage.cuje r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cuiz
            if (r0 == 0) goto L13
            r0 = r6
            cuiz r0 = (defpackage.cuiz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuiz r0 = new cuiz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cuje r5 = r0.d
            defpackage.fctl.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cujc r6 = r4.a
            lva r2 = defpackage.lva.ON_RESUME
            r0.d = r5
            r0.c = r3
            lvc r6 = r6.c
            java.lang.Object r6 = defpackage.dphg.b(r6, r2, r0)
            if (r6 == r1) goto L76
        L44:
            ekrg r6 = defpackage.cujc.a
            ekrw r6 = r6.f()
            r0 = 41
            java.lang.String r1 = "ToastsControllerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/toast/ToastsControllerImpl$initialize$1$1"
            java.lang.String r3 = "emit"
            ekrw r6 = r6.h(r2, r3, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Collected toast: %s"
            r6.t(r0, r5)
            fdjx r6 = r4.b
            boolean r6 = defpackage.fdjy.g(r6)
            if (r6 == 0) goto L73
            cujc r6 = r4.a
            java.lang.String r5 = r5.a
            android.content.Context r6 = r6.b
            r0 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r6, r5, r0)
            r5.show()
        L73:
            fctx r5 = defpackage.fctx.a
            return r5
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuja.fO(cuje, fcxy):java.lang.Object");
    }
}
