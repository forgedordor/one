package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzp implements ando {
    final /* synthetic */ ajly a;
    final /* synthetic */ long b;
    final /* synthetic */ alzs c;
    final /* synthetic */ long d;

    public alzp(ajly ajlyVar, long j, alzs alzsVar, long j2) {
        this.a = ajlyVar;
        this.b = j;
        this.c = alzsVar;
        this.d = j2;
    }

    @Override // defpackage.ando
    public final andn a(ekgb ekgbVar) {
        ekgbVar.getClass();
        final alzs alzsVar = this.c;
        int iA = andl.a(ekgbVar, this.a, new fdap() { // from class: alzo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ajlt ajltVar = (ajlt) obj;
                ajltVar.getClass();
                return alzsVar.b.ad(ajltVar.b(), ajltVar.o());
            }
        });
        long j = this.b;
        long jMax = Math.max(0L, (j - iA) - 1);
        ekrw ekrwVarH = alzsVar.d.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries$placeholderInitialPagingKeyQuery$1$1", "getPlaceholdersCount", 100, "BuglePlaceholdersCountQueries.kt");
        Long lValueOf = Long.valueOf(j);
        Integer numValueOf = Integer.valueOf(ekgbVar.size());
        Integer numValueOf2 = Integer.valueOf(iA);
        Long lValueOf2 = Long.valueOf(jMax);
        long j2 = this.d;
        ekrdVar.K("Placeholder initial paging key query: items before target key: %d, list size: %d, index of target key in list: %d, offset: %d, total: %d", lValueOf, numValueOf, numValueOf2, lValueOf2, Long.valueOf(j2));
        return new andn(jMax, (j2 - jMax) - ekgbVar.size());
    }
}
