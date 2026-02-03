package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxjd implements dxhl {
    private static final eksp a = eksp.c("GnpSdk");
    private final dxfi b;

    public dxjd(dxfi dxfiVar) {
        this.b = dxfiVar;
    }

    @Override // defpackage.dxhl
    public final void a(Intent intent, dxfy dxfyVar, long j) {
        dxfyVar.getClass();
        fdim.a(fcyi.a, new dxjb(this, intent, dxfyVar, j, null));
    }

    @Override // defpackage.dxhl
    public final boolean b(Intent intent) {
        return fdbq.f("android.intent.action.TIMEZONE_CHANGED", intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dxjc
            if (r0 == 0) goto L13
            r0 = r5
            dxjc r0 = (defpackage.dxjc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxjc r0 = new dxjc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L27
            goto L57
        L27:
            r5 = move-exception
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            eksp r5 = defpackage.dxjd.a
            ekrw r5 = r5.o()
            java.lang.String r2 = "Syncing registration statuses due to Timezone change."
            r5.q(r2)
            dxfi r5 = r4.b     // Catch: java.lang.Exception -> L27
            evjz r2 = defpackage.evjz.TIMEZONE_CHANGED     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L57
            return r1
        L4c:
            eksp r0 = defpackage.dxjd.a
            ekrw r0 = r0.i()
            java.lang.String r1 = "Failed scheduling registration"
            defpackage.a.N(r0, r1, r5)
        L57:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxjd.c(fcxy):java.lang.Object");
    }
}
