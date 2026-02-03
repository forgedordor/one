package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajzs extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ajzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzs(ajzt ajztVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ajztVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return (defpackage.ekgb) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        return (defpackage.ekgb) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r1 != 2) goto L20;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto L10
            defpackage.fctl.b(r6)
            if (r1 == r2) goto L42
            goto L55
        L10:
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L33
        L16:
            defpackage.fctl.b(r6)
            ajzt r6 = r5.c
            aroh r1 = r6.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L45
            akcd r1 = r6.a
            botb r4 = r6.f()
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = r6.d(r4, r5)
            if (r6 == r0) goto L54
        L33:
            java.util.List r6 = (java.util.List) r6
            r3 = 0
            r5.a = r3
            r5.b = r2
            akcd r1 = (defpackage.akcd) r1
            java.lang.Object r6 = r1.b(r6, r5)
            if (r6 == r0) goto L54
        L42:
            ekgb r6 = (defpackage.ekgb) r6
            return r6
        L45:
            akcd r1 = r6.a
            botl r6 = r6.e()
            r2 = 3
            r5.b = r2
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L55
        L54:
            return r0
        L55:
            ekgb r6 = (defpackage.ekgb) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajzs(this.c, fcxyVar);
    }
}
