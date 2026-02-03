package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhrg extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dhrh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhrg(boolean z, dhrh dhrhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = dhrhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhrg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r14.g(r13) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r14 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r14
      0x0056: PHI (r14v12 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:20:0x0054, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.a
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L17
            defpackage.fctl.b(r14)
            if (r1 == r5) goto L56
            if (r1 == r2) goto L88
            goto L94
        L17:
            defpackage.fctl.b(r14)
            goto L46
        L1b:
            defpackage.fctl.b(r14)
            goto L34
        L1f:
            defpackage.fctl.b(r14)
            boolean r14 = r13.b
            if (r14 == 0) goto L4c
            dhrh r14 = r13.c
            r13.a = r4
            dhxi r1 = r14.b
            dhnv r14 = r14.a
            java.lang.Object r14 = r1.a(r14, r13)
            if (r14 == r0) goto Lbe
        L34:
            dhrh r14 = r13.c
            dhxa r1 = r14.c
            dhnv r14 = r14.a
            dhwz r14 = r1.a(r14)
            r13.a = r3
            java.lang.Object r14 = r14.g(r13)
            if (r14 == r0) goto Lbe
        L46:
            dhrh r14 = r13.c
            r3 = -1
            r14.f = r3
        L4c:
            dhrh r14 = r13.c
            r13.a = r5
            java.lang.Object r14 = r14.b(r13)
            if (r14 == r0) goto Lbe
        L56:
            dhrh r1 = r13.c
            dhvy r14 = (defpackage.dhvy) r14
            dhpt r3 = r1.d
            boolean r3 = r3.a
            if (r3 != 0) goto L72
            if (r14 == 0) goto L63
            goto Lbd
        L63:
            dhvf r6 = new dhvf
            r11 = 0
            r12 = 56
            r7 = 14
            r8 = 6
            java.lang.String r9 = "Persephone downloads not enabled."
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            throw r6
        L72:
            fdjx r3 = r1.e
            dhrf r4 = new dhrf
            r6 = 0
            r4.<init>(r1, r6)
            fdkf r1 = defpackage.fdil.c(r3, r6, r4, r5)
            if (r14 != 0) goto Lbd
            r13.a = r2
            java.lang.Object r14 = r1.c(r13)
            if (r14 == r0) goto Lbe
        L88:
            dhrh r14 = r13.c
            r1 = 5
            r13.a = r1
            java.lang.Object r14 = r14.b(r13)
            if (r14 != r0) goto L94
            goto Lbe
        L94:
            dhvy r14 = (defpackage.dhvy) r14
            if (r14 == 0) goto L99
            return r14
        L99:
            dhrh r14 = r13.c
            dhvf r0 = new dhvf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No protections in storage after update for client "
            r1.<init>(r2)
            dhnv r14 = r14.a
            r1.append(r14)
            java.lang.String r14 = "."
            r1.append(r14)
            java.lang.String r3 = r1.toString()
            r5 = 0
            r6 = 56
            r1 = 15
            r2 = 5
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        Lbd:
            return r14
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhrg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dhrg(this.b, this.c, fcxyVar);
    }
}
