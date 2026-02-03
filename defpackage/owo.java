package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owo extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdpm c;
    final /* synthetic */ fdat d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owo(fdpm fdpmVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdpmVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((owo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:8:0x003b). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.e
            fdlr r3 = (defpackage.fdlr) r3
            defpackage.fctl.b(r7)
            goto L3b
        L13:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.e
            fdlr r3 = (defpackage.fdlr) r3
            defpackage.fctl.b(r7)
            goto L47
        L1d:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.e
            fdjx r7 = (defpackage.fdjx) r7
            r1 = 6
            r3 = 0
            fdoa r1 = defpackage.fdod.a(r3, r3, r1)
            fdat r3 = r6.d
            own r4 = new own
            r5 = 0
            r4.<init>(r1, r3, r5)
            r3 = 3
            fdlr r3 = defpackage.fdil.d(r7, r5, r5, r4, r3)
            fdoc r1 = r1.r()
        L3b:
            r6.e = r3
            r6.a = r1
            r6.b = r2
            java.lang.Object r7 = r1.a(r6)
            if (r7 == r0) goto L69
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r1.b()
            fdpm r4 = r6.c
            r6.e = r3
            r6.a = r1
            r5 = 2
            r6.b = r5
            java.lang.Object r7 = r4.fO(r7, r6)
            if (r7 != r0) goto L3b
            goto L69
        L63:
            defpackage.fdlp.a(r3)
            fctx r7 = defpackage.fctx.a
            return r7
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        owo owoVar = new owo(this.c, this.d, fcxyVar);
        owoVar.e = obj;
        return owoVar;
    }
}
