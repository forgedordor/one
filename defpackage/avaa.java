package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avaa extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdau c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avaa(fcxy fcxyVar, fdau fdauVar) {
        super(3, fcxyVar);
        this.c = fdauVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        avaa avaaVar = new avaa((fcxy) obj3, this.c);
        avaaVar.d = (fdpm) obj;
        avaaVar.b = (Object[]) obj2;
        return avaaVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1.fO(r6, r5) == r0) goto L14;
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
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L38
        Ld:
            java.lang.Object r1 = r5.d
            defpackage.fctl.b(r6)
            goto L2b
        L13:
            defpackage.fctl.b(r6)
            java.lang.Object r1 = r5.d
            java.lang.Object r6 = r5.b
            fdau r3 = r5.c
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r4 = 0
            r4 = r6[r4]
            r6 = r6[r2]
            r5.a = r2
            java.lang.Object r6 = r3.a(r4, r6, r5)
            if (r6 == r0) goto L3b
        L2b:
            r2 = 0
            r5.d = r2
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.fO(r6, r5)
            if (r6 != r0) goto L38
            goto L3b
        L38:
            fctx r6 = defpackage.fctx.a
            return r6
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avaa.b(java.lang.Object):java.lang.Object");
    }
}
