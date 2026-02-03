package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfj extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwfq b;
    final /* synthetic */ ekot c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwfj(fcxy fcxyVar, bwfq bwfqVar, ekot ekotVar) {
        super(2, fcxyVar);
        this.b = bwfqVar;
        this.c = ekotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwfj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r6 == r0) goto L19;
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
            if (r1 == r2) goto L2e
            goto L57
        Ld:
            java.lang.Object r6 = r5.d
            fdjx r6 = (defpackage.fdjx) r6
            bwfq r6 = r5.b
            fcsu r1 = r6.e
            java.lang.Object r1 = r1.b()
            bwln r1 = (defpackage.bwln) r1
            aubq r6 = r6.l
            java.lang.String r6 = r6.d
            eiju r6 = r1.a(r6)
            r6.getClass()
            r5.a = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L62
        L2e:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            boolean r6 = defpackage.fdgn.H(r6)
            if (r6 != 0) goto L5a
            bwfq r6 = r5.b
            ekot r1 = r5.c
            r2 = 2
            r5.a = r2
            fcyh r2 = r6.i
            fcyh r2 = defpackage.eicg.a(r2)
            bwfi r3 = new bwfi
            r4 = 0
            r3.<init>(r4, r6, r1)
            java.lang.Object r6 = defpackage.fdin.a(r2, r3, r5)
            if (r6 == r0) goto L54
            fctx r6 = defpackage.fctx.a
        L54:
            if (r6 != r0) goto L57
            goto L62
        L57:
            fctx r6 = defpackage.fctx.a
            return r6
        L5a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This device is not registered with Tachyon."
            r6.<init>(r0)
            throw r6
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwfj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwfj bwfjVar = new bwfj(fcxyVar, this.b, this.c);
        bwfjVar.d = obj;
        return bwfjVar;
    }
}
