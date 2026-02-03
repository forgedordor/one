package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgd extends fcyz implements fdat {
    int a;
    final /* synthetic */ pgn b;
    final /* synthetic */ int[] c;
    final /* synthetic */ String[] d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgd(pgn pgnVar, int[] iArr, String[] strArr, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = pgnVar;
        this.c = iArr;
        this.d = strArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgd) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r3.a(r4, r7) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[Catch: all -> 0x0019, PHI: r1
      0x0057: PHI (r1v5 fdpm) = (r1v3 fdpm), (r1v4 fdpm), (r1v9 fdpm) binds: [B:13:0x0035, B:17:0x0055, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0019, blocks: (B:18:0x0057, B:21:0x0075, B:22:0x007a, B:7:0x0015), top: B:25:0x0007 }] */
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            java.lang.Object r1 = r7.e
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r8)
            goto L57
        L15:
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L19
            goto L75
        L19:
            r8 = move-exception
            goto L7b
        L1b:
            java.lang.Object r1 = r7.e
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r8)
            goto L44
        L23:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.e
            r1 = r8
            fdpm r1 = (defpackage.fdpm) r1
            pgn r8 = r7.b
            int[] r5 = r7.c
            pee r6 = r8.c
            boolean r5 = r6.a(r5)
            if (r5 == 0) goto L57
            pex r8 = r8.a
            r7.e = r1
            r7.a = r4
            r4 = 0
            java.lang.Object r8 = defpackage.phx.a(r8, r4, r7)
            if (r8 == r0) goto L74
        L44:
            pgn r4 = r7.b
            fcyh r8 = (defpackage.fcyh) r8
            pga r5 = new pga
            r5.<init>(r4, r2)
            r7.e = r1
            r7.a = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r5, r7)
            if (r8 == r0) goto L74
        L57:
            fdci r8 = new fdci     // Catch: java.lang.Throwable -> L19
            r8.<init>()     // Catch: java.lang.Throwable -> L19
            pgn r3 = r7.b     // Catch: java.lang.Throwable -> L19
            peg r3 = r3.d     // Catch: java.lang.Throwable -> L19
            pgc r4 = new pgc     // Catch: java.lang.Throwable -> L19
            java.lang.String[] r5 = r7.d     // Catch: java.lang.Throwable -> L19
            int[] r6 = r7.c     // Catch: java.lang.Throwable -> L19
            r4.<init>(r8, r1, r5, r6)     // Catch: java.lang.Throwable -> L19
            r7.e = r2     // Catch: java.lang.Throwable -> L19
            r8 = 3
            r7.a = r8     // Catch: java.lang.Throwable -> L19
            java.lang.Object r8 = r3.a(r4, r7)     // Catch: java.lang.Throwable -> L19
            if (r8 != r0) goto L75
        L74:
            return r0
        L75:
            fcta r8 = new fcta     // Catch: java.lang.Throwable -> L19
            r8.<init>()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        L7b:
            pgn r0 = r7.b
            int[] r1 = r7.c
            pee r0 = r0.c
            r0.b(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        pgd pgdVar = new pgd(this.b, this.c, this.d, fcxyVar);
        pgdVar.e = obj;
        return pgdVar;
    }
}
