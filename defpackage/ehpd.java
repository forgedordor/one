package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpd extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ lvb d;
    final /* synthetic */ lvc e;
    final /* synthetic */ fdat f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehpd(lvb lvbVar, lvc lvcVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = lvbVar;
        this.e = lvcVar;
        this.f = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ehpd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.c
            if (r1 == 0) goto L15
            java.lang.Object r1 = r10.b
            java.lang.Object r2 = r10.a
            java.lang.Object r0 = r10.g
            fdjx r0 = (defpackage.fdjx) r0
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L12
            goto L6a
        L12:
            r0 = move-exception
            goto L89
        L15:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.g
            r4 = r11
            fdjx r4 = (defpackage.fdjx) r4
            fdci r3 = new fdci
            r3.<init>()
            fdci r11 = new fdci
            r11.<init>()
            lvb r1 = r10.d     // Catch: java.lang.Throwable -> L86
            lvc r9 = r10.e     // Catch: java.lang.Throwable -> L86
            fdat r8 = r10.f     // Catch: java.lang.Throwable -> L86
            r10.g = r4     // Catch: java.lang.Throwable -> L86
            r10.a = r3     // Catch: java.lang.Throwable -> L86
            r10.b = r11     // Catch: java.lang.Throwable -> L86
            r2 = 1
            r10.c = r2     // Catch: java.lang.Throwable -> L86
            fdiu r6 = new fdiu     // Catch: java.lang.Throwable -> L86
            fcxy r5 = defpackage.fcym.c(r10)     // Catch: java.lang.Throwable -> L86
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L86
            r6.B()     // Catch: java.lang.Throwable -> L86
            luz r2 = defpackage.lva.Companion     // Catch: java.lang.Throwable -> L86
            lva r2 = defpackage.luz.c(r1)     // Catch: java.lang.Throwable -> L86
            lva r5 = defpackage.luz.a(r1)     // Catch: java.lang.Throwable -> L86
            feaz r7 = new feaz     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            ehpc r1 = new ehpc     // Catch: java.lang.Throwable -> L86
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L86
            r11.a = r1     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r11.a     // Catch: java.lang.Throwable -> L86
            r1.getClass()     // Catch: java.lang.Throwable -> L86
            lvh r1 = (defpackage.lvh) r1     // Catch: java.lang.Throwable -> L86
            r9.c(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r6.m()     // Catch: java.lang.Throwable -> L86
            if (r1 == r0) goto L85
            r1 = r11
            r2 = r3
        L6a:
            fdci r2 = (defpackage.fdci) r2
            java.lang.Object r11 = r2.a
            fdlr r11 = (defpackage.fdlr) r11
            if (r11 == 0) goto L75
            defpackage.fdlp.a(r11)
        L75:
            fdci r1 = (defpackage.fdci) r1
            java.lang.Object r11 = r1.a
            lvh r11 = (defpackage.lvh) r11
            if (r11 == 0) goto L82
            lvc r0 = r10.e
            r0.d(r11)
        L82:
            fctx r11 = defpackage.fctx.a
            return r11
        L85:
            return r0
        L86:
            r0 = move-exception
            r1 = r11
            r2 = r3
        L89:
            r11 = r0
            fdci r2 = (defpackage.fdci) r2
            java.lang.Object r0 = r2.a
            fdlr r0 = (defpackage.fdlr) r0
            if (r0 == 0) goto L95
            defpackage.fdlp.a(r0)
        L95:
            fdci r1 = (defpackage.fdci) r1
            java.lang.Object r0 = r1.a
            lvh r0 = (defpackage.lvh) r0
            if (r0 == 0) goto La2
            lvc r1 = r10.e
            r1.d(r0)
        La2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehpd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ehpd ehpdVar = new ehpd(this.d, this.e, this.f, fcxyVar);
        ehpdVar.g = obj;
        return ehpdVar;
    }
}
