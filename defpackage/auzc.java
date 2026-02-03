package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auzc extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fday c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auzc(fcxy fcxyVar, fday fdayVar) {
        super(3, fcxyVar);
        this.c = fdayVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        auzc auzcVar = new auzc((fcxy) obj3, this.c);
        auzcVar.d = (fdpm) obj;
        auzcVar.b = (Object[]) obj2;
        return auzcVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r1.fO(r13, r12) == r0) goto L14;
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
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Lf
            defpackage.fctl.b(r13)
            r11 = r12
            goto L46
        Lf:
            java.lang.Object r1 = r12.d
            defpackage.fctl.b(r13)
            r11 = r12
            goto L3a
        L16:
            defpackage.fctl.b(r13)
            java.lang.Object r1 = r12.d
            java.lang.Object r13 = r12.b
            fday r4 = r12.c
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r5 = 0
            r5 = r13[r5]
            r6 = r13[r3]
            r7 = r13[r2]
            r8 = 3
            r8 = r13[r8]
            r9 = 4
            r9 = r13[r9]
            r10 = 5
            r10 = r13[r10]
            r12.a = r3
            r11 = r12
            java.lang.Object r13 = r4.h(r5, r6, r7, r8, r9, r10, r11)
            if (r13 == r0) goto L49
        L3a:
            r3 = 0
            r11.d = r3
            r11.a = r2
            java.lang.Object r13 = r1.fO(r13, r12)
            if (r13 != r0) goto L46
            goto L49
        L46:
            fctx r13 = defpackage.fctx.a
            return r13
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auzc.b(java.lang.Object):java.lang.Object");
    }
}
