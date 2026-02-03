package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brfo implements Supplier {
    final /* synthetic */ brfq a;

    public brfo(brfq brfqVar) {
        this.a = brfqVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        brfq brfqVar = this.a;
        bash bashVar = brfqVar.a;
        if (bashVar == null || bashVar.equals(bash.a)) {
            return null;
        }
        return Long.valueOf(bash.a(brfqVar.a));
    }
}
