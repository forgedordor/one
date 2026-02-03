package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctji extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ctjm d;
    final /* synthetic */ List e;
    final /* synthetic */ ctrq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctji(ctjm ctjmVar, List list, ctrq ctrqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ctjmVar;
        this.e = list;
        this.f = ctrqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r1.b(r2, (defpackage.aoer) r9, r4, r5, r8) == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r9)
            goto L4c
        Ld:
            java.lang.Object r1 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.fctl.b(r9)
            r7 = r2
            r2 = r1
            r1 = r7
            goto L2f
        L18:
            defpackage.fctl.b(r9)
            ctjm r9 = r8.d
            java.util.List r1 = r8.e
            ctxf r3 = r9.c
            r8.a = r3
            r8.b = r1
            r8.c = r2
            java.lang.Object r9 = r9.e()
            if (r9 == r0) goto L4f
            r2 = r1
            r1 = r3
        L2f:
            ctrq r3 = r8.f
            aoer r9 = (defpackage.aoer) r9
            java.lang.String r4 = r3.b()
            android.net.Uri r5 = r3.a()
            r3 = 0
            r8.a = r3
            r8.b = r3
            r3 = 2
            r8.c = r3
            r6 = r8
            r3 = r9
            java.lang.Object r9 = r1.b(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4c
            goto L4f
        L4c:
            fctx r9 = defpackage.fctx.a
            return r9
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctji.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctji(this.d, this.e, this.f, fcxyVar);
    }
}
