package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owy extends fcyz implements fdat {
    int a;
    final /* synthetic */ owz b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owy(owz owzVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = owzVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((owy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r7.a.a(r1, r6) != r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r2v2, types: [oww] */
    /* JADX WARN: Type inference failed for: r7v15, types: [oww] */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L14
            defpackage.fctl.b(r7)
            goto L8b
        L14:
            java.lang.Object r0 = r6.d
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.fctl.b(r7)
            goto L8a
        L1d:
            java.lang.Object r1 = r6.d
            fdlr r1 = (defpackage.fdlr) r1
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L25
            goto L69
        L25:
            r7 = move-exception
            goto L79
        L27:
            java.lang.Object r1 = r6.d
            fdlr r1 = (defpackage.fdlr) r1
            defpackage.fctl.b(r7)
            goto L55
        L2f:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.d
            fdjx r7 = (defpackage.fdjx) r7
            fcyh r7 = r7.hE()
            fdlq r1 = defpackage.fdlr.c
            fcyf r7 = r7.get(r1)
            if (r7 == 0) goto L8f
            owz r1 = r6.b
            fdlr r7 = (defpackage.fdlr) r7
            r6.d = r7
            r6.a = r4
            oww r1 = r1.a
            java.lang.Object r1 = r1.b(r7, r6)
            if (r1 == r0) goto L8e
            r5 = r1
            r1 = r7
            r7 = r5
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8b
            fdap r7 = r6.c     // Catch: java.lang.Throwable -> L25
            r6.d = r1     // Catch: java.lang.Throwable -> L25
            r6.a = r3     // Catch: java.lang.Throwable -> L25
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L25
            if (r7 == r0) goto L8e
        L69:
            owz r7 = r6.b
            r3 = 0
            r6.d = r3
            r6.a = r2
            oww r7 = r7.a
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L8b
            goto L8e
        L79:
            owz r2 = r6.b
            r6.d = r7
            r3 = 4
            r6.a = r3
            oww r2 = r2.a
            java.lang.Object r1 = r2.a(r1, r6)
            if (r1 != r0) goto L89
            goto L8e
        L89:
            r0 = r7
        L8a:
            throw r0
        L8b:
            fctx r7 = defpackage.fctx.a
            return r7
        L8e:
            return r0
        L8f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        owy owyVar = new owy(this.b, this.c, fcxyVar);
        owyVar.d = obj;
        return owyVar;
    }
}
