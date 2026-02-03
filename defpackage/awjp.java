package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awjp implements Supplier {
    final /* synthetic */ awjq a;

    public awjp(awjq awjqVar) {
        this.a = awjqVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        awjq awjqVar = this.a;
        awjl awjlVar = awjqVar.a;
        if (awjlVar == null || awjlVar.equals(null)) {
            return null;
        }
        return awjm.b(awjqVar.a);
    }
}
