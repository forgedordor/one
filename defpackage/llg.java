package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llg extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ fdci c;
    final /* synthetic */ llo d;
    final /* synthetic */ fdcg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llg(fdci fdciVar, llo lloVar, fdcg fdcgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = fdciVar;
        this.d = lloVar;
        this.e = fdcgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6 != r0) goto L19;
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
            int r1 = r5.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r0 = r5.a
            fdcg r0 = (defpackage.fdcg) r0
            defpackage.fctl.b(r6)
            goto L68
        L14:
            java.lang.Object r1 = r5.a
            fdcg r1 = (defpackage.fdcg) r1
            defpackage.fctl.b(r6)     // Catch: defpackage.ljr -> L53
            goto L4a
        L1c:
            java.lang.Object r1 = r5.a
            fdci r1 = (defpackage.fdci) r1
            defpackage.fctl.b(r6)     // Catch: defpackage.ljr -> L53
            goto L36
        L24:
            defpackage.fctl.b(r6)
            fdci r1 = r5.c     // Catch: defpackage.ljr -> L53
            llo r6 = r5.d     // Catch: defpackage.ljr -> L53
            r5.a = r1     // Catch: defpackage.ljr -> L53
            r5.b = r3     // Catch: defpackage.ljr -> L53
            java.lang.Object r6 = r6.j(r5)     // Catch: defpackage.ljr -> L53
            if (r6 != r0) goto L36
            goto L73
        L36:
            r1.a = r6     // Catch: defpackage.ljr -> L53
            fdcg r1 = r5.e     // Catch: defpackage.ljr -> L53
            llo r6 = r5.d     // Catch: defpackage.ljr -> L53
            lmg r6 = r6.c()     // Catch: defpackage.ljr -> L53
            r5.a = r1     // Catch: defpackage.ljr -> L53
            r5.b = r2     // Catch: defpackage.ljr -> L53
            java.lang.Object r6 = r6.d()     // Catch: defpackage.ljr -> L53
            if (r6 == r0) goto L73
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: defpackage.ljr -> L53
            int r6 = r6.intValue()     // Catch: defpackage.ljr -> L53
            r1.a = r6     // Catch: defpackage.ljr -> L53
            goto L70
        L53:
            fdcg r6 = r5.e
            llo r1 = r5.d
            fdci r2 = r5.c
            java.lang.Object r2 = r2.a
            r5.a = r6
            r4 = 3
            r5.b = r4
            java.lang.Object r1 = r1.l(r2, r3, r5)
            if (r1 == r0) goto L73
            r0 = r6
            r6 = r1
        L68:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.a = r6
        L70:
            fctx r6 = defpackage.fctx.a
            return r6
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new llg(this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
