package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brfp implements Supplier {
    final /* synthetic */ brfq a;

    public brfp(brfq brfqVar) {
        this.a = brfqVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        brfq brfqVar = this.a;
        Instant instant = brfqVar.b;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            return null;
        }
        return Long.valueOf(barq.a(brfqVar.b));
    }
}
