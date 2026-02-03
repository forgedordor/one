package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswp extends fcyz implements fdat {
    final /* synthetic */ List a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cswp(fcxy fcxyVar, List list) {
        super(2, fcxyVar);
        this.a = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cswp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.b
            fdjx r6 = (defpackage.fdjx) r6
            java.util.List r6 = r5.a
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L15
            goto L4e
        L15:
            java.util.Iterator r2 = r6.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r3
            alqm r4 = r3.g()
            boolean r4 = r4.A()
            if (r4 != 0) goto L73
            alqm r4 = r3.g()
            boolean r4 = r4.D()
            if (r4 != 0) goto L73
            alqm r4 = r3.g()
            boolean r4 = r4.E()
            if (r4 == 0) goto L73
            alqm r3 = r3.g()
            boolean r3 = r3.z()
            if (r3 == 0) goto L19
            goto L73
        L4e:
            r2 = 1
            if (r0 == 0) goto L59
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L59
        L57:
            r1 = r2
            goto L73
        L59:
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r0
            aobr r0 = r0.m()
            aobo r0 = (defpackage.aobo) r0
            boolean r0 = r0.a
            if (r0 != 0) goto L5d
        L73:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cswp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cswp cswpVar = new cswp(fcxyVar, this.a);
        cswpVar.b = obj;
        return cswpVar;
    }
}
