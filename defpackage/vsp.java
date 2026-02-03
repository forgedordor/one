package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vsp extends fcyz implements fdat {
    int a;
    final /* synthetic */ vsx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsp(vsx vsxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vsxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vsp) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1.fO(r4, r3) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)
            goto L38
        Ld:
            java.lang.Object r1 = r3.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r4)
            goto L2b
        L15:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            fdpm r1 = (defpackage.fdpm) r1
            vsx r4 = r3.b
            r3.c = r1
            r3.a = r2
            dnuy r4 = r4.e
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L3b
        L2b:
            r2 = 0
            r3.c = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.fO(r4, r3)
            if (r4 != r0) goto L38
            goto L3b
        L38:
            fctx r4 = defpackage.fctx.a
            return r4
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vsp vspVar = new vsp(this.b, fcxyVar);
        vspVar.c = obj;
        return vspVar;
    }
}
