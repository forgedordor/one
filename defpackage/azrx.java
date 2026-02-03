package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azrx implements Supplier {
    final /* synthetic */ azry a;

    public azrx(azry azryVar) {
        this.a = azryVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azry azryVar = this.a;
        axcm axcmVar = azryVar.b;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(azryVar.b);
    }
}
