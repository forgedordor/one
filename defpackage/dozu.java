package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpao b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozu(dpao dpaoVar, boolean z, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpaoVar;
        this.c = z;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r5.bV(true, r4) == r0) goto L26;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Exception {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Le
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L12
            goto L88
        Le:
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L12
            goto L22
        L12:
            r5 = move-exception
            goto L55
        L14:
            defpackage.fctl.b(r5)
            dpao r5 = r4.b     // Catch: java.lang.Exception -> L12
            r4.a = r2     // Catch: java.lang.Exception -> L12
            java.lang.Object r5 = defpackage.dpao.by(r5, r4)     // Catch: java.lang.Exception -> L12
            if (r5 != r0) goto L22
            goto L54
        L22:
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = r4.d     // Catch: java.lang.Exception -> L12
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L12
        L2a:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L12
            r3 = r2
            doyu r3 = (defpackage.doyu) r3     // Catch: java.lang.Exception -> L12
            java.lang.String r3 = r3.a     // Catch: java.lang.Exception -> L12
            boolean r3 = defpackage.fdbq.f(r3, r1)     // Catch: java.lang.Exception -> L12
            if (r3 == 0) goto L2a
            goto L41
        L40:
            r2 = 0
        L41:
            doyu r2 = (defpackage.doyu) r2     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L49
            boolean r5 = r4.c     // Catch: java.lang.Exception -> L12
            r2.f = r5     // Catch: java.lang.Exception -> L12
        L49:
            dpao r5 = r4.b     // Catch: java.lang.Exception -> L12
            r1 = 2
            r4.a = r1     // Catch: java.lang.Exception -> L12
            java.lang.Object r5 = defpackage.dpao.bv(r5, r4)     // Catch: java.lang.Exception -> L12
            if (r5 != r0) goto L88
        L54:
            return r0
        L55:
            boolean r0 = r5 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L69
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 == 0) goto L68
            dpao r0 = r4.b
            doze r0 = defpackage.dpao.bo(r0)
            boolean r0 = r0.b
            if (r0 == 0) goto L68
            goto L69
        L68:
            throw r5
        L69:
            ekrg r0 = defpackage.dpao.a
            ekrw r0 = r0.i()
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r5 = r0.g(r5)
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r1 = "StickerScreen.kt"
            java.lang.String r2 = "com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$onViewCreated$10$onStickerPackFavoriteChanged$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Unable to update favorites."
            r5.q(r0)
        L88:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dozu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dozu(this.b, this.c, this.d, fcxyVar);
    }
}
