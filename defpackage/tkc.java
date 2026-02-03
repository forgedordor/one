package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkc extends fcyz implements fdat {
    int a;
    final /* synthetic */ tkd b;
    final /* synthetic */ cpkh c;
    final /* synthetic */ ResolvedRecipient d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkc(tkd tkdVar, cpkh cpkhVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tkdVar;
        this.c = cpkhVar;
        this.d = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tkc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r7.g.a(r2, (java.lang.Boolean) r1.a, (java.lang.Boolean) r4, null, r6) == r0) goto L26;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L22
            goto L80
        Le:
            tkd r7 = r6.b
            fcsu r7 = r7.d
            java.lang.Object r7 = r7.b()
            cpjw r7 = (defpackage.cpjw) r7
            cpkh r1 = r6.c
            r6.a = r2
            java.lang.Object r7 = r7.c(r1, r6)
            if (r7 == r0) goto L83
        L22:
            cpkh r7 = r6.c
            java.lang.Boolean r1 = r7.b
            r3 = 0
            if (r1 == 0) goto L2e
            boolean r1 = r1.booleanValue()
            goto L2f
        L2e:
            r1 = r3
        L2f:
            java.lang.Boolean r7 = r7.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r4 = defpackage.fdbq.f(r7, r3)
            r5 = 0
            if (r4 == 0) goto L44
            if (r1 == 0) goto L44
            fcti r1 = new fcti
            r1.<init>(r7, r5)
            goto L5c
        L44:
            boolean r4 = defpackage.fdbq.f(r7, r3)
            if (r4 == 0) goto L52
            if (r1 != 0) goto L52
            fcti r1 = new fcti
            r1.<init>(r7, r3)
            goto L5c
        L52:
            fcti r7 = new fcti
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.<init>(r5, r1)
            r1 = r7
        L5c:
            tkd r7 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = r6.d
            java.lang.Object r4 = r1.b
            java.lang.Object r1 = r1.a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            alqm r3 = r3.g()
            alqj r2 = r3.G(r2)
            java.lang.String r2 = r2.toString()
            r3 = 2
            r6.a = r3
            tiy r7 = r7.g
            java.lang.Object r7 = defpackage.tit.a(r7, r2, r1, r4, r6)
            if (r7 != r0) goto L80
            goto L83
        L80:
            fctx r7 = defpackage.fctx.a
            return r7
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tkc(this.b, this.c, this.d, fcxyVar);
    }
}
