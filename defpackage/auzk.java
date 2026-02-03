package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auzk extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdaz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auzk(fcxy fcxyVar, fdaz fdazVar) {
        super(3, fcxyVar);
        this.c = fdazVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        auzk auzkVar = new auzk((fcxy) obj3, this.c);
        auzkVar.d = (fdpm) obj;
        auzkVar.b = (Object[]) obj2;
        return auzkVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r1.fO(r14, r13) == r0) goto L14;
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
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Lf
            defpackage.fctl.b(r14)
            r12 = r13
            goto L49
        Lf:
            java.lang.Object r1 = r13.d
            defpackage.fctl.b(r14)
            r12 = r13
            goto L3d
        L16:
            defpackage.fctl.b(r14)
            java.lang.Object r1 = r13.d
            java.lang.Object r14 = r13.b
            fdaz r4 = r13.c
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r5 = 0
            r5 = r14[r5]
            r6 = r14[r3]
            r7 = r14[r2]
            r8 = 3
            r8 = r14[r8]
            r9 = 4
            r9 = r14[r9]
            r10 = 5
            r10 = r14[r10]
            r11 = 6
            r11 = r14[r11]
            r13.a = r3
            r12 = r13
            java.lang.Object r14 = r4.j(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 == r0) goto L4c
        L3d:
            r3 = 0
            r12.d = r3
            r12.a = r2
            java.lang.Object r14 = r1.fO(r14, r13)
            if (r14 != r0) goto L49
            goto L4c
        L49:
            fctx r14 = defpackage.fctx.a
            return r14
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auzk.b(java.lang.Object):java.lang.Object");
    }
}
