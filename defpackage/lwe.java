package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lwe extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ lvc d;
    final /* synthetic */ lvb e;
    final /* synthetic */ fdjx f;
    final /* synthetic */ fdat g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwe(lvc lvcVar, lvb lvbVar, fdjx fdjxVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = lvcVar;
        this.e = lvbVar;
        this.f = fdjxVar;
        this.g = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lwe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.c
            if (r1 == 0) goto L12
            java.lang.Object r1 = r11.b
            java.lang.Object r2 = r11.a
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> Le
            goto L69
        Le:
            r0 = move-exception
            r12 = r0
            goto L86
        L12:
            defpackage.fctl.b(r12)
            lvc r12 = r11.d
            lvb r1 = r12.a()
            lvb r2 = defpackage.lvb.a
            if (r1 == r2) goto L9f
            fdci r5 = new fdci
            r5.<init>()
            fdci r1 = new fdci
            r1.<init>()
            lvb r2 = r11.e     // Catch: java.lang.Throwable -> L83
            fdjx r6 = r11.f     // Catch: java.lang.Throwable -> L83
            fdat r10 = r11.g     // Catch: java.lang.Throwable -> L83
            r11.a = r5     // Catch: java.lang.Throwable -> L83
            r11.b = r1     // Catch: java.lang.Throwable -> L83
            r3 = 1
            r11.c = r3     // Catch: java.lang.Throwable -> L83
            fdiu r8 = new fdiu     // Catch: java.lang.Throwable -> L83
            fcxy r4 = defpackage.fcym.c(r11)     // Catch: java.lang.Throwable -> L83
            r8.<init>(r4, r3)     // Catch: java.lang.Throwable -> L83
            r8.B()     // Catch: java.lang.Throwable -> L83
            luz r3 = defpackage.lva.Companion     // Catch: java.lang.Throwable -> L83
            lva r4 = defpackage.luz.c(r2)     // Catch: java.lang.Throwable -> L83
            lva r7 = defpackage.luz.a(r2)     // Catch: java.lang.Throwable -> L83
            feaz r9 = new feaz     // Catch: java.lang.Throwable -> L83
            r9.<init>()     // Catch: java.lang.Throwable -> L83
            lwd r3 = new lwd     // Catch: java.lang.Throwable -> L83
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L83
            r1.a = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L83
            r2.getClass()     // Catch: java.lang.Throwable -> L83
            lvh r2 = (defpackage.lvh) r2     // Catch: java.lang.Throwable -> L83
            r12.c(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r12 = r8.m()     // Catch: java.lang.Throwable -> L83
            if (r12 == r0) goto L82
            r2 = r5
        L69:
            fdci r2 = (defpackage.fdci) r2
            java.lang.Object r12 = r2.a
            fdlr r12 = (defpackage.fdlr) r12
            if (r12 == 0) goto L74
            defpackage.fdlp.a(r12)
        L74:
            fdci r1 = (defpackage.fdci) r1
            java.lang.Object r12 = r1.a
            lvh r12 = (defpackage.lvh) r12
            if (r12 == 0) goto L9f
            lvc r0 = r11.d
            r0.d(r12)
            goto L9f
        L82:
            return r0
        L83:
            r0 = move-exception
            r12 = r0
            r2 = r5
        L86:
            fdci r2 = (defpackage.fdci) r2
            java.lang.Object r0 = r2.a
            fdlr r0 = (defpackage.fdlr) r0
            if (r0 == 0) goto L91
            defpackage.fdlp.a(r0)
        L91:
            fdci r1 = (defpackage.fdci) r1
            java.lang.Object r0 = r1.a
            lvh r0 = (defpackage.lvh) r0
            if (r0 == 0) goto L9e
            lvc r1 = r11.d
            r1.d(r0)
        L9e:
            throw r12
        L9f:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lwe(this.d, this.e, this.f, this.g, fcxyVar);
    }
}
