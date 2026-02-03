package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osv extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ots c;
    final /* synthetic */ orr d;
    Object e;
    int f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osv(fcxy fcxyVar, ots otsVar, orr orrVar) {
        super(3, fcxyVar);
        this.c = otsVar;
        this.d = orrVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        osv osvVar = new osv((fcxy) obj3, this.c, this.d);
        osvVar.g = (fdpm) obj;
        osvVar.b = obj2;
        return osvVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (defpackage.fdpy.c(r5, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [fdpm] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto Le
            defpackage.fctl.b(r9)
            goto L94
        Le:
            int r1 = r8.f
            java.lang.Object r3 = r8.e
            java.lang.Object r4 = r8.b
            ott r4 = (defpackage.ott) r4
            java.lang.Object r5 = r8.g
            defpackage.fctl.b(r9)
            goto L3f
        L1c:
            defpackage.fctl.b(r9)
            java.lang.Object r5 = r8.g
            java.lang.Object r9 = r8.b
            java.lang.Number r9 = (java.lang.Number) r9
            int r1 = r9.intValue()
            ots r9 = r8.c
            r8.g = r5
            ott r4 = r9.h
            r8.b = r4
            feav r3 = r4.a
            r8.e = r3
            r8.f = r1
            r8.a = r2
            java.lang.Object r9 = r3.b(r8)
            if (r9 == r0) goto L9c
        L3f:
            otw r9 = r4.b     // Catch: java.lang.Throwable -> L97
            orz r9 = r9.j     // Catch: java.lang.Throwable -> L97
            orr r4 = r8.d     // Catch: java.lang.Throwable -> L97
            orp r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L97
            oro r7 = defpackage.oro.a     // Catch: java.lang.Throwable -> L97
            boolean r6 = defpackage.fdbq.f(r6, r7)     // Catch: java.lang.Throwable -> L97
            r7 = 0
            if (r6 == 0) goto L5d
            oqg[] r9 = new defpackage.oqg[r7]     // Catch: java.lang.Throwable -> L97
            fdpt r1 = new fdpt     // Catch: java.lang.Throwable -> L97
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L97
            r3.d()
            goto L83
        L5d:
            orp r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L97
            boolean r6 = r6 instanceof defpackage.orm     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L6a
            oro r6 = defpackage.oro.b     // Catch: java.lang.Throwable -> L97
            r9.d(r4, r6)     // Catch: java.lang.Throwable -> L97
        L6a:
            r3.d()
            ots r9 = r8.c
            oql r9 = r9.e
            fdpl r9 = r9.b(r4)
            if (r1 != 0) goto L78
            r2 = r7
        L78:
            fdrk r3 = new fdrk
            r3.<init>(r9, r2)
            ota r9 = new ota
            r9.<init>(r3, r1)
            r1 = r9
        L83:
            r9 = 0
            r8.g = r9
            r8.b = r9
            r8.e = r9
            r9 = 2
            r8.a = r9
            java.lang.Object r9 = defpackage.fdpy.c(r5, r1, r8)
            if (r9 != r0) goto L94
            goto L9c
        L94:
            fctx r9 = defpackage.fctx.a
            return r9
        L97:
            r9 = move-exception
            r3.d()
            throw r9
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osv.b(java.lang.Object):java.lang.Object");
    }
}
