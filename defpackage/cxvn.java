package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxvn extends fcyz implements fdat {
    int a;
    final /* synthetic */ cxvq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxvn(cxvq cxvqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cxvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxvn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r1.a(r8, r7) == r0) goto L18;
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
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl$linkAccount$1"
            java.lang.String r4 = "BugleCms"
            r5 = 1
            java.lang.String r6 = "CloudStoreDebugMenuProviderImpl.kt"
            if (r1 == 0) goto L19
            if (r1 == r5) goto L15
            defpackage.fctl.b(r8)     // Catch: defpackage.axlg -> L60
            goto L78
        L15:
            defpackage.fctl.b(r8)     // Catch: defpackage.axlg -> L60
            goto L33
        L19:
            defpackage.fctl.b(r8)
            cxvq r8 = r7.b     // Catch: defpackage.axlg -> L60
            fcsu r8 = r8.i     // Catch: defpackage.axlg -> L60
            java.lang.Object r8 = r8.b()     // Catch: defpackage.axlg -> L60
            axky r8 = (defpackage.axky) r8     // Catch: defpackage.axlg -> L60
            eiju r8 = r8.a()     // Catch: defpackage.axlg -> L60
            r7.a = r5     // Catch: defpackage.axlg -> L60
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)     // Catch: defpackage.axlg -> L60
            if (r8 != r0) goto L33
            goto L5f
        L33:
            efwo r8 = (defpackage.efwo) r8     // Catch: defpackage.axlg -> L60
            if (r8 != 0) goto L52
            ekrg r8 = defpackage.cxvq.a     // Catch: defpackage.axlg -> L60
            ekrw r8 = r8.h()     // Catch: defpackage.axlg -> L60
            ekrz r0 = defpackage.eksq.a     // Catch: defpackage.axlg -> L60
            r8.X(r0, r4)     // Catch: defpackage.axlg -> L60
            r0 = 387(0x183, float:5.42E-43)
            ekrw r8 = r8.h(r3, r2, r0, r6)     // Catch: defpackage.axlg -> L60
            ekrd r8 = (defpackage.ekrd) r8     // Catch: defpackage.axlg -> L60
            java.lang.String r0 = "No account to link."
            r8.q(r0)     // Catch: defpackage.axlg -> L60
            fctx r8 = defpackage.fctx.a     // Catch: defpackage.axlg -> L60
            return r8
        L52:
            cxvq r1 = r7.b     // Catch: defpackage.axlg -> L60
            cedc r1 = r1.j     // Catch: defpackage.axlg -> L60
            r5 = 2
            r7.a = r5     // Catch: defpackage.axlg -> L60
            java.lang.Object r8 = r1.a(r8, r7)     // Catch: defpackage.axlg -> L60
            if (r8 != r0) goto L78
        L5f:
            return r0
        L60:
            ekrg r8 = defpackage.cxvq.a
            ekrw r8 = r8.h()
            ekrz r0 = defpackage.eksq.a
            r8.X(r0, r4)
            r0 = 392(0x188, float:5.5E-43)
            ekrw r8 = r8.h(r3, r2, r0, r6)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r0 = "No linked account."
            r8.q(r0)
        L78:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxvn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxvn(this.b, fcxyVar);
    }
}
