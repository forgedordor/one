package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agev implements afyw {
    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        return b(fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ageu
            if (r0 == 0) goto L13
            r0 = r5
            ageu r0 = (defpackage.ageu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ageu r0 = new ageu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L31
            r1 = 1
            if (r0 != r1) goto L29
            defpackage.fctl.b(r5)
            adh r5 = (defpackage.adh) r5
            fctx r5 = defpackage.fctx.a
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "com.google.android.gms.accountsettings.action.VIEW_SETTINGS"
            r5.<init>(r0)
            java.lang.String r0 = "com.google.android.gms"
            android.content.Intent r5 = r5.setPackage(r0)
            java.lang.String r0 = "extra.screenId"
            r1 = 10763(0x2a0b, float:1.5082E-41)
            r5.putExtra(r0, r1)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agev.b(fcxy):java.lang.Object");
    }
}
