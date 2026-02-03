package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkf extends fcyy implements fdat {
    int a;
    final /* synthetic */ dkh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkf(dkh dkhVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = dkhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkf) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r13 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r13 != r0) goto L9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0041 -> B:13:0x0044). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L13
            java.lang.Object r1 = r12.c
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r13)
            goto L44
        L13:
            java.lang.Object r1 = r12.c
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r13)
            goto L2d
        L1b:
            defpackage.fctl.b(r13)
            java.lang.Object r13 = r12.c
            r1 = r13
            ire r1 = (defpackage.ire) r1
            r12.c = r1
            r12.a = r4
            java.lang.Object r13 = defpackage.dzm.g(r1, r3, r12, r2)
            if (r13 == r0) goto Lab
        L2d:
            dkh r4 = r12.b
            ise r13 = (defpackage.ise) r13
            long r5 = r13.a
            r4.c = r5
            long r5 = r13.c
            r4.a = r5
        L39:
            r12.c = r1
            r12.a = r2
            java.lang.Object r13 = defpackage.ird.a(r1, r12)
            if (r13 != r0) goto L44
            goto Lab
        L44:
            irs r13 = (defpackage.irs) r13
            java.util.List r13 = r13.a
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r13.size()
            r4.<init>(r5)
            int r5 = r13.size()
            r6 = 0
            r7 = r6
        L57:
            if (r7 >= r5) goto L6a
            java.lang.Object r8 = r13.get(r7)
            r9 = r8
            ise r9 = (defpackage.ise) r9
            boolean r9 = r9.d
            if (r9 == 0) goto L67
            r4.add(r8)
        L67:
            int r7 = r7 + 1
            goto L57
        L6a:
            dkh r13 = r12.b
            int r5 = r4.size()
        L70:
            if (r6 >= r5) goto L87
            java.lang.Object r7 = r4.get(r6)
            r8 = r7
            ise r8 = (defpackage.ise) r8
            long r8 = r8.a
            long r10 = r13.c
            boolean r8 = defpackage.isd.b(r8, r10)
            if (r8 == 0) goto L84
            goto L88
        L84:
            int r6 = r6 + 1
            goto L70
        L87:
            r7 = r3
        L88:
            ise r7 = (defpackage.ise) r7
            if (r7 != 0) goto L93
            java.lang.Object r5 = defpackage.fcva.P(r4)
            r7 = r5
            ise r7 = (defpackage.ise) r7
        L93:
            if (r7 == 0) goto L9d
            long r5 = r7.a
            r13.c = r5
            long r5 = r7.c
            r13.a = r5
        L9d:
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto La4
            goto L39
        La4:
            r0 = -1
            r13.c = r0
            fctx r13 = defpackage.fctx.a
            return r13
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dkf dkfVar = new dkf(this.b, fcxyVar);
        dkfVar.c = obj;
        return dkfVar;
    }
}
