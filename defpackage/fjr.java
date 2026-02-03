package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjr extends fcyy implements fdat {
    int a;
    final /* synthetic */ fic b;
    final /* synthetic */ fhy c;
    final /* synthetic */ fbh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjr(fic ficVar, fhy fhyVar, fbh fbhVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = ficVar;
        this.c = fhyVar;
        this.d = fbhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fjr) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (defpackage.fjw.d(r1, r3, r5, r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (defpackage.fjw.e(r1, r2, r9, r8) == r0) goto L28;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.fctl.b(r9)
            goto L74
        Le:
            java.lang.Object r1 = r8.e
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r9)
            goto L28
        L16:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.e
            r1 = r9
            ire r1 = (defpackage.ire) r1
            r8.e = r1
            r8.a = r3
            java.lang.Object r9 = defpackage.fjw.c(r1, r8)
            if (r9 == r0) goto L77
        L28:
            irs r9 = (defpackage.irs) r9
            boolean r3 = defpackage.fjw.g(r9)
            r4 = 0
            if (r3 == 0) goto L60
            int r3 = r9.d
            boolean r3 = defpackage.irx.a(r3)
            if (r3 == 0) goto L60
            java.util.List r3 = r9.a
            int r5 = r3.size()
            r6 = 0
        L40:
            if (r6 >= r5) goto L51
            java.lang.Object r7 = r3.get(r6)
            ise r7 = (defpackage.ise) r7
            boolean r7 = r7.c()
            if (r7 != 0) goto L60
            int r6 = r6 + 1
            goto L40
        L51:
            fic r3 = r8.b
            fhy r5 = r8.c
            r8.e = r4
            r8.a = r2
            java.lang.Object r9 = defpackage.fjw.d(r1, r3, r5, r9, r8)
            if (r9 != r0) goto L74
            goto L77
        L60:
            boolean r2 = defpackage.fjw.g(r9)
            if (r2 != 0) goto L74
            fbh r2 = r8.d
            r8.e = r4
            r3 = 3
            r8.a = r3
            java.lang.Object r9 = defpackage.fjw.e(r1, r2, r9, r8)
            if (r9 != r0) goto L74
            goto L77
        L74:
            fctx r9 = defpackage.fctx.a
            return r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fjr fjrVar = new fjr(this.b, this.c, this.d, fcxyVar);
        fjrVar.e = obj;
        return fjrVar;
    }
}
