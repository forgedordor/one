package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgue extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cgum c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgue(boolean z, cgum cgumVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = cgumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgue) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r1.r(r6) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r1.t(r6) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Lc
            java.lang.Object r0 = r6.d
            goto Le
        Lc:
            java.lang.Object r0 = r6.d
        Le:
            eiju r0 = (defpackage.eiju) r0
            defpackage.fctl.b(r7)
            goto L42
        L14:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.d
            fdjx r7 = (defpackage.fdjx) r7
            cgum r1 = r6.c
            boolean r3 = r6.b
            cgud r4 = new cgud
            r5 = 0
            r4.<init>(r1, r3, r5)
            eiju r7 = defpackage.auvw.h(r7, r4)
            if (r3 != 0) goto L36
            r6.d = r7
            r6.a = r2
            java.lang.Object r1 = r1.r(r6)
            if (r1 == r0) goto L54
            goto L41
        L36:
            r6.d = r7
            r2 = 2
            r6.a = r2
            java.lang.Object r1 = r1.t(r6)
            if (r1 == r0) goto L54
        L41:
            r0 = r7
        L42:
            cgum r7 = r6.c
            fcsu r7 = r7.e
            java.lang.Object r7 = r7.b()
            egzh r7 = (defpackage.egzh) r7
            egyj r1 = defpackage.cgum.b
            r7.a(r0, r1)
            fctx r7 = defpackage.fctx.a
            return r7
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgue.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgue cgueVar = new cgue(this.b, this.c, fcxyVar);
        cgueVar.d = obj;
        return cgueVar;
    }
}
