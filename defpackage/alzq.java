package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzq implements ando {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ alzs c;

    public alzq(long j, int i, alzs alzsVar) {
        this.a = j;
        this.b = i;
        this.c = alzsVar;
    }

    @Override // defpackage.ando
    public final andn a(ekgb ekgbVar) {
        ekgbVar.getClass();
        long j = this.a;
        long jMin = Math.min(j, this.b);
        ekrw ekrwVarH = this.c.d.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderOffsetCountQuery$1$1", "getPlaceholdersCount", 63, "BuglePlaceholdersCountQueries.kt")).I("Placeholder offset count query: list size: %d, offset: %d, total: %d", Integer.valueOf(ekgbVar.size()), Long.valueOf(jMin), Long.valueOf(j));
        return new andn(jMin, (j - jMin) - ekgbVar.size());
    }
}
