package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrv extends fcyz implements fdat {
    int a;
    final /* synthetic */ amsc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrv(amsc amscVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amscVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r6 == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L41
        Ld:
            amsc r6 = r5.b
            long r3 = r6.a()
            r5.a = r2
            java.lang.Object r6 = defpackage.fdkj.d(r3, r5)
            if (r6 == r0) goto L4b
        L1b:
            eksp r6 = defpackage.amsc.a
            ekrw r6 = r6.h()
            eksl r6 = (defpackage.eksl) r6
            amsc r1 = r5.b
            long r2 = r1.a()
            fdhi r4 = new fdhi
            r4.<init>(r2)
            java.lang.String r2 = "Sending stop typing indicator after the user has been idle for %s"
            r6.t(r2, r4)
            eiju r6 = r1.d()
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 != r0) goto L41
            goto L4b
        L41:
            java.lang.Void r6 = (java.lang.Void) r6
            amsc r6 = r5.b
            r0 = 0
            r6.g = r0
            fctx r6 = defpackage.fctx.a
            return r6
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amrv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amrv(this.b, fcxyVar);
    }
}
