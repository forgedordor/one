package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajbn extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajbo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbn(ajbo ajboVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajboVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajbn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r3) throws java.lang.Throwable {
        /*
            r2 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r2.a
            defpackage.fctl.b(r3)
            if (r1 == 0) goto La
            goto L30
        La:
            ajbo r3 = r2.b
            fcsu r3 = r3.b
            java.lang.Object r1 = r3.b()
            j$.util.Optional r1 = (j$.util.Optional) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5e
            java.lang.Object r3 = r3.b()
            j$.util.Optional r3 = (j$.util.Optional) r3
            java.lang.Object r3 = r3.get()
            ajbu r3 = (defpackage.ajbu) r3
            r1 = 1
            r2.a = r1
            java.lang.Object r3 = r3.a(r2)
            if (r3 != r0) goto L30
            return r0
        L30:
            efwo r3 = (defpackage.efwo) r3
            if (r3 == 0) goto L5e
            ajbo r0 = r2.b
            int r3 = r3.a()
            efwo r1 = r0.a
            int r1 = r1.a()
            if (r3 != r1) goto L5e
            fcsu r3 = r0.c
            java.lang.Object r3 = r3.b()
            java.util.Set r3 = (java.util.Set) r3
            java.util.Iterator r3 = r3.iterator()
        L4e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r3.next()
            ajbm r0 = (defpackage.ajbm) r0
            r0.a()
            goto L4e
        L5e:
            fctx r3 = defpackage.fctx.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajbn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajbn(this.b, fcxyVar);
    }
}
