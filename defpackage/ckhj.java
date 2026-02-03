package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckhj extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ckhm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckhj(ckhm ckhmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ckhmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckhj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004f -> B:11:0x0052). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.fctl.b(r6)
            goto L52
        Le:
            defpackage.fctl.b(r6)
            eksp r6 = defpackage.ckhm.a
            ekrw r6 = r6.h()
            eksl r6 = (defpackage.eksl) r6
            java.lang.String r1 = "Scheduling config refresh from the debug menu."
            r6.q(r1)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            ckhm r1 = r5.d
            java.util.Set r1 = r1.g()
            java.util.Iterator r1 = r1.iterator()
            r2 = r6
        L2e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r1.next()
            dggn r6 = (defpackage.dggn) r6
            ckhm r3 = r5.d
            fcsu r3 = r3.c
            java.lang.Object r3 = r3.b()
            cmlb r3 = (defpackage.cmlb) r3
            r5.a = r2
            r5.b = r1
            r4 = 1
            r5.c = r4
            java.lang.Object r6 = r3.w(r6)
            if (r6 != r0) goto L52
            return r0
        L52:
            cmmh r6 = (defpackage.cmmh) r6
            if (r6 == 0) goto L2e
            java.lang.String r6 = r6.c
            if (r6 == 0) goto L2e
            r3 = r2
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r6)
            goto L2e
        L61:
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.util.Iterator r6 = r2.iterator()
            r6.getClass()
        L6a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r6.next()
            r0.getClass()
            ckhm r1 = r5.d
            java.lang.String r0 = (java.lang.String) r0
            fcsu r1 = r1.d
            java.lang.Object r1 = r1.b()
            ckhg r1 = (defpackage.ckhg) r1
            r1.g(r0)
            goto L6a
        L87:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckhj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckhj(this.d, fcxyVar);
    }
}
