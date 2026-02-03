package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftq extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajoy b;
    final /* synthetic */ aftr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftq(ajoy ajoyVar, aftr aftrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajoyVar;
        this.c = aftrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aftq) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r1.fO(r3, r9) == r0) goto L21;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.fctl.b(r10)
            goto L91
        Le:
            java.lang.Object r1 = r9.d
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r10)
            goto L31
        L16:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.d
            r1 = r10
            fdpm r1 = (defpackage.fdpm) r1
            ajoy r10 = r9.b
            eiju r10 = r10.c()
            r10.getClass()
            r9.d = r1
            r9.a = r2
            java.lang.Object r10 = defpackage.fdxs.c(r10, r9)
            if (r10 == r0) goto L94
        L31:
            ekgb r10 = (defpackage.ekgb) r10
            afts r3 = new afts
            ajov r4 = new ajov
            java.lang.String r5 = ""
            r6 = 0
            r4.<init>(r5, r6, r2)
            ekgb r2 = defpackage.ekgb.r(r4)
            r2.getClass()
            r10.getClass()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L81
            r4 = r2
            ekoe r4 = (defpackage.ekoe) r4
            int r4 = r4.c
            ekfw r5 = new ekfw
            r5.<init>()
            r5.j(r2)
            java.util.Iterator r10 = r10.iterator()
        L5e:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r10.next()
            ajov r2 = (defpackage.ajov) r2
            java.lang.String r6 = r2.a
            int r7 = r2.b
            int r7 = r7 + r4
            int r2 = r2.c
            ajov r8 = new ajov
            r8.<init>(r6, r7, r2)
            r5.h(r8)
            goto L5e
        L7a:
            ekgb r10 = r5.g()
            r10.getClass()
        L81:
            r3.<init>(r10)
            r10 = 0
            r9.d = r10
            r10 = 2
            r9.a = r10
            java.lang.Object r10 = r1.fO(r3, r9)
            if (r10 != r0) goto L91
            goto L94
        L91:
            fctx r10 = defpackage.fctx.a
            return r10
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aftq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aftq aftqVar = new aftq(this.b, this.c, fcxyVar);
        aftqVar.d = obj;
        return aftqVar;
    }
}
