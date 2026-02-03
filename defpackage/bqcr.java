package defpackage;

import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqcr implements Supplier {
    final /* synthetic */ bqcs a;

    public bqcr(bqcs bqcsVar) {
        this.a = bqcsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqcs bqcsVar = this.a;
        UUID uuid = bqcsVar.b;
        if (uuid == null || uuid.equals(base.b())) {
            return null;
        }
        return base.a(bqcsVar.b);
    }
}
