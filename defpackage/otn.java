package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otn extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ots d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otn(ots otsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = otsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otn) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r1.fO(r2, r4) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L57
        Ld:
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            java.lang.Object r3 = r4.e
            ott r3 = (defpackage.ott) r3
            defpackage.fctl.b(r5)
            goto L36
        L19:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.e
            r1 = r5
            fdpm r1 = (defpackage.fdpm) r1
            ots r5 = r4.d
            ott r3 = r5.h
            r4.e = r3
            feav r5 = r3.a
            r4.a = r5
            r4.b = r1
            r4.c = r2
            java.lang.Object r2 = r5.b(r4)
            if (r2 == r0) goto L5f
            r2 = r5
        L36:
            otw r5 = r3.b     // Catch: java.lang.Throwable -> L5a
            orz r5 = r5.j     // Catch: java.lang.Throwable -> L5a
            orq r5 = r5.b()     // Catch: java.lang.Throwable -> L5a
            r2.d()
            ose r2 = new ose
            r2.<init>(r5)
            r5 = 0
            r4.e = r5
            r4.a = r5
            r4.b = r5
            r5 = 2
            r4.c = r5
            java.lang.Object r5 = r1.fO(r2, r4)
            if (r5 != r0) goto L57
            goto L5f
        L57:
            fctx r5 = defpackage.fctx.a
            return r5
        L5a:
            r5 = move-exception
            r2.d()
            throw r5
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        otn otnVar = new otn(this.d, fcxyVar);
        otnVar.e = obj;
        return otnVar;
    }
}
