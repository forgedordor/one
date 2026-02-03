package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ucr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucp(ucr ucrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ucrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ucp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (defpackage.fdxs.c(r5, r4) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L38
        Ld:
            ucr r5 = r4.b
            fcsu r5 = r5.c
            java.lang.Object r5 = r5.b()
            axky r5 = (defpackage.axky) r5
            eiju r5 = r5.a()
            r4.a = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L5b
        L23:
            ucr r1 = r4.b
            cpmi r1 = r1.b
            efwo r5 = (defpackage.efwo) r5
            r2 = 4
            eiju r5 = r1.c(r5, r2)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L38
            goto L5b
        L38:
            ekrg r5 = defpackage.ucr.a
            ekrw r5 = r5.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleCms"
            r5.X(r0, r1)
            r0 = 85
            java.lang.String r1 = "BnrOptOutSyncletTask.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/cloudstore/synclet/synclettasks/bnroptout/BnrOptOutSyncletTask$run$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "BnrOptOutSyncletTask successfully opted out of backup and restore."
            r5.q(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ucp(this.b, fcxyVar);
    }
}
