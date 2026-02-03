package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fav extends fcyy implements fdat {
    Object a;
    int b;
    final /* synthetic */ fbh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fav(fbh fbhVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fbhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fav) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r12 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r12 != r0) goto L9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0044 -> B:13:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            java.lang.Object r1 = r11.a
            java.lang.Object r3 = r11.d
            ire r3 = (defpackage.ire) r3
            defpackage.fctl.b(r12)
            goto L47
        L14:
            java.lang.Object r1 = r11.d
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r12)
            goto L2f
        L1c:
            defpackage.fctl.b(r12)
            java.lang.Object r12 = r11.d
            r1 = r12
            ire r1 = (defpackage.ire) r1
            r11.d = r1
            r11.b = r3
            r12 = 0
            java.lang.Object r12 = defpackage.dzm.g(r1, r12, r11, r2)
            if (r12 == r0) goto L75
        L2f:
            fbh r3 = r11.c
            ise r12 = (defpackage.ise) r12
            long r4 = r12.c
            r3.f()
            r3 = r1
            r1 = r12
        L3a:
            r11.d = r3
            r11.a = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.ird.a(r3, r11)
            if (r12 != r0) goto L47
            goto L75
        L47:
            irs r12 = (defpackage.irs) r12
            java.util.List r12 = r12.a
            int r4 = r12.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L6d
            java.lang.Object r6 = r12.get(r5)
            ise r6 = (defpackage.ise) r6
            long r7 = r6.a
            r9 = r1
            ise r9 = (defpackage.ise) r9
            long r9 = r9.a
            boolean r7 = defpackage.isd.b(r7, r9)
            if (r7 == 0) goto L6a
            boolean r6 = r6.d
            if (r6 == 0) goto L6a
            goto L3a
        L6a:
            int r5 = r5 + 1
            goto L50
        L6d:
            fbh r12 = r11.c
            r12.e()
            fctx r12 = defpackage.fctx.a
            return r12
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fav.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fav favVar = new fav(this.c, fcxyVar);
        favVar.d = obj;
        return favVar;
    }
}
