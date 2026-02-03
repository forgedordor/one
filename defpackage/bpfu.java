package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpfu implements Supplier {
    final /* synthetic */ bpfv a;

    public bpfu(bpfv bpfvVar) {
        this.a = bpfvVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpfv bpfvVar = this.a;
        basd basdVar = bpfvVar.a;
        if (basdVar == null || basdVar.equals(basd.a)) {
            return null;
        }
        return basd.d(bpfvVar.a);
    }
}
