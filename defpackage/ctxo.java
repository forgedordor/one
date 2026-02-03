package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxo extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdce c;
    final /* synthetic */ ctxr d;
    final /* synthetic */ fdce e;
    final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctxo(fdce fdceVar, ctxr ctxrVar, fdce fdceVar2, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdceVar;
        this.d = ctxrVar;
        this.e = fdceVar2;
        this.f = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctxo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto L11
            java.lang.Object r0 = r6.a
            defpackage.fctl.b(r7)
            goto L7b
        L11:
            java.lang.Object r0 = r6.a
            defpackage.fctl.b(r7)
            goto L3a
        L17:
            defpackage.fctl.b(r7)
            fdce r7 = r6.c
            ctxr r1 = r6.d
            ards r4 = r1.i
            boolean r4 = r4.a()
            if (r4 == 0) goto L47
            fdce r4 = r6.e
            boolean r4 = r4.a
            if (r4 == 0) goto L45
            java.util.List r4 = r6.f
            r6.a = r7
            r6.b = r3
            java.lang.Object r1 = r1.d(r4, r6)
            if (r1 == r0) goto L94
            r0 = r7
            r7 = r1
        L3a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L44
        L42:
            r2 = r3
            goto L8d
        L44:
            r7 = r0
        L45:
            r0 = r7
            goto L8d
        L47:
            java.util.List r1 = r6.f
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.fcva.p(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r1.next()
            ctxe r5 = (defpackage.ctxe) r5
            eiju r5 = r5.b
            fdkf r5 = defpackage.auvw.e(r5)
            r4.add(r5)
            goto L58
        L6e:
            r6.a = r7
            r1 = 2
            r6.b = r1
            java.lang.Object r1 = defpackage.fdii.a(r4, r6)
            if (r1 == r0) goto L94
            r0 = r7
            r7 = r1
        L7b:
            java.util.List r7 = (java.util.List) r7
            defpackage.ctxg.b(r7)
            fdce r1 = r6.e
            boolean r1 = r1.a
            if (r1 == 0) goto L8d
            boolean r7 = defpackage.ctxg.a(r7)
            if (r7 == 0) goto L8d
            goto L42
        L8d:
            fdce r0 = (defpackage.fdce) r0
            r0.a = r2
            fctx r7 = defpackage.fctx.a
            return r7
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctxo(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
