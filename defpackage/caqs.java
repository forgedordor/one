package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqs extends fcyz implements fdat {
    int a;
    final /* synthetic */ caqv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caqs(fcxy fcxyVar, caqv caqvVar) {
        super(2, fcxyVar);
        this.b = caqvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r6.b.c(r5) == r0) goto L15;
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
            if (r1 == r2) goto L29
            goto L4b
        Ld:
            java.lang.Object r6 = r5.c
            fdjx r6 = (defpackage.fdjx) r6
            caqv r6 = r5.b
            caqt r1 = new caqt
            r1.<init>(r6)
            dqsn r3 = r6.c
            java.lang.String r4 = "ResetAllLocalStateRecover#recover"
            r3.d(r4, r1)
            r5.a = r2
            cprj r6 = r6.b
            java.lang.Object r6 = r6.b(r5)
            if (r6 == r0) goto L4e
        L29:
            ejxr r6 = defpackage.cpxw.m
            java.lang.Object r6 = r6.get()
            cczi r6 = (defpackage.cczi) r6
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4b
            caqv r6 = r5.b
            r1 = 2
            r5.a = r1
            cprj r6 = r6.b
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L4b
            goto L4e
        L4b:
            fctx r6 = defpackage.fctx.a
            return r6
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caqs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        caqs caqsVar = new caqs(fcxyVar, this.b);
        caqsVar.c = obj;
        return caqsVar;
    }
}
