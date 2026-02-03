package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxjg implements dxhl {
    private static final eksp a = eksp.c("GnpSdk");
    private final dxfi b;

    public dxjg(dxfi dxfiVar) {
        this.b = dxfiVar;
    }

    @Override // defpackage.dxhl
    public final void a(Intent intent, dxfy dxfyVar, long j) {
        dxfyVar.getClass();
        fdim.a(fcyi.a, new dxje(this, intent, dxfyVar, j, null));
    }

    @Override // defpackage.dxhl
    public final boolean b(Intent intent) {
        return fdbq.f("android.intent.action.MY_PACKAGE_REPLACED", intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dxjf
            if (r0 == 0) goto L13
            r0 = r6
            dxjf r0 = (defpackage.dxjf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxjf r0 = new dxjf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            if (r2 == 0) goto L34
            r4 = 1
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L5a
        L2a:
            r6 = move-exception
            goto L4f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.fctl.b(r6)
            eksp r6 = defpackage.dxjg.a
            ekrw r6 = r6.o()
            java.lang.String r2 = "Syncing registration status due to application update."
            r6.q(r2)
            dxfi r6 = r5.b     // Catch: java.lang.Exception -> L2a
            evjz r2 = defpackage.evjz.APP_UPDATED     // Catch: java.lang.Exception -> L2a
            r0.c = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L5a
            return r1
        L4f:
            eksp r0 = defpackage.dxjg.a
            ekrw r0 = r0.i()
            java.lang.String r1 = "Failed scheduling registration"
            defpackage.a.N(r0, r1, r6)
        L5a:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxjg.c(fcxy):java.lang.Object");
    }
}
