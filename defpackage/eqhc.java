package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhc extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ eqhr c;
    final /* synthetic */ String d;
    final /* synthetic */ Iterable e;
    final /* synthetic */ eqgk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhc(eqhr eqhrVar, String str, Iterable iterable, eqgk eqgkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = eqhrVar;
        this.d = str;
        this.e = iterable;
        this.f = eqgkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de A[LOOP:0: B:24:0x00d8->B:26:0x00de, LOOP_END] */
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
            r2 = 10
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L15
            java.lang.Object r0 = r6.a
            defpackage.fctl.b(r7)
            goto Lc4
        L15:
            defpackage.fctl.b(r7)
            goto L9c
        L1a:
            defpackage.fctl.b(r7)
            goto L2d
        L1e:
            defpackage.fctl.b(r7)
            eqhr r7 = r6.c
            java.lang.String r1 = r6.d
            r6.b = r4
            java.lang.Object r7 = defpackage.eqhr.o(r7, r1, r6)
            if (r7 == r0) goto Lf3
        L2d:
            java.lang.Iterable r1 = r6.e
            ezpp r7 = (defpackage.ezpp) r7
            r6.b = r3
            ezrl r3 = defpackage.ezrl.a
            evsf r3 = r3.createBuilder()
            ezrk r3 = (defpackage.ezrk) r3
            r3.getClass()
            r7.getClass()
            r3.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r3.instance
            ezrl r5 = (defpackage.ezrl) r5
            r5.c = r7
            int r7 = r5.b
            r7 = r7 | r4
            r5.b = r7
            evtg r7 = r5.d
            java.util.List r7 = j$.util.DesugarCollections.unmodifiableList(r7)
            r7.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r4 = defpackage.fcva.p(r1, r2)
            r7.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r1.next()
            eqdr r4 = (defpackage.eqdr) r4
            ezol r4 = r4.a
            r7.add(r4)
            goto L65
        L77:
            r3.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r3.instance
            ezrl r1 = (defpackage.ezrl) r1
            evtg r4 = r1.d
            boolean r5 = r4.c()
            if (r5 != 0) goto L8c
            evtg r4 = defpackage.evsn.mutableCopy(r4)
            r1.d = r4
        L8c:
            evtg r1 = r1.d
            defpackage.evpz.addAll(r7, r1)
            evsn r7 = r3.build()
            r7.getClass()
            ezrl r7 = (defpackage.ezrl) r7
            if (r7 == r0) goto Lf3
        L9c:
            eqhr r1 = r6.c
            eqgk r3 = r6.f
            eqei r4 = r1.a
            ezrl r7 = (defpackage.ezrl) r7
            exzo r3 = r3.b()
            r4.a(r3)
            r6.a = r1
            r3 = 3
            r6.b = r3
            eqfy r3 = r1.c
            cnla r3 = r3.a
            eymr r3 = r3.a()
            fbrg r4 = new fbrg
            r4.<init>()
            java.lang.Object r7 = r3.g(r7, r4, r6)
            if (r7 == r0) goto Lf3
            r0 = r1
        Lc4:
            ezrn r7 = (defpackage.ezrn) r7
            evtg r7 = r7.b
            r7.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.fcva.p(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        Ld8:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lf2
            java.lang.Object r2 = r7.next()
            ezrp r2 = (defpackage.ezrp) r2
            r2.getClass()
            r3 = r0
            eqhr r3 = (defpackage.eqhr) r3
            eqds r2 = defpackage.eqhr.r(r3, r2)
            r1.add(r2)
            goto Ld8
        Lf2:
            return r1
        Lf3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhc(this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
