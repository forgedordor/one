package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzr implements ando {
    final /* synthetic */ long a;
    final /* synthetic */ alzs b;
    final /* synthetic */ long c;

    public alzr(long j, alzs alzsVar, long j2) {
        this.a = j;
        this.b = alzsVar;
        this.c = j2;
    }

    @Override // defpackage.ando
    public final andn a(ekgb ekgbVar) {
        ekgbVar.getClass();
        long size = ekgbVar.size();
        ekrw ekrwVarH = this.b.d.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderPrependPagingKeyQuery$1$1", "getPlaceholdersCount", 136, "BuglePlaceholdersCountQueries.kt");
        long j = this.a;
        Long lValueOf = Long.valueOf(j);
        Integer numValueOf = Integer.valueOf(ekgbVar.size());
        long j2 = j - size;
        Long lValueOf2 = Long.valueOf(j2);
        long j3 = this.c;
        ekrdVar.J("Placeholder prepend key query: items before target key: %d, list size: %d, offset: %d, total: %d", lValueOf, numValueOf, lValueOf2, Long.valueOf(j3));
        return new andn(j2, j3 - j);
    }
}
