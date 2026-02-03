package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwfn extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwfo b;
    final /* synthetic */ ResolvedRecipient c;
    final /* synthetic */ chpq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwfn(cwfo cwfoVar, ResolvedRecipient resolvedRecipient, chpq chpqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwfoVar;
        this.c = resolvedRecipient;
        this.d = chpqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwfn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (defpackage.fdxs.c(r7, r6) == r0) goto L21;
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
            r2 = 2
            r3 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L36
            goto L4c
        Le:
            cwfo r7 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r6.c
            chpq r4 = r6.d
            anue r1 = r1.F()
            int r4 = r4.ordinal()
            if (r4 == r3) goto L21
            chpm r4 = defpackage.chpm.PREFER_PROFILE_PHOTO
            goto L23
        L21:
            chpm r4 = defpackage.chpm.PREFER_CONTACT_PHOTO
        L23:
            efwo r5 = r7.d
            anty r7 = r7.f
            eiju r7 = r7.F(r5, r1, r4)
            r7.getClass()
            r6.a = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L6f
        L36:
            cwfo r7 = r6.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = r6.c
            ajln r7 = r7.g
            eiju r7 = r7.v(r1)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 != r0) goto L4c
            goto L6f
        L4c:
            cwfo r7 = r6.b
            cwfa r0 = r7.m
            r0.a()
            chpq r0 = r6.d
            cwfk r7 = r7.l
            cwfo r7 = r7.c
            fcsu r7 = r7.h
            java.lang.Object r7 = r7.b()
            ains r7 = (defpackage.ains) r7
            chpq r1 = defpackage.chpq.PROFILE_PEOPLE_SHARING_SOURCE
            if (r0 != r1) goto L66
            goto L67
        L66:
            r2 = r3
        L67:
            java.lang.String r0 = "Bugle.PhotoSelector.Save.Selection.Count"
            r7.e(r0, r2)
            fctx r7 = defpackage.fctx.a
            return r7
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwfn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwfn(this.b, this.c, this.d, fcxyVar);
    }
}
