package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flc extends fcyy implements fdat {
    int a;
    final /* synthetic */ flg b;
    final /* synthetic */ fdae c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flc(flg flgVar, fdae fdaeVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = flgVar;
        this.c = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((flc) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r5 == r0) goto L19;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L3c
        Ld:
            java.lang.Object r1 = r4.d
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r5)
            goto L2b
        L15:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.d
            r1 = r5
            ire r1 = (defpackage.ire) r1
            r4.d = r1
            r4.a = r2
            fdau r5 = defpackage.dzm.a
            iru r5 = defpackage.iru.b
            java.lang.Object r5 = defpackage.dzm.h(r1, r5, r4)
            if (r5 == r0) goto L54
        L2b:
            ise r5 = (defpackage.ise) r5
            iru r2 = defpackage.iru.a
            r3 = 0
            r4.d = r3
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = defpackage.duh.b(r1, r5, r2, r4)
            if (r5 != r0) goto L3c
            goto L54
        L3c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L51
            flg r5 = r4.b
            boolean r5 = r5.A()
            if (r5 != 0) goto L51
            fdae r5 = r4.c
            r5.invoke()
        L51:
            fctx r5 = defpackage.fctx.a
            return r5
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        flc flcVar = new flc(this.b, this.c, fcxyVar);
        flcVar.d = obj;
        return flcVar;
    }
}
