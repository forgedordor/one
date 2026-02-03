package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auxw extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdpl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auxw(fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auxw) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r2.fO(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L50
        Ld:
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.d
            fdpm r2 = (defpackage.fdpm) r2
            defpackage.fctl.b(r6)
            goto L37
        L17:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.d
            fdpm r6 = (defpackage.fdpm) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            fdpl r3 = r5.c
            auxv r4 = new auxv
            r4.<init>(r1, r6)
            r5.d = r6
            r5.a = r1
            r5.b = r2
            java.lang.Object r2 = r3.a(r4, r5)
            if (r2 == r0) goto L53
            r2 = r6
        L37:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L50
            java.util.List r6 = defpackage.fcva.ao(r1)
            r1 = 0
            r5.d = r1
            r5.a = r1
            r1 = 2
            r5.b = r1
            java.lang.Object r6 = r2.fO(r6, r5)
            if (r6 != r0) goto L50
            goto L53
        L50:
            fctx r6 = defpackage.fctx.a
            return r6
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auxw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auxw auxwVar = new auxw(this.c, fcxyVar);
        auxwVar.d = obj;
        return auxwVar;
    }
}
