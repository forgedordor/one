package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akly extends fcyz implements fdat {
    int a;
    final /* synthetic */ aklz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akly(aklz aklzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aklzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akly) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            if (r1 == r2) goto L17
            goto L30
        Ld:
            aklz r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L34
        L17:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r4 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r4
            if (r4 != 0) goto L1e
            fcvo r4 = defpackage.fcvo.a
            return r4
        L1e:
            cdfg r4 = r4.j()
            eiju r4 = r4.d()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 != r0) goto L30
            goto L34
        L30:
            r4.getClass()
            return r4
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akly.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akly(this.b, fcxyVar);
    }
}
