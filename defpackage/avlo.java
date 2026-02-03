package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avlo extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ avlp d;
    final /* synthetic */ avln e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avlo(avlp avlpVar, avln avlnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = avlpVar;
        this.e = avlnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avlo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r1.b(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r1.a(r5) == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L12
            defpackage.fctl.b(r6)
            goto L89
        L12:
            java.lang.Object r1 = r5.b
            java.lang.Object r3 = r5.a
            defpackage.fctl.b(r6)
            goto L5b
        L1a:
            defpackage.fctl.b(r6)
            goto L33
        L1e:
            defpackage.fctl.b(r6)
            avlp r6 = r5.d
            fcsu r6 = r6.c
            java.lang.Object r6 = r6.b()
            avlr r6 = (defpackage.avlr) r6
            r5.c = r4
            java.lang.Object r6 = r6.b(r5)
            if (r6 == r0) goto L8e
        L33:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L41
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L41:
            avlp r6 = r5.d
            avln r1 = r5.e
            fcsu r6 = r6.b
            java.lang.Object r6 = r6.b()
            avlm r6 = (defpackage.avlm) r6
            r5.a = r1
            r5.b = r6
            r5.c = r3
            java.lang.Object r3 = r6.c(r5)
            if (r3 == r0) goto L8e
            r3 = r1
            r1 = r6
        L5b:
            avln r6 = defpackage.avln.a
            avln r3 = (defpackage.avln) r3
            int r6 = r3.ordinal()
            r3 = 0
            if (r6 == 0) goto L7c
            if (r6 != r4) goto L76
            r5.a = r3
            r5.b = r3
            r6 = 4
            r5.c = r6
            java.lang.Object r6 = r1.b(r5)
            if (r6 != r0) goto L89
            goto L8e
        L76:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        L7c:
            r5.a = r3
            r5.b = r3
            r5.c = r2
            java.lang.Object r6 = r1.a(r5)
            if (r6 != r0) goto L89
            goto L8e
        L89:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avlo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avlo(this.d, this.e, fcxyVar);
    }
}
