package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cykd extends fcyz implements fdat {
    int a;
    final /* synthetic */ cykk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cykd(cykk cykkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cykkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cykd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r5 != r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r5)
            if (r1 == r3) goto L25
            if (r1 == r2) goto L39
            goto L4f
        L10:
            defpackage.fctl.b(r5)
            cykk r5 = r4.b
            dens r5 = r5.e
            android.net.Uri r1 = defpackage.cykk.b
            defn r5 = r5.a(r1)
            r4.a = r3
            java.lang.Object r5 = defpackage.cykk.c(r5, r4)
            if (r5 == r0) goto L5e
        L25:
            java.lang.Integer r5 = (java.lang.Integer) r5
            cykk r5 = r4.b
            dens r5 = r5.e
            android.net.Uri r1 = defpackage.cykk.c
            defn r5 = r5.a(r1)
            r4.a = r2
            java.lang.Object r5 = defpackage.cykk.c(r5, r4)
            if (r5 == r0) goto L5e
        L39:
            java.lang.Integer r5 = (java.lang.Integer) r5
            cykk r5 = r4.b
            dens r5 = r5.e
            android.net.Uri r1 = defpackage.cykk.d
            defn r5 = r5.f(r1)
            r1 = 3
            r4.a = r1
            java.lang.Object r5 = defpackage.cykk.c(r5, r4)
            if (r5 != r0) goto L4f
            goto L5e
        L4f:
            java.lang.Integer r5 = (java.lang.Integer) r5
            cykk r5 = r4.b
            cykc r0 = new cykc
            r0.<init>()
            defpackage.cqdq.e(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cykd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cykd(this.b, fcxyVar);
    }
}
