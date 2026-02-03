package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avlx extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ avmg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avlx(avmg avmgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = avmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avlx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r3.g((j$.time.Instant) r1, true, r5) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Exception {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L52
        Ld:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L33
        L13:
            defpackage.fctl.b(r6)
            avmg r6 = r5.c
            fcsu r1 = r6.c
            java.lang.Object r1 = r1.b()
            cogw r1 = (defpackage.cogw) r1
            j$.time.Instant r1 = r1.f()
            j$.time.Instant r3 = j$.time.Instant.EPOCH
            r3.getClass()
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = r6.f(r3, r5)
            if (r6 == r0) goto L55
        L33:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            avmg r3 = r5.c
            java.lang.String r4 = "Bugle.Contacts.Sync.Work.Full.Contacts.Count"
            r3.h(r4, r6)
            r1.getClass()
            r6 = 0
            r5.a = r6
            r6 = 2
            r5.b = r6
            j$.time.Instant r1 = (j$.time.Instant) r1
            java.lang.Object r6 = r3.g(r1, r2, r5)
            if (r6 != r0) goto L52
            goto L55
        L52:
            fctx r6 = defpackage.fctx.a
            return r6
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avlx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avlx(this.c, fcxyVar);
    }
}
