package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxh extends fcyz implements fdat {
    int a;
    int b;
    final /* synthetic */ ahxy c;
    final /* synthetic */ long d;
    final /* synthetic */ UUID e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxh(ahxy ahxyVar, long j, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ahxyVar;
        this.d = j;
        this.e = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|31|(1:(6:5|6|7|21|29|30)(3:8|9|10))(5:13|33|14|(1:16)|25)|35|17|18|(2:20|25)|21|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r2 = r4;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r20) throws java.lang.Throwable {
        /*
            r19 = this;
            r1 = r19
            fcyl r0 = defpackage.fcyl.a
            int r2 = r1.b
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L20
            if (r2 == r4) goto L15
            int r2 = r1.a
            defpackage.fctl.b(r20)     // Catch: java.lang.Exception -> L1e
            r3 = r20
            goto L5a
        L15:
            int r2 = r1.a
            defpackage.fctl.b(r20)     // Catch: java.lang.Exception -> L1e
            r4 = r2
            r2 = r20
            goto L3b
        L1e:
            r0 = move-exception
            goto L67
        L20:
            defpackage.fctl.b(r20)
            ahxy r2 = r1.c     // Catch: java.lang.Exception -> L65
            r1.a = r5     // Catch: java.lang.Exception -> L65
            r1.b = r4     // Catch: java.lang.Exception -> L65
            fcyh r2 = r2.g     // Catch: java.lang.Exception -> L65
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Exception -> L65
            ahxn r4 = new ahxn     // Catch: java.lang.Exception -> L65
            r4.<init>(r3)     // Catch: java.lang.Exception -> L65
            java.lang.Object r2 = defpackage.fdin.a(r2, r4, r1)     // Catch: java.lang.Exception -> L65
            if (r2 == r0) goto L64
            r4 = r5
        L3b:
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> L61
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L61
            ahxy r4 = r1.c     // Catch: java.lang.Exception -> L1e
            r1.a = r2     // Catch: java.lang.Exception -> L1e
            r6 = 2
            r1.b = r6     // Catch: java.lang.Exception -> L1e
            fcyh r4 = r4.g     // Catch: java.lang.Exception -> L1e
            fcyh r4 = defpackage.eicg.a(r4)     // Catch: java.lang.Exception -> L1e
            ahxl r6 = new ahxl     // Catch: java.lang.Exception -> L1e
            r6.<init>(r3)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r3 = defpackage.fdin.a(r4, r6, r1)     // Catch: java.lang.Exception -> L1e
            if (r3 != r0) goto L5a
            goto L64
        L5a:
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Exception -> L1e
            int r5 = r3.intValue()     // Catch: java.lang.Exception -> L1e
            goto L8d
        L61:
            r0 = move-exception
            r2 = r4
            goto L67
        L64:
            return r0
        L65:
            r0 = move-exception
            r2 = r5
        L67:
            ekrg r3 = defpackage.ahxy.a
            ekrw r3 = r3.j()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r6 = "BugleRestore"
            r3.X(r4, r6)
            ekrd r3 = (defpackage.ekrd) r3
            ekrw r0 = r3.g(r0)
            r3 = 374(0x176, float:5.24E-43)
            java.lang.String r4 = "BasicRestoreWorkflowSteps.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$doBugleDbRestore$2$1$2$1"
            java.lang.String r7 = "invokeSuspend"
            ekrw r0 = r0.h(r6, r7, r3, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r3 = "Failed to gather metrics for doBugleDbRestore complete event. Resolving metrics to default value."
            r0.q(r3)
        L8d:
            r9 = r2
            r12 = r5
            ahxy r0 = r1.c
            fcsu r0 = r0.i
            java.lang.Object r0 = r0.b()
            r6 = r0
            ahwi r6 = (defpackage.ahwi) r6
            long r2 = r1.d
            enzp r7 = defpackage.enzp.DO_BUGLE_DATABASE_RESTORE
            long r4 = defpackage.fdhi.h(r2)
            int r0 = defpackage.fdhi.d(r2)
            long r2 = (long) r0
            j$.time.Duration r14 = j$.time.Duration.ofSeconds(r4, r2)
            r14.getClass()
            java.util.UUID r8 = r1.e
            r17 = 0
            r18 = 1880(0x758, float:2.634E-42)
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            defpackage.ahwi.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            fctx r0 = defpackage.fctx.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahxh(this.c, this.d, this.e, fcxyVar);
    }
}
