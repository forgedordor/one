package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdrv implements cdrp {
    public static final Long a = 0L;
    public final cqce b = cqce.g("Lighter", "LighterSyncManagerImpl");
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final eosc f;
    public final cdro g;
    public final fcsu h;

    public cdrv(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, cdro cdroVar, fcsu fcsuVar3) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.g = cdroVar;
        this.h = fcsuVar3;
    }

    public final eiju a() {
        fcsu fcsuVar = this.g.a;
        ((cazj) fcsuVar.b()).f("lighter_incremental_sync");
        try {
            ((cazj) fcsuVar.b()).e("lighter_incremental_sync", "incremental_sync_cancelation_tag");
        } catch (IndexOutOfBoundsException unused) {
            this.b.p("There is no running task to cancel");
        }
        return ((cdre) this.c.b()).d(false);
    }
}
