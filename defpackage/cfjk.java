package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfjk implements cfmz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate");
    private final fdjx b;
    private final fdjx c;
    private final fcsu d;
    private final Optional e;
    private final cecr f;

    public cfjk(fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, Optional optional, cecr cecrVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        cecrVar.getClass();
        this.b = fdjxVar;
        this.c = fdjxVar2;
        this.d = fcsuVar;
        this.e = optional;
        this.f = cecrVar;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        epna epnaVar = (epna) evuhVar;
        epnaVar.getClass();
        if (((cdio) this.d.b()).a()) {
            return auvw.c(this.c, fcyi.a, fdjz.a, new cfjj(this, epnaVar, null));
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleGDitto");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.S, "CancelGaiaPairingDelegate");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate", "handleRequestInternal", 64, "CancelGaiaPairingDelegate.kt")).q("Gaia Pairing is disabled. Skipping handleRequestInternal in delegate.");
        return auvw.c(this.b, fcyi.a, fdjz.a, new cfji(null));
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        if (((cdio) this.d.b()).a()) {
            epna epnaVar = (epna) evsn.parseFrom(epna.a, evqsVar, evrr.a());
            epnaVar.getClass();
            return epnaVar;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleGDitto");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.S, "CancelGaiaPairingDelegate");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate", "parseRequest", 49, "CancelGaiaPairingDelegate.kt")).q("Gaia Pairing is disabled. Skipping parseRequest in delegate.");
        epmz epmzVar = (epmz) epna.a.createBuilder();
        epmzVar.getClass();
        evsn evsnVarBuild = epmzVar.build();
        evsnVarBuild.getClass();
        return (epna) evsnVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v9, types: [bvqv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.epna r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cfjh
            if (r0 == 0) goto L13
            r0 = r10
            cfjh r0 = (defpackage.cfjh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfjh r0 = new cfjh
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r10)
            goto Lb7
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.fctl.b(r10)
            java.lang.String r9 = r9.b
            cecr r10 = r8.f
            java.util.concurrent.atomic.AtomicReference r10 = r10.a
            java.lang.Object r10 = r10.get()
            boolean r9 = defpackage.fdbq.f(r9, r10)
            java.lang.String r10 = "getCancelPairingResponse"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate"
            java.lang.String r4 = "CancelGaiaPairingDelegate"
            java.lang.String r5 = "BugleGDitto"
            java.lang.String r6 = "CancelGaiaPairingDelegate.kt"
            if (r9 != 0) goto L80
            ekrg r9 = defpackage.cfjk.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r5)
            ekrd r9 = (defpackage.ekrd) r9
            ekrz r0 = defpackage.cqnc.S
            r9.X(r0, r4)
            r0 = 82
            ekrw r9 = r9.h(r2, r10, r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Pairing attempt id doesn't match. Ignore cancel pairing request."
            r9.q(r10)
            epnc r9 = defpackage.epnc.a
            evsf r9 = r9.createBuilder()
            epnb r9 = (defpackage.epnb) r9
            r9.getClass()
            r10 = 0
            defpackage.epnd.b(r10, r9)
            epnc r9 = defpackage.epnd.a(r9)
            return r9
        L80:
            ekrg r9 = defpackage.cfjk.a
            ekrw r9 = r9.e()
            ekrz r7 = defpackage.eksq.a
            r9.X(r7, r5)
            ekrd r9 = (defpackage.ekrd) r9
            ekrz r5 = defpackage.cqnc.S
            r9.X(r5, r4)
            r4 = 85
            ekrw r9 = r9.h(r2, r10, r4, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Cancel gaia pairing."
            r9.q(r10)
            j$.util.Optional r9 = r8.e
            r9.isPresent()
            java.lang.Object r9 = r9.get()
            bvqq r10 = defpackage.bvqq.ERROR_USER_CANCELED_VERIFICATION_FROM_DITTO
            eiju r9 = r9.g(r10)
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto Lb7
            return r1
        Lb7:
            epnc r9 = defpackage.epnc.a
            evsf r9 = r9.createBuilder()
            epnb r9 = (defpackage.epnb) r9
            r9.getClass()
            defpackage.epnd.b(r3, r9)
            epnc r9 = defpackage.epnd.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjk.d(epna, fcxy):java.lang.Object");
    }
}
