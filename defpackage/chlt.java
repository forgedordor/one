package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chlt extends fcyz implements fdat {
    int a;
    final /* synthetic */ chmd b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ evvp f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlt(fcxy fcxyVar, chmd chmdVar, String str, String str2, String str3, evvp evvpVar) {
        super(2, fcxyVar);
        this.b = chmdVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = evvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r6.f(r1, r5) != r0) goto L18;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r6)
            if (r1 == r3) goto L25
            if (r1 == r2) goto L3a
            goto L48
        L10:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.g
            fdjx r6 = (defpackage.fdjx) r6
            chmd r6 = r5.b
            java.lang.String r1 = r5.c
            java.lang.String r4 = r5.d
            r5.a = r3
            java.lang.Object r6 = r6.a(r1, r4, r5)
            if (r6 == r0) goto L4b
        L25:
            chmd r6 = r5.b
            java.lang.String r1 = defpackage.chlu.a
            java.lang.String r1 = r5.e
            if (r1 != 0) goto L32
            java.lang.String r1 = new java.lang.String
            r1.<init>()
        L32:
            r5.a = r2
            java.lang.Object r6 = r6.g(r1, r5)
            if (r6 == r0) goto L4b
        L3a:
            chmd r6 = r5.b
            evvp r1 = r5.f
            r2 = 3
            r5.a = r2
            java.lang.Object r6 = r6.f(r1, r5)
            if (r6 != r0) goto L48
            goto L4b
        L48:
            fctx r6 = defpackage.fctx.a
            return r6
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chlt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chlt chltVar = new chlt(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        chltVar.g = obj;
        return chltVar;
    }
}
