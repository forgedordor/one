package defpackage;

import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aszx implements aszw {
    final /* synthetic */ Supplier a;

    public aszx(Supplier supplier) {
        this.a = supplier;
    }

    @Override // defpackage.aszw
    public final Duration a() {
        return ((aszw) this.a.get()).a();
    }

    @Override // defpackage.aszw
    public final Duration b() {
        return ((aszw) this.a.get()).b();
    }
}
