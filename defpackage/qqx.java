package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqx extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdlr b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ qra e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqx(fdlr fdlrVar, int i, int i2, qra qraVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdlrVar;
        this.c = i;
        this.d = i2;
        this.e = qraVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qqx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return defpackage.fctx.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r1 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        r3.a = 1;
        r4 = r3.e;
        r1 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != Integer.MAX_VALUE) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        r4 = defpackage.dfe.a(new defpackage.qqs(r4), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r4 = defpackage.hos.c(new defpackage.qqt(r4, r1), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r4 != r0) goto L11;
     */
    /* JADX WARN: Path cross not found for [B:11:0x002c, B:5:0x000a], limit reached: 14 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:5:0x000a). Please report as a decompilation issue!!! */
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
            defpackage.fctl.b(r4)
            if (r1 == 0) goto La
            goto L2c
        La:
            r4 = 1
            r3.a = r4
            qra r4 = r3.e
            int r1 = r3.c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L20
            qqs r1 = new qqs
            r1.<init>()
            java.lang.Object r4 = defpackage.dfe.a(r1, r3)
            goto L29
        L20:
            qqt r2 = new qqt
            r2.<init>()
            java.lang.Object r4 = defpackage.hos.c(r2, r3)
        L29:
            if (r4 != r0) goto L2c
            return r0
        L2c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            goto La
        L35:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qqx(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
