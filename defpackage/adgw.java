package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dorb b;
    final /* synthetic */ adhb c;
    final /* synthetic */ adik d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgw(fcxy fcxyVar, dorb dorbVar, adhb adhbVar, adik adikVar) {
        super(2, fcxyVar);
        this.b = dorbVar;
        this.c = adhbVar;
        this.d = adikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adgw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r4.a.d(r2, r3) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4.a.e(r1, r3) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Lb
            goto L39
        Lb:
            java.lang.Object r4 = r3.e
            fdjx r4 = (defpackage.fdjx) r4
            dorb r4 = r3.b
            int r4 = r4.ordinal()
            if (r4 == r2) goto L2a
            r1 = 2
            if (r4 == r1) goto L1b
            goto L39
        L1b:
            adhb r4 = r3.c
            adik r2 = r3.d
            r3.a = r1
            adhu r4 = r4.a
            java.lang.Object r4 = r4.d(r2, r3)
            if (r4 != r0) goto L39
            goto L38
        L2a:
            adhb r4 = r3.c
            adik r1 = r3.d
            r3.a = r2
            adhu r4 = r4.a
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 != r0) goto L39
        L38:
            return r0
        L39:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        adgw adgwVar = new adgw(fcxyVar, this.b, this.c, this.d);
        adgwVar.e = obj;
        return adgwVar;
    }
}
