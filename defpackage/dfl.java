package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfl extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ dfm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfl(hox hoxVar, dfm dfmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = dfmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dfl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Path cross not found for [B:12:0x0050, B:8:0x002e], limit reached: 15 */
    /* JADX WARN: Path cross not found for [B:8:0x002e, B:12:0x0050], limit reached: 15 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[PHI: r1 r3
      0x0046: PHI (r1v2 java.lang.Object) = (r1v10 java.lang.Object), (r1v11 java.lang.Object) binds: [B:9:0x0044, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r3v2 fdjx) = (r3v3 fdjx), (r3v5 fdjx) binds: [B:9:0x0044, B:6:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004e -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006a -> B:8:0x002e). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.e
            fdjx r3 = (defpackage.fdjx) r3
            defpackage.fctl.b(r8)
            goto L2e
        L13:
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.e
            fdjx r3 = (defpackage.fdjx) r3
            defpackage.fctl.b(r8)
            goto L46
        L1d:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.e
            r3 = r8
            fdjx r3 = (defpackage.fdjx) r3
            fdcf r1 = new fdcf
            r1.<init>()
            r8 = 1065353216(0x3f800000, float:1.0)
            r1.a = r8
        L2e:
            dfm r8 = r7.d
            dfi r4 = new dfi
            r5 = r1
            fdcf r5 = (defpackage.fdcf) r5
            hox r6 = r7.c
            r4.<init>()
            r7.e = r3
            r7.a = r1
            r7.b = r2
            java.lang.Object r8 = defpackage.dfe.a(r4, r7)
            if (r8 == r0) goto L6c
        L46:
            r8 = r1
            fdcf r8 = (defpackage.fdcf) r8
            float r8 = r8.a
            r4 = 0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L2e
            dfj r8 = new dfj
            r8.<init>()
            fdpl r8 = defpackage.hsb.a(r8)
            dfk r4 = new dfk
            r5 = 0
            r4.<init>(r5)
            r7.e = r3
            r7.a = r1
            r5 = 2
            r7.b = r5
            java.lang.Object r8 = defpackage.fdtc.b(r8, r4, r7)
            if (r8 != r0) goto L2e
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dfl dflVar = new dfl(this.c, this.d, fcxyVar);
        dflVar.e = obj;
        return dflVar;
    }
}
