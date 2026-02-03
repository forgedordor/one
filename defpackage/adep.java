package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adep extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ adfc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adep(adfc adfcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = adfcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adep) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r6 == r0) goto L33;
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
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.fctl.b(r6)
            goto L89
        Le:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L25
        L14:
            defpackage.fctl.b(r6)
            adfc r1 = r5.c
            r5.a = r1
            r5.b = r2
            adfd r6 = r1.b
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L92
        L25:
            adef r6 = (defpackage.adef) r6
            boolean r3 = r6 instanceof defpackage.adec
            r4 = 0
            if (r3 == 0) goto L2e
            r6 = r4
            goto L55
        L2e:
            boolean r3 = r6 instanceof defpackage.adee
            if (r3 == 0) goto L38
            adek r6 = new adek
            r6.<init>()
            goto L55
        L38:
            boolean r3 = r6 instanceof defpackage.adeb
            if (r3 == 0) goto L47
            adeh r3 = new adeh
            adeb r6 = (defpackage.adeb) r6
            dooy r6 = r6.a
            r3.<init>(r6)
        L45:
            r6 = r3
            goto L55
        L47:
            boolean r3 = r6 instanceof defpackage.aded
            if (r3 == 0) goto L8c
            adej r3 = new adej
            aded r6 = (defpackage.aded) r6
            boolean r6 = r6.a
            r3.<init>(r6)
            goto L45
        L55:
            adfc r1 = (defpackage.adfc) r1
            r1.d(r6)
            adfc r6 = r5.c
            fdeh[] r1 = defpackage.adfc.a
            r1 = r1[r2]
            fdcz r2 = r6.g
            java.lang.Object r1 = r2.c(r1)
            adel r1 = (defpackage.adel) r1
            if (r1 == 0) goto L89
            adfd r6 = r6.b
            r5.a = r4
            r1 = 2
            r5.b = r1
            adfk r6 = (defpackage.adfk) r6
            fcyh r1 = r6.a
            fcyh r1 = defpackage.eicg.a(r1)
            adfh r2 = new adfh
            r2.<init>(r4, r6)
            java.lang.Object r6 = defpackage.fdin.a(r1, r2, r5)
            if (r6 == r0) goto L86
            fctx r6 = defpackage.fctx.a
        L86:
            if (r6 != r0) goto L89
            goto L92
        L89:
            fctx r6 = defpackage.fctx.a
            return r6
        L8c:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adep.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adep(this.c, fcxyVar);
    }
}
