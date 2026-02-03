package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awvp implements Supplier {
    final /* synthetic */ awvq a;

    public awvp(awvq awvqVar) {
        this.a = awvqVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        awvq awvqVar = this.a;
        axcm axcmVar = awvqVar.b;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(awvqVar.b);
    }
}
