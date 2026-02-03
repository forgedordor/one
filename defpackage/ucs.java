package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucs extends fcyz implements fdat {
    int a;
    final /* synthetic */ uct b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucs(uct uctVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = uctVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ucs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
    
        if (r9 == r0) goto L24;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/cloudstore/synclet/synclettasks/cmsdailytimestampobjectupdate/CmsDailyTimestampObjectUpdateSyncletTask$run$1"
            java.lang.String r5 = "CmsDailyTimestampObjectUpdateSyncletTask"
            java.lang.String r6 = "BugleCms"
            java.lang.String r7 = "CmsDailyTimestampObjectUpdateSyncletTask.kt"
            defpackage.fctl.b(r9)
            if (r1 == 0) goto L18
            if (r1 == r2) goto L58
            goto La5
        L18:
            uct r9 = r8.b
            apoy r1 = r9.e
            boolean r1 = r1.a()
            if (r1 != 0) goto L44
            ekrg r9 = defpackage.uct.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            ekrz r0 = defpackage.cqnc.S
            r9.X(r0, r5)
            r0 = 66
            ekrw r9 = r9.h(r4, r3, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Skipping CmsDailyTimestampObjectUpdate run because delta sync flags are off."
            r9.q(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L44:
            fcsu r9 = r9.b
            java.lang.Object r9 = r9.b()
            aurx r9 = (defpackage.aurx) r9
            eiju r9 = r9.k()
            r8.a = r2
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto Le2
        L58:
            uct r1 = r8.b
            aumq r9 = (defpackage.aumq) r9
            fcsu r2 = r1.d
            java.lang.Object r2 = r2.b()
            autx r2 = (defpackage.autx) r2
            r9.getClass()
            boolean r9 = defpackage.autx.n(r9)
            if (r9 != 0) goto L8f
            ekrg r9 = defpackage.uct.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            ekrz r0 = defpackage.cqnc.S
            r9.X(r0, r5)
            r0 = 78
            ekrw r9 = r9.h(r4, r3, r0, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Skipping CmsDailyTimestampObjectUpdate run because initial sync is not complete."
            r9.q(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L8f:
            fcsu r9 = r1.c
            java.lang.Object r9 = r9.b()
            cpmc r9 = (defpackage.cpmc) r9
            eiju r9 = r9.l()
            r1 = 2
            r8.a = r1
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 != r0) goto La5
            goto Le2
        La5:
            evvp r9 = (defpackage.evvp) r9
            evvp r0 = defpackage.evxc.c
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Ldf
            uct r0 = r8.b
            fcsu r0 = r0.b
            java.lang.Object r0 = r0.b()
            aurx r0 = (defpackage.aurx) r0
            r0.V(r9)
            ekrg r0 = defpackage.uct.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r6)
            ekrd r0 = (defpackage.ekrd) r0
            ekrz r1 = defpackage.cqnc.S
            r0.X(r1, r5)
            r1 = 88
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r9 = defpackage.evxc.h(r9)
            java.lang.String r1 = "Updated Cms Settings Data for dailyRetrievedCmsTimestamp with timestamp: %s."
            r0.t(r1, r9)
        Ldf:
            fctx r9 = defpackage.fctx.a
            return r9
        Le2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ucs(this.b, fcxyVar);
    }
}
