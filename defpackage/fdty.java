package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdty extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdax c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdty(fcxy fcxyVar, fdax fdaxVar) {
        super(3, fcxyVar);
        this.c = fdaxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdty fdtyVar = new fdty((fcxy) obj3, this.c);
        fdtyVar.d = (fdpm) obj;
        fdtyVar.b = (Object[]) obj2;
        return fdtyVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r1.fO(r12, r11) == r0) goto L14;
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
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Lf
            defpackage.fctl.b(r12)
            r10 = r11
            goto L43
        Lf:
            java.lang.Object r1 = r11.d
            defpackage.fctl.b(r12)
            r10 = r11
            goto L37
        L16:
            defpackage.fctl.b(r12)
            java.lang.Object r1 = r11.d
            java.lang.Object r12 = r11.b
            fdax r4 = r11.c
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            r5 = 0
            r5 = r12[r5]
            r6 = r12[r3]
            r7 = r12[r2]
            r8 = 3
            r8 = r12[r8]
            r9 = 4
            r9 = r12[r9]
            r11.a = r3
            r10 = r11
            java.lang.Object r12 = r4.a(r5, r6, r7, r8, r9, r10)
            if (r12 == r0) goto L46
        L37:
            r3 = 0
            r10.d = r3
            r10.a = r2
            java.lang.Object r12 = r1.fO(r12, r11)
            if (r12 != r0) goto L43
            goto L46
        L43:
            fctx r12 = defpackage.fctx.a
            return r12
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdty.b(java.lang.Object):java.lang.Object");
    }
}
