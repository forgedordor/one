package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzc extends fcyz implements fdat {
    int a;
    final /* synthetic */ zaa b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzc(zaa zaaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zaaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yzc) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r1.fO(r5, r4) != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r1.fO(false, r4) == r0) goto L16;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.fctl.b(r5)
            goto L49
        Le:
            java.lang.Object r1 = r4.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r5)
            goto L2e
        L16:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            fdpm r1 = (defpackage.fdpm) r1
            zaa r5 = r4.b
            dnuy r5 = r5.m
            if (r5 == 0) goto L3a
            r4.c = r1
            r4.a = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L48
        L2e:
            r3 = 0
            r4.c = r3
            r4.a = r2
            java.lang.Object r5 = r1.fO(r5, r4)
            if (r5 != r0) goto L49
            goto L48
        L3a:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2 = 3
            r4.a = r2
            java.lang.Object r5 = r1.fO(r5, r4)
            if (r5 != r0) goto L49
        L48:
            return r0
        L49:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yzc yzcVar = new yzc(this.b, fcxyVar);
        yzcVar.c = obj;
        return yzcVar;
    }
}
