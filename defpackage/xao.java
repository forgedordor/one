package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xao extends fcyz implements fdat {
    int a;
    final /* synthetic */ vvw b;
    final /* synthetic */ vto c;
    final /* synthetic */ xax d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xao(fcxy fcxyVar, vvw vvwVar, vto vtoVar, xax xaxVar) {
        super(2, fcxyVar);
        this.b = vvwVar;
        this.c = vtoVar;
        this.d = xaxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xao) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L11
            defpackage.fctl.b(r13)
            return r13
        L11:
            java.lang.Object r1 = r12.e
            fhaz r1 = (defpackage.fhaz) r1
            defpackage.fctl.b(r13)
            r9 = r1
            goto L9e
        L1b:
            defpackage.fctl.b(r13)
            goto L56
        L1f:
            defpackage.fctl.b(r13)
            java.lang.Object r13 = r12.e
            fdjx r13 = (defpackage.fdjx) r13
            ekrg r13 = defpackage.xax.a
            ekrw r13 = r13.f()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r5 = "BugleComposeRow2"
            r13.X(r1, r5)
            r1 = 66
            java.lang.String r5 = "DraftSendButtonClickHandler.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/DraftSendButtonClickHandler$onSendClickWithoutProcessing$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r7 = "invokeSuspend"
            ekrw r13 = r13.h(r6, r7, r1, r5)
            ekrd r13 = (defpackage.ekrd) r13
            vvw r1 = r12.b
            vto r5 = r12.c
            xax r6 = r12.d
            vwl r7 = r6.f
            java.lang.String r8 = "Starting DraftSendButtonClickHandler.onSendClickWithoutProcessing with %s, %s, %s"
            r13.I(r8, r1, r5, r7)
            r12.a = r3
            java.lang.Object r13 = r6.h(r1, r12)
            if (r13 == r0) goto Lc5
        L56:
            vvw r1 = r12.b
            fhaz r13 = (defpackage.fhaz) r13
            java.util.List r1 = r1.b
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L63
            goto L8e
        L63:
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r1.next()
            vvs r3 = (defpackage.vvs) r3
            boolean r5 = r3 instanceof defpackage.vvr
            if (r5 == 0) goto L7a
            vvr r3 = (defpackage.vvr) r3
            goto L7b
        L7a:
            r3 = r4
        L7b:
            if (r3 == 0) goto L80
            dltd r3 = r3.a
            goto L81
        L80:
            r3 = r4
        L81:
            boolean r3 = r3 instanceof com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation
            if (r3 != 0) goto L86
            goto L67
        L86:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onSendClickWithoutProcessing on draft does not support RichLocation"
            r13.<init>(r0)
            throw r13
        L8e:
            xax r1 = r12.d
            r12.e = r13
            r12.a = r2
            xbj r1 = r1.c
            java.lang.Object r1 = r1.a(r12)
            if (r1 == r0) goto Lc5
            r9 = r13
            r13 = r1
        L9e:
            r7 = r13
            vwv r7 = (defpackage.vwv) r7
            if (r7 != 0) goto La9
            r13 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        La9:
            xax r5 = r12.d
            vvw r6 = r12.b
            vto r8 = r12.c
            xbk r13 = r5.e
            vwl r1 = r5.f
            vwk r10 = r13.a(r1)
            r12.e = r4
            r13 = 3
            r12.a = r13
            r11 = r12
            java.lang.Object r13 = r5.d(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto Lc4
            goto Lc5
        Lc4:
            return r13
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xao.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xao xaoVar = new xao(fcxyVar, this.b, this.c, this.d);
        xaoVar.e = obj;
        return xaoVar;
    }
}
