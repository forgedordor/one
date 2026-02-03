package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdtw extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdaw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdtw(fcxy fcxyVar, fdaw fdawVar) {
        super(3, fcxyVar);
        this.c = fdawVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdtw fdtwVar = new fdtw((fcxy) obj3, this.c);
        fdtwVar.d = (fdpm) obj;
        fdtwVar.b = (Object[]) obj2;
        return fdtwVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r1.fO(r11, r10) == r0) goto L14;
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
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Lf
            defpackage.fctl.b(r11)
            r9 = r10
            goto L40
        Lf:
            java.lang.Object r1 = r10.d
            defpackage.fctl.b(r11)
            r9 = r10
            goto L34
        L16:
            defpackage.fctl.b(r11)
            java.lang.Object r1 = r10.d
            java.lang.Object r11 = r10.b
            fdaw r4 = r10.c
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            r5 = 0
            r5 = r11[r5]
            r6 = r11[r3]
            r7 = r11[r2]
            r8 = 3
            r8 = r11[r8]
            r10.a = r3
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r6, r7, r8, r9)
            if (r11 == r0) goto L43
        L34:
            r3 = 0
            r9.d = r3
            r9.a = r2
            java.lang.Object r11 = r1.fO(r11, r10)
            if (r11 != r0) goto L40
            goto L43
        L40:
            fctx r11 = defpackage.fctx.a
            return r11
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdtw.b(java.lang.Object):java.lang.Object");
    }
}
