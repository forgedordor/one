package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhk {
    final rtk a;
    final Executor b;

    public rhk(rtk rtkVar, Executor executor) {
        this.a = rtkVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rhk) {
            return this.a.equals(((rhk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
