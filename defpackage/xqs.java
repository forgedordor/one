package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqs extends fcyz implements fdat {
    int a;
    final /* synthetic */ xqu b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqs(xqu xquVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xquVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r5.f(r1, r2, defpackage.crwi.CONVERSATION_SUBSCRIPTION_STATE_UNSPECIFIED, r4) == r0) goto L13;
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
            if (r1 == r2) goto L1e
            goto L3a
        Ld:
            xqu r5 = r4.b
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.a = r2
            fduf r5 = r5.i
            java.lang.Object r5 = r5.fO(r1, r4)
            if (r5 == r0) goto L3d
        L1e:
            xqu r5 = r4.b
            fcsu r5 = r5.e
            java.lang.Object r5 = r5.b()
            crwr r5 = (defpackage.crwr) r5
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r4.c
            anue r1 = r1.F()
            crws r2 = defpackage.crws.HIDE
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = defpackage.crwr.g(r5, r1, r2, r4)
            if (r5 != r0) goto L3a
            goto L3d
        L3a:
            fctx r5 = defpackage.fctx.a
            return r5
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xqs(this.b, this.c, fcxyVar);
    }
}
