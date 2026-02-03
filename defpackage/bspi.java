package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bspi implements Supplier {
    final /* synthetic */ bspj a;

    public bspi(bspj bspjVar) {
        this.a = bspjVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bspj bspjVar = this.a;
        cgzx cgzxVar = bspjVar.a;
        if (cgzxVar == null || cgzxVar.equals(null)) {
            return null;
        }
        return chbt.b(bspjVar.a);
    }
}
