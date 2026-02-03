package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brou implements Supplier {
    final /* synthetic */ brov a;

    public brou(brov brovVar) {
        this.a = brovVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        brov brovVar = this.a;
        axcm axcmVar = brovVar.f;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(brovVar.f);
    }
}
