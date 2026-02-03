package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqt extends fcyz implements fdat {
    int a;
    final /* synthetic */ wqu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqt(wqu wquVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wquVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wqt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
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
            r3 = 0
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L21
            goto L51
        Le:
            wqu r6 = r5.b
            r5.a = r2
            wqs r1 = new wqs
            r1.<init>(r6, r3)
            java.lang.Object r6 = defpackage.fdjy.a(r1, r5)
            if (r6 == r0) goto L1f
            fctx r6 = defpackage.fctx.a
        L1f:
            if (r6 == r0) goto L54
        L21:
            wqu r6 = r5.b
            fcsu r1 = r6.j
            java.lang.Object r1 = r1.b()
            wul r1 = (defpackage.wul) r1
            fdjx r2 = r1.b
            wuk r4 = new wuk
            r4.<init>(r1, r3)
            r1 = 3
            defpackage.auvw.k(r2, r3, r3, r4, r1)
            r1 = 2
            r5.a = r1
            wsf r6 = r6.e
            fcyh r1 = r6.b
            fcyh r1 = defpackage.eicg.a(r1)
            wsd r2 = new wsd
            r2.<init>(r3, r6)
            java.lang.Object r6 = defpackage.fdin.a(r1, r2, r5)
            if (r6 == r0) goto L4e
            fctx r6 = defpackage.fctx.a
        L4e:
            if (r6 != r0) goto L51
            goto L54
        L51:
            fctx r6 = defpackage.fctx.a
            return r6
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wqt(this.b, fcxyVar);
    }
}
