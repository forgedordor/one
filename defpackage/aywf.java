package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aywf implements Supplier {
    final /* synthetic */ aywg a;

    public aywf(aywg aywgVar) {
        this.a = aywgVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        aywg aywgVar = this.a;
        axcm axcmVar = aywgVar.b;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(aywgVar.b);
    }
}
