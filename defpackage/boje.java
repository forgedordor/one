package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class boje implements Supplier {
    final /* synthetic */ bojh a;

    public boje(bojh bojhVar) {
        this.a = bojhVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bojh bojhVar = this.a;
        awjl awjlVar = bojhVar.C;
        if (awjlVar == null || awjlVar.equals(null)) {
            return null;
        }
        return awjm.b(bojhVar.C);
    }
}
