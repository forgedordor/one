package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirl extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ qqr c;
    final /* synthetic */ qrs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dirl(boolean z, qqr qqrVar, qrs qrsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = qqrVar;
        this.d = qrsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dirl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (defpackage.qqq.b(r1, r2, 1, 0.0f, null, r6, 0, r10, 1850) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (defpackage.qqq.a(r1, r11, r3, r10, 8) == r0) goto L12;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 1
            defpackage.fctl.b(r11)
            if (r1 == 0) goto Lb
            goto L43
        Lb:
            boolean r11 = r10.b
            if (r11 == 0) goto L26
            qrs r11 = r10.d
            qqr r1 = r10.c
            qnm r11 = r11.a()
            float r3 = r1.e()
            r10.a = r2
            r2 = 8
            java.lang.Object r11 = defpackage.qqq.a(r1, r11, r3, r10, r2)
            if (r11 != r0) goto L43
            goto L42
        L26:
            qqr r1 = r10.c
            qrs r11 = r10.d
            qnm r2 = r11.a()
            float r6 = r1.e()
            r11 = 2
            r10.a = r11
            r7 = 0
            r9 = 1850(0x73a, float:2.592E-42)
            r3 = 1
            r4 = 0
            r5 = 0
            r8 = r10
            java.lang.Object r11 = defpackage.qqq.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L43
        L42:
            return r0
        L43:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dirl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dirl(this.b, this.c, this.d, fcxyVar);
    }
}
