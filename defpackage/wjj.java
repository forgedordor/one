package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wjj extends fcyz implements fdat {
    int a;
    final /* synthetic */ wjy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjj(wjy wjyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wjyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wjj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r10 == r0) goto L26;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl$1"
            java.lang.String r5 = "BugleComposeRow2"
            java.lang.String r6 = "DraftAttachmentUiAdapterImpl.kt"
            defpackage.fctl.b(r10)
            if (r1 == 0) goto L16
            if (r1 == r2) goto L3a
            goto L91
        L16:
            ekrg r10 = defpackage.wjy.a
            ekrw r10 = r10.g()
            ekrz r1 = defpackage.eksq.a
            r10.X(r1, r5)
            r1 = 57
            ekrw r10 = r10.h(r4, r3, r1, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r1 = "Checking to recover media viewer result"
            r10.q(r1)
            wjy r10 = r9.b
            r9.a = r2
            agdt r10 = r10.l
            java.lang.Object r10 = r10.a(r9)
            if (r10 == r0) goto Lb4
        L3a:
            aggc r10 = (defpackage.aggc) r10
            ekrg r1 = defpackage.wjy.a
            ekrw r1 = r1.g()
            ekrz r2 = defpackage.eksq.a
            r1.X(r2, r5)
            r2 = 59
            ekrw r1 = r1.h(r4, r3, r2, r6)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "Recovered media viewer result %s"
            r1.t(r2, r10)
            r1 = 0
            if (r10 == 0) goto L7f
            wjy r2 = r9.b
            fcsu r7 = r2.h
            java.lang.Object r7 = r7.b()
            vth r7 = (defpackage.vth) r7
            aqhi r2 = r2.i
            dltb r8 = defpackage.wkn.b
            boolean r2 = r2.a()
            if (r2 == 0) goto L72
            java.lang.String r2 = r10.a
            doig r2 = defpackage.dohx.a(r2)
            goto L73
        L72:
            r2 = r1
        L73:
            if (r2 == 0) goto L77
            doif r1 = r2.b
        L77:
            vvl r1 = r7.j(r8, r1)
            wkl r1 = defpackage.wkn.b(r10, r1)
        L7f:
            if (r1 == 0) goto Lb1
            wjy r10 = r9.b
            r2 = 2
            r9.a = r2
            vvp r1 = r1.a
            wiq r10 = r10.f
            java.lang.Object r10 = r10.b(r1, r9)
            if (r10 != r0) goto L91
            goto Lb4
        L91:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lb1
            ekrg r10 = defpackage.wjy.a
            ekrw r10 = r10.f()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r5)
            r0 = 79
            ekrw r10 = r10.h(r4, r3, r0, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Adding attachment viewer result failed"
            r10.q(r0)
        Lb1:
            fctx r10 = defpackage.fctx.a
            return r10
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wjj(this.b, fcxyVar);
    }
}
