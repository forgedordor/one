package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkn extends dben {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/incoming/satellitesessionstatenotificationservice/SatelliteSessionStateNotificationServiceImpl");
    private final clhb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clkn(fcyh fcyhVar, clhb clhbVar) {
        super(fcyhVar);
        fcyhVar.getClass();
        this.b = clhbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.clnk r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.clkl
            if (r0 == 0) goto L13
            r0 = r6
            clkl r0 = (defpackage.clkl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clkl r0 = new clkl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            return r6
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            clod r6 = r5.c
            if (r6 != 0) goto L38
            clod r6 = defpackage.clod.a
        L38:
            int r6 = r6.c
            cloc r6 = defpackage.cloc.b(r6)
            if (r6 != 0) goto L42
            cloc r6 = defpackage.cloc.UNRECOGNIZED
        L42:
            cloc r2 = defpackage.cloc.SESSION_STATUS_UNKNOWN
            if (r6 != r2) goto L73
            io.grpc.Status r6 = io.grpc.Status.e
            clod r5 = r5.c
            if (r5 != 0) goto L4e
            clod r5 = defpackage.clod.a
        L4e:
            int r5 = r5.c
            cloc r5 = defpackage.cloc.b(r5)
            if (r5 != 0) goto L58
            cloc r5 = defpackage.cloc.UNRECOGNIZED
        L58:
            java.lang.String r5 = r5.name()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Failed to process OnReceiveSessionStatusUpdateRequest, invalid session status: "
            java.lang.String r5 = r0.concat(r5)
            io.grpc.Status r5 = r6.withDescription(r5)
            io.grpc.StatusException r5 = r5.asException()
            java.lang.Object r5 = defpackage.fctl.a(r5)
            return r5
        L73:
            clhb r6 = r4.b
            r0.c = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L7e
            return r1
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clkn.b(clnk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dben
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dbdv r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clkn.c(dbdv, fcxy):java.lang.Object");
    }
}
