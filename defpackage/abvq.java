package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvq {
    public static final eksp a = eksp.c("Bugle");
    public final Class b;
    public final Optional c;
    private final eosc d;
    private final Optional e;

    public abvq(Class cls, eosc eoscVar, Optional optional, Optional optional2) {
        this.b = cls;
        this.d = eoscVar;
        this.c = optional;
        this.e = optional2;
    }

    public final eiju a() {
        if (this.c.isEmpty()) {
            return eijx.e(Optional.empty());
        }
        Optional optional = this.e;
        ejwl.m(optional.isPresent(), "the isEnabledFn should be present when the feature is compiled in");
        optional.get();
        eiju eijuVarB = aapr.a.b();
        ejvr ejvrVar = new ejvr() { // from class: abvo
            /* JADX WARN: Type inference failed for: r1v5, types: [eygg, java.lang.Object] */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return Optional.empty();
                }
                Object objB = this.a.c.get().b();
                objB.getClass();
                return Optional.of(objB);
            }
        };
        eosc eoscVar = this.d;
        return eijuVarB.h(ejvrVar, eoscVar).e(Exception.class, new ejvr() { // from class: abvp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                eksl ekslVar = (eksl) abvq.a.h();
                ekslVar.X(cqnc.S, this.a.b.toString());
                ((eksl) ekslVar.h("com/google/android/apps/messaging/featureprovider/AsyncFeatureProvider", "getFeature", 97, "AsyncFeatureProvider.java")).o();
                auvh.d(exc);
                throw new IllegalStateException(exc);
            }
        }, eoscVar);
    }
}
