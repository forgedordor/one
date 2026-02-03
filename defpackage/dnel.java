package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnel extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdue c;
    final /* synthetic */ dneq d;
    final /* synthetic */ dnce e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnel(fdue fdueVar, dneq dneqVar, dnce dnceVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdueVar;
        this.d = dneqVar;
        this.e = dnceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnel) c(obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r1.fO(r9, r8) == r0) goto L14;
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
            if (r1 == 0) goto L17
            if (r1 == r2) goto Le
            defpackage.fctl.b(r9)
            r7 = r8
            goto L44
        Le:
            java.lang.Object r1 = r8.b
            fdue r1 = (defpackage.fdue) r1
            defpackage.fctl.b(r9)
            r7 = r8
            goto L37
        L17:
            defpackage.fctl.b(r9)
            java.lang.Object r3 = r8.b
            fdue r1 = r8.c
            dneq r9 = r8.d
            dnce r4 = r8.e
            r8.b = r1
            r8.a = r2
            dnfa r2 = r9.f
            eony r9 = r2.b
            j$.time.Instant r5 = r9.a()
            r6 = 50
            r7 = r8
            java.lang.Object r9 = r2.c(r3, r4, r5, r6, r7)
            if (r9 == r0) goto L47
        L37:
            r2 = 0
            r7.b = r2
            r2 = 2
            r7.a = r2
            java.lang.Object r9 = r1.fO(r9, r8)
            if (r9 != r0) goto L44
            goto L47
        L44:
            fctx r9 = defpackage.fctx.a
            return r9
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnel.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnel dnelVar = new dnel(this.c, this.d, this.e, fcxyVar);
        dnelVar.b = obj;
        return dnelVar;
    }
}
