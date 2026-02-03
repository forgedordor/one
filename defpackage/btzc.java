package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btzc implements Supplier {
    final /* synthetic */ btzd a;

    public btzc(btzd btzdVar) {
        this.a = btzdVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        btzd btzdVar = this.a;
        axcm axcmVar = btzdVar.b;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(btzdVar.b);
    }
}
