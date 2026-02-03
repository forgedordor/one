package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxse extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxsg b;
    final /* synthetic */ Set c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxse(bxsg bxsgVar, Set set, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bxsgVar;
        this.c = set;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxse) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (defpackage.fdii.a(r0, r13) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[LOOP:0: B:32:0x0098->B:34:0x009e, LOOP_END] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r1 = defpackage.fcyl.a
            int r0 = r13.a
            r2 = 10
            r3 = 2
            r4 = 3
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L31
            if (r0 == r5) goto L22
            if (r0 == r3) goto L15
            defpackage.fctl.b(r14)
            goto Lbe
        L15:
            java.lang.Object r0 = r13.e
            r3 = r0
            fdjx r3 = (defpackage.fdjx) r3
            defpackage.fctl.b(r14)     // Catch: java.lang.Exception -> L1e
            goto L7d
        L1e:
            r0 = move-exception
            r14 = r0
            r11 = r14
            goto L85
        L22:
            java.lang.Object r0 = r13.e
            r7 = r0
            fdjx r7 = (defpackage.fdjx) r7
            defpackage.fctl.b(r14)     // Catch: java.lang.Exception -> L2c
            r14 = r7
            goto L46
        L2c:
            r0 = move-exception
            r14 = r0
            r11 = r14
            r3 = r7
            goto L85
        L31:
            defpackage.fctl.b(r14)
            java.lang.Object r14 = r13.e
            fdjx r14 = (defpackage.fdjx) r14
            bxsg r0 = r13.b     // Catch: java.lang.Exception -> L82
            java.util.Set r7 = r13.c     // Catch: java.lang.Exception -> L82
            r13.e = r14     // Catch: java.lang.Exception -> L82
            r13.a = r5     // Catch: java.lang.Exception -> L82
            java.lang.Object r0 = r0.e(r7, r13)     // Catch: java.lang.Exception -> L82
            if (r0 == r1) goto Lbd
        L46:
            java.util.Set r0 = r13.c     // Catch: java.lang.Exception -> L82
            bxsg r7 = r13.b     // Catch: java.lang.Exception -> L82
            int r8 = r13.d     // Catch: java.lang.Exception -> L82
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L82
            int r10 = defpackage.fcva.p(r0, r2)     // Catch: java.lang.Exception -> L82
            r9.<init>(r10)     // Catch: java.lang.Exception -> L82
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L82
        L59:
            boolean r10 = r0.hasNext()     // Catch: java.lang.Exception -> L82
            if (r10 == 0) goto L72
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Exception -> L82
            esal r10 = (defpackage.esal) r10     // Catch: java.lang.Exception -> L82
            bxsc r11 = new bxsc     // Catch: java.lang.Exception -> L82
            r11.<init>(r7, r10, r8, r6)     // Catch: java.lang.Exception -> L82
            fdkf r10 = defpackage.fdil.c(r14, r6, r11, r4)     // Catch: java.lang.Exception -> L82
            r9.add(r10)     // Catch: java.lang.Exception -> L82
            goto L59
        L72:
            r13.e = r14     // Catch: java.lang.Exception -> L82
            r13.a = r3     // Catch: java.lang.Exception -> L82
            java.lang.Object r0 = defpackage.fdii.a(r9, r13)     // Catch: java.lang.Exception -> L82
            if (r0 == r1) goto Lbd
            r3 = r14
        L7d:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L1e
            return r14
        L82:
            r0 = move-exception
            r3 = r14
            r11 = r0
        L85:
            java.util.Set r14 = r13.c
            bxsg r8 = r13.b
            int r10 = r13.d
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = defpackage.fcva.p(r14, r2)
            r0.<init>(r2)
            java.util.Iterator r14 = r14.iterator()
        L98:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r14.next()
            r9 = r2
            esal r9 = (defpackage.esal) r9
            bxsd r7 = new bxsd
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            fdkf r2 = defpackage.fdil.c(r3, r6, r7, r4)
            r0.add(r2)
            goto L98
        Lb3:
            r13.e = r6
            r13.a = r4
            java.lang.Object r14 = defpackage.fdii.a(r0, r13)
            if (r14 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            r14 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxse.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxse bxseVar = new bxse(this.b, this.c, this.d, fcxyVar);
        bxseVar.e = obj;
        return bxseVar;
    }
}
