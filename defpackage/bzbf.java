package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbf extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bzbx c;
    final /* synthetic */ ekgb d;
    final /* synthetic */ Optional e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbf(bzbx bzbxVar, ekgb ekgbVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzbxVar;
        this.d = ekgbVar;
        this.e = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbf) c((ainv) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[LOOP:0: B:30:0x009f->B:32:0x00a5, LOOP_END] */
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
            r2 = 10
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1d
            if (r1 == r4) goto L16
            java.lang.Object r0 = r8.a
            defpackage.fctl.b(r9)
            goto L84
        L16:
            java.lang.Object r1 = r8.a
            defpackage.fctl.b(r9)
            r9 = r1
            goto L6b
        L1d:
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L21
            goto L35
        L21:
            r9 = move-exception
            goto L38
        L23:
            defpackage.fctl.b(r9)
            bzbx r9 = r8.c     // Catch: java.lang.Exception -> L21
            ekgb r1 = r8.d     // Catch: java.lang.Exception -> L21
            j$.util.Optional r6 = r8.e     // Catch: java.lang.Exception -> L21
            r8.b = r5     // Catch: java.lang.Exception -> L21
            java.lang.Object r9 = r9.e(r1, r6, r8)     // Catch: java.lang.Exception -> L21
            if (r9 != r0) goto L35
            goto L82
        L35:
            byhd r9 = (defpackage.byhd) r9     // Catch: java.lang.Exception -> L21
            return r9
        L38:
            bzbx r1 = r8.c
            ekgb r5 = r8.d
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = defpackage.fcva.p(r5, r2)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r5.next()
            byiv r7 = (defpackage.byiv) r7
            java.lang.String r7 = r7.e
            r7.getClass()
            r6.add(r7)
            goto L49
        L5e:
            bzgt r1 = r1.h
            r8.a = r9
            r8.b = r4
            java.lang.Object r1 = r1.g(r6, r3, r9, r8)
            if (r1 != r0) goto L6b
            goto L82
        L6b:
            bzbx r1 = r8.c
            bzbz r4 = r1.d()
            bzhh r5 = defpackage.bzhh.d
            r8.a = r9
            r8.b = r3
            bzhe r1 = r1.i
            r3 = r9
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r1 = r1.a(r3, r5, r4, r8)
            if (r1 != r0) goto L83
        L82:
            return r0
        L83:
            r0 = r9
        L84:
            bzbx r9 = r8.c
            ekgb r1 = r8.d
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r2 = defpackage.fcva.p(r1, r2)
            int r2 = defpackage.fcwa.a(r2)
            r4 = 16
            int r2 = defpackage.fddu.f(r2, r4)
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L9f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r1.next()
            r4 = r2
            byiv r4 = (defpackage.byiv) r4
            byqr r4 = new byqr
            r5 = r0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r4.<init>(r5)
            r3.put(r2, r4)
            goto L9f
        Lb8:
            int r9 = r9.g
            byhd r0 = new byhd
            r0.<init>(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzbf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzbf(this.c, this.d, this.e, fcxyVar);
    }
}
