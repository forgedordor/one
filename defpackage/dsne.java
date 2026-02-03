package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsne extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsnf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsne(dsnf dsnfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsnfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsne) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 == r3) goto L11
            defpackage.fctl.b(r13)
            return r13
        L11:
            defpackage.fctl.b(r13)     // Catch: java.lang.Exception -> L16
            goto Lbd
        L16:
            r13 = move-exception
            goto Ld8
        L19:
            defpackage.fctl.b(r13)
            goto L5f
        L1d:
            defpackage.fctl.b(r13)
            eksp r13 = defpackage.dsnf.a
            ekrw r1 = r13.o()
            java.lang.String r5 = "Executing OneoffSyncJob"
            r1.q(r5)
            dsnf r1 = r12.b
            fcsu r5 = r1.b
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L4c
            ekrw r13 = r13.o()
            java.lang.String r0 = "GrowthKit is disabled, aborting OneoffSyncJob"
            r13.q(r0)
            dxfx r13 = new dxfx
            fctx r0 = defpackage.fctx.a
            r13.<init>(r0)
            return r13
        L4c:
            eygg r13 = r1.e
            java.lang.Object r13 = r13.b()
            r13.getClass()
            com.google.common.util.concurrent.ListenableFuture r13 = (com.google.common.util.concurrent.ListenableFuture) r13
            r12.a = r4
            java.lang.Object r13 = defpackage.fdxs.c(r13, r12)
            if (r13 == r0) goto Le8
        L5f:
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13
            java.lang.String r1 = "LAST_SYNC_TIME"
            r4 = 0
            long r6 = r13.getLong(r1, r4)
            dsnf r13 = r12.b
            diep r1 = r13.f
            j$.time.Instant r1 = r1.f()
            long r8 = r1.toEpochMilli()
            fbdp r1 = defpackage.fbdp.a
            fbdq r1 = r1.get()
            long r10 = r1.a()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto Lac
            long r4 = r8 - r6
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 < 0) goto L8a
            goto Lac
        L8a:
            eksp r13 = defpackage.dsnf.a
            ekrw r13 = r13.o()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r10)
            java.lang.String r3 = "Skipping sync on startup. now=%d, last sync=%d, sync at most=%d"
            r13.I(r3, r0, r1, r2)
            dxfx r13 = new dxfx
            fctx r0 = defpackage.fctx.a
            r13.<init>(r0)
            return r13
        Lac:
            fcyh r1 = r13.g     // Catch: java.lang.Exception -> L16
            dsnd r4 = new dsnd     // Catch: java.lang.Exception -> L16
            r5 = 0
            r4.<init>(r13, r5)     // Catch: java.lang.Exception -> L16
            r12.a = r3     // Catch: java.lang.Exception -> L16
            java.lang.Object r13 = defpackage.fdin.a(r1, r4, r12)     // Catch: java.lang.Exception -> L16
            if (r13 != r0) goto Lbd
            goto Le8
        Lbd:
            eksp r13 = defpackage.dsnf.a
            ekrw r13 = r13.o()
            java.lang.String r1 = "OneoffSyncJob triggering a sync for all accounts"
            r13.q(r1)
            dsnf r13 = r12.b
            evje r1 = defpackage.evje.GROWTHKIT_SYNC_ON_STARTUP
            r12.a = r2
            dsna r13 = r13.d
            java.lang.Object r13 = r13.a(r1, r12)
            if (r13 != r0) goto Ld7
            goto Le8
        Ld7:
            return r13
        Ld8:
            eksp r0 = defpackage.dsnf.a
            ekrw r0 = r0.i()
            java.lang.String r1 = "Failed to install security provider, GrowthKit sync can't run."
            defpackage.a.N(r0, r1, r13)
            dxfq r0 = new dxfq
            r0.<init>(r13, r2)
        Le8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsne.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsne(this.b, fcxyVar);
    }
}
