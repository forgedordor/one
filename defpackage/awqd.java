package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awqd implements Supplier {
    final /* synthetic */ awqe a;

    public awqd(awqe awqeVar) {
        this.a = awqeVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        awqe awqeVar = this.a;
        awjl awjlVar = awqeVar.a;
        if (awjlVar == null || awjlVar.equals(null)) {
            return null;
        }
        return awjm.b(awqeVar.a);
    }
}
