package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckam extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckam(fcxy fcxyVar, ckbk ckbkVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckam) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r4 == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)
            goto L49
        Ld:
            java.lang.Object r1 = r3.c
            ckbk r1 = (defpackage.ckbk) r1
            defpackage.fctl.b(r4)
            goto L28
        L15:
            defpackage.fctl.b(r4)
            java.lang.Object r4 = r3.c
            fdjx r4 = (defpackage.fdjx) r4
            ckbk r1 = r3.b
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = r1.u(r3)
            if (r4 == r0) goto L56
        L28:
            ckce r4 = (defpackage.ckce) r4
            int r4 = r4.e
            ckbz r4 = defpackage.ckbz.b(r4)
            if (r4 != 0) goto L34
            ckbz r4 = defpackage.ckbz.TOGGLE_STATE_UNSPECIFIED
        L34:
            r4.getClass()
            r1.C(r4)
            ckbk r4 = r3.b
            r1 = 0
            r3.c = r1
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.u(r3)
            if (r4 != r0) goto L49
            goto L56
        L49:
            ckce r4 = (defpackage.ckce) r4
            int r4 = r4.e
            ckbz r4 = defpackage.ckbz.b(r4)
            if (r4 != 0) goto L55
            ckbz r4 = defpackage.ckbz.TOGGLE_STATE_UNSPECIFIED
        L55:
            return r4
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckam.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckam ckamVar = new ckam(fcxyVar, this.b);
        ckamVar.c = obj;
        return ckamVar;
    }
}
