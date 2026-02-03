package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzdn extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzds b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzdn(bzds bzdsVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzdsVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzdn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (defpackage.fdxs.c(r5, r4) == r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1d
            goto L43
        Ld:
            bzds r5 = r4.b
            aurx r5 = r5.c
            eiju r5 = r5.s()
            r4.a = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L46
        L1d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L43
            bzds r5 = r4.b
            java.util.List r1 = r4.c
            int r1 = r1.size()
            long r1 = (long) r1
            auqz r3 = new auqz
            aurx r5 = r5.c
            r3.<init>()
            eiju r5 = r5.z(r3)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L43
            goto L46
        L43:
            fctx r5 = defpackage.fctx.a
            return r5
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzdn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzdn(this.b, this.c, fcxyVar);
    }
}
