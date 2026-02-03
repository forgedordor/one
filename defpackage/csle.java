package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csle extends fcyz implements fdat {
    int a;
    final /* synthetic */ csli b;
    final /* synthetic */ csch c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csle(fcxy fcxyVar, csli csliVar, csch cschVar, int i) {
        super(2, fcxyVar);
        this.b = csliVar;
        this.c = cschVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csle) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0 == r6) goto L22;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r16) throws java.lang.Throwable {
        /*
            r15 = this;
            fcyl r6 = defpackage.fcyl.a
            int r0 = r15.a
            r1 = 1
            r7 = 2
            defpackage.fctl.b(r16)
            if (r0 == 0) goto L13
            if (r0 == r1) goto L10
            r0 = r16
            goto L4d
        L10:
            r0 = r16
            goto L2a
        L13:
            java.lang.Object r0 = r15.e
            fdjx r0 = (defpackage.fdjx) r0
            csli r0 = r15.b
            csch r2 = r15.c
            int r3 = r15.d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            r15.a = r1
            java.lang.Object r0 = r0.l(r2)
            if (r0 == r6) goto L79
        L2a:
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L34
            csdd r0 = defpackage.csdc.a()
            return r0
        L34:
            csli r0 = r15.b
            csch r1 = r15.c
            int r3 = r15.d
            eoeo r4 = defpackage.eoeo.RECLASSIFICATION
            r8 = r4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            r15.a = r7
            r5 = r15
            r3 = r8
            java.lang.Object r0 = r0.j(r1, r2, r3, r4, r5)
            if (r0 != r6) goto L4d
            goto L79
        L4d:
            csla r0 = (defpackage.csla) r0
            if (r0 != 0) goto L6c
            int r0 = r15.d
            csdd r8 = new csdd
            eoff r9 = defpackage.eoff.NO_VERDICT
            csdo r10 = defpackage.csdo.a
            cczv r1 = defpackage.csli.a
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.Integer r12 = defpackage.cskz.d(r9, r1, r7)
            r13 = 0
            r14 = 20
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L6c:
            int r1 = r15.d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r1 = 0
            csdd r0 = defpackage.csla.a(r0, r2, r1, r7)
            return r0
        L79:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csle.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csle csleVar = new csle(fcxyVar, this.b, this.c, this.d);
        csleVar.e = obj;
        return csleVar;
    }
}
