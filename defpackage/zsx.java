package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsx extends fcyz implements fdap {
    int a;
    final /* synthetic */ alff b;
    final /* synthetic */ ztv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsx(alff alffVar, ztv ztvVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = alffVar;
        this.c = ztvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r6 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r6 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r6)
            if (r1 == r3) goto L68
            if (r1 == r2) goto L4f
            goto L36
        L10:
            defpackage.fctl.b(r6)
            alff r6 = r5.b
            alfd r1 = r6.a()
            int r1 = r1.ordinal()
            switch(r1) {
                case 19: goto L56;
                case 20: goto L3d;
                case 21: goto L22;
                default: goto L20;
            }
        L20:
            r6 = 0
            goto L70
        L22:
            ztv r1 = r5.c
            aaab r2 = defpackage.aaab.b
            bbdo r6 = (defpackage.bbdo) r6
            java.lang.String r3 = r6.a
            java.lang.String r6 = r6.b
            r4 = 3
            r5.a = r4
            java.lang.Object r6 = r1.n(r2, r3, r6)
            if (r6 != r0) goto L36
            goto L6f
        L36:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L70
        L3d:
            ztv r1 = r5.c
            aaab r3 = defpackage.aaab.c
            bbdo r6 = (defpackage.bbdo) r6
            java.lang.String r4 = r6.a
            java.lang.String r6 = r6.b
            r5.a = r2
            java.lang.Object r6 = r1.n(r3, r4, r6)
            if (r6 == r0) goto L6f
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L70
        L56:
            ztv r1 = r5.c
            aaab r2 = defpackage.aaab.a
            bbdo r6 = (defpackage.bbdo) r6
            java.lang.String r4 = r6.a
            java.lang.String r6 = r6.b
            r5.a = r3
            java.lang.Object r6 = r1.n(r2, r4, r6)
            if (r6 == r0) goto L6f
        L68:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L70
        L6f:
            return r0
        L70:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new zsx(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
