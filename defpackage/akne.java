package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akne extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ aknj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akne(aknj aknjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aknjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akne) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L17
            java.lang.Object r0 = r10.a
            java.lang.Object r1 = r10.d
            ajts r1 = (defpackage.ajts) r1
            defpackage.fctl.b(r11)
            goto L9c
        L17:
            java.lang.Object r1 = r10.d
            ajts r1 = (defpackage.ajts) r1
            defpackage.fctl.b(r11)
            goto L68
        L1f:
            java.lang.Object r1 = r10.d
            fdkf r1 = (defpackage.fdkf) r1
            defpackage.fctl.b(r11)
            goto L59
        L27:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.d
            fdjx r11 = (defpackage.fdjx) r11
            aknj r1 = r10.c
            fcyi r4 = defpackage.fcyi.a
            fdjz r5 = defpackage.fdjz.a
            fcyh r6 = defpackage.eicg.a(r4)
            aknc r7 = new aknc
            r8 = 0
            r7.<init>(r8, r1)
            fdkf r6 = defpackage.fdin.b(r11, r6, r5, r7)
            fcyh r4 = defpackage.eicg.a(r4)
            aknd r7 = new aknd
            r7.<init>(r8, r1)
            fdkf r1 = defpackage.fdin.b(r11, r4, r5, r7)
            r10.d = r1
            r10.b = r3
            java.lang.Object r11 = r6.c(r10)
            if (r11 == r0) goto Lda
        L59:
            ajts r11 = (defpackage.ajts) r11
            r10.d = r11
            r10.b = r2
            java.lang.Object r1 = r1.c(r10)
            if (r1 == r0) goto Lda
            r9 = r1
            r1 = r11
            r11 = r9
        L68:
            asqe r11 = (defpackage.asqe) r11
            boolean r2 = r1.z()
            if (r2 == 0) goto L7e
            akmb r0 = new akmb
            r1.getClass()
            r11.getClass()
            cgrc r2 = defpackage.cgrc.a
            r0.<init>(r1, r11, r2)
            return r0
        L7e:
            aknj r2 = r10.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r2 = r2.d
            anpj r2 = r2.i()
            eiju r2 = r2.b()
            r2.getClass()
            r10.d = r1
            r10.a = r11
            r3 = 3
            r10.b = r3
            java.lang.Object r2 = defpackage.fdxs.c(r2, r10)
            if (r2 == r0) goto Lda
            r0 = r11
            r11 = r2
        L9c:
            aknj r2 = r10.c
            ekgb r11 = (defpackage.ekgb) r11
            fcsu r2 = r2.c
            java.lang.Object r2 = r2.b()
            ewto r2 = (defpackage.ewto) r2
            evtg r2 = r2.b
            r3 = 0
            java.lang.Object r11 = r11.get(r3)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r11 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r11
            alqm r11 = r11.g()
            j$.util.Optional r11 = r11.e()
            java.lang.Object r11 = r11.get()
            aubq r11 = (defpackage.aubq) r11
            java.lang.String r11 = r11.d
            boolean r11 = r2.contains(r11)
            if (r11 == 0) goto Lca
            cgrc r11 = defpackage.cgrc.e
            goto Lcc
        Lca:
            cgrc r11 = defpackage.cgrc.a
        Lcc:
            akmb r2 = new akmb
            r1.getClass()
            r0.getClass()
            asqe r0 = (defpackage.asqe) r0
            r2.<init>(r1, r0, r11)
            return r2
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akne.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akne akneVar = new akne(this.c, fcxyVar);
        akneVar.d = obj;
        return akneVar;
    }
}
