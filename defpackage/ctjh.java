package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctjh extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ctjm d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjh(ctjm ctjmVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ctjmVar;
        this.e = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r2.a(r1, (defpackage.aoer) r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L42
        Ld:
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.fctl.b(r5)
            goto L31
        L15:
            defpackage.fctl.b(r5)
            ctjm r5 = r4.d
            java.util.List r1 = r4.e
            java.lang.Object r1 = defpackage.fcva.N(r1)
            alqm r1 = (defpackage.alqm) r1
            ctxf r3 = r5.c
            r4.a = r3
            r4.b = r1
            r4.c = r2
            java.lang.Object r5 = r5.e()
            if (r5 == r0) goto L45
            r2 = r3
        L31:
            aoer r5 = (defpackage.aoer) r5
            r3 = 0
            r4.a = r3
            r4.b = r3
            r3 = 2
            r4.c = r3
            java.lang.Object r5 = r2.a(r1, r5, r4)
            if (r5 != r0) goto L42
            goto L45
        L42:
            fctx r5 = defpackage.fctx.a
            return r5
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctjh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctjh(this.d, this.e, fcxyVar);
    }
}
