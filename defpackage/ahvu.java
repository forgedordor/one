package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvu extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ahwd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvu(ahwd ahwdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ahwdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r6 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.fctl.b(r6)
            goto L2a
        L11:
            defpackage.fctl.b(r6)
            goto L22
        L15:
            defpackage.fctl.b(r6)
            ahwd r6 = r5.d
            r5.c = r2
            java.lang.Object r6 = r6.k(r5)
            if (r6 == r0) goto L4e
        L22:
            ahwd r2 = r5.d
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r1 = r6.iterator()
        L2a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r1.next()
            ahto r6 = (defpackage.ahto) r6
            java.util.UUID r6 = r6.a
            aiaf r3 = defpackage.aiaf.WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN
            r5.a = r2
            r5.b = r1
            r4 = 2
            r5.c = r4
            r4 = r2
            ahwd r4 = (defpackage.ahwd) r4
            java.lang.Object r6 = r4.s(r6, r3, r5)
            if (r6 != r0) goto L2a
            goto L4e
        L4b:
            fctx r6 = defpackage.fctx.a
            return r6
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahvu(this.d, fcxyVar);
    }
}
