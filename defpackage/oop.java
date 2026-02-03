package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oop extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ooq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oop(ooq ooqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ooqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oop) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L13
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.d
            fdpm r2 = (defpackage.fdpm) r2
            defpackage.fctl.b(r5)
            goto L40
        L13:
            java.lang.Object r1 = r4.d
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r5)
            r2 = r1
            goto L33
        L1c:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.d
            fdpm r5 = (defpackage.fdpm) r5
            ooq r1 = r4.c
            r4.d = r5
            r4.b = r2
            opv r1 = r1.a
            java.lang.Object r1 = r1.a(r4)
            if (r1 == r0) goto L5d
            r2 = r5
            r5 = r1
        L33:
            ooq r1 = r4.c
            java.util.List r5 = (java.util.List) r5
            fdlr r1 = r1.d
            r1.z()
            java.util.Iterator r1 = r5.iterator()
        L40:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r1.next()
            fcvv r5 = (defpackage.fcvv) r5
            r4.d = r2
            r4.a = r1
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r2.fO(r5, r4)
            if (r5 != r0) goto L40
            goto L5d
        L5a:
            fctx r5 = defpackage.fctx.a
            return r5
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oop.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        oop oopVar = new oop(this.c, fcxyVar);
        oopVar.d = obj;
        return oopVar;
    }
}
