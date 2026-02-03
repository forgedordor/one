package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yyo extends fcyz implements fdat {
    boolean a;
    int b;
    final /* synthetic */ yyp c;
    final /* synthetic */ yyq d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyo(yyp yypVar, yyq yyqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = yypVar;
        this.d = yyqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yyo) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r2.fO(r4, r7) != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L11
            defpackage.fctl.b(r8)
            goto L9a
        L11:
            boolean r1 = r7.a
            java.lang.Object r2 = r7.e
            fdpm r2 = (defpackage.fdpm) r2
            defpackage.fctl.b(r8)
            goto L55
        L1b:
            java.lang.Object r1 = r7.e
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r8)
            goto L3b
        L23:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.e
            fdpm r8 = (defpackage.fdpm) r8
            yyp r1 = r7.c
            r7.e = r8
            r7.b = r3
            zvc r1 = r1.f
            java.lang.Object r1 = r1.a(r7)
            if (r1 == r0) goto L9d
            r6 = r1
            r1 = r8
            r8 = r6
        L3b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            yyp r3 = r7.c
            r7.e = r1
            r7.a = r8
            r7.b = r2
            fdpl r2 = r3.i
            java.lang.Object r2 = defpackage.fdtc.a(r2, r7)
            if (r2 == r0) goto L9d
            r6 = r1
            r1 = r8
            r8 = r2
            r2 = r6
        L55:
            aoer r8 = (defpackage.aoer) r8
            r3 = 0
            if (r8 == 0) goto L88
            yyp r4 = r7.c
            yyq r5 = r7.d
            fcsu r4 = r4.g
            java.lang.Object r4 = r4.b()
            arxn r4 = (defpackage.arxn) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L75
            angr r4 = r5.d
            if (r4 == 0) goto L88
            anho r8 = r4.c(r8)
            goto L89
        L75:
            angr r4 = r5.d
            if (r4 == 0) goto L7e
            anhj r8 = r4.b(r8)
            goto L7f
        L7e:
            r8 = r3
        L7f:
            if (r8 == 0) goto L88
            anho r4 = new anho
            r4.<init>(r8, r3)
            r8 = r4
            goto L89
        L88:
            r8 = r3
        L89:
            yyg r4 = new yyg
            r4.<init>(r1, r8)
            r7.e = r3
            r8 = 3
            r7.b = r8
            java.lang.Object r8 = r2.fO(r4, r7)
            if (r8 != r0) goto L9a
            goto L9d
        L9a:
            fctx r8 = defpackage.fctx.a
            return r8
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yyo yyoVar = new yyo(this.c, this.d, fcxyVar);
        yyoVar.e = obj;
        return yyoVar;
    }
}
