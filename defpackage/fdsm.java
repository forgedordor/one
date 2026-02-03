package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdsm extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdsm(fdat fdatVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = fdatVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdsm fdsmVar = new fdsm(this.c, (fcxy) obj3);
        fdsmVar.d = (fdpm) obj;
        fdsmVar.b = obj2;
        return fdsmVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r1.fO(r5, r4) == r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [fdpm] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L31
        Ld:
            java.lang.Object r1 = r4.d
            defpackage.fctl.b(r5)
            goto L24
        L13:
            defpackage.fctl.b(r5)
            java.lang.Object r1 = r4.d
            java.lang.Object r5 = r4.b
            fdat r3 = r4.c
            r4.a = r2
            java.lang.Object r5 = r3.a(r5, r4)
            if (r5 == r0) goto L34
        L24:
            r2 = 0
            r4.d = r2
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.fO(r5, r4)
            if (r5 != r0) goto L31
            goto L34
        L31:
            fctx r5 = defpackage.fctx.a
            return r5
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdsm.b(java.lang.Object):java.lang.Object");
    }
}
