package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucr implements uck {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/synclet/synclettasks/bnroptout/BnrOptOutSyncletTask");
    public final cpmi b;
    public final fcsu c;
    private final fcsu d;
    private final fdjx e;

    public ucr(cpmi cpmiVar, fcsu fcsuVar, efwo efwoVar, fcsu fcsuVar2, fdjx fdjxVar) {
        cpmiVar.getClass();
        fcsuVar.getClass();
        efwoVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = cpmiVar;
        this.d = fcsuVar;
        this.c = fcsuVar2;
        this.e = fdjxVar;
    }

    @Override // defpackage.uck
    public final /* synthetic */ int a() {
        return 1;
    }

    @Override // defpackage.uck
    public final eiju b() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new ucp(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.uck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ucq
            if (r0 == 0) goto L13
            r0 = r10
            ucq r0 = (defpackage.ucq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ucq r0 = new ucq
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "shouldRun"
            java.lang.String r5 = "com/google/android/apps/messaging/cloudstore/synclet/synclettasks/bnroptout/BnrOptOutSyncletTask"
            java.lang.String r6 = "BugleCms"
            r7 = 1
            java.lang.String r8 = "BnrOptOutSyncletTask.kt"
            if (r2 == 0) goto L38
            if (r2 != r7) goto L30
            defpackage.fctl.b(r10)
            goto La5
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            defpackage.fctl.b(r10)
            ejxr r10 = defpackage.cpyl.Y
            java.lang.Object r10 = r10.get()
            cczi r10 = (defpackage.cczi) r10
            java.lang.Object r10 = r10.e()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L6c
            ekrg r10 = defpackage.ucr.a
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r6)
            r0 = 59
            ekrw r10 = r10.h(r5, r4, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Skipping BnrOptOutSyncletTask run because the synclet flag is off."
            r10.q(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        L6c:
            boolean r10 = defpackage.cpyl.a()
            if (r10 == 0) goto L8f
            ekrg r10 = defpackage.ucr.a
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r6)
            r0 = 65
            ekrw r10 = r10.h(r5, r4, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Skipping BnrOptOutSyncletTask run because the backup and restore flag is enabled."
            r10.q(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        L8f:
            fcsu r10 = r9.d
            java.lang.Object r10 = r10.b()
            aurx r10 = (defpackage.aurx) r10
            aurw r10 = r10.m
            eiju r10 = r10.a()
            r0.c = r7
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto Lcf
        La5:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lca
            ekrg r10 = defpackage.ucr.a
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r6)
            r0 = 71
            ekrw r10 = r10.h(r5, r4, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Skipping BnrOptOutSyncletTask run because the user has not fully enabled backup and restore."
            r10.q(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        Lca:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            return r10
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucr.c(fcxy):java.lang.Object");
    }

    @Override // defpackage.uck
    public final String d() {
        return "BnrOptOutSyncletTask";
    }

    @Override // defpackage.uck
    public final int e() {
        return 11;
    }
}
