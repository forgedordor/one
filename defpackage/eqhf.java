package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhf extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ eqhr c;
    final /* synthetic */ String d;
    final /* synthetic */ ezol e;
    final /* synthetic */ eqgu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhf(eqhr eqhrVar, String str, ezol ezolVar, eqgu eqguVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = eqhrVar;
        this.d = str;
        this.e = ezolVar;
        this.f = eqguVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r5 == r0) goto L13;
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
            int r1 = r4.b
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L40
        Ld:
            eqhr r5 = r4.c
            java.lang.String r1 = r4.d
            r4.b = r2
            java.lang.Object r5 = defpackage.eqhr.o(r5, r1, r4)
            if (r5 == r0) goto L4b
        L19:
            ezol r1 = r4.e
            ezpp r5 = (defpackage.ezpp) r5
            java.util.List r1 = defpackage.fcva.b(r1)
            ezjt r5 = defpackage.eqgj.a(r5, r1)
            eqhr r1 = r4.c
            eqgu r2 = r4.f
            eqei r3 = r1.a
            exzo r2 = r2.b()
            r3.a(r2)
            r4.a = r1
            r2 = 2
            r4.b = r2
            eqfy r1 = r1.c
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L40
            goto L4b
        L40:
            ezjv r5 = (defpackage.ezjv) r5
            java.util.List r5 = defpackage.eqhr.u(r5)
            java.lang.Object r5 = defpackage.fcva.X(r5)
            return r5
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhf(this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
