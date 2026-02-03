package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzn implements ando {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ alzs c;

    public alzn(long j, long j2, alzs alzsVar) {
        this.a = j;
        this.b = j2;
        this.c = alzsVar;
    }

    @Override // defpackage.ando
    public final andn a(ekgb ekgbVar) {
        ekgbVar.getClass();
        ekrw ekrwVarH = this.c.d.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderAppendPagingKeyQuery$1$1", "getPlaceholdersCount", 171, "BuglePlaceholdersCountQueries.kt");
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        Integer numValueOf = Integer.valueOf(ekgbVar.size());
        long j2 = this.a;
        long j3 = j2 - j;
        ekrdVar.J("Placeholder append key query: items after target key: %d, list size: %d, offset: %d, total: %d", lValueOf, numValueOf, Long.valueOf(j3), Long.valueOf(j2));
        return new andn(j3, j - ekgbVar.size());
    }
}
