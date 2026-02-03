package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnie extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/tachygram/chat/groupsync/SyncRcsGroupsWorkHandler");
    public final cnas b;
    public final fcsu c;
    public final awxo d;
    public final awnf e;
    private final fdjx f;
    private final fcsu g;

    public cnie(cnas cnasVar, fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, awxo awxoVar, awnf awnfVar) {
        cnasVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        awxoVar.getClass();
        awnfVar.getClass();
        this.b = cnasVar;
        this.c = fcsuVar;
        this.f = fdjxVar;
        this.g = fcsuVar2;
        this.d = awxoVar;
        this.e = awnfVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c((int) ((Number) this.g.b()).longValue());
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("SyncRcsGroupsWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cnib.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cnib cnibVar = (cnib) evuhVar;
        cnibVar.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new cnid(this, cnibVar, null));
    }
}
