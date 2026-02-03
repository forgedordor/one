package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azgq implements Supplier {
    final /* synthetic */ azgs a;

    public azgq(azgs azgsVar) {
        this.a = azgsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azgs azgsVar = this.a;
        axcm axcmVar = azgsVar.c;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(azgsVar.c);
    }
}
