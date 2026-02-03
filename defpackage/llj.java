package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llj extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ llo c;
    final /* synthetic */ fcyh d;
    final /* synthetic */ fdat e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llj(llo lloVar, fcyh fcyhVar, fdat fdatVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = lloVar;
        this.d = fcyhVar;
        this.e = fdatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L12
            java.lang.Object r0 = r8.a
            defpackage.fctl.b(r9)
            return r0
        L12:
            java.lang.Object r1 = r8.a
            ljt r1 = (defpackage.ljt) r1
            defpackage.fctl.b(r9)
            goto L44
        L1a:
            defpackage.fctl.b(r9)
            goto L2b
        L1e:
            defpackage.fctl.b(r9)
            llo r9 = r8.c
            r8.b = r3
            java.lang.Object r9 = r9.k(r3, r8)
            if (r9 == r0) goto L6e
        L2b:
            fcyh r1 = r8.d
            fdat r4 = r8.e
            ljt r9 = (defpackage.ljt) r9
            lli r5 = new lli
            r6 = 0
            r5.<init>(r4, r9, r6)
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.fdin.a(r1, r5, r8)
            if (r1 == r0) goto L6e
            r7 = r1
            r1 = r9
            r9 = r7
        L44:
            java.lang.Object r2 = r1.a
            if (r2 == 0) goto L4d
            int r4 = r2.hashCode()
            goto L4e
        L4d:
            r4 = 0
        L4e:
            int r1 = r1.b
            if (r4 != r1) goto L66
            boolean r1 = defpackage.fdbq.f(r2, r9)
            if (r1 != 0) goto L65
            llo r1 = r8.c
            r8.a = r9
            r2 = 3
            r8.b = r2
            java.lang.Object r1 = r1.l(r9, r3, r8)
            if (r1 == r0) goto L6e
        L65:
            return r9
        L66:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new llj(this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
