package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnjc extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dnjd c;
    final /* synthetic */ String d;
    final /* synthetic */ fdat e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnjc(dnjd dnjdVar, String str, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnjdVar;
        this.d = str;
        this.e = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnjc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
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
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L13
            java.lang.Object r0 = r11.a
            java.lang.Object r1 = r11.f
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r12)
            goto L56
        L13:
            java.lang.Object r1 = r11.f
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r12)
            goto L35
        L1b:
            defpackage.fctl.b(r12)
            java.lang.Object r12 = r11.f
            fdjx r12 = (defpackage.fdjx) r12
            dnjd r1 = r11.c
            java.lang.String r3 = r11.d
            r11.f = r12
            r11.b = r2
            dnkk r1 = r1.a
            java.lang.Object r1 = r1.d(r3, r11)
            if (r1 == r0) goto L87
            r10 = r1
            r1 = r12
            r12 = r10
        L35:
            dnkf r12 = (defpackage.dnkf) r12
            if (r12 != 0) goto L41
            java.lang.String r12 = r11.d
            dnjr r2 = new dnjr
            r2.<init>(r12)
            r12 = r2
        L41:
            dnjd r2 = r11.c
            java.lang.String r3 = r11.d
            r11.f = r1
            r11.a = r12
            r4 = 2
            r11.b = r4
            dnkk r2 = r2.a
            java.lang.Object r2 = r2.e(r3, r11)
            if (r2 == r0) goto L87
            r0 = r12
            r12 = r2
        L56:
            dnmj r12 = (defpackage.dnmj) r12
            if (r12 != 0) goto L66
            dnmh r12 = new dnmh
            r2 = r0
            dnkf r2 = (defpackage.dnkf) r2
            dnjs r2 = r2.b()
            r12.<init>(r2)
        L66:
            r4 = r12
            dnnp r3 = new dnnp
            dnnl r7 = defpackage.dnnl.a
            r5 = r0
            dnkf r5 = (defpackage.dnkf) r5
            r8 = 0
            r9 = 20
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r12 = defpackage.fdjy.g(r1)
            if (r12 == 0) goto L84
            fdat r12 = r11.e
            dnjd r0 = r11.c
            java.util.List r0 = r0.b
            r12.a(r0, r3)
        L84:
            fctx r12 = defpackage.fctx.a
            return r12
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnjc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnjc dnjcVar = new dnjc(this.c, this.d, this.e, fcxyVar);
        dnjcVar.f = obj;
        return dnjcVar;
    }
}
