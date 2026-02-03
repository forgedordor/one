package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvt {
    private final Optional a;
    private final Optional b;

    public abvt(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eygg, java.lang.Object] */
    public final Optional a() {
        Optional optional = this.a;
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        Optional optional2 = this.b;
        optional2.isPresent();
        ejwl.m(true, "the isEnabledFn should be present when the feature is compiled in");
        if (!((abvs) optional2.get()).a()) {
            return Optional.empty();
        }
        Object objB = optional.get().b();
        objB.getClass();
        return Optional.of(objB);
    }
}
