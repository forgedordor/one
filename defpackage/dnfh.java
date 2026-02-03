package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfh extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnfr b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfh(dnfr dnfrVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnfrVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r6.i.fO(r1, r5) == r0) goto L13;
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
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L4d
            goto L5d
        Ld:
            ecnr r6 = defpackage.dnfe.a
            dnfr r6 = r5.b
            java.lang.Object r1 = r5.c
            dnea r3 = r6.e
            fdap r3 = r3.b
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            ecnw r3 = new ecnw
            r3.<init>()
            java.lang.String r4 = "\n          DELETE FROM `usages`\n          WHERE `type` = ? AND `value` = ?\n          "
            r3.b(r4)
            java.lang.String r4 = r6.f
            r3.d(r4)
            r3.d(r1)
            ecnv r1 = r3.a()
            fcsu r6 = r6.b
            java.lang.Object r6 = r6.b()
            ecmd r6 = (defpackage.ecmd) r6
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r1)
            r6.getClass()
            r5.a = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L60
        L4d:
            dnfr r6 = r5.b
            java.lang.Object r1 = r5.c
            r2 = 2
            r5.a = r2
            fdue r6 = r6.i
            java.lang.Object r6 = r6.fO(r1, r5)
            if (r6 != r0) goto L5d
            goto L60
        L5d:
            fctx r6 = defpackage.fctx.a
            return r6
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnfh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnfh(this.b, this.c, fcxyVar);
    }
}
