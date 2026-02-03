package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirk extends fcyz implements fdat {
    int a;
    final /* synthetic */ qqr b;
    final /* synthetic */ boolean c;
    final /* synthetic */ qrs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dirk(qqr qqrVar, boolean z, qrs qrsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qqrVar;
        this.c = z;
        this.d = qrsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dirk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (defpackage.qqq.b(r1, r2, 1, 0.0f, null, r6, 0, r10, 1850) == r0) goto L15;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L38
        Ld:
            qqr r11 = r10.b
            r10.a = r2
            java.lang.Object r11 = defpackage.qrb.b(r11, r10)
            if (r11 == r0) goto L3b
        L17:
            boolean r11 = r10.c
            if (r11 != 0) goto L38
            qqr r1 = r10.b
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
            if (r11 != r0) goto L38
            goto L3b
        L38:
            fctx r11 = defpackage.fctx.a
            return r11
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dirk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dirk(this.b, this.c, this.d, fcxyVar);
    }
}
