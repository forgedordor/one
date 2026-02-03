package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axdg implements Supplier {
    final /* synthetic */ axdh a;

    public axdg(axdh axdhVar) {
        this.a = axdhVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        axdh axdhVar = this.a;
        axcm axcmVar = axdhVar.e;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(axdhVar.e);
    }
}
