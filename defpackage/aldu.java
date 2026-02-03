package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aldu extends fcyz implements fdat {
    int a;
    final /* synthetic */ alec b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldu(alec alecVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = alecVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aldu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (r11 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        return defpackage.ekfv.a(defpackage.fcva.q((java.lang.Iterable) r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        return defpackage.ekfv.a(defpackage.fcva.q(defpackage.fcva.b(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r1 != 2) goto L20;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L11
            defpackage.fctl.b(r11)
            if (r1 == r2) goto L72
            goto L9c
        L11:
            java.lang.Object r1 = r10.c
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r11)
            goto L36
        L19:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.c
            r1 = r11
            fdjx r1 = (defpackage.fdjx) r1
            alec r11 = r10.b
            anpj r11 = r11.b
            eiju r11 = r11.b()
            r11.getClass()
            r10.c = r1
            r10.a = r3
            java.lang.Object r11 = defpackage.fdxs.c(r11, r10)
            if (r11 == r0) goto La9
        L36:
            ajlk r11 = (defpackage.ajlk) r11
            ajlj r11 = r11.c()
            ajlj r4 = defpackage.ajlj.RBM
            r5 = 0
            if (r11 != r4) goto L7d
            alec r11 = r10.b
            fdkf[] r4 = new defpackage.fdkf[r2]
            fcyi r6 = defpackage.fcyi.a
            fdjz r7 = defpackage.fdjz.a
            fcyh r8 = defpackage.eicg.a(r6)
            aldr r9 = new aldr
            r9.<init>(r5, r11)
            fdkf r8 = defpackage.fdin.b(r1, r8, r7, r9)
            r9 = 0
            r4[r9] = r8
            fcyh r6 = defpackage.eicg.a(r6)
            alds r8 = new alds
            r8.<init>(r5, r11)
            fdkf r11 = defpackage.fdin.b(r1, r6, r7, r8)
            r4[r3] = r11
            r10.c = r5
            r10.a = r2
            java.lang.Object r11 = defpackage.fdii.b(r4, r10)
            if (r11 == r0) goto La9
        L72:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r11 = defpackage.fcva.q(r11)
            ekgb r11 = defpackage.ekfv.a(r11)
            return r11
        L7d:
            alec r11 = r10.b
            fcyi r2 = defpackage.fcyi.a
            fdjz r3 = defpackage.fdjz.a
            fcyh r2 = defpackage.eicg.a(r2)
            aldt r4 = new aldt
            r4.<init>(r5, r11)
            fdkf r11 = defpackage.fdin.b(r1, r2, r3, r4)
            r10.c = r5
            r1 = 3
            r10.a = r1
            java.lang.Object r11 = r11.c(r10)
            if (r11 != r0) goto L9c
            goto La9
        L9c:
            java.util.List r11 = defpackage.fcva.b(r11)
            java.util.List r11 = defpackage.fcva.q(r11)
            ekgb r11 = defpackage.ekfv.a(r11)
            return r11
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aldu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aldu alduVar = new aldu(this.b, fcxyVar);
        alduVar.c = obj;
        return alduVar;
    }
}
