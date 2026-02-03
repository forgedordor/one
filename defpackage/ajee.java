package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajee extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajef b;
    final /* synthetic */ Instant c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajee(ajef ajefVar, int i, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajefVar;
        this.d = i;
        this.c = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajee) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r5.a(r2, r4) == r0) goto L17;
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
            if (r1 == r2) goto L27
            goto L55
        Ld:
            ajef r5 = r4.b
            fcsu r5 = r5.d
            java.lang.Object r5 = r5.b()
            aiul r5 = (defpackage.aiul) r5
            int r1 = r4.d
            j$.time.Instant r3 = r4.c
            eiju r5 = r5.k(r1, r3)
            r4.a = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L79
        L27:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L32
            fctx r5 = defpackage.fctx.a
            return r5
        L32:
            ajef r5 = r4.b
            fcsu r1 = r5.c
            java.lang.Object r1 = r1.b()
            ajei r1 = (defpackage.ajei) r1
            int r2 = r4.d
            j$.time.Instant r3 = r4.c
            r1.a(r2, r3)
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            aixr r5 = (defpackage.aixr) r5
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.a(r2, r4)
            if (r5 != r0) goto L55
            goto L79
        L55:
            ekrg r5 = defpackage.ajef.a
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            ekrd r5 = r5.a(r0)
            r0 = 40
            java.lang.String r1 = "ScreenFirstVisitLoggerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/analytics/screen/ScreenFirstVisitLoggerImpl$logEventsOnFirstScreenVisit$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            int r0 = r4.d
            java.lang.String r1 = "All logging tasks for first visit completed at screen: %s"
            java.lang.String r0 = defpackage.aiuk.a(r0)
            r5.t(r1, r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajee.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajee(this.b, this.d, this.c, fcxyVar);
    }
}
