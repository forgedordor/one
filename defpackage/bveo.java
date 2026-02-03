package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bveo {
    private final egyt a;
    private final egzh b;

    public bveo(egyt egytVar, egzh egzhVar) {
        this.a = egytVar;
        this.b = egzhVar;
    }

    public final egyi a(final dqwl dqwlVar, final bveh bvehVar, Object obj, lvc lvcVar) {
        dqwlVar.N(lvcVar, new bven(this.b, obj));
        return new egys(this.a, new eopk() { // from class: bvem
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(bvehVar.a(dqwlVar));
            }
        }, obj);
    }
}
