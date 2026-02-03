package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhfq extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fhft c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhfq(fhft fhftVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fhftVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fhfq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r5 != r0) goto L16;
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
            int r1 = r4.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L12
            java.lang.Object r0 = r4.a
            defpackage.fctl.b(r5)
            goto L5f
        L12:
            defpackage.fctl.b(r5)     // Catch: defpackage.axlg -> L4c
            goto L40
        L16:
            defpackage.fctl.b(r5)     // Catch: defpackage.axlg -> L4c
            goto L2e
        L1a:
            defpackage.fctl.b(r5)
            fhft r5 = r4.c     // Catch: defpackage.axlg -> L4c
            axky r5 = r5.a     // Catch: defpackage.axlg -> L4c
            eiju r5 = r5.a()     // Catch: defpackage.axlg -> L4c
            r4.b = r3     // Catch: defpackage.axlg -> L4c
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: defpackage.axlg -> L4c
            if (r5 != r0) goto L2e
            goto L6d
        L2e:
            efwo r5 = (defpackage.efwo) r5     // Catch: defpackage.axlg -> L4c
            fhft r1 = r4.c     // Catch: defpackage.axlg -> L4c
            egbf r1 = r1.b     // Catch: defpackage.axlg -> L4c
            com.google.common.util.concurrent.ListenableFuture r5 = r1.c(r5)     // Catch: defpackage.axlg -> L4c
            r4.b = r2     // Catch: defpackage.axlg -> L4c
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: defpackage.axlg -> L4c
            if (r5 == r0) goto L6d
        L40:
            egbe r5 = (defpackage.egbe) r5     // Catch: defpackage.axlg -> L4c
            egbs r5 = r5.b()     // Catch: defpackage.axlg -> L4c
            java.lang.String r5 = r5.g     // Catch: defpackage.axlg -> L4c
            r5.getClass()     // Catch: defpackage.axlg -> L4c
            goto L4e
        L4c:
            java.lang.String r5 = ""
        L4e:
            fhft r1 = r4.c
            r4.a = r5
            r2 = 3
            r4.b = r2
            efwo r2 = r1.f
            java.lang.Object r1 = r1.a(r2, r4)
            if (r1 == r0) goto L6d
            r0 = r5
            r5 = r1
        L5f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            fhfv r1 = new fhfv
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0, r5)
            return r1
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhfq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fhfq(this.c, fcxyVar);
    }
}
