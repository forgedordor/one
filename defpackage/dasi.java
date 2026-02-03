package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dasi extends cayv {
    public static final eksp a = eksp.c("BugleWearable");
    public final dens b;
    public final fcsu c;
    private final fcsu d;
    private final fdjx e;
    private final fcyh f;

    public dasi(fcsu fcsuVar, dens densVar, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        densVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar2.getClass();
        this.d = fcsuVar;
        this.b = densVar;
        this.e = fdjxVar;
        this.f = fcyhVar;
        this.c = fcsuVar2;
    }

    public static final Object l(defn defnVar, fcxy fcxyVar) {
        return fdxs.c(drgi.a(defnVar), fcxyVar);
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(10);
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.b);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("SyncConversationDataToWearableHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = dasl.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "wear_sync_queue";
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final /* bridge */ /* synthetic */ boolean h(evuh evuhVar) throws IOException {
        ((dasl) evuhVar).getClass();
        eieu eieuVarH = eiiy.h("SyncConversationDataToWearableHandler#preflight");
        try {
            if (((ctap) this.d.b()).b()) {
                fczl.a(eieuVarH, null);
                return true;
            }
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(cqnc.S, "SyncConversationDataToWearableHandler");
            ekrwVarO.q("Skipping sync conversation data to wear devices.");
            fczl.a(eieuVarH, null);
            return false;
        } finally {
        }
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        dasl daslVar = (dasl) evuhVar;
        daslVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new dash(daslVar, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dasf
            if (r0 == 0) goto L13
            r0 = r7
            dasf r0 = (defpackage.dasf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dasf r0 = new dasf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.f
            fcyh r7 = defpackage.eicg.a(r7)
            dase r2 = new dase
            r4 = 0
            r2.<init>(r4, r6, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dasi.k(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }
}
