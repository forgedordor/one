package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avma extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ avmg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avma(avmg avmgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = avmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avma) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r2.g((j$.time.Instant) r1, false, r4) != r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Exception {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.fctl.b(r5)
            goto L7a
        L10:
            java.lang.Object r1 = r4.a
            defpackage.fctl.b(r5)
            goto L5a
        L16:
            java.lang.Object r1 = r4.a
            defpackage.fctl.b(r5)
            goto L3f
        L1c:
            defpackage.fctl.b(r5)
            avmg r5 = r4.c
            fcsu r1 = r5.c
            java.lang.Object r1 = r1.b()
            cogw r1 = (defpackage.cogw) r1
            j$.time.Instant r1 = r1.f()
            fcsu r5 = r5.d
            java.lang.Object r5 = r5.b()
            cmfo r5 = (defpackage.cmfo) r5
            r4.a = r1
            r4.b = r3
            java.lang.Object r5 = r5.c(r4)
            if (r5 == r0) goto L7d
        L3f:
            avde r5 = (defpackage.avde) r5
            evvp r5 = r5.h
            if (r5 != 0) goto L47
            evvp r5 = defpackage.evvp.a
        L47:
            r5.getClass()
            avmg r3 = r4.c
            j$.time.Instant r5 = defpackage.evxd.d(r5)
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r3.f(r5, r4)
            if (r5 == r0) goto L7d
        L5a:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            avmg r2 = r4.c
            java.lang.String r3 = "Bugle.Contacts.Sync.Work.Incremental.Contacts.Count"
            r2.h(r3, r5)
            r1.getClass()
            r5 = 0
            r4.a = r5
            r5 = 3
            r4.b = r5
            j$.time.Instant r1 = (j$.time.Instant) r1
            r5 = 0
            java.lang.Object r5 = r2.g(r1, r5, r4)
            if (r5 != r0) goto L7a
            goto L7d
        L7a:
            fctx r5 = defpackage.fctx.a
            return r5
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avma.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avma(this.c, fcxyVar);
    }
}
