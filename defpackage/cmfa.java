package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfa implements chtw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl");
    public final fcsu b;
    public final fcsu c;
    public final aspz d;
    private final cozg e;
    private final fdjx f;

    public cmfa(fcsu fcsuVar, fcsu fcsuVar2, cozg cozgVar, aspz aspzVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cozgVar.getClass();
        aspzVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.e = cozgVar;
        this.d = aspzVar;
        this.f = fdjxVar;
    }

    @Override // defpackage.chtw
    public final eiju a(alqm alqmVar) {
        alqmVar.getClass();
        String strJ = alqmVar.j();
        String strC = cqcv.c(alqmVar);
        if (strJ == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 50, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).t("No short code in local destination: %s", strC);
            this.d.l(null, 5);
            eiju eijuVarE = eijx.e(Optional.empty());
            eijuVarE.getClass();
            return eijuVarE;
        }
        enmr enmrVarD = this.e.d();
        if (!enmrVarD.equals(enmr.TRANSPORT_UNKNOWN)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 63, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).D("Enabled transport %s: %s", enmrVarD, strC);
            this.d.b(strJ);
            return auvw.c(this.f, fcyi.a, fdjz.a, new cmez(this, strJ, null));
        }
        ekrw ekrwVarJ2 = a.j();
        ekrwVarJ2.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 58, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).t("There is no enabled transport, %s", strC);
        this.d.l(strJ, 5);
        eiju eijuVarE2 = eijx.e(Optional.empty());
        eijuVarE2.getClass();
        return eijuVarE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.asnl r5, java.lang.String r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cmey
            if (r0 == 0) goto L13
            r0 = r7
            cmey r0 = (defpackage.cmey) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmey r0 = new cmey
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            j$.util.Optional r7 = j$.util.Optional.empty()
            eiju r5 = r5.e(r6, r7)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmfa.b(asnl, java.lang.String, fcxy):java.lang.Object");
    }
}
