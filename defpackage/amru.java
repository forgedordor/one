package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amru extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ amsc c;
    final /* synthetic */ Instant d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amru(amsc amscVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = amscVar;
        this.d = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amru) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r9 != r0) goto L17;
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
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 == r2) goto L11
            defpackage.fctl.b(r9)
            r7 = r8
            goto L79
        L11:
            java.lang.Object r1 = r8.a
            defpackage.fctl.b(r9)
            r4 = r1
            goto L4b
        L18:
            defpackage.fctl.b(r9)
            goto L32
        L1c:
            defpackage.fctl.b(r9)
            amsc r9 = r8.c
            anpj r9 = r9.d
            eiju r9 = r9.b()
            r9.getClass()
            r8.b = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto L8f
        L32:
            amsc r1 = r8.c
            ajts r9 = (defpackage.ajts) r9
            anpj r1 = r1.e
            eiju r1 = r1.b()
            r1.getClass()
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.fdxs.c(r1, r8)
            if (r1 == r0) goto L8f
            r4 = r9
            r9 = r1
        L4b:
            amsc r1 = r8.c
            r5 = r9
            amlm r5 = (defpackage.amlm) r5
            amss r9 = new amss
            r5.getClass()
            r4.getClass()
            r9.<init>(r5, r4)
            java.util.concurrent.atomic.AtomicReference r2 = r1.h
            r2.set(r9)
            j$.time.Instant r3 = r8.d
            cmpx r2 = defpackage.cmpx.ACTIVE
            r3.getClass()
            aoer r6 = r5.g()
            r9 = 0
            r8.a = r9
            r9 = 3
            r8.b = r9
            r7 = r8
            java.lang.Object r9 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L79
            goto L90
        L79:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            amsc r9 = r7.c
            r9.j()
        L86:
            amsc r9 = r7.c
            j$.time.Instant r0 = r7.d
            r9.f = r0
            fctx r9 = defpackage.fctx.a
            return r9
        L8f:
            r7 = r8
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amru.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amru(this.c, this.d, fcxyVar);
    }
}
