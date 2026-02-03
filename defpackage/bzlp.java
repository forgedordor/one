package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzlp extends cayv {
    public final aurx a;
    public final axlf b;
    public final bzll c;
    public final Optional d;
    public final ains e;
    public final cqce f;
    private final fdjx g;
    private final fcyh h;

    public bzlp(fdjx fdjxVar, fcyh fcyhVar, aurx aurxVar, axlf axlfVar, bzll bzllVar, Optional optional, aukz aukzVar, ains ainsVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        aurxVar.getClass();
        axlfVar.getClass();
        aukzVar.getClass();
        ainsVar.getClass();
        this.g = fdjxVar;
        this.h = fcyhVar;
        this.a = aurxVar;
        this.b = axlfVar;
        this.c = bzllVar;
        this.d = optional;
        this.e = ainsVar;
        this.f = cqce.g("BugleCmsBatchBackup", "DropUnscheduledItemToDlqWorkHandler");
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        Object objE = bzlq.a.e();
        objE.getClass();
        caxzVarL.c(((Number) objE).intValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("DropUnscheduledItemToDlqWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = bzzx.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        bzzx bzzxVar = (bzzx) evuhVar;
        bzzxVar.getClass();
        return auvw.c(this.g, fcyi.a, fdjz.a, new bzlo(this, cayyVar, bzzxVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bzln
            if (r0 == 0) goto L13
            r0 = r6
            bzln r0 = (defpackage.bzln) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzln r0 = new bzln
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.h
            fcyh r6 = defpackage.eicg.a(r6)
            bzlm r2 = new bzlm
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzlp.k(fcxy):java.lang.Object");
    }
}
