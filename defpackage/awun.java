package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awun extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ awuo d;
    final /* synthetic */ cmmh e;
    final /* synthetic */ dggk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awun(awuo awuoVar, cmmh cmmhVar, dggk dggkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = awuoVar;
        this.e = cmmhVar;
        this.f = dggkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r10.b(r3, r9) != r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L31
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L18
            defpackage.fctl.b(r10)
            goto La8
        L18:
            java.lang.Object r1 = r9.a
            defpackage.fctl.b(r10)
            goto L87
        L1f:
            java.lang.Object r1 = r9.b
            java.lang.Object r3 = r9.a
            defpackage.fctl.b(r10)
            goto L6f
        L27:
            java.lang.Object r1 = r9.a
            defpackage.fctl.b(r10)
            goto L5b
        L2d:
            defpackage.fctl.b(r10)
            goto L4a
        L31:
            defpackage.fctl.b(r10)
            awuo r10 = r9.d
            fcsu r10 = r10.b
            java.lang.Object r10 = r10.b()
            awvj r10 = (defpackage.awvj) r10
            cmmh r1 = r9.e
            dggk r7 = r9.f
            r9.c = r5
            java.lang.Object r10 = r10.g(r1, r7, r9)
            if (r10 == r0) goto Lab
        L4a:
            r1 = r10
            axcm r1 = (defpackage.axcm) r1
            if (r1 == 0) goto La8
            awuo r10 = r9.d
            r9.a = r1
            r9.c = r4
            java.lang.Object r10 = r10.e(r9)
            if (r10 == r0) goto Lab
        L5b:
            awuo r4 = r9.d
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r9.a = r1
            r9.b = r10
            r9.c = r3
            java.lang.Object r3 = r4.f(r9)
            if (r3 == r0) goto Lab
            r8 = r1
            r1 = r10
            r10 = r3
            r3 = r8
        L6f:
            awuo r4 = r9.d
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            awul r5 = new awul
            r5.<init>(r10, r1, r6)
            r9.a = r3
            r9.b = r6
            r9.c = r2
            awlc r10 = r4.c
            java.lang.Object r10 = r10.b(r5, r9)
            if (r10 == r0) goto Lab
            r1 = r3
        L87:
            awuo r10 = r9.d
            awuk r2 = new awuk
            r2.<init>()
            awlc r10 = r10.c
            r10.d(r2)
            dggk r2 = r9.f
            awum r3 = new awum
            axcm r1 = (defpackage.axcm) r1
            r3.<init>(r1, r2, r6)
            r9.a = r6
            r1 = 5
            r9.c = r1
            java.lang.Object r10 = r10.b(r3, r9)
            if (r10 != r0) goto La8
            goto Lab
        La8:
            fctx r10 = defpackage.fctx.a
            return r10
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awun.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awun(this.d, this.e, this.f, fcxyVar);
    }
}
