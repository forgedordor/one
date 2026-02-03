package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyls extends fcyz implements fdat {
    int a;
    final /* synthetic */ long b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyls(long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyls) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[PHI: r1
      0x002d: PHI (r1v3 fdpm) = (r1v4 fdpm), (r1v6 fdpm) binds: [B:9:0x002b, B:6:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0038 -> B:8:0x0021). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L11
            java.lang.Object r1 = r5.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r6)
            goto L21
        L11:
            java.lang.Object r1 = r5.c
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r6)
            goto L2d
        L19:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            fdpm r1 = (defpackage.fdpm) r1
        L21:
            fctx r6 = defpackage.fctx.a
            r5.c = r1
            r5.a = r2
            java.lang.Object r6 = r1.fO(r6, r5)
            if (r6 == r0) goto L3a
        L2d:
            r5.c = r1
            r6 = 2
            r5.a = r6
            long r3 = r5.b
            java.lang.Object r6 = defpackage.fdkj.d(r3, r5)
            if (r6 != r0) goto L21
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyls.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cyls cylsVar = new cyls(this.b, fcxyVar);
        cylsVar.c = obj;
        return cylsVar;
    }
}
