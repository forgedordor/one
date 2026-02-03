package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akgp extends fcyz implements fdat {
    int a;
    final /* synthetic */ akgw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akgp(akgw akgwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akgwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akgp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r4 == r0) goto L17;
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
            if (r1 == r2) goto L19
            goto L30
        Ld:
            akgw r4 = r3.b
            r3.a = r2
            fdap r4 = r4.e
            java.lang.Object r4 = r4.invoke(r3)
            if (r4 == r0) goto L35
        L19:
            awpx r4 = (defpackage.awpx) r4
            if (r4 != 0) goto L22
            j$.util.Optional r4 = j$.util.Optional.empty()
            return r4
        L22:
            akgw r1 = r3.b
            r2 = 2
            r3.a = r2
            awnf r1 = r1.d
            java.lang.Object r4 = r1.h(r4, r3)
            if (r4 != r0) goto L30
            goto L35
        L30:
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            return r4
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akgp(this.b, fcxyVar);
    }
}
