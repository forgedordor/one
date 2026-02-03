package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsgr implements dsgp {
    private static final eksp a = eksp.c("GnpSdk");
    private final dxmn b;
    private final dxml c;
    private final dxkt d;
    private final fcsu e;
    private final dxkw f;

    public dsgr(dxmn dxmnVar, dxml dxmlVar, dxkt dxktVar, dxkw dxkwVar, fcsu fcsuVar) {
        dxmnVar.getClass();
        dxktVar.getClass();
        dxkwVar.getClass();
        fcsuVar.getClass();
        this.b = dxmnVar;
        this.c = dxmlVar;
        this.d = dxktVar;
        this.f = dxkwVar;
        this.e = fcsuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dsgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dxhe r8, defpackage.evkh r9, defpackage.evdg r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.dsgq
            if (r0 == 0) goto L13
            r0 = r11
            dsgq r0 = (defpackage.dsgq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsgq r0 = new dsgq
            r0.<init>(r7, r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.fctl.b(r11)
            goto Lc3
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r11)
            eksp r11 = defpackage.dsgr.a
            ekrw r1 = r11.o()
            java.lang.String r3 = "Handling a sync instruction in the InAppPushHandlerImpl."
            r1.q(r3)
            fcsu r1 = r7.e
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc8
            int r9 = r9.b
            evkg r1 = defpackage.evkg.b(r9)
            if (r1 != 0) goto L57
            evkg r1 = defpackage.evkg.UNKNOWN_INSTRUCTION
        L57:
            evkg r3 = defpackage.evkg.SYNC
            if (r1 == r3) goto L71
            ekrw r8 = r11.i()
            eksl r8 = (defpackage.eksl) r8
            evkg r9 = defpackage.evkg.b(r9)
            if (r9 != 0) goto L69
            evkg r9 = defpackage.evkg.UNKNOWN_INSTRUCTION
        L69:
            java.lang.String r10 = "Received unsupported in-app sync instruction type - %s."
            r8.t(r10, r9)
            fctx r8 = defpackage.fctx.a
            return r8
        L71:
            ekrw r9 = r11.o()
            java.lang.String r1 = "Payload has SYNC instruction."
            r9.q(r1)
            dxkt r9 = r7.d
            dxkw r1 = r7.f
            r3 = 13
            dxku r1 = r1.b(r3)
            r1.b(r8)
            r1.a(r10)
            r10 = r1
            dxkx r10 = (defpackage.dxkx) r10
            r3 = 4
            r10.t = r3
            r9.a(r1)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            dxvi r9 = r8.s()
            dxww r9 = defpackage.dxnd.a(r9)
            java.lang.String r9 = defpackage.dxgh.a(r9)
            java.lang.String r10 = "GNP_ACCOUNT_TO_SYNC"
            r4.putString(r10, r9)
            ekrw r9 = r11.o()
            java.lang.String r10 = "Scheduling an inAppSyncJob in the InAppPushHandlerImpl."
            r9.q(r10)
            dxmn r1 = r7.b
            r9 = r2
            dxml r2 = r7.c
            r5.c = r9
            r6 = 8
            r3 = r8
            java.lang.Object r11 = defpackage.dxmm.b(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lc3
            return r0
        Lc3:
            dxft r11 = (defpackage.dxft) r11
            fctx r8 = defpackage.fctx.a
            return r8
        Lc8:
            ekrw r8 = r11.o()
            java.lang.String r9 = "Can't handle sync instruction as GrowthKit is disabled."
            r8.q(r9)
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsgr.a(dxhe, evkh, evdg, fcxy):java.lang.Object");
    }
}
