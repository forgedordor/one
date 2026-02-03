package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lmp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ lmq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmp(lmq lmqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = lmqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lmp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r1.a(r5, r4) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r1 r5
      0x0035: PHI (r1v1 fdat) = (r1v5 fdat), (r1v6 fdat) binds: [B:10:0x0033, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r5v5 java.lang.Object) = (r5v9 java.lang.Object), (r5v0 java.lang.Object) binds: [B:10:0x0033, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003f -> B:13:0x0041). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L41
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.fctl.b(r5)
            goto L35
        L13:
            defpackage.fctl.b(r5)
            lmq r5 = r4.c
            ljp r5 = r5.d
            int r5 = r5.a()
            if (r5 <= 0) goto L52
        L20:
            lmq r5 = r4.c
            fdjx r1 = r5.a
            defpackage.fdjy.f(r1)
            fdat r1 = r5.b
            r4.a = r1
            r4.b = r2
            fdoa r5 = r5.c
            java.lang.Object r5 = r5.i(r4)
            if (r5 == r0) goto L51
        L35:
            r3 = 0
            r4.a = r3
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L51
        L41:
            lmq r5 = r4.c
            ljp r5 = r5.d
            java.util.concurrent.atomic.AtomicInteger r5 = r5.a
            int r5 = r5.decrementAndGet()
            if (r5 == 0) goto L4e
            goto L20
        L4e:
            fctx r5 = defpackage.fctx.a
            return r5
        L51:
            return r0
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lmp(this.c, fcxyVar);
    }
}
