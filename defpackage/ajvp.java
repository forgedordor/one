package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajvp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ajvq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajvp(ajvq ajvqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ajvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajvp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.fctl.b(r5)
            goto L43
        Lf:
            defpackage.fctl.b(r5)
            goto L29
        L13:
            defpackage.fctl.b(r5)
            ajvq r5 = r4.c
            anpj r5 = r5.a
            eiju r5 = r5.b()
            r5.getClass()
            r4.b = r2
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 == r0) goto L96
        L29:
            ajvq r1 = r4.c
            ajts r5 = (defpackage.ajts) r5
            anpj r1 = r1.b
            eiju r1 = r1.b()
            r1.getClass()
            r4.a = r5
            r2 = 2
            r4.b = r2
            java.lang.Object r1 = defpackage.fdxs.c(r1, r4)
            if (r1 == r0) goto L96
            r0 = r5
            r5 = r1
        L43:
            ekgb r5 = (defpackage.ekgb) r5
            int r1 = r0.A()
            boolean r1 = defpackage.bvdi.d(r1)
            if (r1 == 0) goto L92
            r5.getClass()
            r0.getClass()
            aoer r0 = r0.h()
            r1 = 0
            if (r0 == 0) goto L69
            j$.util.Optional r0 = r0.o()
            if (r0 == 0) goto L69
            java.lang.Object r0 = defpackage.fdct.b(r0)
            r1 = r0
            alqm r1 = (defpackage.alqm) r1
        L69:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L72:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r5.next()
            r3 = r2
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r3
            alqm r3 = r3.g()
            boolean r3 = defpackage.fdbq.f(r3, r1)
            if (r3 != 0) goto L72
            r0.add(r2)
            goto L72
        L8d:
            ekgb r5 = defpackage.ekfv.a(r0)
            return r5
        L92:
            r5.getClass()
            return r5
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajvp(this.c, fcxyVar);
    }
}
