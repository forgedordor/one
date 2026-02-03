package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auzw extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdba c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auzw(fcxy fcxyVar, fdba fdbaVar) {
        super(3, fcxyVar);
        this.c = fdbaVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        auzw auzwVar = new auzw((fcxy) obj3, this.c);
        auzwVar.d = (fdpm) obj;
        auzwVar.b = (Object[]) obj2;
        return auzwVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
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
            if (r1 == 0) goto L14
            if (r1 == r3) goto Le
            defpackage.fctl.b(r14)
            goto L74
        Le:
            java.lang.Object r1 = r13.d
            defpackage.fctl.b(r14)
            goto L68
        L14:
            defpackage.fctl.b(r14)
            java.lang.Object r1 = r13.d
            java.lang.Object r14 = r13.b
            fdba r4 = r13.c
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
            r12 = 7
            r14 = r14[r12]
            r13.a = r3
            ajlk r5 = (defpackage.ajlk) r5
            dihq r6 = (defpackage.dihq) r6
            dihq r7 = (defpackage.dihq) r7
            dihq r8 = (defpackage.dihq) r8
            dihq r9 = (defpackage.dihq) r9
            dihq r10 = (defpackage.dihq) r10
            dihq r11 = (defpackage.dihq) r11
            dihq r14 = (defpackage.dihq) r14
            cvwd r3 = new cvwd
            cvwd r4 = (defpackage.cvwd) r4
            cvwe r4 = r4.i
            r3.<init>(r4, r13)
            r3.a = r5
            r3.b = r6
            r3.c = r7
            r3.d = r8
            r3.e = r9
            r3.f = r10
            r3.g = r11
            r3.h = r14
            fctx r14 = defpackage.fctx.a
            java.lang.Object r14 = r3.b(r14)
            if (r14 == r0) goto L77
        L68:
            r3 = 0
            r13.d = r3
            r13.a = r2
            java.lang.Object r14 = r1.fO(r14, r13)
            if (r14 != r0) goto L74
            goto L77
        L74:
            fctx r14 = defpackage.fctx.a
            return r14
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auzw.b(java.lang.Object):java.lang.Object");
    }
}
