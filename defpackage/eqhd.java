package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhd extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ String c;
    final /* synthetic */ eqgk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhd(eqhr eqhrVar, String str, eqgk eqgkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = str;
        this.d = eqgkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[PHI: r5
      0x0070: PHI (r5v9 java.lang.Object) = (r5v15 java.lang.Object), (r5v0 java.lang.Object) binds: [B:13:0x006d, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.Collection] */
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
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L4a
            goto L70
        L10:
            defpackage.fctl.b(r5)
            eqhr r5 = r4.b
            java.lang.String r1 = r4.c
            r4.a = r3
            java.lang.Object r5 = defpackage.eqhr.o(r5, r1, r4)
            if (r5 == r0) goto La5
        L1f:
            ezpp r5 = (defpackage.ezpp) r5
            r4.a = r2
            ezrd r1 = defpackage.ezrd.a
            evsf r1 = r1.createBuilder()
            ezrc r1 = (defpackage.ezrc) r1
            r1.getClass()
            r5.getClass()
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r1.instance
            ezrd r2 = (defpackage.ezrd) r2
            r2.c = r5
            int r5 = r2.b
            r5 = r5 | r3
            r2.b = r5
            evsn r5 = r1.build()
            r5.getClass()
            ezrd r5 = (defpackage.ezrd) r5
            if (r5 == r0) goto La5
        L4a:
            eqhr r1 = r4.b
            eqgk r2 = r4.d
            eqei r3 = r1.a
            ezrd r5 = (defpackage.ezrd) r5
            exzo r2 = r2.b()
            r3.a(r2)
            r2 = 3
            r4.a = r2
            eqfy r1 = r1.c
            cnla r1 = r1.a
            eymr r1 = r1.a()
            fbrg r2 = new fbrg
            r2.<init>()
            java.lang.Object r5 = r1.e(r5, r2, r4)
            if (r5 != r0) goto L70
            goto La5
        L70:
            ezrf r5 = (defpackage.ezrf) r5
            evtg r5 = r5.b
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L86:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r5.next()
            ezol r1 = (defpackage.ezol) r1
            eqdc r2 = new eqdc
            r2.<init>()
            r1.getClass()
            r2.c(r1)
            eqdr r1 = r2.a()
            r0.add(r1)
            goto L86
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhd(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
