package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wom extends fcyz implements fdat {
    int a;
    final /* synthetic */ wor b;
    final /* synthetic */ vvr c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wom(fcxy fcxyVar, wor worVar, vvr vvrVar, boolean z) {
        super(2, fcxyVar);
        this.b = worVar;
        this.c = vvrVar;
        this.d = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wom) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r8.c(r1) == r0) goto L25;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L12
            defpackage.fctl.b(r8)
            if (r1 == r3) goto L31
            if (r1 == r2) goto L11
            goto L8f
        L11:
            return r8
        L12:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.e
            fdjx r8 = (defpackage.fdjx) r8
            wor r8 = r7.b
            r7.a = r3
            aptx r1 = r8.d
            boolean r1 = r1.a()
            if (r1 == 0) goto L2a
            java.lang.Object r8 = r8.h(r7)
            goto L2f
        L2a:
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        L2f:
            if (r8 == r0) goto L92
        L31:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl$process$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "BugleComposeRow2"
            java.lang.String r5 = "DraftAttachmentPostProcessorImpl.kt"
            if (r8 == 0) goto L69
            ekrg r8 = defpackage.wor.a
            ekrw r8 = r8.h()
            ekrz r6 = defpackage.eksq.a
            r8.X(r6, r4)
            r4 = 75
            ekrw r8 = r8.h(r3, r1, r4, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r1 = "Starting processed attachments sending preparation."
            r8.q(r1)
            wor r8 = r7.b
            vvr r1 = r7.c
            boolean r3 = r7.d
            r7.a = r2
            java.lang.Object r8 = r8.g(r1, r3, r7)
            if (r8 != r0) goto L68
            goto L92
        L68:
            return r8
        L69:
            ekrg r8 = defpackage.wor.a
            ekrw r8 = r8.g()
            ekrz r2 = defpackage.eksq.a
            r8.X(r2, r4)
            r2 = 81
            ekrw r8 = r8.h(r3, r1, r2, r5)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r1 = "Processed attachment doesn't meet early sending preparation criteria."
            r8.q(r1)
            wor r8 = r7.b
            vvr r1 = r7.c
            r2 = 3
            r7.a = r2
            java.lang.Object r8 = r8.c(r1)
            if (r8 != r0) goto L8f
            goto L92
        L8f:
            vvr r8 = r7.c
            return r8
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wom.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wom womVar = new wom(fcxyVar, this.b, this.c, this.d);
        womVar.e = obj;
        return womVar;
    }
}
