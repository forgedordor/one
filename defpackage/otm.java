package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otm extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ots d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otm(ots otsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = otsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otm) c((owr) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.c
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L38
            if (r1 == r3) goto L23
            if (r1 == r2) goto L1a
            java.lang.Object r0 = r8.b
            java.lang.Object r1 = r8.a
            java.lang.Object r2 = r8.e
            owr r2 = (defpackage.owr) r2
            defpackage.fctl.b(r9)
            goto L8b
        L1a:
            java.lang.Object r1 = r8.e
            owr r1 = (defpackage.owr) r1
            defpackage.fctl.b(r9)
            r2 = r1
            goto L76
        L23:
            java.lang.Object r0 = r8.b
            ott r0 = (defpackage.ott) r0
            java.lang.Object r1 = r8.a
            owl r1 = (defpackage.owl) r1
            java.lang.Object r1 = r8.e
            owr r1 = (defpackage.owr) r1
            defpackage.fctl.b(r9)
            otw r9 = r0.b     // Catch: java.lang.Throwable -> L37
            r9.e(r5)     // Catch: java.lang.Throwable -> L37
        L37:
            throw r5
        L38:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.e
            owr r9 = (defpackage.owr) r9
            ots r1 = r8.d
            java.util.concurrent.atomic.AtomicBoolean r6 = r1.f
            r7 = 0
            boolean r3 = r6.compareAndSet(r7, r3)
            if (r3 == 0) goto Lac
            otg r3 = new otg
            r3.<init>(r1, r9, r5)
            defpackage.fdil.d(r9, r5, r5, r3, r4)
            r3 = 6
            fdoa r3 = defpackage.fdod.a(r7, r7, r3)
            oti r6 = new oti
            r6.<init>(r1, r3, r5)
            defpackage.fdil.d(r9, r5, r5, r6, r4)
            otl r6 = new otl
            r6.<init>(r3, r1, r5)
            defpackage.fdil.d(r9, r5, r5, r6, r4)
            r8.e = r9
            r8.a = r5
            r8.b = r5
            r8.c = r2
            java.lang.Object r1 = r1.c(r8)
            if (r1 == r0) goto Lab
            r2 = r9
        L76:
            ots r9 = r8.d
            r8.e = r2
            ott r1 = r9.h
            r8.a = r1
            feav r9 = r1.a
            r8.b = r9
            r8.c = r4
            java.lang.Object r3 = r9.b(r8)
            if (r3 == r0) goto Lab
            r0 = r9
        L8b:
            ott r1 = (defpackage.ott) r1     // Catch: java.lang.Throwable -> La6
            otw r9 = r1.b     // Catch: java.lang.Throwable -> La6
            orz r9 = r9.j     // Catch: java.lang.Throwable -> La6
            orr r1 = defpackage.orr.a     // Catch: java.lang.Throwable -> La6
            orp r9 = r9.a(r1)     // Catch: java.lang.Throwable -> La6
            r0.d()
            boolean r9 = r9 instanceof defpackage.orm
            if (r9 != 0) goto La3
            ots r9 = r8.d
            r9.h(r2)
        La3:
            fctx r9 = defpackage.fctx.a
            return r9
        La6:
            r9 = move-exception
            r0.d()
            throw r9
        Lab:
            return r0
        Lac:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        otm otmVar = new otm(this.d, fcxyVar);
        otmVar.e = obj;
        return otmVar;
    }
}
