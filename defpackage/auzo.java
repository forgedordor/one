package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auzo extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdav c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auzo(fcxy fcxyVar, fdav fdavVar) {
        super(3, fcxyVar);
        this.c = fdavVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        auzo auzoVar = new auzo((fcxy) obj3, this.c);
        auzoVar.d = (fdpm) obj;
        auzoVar.b = (Object[]) obj2;
        return auzoVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r1.fO(r8, r7) == r0) goto L14;
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
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto Le
            defpackage.fctl.b(r8)
            goto L3a
        Le:
            java.lang.Object r1 = r7.d
            defpackage.fctl.b(r8)
            goto L2e
        L14:
            defpackage.fctl.b(r8)
            java.lang.Object r1 = r7.d
            java.lang.Object r8 = r7.b
            fdav r4 = r7.c
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r5 = 0
            r5 = r8[r5]
            r6 = r8[r3]
            r8 = r8[r2]
            r7.a = r3
            java.lang.Object r8 = r4.a(r5, r6, r8, r7)
            if (r8 == r0) goto L3d
        L2e:
            r3 = 0
            r7.d = r3
            r7.a = r2
            java.lang.Object r8 = r1.fO(r8, r7)
            if (r8 != r0) goto L3a
            goto L3d
        L3a:
            fctx r8 = defpackage.fctx.a
            return r8
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auzo.b(java.lang.Object):java.lang.Object");
    }
}
