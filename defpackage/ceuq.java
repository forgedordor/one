package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceuq implements cmir {
    final /* synthetic */ ceto a;
    final /* synthetic */ eosc b;
    final /* synthetic */ ains c;

    public ceuq(ceto cetoVar, eosc eoscVar, ains ainsVar) {
        this.a = cetoVar;
        this.b = eoscVar;
        this.c = ainsVar;
    }

    @Override // defpackage.cmir
    public final /* synthetic */ eiju a() {
        return cmiq.a();
    }

    @Override // defpackage.cmir
    public final eiju b() {
        final cesu cesuVar = (cesu) cesv.a.createBuilder();
        return eiju.g(this.a.a.a()).h(new ejvr() { // from class: cetn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cete) obj).f);
            }
        }, eoqg.a).h(new ejvr() { // from class: ceup
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                long jLongValue = ((Long) obj).longValue();
                cesu cesuVar2 = cesuVar;
                cesuVar2.copyOnWrite();
                cesv cesvVar = (cesv) cesuVar2.instance;
                cesv cesvVar2 = cesv.a;
                cesvVar.b = jLongValue;
                return (cesv) cesuVar2.build();
            }
        }, this.b);
    }

    @Override // defpackage.cmis
    public final void c() {
        this.c.c("Bugle.Firebase.Registration.Data.Migration.Counts");
    }
}
