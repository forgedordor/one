package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awnp implements Supplier {
    final /* synthetic */ awnr a;

    public awnp(awnr awnrVar) {
        this.a = awnrVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        awnr awnrVar = this.a;
        awjl awjlVar = awnrVar.a;
        if (awjlVar == null || awjlVar.equals(null)) {
            return null;
        }
        return awjm.b(awnrVar.a);
    }
}
