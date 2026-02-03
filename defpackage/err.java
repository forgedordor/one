package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class err extends fcyy implements fdat {
    Object a;
    int b;
    final /* synthetic */ etv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public err(etv etvVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = etvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((err) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r9 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r9 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:14:0x004e). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L15
            java.lang.Object r1 = r8.a
            java.lang.Object r4 = r8.d
            ire r4 = (defpackage.ire) r4
            defpackage.fctl.b(r9)
            goto L4e
        L15:
            java.lang.Object r1 = r8.d
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r9)
            goto L31
        L1d:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.d
            r1 = r9
            ire r1 = (defpackage.ire) r1
            iru r9 = defpackage.iru.a
            r8.d = r1
            r8.b = r4
            java.lang.Object r9 = defpackage.dzm.a(r1, r3, r9, r8)
            if (r9 == r0) goto L83
        L31:
            etv r4 = r8.c
            ise r9 = (defpackage.ise) r9
            r5 = 0
            r4.t(r5)
            r4 = r1
            r1 = r9
        L3c:
            if (r2 != 0) goto L71
            iru r9 = defpackage.iru.a
            r8.d = r4
            r8.a = r1
            r5 = 2
            r8.b = r5
            java.lang.Object r9 = r4.r(r9, r8)
            if (r9 != r0) goto L4e
            goto L83
        L4e:
            irs r9 = (defpackage.irs) r9
            java.util.List r9 = r9.a
            int r5 = r9.size()
            r6 = r3
        L57:
            if (r6 >= r5) goto L69
            java.lang.Object r7 = r9.get(r6)
            ise r7 = (defpackage.ise) r7
            boolean r7 = defpackage.irt.e(r7)
            if (r7 != 0) goto L66
            goto L3c
        L66:
            int r6 = r6 + 1
            goto L57
        L69:
            java.lang.Object r9 = r9.get(r3)
            r2 = r9
            ise r2 = (defpackage.ise) r2
            goto L3c
        L71:
            etv r9 = r8.c
            ise r1 = (defpackage.ise) r1
            long r0 = r1.c
            long r2 = r2.c
            long r0 = defpackage.ihs.d(r2, r0)
            r9.t(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.err.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        err errVar = new err(this.c, fcxyVar);
        errVar.d = obj;
        return errVar;
    }
}
