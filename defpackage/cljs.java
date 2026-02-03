package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljs implements cljr {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PullMessageHelperImpl");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final cqej e;

    public cljs(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cqej cqejVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cqejVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = cqejVar;
    }

    @Override // defpackage.cljr
    public final Object a() {
        for (dggn dggnVar : ((dggw) this.c.b()).p()) {
            dgiq dgiqVar = (dgiq) fdct.b(((dggz) this.d.b()).h(dggnVar));
            if (dgiqVar == null) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleSatellite");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PullMessageHelperImpl", "pullMessagesForAllAvailableSim", 38, "PullMessageHelperImpl.kt")).t("configuration is null for provisioningId %s, skip pulling messages", dggnVar);
            } else {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleSatellite");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PullMessageHelperImpl", "pullMessagesForAllAvailableSim", 41, "PullMessageHelperImpl.kt")).t("start pulling messages for provisioningId %s", dggnVar);
                cfzf cfzfVar = (cfzf) this.b.b();
                ezok ezokVar = (ezok) ezol.a.createBuilder();
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).d = "RCS";
                String strB = this.e.b(dgiqVar);
                ezokVar.copyOnWrite();
                ((ezol) ezokVar.instance).c = strB;
                cfzfVar.a((ezol) ezokVar.build());
            }
        }
        return fctx.a;
    }
}
