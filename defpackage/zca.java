package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zca extends fcyz implements fdat {
    int a;
    final /* synthetic */ zcb b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zca(zcb zcbVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zcbVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zca) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r6 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r6 == r0) goto L20;
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
            if (r1 == 0) goto Le
            if (r1 == r2) goto L68
            goto L8a
        Le:
            zcb r6 = r5.b
            apwf r1 = r6.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L6b
            ajlt r1 = r5.c
            boolean r3 = r1 instanceof defpackage.ytm
            if (r3 == 0) goto L45
            ytm r1 = (defpackage.ytm) r1
            java.util.List r1 = r1.a
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.fcva.p(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            ajlt r4 = (defpackage.ajlt) r4
            com.google.android.apps.messaging.shared.api.messaging.MessageId r4 = r4.b()
            r3.add(r4)
            goto L31
        L45:
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r1.b()
            java.util.List r3 = defpackage.fcva.b(r1)
        L4d:
            fcsu r6 = r6.a
            java.lang.Object r6 = r6.b()
            ajmh r6 = (defpackage.ajmh) r6
            ekgb r1 = defpackage.ekfv.a(r3)
            eiju r6 = r6.p(r1)
            r6.getClass()
            r5.a = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L89
        L68:
            java.lang.Void r6 = (java.lang.Void) r6
            goto L8c
        L6b:
            fcsu r6 = r6.a
            java.lang.Object r6 = r6.b()
            ajmh r6 = (defpackage.ajmh) r6
            ajlt r1 = r5.c
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r1.b()
            eiju r6 = r6.o(r1)
            r6.getClass()
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 != r0) goto L8a
        L89:
            return r0
        L8a:
            java.lang.Void r6 = (java.lang.Void) r6
        L8c:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zca.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zca(this.b, this.c, fcxyVar);
    }
}
