package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsd extends fcyz implements fdat {
    int a;
    final /* synthetic */ wsf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsd(fcxy fcxyVar, wsf wsfVar) {
        super(2, fcxyVar);
        this.b = wsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wsd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r4.b.a((defpackage.fdlr) r5, r4) == r0) goto L13;
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
            if (r1 == r2) goto L25
            goto L33
        Ld:
            java.lang.Object r5 = r4.c
            fdjx r5 = (defpackage.fdjx) r5
            wsf r5 = r4.b
            r4.a = r2
            wre r1 = r5.e
            wsb r2 = r5.c
            fdjx r3 = r5.a
            fdvc r1 = r1.a
            j$.time.Duration r5 = r5.d
            java.lang.Object r5 = r2.f(r3, r1, r5)
            if (r5 == r0) goto L36
        L25:
            wsf r1 = r4.b
            fdlr r5 = (defpackage.fdlr) r5
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L33
            goto L36
        L33:
            fctx r5 = defpackage.fctx.a
            return r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wsd wsdVar = new wsd(fcxyVar, this.b);
        wsdVar.c = obj;
        return wsdVar;
    }
}
