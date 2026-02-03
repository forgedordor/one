package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awnq implements Supplier {
    final /* synthetic */ awnr a;

    public awnq(awnr awnrVar) {
        this.a = awnrVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        awnr awnrVar = this.a;
        awjl awjlVar = awnrVar.b;
        if (awjlVar == null || awjlVar.equals(null)) {
            return null;
        }
        return awjm.b(awnrVar.b);
    }
}
