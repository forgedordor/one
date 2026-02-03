package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhk extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ String c;
    final /* synthetic */ eqcz d;
    final /* synthetic */ eqdr e;
    final /* synthetic */ Iterable f;
    final /* synthetic */ eqgk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhk(eqhr eqhrVar, String str, eqcz eqczVar, eqdr eqdrVar, Iterable iterable, eqgk eqgkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = str;
        this.d = eqczVar;
        this.e = eqdrVar;
        this.f = iterable;
        this.g = eqgkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
    
        if (r8 != r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L11
            defpackage.fctl.b(r8)
            if (r1 == r3) goto L22
            if (r1 == r2) goto L87
            goto Lad
        L11:
            defpackage.fctl.b(r8)
            eqhr r8 = r7.b
            java.lang.String r1 = r7.c
            eqcz r4 = r7.d
            r7.a = r3
            java.lang.Object r8 = r8.l(r1, r4, r7)
            if (r8 == r0) goto Lb2
        L22:
            eqdr r1 = r7.e
            java.lang.Iterable r4 = r7.f
            ezpp r8 = (defpackage.ezpp) r8
            r7.a = r2
            ezrw r5 = defpackage.ezrw.a
            evsf r5 = r5.createBuilder()
            ezrv r5 = (defpackage.ezrv) r5
            r5.getClass()
            r8.getClass()
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r6 = r5.instance
            ezrw r6 = (defpackage.ezrw) r6
            r6.c = r8
            int r8 = r6.b
            r8 = r8 | r3
            r6.b = r8
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r5.instance
            ezrw r8 = (defpackage.ezrw) r8
            ezol r1 = r1.a
            r8.d = r1
            int r1 = r8.b
            r1 = r1 | r2
            r8.b = r1
            evtg r8 = r8.e
            java.util.List r8 = j$.util.DesugarCollections.unmodifiableList(r8)
            r8.getClass()
            r4.getClass()
            r5.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r5.instance
            ezrw r8 = (defpackage.ezrw) r8
            evtg r1 = r8.e
            boolean r2 = r1.c()
            if (r2 != 0) goto L77
            evtg r1 = defpackage.evsn.mutableCopy(r1)
            r8.e = r1
        L77:
            evtg r8 = r8.e
            defpackage.evpz.addAll(r4, r8)
            evsn r8 = r5.build()
            r8.getClass()
            ezrw r8 = (defpackage.ezrw) r8
            if (r8 == r0) goto Lb2
        L87:
            eqhr r1 = r7.b
            eqgk r2 = r7.g
            eqei r3 = r1.a
            ezrw r8 = (defpackage.ezrw) r8
            exzo r2 = r2.b()
            r3.a(r2)
            r2 = 3
            r7.a = r2
            eqfy r1 = r1.c
            cnla r1 = r1.a
            eymr r1 = r1.a()
            fbrg r2 = new fbrg
            r2.<init>()
            java.lang.Object r8 = r1.h(r8, r2, r7)
            if (r8 != r0) goto Lad
            goto Lb2
        Lad:
            ezry r8 = (defpackage.ezry) r8
            evtg r8 = r8.b
            return r8
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqhk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhk(this.b, this.c, this.d, this.e, this.f, this.g, (fcxy) obj).b(fctx.a);
    }
}
