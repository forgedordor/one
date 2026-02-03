package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xor extends fcyz implements fdat {
    int a;
    final /* synthetic */ xoy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xor(xoy xoyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xoyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xor) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (defpackage.fdxs.c(r4, r3) == r0) goto L13;
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
            goto L3c
        Ld:
            xoy r4 = r3.b
            r3.a = r2
            fdpl r4 = r4.h
            java.lang.Object r4 = defpackage.fdtc.a(r4, r3)
            if (r4 == r0) goto L3f
        L19:
            xoy r1 = r3.b
            fcsu r1 = r1.f
            ajlk r4 = (defpackage.ajlk) r4
            java.lang.Object r1 = r1.b()
            aknl r1 = (defpackage.aknl) r1
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r4.d()
            r4.getClass()
            asqe r2 = defpackage.asqe.HIDE
            eiju r4 = r1.L(r4, r2)
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 != r0) goto L3c
            goto L3f
        L3c:
            fctx r4 = defpackage.fctx.a
            return r4
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xor.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xor(this.b, fcxyVar);
    }
}
