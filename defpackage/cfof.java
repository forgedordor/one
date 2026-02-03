package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfof implements cfmz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate");
    private final fdjx b;
    private final fdjx c;
    private final Optional d;
    private final fcsu e;

    public cfof(fdjx fdjxVar, fdjx fdjxVar2, Optional optional, fcsu fcsuVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        optional.getClass();
        fcsuVar.getClass();
        this.b = fdjxVar;
        this.c = fdjxVar2;
        this.d = optional;
        this.e = fcsuVar;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        ((epfg) evuhVar).getClass();
        if (((Boolean) cbpz.c.e()).booleanValue()) {
            return auvw.c(this.c, fcyi.a, fdjz.a, new cfod(this, null));
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleDittoRcs");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate", "handleRequestInternal", 45, "UnlinkIdentityDelegate.kt")).q("Ditto RCS is not enabled.");
        return auvw.c(this.b, fcyi.a, fdjz.a, new cfoc(null));
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        epfg epfgVar = (epfg) evsn.parseFrom(epfg.a, evqsVar, evrr.a());
        epfgVar.getClass();
        return epfgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cfoe
            if (r0 == 0) goto L13
            r0 = r7
            cfoe r0 = (defpackage.cfoe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfoe r0 = new cfoe
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            epfh r0 = r0.d
            defpackage.fctl.b(r7)
            goto L60
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.fctl.b(r7)
            epfk r7 = defpackage.epfk.a
            evsf r2 = r7.createBuilder()
            epfh r2 = (defpackage.epfh) r2
            r2.getClass()
            j$.util.Optional r4 = r6.d
            boolean r5 = r4.isPresent()
            if (r5 == 0) goto Lbe
            fcsu r7 = r6.e
            java.lang.Object r7 = r7.b()
            cedc r7 = (defpackage.cedc) r7
            java.lang.Object r4 = r4.get()
            efwo r4 = (defpackage.efwo) r4
            r0.d = r2
            r0.c = r3
            java.lang.Object r7 = r7.e(r4, r0)
            if (r7 == r1) goto Lbd
            r0 = r2
        L60:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            epfj r2 = defpackage.epfj.a
            evsf r2 = r2.createBuilder()
            epfi r2 = (defpackage.epfi) r2
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r4 = r2.instance
            epfj r4 = (defpackage.epfj) r4
            r1.getClass()
            r4.b = r1
            r2.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r2.instance
            epfj r1 = (defpackage.epfj) r1
            r1.c = r3
            evsn r1 = r2.build()
            epfj r1 = (defpackage.epfj) r1
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance
            epfk r2 = (defpackage.epfk) r2
            epfk r4 = defpackage.epfk.a
            r1.getClass()
            evtg r4 = r2.b
            boolean r5 = r4.c()
            if (r5 != 0) goto Laf
            evtg r4 = defpackage.evsn.mutableCopy(r4)
            r2.b = r4
        Laf:
            evtg r2 = r2.b
            r2.add(r1)
            goto L66
        Lb5:
            evsn r7 = r0.build()
            r7.getClass()
            return r7
        Lbd:
            return r1
        Lbe:
            ekrg r0 = defpackage.cfof.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleDittoRcs"
            r0.X(r1, r2)
            r1 = 75
            java.lang.String r2 = "UnlinkIdentityDelegate.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate"
            java.lang.String r4 = "unlinkRcsToGaiaAccount"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "AccountId is not present, cannot unlink account"
            r0.q(r1)
            evsf r7 = r7.createBuilder()
            epfh r7 = (defpackage.epfh) r7
            r7.getClass()
            epfk r7 = defpackage.epfl.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfof.d(fcxy):java.lang.Object");
    }
}
