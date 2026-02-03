package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowk {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/transfer/uploads/NonResumableUploadsConfigurationValuesImpl");
    public final fcsu a;
    private final cqbm c;
    private final fcsu d;
    private final aqzi e;

    public cowk(cqbm cqbmVar, fcsu fcsuVar, fcsu fcsuVar2, aqzi aqziVar) {
        cqbmVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = cqbmVar;
        this.d = fcsuVar;
        this.a = fcsuVar2;
        this.e = aqziVar;
    }

    public final long a() {
        Object objB = this.d.b();
        objB.getClass();
        return b(((Number) objB).longValue());
    }

    public final long b(long j) {
        if (!((eoth) ((aqwu) this.e).a.b()).a("bugle.do_resumable_uploads_for_satellite")) {
            return j;
        }
        cqbm cqbmVar = this.c;
        if (((cqey) cqbmVar.a()).w()) {
            return j;
        }
        if (!((cqey) cqbmVar.a()).t() && !((cqey) cqbmVar.a()).u()) {
            return j;
        }
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleFileTransfer");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/transfer/uploads/NonResumableUploadsConfigurationValuesImpl", "transferThresholdInternal", 47, "NonResumableUploadsConfigurationValuesImpl.kt")).q("Resumable transfer threshold is 0 for satellite.");
        return 0L;
    }
}
