package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auvq extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdae b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auvq(fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auvq) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
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
            goto L3c
        Ld:
            java.lang.Object r1 = r3.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r4)
            goto L2f
        L15:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            fdpm r1 = (defpackage.fdpm) r1
            fdae r4 = r3.b
            java.lang.Object r4 = r4.invoke()
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 == r0) goto L3f
        L2f:
            r2 = 0
            r3.c = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.fO(r4, r3)
            if (r4 != r0) goto L3c
            goto L3f
        L3c:
            fctx r4 = defpackage.fctx.a
            return r4
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auvq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auvq auvqVar = new auvq(this.b, fcxyVar);
        auvqVar.c = obj;
        return auvqVar;
    }
}
