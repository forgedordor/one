package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btbv implements Supplier {
    final /* synthetic */ btbw a;

    public btbv(btbw btbwVar) {
        this.a = btbwVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        btbw btbwVar = this.a;
        basd basdVar = btbwVar.a;
        if (basdVar == null || basdVar.equals(basd.a)) {
            return null;
        }
        return basd.d(btbwVar.a);
    }
}
