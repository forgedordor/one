package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bojd implements Supplier {
    final /* synthetic */ bojh a;

    public bojd(bojh bojhVar) {
        this.a = bojhVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bojh bojhVar = this.a;
        axcm axcmVar = bojhVar.B;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(bojhVar.B);
    }
}
