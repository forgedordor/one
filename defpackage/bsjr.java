package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bsjr implements Supplier {
    final /* synthetic */ bsjs a;

    public bsjr(bsjs bsjsVar) {
        this.a = bsjsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bsjs bsjsVar = this.a;
        basd basdVar = bsjsVar.a;
        if (basdVar == null || basdVar.equals(basd.a)) {
            return null;
        }
        return basd.d(bsjsVar.a);
    }
}
