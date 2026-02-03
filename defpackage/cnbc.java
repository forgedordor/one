package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbc {
    private static final eksp a = eksp.c("BugleTachygram");
    private final cnck b;

    public cnbc(cnck cnckVar) {
        this.b = cnckVar;
    }

    public final eiju a(eqds eqdsVar) {
        ezol ezolVar = eqdsVar.a.a;
        evqs evqsVar = ezolVar.e;
        if (!evqs.b.equals(evqsVar)) {
            return this.b.c(ezolVar.c, evqsVar);
        }
        eksl ekslVar = (eksl) a.j();
        ekslVar.X(cqnc.N, ezolVar.c);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/RoutingInfoTokenForwarder", "storeRoutingInfoToken", 32, "RoutingInfoTokenForwarder.java")).q("GroupInfo missing routing info token.");
        return eijx.e(null);
    }
}
