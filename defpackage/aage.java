package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aage extends fcyz implements fdat {
    int a;
    final /* synthetic */ aagf b;
    final /* synthetic */ fdpl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aage(aagf aagfVar, fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aagfVar;
        this.c = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aage) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.fctl.b(r8)
            goto L4c
        Le:
            java.lang.Object r1 = r7.d
            fdkf r1 = (defpackage.fdkf) r1
            defpackage.fctl.b(r8)
            goto L3e
        L16:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.d
            fdjx r8 = (defpackage.fdjx) r8
            fdpl r1 = r7.c
            aagd r4 = new aagd
            r4.<init>(r1, r3)
            r1 = 3
            fdkf r4 = defpackage.fdil.c(r8, r3, r4, r1)
            aagf r5 = r7.b
            aagc r6 = new aagc
            r6.<init>(r5, r3)
            fdkf r1 = defpackage.fdil.c(r8, r3, r6, r1)
            r7.d = r1
            r7.a = r2
            java.lang.Object r8 = r4.c(r7)
            if (r8 == r0) goto L67
        L3e:
            if (r8 == 0) goto L5d
            r7.d = r3
            r8 = 2
            r7.a = r8
            java.lang.Object r8 = r1.c(r7)
            if (r8 != r0) goto L4c
            goto L67
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5d
            aagf r8 = r7.b
            zuh r8 = r8.e
            r0 = 0
            r8.a(r0)
            goto L64
        L5d:
            aagf r8 = r7.b
            zuh r8 = r8.e
            r8.a(r2)
        L64:
            fctx r8 = defpackage.fctx.a
            return r8
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aage.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aage aageVar = new aage(this.b, this.c, fcxyVar);
        aageVar.d = obj;
        return aageVar;
    }
}
