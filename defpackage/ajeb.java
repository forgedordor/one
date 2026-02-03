package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajeb extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ajec c;
    final /* synthetic */ Instant d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajeb(ajec ajecVar, int i, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ajecVar;
        this.e = i;
        this.d = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajeb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r6 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L66
        Lf:
            defpackage.fctl.b(r6)
            goto L30
        L13:
            defpackage.fctl.b(r6)
            ajec r6 = r5.c
            fcsu r6 = r6.b
            java.lang.Object r6 = r6.b()
            aiul r6 = (defpackage.aiul) r6
            int r1 = r5.e
            j$.time.Instant r3 = r5.d
            eiju r6 = r6.k(r1, r3)
            r5.b = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L85
        L30:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L82
            ekrg r6 = defpackage.ajec.a
            ekrw r6 = r6.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "Bugle"
            r6.X(r1, r2)
            r1 = 41
            java.lang.String r2 = "ScreenFirstVisit.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/analytics/screen/ScreenFirstVisit$handleIfFirstVisit$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r6 = r6.h(r3, r4, r1, r2)
            ekrd r6 = (defpackage.ekrd) r6
            int r1 = r5.e
            java.lang.String r2 = "Calling all listeners for first visit to screen: %s"
            java.lang.String r1 = defpackage.aiuk.a(r1)
            r6.t(r2, r1)
            ajec r6 = r5.c
            java.util.Set r6 = r6.c
            java.util.Iterator r1 = r6.iterator()
        L66:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r1.next()
            ajed r6 = (defpackage.ajed) r6
            int r2 = r5.e
            j$.time.Instant r3 = r5.d
            r5.a = r1
            r4 = 2
            r5.b = r4
            java.lang.Object r6 = r6.a(r2, r3, r5)
            if (r6 != r0) goto L66
            goto L85
        L82:
            fctx r6 = defpackage.fctx.a
            return r6
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajeb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajeb(this.c, this.e, this.d, fcxyVar);
    }
}
