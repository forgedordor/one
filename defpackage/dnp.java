package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnp extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnp(dnq dnqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (defpackage.hos.b(r4, r3) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r4 = r3.b.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r4 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r4.a.update();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Path cross not found for [B:15:0x0030, B:10:0x001b], limit reached: 17 */
    /* JADX WARN: Path cross not found for [B:8:0x0013, B:10:0x001b], limit reached: 17 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0011 -> B:10:0x001b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0019 -> B:10:0x001b). Please report as a decompilation issue!!! */
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
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L30
        Ld:
            dnq r4 = r3.b
            fdoa r4 = r4.n
            if (r4 == 0) goto L1b
            r3.a = r2
            java.lang.Object r4 = r4.i(r3)
            if (r4 == r0) goto L2f
        L1b:
            dnq r4 = r3.b
            dou r4 = r4.o
            if (r4 == 0) goto Ld
            dno r4 = new dno
            r4.<init>()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.hos.b(r4, r3)
            if (r4 != r0) goto L30
        L2f:
            return r0
        L30:
            dnq r4 = r3.b
            dou r4 = r4.o
            if (r4 == 0) goto Ld
            android.widget.Magnifier r4 = r4.a
            defpackage.abn$$ExternalSyntheticApiModelOutline0.m34m(r4)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnp(this.b, fcxyVar);
    }
}
