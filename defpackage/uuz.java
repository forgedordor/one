package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uuz extends fcyz implements fdat {
    int a;
    final /* synthetic */ uva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuz(uva uvaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = uvaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uuz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return (defpackage.agqo) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r8 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        return (defpackage.agqo) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L93
            goto L3b
        Ld:
            cczi r8 = defpackage.crbf.bd
            java.lang.Object r1 = r8.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 0
            r4 = 2
            if (r1 != 0) goto L3e
            cczi r1 = defpackage.crbf.ba
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2c
            goto L3e
        L2c:
            uva r8 = r7.b
            r7.a = r4
            agqq r8 = r8.a
            r1 = 0
            r2 = 3
            java.lang.Object r8 = defpackage.agqm.a(r8, r1, r3, r7, r2)
            if (r8 != r0) goto L3b
            goto L96
        L3b:
            agqo r8 = (defpackage.agqo) r8
            return r8
        L3e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cczi r5 = defpackage.crbf.ba
            java.lang.Object r5 = r5.e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L66
            cczi r5 = defpackage.crbf.bb
            java.lang.Object r5 = r5.e()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            int r5 = (int) r5
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            r1.add(r6)
        L66:
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L87
            cczi r8 = defpackage.crbf.be
            java.lang.Object r8 = r8.e()
            java.lang.Number r8 = (java.lang.Number) r8
            long r5 = r8.longValue()
            int r8 = (int) r5
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            r1.add(r5)
        L87:
            uva r8 = r7.b
            r7.a = r2
            agqq r8 = r8.a
            java.lang.Object r8 = defpackage.agqm.a(r8, r1, r3, r7, r4)
            if (r8 == r0) goto L96
        L93:
            agqo r8 = (defpackage.agqo) r8
            return r8
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uuz(this.b, fcxyVar);
    }
}
