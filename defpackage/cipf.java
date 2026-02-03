package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cipf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ciph b;
    final /* synthetic */ cioy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cipf(fcxy fcxyVar, ciph ciphVar, cioy cioyVar) {
        super(2, fcxyVar);
        this.b = ciphVar;
        this.c = cioyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cipf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r7 = ((java.lang.Number) r7).intValue();
        r0 = defpackage.ciph.a.h();
        r0.X(defpackage.eksq.a, "BugleGroupManagement");
        ((defpackage.ekrd) r0.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeSynclet$logSyncResult$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 182, "MmsGroupUpgradeSynclet.kt")).r("Sync has been cancelled %d times in a row.", r7);
        r6.b.c.e("Bugle.Rcs.Groups.MmsGroupUpgrade.ConsecutiveSyncletCancellations.Counts", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        return defpackage.fctx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        return defpackage.fctx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r7 != r0) goto L10;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2a
            goto L71
        Ld:
            java.lang.Object r7 = r6.d
            fdjx r7 = (defpackage.fdjx) r7
            ciph r7 = r6.b
            cioy r1 = r6.c
            ains r3 = r7.c
            java.lang.String r4 = "Bugle.Rcs.Groups.MmsGroupUpgrade.SyncletResult.Counts"
            int r5 = r1.b
            r3.e(r4, r5)
            boolean r1 = r1 instanceof defpackage.cios
            if (r1 == 0) goto L5c
            r6.a = r2
            java.lang.Object r7 = r7.d(r6)
            if (r7 == r0) goto L70
        L2a:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            ekrg r0 = defpackage.ciph.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleGroupManagement"
            r0.X(r1, r2)
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "MmsGroupUpgradeSynclet.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeSynclet$logSyncResult$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Sync has been cancelled %d times in a row."
            r0.r(r1, r7)
            ciph r0 = r6.b
            ains r0 = r0.c
            java.lang.String r1 = "Bugle.Rcs.Groups.MmsGroupUpgrade.ConsecutiveSyncletCancellations.Counts"
            r0.e(r1, r7)
            fctx r7 = defpackage.fctx.a
            return r7
        L5c:
            r1 = 2
            r6.a = r1
            ecjh r7 = r7.e
            cioq r1 = new cioq
            r1.<init>()
            java.lang.Object r7 = defpackage.crrj.b(r7, r1, r6)
            if (r7 == r0) goto L6e
            fctx r7 = defpackage.fctx.a
        L6e:
            if (r7 != r0) goto L71
        L70:
            return r0
        L71:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cipf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cipf cipfVar = new cipf(fcxyVar, this.b, this.c);
        cipfVar.d = obj;
        return cipfVar;
    }
}
