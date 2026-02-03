package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahya {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/impl/CommonRestoreFunctions");
    private final fcsu b;
    private final ahzu c;

    public ahya(fcsu fcsuVar, ahzv ahzvVar) {
        fcsuVar.getClass();
        ahzvVar.getClass();
        this.b = fcsuVar;
        this.c = ahzvVar.a(a, null, null);
    }

    public final enzc a(ahto ahtoVar, int i) {
        aiaa aiaaVar = ahtoVar.f;
        if (aiaaVar != null) {
            if (aiaaVar.c > 150) {
                return enzc.BACKUP_SCHEMA_OUT_OF_DATE;
            }
            if (i < aiaaVar.g) {
                return enzc.RESTORE_WORKFLOW_OUT_OF_DATE;
            }
            throw new IllegalStateException("App update required but both backup DB schema and workflow version are up to date");
        }
        throw new IllegalStateException("No backup database metadata found for [" + ahtoVar.a + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r7, defpackage.aiaa r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ahxz
            if (r0 == 0) goto L13
            r0 = r9
            ahxz r0 = (defpackage.ahxz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahxz r0 = new ahxz
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L63
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.fctl.b(r9)
            long r8 = r8.f
            ahzu r2 = r6.c
            r4 = 150(0x96, double:7.4E-322)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 0
            if (r8 <= 0) goto L3f
            r4 = r3
            goto L40
        L3f:
            r4 = r9
        L40:
            java.lang.String r5 = "Backup database schema out of date: %s"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.h(r5, r4)
            if (r8 <= 0) goto L68
            java.lang.String r8 = "Could not proceed with restore after app update [%s]"
            r2.h(r8, r7)
            fcsu r8 = r6.b
            java.lang.Object r8 = r8.b()
            ahwd r8 = (defpackage.ahwd) r8
            aiaf r9 = defpackage.aiaf.COMPLETE_FAILED_APP_UPDATE
            r0.c = r3
            java.lang.Object r7 = r8.s(r7, r9, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L68:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahya.b(java.util.UUID, aiaa, fcxy):java.lang.Object");
    }
}
