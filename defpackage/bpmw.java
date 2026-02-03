package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpmw implements Supplier {
    final /* synthetic */ bpmx a;

    public bpmw(bpmx bpmxVar) {
        this.a = bpmxVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpmx bpmxVar = this.a;
        axcm axcmVar = bpmxVar.b;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(bpmxVar.b);
    }
}
