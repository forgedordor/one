package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhq extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ eqdx c;
    final /* synthetic */ String d;
    final /* synthetic */ eqgk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhq(eqhr eqhrVar, eqdx eqdxVar, String str, eqgk eqgkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = eqdxVar;
        this.d = str;
        this.e = eqgkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r5 == r0) goto L19;
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
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L36
        Ld:
            eqhr r5 = r4.b
            eqdx r1 = r4.c
            java.lang.String r3 = r4.d
            r4.a = r2
            java.lang.Object r5 = r5.n(r1, r3, r4)
            if (r5 == r0) goto L51
        L1b:
            eqhr r1 = r4.b
            eqgk r2 = r4.e
            eqei r3 = r1.a
            ezqt r5 = (defpackage.ezqt) r5
            exzo r2 = r2.b()
            r3.a(r2)
            r2 = 2
            r4.a = r2
            eqfy r1 = r1.c
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L36
            goto L51
        L36:
            ezqv r5 = (defpackage.ezqv) r5
            ezot r5 = r5.b
            if (r5 != 0) goto L3e
            ezot r5 = defpackage.ezot.a
        L3e:
            r5.getClass()
            evvh r5 = r5.e
            if (r5 != 0) goto L47
            evvh r5 = defpackage.evvh.a
        L47:
            java.lang.String r5 = r5.b
            r5.getClass()
            eqdw r5 = defpackage.eqdt.a(r5)
            return r5
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhq(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
