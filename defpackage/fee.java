package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fee extends fcyy implements fdat {
    int a;
    final /* synthetic */ fdap b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fee(fdap fdapVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fee) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L45
        Ld:
            java.lang.Object r1 = r5.c
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r6)
            goto L27
        L15:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            ire r1 = (defpackage.ire) r1
            r5.c = r1
            r5.a = r2
            java.lang.Object r6 = defpackage.fef.a(r1, r5)
            if (r6 == r0) goto L4f
        L27:
            ise r6 = (defpackage.ise) r6
            r6.b()
            fdap r2 = r5.b
            long r3 = r6.c
            ihs r6 = new ihs
            r6.<init>(r3)
            r2.invoke(r6)
            r6 = 0
            r5.c = r6
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.dzm.l(r1, r5)
            if (r6 != r0) goto L45
            goto L4f
        L45:
            ise r6 = (defpackage.ise) r6
            if (r6 == 0) goto L4c
            r6.b()
        L4c:
            fctx r6 = defpackage.fctx.a
            return r6
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fee.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fee feeVar = new fee(this.b, fcxyVar);
        feeVar.c = obj;
        return feeVar;
    }
}
