package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lld extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ llo d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lld(llo lloVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = lloVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((lld) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r6 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v11, types: [llo] */
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
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L11
            boolean r0 = r5.c
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L43
        L11:
            boolean r1 = r5.c
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L17
            goto L28
        L17:
            r6 = move-exception
            goto L2b
        L19:
            defpackage.fctl.b(r6)
            boolean r1 = r5.c
            llo r6 = r5.d     // Catch: java.lang.Throwable -> L17
            r5.b = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r6 = r6.k(r1, r5)     // Catch: java.lang.Throwable -> L17
            if (r6 == r0) goto L4e
        L28:
            lmv r6 = (defpackage.lmv) r6     // Catch: java.lang.Throwable -> L17
            goto L59
        L2b:
            if (r1 == 0) goto L4f
            llo r3 = r5.d
            lmg r3 = r3.c()
            r5.a = r6
            r5.c = r2
            r2 = 2
            r5.b = r2
            java.lang.Object r2 = r3.d()
            if (r2 == r0) goto L4e
            r0 = r1
            r1 = r6
            r6 = r2
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4 = r0
            r0 = r6
            r6 = r1
            r1 = r4
            goto L51
        L4e:
            return r0
        L4f:
            int r0 = r5.e
        L51:
            lmk r2 = new lmk
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r2.<init>(r6, r0)
            r6 = r2
        L59:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            fcti r1 = new fcti
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lld.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lld lldVar = new lld(this.d, this.e, fcxyVar);
        lldVar.c = ((Boolean) obj).booleanValue();
        return lldVar;
    }
}
