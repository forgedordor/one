package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkt extends fcyz implements fdat {
    int a;
    final /* synthetic */ tku b;
    final /* synthetic */ cpkh c;
    final /* synthetic */ ResolvedRecipient d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkt(tku tkuVar, cpkh cpkhVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tkuVar;
        this.c = cpkhVar;
        this.d = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tkt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r8.g.a(r2, (java.lang.Boolean) r1.a, (java.lang.Boolean) r4, null, r7) == r0) goto L22;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L7a
        Ld:
            tku r8 = r7.b
            fcsu r8 = r8.d
            java.lang.Object r8 = r8.b()
            cpjw r8 = (defpackage.cpjw) r8
            cpkh r1 = r7.c
            r7.a = r2
            java.lang.Object r8 = r8.c(r1, r7)
            if (r8 == r0) goto L7d
        L21:
            cpkh r8 = r7.c
            java.lang.Boolean r1 = r8.b
            r1.getClass()
            java.lang.Boolean r8 = r8.a
            boolean r3 = r1.booleanValue()
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = defpackage.fdbq.f(r8, r4)
            r6 = 0
            if (r5 == 0) goto L42
            if (r3 == 0) goto L42
            fcti r1 = new fcti
            r1.<init>(r8, r6)
            goto L56
        L42:
            boolean r5 = defpackage.fdbq.f(r8, r4)
            if (r5 == 0) goto L50
            if (r3 != 0) goto L50
            fcti r1 = new fcti
            r1.<init>(r8, r4)
            goto L56
        L50:
            fcti r8 = new fcti
            r8.<init>(r6, r1)
            r1 = r8
        L56:
            tku r8 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = r7.d
            java.lang.Object r4 = r1.b
            java.lang.Object r1 = r1.a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            alqm r3 = r3.g()
            alqj r2 = r3.G(r2)
            java.lang.String r2 = r2.toString()
            r3 = 2
            r7.a = r3
            tiy r8 = r8.g
            java.lang.Object r8 = defpackage.tit.a(r8, r2, r1, r4, r7)
            if (r8 != r0) goto L7a
            goto L7d
        L7a:
            fctx r8 = defpackage.fctx.a
            return r8
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tkt(this.b, this.c, this.d, fcxyVar);
    }
}
