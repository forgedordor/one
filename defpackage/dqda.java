package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqda extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dqdh c;
    final /* synthetic */ fdau d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqda(dqdh dqdhVar, fdau fdauVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = dqdhVar;
        this.d = fdauVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqda dqdaVar = new dqda(this.c, this.d, (fcxy) obj3);
        dqdaVar.b = (Exception) obj2;
        return dqdaVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r5.a(r2, r1, r4) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L35
        Ld:
            java.lang.Object r1 = r4.b
            defpackage.fctl.b(r5)
            goto L22
        L13:
            defpackage.fctl.b(r5)
            java.lang.Object r1 = r4.b
            dqdh r5 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L38
        L22:
            android.net.Uri r5 = (android.net.Uri) r5
            fdau r5 = r4.d
            dqdh r2 = r4.c
            r3 = 0
            r4.b = r3
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.a(r2, r1, r4)
            if (r5 != r0) goto L35
            goto L38
        L35:
            fctx r5 = defpackage.fctx.a
            return r5
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqda.b(java.lang.Object):java.lang.Object");
    }
}
