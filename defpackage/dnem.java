package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnem extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdue c;
    final /* synthetic */ dneq d;
    final /* synthetic */ dnce e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnem(fdue fdueVar, dneq dneqVar, dnce dnceVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdueVar;
        this.d = dneqVar;
        this.e = dnceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnem) c((dneb) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r1.fO(r6, r5) == r0) goto L14;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L3b
        Ld:
            java.lang.Object r1 = r5.b
            fdue r1 = (defpackage.fdue) r1
            defpackage.fctl.b(r6)
            goto L2e
        L15:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.b
            dneb r6 = (defpackage.dneb) r6
            fdue r1 = r5.c
            dneq r3 = r5.d
            dnce r4 = r5.e
            r5.b = r1
            r5.a = r2
            dnfa r2 = r3.f
            java.lang.Object r6 = defpackage.dnfa.g(r2, r6, r4, r5)
            if (r6 == r0) goto L3e
        L2e:
            r2 = 0
            r5.b = r2
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.fO(r6, r5)
            if (r6 != r0) goto L3b
            goto L3e
        L3b:
            fctx r6 = defpackage.fctx.a
            return r6
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnem.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnem dnemVar = new dnem(this.c, this.d, this.e, fcxyVar);
        dnemVar.b = obj;
        return dnemVar;
    }
}
