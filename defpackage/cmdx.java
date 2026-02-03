package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdx implements cmdq {
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionUiAdapterImpl");
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public ahat d;
    public cmdb e;
    private final fdjx g;

    public cmdx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.g = fdjxVar;
    }

    public static final void b(Object obj) {
        if (obj instanceof fdof) {
            ((ekrd) ((ekrd) f.j()).g(fdog.b(obj)).h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionUiAdapterImpl", "logAnyChannelFailure-rs8usWo", 117, "ScreenDetectionUiAdapterImpl.kt")).q("Failed to send result of handleDisplayChange");
        }
    }

    @Override // defpackage.cmdq
    public final void a() {
        Object objE = ((cczi) cmdd.a.get()).e();
        objE.getClass();
        if (((Boolean) objE).booleanValue()) {
            auvw.k(this.g, null, null, new cmdw(this, null), 3);
        }
    }
}
