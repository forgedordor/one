package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dorb b;
    final /* synthetic */ adhb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgz(fcxy fcxyVar, dorb dorbVar, adhb adhbVar) {
        super(2, fcxyVar);
        this.b = dorbVar;
        this.c = adhbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adgz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r4 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        return (defpackage.adik) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r4 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        return (defpackage.adik) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L15;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L3a
            goto L2b
        Ld:
            java.lang.Object r4 = r3.d
            fdjx r4 = (defpackage.fdjx) r4
            dorb r4 = r3.b
            int r4 = r4.ordinal()
            if (r4 == r2) goto L2e
            r1 = 2
            if (r4 == r1) goto L1e
            r4 = 0
            return r4
        L1e:
            adhb r4 = r3.c
            r3.a = r1
            adhu r4 = r4.a
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L2b
            goto L3d
        L2b:
            adik r4 = (defpackage.adik) r4
            return r4
        L2e:
            adhb r4 = r3.c
            r3.a = r2
            adhu r4 = r4.a
            java.lang.Object r4 = r4.f(r3)
            if (r4 == r0) goto L3d
        L3a:
            adik r4 = (defpackage.adik) r4
            return r4
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        adgz adgzVar = new adgz(fcxyVar, this.b, this.c);
        adgzVar.d = obj;
        return adgzVar;
    }
}
