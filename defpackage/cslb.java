package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cslb extends fcyz implements fdat {
    int a;
    final /* synthetic */ csli b;
    final /* synthetic */ csch c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslb(fcxy fcxyVar, csli csliVar, csch cschVar) {
        super(2, fcxyVar);
        this.b = csliVar;
        this.c = cschVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r9 == r0) goto L21;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1d
            goto L34
        Ld:
            java.lang.Object r9 = r8.d
            fdjx r9 = (defpackage.fdjx) r9
            csli r9 = r8.b
            csch r1 = r8.c
            r8.a = r2
            java.lang.Object r9 = r9.l(r1)
            if (r9 == r0) goto L55
        L1d:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L26
            csdd r9 = defpackage.csdc.a()
            return r9
        L26:
            csli r1 = r8.b
            csch r2 = r8.c
            r3 = 2
            r8.a = r3
            java.lang.Object r9 = r1.i(r2, r9, r8)
            if (r9 != r0) goto L34
            goto L55
        L34:
            csla r9 = (defpackage.csla) r9
            r0 = 0
            if (r9 != 0) goto L4e
            csdd r1 = new csdd
            eoff r2 = defpackage.eoff.NO_VERDICT
            csdo r3 = defpackage.csdo.a
            cczv r9 = defpackage.csli.a
            r9 = 6
            java.lang.Integer r5 = defpackage.cskz.d(r2, r0, r9)
            r6 = 0
            r7 = 20
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L4e:
            r1 = 0
            r2 = 3
            csdd r9 = defpackage.csla.a(r9, r0, r1, r2)
            return r9
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cslb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cslb cslbVar = new cslb(fcxyVar, this.b, this.c);
        cslbVar.d = obj;
        return cslbVar;
    }
}
