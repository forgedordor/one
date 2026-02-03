package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brgw implements Supplier {
    final /* synthetic */ brgx a;

    public brgw(brgx brgxVar) {
        this.a = brgxVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        brgx brgxVar = this.a;
        basi basiVar = brgxVar.b;
        if (basiVar == null || basiVar.equals(basi.a)) {
            return null;
        }
        return basi.d(brgxVar.b);
    }
}
