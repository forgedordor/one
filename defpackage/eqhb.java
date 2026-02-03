package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhb extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ eqhr c;
    final /* synthetic */ String d;
    final /* synthetic */ eqdr e;
    final /* synthetic */ eqgk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhb(eqhr eqhrVar, String str, eqdr eqdrVar, eqgk eqgkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = eqhrVar;
        this.d = str;
        this.e = eqdrVar;
        this.f = eqgkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L13
            java.lang.Object r0 = r6.a
            defpackage.fctl.b(r7)
            goto L8f
        L13:
            defpackage.fctl.b(r7)
            goto L67
        L17:
            defpackage.fctl.b(r7)
            goto L2a
        L1b:
            defpackage.fctl.b(r7)
            eqhr r7 = r6.c
            java.lang.String r1 = r6.d
            r6.b = r3
            java.lang.Object r7 = defpackage.eqhr.o(r7, r1, r6)
            if (r7 == r0) goto La1
        L2a:
            eqdr r1 = r6.e
            ezpp r7 = (defpackage.ezpp) r7
            r6.b = r2
            ezrh r4 = defpackage.ezrh.a
            evsf r4 = r4.createBuilder()
            ezrg r4 = (defpackage.ezrg) r4
            r4.getClass()
            r7.getClass()
            r4.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r4.instance
            ezrh r5 = (defpackage.ezrh) r5
            r5.c = r7
            int r7 = r5.b
            r7 = r7 | r3
            r5.b = r7
            r4.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r7 = r4.instance
            ezrh r7 = (defpackage.ezrh) r7
            ezol r1 = r1.a
            r7.d = r1
            int r1 = r7.b
            r1 = r1 | r2
            r7.b = r1
            evsn r7 = r4.build()
            r7.getClass()
            ezrh r7 = (defpackage.ezrh) r7
            if (r7 == r0) goto La1
        L67:
            eqhr r1 = r6.c
            eqgk r2 = r6.f
            eqei r3 = r1.a
            ezrh r7 = (defpackage.ezrh) r7
            exzo r2 = r2.b()
            r3.a(r2)
            r6.a = r1
            r2 = 3
            r6.b = r2
            eqfy r2 = r1.c
            cnla r2 = r2.a
            eymr r2 = r2.a()
            fbrg r3 = new fbrg
            r3.<init>()
            java.lang.Object r7 = r2.f(r7, r3, r6)
            if (r7 == r0) goto La1
            r0 = r1
        L8f:
            ezrj r7 = (defpackage.ezrj) r7
            ezrp r7 = r7.b
            if (r7 != 0) goto L97
            ezrp r7 = defpackage.ezrp.a
        L97:
            r7.getClass()
            eqhr r0 = (defpackage.eqhr) r0
            eqds r7 = defpackage.eqhr.r(r0, r7)
            return r7
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhb(this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
